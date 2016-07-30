/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;

import java.util.HashMap;
import java.util.Map;

import javacommon.CacheKeyConst;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import cn.org.rapid_framework.util.DateConvertUtils;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtGoodsBrand extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtGoodsBrand";
	public static final String ALIAS_BRAND_ID = "品牌ID";
	public static final String ALIAS_IS_TOP = "是否为顶级品牌 1=是 0=否";
	public static final String ALIAS_BRAND_NAME = "品牌名称";
	public static final String ALIAS_BRAND_NAME_SECOND = "品牌补充名称";
	public static final String ALIAS_BRAND_PINYIN = "中文品牌名拼音";
	public static final String ALIAS_BRAND_LOGO = "详情页图片地址";
	public static final String ALIAS_THUMB_BRAND_IMG = "品牌logo缩略图";
	public static final String ALIAS_BRAND_IMG = "品牌logo";
	public static final String ALIAS_BRAND_CSS_PATH = "个性化样式路径";
	public static final String ALIAS_BRAND_INTRO = "品牌介绍";
	public static final String ALIAS_BRAND_SIMPLE_INTRO = "品牌简单描述";
	public static final String ALIAS_NATURE = "品牌标签";
	public static final String ALIAS_CHINESE_NATURE = "中文标签";
	public static final String ALIAS_SORT = "排序";
	public static final String ALIAS_CMS_BRAND_ID = "cms里的brand的分类编号";
	public static final String ALIAS_CMS_BRAND_PATH = "cms品牌路径";
	public static final String ALIAS_URL_PATH = "网址参数";
	public static final String ALIAS_SEO_INFO = "seo信息";
	public static final String ALIAS_MALE_SEO_INFO = "男士seo信息";
	public static final String ALIAS_FEMALE_SEO_INFO = "女士seo信息";
	public static final String ALIAS_BANNER_IMG_PATH = "品牌图片地址";
	public static final String ALIAS_BANNER_LINK = "品牌图片链接";
	public static final String ALIAS_ADD_TIME = "addTime";
	public static final String ALIAS_USER_ID = "userId";
	public static final String ALIAS_EDIT_TIME = "editTime";
	public static final String ALIAS_EDIT_USER_ID = "editUserId";
	public static final String ALIAS_AMAZON_NAME = "亚马逊品牌名";
	public static final String ALIAS_COO8_BRAND_ID = "库巴品牌id";
	public static final String ALIAS_GOODS_NUM = "当前品牌下的商品数量";
	public static final String ALIAS_RECOM_LABEL = "推荐标签 1=》HOT，2=》NEW";
	public static final String ALIAS_APP_IMG = "app端品牌图";
	public static final String ALIAS_APP_BRAND_NAME = "app品牌名称";
	public static final String ALIAS_APP_SORT = "app权重";
	public static final String ALIAS_APP_SHOW = "是否在app显示1->显示，0->不显示";
	public static final String ALIAS_APP_STATUS = "启用状态  1->启用，0->不启用";
	
	//date formats
	public static final String FORMAT_EDIT_TIME = DATE_FORMAT;
	
	public static final int SUB_CACHE_KEY_NATURE = 1;
	public static final int SUB_CACHE_KEY_ALL = 2;
	public static final int SUB_CACHE_KEY_NAME = 3;//模糊品牌名称
	
	public static String getCacheKey(int type) {
		switch(type){
			case 1:
				return getCacheKey()+"nature_";//key:品牌首字母，value:所有该字母开头品牌信息
			case 2:
				return getCacheKey()+"all_";//key:品牌all，value:所有品牌信息
			case 3:
				return getCacheKey()+"name_";//key:品牌all，value:所有品牌信息
			default:
				return CacheKeyConst.GtGoodsBrand;
	}
	}
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * 品牌ID       db_column: brand_id 
     */	
	
	private java.lang.Integer brandId;
    /**
     * 是否为顶级品牌 1=是 0=否       db_column: is_top 
     */	
	@NotNull 
	private java.lang.Boolean isTop;
    /**
     * 品牌名称       db_column: brand_name 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String brandName;
    /**
     * 品牌补充名称       db_column: brand_name_second 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String brandNameSecond;
    /**
     * 中文品牌名拼音       db_column: brand_pinyin 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String brandPinyin;
    /**
     * 详情页图片地址       db_column: brand_logo 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String brandLogo;
    /**
     * 品牌logo缩略图       db_column: thumb_brand_img 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String thumbBrandImg;
    /**
     * 品牌logo       db_column: brand_img 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String brandImg;
    /**
     * 个性化样式路径       db_column: brand_css_path 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String brandCssPath;
    /**
     * 品牌介绍       db_column: brand_intro 
     */	
	@NotBlank @Length(max=65535)
	private java.lang.String brandIntro;
    /**
     * 品牌简单描述       db_column: brand_simple_intro 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String brandSimpleIntro;
    /**
     * 品牌标签       db_column: nature 
     */	
	@NotBlank @Length(max=4)
	private java.lang.String nature;
    /**
     * 中文标签       db_column: chinese_nature 
     */	
	@NotBlank @Length(max=4)
	private java.lang.String chineseNature;
    /**
     * 排序       db_column: sort 
     */	
	@NotNull 
	private java.lang.Integer sort;
    /**
     * cms里的brand的分类编号       db_column: cms_brand_id 
     */	
	@NotNull 
	private java.lang.Integer cmsBrandId;
    /**
     * cms品牌路径       db_column: cms_brand_path 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String cmsBrandPath;
    /**
     * 网址参数       db_column: url_path 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String urlPath;
    /**
     * seo信息       db_column: seo_info 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String seoInfo;
    /**
     * 男士seo信息       db_column: male_seo_info 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String maleSeoInfo;
    /**
     * 女士seo信息       db_column: female_seo_info 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String femaleSeoInfo;
    /**
     * 品牌图片地址       db_column: banner_img_path 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String bannerImgPath;
    /**
     * 品牌图片链接       db_column: banner_link 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String bannerLink;
    /**
     * addTime       db_column: add_time 
     */	
	@NotNull 
	private java.lang.Integer addTime;
    /**
     * userId       db_column: user_id 
     */	
	@NotNull 
	private java.lang.Integer userId;
    /**
     * editTime       db_column: edit_time 
     */	
	@NotNull 
	private java.util.Date editTime;
    /**
     * editUserId       db_column: edit_user_id 
     */	
	@NotNull 
	private java.lang.Integer editUserId;
    /**
     * 亚马逊品牌名       db_column: amazon_name 
     */	
	@Length(max=50)
	private java.lang.String amazonName;
    /**
     * 库巴品牌id       db_column: coo8_brand_id 
     */	
	@NotNull 
	private java.lang.Integer coo8BrandId;
    /**
     * 推荐标签 1=》HOT，2=》NEW       db_column: recom_label 
     */	
	@Max(127)
	private Integer recomLabel;
    /**
     * app端品牌长图       db_column: app_img 
     */	
	@Length(max=255)
	private java.lang.String appImg;
	/**
     * app端品牌方图       db_column: app_img 
     */	
	@Length(max=255)
	private java.lang.String appSmallImg;
    /**
     * app品牌名称       db_column: app_brand_name 
     */	
	@Length(max=50)
	private java.lang.String appBrandName;
    /**
     * app权重       db_column: app_sort 
     */	
	
	private java.lang.Integer appSort;
    /**
     * 是否在app显示1->显示，0->不显示       db_column: app_show 
     */	
	
	private java.lang.Boolean appShow;
    /**
     * 启用状态  1->启用，0->不启用       db_column: app_status 
     */	
	
	private java.lang.Boolean appStatus;
	//columns END

	public GtGoodsBrand(){
	}

	public GtGoodsBrand(
		java.lang.Integer brandId
	){
		this.brandId = brandId;
	}

	public void setBrandId(java.lang.Integer value) {
		this.brandId = value;
	}
	
	public java.lang.Integer getBrandId() {
		return this.brandId;
	}
	public void setIsTop(java.lang.Boolean value) {
		this.isTop = value;
	}
	
	public java.lang.Boolean getIsTop() {
		return this.isTop;
	}
	public void setBrandName(java.lang.String value) {
		this.brandName = value;
	}
	
	public java.lang.String getBrandName() {
		return this.brandName;
	}
	public void setBrandNameSecond(java.lang.String value) {
		this.brandNameSecond = value;
	}
	
	public java.lang.String getBrandNameSecond() {
		return this.brandNameSecond;
	}
	public void setBrandPinyin(java.lang.String value) {
		this.brandPinyin = value;
	}
	
	public java.lang.String getBrandPinyin() {
		return this.brandPinyin;
	}
	public void setBrandLogo(java.lang.String value) {
		this.brandLogo = value;
	}
	
	public java.lang.String getBrandLogo() {
		return this.brandLogo;
	}
	public void setThumbBrandImg(java.lang.String value) {
		this.thumbBrandImg = value;
	}
	
	public java.lang.String getThumbBrandImg() {
		return this.thumbBrandImg;
	}
	public void setBrandImg(java.lang.String value) {
		this.brandImg = value;
	}
	
	public java.lang.String getBrandImg() {
		return this.brandImg;
	}
	public void setBrandCssPath(java.lang.String value) {
		this.brandCssPath = value;
	}
	
	public java.lang.String getBrandCssPath() {
		return this.brandCssPath;
	}
	public void setBrandIntro(java.lang.String value) {
		this.brandIntro = value;
	}
	
	public java.lang.String getBrandIntro() {
		return this.brandIntro;
	}
	public void setBrandSimpleIntro(java.lang.String value) {
		this.brandSimpleIntro = value;
	}
	
	public java.lang.String getBrandSimpleIntro() {
		return this.brandSimpleIntro;
	}
	public void setNature(java.lang.String value) {
		this.nature = value;
	}
	
	public java.lang.String getNature() {
		return this.nature;
	}
	public void setChineseNature(java.lang.String value) {
		this.chineseNature = value;
	}
	
	public java.lang.String getChineseNature() {
		return this.chineseNature;
	}
	public void setSort(java.lang.Integer value) {
		this.sort = value;
	}
	
	public java.lang.Integer getSort() {
		return this.sort;
	}
	public void setCmsBrandId(java.lang.Integer value) {
		this.cmsBrandId = value;
	}
	
	public java.lang.Integer getCmsBrandId() {
		return this.cmsBrandId;
	}
	public void setCmsBrandPath(java.lang.String value) {
		this.cmsBrandPath = value;
	}
	
	public java.lang.String getCmsBrandPath() {
		return this.cmsBrandPath;
	}
	public void setUrlPath(java.lang.String value) {
		this.urlPath = value;
	}
	
	public java.lang.String getUrlPath() {
		return this.urlPath;
	}
	public void setSeoInfo(java.lang.String value) {
		this.seoInfo = value;
	}
	
	public java.lang.String getSeoInfo() {
		return this.seoInfo;
	}
	public void setMaleSeoInfo(java.lang.String value) {
		this.maleSeoInfo = value;
	}
	
	public java.lang.String getMaleSeoInfo() {
		return this.maleSeoInfo;
	}
	public void setFemaleSeoInfo(java.lang.String value) {
		this.femaleSeoInfo = value;
	}
	
	public java.lang.String getFemaleSeoInfo() {
		return this.femaleSeoInfo;
	}
	public void setBannerImgPath(java.lang.String value) {
		this.bannerImgPath = value;
	}
	
	public java.lang.String getBannerImgPath() {
		return this.bannerImgPath;
	}
	public void setBannerLink(java.lang.String value) {
		this.bannerLink = value;
	}
	
	public java.lang.String getBannerLink() {
		return this.bannerLink;
	}
	public void setAddTime(java.lang.Integer value) {
		this.addTime = value;
	}
	
	public java.lang.Integer getAddTime() {
		return this.addTime;
	}
	public void setUserId(java.lang.Integer value) {
		this.userId = value;
	}
	
	public java.lang.Integer getUserId() {
		return this.userId;
	}
	public String getEditTimeString() {
		return DateConvertUtils.format(getEditTime(), FORMAT_EDIT_TIME);
	}
	public void setEditTimeString(String value) {
		setEditTime(DateConvertUtils.parse(value, FORMAT_EDIT_TIME,java.util.Date.class));
	}
	
	public void setEditTime(java.util.Date value) {
		this.editTime = value;
	}
	
	public java.util.Date getEditTime() {
		return this.editTime;
	}
	public void setEditUserId(java.lang.Integer value) {
		this.editUserId = value;
	}
	
	public java.lang.Integer getEditUserId() {
		return this.editUserId;
	}
	public void setAmazonName(java.lang.String value) {
		this.amazonName = value;
	}
	
	public java.lang.String getAmazonName() {
		return this.amazonName;
	}
	public void setCoo8BrandId(java.lang.Integer value) {
		this.coo8BrandId = value;
	}
	
	public java.lang.Integer getCoo8BrandId() {
		return this.coo8BrandId;
	}
	public void setRecomLabel(Integer value) {
		this.recomLabel = value;
	}
	
	public Integer getRecomLabel() {
		return this.recomLabel;
	}
	public void setAppImg(java.lang.String value) {
		this.appImg = value;
	}
	public java.lang.String getAppImg() {
		return this.appImg;
	}
	public void setAppSmallImg(java.lang.String value) {
		this.appSmallImg = value;
	}
	public java.lang.String getAppSmallImg() {
		return this.appSmallImg;
	}
	public void setAppBrandName(java.lang.String value) {
		this.appBrandName = value;
	}
	
	public java.lang.String getAppBrandName() {
		return this.appBrandName;
	}
	public void setAppSort(java.lang.Integer value) {
		this.appSort = value;
	}
	
	public java.lang.Integer getAppSort() {
		return this.appSort;
	}
	public void setAppShow(java.lang.Boolean value) {
		this.appShow = value;
	}
	
	public java.lang.Boolean getAppShow() {
		return this.appShow;
	}
	public void setAppStatus(java.lang.Boolean value) {
		this.appStatus = value;
	}
	
	public java.lang.Boolean getAppStatus() {
		return this.appStatus;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("BrandId",getBrandId())
			.append("IsTop",getIsTop())
			.append("BrandName",getBrandName())
			.append("BrandNameSecond",getBrandNameSecond())
			.append("BrandPinyin",getBrandPinyin())
			.append("BrandLogo",getBrandLogo())
			.append("ThumbBrandImg",getThumbBrandImg())
			.append("BrandImg",getBrandImg())
			.append("BrandCssPath",getBrandCssPath())
			.append("BrandIntro",getBrandIntro())
			.append("BrandSimpleIntro",getBrandSimpleIntro())
			.append("Nature",getNature())
			.append("ChineseNature",getChineseNature())
			.append("Sort",getSort())
			.append("CmsBrandId",getCmsBrandId())
			.append("CmsBrandPath",getCmsBrandPath())
			.append("UrlPath",getUrlPath())
			.append("SeoInfo",getSeoInfo())
			.append("MaleSeoInfo",getMaleSeoInfo())
			.append("FemaleSeoInfo",getFemaleSeoInfo())
			.append("BannerImgPath",getBannerImgPath())
			.append("BannerLink",getBannerLink())
			.append("AddTime",getAddTime())
			.append("UserId",getUserId())
			.append("EditTime",getEditTime())
			.append("EditUserId",getEditUserId())
			.append("AmazonName",getAmazonName())
			.append("Coo8BrandId",getCoo8BrandId())
			.append("RecomLabel",getRecomLabel())
			.append("AppImg",getAppImg())
			.append("AppBrandName",getAppBrandName())
			.append("AppSort",getAppSort())
			.append("AppShow",getAppShow())
			.append("AppStatus",getAppStatus())
			.toString();
	}
	
	/**
	 * 
	 * @Title: getCacheKey 
	 * @Description: 获取po的缓存key唯一标识
	 * @return 
	 * @author zhupengren
	 * @date 2014年9月30日 下午2:53:12
	 */
	public static String getCacheKey() {
		return CacheKeyConst.GtGoodsBrand;
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getBrandId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtGoodsBrand == false) return false;
		if(this == obj) return true;
		GtGoodsBrand other = (GtGoodsBrand)obj;
		return new EqualsBuilder()
			.append(getBrandId(),other.getBrandId())
			.isEquals();
	}

	public Map<String, Object> getResultMap() {
		Map<String, Object> pMap = new HashMap<String, Object>(5);
		pMap.put("brandId", this.getBrandId());
		pMap.put("brandName", this.getBrandName());
		pMap.put("brandNameSecond", this.getBrandNameSecond());
		pMap.put("brandUrlPath", this.getUrlPath());
		pMap.put("brandImg", this.getBrandImg());
		return pMap;
	}

}

