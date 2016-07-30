package com.wjliuh.parser;

import com.wjliuh.utils.annotations.NotNull;

public final class ParseException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public ParseException(@NotNull Throwable cause) {
		super(cause);
	}
	
	public ParseException(@NotNull String message) {
		super(message);
	}
	
	public ParseException(@NotNull String message, @NotNull Throwable cause) {
		super(message, cause);
	}
	
}