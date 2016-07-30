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


public class GtPaymentLogQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 涉及的订单号 */
	private java.lang.Long orderSn;
	/** 用户ID */
	private java.lang.Long memberId;
	/** 支付类型 */
	private Integer payTypeId;
	/** 支付方式ID */
	private java.lang.Integer paymentId;
	/** 支付方式唯一标识代码 */
	private java.lang.String paycode;
	/** 在线支付时银行代码 */
	private java.lang.String bankCode;
	/** 支付金额 */
	private Long money;
	/** 支付完成前订单应付总额历史记录 */
	private Long historyNeedpay;
	/** 备注说明 */
	private java.lang.String memo;
	/** beginTime */
	private java.lang.Integer beginTime;
	/** endTime */
	private java.lang.Integer endTime;
	/** 支付状态 0-末完成  1-付支结束 */
	private Integer status;
	/** 支付订单号，传递给支付接口用 */
	private java.lang.Integer paySn;
	
	private java.lang.String paySerialNumber;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public Integer getPayTypeId() {
		return this.payTypeId;
	}
	
	public void setPayTypeId(Integer value) {
		this.payTypeId = value;
	}
	
	public java.lang.Integer getPaymentId() {
		return this.paymentId;
	}
	
	public void setPaymentId(java.lang.Integer value) {
		this.paymentId = value;
	}
	
	public java.lang.String getPaycode() {
		return this.paycode;
	}
	
	public void setPaycode(java.lang.String value) {
		this.paycode = value;
	}
	
	public java.lang.String getBankCode() {
		return this.bankCode;
	}
	
	public void setBankCode(java.lang.String value) {
		this.bankCode = value;
	}
	
	public Long getMoney() {
		return this.money;
	}
	
	public void setMoney(Long value) {
		this.money = value;
	}
	
	public Long getHistoryNeedpay() {
		return this.historyNeedpay;
	}
	
	public void setHistoryNeedpay(Long value) {
		this.historyNeedpay = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.Integer getBeginTime() {
		return this.beginTime;
	}
	
	public void setBeginTime(java.lang.Integer value) {
		this.beginTime = value;
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
	
	public java.lang.Integer getPaySn() {
		return this.paySn;
	}
	
	public void setPaySn(java.lang.Integer value) {
		this.paySn = value;
	}
	
	public java.lang.String getPaySerialNumber() {
		return paySerialNumber;
	}

	public void setPaySerialNumber(java.lang.String paySerialNumber) {
		this.paySerialNumber = paySerialNumber;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

