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


public class GtOrdersItem extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtOrdersItem";
	public static final String ALIAS_ORDER_ITEM_ID = "订单商品条目ID";
	public static final String ALIAS_ORDER_ID = "单订流水号";
	public static final String ALIAS_ACT_ID = "活动id";
	public static final String ALIAS_ORDER_SN = "交易订单号";
	public static final String ALIAS_PRODUCT_SPEC_ID = "规格细分产品ID";
	public static final String ALIAS_ATTACHMENT = "attachment";
	public static final String ALIAS_IS_SPECIAL = "是否特殊商品";
	public static final String ALIAS_PRODUCT_ID = "产品ID";
	public static final String ALIAS_SKU = "产品sku码";
	public static final String ALIAS_COLOR_TEXT = "产品颜色文案";
	public static final String ALIAS_SPEC_VALUE = "货品规格文案";
	public static final String ALIAS_PRICE = "购买时的价格";
	public static final String ALIAS_SECURITY_CODE = "防伪码";
	public static final String ALIAS_SELL_CODE = "代销供应商";
	public static final String ALIAS_DISCOUNT_RATE = "购买时的折扣率";
	public static final String ALIAS_PRODUCT_NAME = "productName";
	public static final String ALIAS_QUANTITY = "数量";
	public static final String ALIAS_REFUND_QUANTITY = "refundQuantity";
	public static final String ALIAS_IS_EVALUATE = "0=>尚未评价 1=> 已评价";
	public static final String ALIAS_LIST_NO = "商品单位";
	public static final String ALIAS_ATTR_VALUES = "属性值";
	
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 订单商品条目ID       db_column: order_item_id 
     */	
	
	private java.lang.Integer orderItemId;
    /**
     * 单订流水号       db_column: order_id 
     */	
	@NotNull 
	private java.lang.Integer orderId;
    /**
     * 活动id       db_column: act_id 
     */	
	@NotNull 
	private java.lang.Integer actId;
    /**
     * 交易订单号       db_column: order_sn 
     */	
	@NotNull 
	private java.lang.Long orderSn;
    /**
     * 规格细分产品ID       db_column: product_spec_id 
     */	
	@NotNull 
	private java.lang.Integer productSpecId;
    /**
     * attachment       db_column: attachment 
     */	
	@NotBlank @Length(max=65535)
	private java.lang.String attachment;
    /**
     * 是否特殊商品       db_column: is_special 
     */	
	@NotNull 
	private java.lang.Boolean isSpecial;
    /**
     * 产品ID       db_column: product_id 
     */	
	@NotNull 
	private java.lang.Integer productId;
    /**
     * 产品sku码       db_column: sku 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String sku;
    /**
     * 产品颜色文案       db_column: color_text 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String colorText;
    /**
     * 货品规格文案       db_column: spec_value 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String specValue;
    /**
     * 购买时的价格       db_column: price 
     */	
	@NotNull 
	private Long price;
    /**
     * 防伪码       db_column: security_code 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String securityCode;
    /**
     * 代销供应商       db_column: sell_code 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String sellCode;
    /**
     * 购买时的折扣率       db_column: discount_rate 
     */	
	@NotNull @Max(127)
	private Integer discountRate;
    /**
     * productName       db_column: product_name 
     */	
	@NotBlank @Length(max=200)
	private java.lang.String productName;
    /**
     * 数量       db_column: quantity 
     */	
	@NotNull 
	private java.lang.Integer quantity;
    /**
     * refundQuantity       db_column: refund_quantity 
     */	
	@NotNull 
	private java.lang.Integer refundQuantity;
    /**
     * 0=>尚未评价 1=> 已评价       db_column: is_evaluate 
     */	
	@NotNull 
	private java.lang.String isEvaluate;
	/**
	 * 0=>尚未晒单 1=> 已晒单       db_column: is_showorder 
	 */	
	@NotNull 
	private Integer isShowOrder;
	/**
     * 优惠后金额       db_column: zp_price 
     */	
	@NotNull 
	private Long zpPrice;
	
	@NotNull 
	private java.lang.String unit;
	@NotNull 
	private java.lang.String customRecord;
	@NotNull 
	private java.lang.Integer hsCode;
	

	
	public java.lang.String getCustomRecord() {
		return customRecord;
	}

	public void setCustomRecord(java.lang.String customRecord) {
		this.customRecord = customRecord;
	}

	private Integer rejectionQuantity;
	public Integer getRejectionQuantity() {
		return rejectionQuantity;
	}

	public void setRejectionQuantity(Integer rejectionQuantity) {
		this.rejectionQuantity = rejectionQuantity;
	}
	
	//columns END
	private Integer channel;
	
	private Integer itemStatus;
	
	private String attrValues;
	
	public String getAttrValues() {
		return attrValues;
	}

	public void setAttrValues(String attrValues) {
		this.attrValues = attrValues;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public GtOrdersItem(){
	}

	public GtOrdersItem(
		java.lang.Integer orderItemId
	){
		this.orderItemId = orderItemId;
	}

	public void setOrderItemId(java.lang.Integer value) {
		this.orderItemId = value;
	}
	
	public java.lang.Integer getOrderItemId() {
		return this.orderItemId;
	}
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	public void setActId(java.lang.Integer value) {
		this.actId = value;
	}
	
	public java.lang.Integer getActId() {
		return this.actId;
	}
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	public void setProductSpecId(java.lang.Integer value) {
		this.productSpecId = value;
	}
	
	public java.lang.Integer getProductSpecId() {
		return this.productSpecId;
	}
	public void setAttachment(java.lang.String value) {
		this.attachment = value;
	}
	
	public java.lang.String getAttachment() {
		return this.attachment;
	}
	public void setIsSpecial(java.lang.Boolean value) {
		this.isSpecial = value;
	}
	
	public java.lang.Boolean getIsSpecial() {
		return this.isSpecial;
	}
	public void setProductId(java.lang.Integer value) {
		this.productId = value;
	}
	
	public java.lang.Integer getProductId() {
		return this.productId;
	}
	public void setSku(java.lang.String value) {
		this.sku = value;
	}
	
	public java.lang.String getSku() {
		return this.sku;
	}
	public void setColorText(java.lang.String value) {
		this.colorText = value;
	}
	
	public java.lang.String getColorText() {
		return this.colorText;
	}
	public void setSpecValue(java.lang.String value) {
		this.specValue = value;
	}
	
	public java.lang.String getSpecValue() {
		return this.specValue;
	}
	public void setPrice(Long value) {
		this.price = value;
	}
	
	public Long getPrice() {
		return this.price;
	}
	public void setSecurityCode(java.lang.String value) {
		this.securityCode = value;
	}
	
	public java.lang.String getSecurityCode() {
		return this.securityCode;
	}
	public void setSellCode(java.lang.String value) {
		this.sellCode = value;
	}
	
	public java.lang.String getSellCode() {
		return this.sellCode;
	}
	public void setDiscountRate(Integer value) {
		this.discountRate = value;
	}
	
	public Integer getDiscountRate() {
		return this.discountRate;
	}
	public void setProductName(java.lang.String value) {
		this.productName = value;
	}
	
	public java.lang.String getProductName() {
		return this.productName;
	}
	public void setQuantity(java.lang.Integer value) {
		this.quantity = value;
	}
	
	public java.lang.Integer getQuantity() {
		return this.quantity;
	}
	public void setRefundQuantity(java.lang.Integer value) {
		this.refundQuantity = value;
	}
	
	public java.lang.Integer getRefundQuantity() {
		return this.refundQuantity;
	}
	public void setIsEvaluate(java.lang.String value) {
		this.isEvaluate = value;
	}
	
	public java.lang.String getIsEvaluate() {
		return this.isEvaluate;
	}
	

	public Integer getIsShowOrder() {
		return isShowOrder;
	}

	public void setIsShowOrder(Integer isShowOrder) {
		this.isShowOrder = isShowOrder;
	}

	public Long getZpPrice() {
		return zpPrice;
	}

	public void setZpPrice(Long zpPrice) {
		this.zpPrice = zpPrice;
	}
	public Integer getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(Integer itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	public java.lang.String getUnit() {
		return unit;
	}

	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}

	public java.lang.Integer getHsCode() {
		return hsCode;
	}

	public void setHsCode(java.lang.Integer hsCode) {
		this.hsCode = hsCode;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("OrderItemId",getOrderItemId())
			.append("OrderId",getOrderId())
			.append("ActId",getActId())
			.append("OrderSn",getOrderSn())
			.append("ProductSpecId",getProductSpecId())
			.append("Attachment",getAttachment())
			.append("IsSpecial",getIsSpecial())
			.append("ProductId",getProductId())
			.append("Sku",getSku())
			.append("ColorText",getColorText())
			.append("SpecValue",getSpecValue())
			.append("Price",getPrice())
			.append("SecurityCode",getSecurityCode())
			.append("SellCode",getSellCode())
			.append("DiscountRate",getDiscountRate())
			.append("ProductName",getProductName())
			.append("Quantity",getQuantity())
			.append("RefundQuantity",getRefundQuantity())
			.append("IsEvaluate",getIsEvaluate())
			.append("zpPrice",getZpPrice())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getOrderItemId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtOrdersItem == false) return false;
		if(this == obj) return true;
		GtOrdersItem other = (GtOrdersItem)obj;
		return new EqualsBuilder()
			.append(getOrderItemId(),other.getOrderItemId())
			.isEquals();
	}
}

