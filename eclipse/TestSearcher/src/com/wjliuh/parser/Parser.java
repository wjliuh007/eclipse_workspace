package com.wjliuh.parser;

import java.io.File;
import java.util.Collection;

import org.apache.lucene.document.Document;

import com.wjliuh.utils.annotations.NotNull;

public interface Parser {
    
	@NotNull
	public abstract Collection<String> getExtensions();
	
	@NotNull
	public abstract Collection<String> getTypes();
	
	@NotNull
	public abstract String getTypeLabel();

	public abstract Document parse(File file)throws Exception;

}
