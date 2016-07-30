/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
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


public class GtOrdersLog extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtOrdersLog";
	public static final String ALIAS_LOG_ID = "logId";
	public static final String ALIAS_TYPE = "0=前台显示 1=前台不显示";
	public static final String ALIAS_ORDER_ID = "操作单订ID";
	public static final String ALIAS_STATUS = "订单状态保存值";
	public static final String ALIAS_SUB_STATUS = "子状态";
	public static final String ALIAS_USER_ID = "操作用户ID";
	public static final String ALIAS_EXPRESS_ID = "第三方物流ID";
	public static final String ALIAS_OP_TYPE = "操作类型 1下单 2线下收款 3审核 4分配 5取消 6删除 7拒收 8配载 9生成分拣单 10置为拣货 11拣货完成 12分拣单完成 13订单复核 14打包 15出库 16回收 17跨仓订单收货 18再配载 19签收 20配送点收货 21分派时尚顾问 22时尚顾问外出派件 23财务收款 24打印完成 25出库后取消";
	public static final String ALIAS_MEMO = "操作说明";
	public static final String ALIAS_FORMERLY = "原信息";
	public static final String ALIAS_OP_TIME = "操作时间";
	public static final String ALIAS_IP = "ip";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * logId       db_column: log_id 
     */	
	
	private java.lang.Integer logId;
    /**
     * 0=前台显示 1=前台不显示       db_column: type 
     */	
	@NotNull 
	private java.lang.Boolean type;
    /**
     * 操作单订ID       db_column: order_id 
     */	
	@NotNull 
	private java.lang.Integer orderId;
    /**
     * 订单状态保存值       db_column: status 
     */	
	@NotNull @Max(127)
	private Integer status;
    /**
     * 子状态       db_column: sub_status 
     */	
	@NotNull @Max(127)
	private Integer subStatus;
    /**
     * 操作用户ID       db_column: user_id 
     */	
	
	private java.lang.Integer userId;
    /**
     * 第三方物流ID       db_column: express_id 
     */	
	@NotNull 
	private java.lang.Integer expressId;
    /**
     * 操作类型 1下单 2线下收款 3审核 4分配 5取消 6删除 7拒收 8配载 9生成分拣单 10置为拣货 11拣货完成 12分拣单完成 13订单复核 14打包 15出库 16回收 17跨仓订单收货 18再配载 19签收 20配送点收货 21分派时尚顾问 22时尚顾问外出派件 23财务收款 24打印完成 25出库后取消       db_column: op_type 
     */	
	@NotNull 
	private java.lang.Integer opType;
    /**
     * 操作说明       db_column: memo 
     */	
	@Length(max=200)
	private java.lang.String memo;
    /**
     * 原信息       db_column: formerly 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String formerly;
    /**
     * 操作时间       db_column: op_time 
     */	
	
	private java.lang.Integer opTime;
    /**
     * ip       db_column: ip 
     */	
	@Length(max=100)
	private java.lang.String ip;
	//columns END

	public GtOrdersLog(){
	}

	public GtOrdersLog(
		java.lang.Integer logId
	){
		this.logId = logId;
	}

	public void setLogId(java.lang.Integer value) {
		this.logId = value;
	}
	
	public java.lang.Integer getLogId() {
		return this.logId;
	}
	public void setType(java.lang.Boolean value) {
		this.type = value;
	}
	
	public java.lang.Boolean getType() {
		return this.type;
	}
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setSubStatus(Integer value) {
		this.subStatus = value;
	}
	
	public Integer getSubStatus() {
		return this.subStatus;
	}
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	public void setExpressId(java.lang.Integer value) {
		this.expressId = value;
	}
	
	public java.lang.Integer getExpressId() {
		return this.expressId;
	}
	public void setOpType(java.lang.Integer value) {
		this.opType = value;
	}
	
	public java.lang.Integer getOpType() {
		return this.opType;
	}
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	public void setFormerly(java.lang.String value) {
		this.formerly = value;
	}
	
	public java.lang.String getFormerly() {
		return this.formerly;
	}
	public void setOpTime(java.lang.Integer value) {
		this.opTime = value;
	}
	
	public java.lang.Integer getOpTime() {
		return this.opTime;
	}
	public void setIp(java.lang.String value) {
		this.ip = value;
	}
	
	public java.lang.String getIp() {
		return this.ip;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("LogId",getLogId())
			.append("Type",getType())
			.append("OrderId",getOrderId())
			.append("Status",getStatus())
			.append("SubStatus",getSubStatus())
			.append("UserId",getUserId())
			.append("ExpressId",getExpressId())
			.append("OpType",getOpType())
			.append("Memo",getMemo())
			.append("Formerly",getFormerly())
			.append("OpTime",getOpTime())
			.append("Ip",getIp())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getLogId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtOrdersLog == false) return false;
		if(this == obj) return true;
		GtOrdersLog other = (GtOrdersLog)obj;
		return new EqualsBuilder()
			.append(getLogId(),other.getLogId())
			.isEquals();
	}
}

