package com.zpapi.other.error;

public class ApiException extends RuntimeException {
	
	/** 
	 * @Fields serialVersionUID : TODO
	 */ 
	private static final long serialVersionUID = 3790487312698277234L;
	private com.zpapi.other.util.ErrorCode code;

	public com.zpapi.other.util.ErrorCode getCode() {
		return code;
	}
	
	public ApiException(com.zpapi.other.util.ErrorCode code){
		super(code.getCodeMsg());
		this.code = code;
	}
}
