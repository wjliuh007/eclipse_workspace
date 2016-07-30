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
import org.hibernate.validator.constraints.NotBlank;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtQuanCard extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtQuanCard";
	public static final String ALIAS_ID = "卡编号";
	public static final String ALIAS_MEMBER_ID = "memberId";
	public static final String ALIAS_CARD_NUM = "卡号";
	public static final String ALIAS_TYPE = "返券类型1:签收送返券，2：邀请好友送返券，3：积分兑换返券";
	public static final String ALIAS_CARD_TYPE = "卡类型：0返券卡；1满减卡；2礼品卡";
	public static final String ALIAS_STATUS = "类别;0,未使用,1,已使用,2,已过期,3已失效";
	public static final String ALIAS_STARTTIME = "starttime";
	public static final String ALIAS_ENDTIME = "endtime";
	public static final String ALIAS_PRICE = "面值";
	public static final String ALIAS_LEASTAMOUNT = "所需消费金额";
	public static final String ALIAS_ORDER_SN = "关联的订单";
	public static final String ALIAS_SOURCE_ORDER_SN = "返券来源订单号";
	public static final String ALIAS_CREATE_TIME = "createTime";
	public static final String ALIAS_USE_TIME = "使用时间";
	public static final String ALIAS_USE_RANGE = "使用范围";
	public static final String ALIAS_IS_ACTIVE = "是否激活：0-未激活 1-已激活";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 卡编号       db_column: id 
     */	
	
	private java.lang.Long id;
	  /**
     * 卡批次ID       db_column: card_batch_id 
     */	
	@NotNull 
	private java.lang.Integer cardBatchId;
    /**
     * memberId       db_column: member_id 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 卡号       db_column: card_num 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String cardNum;
    /**
     * 返券类型1:签收送返券，2：邀请好友送返券，3：积分兑换返券       db_column: type 
     */	
	
	private java.lang.Integer type;
    /**
     * 卡类型：0返券卡；1满减卡；2礼品卡       db_column: card_type 
     */	
	@NotNull 
	private java.lang.Integer cardType;
    /**
     * 类别;0,未使用,1,已使用,2,已过期,3已失效       db_column: status 
     */	
	@NotNull 
	private java.lang.Integer status;
    /**
     * starttime       db_column: starttime 
     */	
	
	private java.lang.Integer starttime;
    /**
     * endtime       db_column: endtime 
     */	
	
	private java.lang.Integer endtime;
    /**
     * 面值       db_column: price 
     */	
	@NotNull 
	private java.lang.Integer price;
    /**
     * 所需消费金额       db_column: leastamount 
     */	
	
	private java.lang.Integer leastamount;
    /**
     * 关联的订单       db_column: order_sn 
     */	
	
	private java.lang.Long orderSn;
    /**
     * 返券来源订单号       db_column: source_order_sn 
     */	
	
	private java.lang.Long sourceOrderSn;
    /**
     * createTime       db_column: create_time 
     */	
	@NotNull 
	private java.lang.Integer createTime;
    /**
     * 使用时间       db_column: use_time 
     */	
	
	private java.lang.Integer useTime;
    /**
     * 使用范围       db_column: use_range 
     */	
	@Length(max=50)
	private java.lang.String useRange;
    /**
     * 是否激活：0-未激活 1-已激活       db_column: is_active 
     */	
	@NotNull 
	private java.lang.Integer isActive;
	//columns END
	
	private String title;
	private String useConditionDetail;
	private String useRangeDetail;
	private Integer validityPeriodType;
	private Integer validTime;

	public GtQuanCard(){
	}

	public GtQuanCard(
		java.lang.Long id
	){
		this.id = id;
	}

	public void setId(java.lang.Long value) {
		this.id = value;
	}
	
	public java.lang.Long getId() {
		return this.id;
	}
	
	public java.lang.Integer getCardBatchId() {
		return cardBatchId;
	}

	public void setCardBatchId(java.lang.Integer cardBatchId) {
		this.cardBatchId = cardBatchId;
	}

	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setCardNum(java.lang.String value) {
		this.cardNum = value;
	}
	
	public java.lang.String getCardNum() {
		return this.cardNum;
	}
	public void setType(java.lang.Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getType() {
		return this.type;
	}
	public void setCardType(java.lang.Integer value) {
		this.cardType = value;
	}
	
	public java.lang.Integer getCardType() {
		return this.cardType;
	}
	public void setStatus(java.lang.Integer value) {
		this.status = value;
	}
	
	public java.lang.Integer getStatus() {
		return this.status;
	}
	public void setStarttime(java.lang.Integer value) {
		this.starttime = value;
	}
	
	public java.lang.Integer getStarttime() {
		return this.starttime;
	}
	public void setEndtime(java.lang.Integer value) {
		this.endtime = value;
	}
	
	public java.lang.Integer getEndtime() {
		return this.endtime;
	}
	public void setPrice(java.lang.Integer value) {
		this.price = value;
	}
	
	public java.lang.Integer getPrice() {
		return this.price;
	}
	public void setLeastamount(java.lang.Integer value) {
		this.leastamount = value;
	}
	
	public java.lang.Integer getLeastamount() {
		return this.leastamount;
	}
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	public void setSourceOrderSn(java.lang.Long value) {
		this.sourceOrderSn = value;
	}
	
	public java.lang.Long getSourceOrderSn() {
		return this.sourceOrderSn;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	public void setUseTime(java.lang.Integer value) {
		this.useTime = value;
	}
	
	public java.lang.Integer getUseTime() {
		return this.useTime;
	}
	public void setUseRange(java.lang.String value) {
		this.useRange = value;
	}
	
	public java.lang.String getUseRange() {
		return this.useRange;
	}
	public void setIsActive(java.lang.Integer value) {
		this.isActive = value;
	}
	
	public java.lang.Integer getIsActive() {
		return this.isActive;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("CardBatchId",getCardBatchId())
			.append("MemberId",getMemberId())
			.append("CardNum",getCardNum())
			.append("Type",getType())
			.append("CardType",getCardType())
			.append("Status",getStatus())
			.append("Starttime",getStarttime())
			.append("Endtime",getEndtime())
			.append("Price",getPrice())
			.append("Leastamount",getLeastamount())
			.append("OrderSn",getOrderSn())
			.append("SourceOrderSn",getSourceOrderSn())
			.append("CreateTime",getCreateTime())
			.append("UseTime",getUseTime())
			.append("UseRange",getUseRange())
			.append("IsActive",getIsActive())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtQuanCard == false) return false;
		if(this == obj) return true;
		GtQuanCard other = (GtQuanCard)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUseConditionDetail() {
		return useConditionDetail;
	}

	public void setUseConditionDetail(String useConditionDetail) {
		this.useConditionDetail = useConditionDetail;
	}

	public String getUseRangeDetail() {
		return useRangeDetail;
	}

	public void setUseRangeDetail(String useRangeDetail) {
		this.useRangeDetail = useRangeDetail;
	}

	public Integer getValidityPeriodType() {
		return validityPeriodType;
	}

	public void setValidityPeriodType(Integer validityPeriodType) {
		this.validityPeriodType = validityPeriodType;
	}

	public Integer getValidTime() {
		return validTime;
	}

	public void setValidTime(Integer validTime) {
		this.validTime = validTime;
	}
}

