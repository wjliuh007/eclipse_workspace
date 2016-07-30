import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class DownloadFile {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws Exception {
		getContext1("http://apache.opencas.org//commons/logging/binaries/commons-logging-1.2-bin.zip","C:\\commons-logging-1.2-bin1.zip");

	}
	public static void getContext1(String urlStr, String outPath) {// 获得网络资源并写入指定文件
		InputStream in = null;
		OutputStream out = null;
		try {
			HttpURLConnection myurlcon = getConnection(urlStr);
			in = myurlcon.getInputStream();
			//------------新型方法快
//			ImageIO.write(ImageIO.read(in), "jpg", new File(outPath));
			//------------传统I/O保存图片
			if (outPath == null) {
				out = System.out;
			} else {
				out = new FileOutputStream(outPath);
			}
			// 用输出流out，输出到指定位置
			byte[] buffer = new byte[1024];
			int bytes_read;
			while ((bytes_read = in.read(buffer)) != -1) {
				out.write(buffer, 0, bytes_read);
			}
			//------------
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e) {
			}
		}
	}
	private static HttpURLConnection myurlcon = null;

	/**
	 * 获取网络连接，此处HttpURLConnection和URLConnection效果是一样的
	 * @param newUrl
	 * @return
	 */
	public static HttpURLConnection getConnection(String newUrl){
		try {
			myurlcon = (HttpURLConnection)(new URL(newUrl)).openConnection();
//			myurlcon.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return myurlcon;
	}

}
