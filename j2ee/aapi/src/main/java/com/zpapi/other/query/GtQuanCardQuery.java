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


public class GtQuanCardQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 卡编号 */
	private java.lang.Long id;
	/** memberId */
	private java.lang.Long memberId;
	/** 卡号 */
	private java.lang.String cardNum;
	/** 返券类型1:签收送返券，2：邀请好友送返券，3：积分兑换返券 */
	private java.lang.Integer type;
	/** 卡类型：0返券卡；1满减卡；2礼品卡 */
	private java.lang.Integer cardType;
	/** 类别;0,未使用,1,已使用,2,已过期,3已失效 */
	private java.lang.Integer status;
	/** starttime */
	private java.lang.Integer starttime;
	/** endtime */
	private java.lang.Integer endtime;
	/** 面值 */
	private java.lang.Integer price;
	/** 所需消费金额 */
	private java.lang.Integer leastamount;
	/** 关联的订单 */
	private java.lang.Long orderSn;
	/** 返券来源订单号 */
	private java.lang.Long sourceOrderSn;
	/** createTime */
	private java.lang.Integer createTime;
	/** 使用时间 */
	private java.lang.Integer useTime;
	/** 使用范围 */
	private java.lang.String useRange;
	/** 是否激活：0-未激活 1-已激活 */
	private java.lang.Integer isActive;

	public java.lang.Long getId() {
		return this.id;
	}
	
	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.String getCardNum() {
		return this.cardNum;
	}
	
	public void setCardNum(java.lang.String value) {
		this.cardNum = value;
	}
	
	public java.lang.Integer getType() {
		return this.type;
	}
	
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getCardType() {
		return this.cardType;
	}
	
	public void setCardType(java.lang.Integer value) {
		this.cardType = value;
	}
	
	public java.lang.Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	public java.lang.Integer getStarttime() {
		return this.starttime;
	}
	
	public void setStarttime(java.lang.Integer value) {
		this.starttime = value;
	}
	
	public java.lang.Integer getEndtime() {
		return this.endtime;
	}
	
	public void setEndtime(java.lang.Integer value) {
		this.endtime = value;
	}
	
	public java.lang.Integer getPrice() {
		return this.price;
	}
	
	public void setPrice(java.lang.Integer value) {
		this.price = value;
	}
	
	public java.lang.Integer getLeastamount() {
		return this.leastamount;
	}
	
	public void setLeastamount(java.lang.Integer value) {
		this.leastamount = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getSourceOrderSn() {
		return this.sourceOrderSn;
	}
	
	public void setSourceOrderSn(java.lang.Long value) {
		this.sourceOrderSn = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getUseTime() {
		return this.useTime;
	}
	
	public void setUseTime(java.lang.Integer value) {
		this.useTime = value;
	}
	
	public java.lang.String getUseRange() {
		return this.useRange;
	}
	
	public void setUseRange(java.lang.String value) {
		this.useRange = value;
	}
	
	public java.lang.Integer getIsActive() {
		return this.isActive;
	}
	
	public void setIsActive(java.lang.Integer value) {
		this.isActive = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

