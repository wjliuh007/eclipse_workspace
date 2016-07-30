package com.wjliuh.entity.model;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextAreaEditorKit;

import com.wjliuh.service.RsyntaxTextService;

public class RsyntaxTextModel {
	/** 文件格式 */
	private String fileFormat;
	
	private RSyntaxDocument doc;
	
	private File choseFile;

	public RSyntaxDocument getDoc() {
		RTextAreaEditorKit kit = new RTextAreaEditorKit();
		try {
			doc.remove(0, doc.getLength());
//			doc.setSyntaxStyle(getFileFormat());
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			kit.read(getChoseFile().toURL().openConnection().getInputStream(), doc, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return doc;
	}

	public void setDoc(RSyntaxDocument doc) {
		this.doc = doc;
	}

	public String getFileFormat() {

		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public File getChoseFile() {
		return choseFile;
	}

	public void setChoseFile(File choseFile) {
		this.choseFile = choseFile;
		String fileName = choseFile.getName();
		String format = fileName.substring(fileName.lastIndexOf(".") + 1);
		fileFormat = new RsyntaxTextService().reflectGetFormat(format);
	}
}
