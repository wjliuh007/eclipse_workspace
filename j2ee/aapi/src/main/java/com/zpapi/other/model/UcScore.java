/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.zhen.commons.base.BaseEntity;

import java.util.*;

import javacommon.base.*;
import javacommon.util.*;
import cn.org.rapid_framework.util.*;
import cn.org.rapid_framework.web.util.*;
import cn.org.rapid_framework.page.*;
import cn.org.rapid_framework.page.impl.*;


/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class UcScore extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "UcScore";
	public static final String ALIAS_UID = "uid";
	public static final String ALIAS_SHOP_SCORE = "shopScore";
	public static final String ALIAS_SNS_SCORE = "snsScore";
	public static final String ALIAS_CMS_SCORE = "cms中获得的积分";
	public static final String ALIAS_TOTAL_SCORE = "totalScore";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * uid       db_column: uid 
     */	
	
	private java.lang.Long uid;
    /**
     * shopScore       db_column: shop_score 
     */	
	@NotNull 
	private java.lang.Integer shopScore;
    /**
     * snsScore       db_column: sns_score 
     */	
	@NotNull 
	private java.lang.Integer snsScore;
    /**
     * cms中获得的积分       db_column: cms_score 
     */	
	@NotNull 
	private java.lang.Integer cmsScore;
    /**
     * totalScore       db_column: total_score 
     */	
	@NotNull 
	private java.lang.Integer totalScore;
	//columns END

	public UcScore(){
	}

	public UcScore(
		java.lang.Long uid
	){
		this.uid = uid;
	}

	public void setUid(java.lang.Long value) {
		this.uid = value;
	}
	
	public java.lang.Long getUid() {
		return this.uid;
	}
	public void setShopScore(java.lang.Integer value) {
		this.shopScore = value;
	}
	
	public java.lang.Integer getShopScore() {
		return this.shopScore;
	}
	public void setSnsScore(java.lang.Integer value) {
		this.snsScore = value;
	}
	
	public java.lang.Integer getSnsScore() {
		return this.snsScore;
	}
	public void setCmsScore(java.lang.Integer value) {
		this.cmsScore = value;
	}
	
	public java.lang.Integer getCmsScore() {
		return this.cmsScore;
	}
	public void setTotalScore(java.lang.Integer value) {
		this.totalScore = value;
	}
	
	public java.lang.Integer getTotalScore() {
		return this.totalScore;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Uid",getUid())
			.append("ShopScore",getShopScore())
			.append("SnsScore",getSnsScore())
			.append("CmsScore",getCmsScore())
			.append("TotalScore",getTotalScore())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUid())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof UcScore == false) return false;
		if(this == obj) return true;
		UcScore other = (UcScore)obj;
		return new EqualsBuilder()
			.append(getUid(),other.getUid())
			.isEquals();
	}
}

