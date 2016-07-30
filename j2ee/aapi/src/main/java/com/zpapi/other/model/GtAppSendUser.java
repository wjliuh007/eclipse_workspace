/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
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


public class GtAppSendUser extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtAppSendUser";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MODEL = "model";
	public static final String ALIAS_UID = "uid";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * model       db_column: model 
     */	
	@Length(max=255)
	private java.lang.String model;
    /**
     * uid       db_column: u_id 
     */	
	
	private java.lang.Integer uid;
	
	private String apptype;
	
	private String  idfa;
	//columns END

	public GtAppSendUser(){
	}

	public GtAppSendUser(
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
	public void setModel(java.lang.String value) {
		this.model = value;
	}
	
	public java.lang.String getModel() {
		return this.model;
	}
	public void setUid(java.lang.Integer value) {
		this.uid = value;
	}
	
	public java.lang.Integer getUid() {
		return this.uid;
	}
	
	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Model",getModel())
			.append("Uid",getUid())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtAppSendUser == false) return false;
		if(this == obj) return true;
		GtAppSendUser other = (GtAppSendUser)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String getApptype() {
		return apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}
}

