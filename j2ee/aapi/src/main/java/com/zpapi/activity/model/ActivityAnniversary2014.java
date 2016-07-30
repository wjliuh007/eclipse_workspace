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

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

public class ActivityAnniversary2014 extends BaseEntity implements java.io.Serializable {
	private static final long serialVersionUID = 5454155825314635342L;

	// alias
	public static final String TABLE_ALIAS = "ActivityAnniversary2014";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_MEMBER_ID = "memberId";
	public static final String ALIAS_TIME = "time";
	public static final String ALIAS_LEVEL = "已经答对的题目级别(0未开始 1初级 2中级 3高级)";
	public static final String ALIAS_IS_GET_CARD = "是否已经获得优惠券";
	public static final String ALIAS_FINISHED = "答题是否结束 ";

	// date formats

	// 可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	// columns START
	/**
	 * id db_column: id
	 */

	private java.lang.Integer id;
	/**
	 * memberId db_column: member_id
	 */
	@NotNull
	private java.lang.Long memberId;
	/**
	 * time db_column: time
	 */
	@NotNull
	private java.lang.Integer time;
	/**
	 * 已经答对的题目级别(0未开始 1初级 2中级 3高级) db_column: level
	 */
	@NotNull
	@Max(127)
	private Integer level;
	/**
	 * 是否已经获得优惠券 db_column: is_get_card
	 */
	@NotNull
	@Max(127)
	private Integer isGetCard;
	/**
	 * 答题是否结束 db_column: finished
	 */
	@NotNull
	@Max(127)
	private Integer finished;

	// columns END

	public ActivityAnniversary2014() {
	}

	public ActivityAnniversary2014(java.lang.Integer id) {
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}

	public java.lang.Long getMemberId() {
		return this.memberId;
	}

	public void setTime(java.lang.Integer value) {
		this.time = value;
	}

	public java.lang.Integer getTime() {
		return this.time;
	}

	public void setLevel(Integer value) {
		this.level = value;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setIsGetCard(Integer value) {
		this.isGetCard = value;
	}

	public Integer getIsGetCard() {
		return this.isGetCard;
	}

	public void setFinished(Integer value) {
		this.finished = value;
	}

	public Integer getFinished() {
		return this.finished;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("Id", getId())
				.append("MemberId", getMemberId()).append("Time", getTime()).append("Level", getLevel())
				.append("IsGetCard", getIsGetCard()).append("Finished", getFinished()).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ActivityAnniversary2014 == false)
			return false;
		if (this == obj)
			return true;
		ActivityAnniversary2014 other = (ActivityAnniversary2014) obj;
		return new EqualsBuilder().append(getId(), other.getId()).isEquals();
	}
}
