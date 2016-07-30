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


public class GtDiscountCardQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 所属任务id */
	private java.lang.Integer taskId;
	/** cardNum */
	private java.lang.String cardNum;
	/** 品类ID */
	private java.lang.Integer categoryId;
	/** 使用条件 */
	private Long useCondition;
	/** 减免值 */
	private Long money;
	/** 开始时间 */
	private java.lang.Integer startDate;
	/** dueDate */
	private java.lang.Integer dueDate;
	/** 0=>未激活 1=》激活 */
	private java.lang.Boolean status;
	/** 卡片类型：1，一次性码；2，通用码 */
	private java.lang.Boolean cardStatus;
	/** 使用的时间 */
	private java.lang.Integer activeDate;
	/** 激活人ID */
	private java.lang.Long activeMemberId;
	/** 生成时间 */
	private java.lang.Integer createTime;
	/** 是否发送给用户0，未发送，1已发送 */
	private Integer isSended;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(java.lang.Integer value) {
		this.taskId = value;
	}
	
	public java.lang.String getCardNum() {
		return this.cardNum;
	}
	
	public void setCardNum(java.lang.String value) {
		this.cardNum = value;
	}
	
	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(java.lang.Integer value) {
		this.categoryId = value;
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
	
	public java.lang.Boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(java.lang.Boolean value) {
		this.status = value;
	}
	
	public java.lang.Boolean getCardStatus() {
		return this.cardStatus;
	}
	
	public void setCardStatus(java.lang.Boolean value) {
		this.cardStatus = value;
	}
	
	public java.lang.Integer getActiveDate() {
		return this.activeDate;
	}
	
	public void setActiveDate(java.lang.Integer value) {
		this.activeDate = value;
	}
	
	public java.lang.Long getActiveMemberId() {
		return this.activeMemberId;
	}
	
	public void setActiveMemberId(java.lang.Long value) {
		this.activeMemberId = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public Integer getIsSended() {
		return this.isSended;
	}
	
	public void setIsSended(Integer value) {
		this.isSended = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

