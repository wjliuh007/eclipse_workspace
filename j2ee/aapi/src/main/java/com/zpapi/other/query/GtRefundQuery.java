package com.zpapi.other.query;

import java.util.List;

import com.zhen.commons.base.BaseEntity;

public class GtRefundQuery extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = -727131242943385599L;
	private Integer orderId;
	private Integer refundOrderId;
	private Long refundOrderSn;
	private Long orderSn;
	private String status;
	private Integer productId;
	private Integer orderItemId;
	private Integer productSpecId;
	private String productName;
	private Long price;
	private Long zpPrice;
	private Integer type;
	private String refundReason;
	private String reason;
	private String colorText;
	private String specValue;
	private Integer quantity;
	private String mSmall;
	private String sourceImg;
	private Long parentOrderSn;
	private Long createTime;
	private String warehouseId;
	
	private String refundDetailsUtl;
	private String wayBill;
	
	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public Long getOrderSn() {
		return orderSn;
	}

	public void setOrderSn(Long orderSn) {
		this.orderSn = orderSn;
	}

	public String getRefundDetailsUtl() {
		return refundDetailsUtl;
	}

	public void setRefundDetailsUtl(String refundDetailsUtl) {
		this.refundDetailsUtl = refundDetailsUtl;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	private List images;
	private List ExchangeProduct;
	public List getExchangeProduct() {
		return ExchangeProduct;
	}

	public void setExchangeProduct(List exchangeProduct) {
		ExchangeProduct = exchangeProduct;
	}

	public List getImages() {
		return images;
	}

	public void setImages(List images) {
		this.images = images;
	}

	public Integer getRefundOrderId() {
		return refundOrderId;
	}
	
	public Integer getProductSpecId() {
		return productSpecId;
	}
	
	public Long getParentOrderSn() {
		return parentOrderSn;
	}

	public void setParentOrderSn(Long parentOrderSn) {
		this.parentOrderSn = parentOrderSn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setProductSpecId(Integer productSpecId) {
		this.productSpecId = productSpecId;
	}

	public void setRefundOrderId(Integer refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public Long getRefundOrderSn() {
		return refundOrderSn;
	}
	public void setRefundOrderSn(Long refundOrderSn) {
		this.refundOrderSn = refundOrderSn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Long getZpPrice() {
		return zpPrice;
	}
	public void setZpPrice(Long zpPrice) {
		this.zpPrice = zpPrice;
	}
	public String getColorText() {
		return colorText;
	}
	public void setColorText(String colorText) {
		this.colorText = colorText;
	}
	public String getSpecValue() {
		return specValue;
	}
	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}
	public Integer getQuantity() {
		return quantity;
	}
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getRefundReason() {
		return refundReason;
	}
	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getmSmall() {
		return mSmall;
	}
	public void setmSmall(String mSmall) {
		this.mSmall = mSmall;
	}
	public String getSourceImg() {
		return sourceImg;
	}
	public void setSourceImg(String sourceImg) {
		this.sourceImg = sourceImg;
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public String getWayBill() {
		return wayBill;
	}

	public void setWayBill(String wayBill) {
		this.wayBill = wayBill;
	}
	
	
}
