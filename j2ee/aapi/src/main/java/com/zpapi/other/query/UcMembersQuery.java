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


public class UcMembersQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** uid */
	private java.lang.Long uid;
	/** username */
	private java.lang.String username;
	/** password */
	private java.lang.String password;
	/** email */
	private java.lang.String email;
	/** mobile */
	private java.lang.String mobile;
	/** curLevel */
	private java.lang.Integer curLevel;
	/** topLevel */
	private java.lang.Integer topLevel;
	/** totalConsumption */
	private Long totalConsumption;
	/** activeConsumption */
	private Long activeConsumption;
	/** myid */
	private java.lang.String myid;
	/** myidkey */
	private java.lang.String myidkey;
	/** regip */
	private java.lang.String regip;
	/** regdate */
	private java.lang.Integer regdate;
	/** lastloginip */
	private java.lang.Integer lastloginip;
	/** lastlogintime */
	private java.lang.Integer lastlogintime;
	/** salt */
	private java.lang.String salt;
	/** secques */
	private java.lang.String secques;
	/** loginErrorNum */
	private Integer loginErrorNum;
	/** loginErrorTime */
	private java.lang.Integer loginErrorTime;
	/** loginLockTime */
	private java.lang.Integer loginLockTime;
	/** 第三方登录id */
	private java.lang.String thirdPartyId;
	/** 外接用户来源 */
	private java.lang.String source;
	/** 1=>绑定 2=>未绑定 */
	private Integer isBond;
	/**注册来源 1：PC端    2：M端   3：APP端*/
	private java.lang.String  channel;

	public java.lang.String getChannel() {
		return channel;
	}

	public void setChannel(java.lang.String channel) {
		this.channel = channel;
	}

	public java.lang.Long getUid() {
		return this.uid;
	}
	
	public void setUid(java.lang.Long value) {
		this.uid = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}
	
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getMobile() {
		return mobile;
	}

	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}

	public java.lang.Integer getCurLevel() {
		return this.curLevel;
	}
	
	public void setCurLevel(java.lang.Integer value) {
		this.curLevel = value;
	}
	
	public java.lang.Integer getTopLevel() {
		return this.topLevel;
	}
	
	public void setTopLevel(java.lang.Integer value) {
		this.topLevel = value;
	}
	
	public Long getTotalConsumption() {
		return this.totalConsumption;
	}
	
	public void setTotalConsumption(Long value) {
		this.totalConsumption = value;
	}
	
	public Long getActiveConsumption() {
		return this.activeConsumption;
	}
	
	public void setActiveConsumption(Long value) {
		this.activeConsumption = value;
	}
	
	public java.lang.String getMyid() {
		return this.myid;
	}
	
	public void setMyid(java.lang.String value) {
		this.myid = value;
	}
	
	public java.lang.String getMyidkey() {
		return this.myidkey;
	}
	
	public void setMyidkey(java.lang.String value) {
		this.myidkey = value;
	}
	
	public java.lang.String getRegip() {
		return this.regip;
	}
	
	public void setRegip(java.lang.String value) {
		this.regip = value;
	}
	
	public java.lang.Integer getRegdate() {
		return this.regdate;
	}
	
	public void setRegdate(java.lang.Integer value) {
		this.regdate = value;
	}
	
	public java.lang.Integer getLastloginip() {
		return this.lastloginip;
	}
	
	public void setLastloginip(java.lang.Integer value) {
		this.lastloginip = value;
	}
	
	public java.lang.Integer getLastlogintime() {
		return this.lastlogintime;
	}
	
	public void setLastlogintime(java.lang.Integer value) {
		this.lastlogintime = value;
	}
	
	public java.lang.String getSalt() {
		return this.salt;
	}
	
	public void setSalt(java.lang.String value) {
		this.salt = value;
	}
	
	public java.lang.String getSecques() {
		return this.secques;
	}
	
	public void setSecques(java.lang.String value) {
		this.secques = value;
	}
	
	public Integer getLoginErrorNum() {
		return this.loginErrorNum;
	}
	
	public void setLoginErrorNum(Integer value) {
		this.loginErrorNum = value;
	}
	
	public java.lang.Integer getLoginErrorTime() {
		return this.loginErrorTime;
	}
	
	public void setLoginErrorTime(java.lang.Integer value) {
		this.loginErrorTime = value;
	}
	
	public java.lang.Integer getLoginLockTime() {
		return this.loginLockTime;
	}
	
	public void setLoginLockTime(java.lang.Integer value) {
		this.loginLockTime = value;
	}
	
	public java.lang.String getThirdPartyId() {
		return this.thirdPartyId;
	}
	
	public void setThirdPartyId(java.lang.String value) {
		this.thirdPartyId = value;
	}
	
	public java.lang.String getSource() {
		return this.source;
	}
	
	public void setSource(java.lang.String value) {
		this.source = value;
	}
	
	public Integer getIsBond() {
		return this.isBond;
	}
	
	public void setIsBond(Integer value) {
		this.isBond = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

