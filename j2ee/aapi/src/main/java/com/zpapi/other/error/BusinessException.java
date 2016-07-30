package com.zpapi.other.error;

public class BusinessException extends RuntimeException{

	public ErrorCode getError() {
		return error;
	}


	public void setError(ErrorCode error) {
		this.error = error;
	}


	private ErrorCode error;
	public BusinessException(ErrorCode i) {
		super();
		setError(i);
	}

	
	private static final long serialVersionUID = -2996312694401870967L;
	
}