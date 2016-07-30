/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.query;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtMemberLoginLogQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** memberId */
	private java.lang.Long memberId;
	/** username */
	private java.lang.String username;
	/** loginIp */
	private java.lang.String loginIp;
	/** loginTime */
	private java.lang.Integer loginTime;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getLoginIp() {
		return this.loginIp;
	}
	
	public void setLoginIp(java.lang.String value) {
		this.loginIp = value;
	}
	
	public java.lang.Integer getLoginTime() {
		return this.loginTime;
	}
	
	public void setLoginTime(java.lang.Integer value) {
		this.loginTime = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

