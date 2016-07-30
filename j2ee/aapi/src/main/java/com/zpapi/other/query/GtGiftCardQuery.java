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


public class GtGiftCardQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Long id;
	/** 卡号 */
	private java.lang.String cardNum;
	/** 充值额度 */
	private java.lang.Integer point;
	/** 开始时间 */
	private java.lang.Integer startDate;
	/** 过期时间 */
	private java.lang.Integer dueDate;
	/** 0=》未激活，1=》激活 */
	private java.lang.Boolean status;
	/** 创建时间 */
	private java.lang.Integer createTime;
	/** 激活日期 */
	private java.lang.Integer activeDate;
	/** 激活人id */
	private java.lang.Long activeMemberId;
	/** 关联任务ID */
	private java.lang.Integer taskId;
	/** 流水号 */
	private java.lang.Integer serialNumber;

	public java.lang.Long getId() {
		return this.id;
	}
	
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.String getCardNum() {
		return this.cardNum;
	}
	
	public void setCardNum(java.lang.String value) {
		this.cardNum = value;
	}
	
	public java.lang.Integer getPoint() {
		return this.point;
	}
	
	public void setPoint(java.lang.Integer value) {
		this.point = value;
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
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
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
	
	public java.lang.Integer getTaskId() {
		return this.taskId;
	}
	
	public void setTaskId(java.lang.Integer value) {
		this.taskId = value;
	}
	
	public java.lang.Integer getSerialNumber() {
		return this.serialNumber;
	}
	
	public void setSerialNumber(java.lang.Integer value) {
		this.serialNumber = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

