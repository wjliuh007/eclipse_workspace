package com.wjliuh.test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * 此版本支持拖拽打开图片，
 * 遗留问题：1，不能以图片原尺寸展示；2，没有滚动条；3，不支持快捷键
 * @author JIE
 *
 */
public class DragScrollPanel_1 extends JFrame {

	private static final long serialVersionUID = 4455686472108638852L;
	static int SWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	static int SHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	static int xCoor, yCoor;// 打印图片的左上角坐标
	static int PWidth, PHeight;// 图片的宽高(小于屏幕宽高的时候的)
	static int PWidth0, PHeight0;// 图片宽高大于屏幕宽高的时候的图片宽高
	static double xCoor0 = 1, yCoor0 = 1;// 图片在X轴缩放的倍数，图片在Y轴的缩放倍数；
	Image image;// = (new ImageIcon("C:\\Users\\JIE\\Desktop\\image\\13.jpg")).getImage();// 默认的一张图片
	JScrollPane jsp;
	JLabel jl;
	ImgsPanel imjp;
	public DragScrollPanel_1(){
		//---------------此处是为了测试网络取图
		try {
			URL url = new URL("http://c.imgepic.com/pic/049025/sgcqyzievccsgcqyzievcc.jpg");
			HttpURLConnection hurlc = (HttpURLConnection)url.openConnection();
			hurlc.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
			image = ImageIO.read(hurlc.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//---------------
		this.setSize(SWidth, SHeight);
		imjp = new ImgsPanel();
		jsp = new JScrollPane(imjp);
		this.add(jsp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drag();
	}
	public void drag(){
		// panel表示要接受拖拽的控件
		new DropTarget(this, DnDConstants.ACTION_COPY_OR_MOVE,
				new DropTargetAdapter() {
					@SuppressWarnings("unchecked")
					@Override
					public void drop(DropTargetDropEvent dtde)// 重写适配器的drop方法
					{
						try {
							if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor))// 如果拖入的文件格式受支持
							{
								dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);// 接收拖拽来的数据
								List<File> list = (List<File>) (dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor));
//								System.out.println(Arrays.asList(list.get(0).getParentFile().list()));
								image = new ImageIcon(list.get(0).getAbsolutePath()).getImage();
								imjp.repaint();
								jsp.repaint();
								DragScrollPanel_1.this.repaint();
								dtde.dropComplete(true);//指示拖拽操作已完成
							} else {
								dtde.rejectDrop();// 否则拒绝拖拽来的数据
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

				});
	}
	
    public static void main(String[] args) throws Exception{
//      UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//设置皮肤
//      new TestScollPanel().setVisible(true);
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              try {
                  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
              } catch (Exception ignore) {
              }
              
              new DragScrollPanel_1().setVisible(true);
          }
      });
  }
    
 // 画图的算法有点问题？？？？
    class ImgsPanel extends JPanel {
    	private static final long serialVersionUID = 1L;
    	public void paintComponent(Graphics g) {
    		super.paintComponent(g);
    		Graphics2D G2 = (Graphics2D) g;
    		AffineTransform Trans = new AffineTransform();
    		if(image == null)return;
    		PWidth = image.getWidth(null);
    		PHeight = image.getHeight(null);
    		if (PWidth <= SWidth && PHeight <= SHeight) {
    			xCoor = (SWidth - PWidth) / 2;
    			yCoor = (SHeight - PHeight) / 2;
    			PWidth0 = PWidth;
    			PHeight0 = PHeight;
    			Trans.scale(0.5, 0.5);// 对图片的缩放操作
    			 G2.setTransform(Trans);
    		}
    		if (PWidth > SWidth || PHeight > SHeight) {
    			yCoor0 = SHeight / (PHeight * 0.5);
    			PHeight0 = SHeight;
    			PWidth0 = (int) (PWidth * yCoor0);
    			xCoor0 = yCoor0;
    			xCoor = (SWidth - PWidth0) / 2;
    			yCoor = -(PHeight0 - SHeight) / 2;
    			Trans.scale(xCoor0, yCoor0);// 对图片的缩放操作
    			 G2.setTransform(Trans);
    		}
    		System.out.println("sfsdf");
    		G2.drawImage(image, 0, 0, PWidth0, PHeight0, this); //自动根据屏幕缩放
//    		G2.drawImage(image, xCoor, yCoor, PWidth, PHeight, this); //以图片大小显示

    	}
    }
}


