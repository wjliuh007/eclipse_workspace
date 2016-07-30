import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class DownLoad {

	private static final String path="http://imgcache.qq.com/tencentvideo_v1/player/TPout.swf?max_age=86400&amp;v=20140714";
	
	private static HttpURLConnection myurlcon = null;
	
	/** 图片的URI地址和名称 */
	public static final String PIC_URL_REGEX = "[a-z0-9]+\\:(//)(\\S)*(jpg)";
	
	/** 下一页的解析正则表达式*/
	public static final String NEXT_PAGE_REGEX = "<(a|A)(\\s)(\\w){4}=\"((\\S)+)\"(\\s)(class=\"next\")>(.*)</(a|A)>";
	
	/** 目录页中文章的地址正则表达式*/
	public static final String IN_PAGE_REGEX = "<(a|A)(\\s)(\\w){4}=\"((\\S)+)\"(\\s)(target=_blank)>(.*)</(a|A)>";
	
	/**
	 * 获取网络连接，此处HttpURLConnection和URLConnection效果是一样的
	 * @param newUrl
	 * @return
	 */
	public static HttpURLConnection getConnection(String newUrl){
		try {
			myurlcon = (HttpURLConnection)(new URL(newUrl)).openConnection();
			myurlcon.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return myurlcon;
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		InputStream in = null;
		HttpURLConnection myurlcon = getConnection(path);
		in = myurlcon.getInputStream();
		System.out.println();

	}

}
