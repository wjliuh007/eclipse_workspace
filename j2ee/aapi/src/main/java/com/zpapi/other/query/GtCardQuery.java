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


public class GtCardQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 卡批次ID */
	private java.lang.Integer cardBatchId;
	/** 卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡) */
	private Integer type;
	/** 卡号 */
	private java.lang.String cardNumber;
	/** 金额(元) */
	private Long amount;
	/** 开始时间 */
	private java.lang.Integer startTime;
	/** 结束时间 */
	private java.lang.Integer endTime;
	/** 状态(1:正常2:冻结3:作废) */
	private Integer status;
	/** 卡生成时间 */
	private java.lang.Integer createTime;
	/** 激活时间 */
	private java.lang.Integer activeTime;
	/** 激活人id */
	private java.lang.Integer activeMemberId;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getCardBatchId() {
		return this.cardBatchId;
	}
	
	public void setCardBatchId(java.lang.Integer value) {
		this.cardBatchId = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	
	public void setType(Integer value) {
		this.type = value;
	}
	
	public java.lang.String getCardNumber() {
		return this.cardNumber;
	}
	
	public void setCardNumber(java.lang.String value) {
		this.cardNumber = value;
	}
	
	public Long getAmount() {
		return this.amount;
	}
	
	public void setAmount(Long value) {
		this.amount = value;
	}
	
	public java.lang.Integer getStartTime() {
		return this.startTime;
	}
	
	public void setStartTime(java.lang.Integer value) {
		this.startTime = value;
	}
	
	public java.lang.Integer getEndTime() {
		return this.endTime;
	}
	
	public void setEndTime(java.lang.Integer value) {
		this.endTime = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getActiveTime() {
		return this.activeTime;
	}
	
	public void setActiveTime(java.lang.Integer value) {
		this.activeTime = value;
	}
	
	public java.lang.Integer getActiveMemberId() {
		return this.activeMemberId;
	}
	
	public void setActiveMemberId(java.lang.Integer value) {
		this.activeMemberId = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

