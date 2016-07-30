package com.zpapi.other.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


public class GtOrderInfo extends GtOrders{
	private static final long serialVersionUID = 538284207800373023L;
	@NotNull@Length(max=200)
	private String paytypename;
	
	private String sku;
	private String colorText;
	private String quantity;
	private String productName;
	private String specValue;
	 
	
	 
 

	public String getSpecValue() {
		return specValue;
	}

	public void setSpecValue(String specValue) {
		this.specValue = specValue;
	}

	public String getPaytypename() {
		return paytypename;
	}

	public void setPaytypename(String paytypename) {
		this.paytypename = paytypename;
	}
	private java.lang.String m_small;
	private String imageSource;
	

	 

	public String getImageSource() {
		return imageSource;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}

	public java.lang.String getM_small() {
		return m_small;
	}

	public void setM_small(java.lang.String m_small) {
		this.m_small = m_small;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}


	public String getColorText() {
		return colorText;
	}

	public void setColorText(String colorText) {
		this.colorText = colorText;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	 
	private java.lang.String smallListPageProductPicDefault;
	private java.lang.String smallListPageProductPicReplace;
	
	public java.lang.String getSmallListPageProductPicDefault() {
		return smallListPageProductPicDefault;
	}
	public void setSmallListPageProductPicDefault(
			java.lang.String smallListPageProductPicDefault) {
		this.smallListPageProductPicDefault = smallListPageProductPicDefault;
	}
	public java.lang.String getSmallListPageProductPicReplace() {
		return smallListPageProductPicReplace;
	}
	public void setSmallListPageProductPicReplace(
			java.lang.String smallListPageProductPicReplace) {
		this.smallListPageProductPicReplace = smallListPageProductPicReplace;
	}
	
}