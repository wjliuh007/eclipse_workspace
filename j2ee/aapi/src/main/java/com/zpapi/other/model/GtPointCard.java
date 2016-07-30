/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.model;

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


public class GtPointCard extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtPointCard";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_IS_CHECK = "1=需要同批次 0=不限制同批次";
	public static final String ALIAS_CARD_NUM = "卡号";
	public static final String ALIAS_TIMES_NUM = "批次";
	public static final String ALIAS_POINT = "充值额度";
	public static final String ALIAS_START_DATE = "开始时间";
	public static final String ALIAS_DUE_DATE = "过期时间";
	public static final String ALIAS_STATUS = "0=》未激活，1=》激活";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_ACTIVE_DATE = "激活日期";
	public static final String ALIAS_ACTIVE_MEMBER_ID = "激活人id";
	public static final String ALIAS_TASK_ID = "关联任务ID";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Long id;
    /**
     * 1=需要同批次 0=不限制同批次       db_column: is_check 
     */	
	@NotNull 
	private java.lang.Boolean isCheck;
    /**
     * 卡号       db_column: card_num 
     */	
	@Length(max=30)
	private java.lang.String cardNum;
    /**
     * 批次       db_column: times_num 
     */	
	@NotNull 
	private java.lang.Integer timesNum;
    /**
     * 充值额度       db_column: point 
     */	
	
	private java.lang.Integer point;
    /**
     * 开始时间       db_column: start_date 
     */	
	@NotNull 
	private java.lang.Integer startDate;
    /**
     * 过期时间       db_column: due_date 
     */	
	
	private java.lang.Integer dueDate;
    /**
     * 0=》未激活，1=》激活       db_column: status 
     */	
	@NotNull 
	private java.lang.Boolean status;
    /**
     * 创建时间       db_column: create_time 
     */	
	@NotNull 
	private java.lang.Integer createTime;
    /**
     * 激活日期       db_column: active_date 
     */	
	@NotNull 
	private java.lang.Integer activeDate;
    /**
     * 激活人id       db_column: active_member_id 
     */	
	@NotNull 
	private java.lang.Long activeMemberId;
    /**
     * 关联任务ID       db_column: task_id 
     */	
	@NotNull 
	private java.lang.Integer taskId;
	//columns END

	public GtPointCard(){
	}

	public GtPointCard(
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
	public void setIsCheck(java.lang.Boolean value) {
		this.isCheck = value;
	}
	
	public java.lang.Boolean getIsCheck() {
		return this.isCheck;
	}
	public void setCardNum(java.lang.String value) {
		this.cardNum = value;
	}
	
	public java.lang.String getCardNum() {
		return this.cardNum;
	}
	public void setTimesNum(java.lang.Integer value) {
		this.timesNum = value;
	}
	
	public java.lang.Integer getTimesNum() {
		return this.timesNum;
	}
	public void setPoint(java.lang.Integer value) {
		this.point = value;
	}
	
	public java.lang.Integer getPoint() {
		return this.point;
	}
	public void setStartDate(java.lang.Integer value) {
		this.startDate = value;
	}
	
	public java.lang.Integer getStartDate() {
		return this.startDate;
	}
	public void setDueDate(java.lang.Integer value) {
		this.dueDate = value;
	}
	
	public java.lang.Integer getDueDate() {
		return this.dueDate;
	}
	public void setStatus(java.lang.Boolean value) {
		this.status = value;
	}
	
	public java.lang.Boolean getStatus() {
		return this.status;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	public void setActiveDate(java.lang.Integer value) {
		this.activeDate = value;
	}
	
	public java.lang.Integer getActiveDate() {
		return this.activeDate;
	}
	public void setActiveMemberId(java.lang.Long value) {
		this.activeMemberId = value;
	}
	
	public java.lang.Long getActiveMemberId() {
		return this.activeMemberId;
	}
	public void setTaskId(java.lang.Integer value) {
		this.taskId = value;
	}
	
	public java.lang.Integer getTaskId() {
		return this.taskId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("IsCheck",getIsCheck())
			.append("CardNum",getCardNum())
			.append("TimesNum",getTimesNum())
			.append("Point",getPoint())
			.append("StartDate",getStartDate())
			.append("DueDate",getDueDate())
			.append("Status",getStatus())
			.append("CreateTime",getCreateTime())
			.append("ActiveDate",getActiveDate())
			.append("ActiveMemberId",getActiveMemberId())
			.append("TaskId",getTaskId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtPointCard == false) return false;
		if(this == obj) return true;
		GtPointCard other = (GtPointCard)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

