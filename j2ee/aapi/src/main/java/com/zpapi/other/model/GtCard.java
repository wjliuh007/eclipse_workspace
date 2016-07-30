/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;

import javax.validation.constraints.Max;
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


public class GtCard extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtCard";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_CARD_BATCH_ID = "卡批次ID";
	public static final String ALIAS_TYPE = "卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡)";
	public static final String ALIAS_CARD_NUMBER = "卡号";
	public static final String ALIAS_AMOUNT = "金额(元)";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_STATUS = "状态(1:正常2:冻结3:作废)";
	public static final String ALIAS_CREATE_TIME = "卡生成时间";
	public static final String ALIAS_ACTIVE_TIME = "激活时间";
	public static final String ALIAS_ACTIVE_MEMBER_ID = "激活人id";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 卡批次ID       db_column: card_batch_id 
     */	
	@NotNull 
	private java.lang.Integer cardBatchId;
    /**
     * 卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡)       db_column: type 
     */	
	@NotNull @Max(127)
	private Integer type;
    /**
     * 卡号       db_column: card_number 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String cardNumber;
    /**
     * 金额(元)       db_column: amount 
     */	
	@NotNull 
	private double amount;
    /**
     * 开始时间       db_column: start_time 
     */	
	@NotNull 
	private java.lang.Integer startTime;
    /**
     * 结束时间       db_column: end_time 
     */	
	@NotNull 
	private java.lang.Integer endTime;
    /**
     * 状态(1:正常2:冻结3:作废)       db_column: status 
     */	
	@NotNull @Max(127)
	private Integer status;
    /**
     * 卡生成时间       db_column: create_time 
     */	
	@NotNull 
	private java.lang.Integer createTime;
    /**
     * 激活时间       db_column: active_time 
     */	
	@NotNull 
	private java.lang.Integer activeTime;
    /**
     * 激活人id       db_column: active_member_id 
     */	
	@NotNull 
	private java.lang.Integer activeMemberId;
	//columns END

	public GtCard(){
	}

	public GtCard(
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
	public void setCardBatchId(java.lang.Integer value) {
		this.cardBatchId = value;
	}
	
	public java.lang.Integer getCardBatchId() {
		return this.cardBatchId;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setCardNumber(java.lang.String value) {
		this.cardNumber = value;
	}
	
	public java.lang.String getCardNumber() {
		return this.cardNumber;
	}
	public void setAmount(double value) {
		this.amount = value;
	}
	
	public double getAmount() {
		return this.amount;
	}
	public void setStartTime(java.lang.Integer value) {
		this.startTime = value;
	}
	
	public java.lang.Integer getStartTime() {
		return this.startTime;
	}
	public void setEndTime(java.lang.Integer value) {
		this.endTime = value;
	}
	
	public java.lang.Integer getEndTime() {
		return this.endTime;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	public void setActiveTime(java.lang.Integer value) {
		this.activeTime = value;
	}
	
	public java.lang.Integer getActiveTime() {
		return this.activeTime;
	}
	public void setActiveMemberId(java.lang.Integer value) {
		this.activeMemberId = value;
	}
	
	public java.lang.Integer getActiveMemberId() {
		return this.activeMemberId;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("CardBatchId",getCardBatchId())
			.append("Type",getType())
			.append("CardNumber",getCardNumber())
			.append("Amount",getAmount())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("Status",getStatus())
			.append("CreateTime",getCreateTime())
			.append("ActiveTime",getActiveTime())
			.append("ActiveMemberId",getActiveMemberId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtCard == false) return false;
		if(this == obj) return true;
		GtCard other = (GtCard)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

