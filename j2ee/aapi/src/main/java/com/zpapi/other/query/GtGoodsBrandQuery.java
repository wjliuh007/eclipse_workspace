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


public class GtGoodsBrandQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** 品牌ID */
	private java.lang.Integer brandId;
	/** 是否为顶级品牌 1=是 0=否 */
	private java.lang.Boolean isTop;
	/** 品牌名称 */
	private java.lang.String brandName;
	/** 品牌补充名称 */
	private java.lang.String brandNameSecond;
	/** 中文品牌名拼音 */
	private java.lang.String brandPinyin;
	/** 详情页图片地址 */
	private java.lang.String brandLogo;
	/** 品牌logo缩略图 */
	private java.lang.String thumbBrandImg;
	/** 品牌logo */
	private java.lang.String brandImg;
	/** 个性化样式路径 */
	private java.lang.String brandCssPath;
	/** 品牌介绍 */
	private java.lang.String brandIntro;
	/** 品牌简单描述 */
	private java.lang.String brandSimpleIntro;
	/** 品牌标签 */
	private java.lang.String nature;
	/** 中文标签 */
	private java.lang.String chineseNature;
	/** 排序 */
	private java.lang.Integer sort;
	/** cms里的brand的分类编号 */
	private java.lang.Integer cmsBrandId;
	/** cms品牌路径 */
	private java.lang.String cmsBrandPath;
	/** 网址参数 */
	private java.lang.String urlPath;
	/** seo信息 */
	private java.lang.String seoInfo;
	/** 男士seo信息 */
	private java.lang.String maleSeoInfo;
	/** 女士seo信息 */
	private java.lang.String femaleSeoInfo;
	/** 品牌图片地址 */
	private java.lang.String bannerImgPath;
	/** 品牌图片链接 */
	private java.lang.String bannerLink;
	/** addTime */
	private java.lang.Integer addTime;
	/** userId */
	private java.lang.Integer userId;
	/** editTime */
	private java.util.Date editTimeBegin;
	private java.util.Date editTimeEnd;
	/** editUserId */
	private java.lang.Integer editUserId;
	/** 亚马逊品牌名 */
	private java.lang.String amazonName;
	/** 库巴对应的品牌id */
	private java.lang.Integer coo8BrandId;
	/** 推荐标签 1=》HOT，2=》NEW */
	private Integer recomLabel;

	public java.lang.Integer getBrandId() {
		return this.brandId;
	}
	
	public void setBrandId(java.lang.Integer value) {
		this.brandId = value;
	}
	
	public java.lang.Boolean getIsTop() {
		return this.isTop;
	}
	
	public void setIsTop(java.lang.Boolean value) {
		this.isTop = value;
	}
	
	public java.lang.String getBrandName() {
		return this.brandName;
	}
	
	public void setBrandName(java.lang.String value) {
		this.brandName = value;
	}
	
	public java.lang.String getBrandNameSecond() {
		return this.brandNameSecond;
	}
	
	public void setBrandNameSecond(java.lang.String value) {
		this.brandNameSecond = value;
	}
	
	public java.lang.String getBrandPinyin() {
		return this.brandPinyin;
	}
	
	public void setBrandPinyin(java.lang.String value) {
		this.brandPinyin = value;
	}
	
	public java.lang.String getBrandLogo() {
		return this.brandLogo;
	}
	
	public void setBrandLogo(java.lang.String value) {
		this.brandLogo = value;
	}
	
	public java.lang.String getThumbBrandImg() {
		return this.thumbBrandImg;
	}
	
	public void setThumbBrandImg(java.lang.String value) {
		this.thumbBrandImg = value;
	}
	
	public java.lang.String getBrandImg() {
		return this.brandImg;
	}
	
	public void setBrandImg(java.lang.String value) {
		this.brandImg = value;
	}
	
	public java.lang.String getBrandCssPath() {
		return this.brandCssPath;
	}
	
	public void setBrandCssPath(java.lang.String value) {
		this.brandCssPath = value;
	}
	
	public java.lang.String getBrandIntro() {
		return this.brandIntro;
	}
	
	public void setBrandIntro(java.lang.String value) {
		this.brandIntro = value;
	}
	
	public java.lang.String getBrandSimpleIntro() {
		return this.brandSimpleIntro;
	}
	
	public void setBrandSimpleIntro(java.lang.String value) {
		this.brandSimpleIntro = value;
	}
	
	public java.lang.String getNature() {
		return this.nature;
	}
	
	public void setNature(java.lang.String value) {
		this.nature = value;
	}
	
	public java.lang.String getChineseNature() {
		return this.chineseNature;
	}
	
	public void setChineseNature(java.lang.String value) {
		this.chineseNature = value;
	}
	
	public java.lang.Integer getSort() {
		return this.sort;
	}
	
	public void setSort(java.lang.Integer value) {
		this.sort = value;
	}
	
	public java.lang.Integer getCmsBrandId() {
		return this.cmsBrandId;
	}
	
	public void setCmsBrandId(java.lang.Integer value) {
		this.cmsBrandId = value;
	}
	
	public java.lang.String getCmsBrandPath() {
		return this.cmsBrandPath;
	}
	
	public void setCmsBrandPath(java.lang.String value) {
		this.cmsBrandPath = value;
	}
	
	public java.lang.String getUrlPath() {
		return this.urlPath;
	}
	
	public void setUrlPath(java.lang.String value) {
		this.urlPath = value;
	}
	
	public java.lang.String getSeoInfo() {
		return this.seoInfo;
	}
	
	public void setSeoInfo(java.lang.String value) {
		this.seoInfo = value;
	}
	
	public java.lang.String getMaleSeoInfo() {
		return this.maleSeoInfo;
	}
	
	public void setMaleSeoInfo(java.lang.String value) {
		this.maleSeoInfo = value;
	}
	
	public java.lang.String getFemaleSeoInfo() {
		return this.femaleSeoInfo;
	}
	
	public void setFemaleSeoInfo(java.lang.String value) {
		this.femaleSeoInfo = value;
	}
	
	public java.lang.String getBannerImgPath() {
		return this.bannerImgPath;
	}
	
	public void setBannerImgPath(java.lang.String value) {
		this.bannerImgPath = value;
	}
	
	public java.lang.String getBannerLink() {
		return this.bannerLink;
	}
	
	public void setBannerLink(java.lang.String value) {
		this.bannerLink = value;
	}
	
	public java.lang.Integer getAddTime() {
		return this.addTime;
	}
	
	public void setAddTime(java.lang.Integer value) {
		this.addTime = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.util.Date getEditTimeBegin() {
		return this.editTimeBegin;
	}
	
	public void setEditTimeBegin(java.util.Date value) {
		this.editTimeBegin = value;
	}	
	
	public java.util.Date getEditTimeEnd() {
		return this.editTimeEnd;
	}
	
	public void setEditTimeEnd(java.util.Date value) {
		this.editTimeEnd = value;
	}
	
	public java.lang.Integer getEditUserId() {
		return this.editUserId;
	}
	
	public void setEditUserId(java.lang.Integer value) {
		this.editUserId = value;
	}
	
	public java.lang.String getAmazonName() {
		return this.amazonName;
	}
	
	public void setAmazonName(java.lang.String value) {
		this.amazonName = value;
	}
	
	public java.lang.Integer getCoo8BrandId() {
		return this.coo8BrandId;
	}
	
	public void setCoo8BrandId(java.lang.Integer value) {
		this.coo8BrandId = value;
	}
	
	public Integer getRecomLabel() {
		return this.recomLabel;
	}
	
	public void setRecomLabel(Integer value) {
		this.recomLabel = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

