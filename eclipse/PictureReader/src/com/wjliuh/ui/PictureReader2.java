package com.wjliuh.ui;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class PictureReader2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	static int SWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	static int SHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	JScrollPane jsp;
	int PWidth;
	int PHeight;
	JLabel jl;
	Icon image;
	int index=0;
	int currentIndex;
	List<String> images = new ArrayList<String>();
	public PictureReader2(){
		Image icon=null;
		try {
			icon = ImageIO.read(this.getClass().getResource("pumpkin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle("PictrueReader");
		this.setIconImage(icon); 
		setLayout(new BorderLayout());
		jl = new JLabel();
		jl.setIcon(image);
		jsp = new JScrollPane(jl);
		
		this.add(jsp,BorderLayout.CENTER);
		this.setSize(800, 600);
		this.setLocation((SWidth-800)/2, (SHeight-600)/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initListenor();
		drag();
	}
	
	@Override
	public void paintComponents(Graphics g) {
		super.paintComponents(g);
		System.out.println("kkkkk");
//		Graphics2D G2 = (Graphics2D) g;
//		AffineTransform Trans = new AffineTransform();
//		PWidth = image.getIconWidth();
//		PHeight = image.getIconHeight();
//		if (PWidth <= SWidth && PHeight <= SHeight) {
//			xCoor = (SWidth - PWidth) / 2;
//			yCoor = (SHeight - PHeight) / 2;
//			PWidth0 = PWidth;
//			PHeight0 = PHeight;
////			Trans.scale(xCoor0, yCoor0);// 对图片的缩放操作
//			// G2.setTransform(Trans);
//		}
//		if (PWidth > SWidth || PHeight > SHeight) {
//			yCoor0 = SHeight / (PHeight * 1.0);
//			PHeight0 = SHeight;
//			PWidth0 = (int) (PWidth * yCoor0);
//			xCoor0 = yCoor0;
//			xCoor = (SWidth - PWidth0) / 2;
//			yCoor = -(PHeight0 - SHeight) / 2;
////			Trans.scale(xCoor0, yCoor0);// 对图片的缩放操作
//			// G2.setTransform(Trans);
//		}
//		G2.drawImage(image, xCoor, yCoor, PWidth0, PHeight0, this); //自动根据屏幕缩放
	};
	
	private void initListenor() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.addAWTEventListener(new ShortcutKeyListener(),
				AWTEvent.KEY_EVENT_MASK | AWTEvent.MOUSE_EVENT_MASK
						| AWTEvent.WINDOW_EVENT_MASK);
		
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
								final List<File> list = (List<File>) (dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor));
								image = new ImageIcon(list.get(0).getAbsolutePath());
								jl.setIcon(image);
//								JOptionPane.showMessageDialog(null, list.get(0).getAbsolutePath());
								//------------
								if(images.size() ==0){
									new Thread(){
										@Override
										public void run() {
											findImage(list);
										}
									}.start();
								}
								//------------
								PictureReader2.this.repaint();
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
	
	class ShortcutKeyListener implements AWTEventListener {
		public void eventDispatched(AWTEvent e) {
			if (e.getClass() == KeyEvent.class) {

				KeyEvent keyEvent = (KeyEvent) e;
				if (keyEvent.getID() == KeyEvent.KEY_PRESSED) {

					keyPressed(keyEvent);

				}

			}

		}

		/*
		 * 当只有一张图片是抛出异常，不能使用左右方向键，待解决
		 */
		private void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				if(currentIndex < images.size()-1){
					image = new ImageIcon(images.get(currentIndex));
					jl.setIcon(image);
					currentIndex++;
					System.out.println(currentIndex);
				}else{
					image = new ImageIcon(images.get(currentIndex));
					jl.setIcon(image);
				}
				PictureReader2.this.repaint();
				break;
			case KeyEvent.VK_LEFT:
				if(currentIndex > 0){
					image = new ImageIcon(images.get(currentIndex));
					jl.setIcon(image);
					currentIndex--;
					System.out.println(currentIndex);
				}else{
					image = new ImageIcon(images.get(currentIndex));
					jl.setIcon(image);
				}
				PictureReader2.this.repaint();
				break;

			}

		}

	}
	
	public void findImage(List<File> list) {
		File[] files = list.get(0).getParentFile().listFiles();// 得到当前路径下的所有文件和文件夹
		String[] arys = new String[files.length];
		for (int i = 0; i < files.length; i++) {
			arys[i] = files[i].getAbsolutePath();// 将路径和文件名存入字符串数组
			// 使用链表替代数组
			if (arys[i].endsWith(".jpg") || arys[i].endsWith(".gif")
					|| arys[i].endsWith(".png") == true) {
				images.add((arys[i]));
				System.out.println(arys[i]);
			}
		}
		
	}
	
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new PictureReader2().setVisible(true);
            }
        });
    }
}
