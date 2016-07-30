import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

import com.wjliuh.utils.NetUtils;


public class DownloadIcos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		batchGetIcons();

		downloadValidate();
	}

	private static void downloadValidate() {
		String pre = "https://i.yonyou.com/ValidateCode.aspx?Math.random()";
		String outout = "C:\\Users\\JIE\\Desktop\\validate\\validate.png";
		getContext1(pre,outout);
	}

	private static void batchGetIcons() {
		String pre = "http://mat1.gtimg.com/www/mb/images/face/";
		String ur = "";
		String outout = "C:\\Users\\JIE\\Desktop\\validate";
		String filna = "";
		for(int i=1;i<300;i++){
			ur = pre + String.valueOf(i)+".gif";
			filna = outout + String.valueOf(i)+ ".gif";
			getContext1(ur,filna);
		}
	}
	
	public static void getContext1(String urlStr, String outPath) {// 获得网络资源并写入指定文件
		InputStream in = null;
		OutputStream out = null;
		try {
			HttpURLConnection myurlcon = NetUtils.getConnection(urlStr);
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
}
