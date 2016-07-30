package com.wjliuh.dialog;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;

import sun.awt.shell.ShellFolder;

import net.miginfocom.swing.MigLayout;

import com.wjliuh.utils.NetUtils;
import com.wjluh.security.MyX509TrustManager;
/**
 * 开始为测试获取验证码，后来增加测试java获取系统图标
 * @author JIE
 *
 */
public class DisplayValidatePic extends JFrame {
	Icon icon;
	ImageIcon image;
	static String outout;
	JButton btnNewButton;
	JLabel lblNewLabel;
	private JTextField textField;

	public DisplayValidatePic() {
		this.setSize(200, 154);
		getContentPane().setLayout(
				new MigLayout("", "[][][][][grow]", "[][][][][][]"));

		icon = new ImageIcon(getImage(getUrl()));

		lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel, "cell 0 2");
		lblNewLabel.setIcon(icon);

		textField = new JTextField();
		getContentPane().add(textField, "cell 4 2,growx");
		textField.setColumns(6);

		btnNewButton = new JButton("refresh");
		getContentPane().add(btnNewButton, "cell 0 4");
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				icon = new ImageIcon(getImage(getUrl()));
				lblNewLabel.setIcon(icon);
				lblNewLabel.repaint();
				DisplayValidatePic.this.repaint();
			}
		});
		JButton btnOk = new JButton("ok");
		getContentPane().add(btnOk, "cell 4 4");

		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				showModel();

			}
		});

		initData();
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				System.exit(0);
			}
		});
	}

	public String showModel() {
		String result = textField.getText();
		this.dispose();
		return result;
	}

	private void initData() {
		try {
			icon = new ImageIcon(toBufferedImage(toImage(toIcon(new File("F:\\JDK\\JDK_API_1_6_zh_CN.chm")))));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblNewLabel.setIcon(icon);

	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
				} catch (Exception ignore) {
				}

				new DisplayValidatePic().setVisible(true);
			}
		});
	}

	private Image getImage(String urlStr) {
		InputStream in = null;
		Image image = null;
		try {
			HttpURLConnection myurlcon = getHttpsConnection(urlStr);
			in = myurlcon.getInputStream();
			image = ImageIO.read(in);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (Exception e) {
			}
		}
		return image;
	}

	public HttpsURLConnection getHttpsConnection(String url) {
		URL myURL = null;
		HttpsURLConnection httpsConn = null;
		try {
			// 创建SSLContext对象，并使用我们指定的信任管理器初始化
			TrustManager[] tm = { new MyX509TrustManager() };
			SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
			sslContext.init(null, tm, new java.security.SecureRandom());
			// 从上述SSLContext对象中得到SSLSocketFactory对象
			SSLSocketFactory ssf = sslContext.getSocketFactory();
			// 创建URL对象
			myURL = new URL(url);

			// 创建HttpsURLConnection对象，并设置其SSLSocketFactory对象
			httpsConn = (HttpsURLConnection) myURL.openConnection();
			httpsConn.setSSLSocketFactory(ssf);
			// 取得该连接的输入流，以读取响应内容
			 InputStreamReader insr = new
			 InputStreamReader(httpsConn.getInputStream());
			//
			// // 读取服务器的响应内容并显示
			 int respInt = insr.read();
			 while (respInt != -1) {
			 System.out.print((char) respInt);
			 respInt = insr.read();
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return httpsConn;
	}

	private String getUrl() {
		String pre = "https://i.yonyou.com/ValidateCode.aspx?Math.random()";
		// pre
		// ="http://reg.email.163.com/unireg/call.do?cmd=register.verifyCode&v=common/verifycode/vc_en&env=644900641131&t=1418620675632";
		// pre =
		// "http://captcha.qq.com/getimage?aid=1007901&r=0.5336154978722334";
		// pre =
		// "https://mail.sina.com.cn/cgi-bin/imgcode.php?t="+String.valueOf(System.currentTimeMillis());
		// pre ="http://passport.sohu.com/captcha?time=0.5958246365189552";
		// pre ="http://www.263.net/verifyCode.jspx?a=0.5508164404891431";
		pre = "https://kyfw.12306.cn/otn/passcodeNew/getPassCodeNew?module=login&rand=sjrand&";
		return pre;
	}

	public static Icon toIcon(File file) throws FileNotFoundException {
		ShellFolder shellFolder = ShellFolder.getShellFolder(file);
		Icon icon = new ImageIcon(shellFolder.getIcon(false));//FileSystemView.getFileSystemView().getSystemIcon(file);
		
		return icon;
	}

	public static Image toImage(Icon icon) {
		if (icon instanceof ImageIcon) {
			return ((ImageIcon) icon).getImage();
		} else {
			int w = icon.getIconWidth();
			int h = icon.getIconHeight();
			GraphicsEnvironment ge = GraphicsEnvironment
					.getLocalGraphicsEnvironment();
			GraphicsDevice gd = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gd.getDefaultConfiguration();
			BufferedImage image = gc.createCompatibleImage(w, h);
			Graphics2D g = image.createGraphics();
			icon.paintIcon(null, g, 0, 0);
			g.dispose();
			return image;
		}
	}
	
    // This method returns a buffered image with the contents of an image  
    public static BufferedImage toBufferedImage(Image image) {  
        if (image instanceof BufferedImage) {  
            return (BufferedImage) image;  
        }  
  
        // This code ensures that all the pixels in the image are loaded  
        image = new ImageIcon(image).getImage();  
  
        // Determine if the image has transparent pixels; for this method's  
        // implementation, see Determining If an Image Has Transparent Pixels  
        boolean hasAlpha = hasAlpha(image);  
  
        // Create a buffered image with a format that's compatible with the  
        // screen  
        BufferedImage bimage = null;  
        GraphicsEnvironment ge = GraphicsEnvironment  
                .getLocalGraphicsEnvironment();  
        try {  
            // Determine the type of transparency of the new buffered image  
            int transparency = Transparency.OPAQUE;  
            if (hasAlpha) {  
                transparency = Transparency.BITMASK;  
            }  
  
            // Create the buffered image  
            GraphicsDevice gs = ge.getDefaultScreenDevice();  
            GraphicsConfiguration gc = gs.getDefaultConfiguration();  
            bimage = gc.createCompatibleImage(image.getWidth(null), image  
                    .getHeight(null), transparency);  
        } catch (HeadlessException e) { 
            // The system does not have a screen  
        }  
  
        if (bimage == null) {  
            // Create a buffered image using the default color model  
            int type = BufferedImage.TYPE_INT_RGB;  
            if (hasAlpha) {  
                type = BufferedImage.TYPE_INT_ARGB;  
            }  
            bimage = new BufferedImage(image.getWidth(null), image  
                    .getHeight(null), type);  
        }  
  
        // Copy image to buffered image  
        Graphics g = bimage.createGraphics();  
  
        // Paint the image onto the buffered image  
        g.drawImage(image, 0, 0, null);  
        g.dispose();  
  
        return bimage;  
    }  
    
    private static boolean hasAlpha(Image image) {  
        // If buffered image, the color model is readily available  
        if (image instanceof BufferedImage) {  
            BufferedImage bimage = (BufferedImage) image;  
            return bimage.getColorModel().hasAlpha();  
        }  
  
        // Use a pixel grabber to retrieve the image's color model;  
        // grabbing a single pixel is usually sufficient  
        PixelGrabber pg = new PixelGrabber(image, 0, 0, 1, 1, false);  
        try {  
            pg.grabPixels();  
        } catch (InterruptedException e) {  
        }  
  
        // Get the image's color model  
        ColorModel cm = pg.getColorModel();  
        return cm.hasAlpha();  
    } 
}
