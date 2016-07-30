package com.zpapi.other.model;

public class GtOrderProduct extends GtOrdersItem{

	private static final long serialVersionUID = -3093191052270242836L;
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getBrandid() {
		return brandid;
	}
	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}
	private String brandname;
	private String brandid;
	private String m_small;
	private String imageSource;
	private String status;
	private Double  freight;
	private Double  customsRate;
	 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUrlid() {
		return urlid;
	}
	public void setUrlid(String urlid) {
		this.urlid = urlid;
	}
	private String urlid;
	public String getM_small() {
		return m_small;
	}
	public void setM_small(String m_small) {
		this.m_small = m_small;
	}
	public String getImageSource() {
		return imageSource;
	}
	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}
	public Double getFreight() {
		return freight;
	}
	public void setFreight(Double freight) {
		this.freight = freight;
	}
	public Double getCustomsRate() {
		return customsRate;
	}
	public void setCustomsRate(Double customsRate) {
		this.customsRate = customsRate;
	}
	 
	
	
}