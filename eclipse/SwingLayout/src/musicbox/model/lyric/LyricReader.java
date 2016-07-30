package musicbox.model.lyric;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Randyzhao
 */
public class LyricReader {

	BufferedReader bufferReader = null; // 读取文件实例
	public String title = ""; // 歌曲题目
	public String artist = ""; // 演唱者
	public String album = ""; // 专辑
	public String lrcMaker = ""; // 歌词制作者
	List<LyricStatement> statements = new ArrayList<LyricStatement>(); // 歌词

	/*
	 * 实例化一个歌词数据. 歌词数据信息由指定的文件提供. fileName: 指定的歌词文件.
	 */

	public LyricReader(String fileName) throws IOException {
		// in case the space in the fileName is replaced by the %20
		FileInputStream file = new FileInputStream(URLDecoder.decode(fileName,
				"UTF-8"));
		bufferReader = new BufferedReader(new InputStreamReader(file, "GB2312"));

		// 将文件数据读入内存
		readData();
	}

	public List<LyricStatement> getStatements() {
		return statements;
	}

	/*
	 * 读取文件中数据至内存.
	 */
	private void readData() throws IOException {
		statements.clear();
		String strLine;
		// 循环读入所有行
		while (null != (strLine = bufferReader.readLine())) {
			// 判断该行是否为空行
			if ("".equals(strLine.trim())) {
				continue;
			}
			// 判断该行数据是否表示歌名
			if (null == title || "".equals(title.trim())) {
				Pattern pattern = Pattern.compile("\\[ti:(.+?)\\]");
				Matcher matcher = pattern.matcher(strLine);
				if (matcher.find()) {
					title = matcher.group(1);
					continue;
				}
			}
			// 判断该行数据是否表示演唱者
			if (null == artist || "".equals(artist.trim())) {
				Pattern pattern = Pattern.compile("\\[ar:(.+?)\\]");
				Matcher matcher = pattern.matcher(strLine);
				if (matcher.find()) {
					artist = matcher.group(1);
					continue;
				}
			}
			// 判断该行数据是否表示专辑
			if (null == album || "".equals(album.trim())) {
				Pattern pattern = Pattern.compile("\\[al:(.+?)\\]");
				Matcher matcher = pattern.matcher(strLine);
				if (matcher.find()) {
					album = matcher.group(1);
					continue;
				}
			}
			// 判断该行数据是否表示歌词制作者
			if (null == lrcMaker || "".equals(lrcMaker.trim())) {
				Pattern pattern = Pattern.compile("\\[by:(.+?)\\]");
				Matcher matcher = pattern.matcher(strLine);
				if (matcher.find()) {
					lrcMaker = matcher.group(1);
					continue;
				}
			}
			// 读取并分析歌词
			int timeNum = 0; // 本行含时间个数
			String str[] = strLine.split("\\]"); // 以]分隔
			for (int i = 0; i < str.length; ++i) {
				String str2[] = str[i].split("\\["); // 以[分隔
				str[i] = str2[str2.length - 1];
				if (isTime(str[i])) {
					++timeNum;
				}
			}
			for (int i = 0; i < timeNum; ++i) // 处理歌词复用的情况
			{
				LyricStatement sm = new LyricStatement();
				sm.setTime(str[i]);
				if (timeNum < str.length) // 如果有歌词
				{
					sm.setLyric(str[str.length - 1]);
				}
				statements.add(sm);
			}
			// if(1==str.length) //处理没有歌词的情况
			// {
			// Statement sm = new Statement();
			// sm.setTime(str[0]);
			// sm.setLyric("");
			// statements.add(sm);
			// }
		}

		// 将读取的歌词按时间排序
		sortLyric();
	}

	/*
	 * 判断给定的字符串是否表示时间.
	 */

