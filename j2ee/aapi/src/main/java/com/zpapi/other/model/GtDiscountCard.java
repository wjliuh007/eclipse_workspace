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
import org.hibernate.validator.constraints.Length;

import com.zhen.commons.base.BaseEntity;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtDiscountCard extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtDiscountCard";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TASK_ID = "所属任务id";
	public static final String ALIAS_CARD_NUM = "cardNum";
	public static final String ALIAS_CATEGORY_ID = "品类ID";
	public static final String ALIAS_USE_CONDITION = "使用条件";
	public static final String ALIAS_MONEY = "减免值";
	public static final String ALIAS_START_DATE = "开始时间";
	public static final String ALIAS_DUE_DATE = "dueDate";
	public static final String ALIAS_STATUS = "0=>未激活 1=》激活";
	public static final String ALIAS_CARD_STATUS = "卡片类型：1，一次性码；2，通用码";
	public static final String ALIAS_ACTIVE_DATE = "使用的时间";
	public static final String ALIAS_ACTIVE_MEMBER_ID = "激活人ID";
	public static final String ALIAS_CREATE_TIME = "生成时间";
	public static final String ALIAS_IS_SENDED = "是否发送给用户0，未发送，1已发送";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 所属任务id       db_column: task_id 
     */	
	@NotNull 
	private java.lang.Integer taskId;
    /**
     * cardNum       db_column: card_num 
     */	
	@Length(max=30)
	private java.lang.String cardNum;
    /**
     * 品类ID       db_column: category_id 
     */	
	@NotNull 
	private java.lang.Integer categoryId;
    /**
     * 使用条件       db_column: use_condition 
     */	
	@NotNull 
	private Long useCondition;
    /**
     * 减免值       db_column: money 
     */	
	
	private Long money;
    /**
     * 开始时间       db_column: start_date 
     */	
	@NotNull 
	private java.lang.Integer startDate;
    /**
     * dueDate       db_column: due_date 
     */	
	
	private java.lang.Integer dueDate;
    /**
     * 0=>未激活 1=》激活       db_column: status 
     */	
	
	private java.lang.Boolean status;
    /**
     * 卡片类型：1，一次性码；2，通用码       db_column: card_status 
     */	
	@NotNull 
	private java.lang.Integer cardStatus;
    /**
     * 使用的时间       db_column: active_date 
     */	
	
	private java.lang.Integer activeDate;
    /**
     * 激活人ID       db_column: active_member_id 
     */	
	@NotNull 
	private java.lang.Long activeMemberId;
    /**
     * 生成时间       db_column: create_time 
     */	
	@NotNull 
	private java.lang.Integer createTime;
    /**
     * 是否发送给用户0，未发送，1已发送       db_column: is_sended 
     */	
	@NotNull @Max(127)
	private Integer isSended;
	//columns END
	
	private Integer brandId;
	
	private Integer cardType;

	public GtDiscountCard(){
	}

	public GtDiscountCard(
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
	public void setTaskId(java.lang.Integer value) {
		this.taskId = value;
	}
	
	public java.lang.Integer getTaskId() {
		return this.taskId;
	}
	public void setCardNum(java.lang.String value) {
		this.cardNum = value;
	}
	
	public java.lang.String getCardNum() {
		return this.cardNum;
	}
	public void setCategoryId(java.lang.Integer value) {
		this.categoryId = value;
	}
	
	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}
	public void setUseCondition(Long value) {
		this.useCondition = value;
	}
	
	public Long getUseCondition() {
		return this.useCondition;
	}
	public void setMoney(Long value) {
		this.money = value;
	}
	
	public Long getMoney() {
		return this.money;
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
	public void setCardStatus(java.lang.Integer value) {
		this.cardStatus = value;
	}
	
	public java.lang.Integer getCardStatus() {
		return this.cardStatus;
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
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	public void setIsSended(Integer value) {
		this.isSended = value;
	}
	
	public Integer getIsSended() {
		return this.isSended;
	}
	
	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getCardType() {
		return cardType;
	}

	public void setCardType(Integer cardType) {
		this.cardType = cardType;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("TaskId",getTaskId())
			.append("CardNum",getCardNum())
			.append("CategoryId",getCategoryId())
			.append("UseCondition",getUseCondition())
			.append("Money",getMoney())
			.append("StartDate",getStartDate())
			.append("DueDate",getDueDate())
			.append("Status",getStatus())
			.append("CardStatus",getCardStatus())
			.append("ActiveDate",getActiveDate())
			.append("ActiveMemberId",getActiveMemberId())
			.append("CreateTime",getCreateTime())
			.append("IsSended",getIsSended())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtDiscountCard == false) return false;
		if(this == obj) return true;
		GtDiscountCard other = (GtDiscountCard)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

