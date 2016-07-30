/*    */ package org.free.scriptevaler.ui;
/*    */ 
/*    */ import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
/*    */ 
/*    */ public class Console
/*    */   implements Runnable
/*    */ {
/*    */   JTextArea displayPane;
/*    */   BufferedReader reader;
/*    */ 
/*    */   private Console(JTextArea displayPane, PipedOutputStream pos)
/*    */   {
/* 12 */     this.displayPane = displayPane;
/*    */     try
/*    */     {
/* 15 */       PipedInputStream pis = new PipedInputStream(pos);
/* 16 */       this.reader = new BufferedReader(new InputStreamReader(pis));
/*    */     } catch (IOException localIOException) {
/*    */     }
/*    */   }
/*    */ 
/*    */   public void run() {
/* 22 */     String line = null;
/*    */     try
/*    */     {
/* 25 */       while ((line = this.reader.readLine()) != null) {
/* 26 */         this.displayPane.replaceSelection(line + "\n");
/* 27 */         this.displayPane.setCaretPosition(
/* 28 */           this.displayPane.getDocument().getLength());
/*    */       }
/*    */ 
/* 31 */       System.err.println("im here");
/*    */     } catch (IOException ioe) {
/* 33 */       JOptionPane.showMessageDialog(null, "Error redirecting output : " + 
/* 34 */         ioe.getMessage());
/*    */     }
/*    */   }
/*    */ 
/*    */   public static void redirectOutput(JTextArea displayPane) {
/* 39 */     redirectOut(displayPane);
/* 40 */     redirectErr(displayPane);
/*    */   }
/*    */ 
/*    */   public static void redirectOut(JTextArea displayPane) {
/* 44 */     PipedOutputStream pos = new PipedOutputStream();
/* 45 */     System.setOut(new PrintStream(pos, true));
/*    */ 
/* 47 */     Console console = new Console(displayPane, pos);
/* 48 */     new Thread(console).start();
/*    */   }
/*    */ 
/*    */   public static void redirectErr(JTextArea displayPane) {
/* 52 */     PipedOutputStream pos = new PipedOutputStream();
/* 53 */     System.setErr(new PrintStream(pos, true));
/*    */ 
/* 55 */     Console console = new Console(displayPane, pos);
/* 56 */     new Thread(console).start();
/*    */   }
/*    */ 
/*    */   public static void main(String[] args) {
/* 60 */     JTextArea textArea = new JTextArea();
/* 61 */     JScrollPane scrollPane = new JScrollPane(textArea);
/*    */ 
/* 63 */     JFrame frame = new JFrame("Redirect Output");
/* 64 */     frame.setDefaultCloseOperation(3);
/* 65 */     frame.getContentPane().add(scrollPane);
/* 66 */     frame.setSize(200, 100);
/* 67 */     frame.setVisible(true);
/*    */ 
/* 69 */     redirectOutput(textArea);
/*    */ 
/* 71 */     Timer timer = new Timer(1000, new ActionListener() {
/*    */       public void actionPerformed(ActionEvent e) {
/* 73 */         System.out.println(new Date().toString());
/* 74 */         System.err.println(System.currentTimeMillis());
/*    */       }
/*    */     });
/* 77 */     timer.start();
/*    */   }
/*    */ }

/* Location:           D:\jad\se.jar
 * Qualified Name:     org.free.scriptevaler.ui.Console
 * JD-Core Version:    0.6.2
 */