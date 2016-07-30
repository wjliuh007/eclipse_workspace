/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtMemberLoginLog extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtMemberLoginLog";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MEMBER_ID = "memberId";
	public static final String ALIAS_USERNAME = "username";
	public static final String ALIAS_LOGIN_IP = "loginIp";
	public static final String ALIAS_LOGIN_TIME = "loginTime";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * memberId       db_column: member_id 
     */	
	
	private java.lang.Long memberId;
    /**
     * username       db_column: username 
     */	
	@Length(max=50)
	private java.lang.String username;
    /**
     * loginIp       db_column: login_ip 
     */	
	@Length(max=20)
	private java.lang.String loginIp;
    /**
     * loginTime       db_column: login_time 
     */	
	
	private java.lang.Integer loginTime;
	//columns END

	public GtMemberLoginLog(){
	}

	public GtMemberLoginLog(
		java.lang.Integer id
	){
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setLoginIp(java.lang.String value) {
		this.loginIp = value;
	}
	
	public java.lang.String getLoginIp() {
		return this.loginIp;
	}
	public void setLoginTime(java.lang.Integer value) {
		this.loginTime = value;
	}
	
	public java.lang.Integer getLoginTime() {
		return this.loginTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("MemberId",getMemberId())
			.append("Username",getUsername())
			.append("LoginIp",getLoginIp())
			.append("LoginTime",getLoginTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtMemberLoginLog == false) return false;
		if(this == obj) return true;
		GtMemberLoginLog other = (GtMemberLoginLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

