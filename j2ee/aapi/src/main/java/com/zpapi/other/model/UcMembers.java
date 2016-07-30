/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.zhen.commons.base.BaseEntity;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class UcMembers extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "UcMembers";
	public static final String ALIAS_UID = "uid";
	public static final String ALIAS_USERNAME = "username";
	public static final String ALIAS_PASSWORD = "password";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_MOBILE = "mobile";
	public static final String ALIAS_CUR_LEVEL = "curLevel";
	public static final String ALIAS_TOP_LEVEL = "topLevel";
	public static final String ALIAS_TOTAL_CONSUMPTION = "totalConsumption";
	public static final String ALIAS_ACTIVE_CONSUMPTION = "activeConsumption";
	public static final String ALIAS_MYID = "myid";
	public static final String ALIAS_MYIDKEY = "myidkey";
	public static final String ALIAS_REGIP = "regip";
	public static final String ALIAS_REGDATE = "regdate";
	public static final String ALIAS_LASTLOGINIP = "lastloginip";
	public static final String ALIAS_LASTLOGINTIME = "lastlogintime";
	public static final String ALIAS_SALT = "salt";
	public static final String ALIAS_SECQUES = "secques";
	public static final String ALIAS_LOGIN_ERROR_NUM = "loginErrorNum";
	public static final String ALIAS_LOGIN_ERROR_TIME = "loginErrorTime";
	public static final String ALIAS_LOGIN_LOCK_TIME = "loginLockTime";
	public static final String ALIAS_THIRD_PARTY_ID = "第三方登录id";
	public static final String ALIAS_SOURCE = "外接用户来源";
	public static final String ALIAS_IS_BOND = "1=>绑定 2=>未绑定";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * uid       db_column: uid 
     */	
	
	private java.lang.Long uid;
    /**
     * username       db_column: username 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String username;
    /**
     * password       db_column: password 
     */	
	@NotBlank @Length(max=32)
	private java.lang.String password;
    /**
     * email       db_column: email 
     */	
	@NotBlank @Email @Length(max=50)
	private java.lang.String email;
	 /**
     * 用户手机号       db_column: mobile 
     */	
	@Length(max=11)
	private java.lang.String mobile;
    /**
     * curLevel       db_column: cur_level 
     */	
	@NotNull 
	private java.lang.Integer curLevel;
    /**
     * topLevel       db_column: top_level 
     */	
	@NotNull 
	private java.lang.Integer topLevel;
    /**
     * totalConsumption       db_column: total_consumption 
     */	
	@NotNull 
	private Long totalConsumption;
    /**
     * activeConsumption       db_column: active_consumption 
     */	
	@NotNull 
	private Long activeConsumption;
    /**
     * myid       db_column: myid 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String myid;
    /**
     * myidkey       db_column: myidkey 
     */	
	@NotBlank @Length(max=16)
	private java.lang.String myidkey;
    /**
     * regip       db_column: regip 
     */	
	@NotBlank @Length(max=15)
	private java.lang.String regip;
    /**
     * regdate       db_column: regdate 
     */	
	@NotNull 
	private java.lang.Integer regdate;
    /**
     * lastloginip       db_column: lastloginip 
     */	
	@NotNull 
	private java.lang.Integer lastloginip;
    /**
     * lastlogintime       db_column: lastlogintime 
     */	
	@NotNull 
	private java.lang.Integer lastlogintime;
    /**
     * salt       db_column: salt 
     */	
	@NotBlank @Length(max=6)
	private java.lang.String salt;
    /**
     * secques       db_column: secques 
     */	
	@NotBlank @Length(max=8)
	private java.lang.String secques;
    /**
     * loginErrorNum       db_column: login_error_num 
     */	
	@NotNull @Max(127)
	private Integer loginErrorNum;
    /**
     * loginErrorTime       db_column: login_error_time 
     */	
	@NotNull 
	private java.lang.Integer loginErrorTime;
    /**
     * loginLockTime       db_column: login_lock_time 
     */	
	@NotNull 
	private java.lang.Integer loginLockTime;
    /**
     * 第三方登录id       db_column: third_party_id 
     */	
	@Length(max=255)
	private java.lang.String thirdPartyId;
    /**
     * 外接用户来源       db_column: source 
     */	
	@Length(max=255)
	private java.lang.String source;
    /**
     * 1=>绑定 2=>未绑定       db_column: is_bond 
     */	
	
	private java.lang.Integer isBond;
	private Integer channel;
	//columns END
	

	public UcMembers(){
	}

	public UcMembers(
		java.lang.Long uid
	){
		this.uid = uid;
	}

	public void setUid(java.lang.Long value) {
		this.uid = value;
	}
	
	public java.lang.Long getUid() {
		return this.uid;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setPassword(java.lang.String value) {
		this.password = value;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	
	public java.lang.String getMobile() {
		return mobile;
	}

	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}

	public void setCurLevel(java.lang.Integer value) {
		this.curLevel = value;
	}
	
	public java.lang.Integer getCurLevel() {
		return this.curLevel;
	}
	public void setTopLevel(java.lang.Integer value) {
		this.topLevel = value;
	}
	
	public java.lang.Integer getTopLevel() {
		return this.topLevel;
	}
	public void setTotalConsumption(Long value) {
		this.totalConsumption = value;
	}
	
	public Long getTotalConsumption() {
		return this.totalConsumption;
	}
	public void setActiveConsumption(Long value) {
		this.activeConsumption = value;
	}
	
	public Long getActiveConsumption() {
		return this.activeConsumption;
	}
	public void setMyid(java.lang.String value) {
		this.myid = value;
	}
	
	public java.lang.String getMyid() {
		return this.myid;
	}
	public void setMyidkey(java.lang.String value) {
		this.myidkey = value;
	}
	
	public java.lang.String getMyidkey() {
		return this.myidkey;
	}
	public void setRegip(java.lang.String value) {
		this.regip = value;
	}
	
	public java.lang.String getRegip() {
		return this.regip;
	}
	public void setRegdate(java.lang.Integer value) {
		this.regdate = value;
	}
	
	public java.lang.Integer getRegdate() {
		return this.regdate;
	}
	public void setLastloginip(java.lang.Integer value) {
		this.lastloginip = value;
	}
	
	public java.lang.Integer getLastloginip() {
		return this.lastloginip;
	}
	public void setLastlogintime(java.lang.Integer value) {
		this.lastlogintime = value;
	}
	
	public java.lang.Integer getLastlogintime() {
		return this.lastlogintime;
	}
	public void setSalt(java.lang.String value) {
		this.salt = value;
	}
	
	public java.lang.String getSalt() {
		return this.salt;
	}
	public void setSecques(java.lang.String value) {
		this.secques = value;
	}
	
	public java.lang.String getSecques() {
		return this.secques;
	}
	public void setLoginErrorNum(Integer value) {
		this.loginErrorNum = value;
	}
	
	public Integer getLoginErrorNum() {
		return this.loginErrorNum;
	}
	public void setLoginErrorTime(java.lang.Integer value) {
		this.loginErrorTime = value;
	}
	
	public java.lang.Integer getLoginErrorTime() {
		return this.loginErrorTime;
	}
	public void setLoginLockTime(java.lang.Integer value) {
		this.loginLockTime = value;
	}
	
	public java.lang.Integer getLoginLockTime() {
		return this.loginLockTime;
	}
	public void setThirdPartyId(java.lang.String value) {
		this.thirdPartyId = value;
	}
	
	public java.lang.String getThirdPartyId() {
		return this.thirdPartyId;
	}
	public void setSource(java.lang.String value) {
		this.source = value;
	}
	
	public java.lang.String getSource() {
		return this.source;
	}
	public void setIsBond(java.lang.Integer value) {
		this.isBond = value;
	}
	
	public java.lang.Integer getIsBond() {
		return this.isBond;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}



	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Uid",getUid())
			.append("Username",getUsername())
			.append("Password",getPassword())
			.append("Email",getEmail())
			.append("Mobile",getMobile())
			.append("CurLevel",getCurLevel())
			.append("TopLevel",getTopLevel())
			.append("TotalConsumption",getTotalConsumption())
			.append("ActiveConsumption",getActiveConsumption())
			.append("Myid",getMyid())
			.append("Myidkey",getMyidkey())
			.append("Regip",getRegip())
			.append("Regdate",getRegdate())
			.append("Lastloginip",getLastloginip())
			.append("Lastlogintime",getLastlogintime())
			.append("Salt",getSalt())
			.append("Secques",getSecques())
			.append("LoginErrorNum",getLoginErrorNum())
			.append("LoginErrorTime",getLoginErrorTime())
			.append("LoginLockTime",getLoginLockTime())
			.append("ThirdPartyId",getThirdPartyId())
			.append("Source",getSource())
			.append("IsBond",getIsBond())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof UcMembers == false) return false;
		if(this == obj) return true;
		UcMembers other = (UcMembers)obj;
		return new EqualsBuilder()
			.append(getUid(),other.getUid())
			.isEquals();
	}
	
	 
	
}

