package org.free.scriptevaler.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

public class MainPanel extends JPanel{
	private static final long serialVersionUID = 3458431984917602370L;
	private javax.swing.JButton btnClearResult;
    private javax.swing.JButton btnClearScript;
    private javax.swing.JButton btnEval;
    private JTextArea resultWindow;
    private RSyntaxTextArea scriptEditor;
    private RTextScrollPane scroller;
    private javax.swing.JScrollPane scroller2;
    
    public MainPanel() {
        initComponents();
    }

    private void initComponents() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception exc) {
			System.err.println("Error loading L&F: " + exc);
		}
        scroller = new RTextScrollPane();
        scriptEditor = new RSyntaxTextArea();
        scriptEditor.setFont(new Font("Courier New", Font.PLAIN, 13));
        scriptEditor.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVASCRIPT);
        scriptEditor.requestFocus();
        scroller2 = new javax.swing.JScrollPane();
        
        resultWindow = new javax.swing.JTextArea();
        resultWindow.setFont(new Font("Verdana", Font.PLAIN, 12));
        Console.redirectOutput(resultWindow);
        
        btnEval = new javax.swing.JButton();
        btnEval.setIcon(new ImageIcon("resource/yinyang.gif"));
        btnClearScript = new javax.swing.JButton();
        btnClearScript.setIcon(new ImageIcon("resource/close.gif"));
        btnClearResult = new javax.swing.JButton();
        btnClearResult.setIcon(new ImageIcon("resource/close.gif"));

        setName("Form"); // NOI18N

        scroller.setName("scroller"); // NOI18N

        scriptEditor.setName("scriptEditor"); // NOI18N
        scroller.setViewportView(scriptEditor);

        scroller2.setName("scroller2"); // NOI18N

        resultWindow.setName("resultWindow"); // NOI18N
        scroller2.setViewportView(resultWindow);

        btnEval.setText("eval"); // NOI18N
        btnEval.setName("btnEval"); // NOI18N

        btnClearScript.setText("clear script editor"); // NOI18N
        btnClearScript.setName("btnClearScript"); // NOI18N

        btnClearResult.setText("clear result window"); // NOI18N
        btnClearResult.setName("btnClearResult"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroller2)
            .addComponent(scroller)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEval)
                .addGap(18, 18, 18)
                .addComponent(btnClearScript)
                .addGap(18, 18, 18)
                .addComponent(btnClearResult)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroller, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEval)
                    .addComponent(btnClearScript)
                    .addComponent(btnClearResult))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroller2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
        );
        
        btnEval.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String scriptStr = scriptEditor.getText();
				evalScript(scriptStr);
			}
        });
        
        btnClearScript.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				scriptEditor.setText("");
			}
        });
        
        btnClearResult.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				resultWindow.setText("");
			}
        });
    }


    private Object evalScript(String script){
    	Object result = new Object();
    	ScriptEngineManager manager = new ScriptEngineManager();
    	ScriptEngine engine = manager.getEngineByName("JavaScript");
    	try {
    	    result = engine.eval(script);
    	} catch (ScriptException e) {
    	    e.printStackTrace();
    	}
        return result;
    }
    
    public JMenuBar getMenuBar(){
    	return createMenubar();
    }
    
	private JMenuBar createMenubar() {
		JMenuBar mb = new JMenuBar();

		JMenu m = new JMenu("File");
		m.setIcon(new ImageIcon("resource/flie.gif"));
		
		JMenuItem load = new JMenuItem("load", new ImageIcon("resource/open.gif"));
		JMenuItem eval = new JMenuItem("eval", new ImageIcon("resource/yinyang.gif"));
		JMenuItem exit = new JMenuItem("Exit", new ImageIcon("resource/close.gif"));
		
		m.add(load);
		m.add(eval);
		m.addSeparator();
		m.add(exit);
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int y = JOptionPane.showConfirmDialog(
						null, 
						"Confirm exit", 
						"Confirm Exit Dialog", 
						JOptionPane.YES_NO_OPTION);
				if(y == JOptionPane.YES_OPTION){System.exit(0);}
			}
		});
		
		mb.add(m);

		return mb;
	}
    
    public static void main(String[] args){
		JFrame frame = new JFrame();
		frame.setTitle("script evaler");
		frame.setBackground(Color.lightGray);
		frame.getContentPane().setLayout(new BorderLayout());
		MainPanel mainPanel = new MainPanel();
		frame.getContentPane().add("Center", mainPanel);
		frame.setJMenuBar(mainPanel.getMenuBar());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(600, 480);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
    }
}
