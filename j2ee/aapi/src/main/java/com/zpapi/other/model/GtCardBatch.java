/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;


import javax.validation.constraints.Max;
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


public class GtCardBatch extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtCardBatch";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_BATCH = "批次号";
	public static final String ALIAS_TYPE = "卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡)";
	public static final String ALIAS_NUMBER = "生成数量";
	public static final String ALIAS_CARD_PREFIX = "卡前缀";
	public static final String ALIAS_AMOUNT = "金额(折扣)";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_REMARK = "备注";
	public static final String ALIAS_RULE_TEXT = "使用规则文案";
	public static final String ALIAS_STATUS = "状态(1:待审核2:审核通过3:审核不通过4:已生成)";
	public static final String ALIAS_IS_CONDITION_REDUCTION = "是否使用满减卡";
	public static final String ALIAS_IS_DISCOUNT = "是否使用打折卡";
	public static final String ALIAS_IS_GIFT_CARD = "是否使用礼品卡";
	public static final String ALIAS_IS_RETURN_COUPON = "是否使用返券";
	public static final String ALIAS_IS_GENERAL = "是否通用(1:通用0:一次性)";
	public static final String ALIAS_IS_INCLUDE = "是否允许此商品参与(1:参与0:不能参与) 默认为1";
	public static final String ALIAS_IS_SEND_SCORE = "æ˜¯å¦èµ é€ç§¯åˆ†";
	public static final String ALIAS_SUPPLIER_TYPE = "供应商类型(1:自营商品2:代销商品3:订购商品）";
	public static final String ALIAS_USE_CONDITION = "条件(例如满多少减多少,0不限制)";
	public static final String ALIAS_PARTNER_ID = "渠道ID";
	public static final String ALIAS_IS_BATCH_ACCUMULATION = "同一批次是否累加使用";
	public static final String ALIAS_APPLY_USERS_ID = "申请人id";
	public static final String ALIAS_APPLY_TIME = "申请时间";
	public static final String ALIAS_REVIEW_USERS_ID = "审核人id";
	public static final String ALIAS_REVIEW_TIME = "审核时间";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 批次号       db_column: batch 
     */	
	@NotNull 
	private java.lang.Long batch;
    /**
     * 卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡)       db_column: type 
     */	
	@NotNull @Max(127)
	private Integer type;
    /**
     * 生成数量       db_column: number 
     */	
	@NotNull 
	private java.lang.Integer number;
    /**
     * 卡前缀       db_column: card_prefix 
     */	
	@NotBlank @Length(max=10)
	private java.lang.String cardPrefix;
    /**
     * 金额(折扣)       db_column: amount 
     */	
	@NotNull 
	private double amount;
    /**
     * 开始时间       db_column: start_time 
     */	
	@NotNull 
	private java.lang.Integer startTime;
    /**
     * 结束时间       db_column: end_time 
     */	
	@NotNull 
	private java.lang.Integer endTime;
    /**
     * 备注       db_column: remark 
     */	
	@Length(max=500)
	private java.lang.String remark;
    /**
     * 使用规则文案       db_column: rule_text 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String ruleText;
    /**
     * 状态(1:待审核2:审核通过3:审核不通过4:已生成)       db_column: status 
     */	
	@NotNull @Max(127)
	private Integer status;
    /**
     * 是否使用满减卡       db_column: is_condition_reduction 
     */	
	@NotNull @Max(127)
	private Integer isConditionReduction;
    /**
     * 是否使用打折卡       db_column: is_discount 
     */	
	@NotNull @Max(127)
	private Integer isDiscount;
    /**
     * 是否使用礼品卡       db_column: is_gift_card 
     */	
	@NotNull @Max(127)
	private Integer isGiftCard;
    /**
     * 是否使用返券       db_column: is_return_coupon 
     */	
	@NotNull @Max(127)
	private Integer isReturnCoupon;
    /**
     * 是否通用(1:通用0:一次性)       db_column: is_general 
     */	
	@NotNull @Max(127)
	private Integer isGeneral;
    /**
     * 是否允许此商品参与(1:参与0:不能参与) 默认为1       db_column: is_include 
     */	
	@NotNull @Max(127)
	private Integer isInclude;
    /**
     * æ˜¯å¦èµ é€ç§¯åˆ†       db_column: is_send_score 
     */	
	@NotNull @Max(127)
	private Integer isSendScore;
    /**
     * 供应商类型(1:自营商品2:代销商品3:订购商品）       db_column: supplier_type 
     */	
	@NotNull @Max(127)
	private Integer supplierType;
    /**
     * 条件(例如满多少减多少,0不限制)       db_column: use_condition 
     */	
	@NotNull 
	private java.lang.Integer useCondition;
    /**
     * 渠道ID       db_column: partner_id 
     */	
	@NotNull 
	private java.lang.Integer partnerId;
    /**
     * 同一批次是否累加使用       db_column: is_batch_accumulation 
     */	
	@NotNull @Max(127)
	private Integer isBatchAccumulation;
    /**
     * 申请人id       db_column: apply_users_id 
     */	
	@NotNull 
	private java.lang.Integer applyUsersId;
    /**
     * 申请时间       db_column: apply_time 
     */	
	@NotNull 
	private java.lang.Integer applyTime;
    /**
     * 审核人id       db_column: review_users_id 
     */	
	@NotNull 
	private java.lang.Integer reviewUsersId;
    /**
     * 审核时间       db_column: review_time 
     */	
	@NotNull 
	private java.lang.Integer reviewTime;
	
	private String channelUser;
	//columns END
	
	private String title;
	private String useConditionDetail;
	private String useRangeDetail;
	private Integer validityPeriodType;
	private Integer validTime;

	
	public GtCardBatch(){
	}
	
	public GtCardBatch(
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
	public void setBatch(java.lang.Long value) {
		this.batch = value;
	}
	
	public java.lang.Long getBatch() {
		return this.batch;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setNumber(java.lang.Integer value) {
		this.number = value;
	}
	
	public java.lang.Integer getNumber() {
		return this.number;
	}
	public void setCardPrefix(java.lang.String value) {
		this.cardPrefix = value;
	}
	
	public java.lang.String getCardPrefix() {
		return this.cardPrefix;
	}
	public void setAmount(double value) {
		this.amount = value;
	}
	
	public double getAmount() {
		return this.amount;
	}
	public void setStartTime(java.lang.Integer value) {
		this.startTime = value;
	}
	
	public java.lang.Integer getStartTime() {
		return this.startTime;
	}
	public void setEndTime(java.lang.Integer value) {
		this.endTime = value;
	}
	
	public java.lang.Integer getEndTime() {
		return this.endTime;
	}
	public void setRemark(java.lang.String value) {
		this.remark = value;
	}
	
	public java.lang.String getRemark() {
		return this.remark;
	}
	public void setRuleText(java.lang.String value) {
		this.ruleText = value;
	}
	
	public java.lang.String getRuleText() {
		return this.ruleText;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setIsConditionReduction(Integer value) {
		this.isConditionReduction = value;
	}
	
	public Integer getIsConditionReduction() {
		return this.isConditionReduction;
	}
	public void setIsDiscount(Integer value) {
		this.isDiscount = value;
	}
	
	public Integer getIsDiscount() {
		return this.isDiscount;
	}
	public void setIsGiftCard(Integer value) {
		this.isGiftCard = value;
	}
	
	public Integer getIsGiftCard() {
		return this.isGiftCard;
	}
	public void setIsReturnCoupon(Integer value) {
		this.isReturnCoupon = value;
	}
	
	public Integer getIsReturnCoupon() {
		return this.isReturnCoupon;
	}
	public void setIsGeneral(Integer value) {
		this.isGeneral = value;
	}
	
	public Integer getIsGeneral() {
		return this.isGeneral;
	}
	public void setIsInclude(Integer value) {
		this.isInclude = value;
	}
	
	public Integer getIsInclude() {
		return this.isInclude;
	}
	public void setIsSendScore(Integer value) {
		this.isSendScore = value;
	}
	
	public Integer getIsSendScore() {
		return this.isSendScore;
	}
	public void setSupplierType(Integer value) {
		this.supplierType = value;
	}
	
	public Integer getSupplierType() {
		return this.supplierType;
	}
	public void setUseCondition(java.lang.Integer value) {
		this.useCondition = value;
	}
	
	public java.lang.Integer getUseCondition() {
		return this.useCondition;
	}
	public void setPartnerId(java.lang.Integer value) {
		this.partnerId = value;
	}
	
	public java.lang.Integer getPartnerId() {
		return this.partnerId;
	}
	public void setIsBatchAccumulation(Integer value) {
		this.isBatchAccumulation = value;
	}
	
	public Integer getIsBatchAccumulation() {
		return this.isBatchAccumulation;
	}
	public void setApplyUsersId(java.lang.Integer value) {
		this.applyUsersId = value;
	}
	
	public java.lang.Integer getApplyUsersId() {
		return this.applyUsersId;
	}
	public void setApplyTime(java.lang.Integer value) {
		this.applyTime = value;
	}
	
	public java.lang.Integer getApplyTime() {
		return this.applyTime;
	}
	public void setReviewUsersId(java.lang.Integer value) {
		this.reviewUsersId = value;
	}
	
	public java.lang.Integer getReviewUsersId() {
		return this.reviewUsersId;
	}
	public void setReviewTime(java.lang.Integer value) {
		this.reviewTime = value;
	}
	
	public java.lang.Integer getReviewTime() {
		return this.reviewTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Batch",getBatch())
			.append("Type",getType())
			.append("Number",getNumber())
			.append("CardPrefix",getCardPrefix())
			.append("Amount",getAmount())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("Remark",getRemark())
			.append("RuleText",getRuleText())
			.append("Status",getStatus())
			.append("IsConditionReduction",getIsConditionReduction())
			.append("IsDiscount",getIsDiscount())
			.append("IsGiftCard",getIsGiftCard())
			.append("IsReturnCoupon",getIsReturnCoupon())
			.append("IsGeneral",getIsGeneral())
			.append("IsInclude",getIsInclude())
			.append("IsSendScore",getIsSendScore())
			.append("SupplierType",getSupplierType())
			.append("UseCondition",getUseCondition())
			.append("PartnerId",getPartnerId())
			.append("IsBatchAccumulation",getIsBatchAccumulation())
			.append("ApplyUsersId",getApplyUsersId())
			.append("ApplyTime",getApplyTime())
			.append("ReviewUsersId",getReviewUsersId())
			.append("ReviewTime",getReviewTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtCardBatch == false) return false;
		if(this == obj) return true;
		GtCardBatch other = (GtCardBatch)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String getChannelUser() {
		return channelUser;
	}

	public void setChannelUser(String channelUser) {
		this.channelUser = channelUser;
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

