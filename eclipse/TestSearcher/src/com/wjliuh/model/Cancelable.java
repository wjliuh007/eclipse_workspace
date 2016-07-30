package com.wjliuh.model;
public interface Cancelable {
	
	public static final Cancelable nullCancelable = new Cancelable() {
		public boolean isCanceled() {
			return false;
		}
	};
	
	public boolean isCanceled();

}