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


public class GtCardBatchQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 批次号 */
	private java.lang.Long batch;
	/** 卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡) */
	private Integer type;
	/** 生成数量 */
	private java.lang.Integer number;
	/** 卡前缀 */
	private java.lang.String cardPrefix;
	/** 金额(折扣) */
	private Long amount;
	/** 开始时间 */
	private java.lang.Integer startTime;
	/** 结束时间 */
	private java.lang.Integer endTime;
	/** 备注 */
	private java.lang.String remark;
	/** 使用规则文案 */
	private java.lang.String ruleText;
	/** 状态(1:待审核2:审核通过3:审核不通过4:已生成) */
	private Integer status;
	/** 是否使用满减卡 */
	private Integer isConditionReduction;
	/** 是否使用打折卡 */
	private Integer isDiscount;
	/** 是否使用礼品卡 */
	private Integer isGiftCard;
	/** 是否使用返券 */
	private Integer isReturnCoupon;
	/** 是否通用(1:通用0:一次性) */
	private Integer isGeneral;
	/** 是否允许此商品参与(1:参与0:不能参与) 默认为1 */
	private Integer isInclude;
	/** æ˜¯å¦èµ é€ç§¯åˆ† */
	private Integer isSendScore;
	/** 供应商类型(1:自营商品2:代销商品3:订购商品） */
	private Integer supplierType;
	/** 条件(例如满多少减多少,0不限制) */
	private java.lang.Integer useCondition;
	/** 渠道ID */
	private java.lang.Integer partnerId;
	/** 同一批次是否累加使用 */
	private Integer isBatchAccumulation;
	/** 申请人id */
	private java.lang.Integer applyUsersId;
	/** 申请时间 */
	private java.lang.Integer applyTime;
	/** 审核人id */
	private java.lang.Integer reviewUsersId;
	/** 审核时间 */
	private java.lang.Integer reviewTime;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Long getBatch() {
		return this.batch;
	}
	
	public void setBatch(java.lang.Long value) {
		this.batch = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	
	public void setType(Integer value) {
		this.type = value;
	}
	
	public java.lang.Integer getNumber() {
		return this.number;
	}
	
	public void setNumber(java.lang.Integer value) {
		this.number = value;
	}
	
	public java.lang.String getCardPrefix() {
		return this.cardPrefix;
	}
	
	public void setCardPrefix(java.lang.String value) {
		this.cardPrefix = value;
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
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRuleText() {
		return this.ruleText;
	}
	
	public void setRuleText(java.lang.String value) {
		this.ruleText = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getIsConditionReduction() {
		return this.isConditionReduction;
	}
	
	public void setIsConditionReduction(Integer value) {
		this.isConditionReduction = value;
	}
	
	public Integer getIsDiscount() {
		return this.isDiscount;
	}
	
	public void setIsDiscount(Integer value) {
		this.isDiscount = value;
	}
	
	public Integer getIsGiftCard() {
		return this.isGiftCard;
	}
	
	public void setIsGiftCard(Integer value) {
		this.isGiftCard = value;
	}
	
	public Integer getIsReturnCoupon() {
		return this.isReturnCoupon;
	}
	
	public void setIsReturnCoupon(Integer value) {
		this.isReturnCoupon = value;
	}
	
	public Integer getIsGeneral() {
		return this.isGeneral;
	}
	
	public void setIsGeneral(Integer value) {
		this.isGeneral = value;
	}
	
	public Integer getIsInclude() {
		return this.isInclude;
	}
	
	public void setIsInclude(Integer value) {
		this.isInclude = value;
	}
	
	public Integer getIsSendScore() {
		return this.isSendScore;
	}
	
	public void setIsSendScore(Integer value) {
		this.isSendScore = value;
	}
	
	public Integer getSupplierType() {
		return this.supplierType;
	}
	
	public void setSupplierType(Integer value) {
		this.supplierType = value;
	}
	
	public java.lang.Integer getUseCondition() {
		return this.useCondition;
	}
	
	public void setUseCondition(java.lang.Integer value) {
		this.useCondition = value;
	}
	
	public java.lang.Integer getPartnerId() {
		return this.partnerId;
	}
	
	public void setPartnerId(java.lang.Integer value) {
		this.partnerId = value;
	}
	
	public Integer getIsBatchAccumulation() {
		return this.isBatchAccumulation;
	}
	
	public void setIsBatchAccumulation(Integer value) {
		this.isBatchAccumulation = value;
	}
	
	public java.lang.Integer getApplyUsersId() {
		return this.applyUsersId;
	}
	
	public void setApplyUsersId(java.lang.Integer value) {
		this.applyUsersId = value;
	}
	
	public java.lang.Integer getApplyTime() {
		return this.applyTime;
	}
	
	public void setApplyTime(java.lang.Integer value) {
		this.applyTime = value;
	}
	
	public java.lang.Integer getReviewUsersId() {
		return this.reviewUsersId;
	}
	
	public void setReviewUsersId(java.lang.Integer value) {
		this.reviewUsersId = value;
	}
	
	public java.lang.Integer getReviewTime() {
		return this.reviewTime;
	}
	
	public void setReviewTime(java.lang.Integer value) {
		this.reviewTime = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

