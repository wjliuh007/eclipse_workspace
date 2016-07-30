package com.wjliuh.result;

import com.wjliuh.utls.Util;

import org.apache.lucene.document.Document;

public class SearchResult {

	private String name;
	private String path;
	private float score;
	private String title;
	private String lastModified;
	private String type;
	private String size;
	private String author;
	
	private Document doc;
	
	public SearchResult(Document doc,float score){
		this.setDoc(doc);
		this.setScore(score);
	}
	
	public String getName() {
		String name = this.doc.get("name");
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		String path = this.doc.get("path");
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getScore() {
		return String.valueOf(score);
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getTitle() {
		String title = this.doc.get("title");
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLastModified() {
		String lastModified = this.doc.get("lastModified");
		return lastModified;
	}
	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}
	public String getType() {
		String type = this.doc.get("type");
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		long sizeInKB = -1;
		String sizeString = this.doc.get("size");
		assert sizeString != null;
		long sizeInBytes = Long.valueOf(sizeString);
		long extra = sizeInBytes % 1024 == 0 ? 0 : 1;
		sizeInKB = sizeInBytes / 1024 + extra;
		return String.valueOf(sizeInKB);
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getAuthor() {
		String[] authors = this.doc.getValues("author");
		if (authors.length > 0)
			return Util.join(", ", (Object[]) authors);

		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}
	
	
	
}
