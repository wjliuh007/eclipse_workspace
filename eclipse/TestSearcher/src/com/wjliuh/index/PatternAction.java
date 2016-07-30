package com.wjliuh.index;
import java.io.Serializable;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import com.wjliuh.enums.Msg;
import com.wjliuh.parser.Path;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utils.annotations.Nullable;
import com.wjliuh.utls.Util;



/**
 * @author Tran Nam Quang
 */
public final class PatternAction implements Serializable {
	
	public enum MatchTarget {
		FILENAME,
		PATH,
		;
	}
	
	public enum MatchAction {
		EXCLUDE (Msg.exclude.get()),
		DETECT_MIME (Msg.detect_mime_type.get()),
		;
		public final String displayName;

		private MatchAction(String displayName) {
			this.displayName = displayName;
		}
	}
	
	private static final long serialVersionUID = 1L;
	
	@NotNull private String regex;
	@Nullable private transient Pattern pattern;
	
	@NotNull private MatchTarget target = MatchTarget.FILENAME;
	@NotNull private MatchAction action = MatchAction.EXCLUDE;
	
	public PatternAction() {
		this("regex");
	}
	
	public PatternAction(@NotNull String regex) {
		this.regex = regex;
	}
	
	// might throw PatternSyntaxException
	public boolean matches(	@NotNull String filename,
							@NotNull Path path,
							boolean isFile) {
		// TODO post-release-1.1: patterns are currently not applied to regular directories
		if (!isFile)
			return false;
		
		if (pattern == null) // Will be null after serialization
			pattern = Pattern.compile(regex);
		
		switch (target) {
		case FILENAME:
			return pattern.matcher(filename).matches();
		case PATH:
			return pattern.matcher(path.getPath()).matches();
		default:
			throw new IllegalStateException();
		}
	}

	// Allows invalid regexes
	public void setRegex(@NotNull String regex) {
		Util.checkNotNull(regex);
		if (this.regex.equals(regex))
			return;
		this.regex = regex;
		pattern = null;
	}
	
	public boolean validateRegex() {
		if (pattern != null)
			return true;
		try {
			pattern = Pattern.compile(regex);
			return true;
		}
		catch (PatternSyntaxException e) {
			return false;
		}
	}

	@NotNull
	public String getRegex() {
		return regex;
	}

	public void setTarget(@NotNull MatchTarget target) {
		this.target = Util.checkNotNull(target);
	}

	@NotNull
	public MatchTarget getTarget() {
		return target;
	}

	public void setAction(@NotNull MatchAction action) {
		this.action = Util.checkNotNull(action);
	}

	@NotNull
	public MatchAction getAction() {
		return action;
	}
	
}