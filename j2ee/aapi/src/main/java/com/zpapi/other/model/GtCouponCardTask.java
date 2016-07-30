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
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtCouponCardTask extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtCouponCardTask";
	public static final String ALIAS_TASK_ID = "taskId";
	public static final String ALIAS_TYPE = "1=>充值卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡";
	public static final String ALIAS_IS_CHECK = "是否检查通用或批次属性:0=>不检查 1=>检查";
	public static final String ALIAS_TIMES_NUM = "批次";
	public static final String ALIAS_CATEGORY_ID = "品类卡分类id";
	public static final String ALIAS_CARD_PRE = "卡号前缀";
	public static final String ALIAS_USE_CONDITION = "满减卡使用条件";
	public static final String ALIAS_MONEY = "卡面面额或者折扣";
	public static final String ALIAS_START_DATE = "startDate";
	public static final String ALIAS_DUE_DATE = "dueDate";
	public static final String ALIAS_NUMS = "数量";
	public static final String ALIAS_CREATE_USER_ID = "createUserId";
	public static final String ALIAS_STATUS = "0=>待审核,1=>待生产，2=>已生成，3=>审核不通过，4=>取消，5=>生成失败";
	public static final String ALIAS_CARD_STATUS = "品类卡类型";
	public static final String ALIAS_USE_OBJECT = "使用对象";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_CHECK_USER_ID = "审核人";
	public static final String ALIAS_CHANNEL_ID = "渠道商ID";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_EFFECTIVE_TIME = "生效时间";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * taskId       db_column: task_id 
     */	
	
	private java.lang.Integer taskId;
    /**
     * 1=>充值卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡       db_column: type 
     */	
	
	private java.lang.Integer type;
    /**
     * 是否检查通用或批次属性:0=>不检查 1=>检查       db_column: is_check 
     */	
	
	private java.lang.Boolean isCheck;
    /**
     * 批次       db_column: times_num 
     */	
	
	private java.lang.Integer timesNum;
    /**
     * 品类卡分类id       db_column: category_id 
     */	
	@NotNull 
	private java.lang.Integer categoryId;
    /**
     * 卡号前缀       db_column: card_pre 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String cardPre;
    /**
     * 满减卡使用条件       db_column: use_condition 
     */	
	
	private Long useCondition;
    /**
     * 卡面面额或者折扣       db_column: money 
     */	
	
	private Long money;
    /**
     * startDate       db_column: start_date 
     */	
	
	private java.lang.Integer startDate;
    /**
     * dueDate       db_column: due_date 
     */	
	
	private java.lang.Integer dueDate;
    /**
     * 数量       db_column: nums 
     */	
	
	private java.lang.Integer nums;
    /**
     * createUserId       db_column: create_user_id 
     */	
	
	private java.lang.Integer createUserId;
    /**
     * 0=>待审核,1=>待生产，2=>已生成，3=>审核不通过，4=>取消，5=>生成失败       db_column: status 
     */	
	
	private java.lang.Integer status;
    /**
     * 品类卡类型       db_column: card_status 
     */	
	@NotNull @Max(127)
	private Integer cardStatus;
    /**
     * 使用对象       db_column: use_object 
     */	
	@Length(max=255)
	private java.lang.String useObject;
    /**
     * email       db_column: email 
     */	
	@NotBlank @Email @Length(max=100)
	private java.lang.String email;
    /**
     * 审核人       db_column: check_user_id 
     */	
	@NotNull 
	private java.lang.Integer checkUserId;
    /**
     * 渠道商ID       db_column: channel_id 
     */	
	
	private java.lang.Integer channelId;
    /**
     * createTime       db_column: create_time 
     */	
	
	private java.lang.Integer createTime;
    /**
     * 生效时间       db_column: effective_time 
     */	
	@NotNull 
	private java.lang.Integer effectiveTime;
	
	private java.lang.String channelUser;
	
	private Integer scope;
	
	private Integer brandId;
	private Integer cardType;
	
	private String cardNum;
	
	private String title;
	private String useConditionDetail;
	private String useRangeDetail;
	private Integer validityPeriodType;
	private Integer validTime;
	
	
	
	//columns END

	public GtCouponCardTask(){
	}

	public GtCouponCardTask(
		java.lang.Integer taskId
	){
		this.taskId = taskId;
	}

	public void setTaskId(java.lang.Integer value) {
		this.taskId = value;
	}
	
	public java.lang.Integer getTaskId() {
		return this.taskId;
	}
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getType() {
		return this.type;
	}
	public void setIsCheck(java.lang.Boolean value) {
		this.isCheck = value;
	}
	
	public java.lang.Boolean getIsCheck() {
		return this.isCheck;
	}
	public void setTimesNum(java.lang.Integer value) {
		this.timesNum = value;
	}
	
	public java.lang.Integer getTimesNum() {
		return this.timesNum;
	}
	public void setCategoryId(java.lang.Integer value) {
		this.categoryId = value;
	}
	
	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}
	public void setCardPre(java.lang.String value) {
		this.cardPre = value;
	}
	
	public java.lang.String getCardPre() {
		return this.cardPre;
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
	public void setNums(java.lang.Integer value) {
		this.nums = value;
	}
	
	public java.lang.Integer getNums() {
		return this.nums;
	}
	public void setCreateUserId(java.lang.Integer value) {
		this.createUserId = value;
	}
	
	public java.lang.Integer getCreateUserId() {
		return this.createUserId;
	}
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	public java.lang.Integer getStatus() {
		return this.status;
	}
	public void setCardStatus(Integer value) {
		this.cardStatus = value;
	}
	
	public Integer getCardStatus() {
		return this.cardStatus;
	}
	public void setUseObject(java.lang.String value) {
		this.useObject = value;
	}
	
	public java.lang.String getUseObject() {
		return this.useObject;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setCheckUserId(java.lang.Integer value) {
		this.checkUserId = value;
	}
	
	public java.lang.Integer getCheckUserId() {
		return this.checkUserId;
	}
	public void setChannelId(java.lang.Integer value) {
		this.channelId = value;
	}
	
	public java.lang.Integer getChannelId() {
		return this.channelId;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	public void setEffectiveTime(java.lang.Integer value) {
		this.effectiveTime = value;
	}
	
	public java.lang.Integer getEffectiveTime() {
		return this.effectiveTime;
	}

	
	
	public java.lang.String getChannelUser() {
		return channelUser;
	}

	public void setChannelUser(java.lang.String channelUser) {
		this.channelUser = channelUser;
	}

	public Integer getScope() {
		return scope;
	}

	public void setScope(Integer scope) {
		this.scope = scope;
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
			.append("TaskId",getTaskId())
			.append("Type",getType())
			.append("IsCheck",getIsCheck())
			.append("TimesNum",getTimesNum())
			.append("CategoryId",getCategoryId())
			.append("CardPre",getCardPre())
			.append("UseCondition",getUseCondition())
			.append("Money",getMoney())
			.append("StartDate",getStartDate())
			.append("DueDate",getDueDate())
			.append("Nums",getNums())
			.append("CreateUserId",getCreateUserId())
			.append("Status",getStatus())
			.append("CardStatus",getCardStatus())
			.append("UseObject",getUseObject())
			.append("Email",getEmail())
			.append("CheckUserId",getCheckUserId())
			.append("ChannelId",getChannelId())
			.append("CreateTime",getCreateTime())
			.append("EffectiveTime",getEffectiveTime())
			.append("ChannelUser",getChannelUser())
			.append("Scope",getScope())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getTaskId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtCouponCardTask == false) return false;
		if(this == obj) return true;
		GtCouponCardTask other = (GtCouponCardTask)obj;
		return new EqualsBuilder()
			.append(getTaskId(),other.getTaskId())
			.isEquals();
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUseConditionDetail() {
		return useConditionDetail;
	}

	public void setUseConditionDetail(String useConditionDetail) {
		this.useConditionDetail = useConditionDetail;
	}

	public String getUseRangeDetail() {
		return useRangeDetail;
	}

	public void setUseRangeDetail(String useRangeDetail) {
		this.useRangeDetail = useRangeDetail;
	}

	public Integer getValidityPeriodType() {
		return validityPeriodType;
	}

	public void setValidityPeriodType(Integer validityPeriodType) {
		this.validityPeriodType = validityPeriodType;
	}

	public Integer getValidTime() {
		return validTime;
	}

	public void setValidTime(Integer validTime) {
		this.validTime = validTime;
	}
}

