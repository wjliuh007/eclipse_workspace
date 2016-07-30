package com.wjliuh.parser;

import com.wjliuh.model.Cancelable;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utls.Util;

final class ParseContext {
	
	private final String filename;
	private final Object reporter;
	private final Cancelable cancelable;

	public ParseContext(@NotNull String filename) {
		this(filename, null, Cancelable.nullCancelable);
	}
	
	public ParseContext(@NotNull String filename,
	                    @NotNull Object reporter,
						@NotNull Cancelable cancelable) {
		Util.checkNotNull(filename, reporter, cancelable);
		this.filename = filename;
		this.reporter = reporter;
		this.cancelable = cancelable;
	}
	
	@NotNull
	public String getFilename() {
		return filename;
	}

	@NotNull
	public Object getReporter() {
		return reporter;
	}

	@NotNull
	public Cancelable getCancelable() {
		return cancelable;
	}

}
