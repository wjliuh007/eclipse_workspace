/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
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


public class UcScoreQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** uid */
	private java.lang.Long uid;
	/** shopScore */
	private java.lang.Integer shopScore;
	/** snsScore */
	private java.lang.Integer snsScore;
	/** cms中获得的积分 */
	private java.lang.Integer cmsScore;
	/** totalScore */
	private java.lang.Integer totalScore;

	public java.lang.Long getUid() {
		return this.uid;
	}
	
	public void setUid(java.lang.Long value) {
		this.uid = value;
	}
	
	public java.lang.Integer getShopScore() {
		return this.shopScore;
	}
	
	public void setShopScore(java.lang.Integer value) {
		this.shopScore = value;
	}
	
	public java.lang.Integer getSnsScore() {
		return this.snsScore;
	}
	
	public void setSnsScore(java.lang.Integer value) {
		this.snsScore = value;
	}
	
	public java.lang.Integer getCmsScore() {
		return this.cmsScore;
	}
	
	public void setCmsScore(java.lang.Integer value) {
		this.cmsScore = value;
	}
	
	public java.lang.Integer getTotalScore() {
		return this.totalScore;
	}
	
	public void setTotalScore(java.lang.Integer value) {
		this.totalScore = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

