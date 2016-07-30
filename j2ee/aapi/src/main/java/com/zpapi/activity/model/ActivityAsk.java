/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.activity.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

public class ActivityAsk extends BaseEntity implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	// alias
	public static final String TABLE_ALIAS = "ActivityAsk";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_PID = "问题id";
	public static final String ALIAS_TEXT = "文本（问题或答案）";
	public static final String ALIAS_SORT = "排序";
	public static final String ALIAS_IS_CORRECT = "是否正确答案";
	public static final String ALIAS_LEVEL = "难度级别 (1 初级 2中级 3高级)";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_IMG = "题目图片";

	// date formats

	// 可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	// columns START
	/**
	 * id db_column: id
	 */

	private java.lang.Integer id;
	/**
	 * 问题id db_column: pid
	 */
	@NotNull
	private java.lang.Integer pid;
	/**
	 * 文本（问题或答案） db_column: text
	 */
	@NotBlank
	@Length(max = 500)
	private java.lang.String text;
	/**
	 * 排序 db_column: sort
	 */
	@NotNull
	private java.lang.Integer sort;
	/**
	 * 是否正确答案 db_column: is_correct
	 */
	@NotNull
	@Max(127)
	private Integer isCorrect;
	/**
	 * 难度级别 (1 初级 2中级 3高级) db_column: level
	 */
	@NotNull
	@Max(127)
	private Integer level;
	/**
	 * 创建时间 db_column: create_time
	 */
	@NotNull
	private java.lang.Integer createTime;
	/**
	 * 题目图片 db_column: img
	 */
	@NotBlank
	@Length(max = 255)
	private java.lang.String img;

	// columns END

	public ActivityAsk() {
	}

	public ActivityAsk(java.lang.Integer id) {
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setPid(java.lang.Integer value) {
		this.pid = value;
	}

	public java.lang.Integer getPid() {
		return this.pid;
	}

	public void setText(java.lang.String value) {
		this.text = value;
	}

	public java.lang.String getText() {
		return this.text;
	}

	public void setSort(java.lang.Integer value) {
		this.sort = value;
	}

	public java.lang.Integer getSort() {
		return this.sort;
	}

	public void setIsCorrect(Integer value) {
		this.isCorrect = value;
	}

	public Integer getIsCorrect() {
		return this.isCorrect;
	}

	public void setLevel(Integer value) {
		this.level = value;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}

	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}

	public void setImg(java.lang.String value) {
		this.img = value;
	}

	public java.lang.String getImg() {
		return this.img;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("Id", getId())
				.append("Pid", getPid()).append("Text", getText()).append("Sort", getSort())
				.append("IsCorrect", getIsCorrect()).append("Level", getLevel())
				.append("CreateTime", getCreateTime()).append("Img", getImg()).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActivityAsk == false)
			return false;
		if (this == obj)
			return true;
		ActivityAsk other = (ActivityAsk) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();
	}
}
