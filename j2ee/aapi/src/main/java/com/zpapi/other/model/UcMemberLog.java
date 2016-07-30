/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

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


public class UcMemberLog extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "UcMemberLog";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_LOG_TYPE = "日志类型";
	public static final String ALIAS_OPERATION_TABLE = "操作表";
	public static final String ALIAS_OPERATION_FIELD = "操作字段";
	public static final String ALIAS_OLD_VALUE = "操作前数据";
	public static final String ALIAS_NEW_VALUE = "操作后数据";
	public static final String ALIAS_OPERATION_CONTENT = "操作内容，描述性文字代替操作前后数据";
	public static final String ALIAS_MEMBERID = "操作用户id";
	public static final String ALIAS_LOG_TIME = "操作时间";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 日志类型       db_column: log_type 
     */	
	@NotNull 
	private java.lang.Integer logType;
    /**
     * 操作表       db_column: operation_table 
     */	
	@Length(max=100)
	private java.lang.String operationTable;
    /**
     * 操作字段       db_column: operation_field 
     */	
	@Length(max=100)
	private java.lang.String operationField;
    /**
     * 操作前数据       db_column: old_value 
     */	
	@Length(max=100)
	private java.lang.String oldValue;
    /**
     * 操作后数据       db_column: new_value 
     */	
	@Length(max=100)
	private java.lang.String newValue;
    /**
     * 操作内容，描述性文字代替操作前后数据       db_column: operation_content 
     */	
	@Length(max=500)
	private java.lang.String operationContent;
    /**
     * 操作用户id       db_column: memberid 
     */	
	@NotNull 
	private java.lang.Integer memberid;
    /**
     * 操作时间       db_column: log_time 
     */	
	@NotNull 
	private Date logTime;
	//columns END

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public UcMemberLog(){
	}

	public UcMemberLog(
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
	public void setLogType(java.lang.Integer value) {
		this.logType = value;
	}
	
	public java.lang.Integer getLogType() {
		return this.logType;
	}
	public void setOperationTable(java.lang.String value) {
		this.operationTable = value;
	}
	
	public java.lang.String getOperationTable() {
		return this.operationTable;
	}
	public void setOperationField(java.lang.String value) {
		this.operationField = value;
	}
	
	public java.lang.String getOperationField() {
		return this.operationField;
	}
	public void setOldValue(java.lang.String value) {
		this.oldValue = value;
	}
	
	public java.lang.String getOldValue() {
		return this.oldValue;
	}
	public void setNewValue(java.lang.String value) {
		this.newValue = value;
	}
	
	public java.lang.String getNewValue() {
		return this.newValue;
	}
	public void setOperationContent(java.lang.String value) {
		this.operationContent = value;
	}
	
	public java.lang.String getOperationContent() {
		return this.operationContent;
	}
	public void setMemberid(java.lang.Integer value) {
		this.memberid = value;
	}
	
	public java.lang.Integer getMemberid() {
		return this.memberid;
	}
	 

	  

	 
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("LogType",getLogType())
			.append("OperationTable",getOperationTable())
			.append("OperationField",getOperationField())
			.append("OldValue",getOldValue())
			.append("NewValue",getNewValue())
			.append("OperationContent",getOperationContent())
			.append("Memberid",getMemberid())
			.append("LogTime",getLogTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof UcMemberLog == false) return false;
		if(this == obj) return true;
		UcMemberLog other = (UcMemberLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

