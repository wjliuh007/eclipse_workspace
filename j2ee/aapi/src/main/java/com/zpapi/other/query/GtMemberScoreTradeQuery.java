/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;

import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtMemberScoreTradeQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** memberId */
	private java.lang.Long memberId;
	/** 1是账户收入 0是账户支出 */
	private java.lang.Boolean tradeType;
	/** 积分类型 */
	private java.lang.String scoreType;
	/** tradeScore */
	private Long tradeScore;
	/** historyTotalScore */
	private Long historyTotalScore;
	/** 交易方式 */
	private java.lang.String tradeMethod;
	/** orderSn */
	private java.lang.Long orderSn;
	/** tradeTime */
	private java.lang.Integer tradeTime;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
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
	
	public java.lang.String getScoreType() {
		return this.scoreType;
	}
	
	public void setScoreType(java.lang.String value) {
		this.scoreType = value;
	}
	
	public Long getTradeScore() {
		return this.tradeScore;
	}
	
	public void setTradeScore(Long value) {
		this.tradeScore = value;
	}
	
	public Long getHistoryTotalScore() {
		return this.historyTotalScore;
	}
	
	public void setHistoryTotalScore(Long value) {
		this.historyTotalScore = value;
	}
	
	public java.lang.String getTradeMethod() {
		return this.tradeMethod;
	}
	
	public void setTradeMethod(java.lang.String value) {
		this.tradeMethod = value;
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

