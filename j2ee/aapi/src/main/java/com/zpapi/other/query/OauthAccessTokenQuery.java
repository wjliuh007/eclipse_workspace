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


public class OauthAccessTokenQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** tokenId */
	private java.lang.String tokenId;
	/** token */
	private byte[] token;
	/** authenticationId */
	private java.lang.String authenticationId;
	/** userName */
	private java.lang.String userName;
	/** clientId */
	private java.lang.String clientId;
	/** authentication */
	private byte[] authentication;
	/** refreshToken */
	private java.lang.String refreshToken;
	/** id */
	private java.lang.Integer id;

	public java.lang.String getTokenId() {
		return this.tokenId;
	}
	
	public void setTokenId(java.lang.String value) {
		this.tokenId = value;
	}
	
	public byte[] getToken() {
		return this.token;
	}
	
	public void setToken(byte[] value) {
		this.token = value;
	}
	
	public java.lang.String getAuthenticationId() {
		return this.authenticationId;
	}
	
	public void setAuthenticationId(java.lang.String value) {
		this.authenticationId = value;
	}
	
	public java.lang.String getUserName() {
		return this.userName;
	}
	
	public void setUserName(java.lang.String value) {
		this.userName = value;
	}
	
	public java.lang.String getClientId() {
		return this.clientId;
	}
	
	public void setClientId(java.lang.String value) {
		this.clientId = value;
	}
	
	public byte[] getAuthentication() {
		return this.authentication;
	}
	
	public void setAuthentication(byte[] value) {
		this.authentication = value;
	}
	
	public java.lang.String getRefreshToken() {
		return this.refreshToken;
	}
	
	public void setRefreshToken(java.lang.String value) {
		this.refreshToken = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

