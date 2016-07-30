/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import com.zhen.commons.base.BaseEntity;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtMobileValidate extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtMobileValidate";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MOBILE = "手机号码";
	public static final String ALIAS_REQUEST_TIME = "请求时间";
	public static final String ALIAS_VALIDATE_CODE = "验证码";
	public static final String ALIAS_STATUS = "验证码z状态";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Long id;
    /**
     * 手机号码       db_column: mobile 
     */	
	@Length(max=11)
	private java.lang.String mobile;
    /**
     * 请求时间       db_column: request_time 
     */	
	
	private java.lang.Integer requestTime;
    /**
     * 验证码       db_column: validate_code 
     */	
	@Length(max=20)
	private java.lang.String validateCode;
	/**
     * 验证码 状态     db_column: status 
     */	
	@Length(max=2)
	private java.lang.String status;
	//columns END

	public GtMobileValidate(){
	}

	public GtMobileValidate(
		java.lang.Long id
	){
		this.id = id;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	public java.lang.String getMobile() {
		return this.mobile;
	}
	public void setRequestTime(java.lang.Integer value) {
		this.requestTime = value;
	}
	
	public java.lang.Integer getRequestTime() {
		return this.requestTime;
	}
	public void setValidateCode(java.lang.String value) {
		this.validateCode = value;
	}
	
	public java.lang.String getValidateCode() {
		return this.validateCode;
	}

	public java.lang.String getStatus() {
		return status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "GtMobileValidate [getId()=" + getId() + ", getMobile()="
				+ getMobile() + ", getRequestTime()=" + getRequestTime()
				+ ", getValidateCode()=" + getValidateCode() + ", getStatus()="
				+ getStatus() + ", hashCode()=" + hashCode() + "]";
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtMobileValidate == false) return false;
		if(this == obj) return true;
		GtMobileValidate other = (GtMobileValidate)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

