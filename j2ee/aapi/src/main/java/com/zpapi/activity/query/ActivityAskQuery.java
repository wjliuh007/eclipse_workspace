/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.activity.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.zpapi.other.query.BaseQuery;

import java.io.Serializable;
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


public class ActivityAskQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** 问题id */
	private java.lang.Integer pid;
	/** 文本（问题或答案） */
	private java.lang.String text;
	/** 排序 */
	private java.lang.Integer sort;
	/** 是否正确答案 */
	private Integer isCorrect;
	/** 难度级别 (1 初级 2中级 3高级) */
	private Integer level;
	/** 创建时间 */
	private java.lang.Integer createTime;
	/** 题目图片 */
	private java.lang.String img;

	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getPid() {
		return this.pid;
	}
	
	public void setPid(java.lang.Integer value) {
		this.pid = value;
	}
	
	public java.lang.String getText() {
		return this.text;
	}
	
	public void setText(java.lang.String value) {
		this.text = value;
	}
	
	public java.lang.Integer getSort() {
		return this.sort;
	}
	
	public void setSort(java.lang.Integer value) {
		this.sort = value;
	}
	
	public Integer getIsCorrect() {
		return this.isCorrect;
	}
	
	public void setIsCorrect(Integer value) {
		this.isCorrect = value;
	}
	
	public Integer getLevel() {
		return this.level;
	}
	
	public void setLevel(Integer value) {
		this.level = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.String getImg() {
		return this.img;
	}
	
	public void setImg(java.lang.String value) {
		this.img = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

