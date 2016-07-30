package com.wjliuh.index;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.filechooser.FileSystemView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriter.MaxFieldLength;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;

import com.wjliuh.config.Config;
import com.wjliuh.gui.TSDialog;
import com.wjliuh.parser.Parser;
import com.wjliuh.parser.ParserManager;

public class IndexConfigDialog extends TSDialog {
	private static final long serialVersionUID = 8529689673065477442L;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea precessArea = new JTextArea();
	private long start = 0L;
	private String filePath=null;
	
	private final Lock lock = new ReentrantLock(true);
	private final Condition notEmpty = lock.newCondition();
	
	private final LinkedList<String> queue = new LinkedList<String>(); // guarded by lock
	private boolean replaceLastInTable = false; // guarded by lock
	public Log log = LogFactory.getLog(getClass());
	public IndexConfigDialog() {
		super();
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel(new BorderLayout());
		getContentPane().add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		panel.add(textField,BorderLayout.CENTER);
		textField.setColumns(50);
		
		btnNewButton = new JButton("...");
		panel.add(btnNewButton,BorderLayout.EAST);
		panel.setBorder(BorderFactory.createTitledBorder("目标路径"));
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel(new BorderLayout());
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setBorder(BorderFactory.createTitledBorder("过滤规则"));
		
		JLabel lblNewLabel = new JLabel("文件类型:");
		panel_2.add(lblNewLabel,BorderLayout.WEST);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1,BorderLayout.CENTER);
		textField_1.setColumns(30);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel(new BorderLayout());
		panel_3.add(panel_4, BorderLayout.NORTH);
		
		btnNewButton_1 = new JButton("开始");
		panel_4.add(btnNewButton_1,BorderLayout.EAST);
		panel_4.setBorder(BorderFactory.createTitledBorder(""));
		
		initAction();

//		precessArea.setLineWrap(true);
		precessArea.setMargin(new Insets(0, 5, 0, 0));
		precessArea.setFont(new Font("",precessArea.getFont().getStyle(),13));
		JScrollPane scroll = new JScrollPane(precessArea);
		//分别设置水平和垂直滚动条自动出现 
		scroll.setHorizontalScrollBarPolicy( 
		JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		scroll.setVerticalScrollBarPolicy( 
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
//
//		//分别设置水平和垂直滚动条总是出现 
//		scroll.setHorizontalScrollBarPolicy( 
//		JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
//		scroll.setVerticalScrollBarPolicy( 
//		JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 
//
//		//分别设置水平和垂直滚动条总是隐藏
//		scroll.setHorizontalScrollBarPolicy( 
//		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); 
//		scroll.setVerticalScrollBarPolicy( 
//		JScrollPane.VERTICAL_SCROLLBAR_NEVER); 
		panel_3.add(scroll, BorderLayout.CENTER);
		scroll.setBorder(BorderFactory.createTitledBorder("进度"));
		
		this.setSize(447, 470);

	}
    
	
	private void initAction() {
		//开始按钮
		btnNewButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				filePath = textField.getText();
				start = System.currentTimeMillis();
				AppendWorker worker = new AppendWorker(start,analyzer,writer,precessArea,filePath,queue);
				worker.dlg = IndexConfigDialog.this;
				worker.execute();
				
				
				
			}});
		
		//打开文件按钮
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser open = new JFileChooser(FileSystemView.getFileSystemView());
				open.setDialogType(JFileChooser.OPEN_DIALOG);
				open.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				open.showOpenDialog(IndexConfigDialog.this);
				File file = open.getSelectedFile();
				textField.setText(file.getAbsolutePath());
			}
		});
		
	}


	public JTextField getTextField() {
		return textField;
	}


	public void setTextField(JTextField textField) {
		this.textField = textField;
	}


	public JTextField getTextField_1() {
		return textField_1;
	}


	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}


	public JTextArea getPrecessArea() {
		return precessArea;
	}


	public void setPrecessArea(JTextArea precessArea) {
		this.precessArea = precessArea;
	}


	public String getFilePath() {
		return filePath;
	}


	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}


	public static Analyzer getAnalyzer() {
		return analyzer;
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
				
				new IndexConfigDialog().setVisible(true);
			}
		});
	}
	
	/** The Lucene Analyzer used. */
	public static final Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_30);

	private transient IndexWriter writer;
	
	/** The Lucene IndexReader used. */
	private transient IndexReader reader;

}

class AppendWorker extends SwingWorker<List<String>,String>{
	public IndexConfigDialog dlg;
	public long start;
	public Analyzer analyzer;
	public IndexWriter writer;
	public JTextArea precessArea;
	public String filePath;
	LinkedList<String> queue;
	public AppendWorker(long start,Analyzer analyzer,IndexWriter writer,JTextArea precessArea,String filepath,LinkedList<String> queue){
		this.start = start;
		this.analyzer = analyzer;
		this.writer = writer;
		this.precessArea = precessArea;
		this.filePath = filepath;
		this.queue = queue;
	}
	
	@Override
	protected List<String> doInBackground() throws Exception {
		File[] dicks = FileSystemView.getFileSystemView().getFiles(new File(filePath), true);
		//取的索引目录
		Directory directory = IndexingConfig.getBaseIndexDir(filePath);
		
		writer = new IndexWriter(directory, analyzer, MaxFieldLength.UNLIMITED);
		
        for (int i = 0; i < dicks.length; i++) {
            File file = dicks[i];
            createIndex(file);
        }
		
		return null;
	}
	
	protected void process(List<String> msgs){
        for(String info: msgs) {
            if (isCancelled()) {
                break;
            }
            replaceLast(info);
            precessArea.append(queue.getLast());
        }
	}
	
    @Override
    protected void done() {

        setProgress(100);
        if (isCancelled()) {
            return;
        }
        precessArea.append("任务结束\n");
        long end = System.currentTimeMillis();
        int second = (int) ((end - start)/1000);
        
        int minute = second/60;
        second = second%60;
        String msg = String.format("%s%d%s%d%s", "共耗时：",minute,"分",second,"秒\n");
        precessArea.append(msg);
        try {
			writer.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
//        dlg.close();
        
    }
      
	private void createIndex(File file) {
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (int i = 0; i < fs.length; i++) {
            	listFiles(fs[i]);
            }
        }
        else {
        	try {
        		Parser parser = ParserManager.getRightParser(file);
        		if(parser!=null){
        			writer.addDocument(parser.parse(file));
        			publish(file.getName()+"\n");
        		}
        		
			} catch (Exception e) {
				e.printStackTrace();
				dlg.log.error(file.getName());
				dlg.log.error(e.getStackTrace());
			}
        	
        }
		
	}
	
    /**
     * 递归
     * 
     * @param file
     */
    private void listFiles(File file) {
        if (file.isDirectory()) {
            File[] fs = file.listFiles();
            for (int i = 0; i < fs.length; i++) {
            	listFiles(fs[i]);
            }
        }
        else {
//        	msgs.add(file.getName()+"\n");
        	publish(file.getName()+"\n");
        }

    }
    
	@com.wjliuh.utils.annotations.ThreadSafe
	public void replaceLast(@com.wjliuh.utils.annotations.NotNull String message) {
		com.wjliuh.utls.Util.checkNotNull(message);
		
		try {
			if (queue.isEmpty()) {
				queue.add(message);
			}
			else {
				queue.removeLast();
				queue.add(message);
			}
			
		}finally{
			
		}

	}
	
}
