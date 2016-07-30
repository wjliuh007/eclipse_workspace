
package nc.bs.sm.accountmanage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 * 创建日期:2006-3-23
 * @author licp
 * @since 5.0
 * 
 */
public class ScriptFileReader {
	public static String SPLIT_ORA = "/";
	public static String SPLIT_SQL = "go";
	public static String SPLIT_UDB = ";";
	public static String CHARSET_CODE = "UTF-8";
	private String splitChar = SPLIT_SQL;
	public ScriptFileReader(String splitChar){
		super();
		this.splitChar = splitChar;
	}
	public ScriptFileReader(){
		super();
	}
	public ArrayList getSqlsFromFile(File file){
		BufferedReader br = null;
		ArrayList al = new ArrayList();
		try {
			InputStreamReader isreader = new InputStreamReader(new FileInputStream(file),CHARSET_CODE);
			br =new BufferedReader(isreader);
			String line = null;
			StringBuffer sb = new StringBuffer();
			while((line = br.readLine())!=null){
				line = line.trim();
				//过滤掉--或//开头的注释行
				if(line.startsWith("--") || line.startsWith("//"))
					continue;
				if(line.equalsIgnoreCase(splitChar)){
					String sql = sb.toString().trim();
					sql = getPureSql(sql);
					if(sql != null)
						al.add(sql.trim());
					sb.setLength(0);
				}else{
					sb.append("\n").append(line);	
				}
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}finally{
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
				}
			}
		}
		return al;
	}
	private String getPureSql(String sql){
		// 过滤掉 /* ... */等的注释
		if(sql == null)
			return null;
		int len = sql.length() ;
		if(len < 4)
			return sql;
		sql+=" ";
		int dep = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < len ; i++) {
			char ch1 = sql.charAt(i);
			char ch2 = sql.charAt(i+1);
			if(ch1 == '/' && ch2 == '*'){
				dep +=1;
				i++;
			}else if(ch1 == '*' && ch2 == '/'){
				dep -=1;
				i++;
			}else if(dep == 0){
				sb.append(ch1);
			}
		}
		return sb.toString();
	}

}
