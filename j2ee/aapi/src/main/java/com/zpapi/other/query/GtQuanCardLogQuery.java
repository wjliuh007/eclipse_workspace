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


public class GtQuanCardLogQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 主键ID 自增 */
	private java.lang.Integer id;
	/** 优惠券类型  0返券卡；1满减卡；2礼品卡 */
	private java.lang.Boolean cardType;
	/** 用户ID */
	private java.lang.Long memberId;
	/** 0是减少 1是增加 */
	private java.lang.Boolean tradeType;
	/** 本次操作涉及数额 */
	private Long money;
	/** 本次变化后的抵用点账户余额 */
	private Long historyTotalMoney;
	/** 交易备注 */
	private java.lang.String tradeRemark;
	/** 订单编号 */
	private java.lang.Long orderSn;
	/** 交易时间 */
	private java.lang.Integer tradeTime;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Boolean getCardType() {
		return this.cardType;
	}
	
	public void setCardType(java.lang.Boolean value) {
		this.cardType = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Boolean getTradeType() {
		return this.tradeType;
	}
	
	public void setTradeType(java.lang.Boolean value) {
		this.tradeType = value;
	}
	
	public Long getMoney() {
		return this.money;
	}
	
	public void setMoney(Long value) {
		this.money = value;
	}
	
	public Long getHistoryTotalMoney() {
		return this.historyTotalMoney;
	}
	
	public void setHistoryTotalMoney(Long value) {
		this.historyTotalMoney = value;
	}
	
	public java.lang.String getTradeRemark() {
		return this.tradeRemark;
	}
	
	public void setTradeRemark(java.lang.String value) {
		this.tradeRemark = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Integer getTradeTime() {
		return this.tradeTime;
	}
	
	public void setTradeTime(java.lang.Integer value) {
		this.tradeTime = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

