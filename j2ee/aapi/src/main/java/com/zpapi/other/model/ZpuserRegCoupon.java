/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
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


public class ZpuserRegCoupon extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "ZpuserRegCoupon";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_TYPE = "类型(1:注册,2:登录,3:注册和登录)";
	public static final String ALIAS_PLATFORM = "平台(1:网站,2:M站,3:iso,4:android)";
	public static final String ALIAS_START_TIME = "开始时间";
	public static final String ALIAS_END_TIME = "结束时间";
	public static final String ALIAS_AUDIT_STATUS = "审核状态(1:待审核2:审核通过3:审核不通过)";
	public static final String ALIAS_STATUS = "启用状态(1:启用0:停用)";
	public static final String ALIAS_CREATER = "创建人(gt_users)";
	public static final String ALIAS_CARD_TYPE = "卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡)";
	public static final String ALIAS_COUPON_TASK_ID = "优惠券任务ID(gt_coupon_card_task表task_id或gt_card_batch表id)";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 类型(1:注册,2:登录,3:注册和登录)       db_column: type 
     */	
	@NotNull 
	private java.lang.Boolean type;
    /**
     * 平台(1:网站,2:M站,3:iso,4:android)       db_column: platform 
     */	
	@NotBlank @Length(max=7)
	private java.lang.String platform;
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
     * 审核状态(1:待审核2:审核通过3:审核不通过)       db_column: audit_status 
     */	
	@NotNull 
	private java.lang.Boolean auditStatus;
    /**
     * 启用状态(1:启用0:停用)       db_column: status 
     */	
	@NotNull 
	private java.lang.Boolean status;
    /**
     * 创建人(gt_users)       db_column: creater 
     */	
	@NotNull 
	private java.lang.Integer creater;
    /**
     * 卡类型(11:礼包卡12:打折卡13:返券14:满减卡15礼品卡16:充值卡)       db_column: card_type 
     */	
	@NotNull 
	private Integer cardType;
    /**
     * 优惠券任务ID(gt_coupon_card_task表task_id或gt_card_batch表id)       db_column: coupon_task_id 
     */	
	@NotNull 
	private java.lang.Integer couponTaskId;
    /**
     * 创建时间       db_column: create_time 
     */	
	@NotNull 
	private java.lang.Integer createTime;
	//columns END

	public ZpuserRegCoupon(){
	}

	public ZpuserRegCoupon(
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
	public void setType(java.lang.Boolean value) {
		this.type = value;
	}
	
	public java.lang.Boolean getType() {
		return this.type;
	}
	public void setPlatform(java.lang.String value) {
		this.platform = value;
	}
	
	public java.lang.String getPlatform() {
		return this.platform;
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
	public void setAuditStatus(java.lang.Boolean value) {
		this.auditStatus = value;
	}
	
	public java.lang.Boolean getAuditStatus() {
		return this.auditStatus;
	}
	public void setStatus(java.lang.Boolean value) {
		this.status = value;
	}
	
	public java.lang.Boolean getStatus() {
		return this.status;
	}
	public void setCreater(java.lang.Integer value) {
		this.creater = value;
	}
	
	public java.lang.Integer getCreater() {
		return this.creater;
	}
	public void setCardType(Integer value) {
		this.cardType = value;
	}
	
	public Integer getCardType() {
		return this.cardType;
	}
	public void setCouponTaskId(java.lang.Integer value) {
		this.couponTaskId = value;
	}
	
	public java.lang.Integer getCouponTaskId() {
		return this.couponTaskId;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Type",getType())
			.append("Platform",getPlatform())
			.append("StartTime",getStartTime())
			.append("EndTime",getEndTime())
			.append("AuditStatus",getAuditStatus())
			.append("Status",getStatus())
			.append("Creater",getCreater())
			.append("CardType",getCardType())
			.append("CouponTaskId",getCouponTaskId())
			.append("CreateTime",getCreateTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ZpuserRegCoupon == false) return false;
		if(this == obj) return true;
		ZpuserRegCoupon other = (ZpuserRegCoupon)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

