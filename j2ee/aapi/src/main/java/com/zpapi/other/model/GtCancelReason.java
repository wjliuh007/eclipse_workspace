/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zpapi.other.model;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtCancelReason extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtCancelReason";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_REASON = "reason";
	public static final String ALIAS_TYPE = "1：前台原因 2：后台原因";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * reason       db_column: reason 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String reason;
    /**
     * 1：前台原因 2：后台原因       db_column: type 
     */	
	@NotNull 
	private java.lang.Boolean type;
	//columns END

	public GtCancelReason(){
		
	}

	public GtCancelReason(
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
	public void setReason(java.lang.String value) {
		this.reason = value;
	}
	
	public java.lang.String getReason() {
		return this.reason;
	}
	public void setType(java.lang.Boolean value) {
		this.type = value;
	}
	
	public java.lang.Boolean getType() {
		return this.type;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Reason",getReason())
			.append("Type",getType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtCancelReason == false) return false;
		if(this == obj) return true;
		GtCancelReason other = (GtCancelReason)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
	
	public Map<String, Object> setCancelReason (){
		Map<String, Object> cancelMap= new HashMap<String, Object>(2);
		cancelMap.put("id", this.getId());
		cancelMap.put("reason", this.getReason());
		return cancelMap;
	}
}

