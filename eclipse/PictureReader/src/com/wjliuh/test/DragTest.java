
package com.wjliuh.test;
import java.awt.BorderLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.OptionPaneUI;
/**
 * 最简单的Java拖拽代码示例
 * @author 刘显安
 * 2013年1月24日
 */
public class DragTest extends JFrame
{

    JPanel panel;//要接受拖拽的面板
    Icon image;
    JLabel jl;
    public DragTest()
    {
        panel = new JPanel();
        jl = new JLabel();
        panel.add(jl);
        add(panel, BorderLayout.CENTER);
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(100, 0);
        setTitle("PictureReader");
        drag();//启用拖拽
        
    }
    public void updateUI(){
    	this.repaint();
    }
    public static void main(String[] args) throws Exception
    {
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
//                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                	UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");//设置皮肤
                } catch (Exception ignore) {
                }
                
                new DragTest().setVisible(true);
            }
        });
    }
    public void drag()//定义的拖拽方法
    {
        //panel表示要接受拖拽的控件
        new DropTarget(panel, DnDConstants.ACTION_COPY_OR_MOVE, new DropTargetAdapter()
        {
            @SuppressWarnings("unchecked")
			@Override
            public void drop(DropTargetDropEvent dtde)//重写适配器的drop方法
            {
                try
                {
                    if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor))//如果拖入的文件格式受支持
                    {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);//接收拖拽来的数据
                        List<File> list =  (List<File>) (dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor));
                        image = new ImageIcon(list.get(0).getAbsolutePath());
                        jl.setIcon(image);
                        panel.repaint();
                        JOptionPane.showMessageDialog(null, list.get(0).getAbsolutePath());
                        dtde.dropComplete(true);//指示拖拽操作已完成
                    }
                    else
                    {
                        dtde.rejectDrop();//否则拒绝拖拽来的数据
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }
}