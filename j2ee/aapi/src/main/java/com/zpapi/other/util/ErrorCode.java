package com.zpapi.other.util;


/**
 * 
 * 公共异常定义为三位数的errorCode，各模块的异常定义从四位开始，并需要在此处注册
 * 
 * =============模块errorCode注册==============
 * 1000：用户模块；2000：商品模块；3000：订单模块；4000：规则模块；5000：推荐模块；6000：支付模块
 * 活动模块 7000
 * =============模块errorCode注册==============
 */
public class ErrorCode {
	
	/**公共异常定义开始  */
	
	/**
	 * 200 成功
	 */
	public static final ErrorCode SUCCESS = new ErrorCode(200,"ok");
	/** 
	 * 500 系统错误 
	 */
	public static final ErrorCode ERROR = new ErrorCode(500,"System error");
	/** 
	 * 102 服务暂停
	 */
	public static final ErrorCode sys_002 = new ErrorCode(102,"Service unavailable");
	/** 
	 * 103 远程服务错误
	 */
	public static final ErrorCode sys_003 = new ErrorCode(103,"Remote service error");
	/**
	 * 104 IP限制不能请求该资源
	 */
	public static final ErrorCode sys_004 = new ErrorCode(104,"IP limit");
	/** 
	 * 107 数据错误，请联系管理员
	 */
	public static final ErrorCode sys_007 = new ErrorCode(107,"数据错误，请联系管理员");
	/** 
	 * 108 参数错误，请参考API文档
	 */
	public static final ErrorCode sys_008 = new ErrorCode(108,"参数错误，请参考API文档");
	/** 
	 * 109 接口暂无实现
	 */
	public static final ErrorCode sys_009 = new ErrorCode(109,"接口暂无实现");
	/** 
	 * 110 账号异常，请重新登录
	 */
	public static final ErrorCode sys_010 = new ErrorCode(110,"账号异常，请重新登录");
	/** 
	 * 111 接口不提供此种服务，请参考API文档
	 */
	public static final ErrorCode sys_011 = new ErrorCode(111,"接口不提供此种服务，请参考API文档");
	/** 
	 * 112 请求超时
	 */
	public static final ErrorCode sys_012 = new ErrorCode(112,"请求超时");
	/** 
	 * 113 排队中，请稍后再提交
	 */
	public static final ErrorCode sys_013 = new ErrorCode(113,"排队中，请稍后再提交");
	/** 
	 * 114 未知错误
	 */
	public static final ErrorCode sys_014 = new ErrorCode(114,"未知错误");
	
	/** 
	 * 115 验证码错误,请重试
	 */
	public static final ErrorCode sys_015 = new ErrorCode(115,"验证码错误,请重试");
	/** 
	 * 116 账号过期或输入错误,请重试
	 */
	public static final ErrorCode sys_016 = new ErrorCode(116,"账号过期或输入错误,请重试");
	
	/** 
	 * 117请升至最新版本.
	 */
	public static final ErrorCode sys_017 = new ErrorCode(117,"请升至最新版本.");
	
	
	
	
	/**公共异常定义结束 */
	//fields and methods
	/**
	 * 错误码
	 */
	private int code;
	/**
	 * 错误信息，文本
	 */
	private String codeMsg;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getCodeMsg() {
		return codeMsg;
	}
	public void setCodeMsg(String codeMsg) {
		this.codeMsg = codeMsg;
	}
	public ErrorCode addMsg(String postfix){
		return defineCode(this.code, this.codeMsg + postfix);
	}
	protected ErrorCode(int code, String codeText) {
		super();
		this.code = code;
//		this.codeText = codeText;
//		this.codeMsg = StringUtils.toUnicode(codeText);
		this.codeMsg = codeText;
	}
	
	public static ErrorCode defineCode(int code, String codeText){
		return new ErrorCode(code, codeText);
	}
	@Override
    public String toString() {
        return "code:" + this.code + ",codeMsg:" + codeMsg;
    }
}
