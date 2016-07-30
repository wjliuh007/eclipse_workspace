package com.wjliuh.parser;
import java.io.InputStream;

import org.apache.lucene.document.Document;

import com.wjliuh.utils.annotations.NotNull;

abstract class StreamParser implements Parser {
	
	@NotNull
	public abstract Document parse(	@NotNull InputStream in)
			throws ParseException;
	
	@NotNull
	protected String renderText(@NotNull InputStream in)
			throws ParseException {
		return null;
	}

}
