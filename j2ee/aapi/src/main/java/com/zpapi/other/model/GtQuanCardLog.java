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


public class GtQuanCardLog extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtQuanCardLog";
	public static final String ALIAS_ID = "主键ID 自增";
	public static final String ALIAS_CARD_TYPE = "优惠券类型  0返券卡；1满减卡；2礼品卡";
	public static final String ALIAS_MEMBER_ID = "用户ID";
	public static final String ALIAS_TRADE_TYPE = "0是减少 1是增加";
	public static final String ALIAS_MONEY = "本次操作涉及数额";
	public static final String ALIAS_HISTORY_TOTAL_MONEY = "本次变化后的抵用点账户余额";
	public static final String ALIAS_TRADE_REMARK = "交易备注";
	public static final String ALIAS_ORDER_SN = "订单编号";
	public static final String ALIAS_TRADE_TIME = "交易时间";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 主键ID 自增       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 优惠券类型  0返券卡；1满减卡；2礼品卡       db_column: card_type 
     */	
	@NotNull 
	private java.lang.String cardType;
    /**
     * 用户ID       db_column: member_id 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 0是减少 1是增加       db_column: trade_type 
     */	
	@NotNull 
	private java.lang.Boolean tradeType;
    /**
     * 本次操作涉及数额       db_column: money 
     */	
	@NotNull 
	private Long money;
    /**
     * 本次变化后的抵用点账户余额       db_column: history_total_money 
     */	
	
	private Long historyTotalMoney;
    /**
     * 交易备注       db_column: trade_remark 
     */	
	@Length(max=200)
	private java.lang.String tradeRemark;
    /**
     * 订单编号       db_column: order_sn 
     */	
	
	private java.lang.Long orderSn;
    /**
     * 交易时间       db_column: trade_time 
     */	
	@NotNull 
	private java.lang.Integer tradeTime;
	//columns END

	public GtQuanCardLog(){
	}

	public GtQuanCardLog(
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
	public void setCardType(java.lang.String value) {
		this.cardType = value;
	}
	
	public java.lang.String getCardType() {
		return this.cardType;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setTradeType(java.lang.Boolean value) {
		this.tradeType = value;
	}
	
	public java.lang.Boolean getTradeType() {
		return this.tradeType;
	}
	public void setMoney(Long value) {
		this.money = value;
	}
	
	public Long getMoney() {
		return this.money;
	}
	public void setHistoryTotalMoney(Long value) {
		this.historyTotalMoney = value;
	}
	
	public Long getHistoryTotalMoney() {
		return this.historyTotalMoney;
	}
	public void setTradeRemark(java.lang.String value) {
		this.tradeRemark = value;
	}
	
	public java.lang.String getTradeRemark() {
		return this.tradeRemark;
	}
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	public void setTradeTime(java.lang.Integer value) {
		this.tradeTime = value;
	}
	
	public java.lang.Integer getTradeTime() {
		return this.tradeTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("CardType",getCardType())
			.append("MemberId",getMemberId())
			.append("TradeType",getTradeType())
			.append("Money",getMoney())
			.append("HistoryTotalMoney",getHistoryTotalMoney())
			.append("TradeRemark",getTradeRemark())
			.append("OrderSn",getOrderSn())
			.append("TradeTime",getTradeTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtQuanCardLog == false) return false;
		if(this == obj) return true;
		GtQuanCardLog other = (GtQuanCardLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

