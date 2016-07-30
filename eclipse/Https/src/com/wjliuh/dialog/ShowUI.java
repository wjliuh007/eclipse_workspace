package com.wjliuh.dialog;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import net.miginfocom.swing.MigLayout;

import com.wjliuh.utils.NetUtils;
import com.wjluh.security.MyX509TrustManager;


public class ShowUI extends JFrame {
	
	private static final long serialVersionUID = -976408945761815796L;
	
	ImageIcon icon;
	ImageIcon image;
	static String outout;
	JButton btnNewButton;
	JLabel lblNewLabel;
	private JTextField textField;
	public ShowUI(){
		this.setSize(400, 184);
		getContentPane().setLayout(new MigLayout("", "[][][][][grow]", "[][][][][][]"));
		
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
				icon.setImage(getImage(getUrl()));
				lblNewLabel.setIcon(icon);
				lblNewLabel.repaint();
			}
		});
		
		initData();
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
	}

    private void initData() {
		icon = new ImageIcon(getImage(getUrl()));
		lblNewLabel.setIcon(icon);
		
	}

	public static void main(String[] args) throws Exception{
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              try {
                  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
              } catch (Exception ignore) {
              }
              
              new ShowUI().setVisible(true);
          }
      });
  }
    
	private Image getImage(String urlStr){
		InputStream in = null;
		Image image = null;
		try {
			Pattern p = Pattern.compile("https");
			Matcher m1 = p.matcher(urlStr); 
			HttpURLConnection myurlcon = m1.find()?getHttpsConnection(urlStr):NetUtils.getConnection(urlStr);
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
	
	public HttpsURLConnection getHttpsConnection(String url){
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return httpsConn;
	}
	
	private String getUrl(){
        String pre = "https://i.yonyou.com/ValidateCode.aspx?Math.random()";
//		pre ="http://reg.email.163.com/unireg/call.do?cmd=register.verifyCode&v=common/verifycode/vc_en&env=644900641131&t=1418620675632";
//		pre = "http://captcha.qq.com/getimage?aid=1007901&r=0.5336154978722334";
		pre = "https://mail.sina.com.cn/cgi-bin/imgcode.php?t="+String.valueOf(System.currentTimeMillis());
//		pre ="http://passport.sohu.com/captcha?time=0.5958246365189552";
//		pre ="http://www.263.net/verifyCode.jspx?a=0.5508164404891431";
		pre = "https://kyfw.12306.cn/otn/passcodeNew/getPassCodeNew?module=login&rand=sjrand&";
		return pre;
	}
}
