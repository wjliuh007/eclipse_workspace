/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
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


public class GtCouponCardTaskQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** taskId */
	private java.lang.Integer taskId;
	/** 1=>充值卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡 */
	private java.lang.Boolean type;
	/** 是否检查通用或批次属性:0=>不检查 1=>检查 */
	private java.lang.Boolean isCheck;
	/** 批次 */
	private java.lang.Integer timesNum;
	/** 品类卡分类id */
	private java.lang.Integer categoryId;
	/** 卡号前缀 */
	private java.lang.String cardPre;
	/** 满减卡使用条件 */
	private Long useCondition;
	/** 卡面面额或者折扣 */
	private Long money;
	/** startDate */
	private java.lang.Integer startDate;
	/** dueDate */
	private java.lang.Integer dueDate;
	/** 数量 */
	private java.lang.Integer nums;
	/** createUserId */
	private java.lang.Integer createUserId;
	/** 0=>待审核,1=>待生产，2=>已生成，3=>审核不通过，4=>取消，5=>生成失败 */
	private java.lang.Integer status;
	/** 品类卡类型 */
	private Integer cardStatus;
	/** 使用对象 */
	private java.lang.String useObject;
	/** email */
	private java.lang.String email;
	/** 审核人 */
	private java.lang.Integer checkUserId;
	/** 渠道商ID */
	private java.lang.Integer channelId;
	/** createTime */
	private java.lang.Integer createTime;
	/** 生效时间 */
	private java.lang.Integer effectiveTime;

	public java.lang.Integer getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(java.lang.Integer value) {
		this.taskId = value;
	}
	
	public java.lang.Boolean getType() {
		return this.type;
	}
	
	public void setType(java.lang.Boolean value) {
		this.type = value;
	}
	
	public java.lang.Boolean getIsCheck() {
		return this.isCheck;
	}
	
	public void setIsCheck(java.lang.Boolean value) {
		this.isCheck = value;
	}
	
	public java.lang.Integer getTimesNum() {
		return this.timesNum;
	}
	
	public void setTimesNum(java.lang.Integer value) {
		this.timesNum = value;
	}
	
	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(java.lang.Integer value) {
		this.categoryId = value;
	}
	
	public java.lang.String getCardPre() {
		return this.cardPre;
	}
	
	public void setCardPre(java.lang.String value) {
		this.cardPre = value;
	}
	
	public Long getUseCondition() {
		return this.useCondition;
	}
	
	public void setUseCondition(Long value) {
		this.useCondition = value;
	}
	
	public Long getMoney() {
		return this.money;
	}
	
	public void setMoney(Long value) {
		this.money = value;
	}
	
	public java.lang.Integer getStartDate() {
		return this.startDate;
	}
	
	public void setStartDate(java.lang.Integer value) {
		this.startDate = value;
	}
	
	public java.lang.Integer getDueDate() {
		return this.dueDate;
	}
	
	public void setDueDate(java.lang.Integer value) {
		this.dueDate = value;
	}
	
	public java.lang.Integer getNums() {
		return this.nums;
	}
	
	public void setNums(java.lang.Integer value) {
		this.nums = value;
	}
	
	public java.lang.Integer getCreateUserId() {
		return this.createUserId;
	}
	
	public void setCreateUserId(java.lang.Integer value) {
		this.createUserId = value;
	}
	
	public java.lang.Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	public Integer getCardStatus() {
		return this.cardStatus;
	}
	
	public void setCardStatus(Integer value) {
		this.cardStatus = value;
	}
	
	public java.lang.String getUseObject() {
		return this.useObject;
	}
	
	public void setUseObject(java.lang.String value) {
		this.useObject = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.Integer getCheckUserId() {
		return this.checkUserId;
	}
	
	public void setCheckUserId(java.lang.Integer value) {
		this.checkUserId = value;
	}
	
	public java.lang.Integer getChannelId() {
		return this.channelId;
	}
	
	public void setChannelId(java.lang.Integer value) {
		this.channelId = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getEffectiveTime() {
		return this.effectiveTime;
	}
	
	public void setEffectiveTime(java.lang.Integer value) {
		this.effectiveTime = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