	private boolean isTime(String string) {
		String str[] = string.split(":|\\.");
		if (3 != str.length) {
			return false;
		}
		try {
			for (int i = 0; i < str.length; ++i) {
				Integer.parseInt(str[i]);
			}
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	/*
	 * 将读取的歌词按时间排序.
	 */

	private void sortLyric() {
		for (int i = 0; i < statements.size() - 1; ++i) {
			int index = i;
			double delta = Double.MAX_VALUE;
			boolean moveFlag = false;
			for (int j = i + 1; j < statements.size(); ++j) {
				double sub;
				if (0 >= (sub = statements.get(i).getTime()
						- statements.get(j).getTime())) {
					continue;
				}
				moveFlag = true;
				if (sub < delta) {
					delta = sub;
					index = j + 1;
				}
			}
			if (moveFlag) {
				statements.add(index, statements.get(i));
				statements.remove(i);
				--i;
			}
		}
	}

	/*
	 * 打印整个歌词文件
	 */

	private void printLrcDate() {
		System.out.println("歌曲名: " + title);
		System.out.println("演唱者: " + artist);
		System.out.println("专辑名: " + album);
		System.out.println("歌词制作: " + lrcMaker);
		for (int i = 0; i < statements.size(); ++i) {
			statements.get(i).printLyric();
		}
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * 测试"[", "]"的ASCII码
		 */
		// {
		// char a='[', b = ']';
		// int na = (int)a;
		// int nb = (int)b;
		// System.out.println("a="+na+", b="+nb+"\n");
		// }
		/*
		 * 测试匹配[]. 注: [应用\[表示. 同理]应用\]表示.
		 */
		// {
		// String strLyric = "[02:13.41][02:13.42][02:13.43]错误的泪不想哭却硬要留住";
		// String str[] = strLyric.split("\\]");
		// for(int i=0; i<str.length; ++i)
		// {
		// String str2[] = str[i].split("\\[");
		// str[i] = str2[str2.length-1];
		// System.out.println(str[i]+" ");
		// }
		// }
		/*
		 * 测试匹配[ti:]. 注: [应用\[表示. 同理]应用\]表示.
		 */
		// {
		// String strLyric = "[ti:Forget]";
		// Pattern pattern = Pattern.compile("\\[ti:(.+?)\\]");
		// Matcher matcher = pattern.matcher(strLyric);
		// if(matcher.find())
		// System.out.println(matcher.group(1));
		// }
		/*
		 * 测试排序算法
		 */
		// {
		// Vector<Double> vect=new Vector<Double>();
		// vect.add(5.0);
		// vect.add(28.0);
		// vect.add(37.0);
		// vect.add(10.0);
		// vect.add(25.0);
		// vect.add(40.0);
		// vect.add(27.0);
		// vect.add(35.0);
		// vect.add(70.0);
		// vect.add(99.0);
		// vect.add(100.0);
		//
		// for(int i=0;i<vect.size();++i)
		// {
		// System.out.println(vect.elementAt(i));
		// }
		//
		// for(int i=0;i<vect.size()-1;++i)
		// {
		// int index=i;
		// double delta=Double.MAX_VALUE;
		// boolean moveFlag = false;
		// for(int j=i+1;j<vect.size();++j)
		// {
		// double sub;
		// if(0>=(sub=vect.get(i)-vect.get(j)))
		// {
		// continue;
		// }
		// moveFlag=true;
		// if(sub<delta)
		// {
		// delta=sub;
		// index=j+1;
		// }
		// }
		// if(moveFlag)
		// {
		// vect.add(index, vect.elementAt(i));
		// vect.remove(i);
		// System.out.println("第"+i);
		// --i;
		// }
		// }
		//
		// System.out.println("排序后");
		// for(int i=0;i<vect.size();++i)
		// {
		// System.out.println(vect.elementAt(i));
		// }
		// }

		/*
		 * 测试由字符串转化为双精度时间
		 */
		// {
		// String stime="02:03.09";
		// String str[] = stime.split(":|\\.");
		// for(int i=0;i<str.length;++i)
		// {
		// System.out.print("时间"+str[i]+":");
		// }
		// double dtime =
		// Integer.parseInt(str[0])*60+Integer.parseInt(str[1])+Integer.parseInt(str[2])*0.01;
		// System.out.println("time="+dtime);
		// }

		/*
		 * 测试整个类
		 */
		{

			LyricReader ld = new LyricReader(
					"D:\\KuGouCache\\Lyric\\时间都去哪儿了.lrc"); // 路径\\输入文件名
			ld.printLrcDate();
		}
	}
}
