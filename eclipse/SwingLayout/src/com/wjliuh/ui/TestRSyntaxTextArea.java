package com.wjliuh.ui;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.Document;

import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextAreaEditorKit;
import org.fife.ui.rtextarea.RTextScrollPane;

import com.wjliuh.entity.model.RsyntaxTextModel;
import com.wjliuh.service.RsyntaxTextService;

public class TestRSyntaxTextArea extends JDialog{

	private static final long serialVersionUID = -6553473007484948717L;
	
	/** 主文本面板 */
	RTextScrollPane rtpanel;
	/** 主文本编辑区 */
	RSyntaxTextArea text;
	/** 文本长度 */
	int size = 0;
	/** 菜单栏 */
	private JMenu menu;
	/** 打开文件按钮 */
	private JMenuItem openFile;
	/** 退出按钮 */
	private JMenuItem exitApp;
	
	private RsyntaxTextModel model;
	private RsyntaxTextService service;
	
	public TestRSyntaxTextArea(){
		setSize(1060, 632);
		text = new RSyntaxTextArea();
		rtpanel = new RTextScrollPane( text );
		getContentPane().add( rtpanel );
		
		JMenuBar menuBar = new JMenuBar();
		getContentPane().add(menuBar, BorderLayout.NORTH);
		
		menuBar.add(getMenuBar());
		
		getOpenFileMenuItem();
		menu.add(openFile);
		
		getExitApp();
		menu.add(exitApp);
		text.setSyntaxEditingStyle( SyntaxConstants.SYNTAX_STYLE_JAVASCRIPT );
		
		model  = new RsyntaxTextModel();
		//---------------
//		addData();
		//---------------
		addWindowListener(new WindowAdapter() {
		      public void windowClosing(WindowEvent evt) {
		        System.exit(0);
		      }
		});
		//--------------
		drag();
	}

	private void getExitApp() {
		exitApp = new JMenuItem("退出");
		exitApp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
//				int y = JOptionPane.showConfirmDialog(
//						null, 
//						"确认退出？", 
//						"退出", 
//						JOptionPane.YES_NO_OPTION);
//				if(y == JOptionPane.YES_OPTION){System.exit(0);}
			}
		});
	}

	private void getOpenFileMenuItem() {
		openFile = new JMenuItem("打开");
		openFile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JFrame f = new JFrame();
//				JFileChooser c = new JFileChooser();
				FileDialog c = new FileDialog(TestRSyntaxTextArea.this);
//				c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				c.show();
//				if (JFileChooser.APPROVE_OPTION == c.showSaveDialog(f)) {
					getModel().setChoseFile(new File(c.getDirectory()+File.separator+c.getFile()));
					getModel().setDoc((RSyntaxDocument)text.getDocument());
//					System.out.println(getModel().getFileFormat());
//					text.setSyntaxEditingStyle( getModel().getFileFormat() );
					getModel().getDoc();
					
//					RTextAreaEditorKit kit = new RTextAreaEditorKit();
//					
//					try {
//						text.getDocument().remove(0, text.getDocument().getLength());
//						kit.read(c.getSelectedFile().toURL().openConnection().getInputStream(), text.getDocument(), 0);
//					} catch (Exception e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}

//				}
			}
		});

	}

	private JMenu getMenuBar() {
		menu = new JMenu("文件");
		return menu;
	}
	
	@SuppressWarnings("deprecation")
	private void addData() {
        RTextAreaEditorKit kit = new RTextAreaEditorKit();
        RSyntaxDocument doc = new RSyntaxDocument(SyntaxConstants.SYNTAX_STYLE_JAVA);
        try {
			kit.read(new File("C:\\Users\\JIE\\Desktop\\DragTree.java").toURL().openConnection().getInputStream(), doc, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
        text.setDocument(doc);
		
	}

	protected void printText() {
		if(0 < text.getText().length() && size != text.getText().length()){
			System.out.println(text.getText());
			size = text.getText().length();
		}
		
	}

    private void drag()//定义的拖拽方法
    {
        //panel表示要接受拖拽的控件
        new DropTarget(rtpanel, DnDConstants.ACTION_COPY_OR_MOVE, new DropTargetAdapter()
        {
			@Override
            public void drop(DropTargetDropEvent dtde)//重写适配器的drop方法
            {
                try
                {
                    if (dtde.isDataFlavorSupported(DataFlavor.javaFileListFlavor))//如果拖入的文件格式受支持
                    {
                        dtde.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);//接收拖拽来的数据
                        Document doc = getService().dragFileToHere(dtde);
                        text.setDocument(doc);
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
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				new TestRSyntaxTextArea().setVisible(true);
			}
		});
	}

	public RsyntaxTextService getService() {
		return service;
	}

	public void setService(RsyntaxTextService service) {
		this.service = service;
	}

	public RsyntaxTextModel getModel() {
		return model;
	}

	public void setModel(RsyntaxTextModel model) {
		this.model = model;
	}

}
