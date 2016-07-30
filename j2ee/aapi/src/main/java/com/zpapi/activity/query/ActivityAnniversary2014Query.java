/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.activity.query;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.zpapi.other.query.BaseQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class ActivityAnniversary2014Query extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** memberId */
	private java.lang.Long memberId;
	/** username */
	private java.lang.String username;
	/** time */
	private java.lang.Integer time;
	/** 已经答对的题目级别(0未开始 1初级 2中级 3高级) */
	private Integer level;
	/** 是否已经获得优惠券 */
	private Integer isGetCard;
	/** 答题是否结束  */
	private Integer finished;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.Integer getTime() {
		return this.time;
	}
	
	public void setTime(java.lang.Integer value) {
		this.time = value;
	}
	
	public Integer getLevel() {
		return this.level;
	}
	
	public void setLevel(Integer value) {
		this.level = value;
	}
	
	public Integer getIsGetCard() {
		return this.isGetCard;
	}
	
	public void setIsGetCard(Integer value) {
		this.isGetCard = value;
	}
	
	public Integer getFinished() {
		return this.finished;
	}
	
	public void setFinished(Integer value) {
		this.finished = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

