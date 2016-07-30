/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.zhen.commons.base.BaseEntity;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;
import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class OauthAccessToken extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "OauthAccessToken";
	public static final String ALIAS_TOKEN_ID = "tokenId";
	public static final String ALIAS_TOKEN = "token";
	public static final String ALIAS_AUTHENTICATION_ID = "authenticationId";
	public static final String ALIAS_USER_NAME = "userName";
	public static final String ALIAS_CLIENT_ID = "clientId";
	public static final String ALIAS_AUTHENTICATION = "authentication";
	public static final String ALIAS_REFRESH_TOKEN = "refreshToken";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * tokenId       db_column: token_id 
     */	
	@Length(max=256)
	private java.lang.String tokenId;
    /**
     * token       db_column: token 
     */	
	
	private byte[] token;
    /**
     * authenticationId       db_column: authentication_id 
     */	
	@Length(max=256)
	private java.lang.String authenticationId;
    /**
     * userName       db_column: user_name 
     */	
	@Length(max=256)
	private java.lang.String userName;
    /**
     * clientId       db_column: client_id 
     */	
	@Length(max=256)
	private java.lang.String clientId;
    /**
     * authentication       db_column: authentication 
     */	
	
	private byte[] authentication;
    /**
     * refreshToken       db_column: refresh_token 
     */	
	@Length(max=256)
	private java.lang.String refreshToken;
    /**
     * id       db_column: id 
     */	
	
	//columns END

	public OauthAccessToken(){
	}


	public void setTokenId(java.lang.String value) {
		this.tokenId = value;
	}
	
	public java.lang.String getTokenId() {
		return this.tokenId;
	}
	public void setToken(byte[] value) {
		this.token = value;
	}
	
	public byte[] getToken() {
		return this.token;
	}
	public void setAuthenticationId(java.lang.String value) {
		this.authenticationId = value;
	}
	
	public java.lang.String getAuthenticationId() {
		return this.authenticationId;
	}
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
	public java.lang.String getUserName() {
		return this.userName;
	}
	public void setClientId(java.lang.String value) {
		this.clientId = value;
	}
	
	public java.lang.String getClientId() {
		return this.clientId;
	}
	public void setAuthentication(byte[] value) {
		this.authentication = value;
	}
	
	public byte[] getAuthentication() {
		return this.authentication;
	}
	public void setRefreshToken(java.lang.String value) {
		this.refreshToken = value;
	}
	
	public java.lang.String getRefreshToken() {
		return this.refreshToken;
	}

	


	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("TokenId",getTokenId())
			.append("Token",getToken())
			.append("AuthenticationId",getAuthenticationId())
			.append("UserName",getUserName())
			.append("ClientId",getClientId())
			.append("Authentication",getAuthentication())
			.append("RefreshToken",getRefreshToken())
			.toString();
	}
	

}

