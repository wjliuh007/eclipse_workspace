package com.wjliuh.parser;

import java.io.File;

import org.apache.lucene.document.Document;

import com.wjliuh.utils.annotations.NotNull;

public abstract class FileParser implements Parser {

	/**
     * Lucene 字段名，存储绝对路径
     */
    public static final String path = "path"; 

    /**
     * Lucene 字段名，存储作者
     */
    public static final String author = "author";

    /**
     * Lucene 字段名，存储标题
     */
    public static final String title = "title"; 

    /**
     * Lucene 字段名，存储文本内容
     */
    public static final String contents = "contents"; 

    /**
     * Lucene 字段名，存储最后修改者
     */
    public static final String lastModified = "lastModified"; 

    /**
     * Lucene 字段名，存储解析器
     */
    public static final String parsedBy = "parsedBy"; 
    
	@NotNull
	public abstract String renderText(@NotNull File file)	throws Exception;
	
}
