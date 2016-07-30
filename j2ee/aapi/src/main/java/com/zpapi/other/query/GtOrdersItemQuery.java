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


public class GtOrdersItemQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 订单商品条目ID */
	private java.lang.Integer orderItemId;
	/** 单订流水号 */
	private java.lang.Integer orderId;
	/** 活动id */
	private java.lang.Integer actId;
	/** 交易订单号 */
	private java.lang.Long orderSn;
	/** 规格细分产品ID */
	private java.lang.Integer productSpecId;
	/** attachment */
	private java.lang.String attachment;
	/** 是否特殊商品 */
	private java.lang.Boolean isSpecial;
	/** 产品ID */
	private java.lang.Integer productId;
	/** 产品sku码 */
	private java.lang.String sku;
	/** 产品颜色文案 */
	private java.lang.String colorText;
	/** 货品规格文案 */
	private java.lang.String specValue;
	/** 购买时的价格 */
	private Long price;
	/** 防伪码 */
	private java.lang.String securityCode;
	/** 代销供应商 */
	private java.lang.String sellCode;
	/** 购买时的折扣率 */
	private Integer discountRate;
	/** productName */
	private java.lang.String productName;
	/** 数量 */
	private java.lang.Integer quantity;
	/** refundQuantity */
	private java.lang.Integer refundQuantity;
	/** 0=>尚未评价 1=> 已评价 */
	private java.lang.Boolean isEvaluate;
	/** 0=>尚未晒单 1=> 已晒单 */
	private java.lang.Boolean isShowOrder;

	public java.lang.Integer getOrderItemId() {
		return this.orderItemId;
	}
	
	public void setOrderItemId(java.lang.Integer value) {
		this.orderItemId = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Integer getActId() {
		return this.actId;
	}
	
	public void setActId(java.lang.Integer value) {
		this.actId = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Integer getProductSpecId() {
		return this.productSpecId;
	}
	
	public void setProductSpecId(java.lang.Integer value) {
		this.productSpecId = value;
	}
	
	public java.lang.String getAttachment() {
		return this.attachment;
	}
	
	public void setAttachment(java.lang.String value) {
		this.attachment = value;
	}
	
	public java.lang.Boolean getIsSpecial() {
		return this.isSpecial;
	}
	
	public void setIsSpecial(java.lang.Boolean value) {
		this.isSpecial = value;
	}
	
	public java.lang.Integer getProductId() {
		return this.productId;
	}
	
	public void setProductId(java.lang.Integer value) {
		this.productId = value;
	}
	
	public java.lang.String getSku() {
		return this.sku;
	}
	
	public void setSku(java.lang.String value) {
		this.sku = value;
	}
	
	public java.lang.String getColorText() {
		return this.colorText;
	}
	
	public void setColorText(java.lang.String value) {
		this.colorText = value;
	}
	
	public java.lang.String getSpecValue() {
		return this.specValue;
	}
	
	public void setSpecValue(java.lang.String value) {
		this.specValue = value;
	}
	
	public Long getPrice() {
		return this.price;
	}
	
	public void setPrice(Long value) {
		this.price = value;
	}
	
	public java.lang.String getSecurityCode() {
		return this.securityCode;
	}
	
	public void setSecurityCode(java.lang.String value) {
		this.securityCode = value;
	}
	
	public java.lang.String getSellCode() {
		return this.sellCode;
	}
	
	public void setSellCode(java.lang.String value) {
		this.sellCode = value;
	}
	
	public Integer getDiscountRate() {
		return this.discountRate;
	}
	
	public void setDiscountRate(Integer value) {
		this.discountRate = value;
	}
	
	public java.lang.String getProductName() {
		return this.productName;
	}
	
	public void setProductName(java.lang.String value) {
		this.productName = value;
	}
	
	public java.lang.Integer getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(java.lang.Integer value) {
		this.quantity = value;
	}
	
	public java.lang.Integer getRefundQuantity() {
		return this.refundQuantity;
	}
	
	public void setRefundQuantity(java.lang.Integer value) {
		this.refundQuantity = value;
	}
	
	public java.lang.Boolean getIsEvaluate() {
		return this.isEvaluate;
	}
	
	public void setIsEvaluate(java.lang.Boolean value) {
		this.isEvaluate = value;
	}
	

	public java.lang.Boolean getIsShowOrder() {
		return isShowOrder;
	}

	public void setIsShowOrder(java.lang.Boolean isShowOrder) {
		this.isShowOrder = isShowOrder;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

