package com.zpapi.other.model;

import com.zhen.commons.base.BaseEntity;

public class GtMyOrderListNew extends BaseEntity implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5032183476385303734L;
	private Integer productId;
	private Integer productSpecId;
	private Integer orderItemId;
	private String productName;
	private Long price;
	private Long zpPrice;
	private Integer quantity;
	private String mSmall;
	private String sourceImg;
	private String colorText;
	private String specValue;
	private Integer subStatus;
	private Integer rejectionStatus;
	private Integer rejectionQuantity;
	
	private boolean unableStatus;
	
	
	public Integer getRejectionStatus() {
		return rejectionStatus;
	}
	public void setRejectionStatus(Integer rejectionStatus) {
		this.rejectionStatus = rejectionStatus;
	}
	public Integer getSubStatus() {
		return subStatus;
	}
	public void setSubStatus(Integer subStatus) {
		this.subStatus = subStatus;
	}
	public Integer getRejectionQuantity() {
		return rejectionQuantity;
	}
	public void setRejectionQuantity(Integer rejectionQuantity) {
		this.rejectionQuantity = rejectionQuantity;
	}
	public boolean isUnableStatus() {
		return unableStatus;
	}
	public void setUnableStatus(boolean unableStatus) {
		this.unableStatus = unableStatus;
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
	public Integer getProductSpecId() {
		return productSpecId;
	}
	public void setProductSpecId(Integer productSpecId) {
		this.productSpecId = productSpecId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
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
	public Integer getQuantity() {
		return quantity;
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
	

}
