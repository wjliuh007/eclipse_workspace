package com.wjliuh.service;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DropTargetDropEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.util.List;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextAreaEditorKit;

public class RsyntaxTextService {
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public Document dragFileToHere(DropTargetDropEvent dtde)
			throws UnsupportedFlavorException, IOException,
			BadLocationException, MalformedURLException {
		List<File> list =  (List<File>) (dtde.getTransferable().getTransferData(DataFlavor.javaFileListFlavor));
		RTextAreaEditorKit kit = new RTextAreaEditorKit();
		Document doc = kit.createDefaultDocument();
		kit.read(list.get(0).toURL().openConnection().getInputStream(), doc, 0);
		return doc;
	}
	
	public String reflectGetFormat(String suffix){
		 Field[] fields = SyntaxConstants.class.getDeclaredFields();  
		for(Field field : fields){
			String syntax = field.getName().substring(field.getName().lastIndexOf("_")+1);
			if(syntax.equalsIgnoreCase(suffix)){
				return field.getName();
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		System.out.println(new RsyntaxTextService().reflectGetFormat("java"));
	}
}
