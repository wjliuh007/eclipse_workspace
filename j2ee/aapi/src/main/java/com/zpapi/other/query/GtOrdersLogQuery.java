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


public class GtOrdersLogQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** logId */
	private java.lang.Integer logId;
	/** 0=前台显示 1=前台不显示 */
	private java.lang.Boolean type;
	/** 操作单订ID */
	private java.lang.Integer orderId;
	/** 订单状态保存值 */
	private Integer status;
	/** 子状态 */
	private Integer subStatus;
	/** 操作用户ID */
	private java.lang.Integer userId;
	/** 第三方物流ID */
	private java.lang.Integer expressId;
	/** 操作类型 1下单 2线下收款 3审核 4分配 5取消 6删除 7拒收 8配载 9生成分拣单 10置为拣货 11拣货完成 12分拣单完成 13订单复核 14打包 15出库 16回收 17跨仓订单收货 18再配载 19签收 20配送点收货 21分派时尚顾问 22时尚顾问外出派件 23财务收款 24打印完成 25出库后取消 */
	private java.lang.Integer opType;
	/** 操作说明 */
	private java.lang.String memo;
	/** 原信息 */
	private java.lang.String formerly;
	/** 操作时间 */
	private java.lang.Integer opTime;
	/** ip */
	private java.lang.String ip;

	public java.lang.Integer getLogId() {
		return this.logId;
	}
	
	public void setLogId(java.lang.Integer value) {
		this.logId = value;
	}
	
	public java.lang.Boolean getType() {
		return this.type;
	}
	
	public void setType(java.lang.Boolean value) {
		this.type = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getSubStatus() {
		return this.subStatus;
	}
	
	public void setSubStatus(Integer value) {
		this.subStatus = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getExpressId() {
		return this.expressId;
	}
	
	public void setExpressId(java.lang.Integer value) {
		this.expressId = value;
	}
	
	public java.lang.Integer getOpType() {
		return this.opType;
	}
	
	public void setOpType(java.lang.Integer value) {
		this.opType = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.String getFormerly() {
		return this.formerly;
	}
	
	public void setFormerly(java.lang.String value) {
		this.formerly = value;
	}
	
	public java.lang.Integer getOpTime() {
		return this.opTime;
	}
	
	public void setOpTime(java.lang.Integer value) {
		this.opTime = value;
	}
	
	public java.lang.String getIp() {
		return this.ip;
	}
	
	public void setIp(java.lang.String value) {
		this.ip = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

