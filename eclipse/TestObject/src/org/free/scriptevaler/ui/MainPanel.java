/*     */ package org.free.scriptevaler.ui;
/*     */ 
/*     */ import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rtextarea.RTextScrollPane;
/*     */ 
/*     */ public class MainPanel extends JPanel
/*     */ {
/*     */   private static final long serialVersionUID = 3458431984917602370L;
/*     */   private JButton btnClearResult;
/*     */   private JButton btnClearScript;
/*     */   private JButton btnEval;
/*     */   private JTextArea resultWindow;
/*     */   private RSyntaxTextArea scriptEditor;
/*     */   private RTextScrollPane scroller;
/*     */   private JScrollPane scroller2;
/*     */ 
/*     */   public MainPanel()
/*     */   {
/*  37 */     initComponents();
/*     */   }
/*     */ 
/*     */   private void initComponents() {
/*     */     try {
/*  42 */       UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
/*     */     } catch (Exception exc) {
/*  44 */       System.err.println("Error loading L&F: " + exc);
/*     */     }
/*  46 */     this.scroller = new RTextScrollPane();
/*  47 */     this.scriptEditor = new RSyntaxTextArea();
/*  48 */     this.scriptEditor.setFont(new Font("Courier New", 0, 13));
/*  49 */     this.scriptEditor.setSyntaxEditingStyle("text/javascript");
/*  50 */     this.scriptEditor.requestFocus();
/*  51 */     this.scroller2 = new JScrollPane();
/*     */ 
/*  53 */     this.resultWindow = new JTextArea();
/*  54 */     this.resultWindow.setFont(new Font("Verdana", 0, 12));
/*  55 */     Console.redirectOutput(this.resultWindow);
/*     */ 
/*  57 */     this.btnEval = new JButton();
/*  58 */     this.btnEval.setIcon(new ImageIcon("resource/yinyang.gif"));
/*  59 */     this.btnClearScript = new JButton();
/*  60 */     this.btnClearScript.setIcon(new ImageIcon("resource/close.gif"));
/*  61 */     this.btnClearResult = new JButton();
/*  62 */     this.btnClearResult.setIcon(new ImageIcon("resource/close.gif"));
/*     */ 
/*  64 */     setName("Form");
/*     */ 
/*  66 */     this.scroller.setName("scroller");
/*     */ 
/*  68 */     this.scriptEditor.setName("scriptEditor");
/*  69 */     this.scroller.setViewportView(this.scriptEditor);
/*     */ 
/*  71 */     this.scroller2.setName("scroller2");
/*     */ 
/*  73 */     this.resultWindow.setName("resultWindow");
/*  74 */     this.scroller2.setViewportView(this.resultWindow);
/*     */ 
/*  76 */     this.btnEval.setText("eval");
/*  77 */     this.btnEval.setName("btnEval");
/*     */ 
/*  79 */     this.btnClearScript.setText("clear script editor");
/*  80 */     this.btnClearScript.setName("btnClearScript");
/*     */ 
/*  82 */     this.btnClearResult.setText("clear result window");
/*  83 */     this.btnClearResult.setName("btnClearResult");
/*     */ 
/*  85 */     GroupLayout layout = new GroupLayout(this);
/*  86 */     setLayout(layout);
/*  87 */     layout.setHorizontalGroup(
/*  88 */       layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  89 */       .addComponent(this.scroller2)
/*  90 */       .addComponent(this.scroller)
/*  91 */       .addGroup(layout.createSequentialGroup()
/*  92 */       .addContainerGap()
/*  93 */       .addComponent(this.btnEval)
/*  94 */       .addGap(18, 18, 18)
/*  95 */       .addComponent(this.btnClearScript)
/*  96 */       .addGap(18, 18, 18)
/*  97 */       .addComponent(this.btnClearResult)
/*  98 */       .addContainerGap(328, 32767)));
/*     */ 
/* 100 */     layout.setVerticalGroup(
/* 101 */       layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 102 */       .addGroup(layout.createSequentialGroup()
/* 103 */       .addComponent(this.scroller, -2, 326, -2)
/* 104 */       .addGap(3, 3, 3)
/* 105 */       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 106 */       .addComponent(this.btnEval)
/* 107 */       .addComponent(this.btnClearScript)
/* 108 */       .addComponent(this.btnClearResult))
/* 109 */       .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 110 */       .addComponent(this.scroller2, -1, 220, 32767)));
/*     */ 
/* 113 */     this.btnEval.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/* 115 */         String scriptStr = MainPanel.this.scriptEditor.getText();
/* 116 */         MainPanel.this.evalScript(scriptStr);
/*     */       }
/*     */     });
/* 120 */     this.btnClearScript.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/* 122 */         MainPanel.this.scriptEditor.setText("");
/*     */       }
/*     */     });
/* 126 */     this.btnClearResult.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/* 128 */         MainPanel.this.resultWindow.setText("");
/*     */       }
/*     */     });
/*     */   }
/*     */ 
/*     */   private Object evalScript(String script)
/*     */   {
/* 135 */     Object result = new Object();
/* 136 */     ScriptEngineManager manager = new ScriptEngineManager();
/* 137 */     ScriptEngine engine = manager.getEngineByName("JavaScript");
/*     */     try {
/* 139 */       result = engine.eval(script);
/*     */     } catch (ScriptException e) {
/* 141 */       e.printStackTrace();
/*     */     }
/* 143 */     return result;
/*     */   }
/*     */ 
/*     */   public JMenuBar getMenuBar() {
/* 147 */     return createMenubar();
/*     */   }
/*     */ 
/*     */   private JMenuBar createMenubar() {
/* 151 */     JMenuBar mb = new JMenuBar();
/*     */ 
/* 153 */     JMenu m = new JMenu("File");
/* 154 */     m.setIcon(new ImageIcon("resource/flie.gif"));
/*     */ 
/* 156 */     JMenuItem load = new JMenuItem("load", new ImageIcon("resource/open.gif"));
/* 157 */     JMenuItem eval = new JMenuItem("eval", new ImageIcon("resource/yinyang.gif"));
/* 158 */     JMenuItem exit = new JMenuItem("Exit", new ImageIcon("resource/close.gif"));
/*     */ 
/* 160 */     m.add(load);
/* 161 */     m.add(eval);
/* 162 */     m.addSeparator();
/* 163 */     m.add(exit);
/*     */ 
/* 165 */     exit.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent e) {
/* 167 */         int y = JOptionPane.showConfirmDialog(
/* 168 */           null, 
/* 169 */           "Confirm exit", 
/* 170 */           "Confirm Exit Dialog", 
/* 171 */           0);
/* 172 */         if (y == 0) System.exit(0);
/*     */       }
/*     */     });
/* 176 */     mb.add(m);
/*     */ 
/* 178 */     return mb;
/*     */   }
/*     */ 
/*     */   public static void main(String[] args) {
/* 182 */     JFrame frame = new JFrame();
/* 183 */     frame.setTitle("script evaler");
/* 184 */     frame.setBackground(Color.lightGray);
/* 185 */     frame.getContentPane().setLayout(new BorderLayout());
/* 186 */     MainPanel mainPanel = new MainPanel();
/* 187 */     frame.getContentPane().add("Center", mainPanel);
/* 188 */     frame.setJMenuBar(mainPanel.getMenuBar());
/* 189 */     frame.setDefaultCloseOperation(3);
/* 190 */     frame.pack();
/* 191 */     frame.setSize(600, 480);
/* 192 */     frame.setLocationRelativeTo(null);
/* 193 */     frame.setVisible(true);
/*     */   }
/*     */ }

