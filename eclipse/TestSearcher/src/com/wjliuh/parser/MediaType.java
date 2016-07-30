package com.wjliuh.parser;

import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

import com.wjliuh.utils.annotations.ImmutableCopy;
import com.wjliuh.utils.annotations.NotNull;
import com.wjliuh.utls.Util;

final class MediaType {
	
	private MediaType() {
	}
	
	public static final class Col {
		@ImmutableCopy
		@NotNull
		public static Collection<String> text(@NotNull String subType) {
			return Collections.singleton(MediaType.text(subType));
		}
		
		@ImmutableCopy
		@NotNull
		public static Collection<String> application(@NotNull String subType) {
			return Collections.singleton(MediaType.application(subType));
		}
	}
	
	@NotNull
	public static String text(@NotNull String subType) {
		return get("text", subType);
	}
	
	@NotNull
	public static String application(@NotNull String subType) {
		return get("application", subType);
	}
	
	@NotNull
	private static String get(@NotNull String type, @NotNull String subType) {
		Util.checkNotNull(type, subType);
		assert subType.length() > 0;
		assert ! subType.startsWith("/") && ! subType.startsWith("\\");
		return type + "/" + subType.toLowerCase(Locale.ENGLISH);
	}

}
