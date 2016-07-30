/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.model;

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


public class GtMemberScoreTrade extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtMemberScoreTrade";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MEMBER_ID = "memberId";
	public static final String ALIAS_TRADE_TYPE = "1是账户收入 0是账户支出";
	public static final String ALIAS_SCORE_TYPE = "积分类型";
	public static final String ALIAS_TRADE_SCORE = "tradeScore";
	public static final String ALIAS_HISTORY_TOTAL_SCORE = "historyTotalScore";
	public static final String ALIAS_TRADE_METHOD = "交易方式";
	public static final String ALIAS_ORDER_SN = "orderSn";
	public static final String ALIAS_TRADE_TIME = "tradeTime";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * memberId       db_column: member_id 
     */	
	
	private java.lang.Long memberId;
    /**
     * 1是账户收入 0是账户支出       db_column: trade_type 
     */	
	
	private java.lang.Boolean tradeType;
    /**
     * 积分类型       db_column: score_type 
     */	
	@Length(max=30)
	private java.lang.String scoreType;
    /**
     * tradeScore       db_column: trade_score 
     */	
	
	private Long tradeScore;
    /**
     * historyTotalScore       db_column: history_total_score 
     */	
	
	private Long historyTotalScore;
    /**
     * 交易方式       db_column: trade_method 
     */	
	@Length(max=200)
	private java.lang.String tradeMethod;
    /**
     * orderSn       db_column: order_sn 
     */	
	
	private java.lang.Long orderSn;
    /**
     * tradeTime       db_column: trade_time 
     */	
	
	private java.lang.Integer tradeTime;
	//columns END

	public GtMemberScoreTrade(){
	}

	public GtMemberScoreTrade(
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
	public void setScoreType(java.lang.String value) {
		this.scoreType = value;
	}
	
	public java.lang.String getScoreType() {
		return this.scoreType;
	}
	public void setTradeScore(Long value) {
		this.tradeScore = value;
	}
	
	public Long getTradeScore() {
		return this.tradeScore;
	}
	public void setHistoryTotalScore(Long value) {
		this.historyTotalScore = value;
	}
	
	public Long getHistoryTotalScore() {
		return this.historyTotalScore;
	}
	public void setTradeMethod(java.lang.String value) {
		this.tradeMethod = value;
	}
	
	public java.lang.String getTradeMethod() {
		return this.tradeMethod;
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
			.append("MemberId",getMemberId())
			.append("TradeType",getTradeType())
			.append("ScoreType",getScoreType())
			.append("TradeScore",getTradeScore())
			.append("HistoryTotalScore",getHistoryTotalScore())
			.append("TradeMethod",getTradeMethod())
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
		if(obj instanceof GtMemberScoreTrade == false) return false;
		if(this == obj) return true;
		GtMemberScoreTrade other = (GtMemberScoreTrade)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

