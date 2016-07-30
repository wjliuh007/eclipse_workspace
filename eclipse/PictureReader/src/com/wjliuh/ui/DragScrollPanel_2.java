package com.wjliuh.ui;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 * 此版本解决了滚动条和图片大小问题
 * @author JIE
 *
 */
public class DragScrollPanel_2 extends JFrame {
	private static final long serialVersionUID = 1L;
	static int SWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	static int SHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	JScrollPane jsp;
	int width;
	int height;
	JLabel jl;
	Icon image;
	public DragScrollPanel_2(){
		Image icon=null;
		try {
			icon = ImageIO.read(this.getClass().getResource("pumpkin.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.setTitle("PictrueReader");
		this.setIconImage(icon); 
		
		jl = new JLabel();
		jl.setIcon(image);
		jsp = new JScrollPane(jl);
		this.add(jsp);
		this.setSize(800, 600);
		this.setLocation((SWidth-800)/2, (SHeight-600)/2);
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
								image = new ImageIcon(list.get(0).getAbsolutePath());
								jl.setIcon(image);
//								JOptionPane.showMessageDialog(null, list.get(0).getAbsolutePath());
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
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ignore) {
                }
                
                new DragScrollPanel_2().setVisible(true);
            }
        });
    }
}


