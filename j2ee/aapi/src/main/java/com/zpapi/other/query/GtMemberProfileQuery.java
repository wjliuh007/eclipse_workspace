/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.query;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

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


public class GtMemberProfileQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** memberId */
	private java.lang.Long memberId;
	/** 昵称 */
	private java.lang.String username;
	/** realname */
	private java.lang.String realname;
	/** 用户当前等级 */
	private java.lang.Integer curLevel;
	/** 用户历史最高等级 */
	private java.lang.Integer topLevel;
	/** 总消费额 */
	private Long totalConsumption;
	/** 有效消费额 */
	private Long activeConsumption;
	/** 总成交订单数 */
	private java.lang.Integer activeOrderNum;
	/** email */
	private java.lang.String email;
	/** 是否为非有效邮箱： 0=> 有效邮箱 1=>无效邮箱 */
	private java.lang.Boolean emailIsNoneffective;
	/** emailCheck */
	private java.lang.Boolean emailCheck;
	/** checkSalt */
	private java.lang.String checkSalt;
	/** saltCreateTime */
	private java.lang.Integer saltCreateTime;
	/** receiveEmail */
	private java.lang.Boolean receiveEmail;
	/** 0=》女 1=》男 */
	private java.lang.Integer gender;
	/** avater */
	private java.lang.String avater;
	/** age */
	private java.lang.String age;
	/** 用户生日 */
	private java.lang.Integer birthday;
	/** 时尚顾问id */
	private java.lang.Integer advisId;
	/** mobile */
	private java.lang.String mobile;
	/** 份证身号 */
	private java.lang.String idcard;
	/** 会员等级 */
	private java.lang.Integer vipLevel;
	/** 会员类型 */
	private java.lang.String vipType;
	/** 余额 */
	private Long balance;
	/** 积分 */
	private Long score;
	/** 珍品币 */
	private Long points;
	/** gifts */
	private Long gifts;
	/** 订单完成数量 */
	private java.lang.Integer consumeTimes;
	/** 0=》未充值 1=》充值 */
	private java.lang.Integer isRecharge;
	/** company */
	private java.lang.String company;
	/** 行业 */
	private java.lang.String industry;
	/** 职位 */
	private java.lang.String position;
	/** income */
	private java.lang.String income;
	/** telephone */
	private java.lang.String telephone;
	/** qq */
	private java.lang.String qq;
	/** msn */
	private java.lang.String msn;
	/** height */
	private java.lang.Integer height;
	/** weight */
	private java.lang.Integer weight;
	/** 胸围 */
	private Integer chest;
	/** 腰围 */
	private Integer waist;
	/** 臀围 */
	private Integer hip;
	/** shoeSize */
	private Integer shoeSize;
	/** 当前居住地id */
	private java.lang.Integer liveProvinceRegionId;
	/** liveCityRegionId */
	private java.lang.Integer liveCityRegionId;
	/** liveTownRegionId */
	private java.lang.Integer liveTownRegionId;
	/** 用户家乡地区id */
	private java.lang.Integer hometownRegionId;
	/** 0=》未结婚 1=》结婚 */
	private java.lang.Boolean isMarried;
	/** 0=》没有 1=》有 */
	private java.lang.Boolean hasChild;
	/** 0=》没有 1=》有 */
	private java.lang.Boolean hasParent;
	/** regTime */
	private java.lang.Integer regTime;
	/** 邮件订阅；1=>订阅 0=>未订阅 */
	private java.lang.Boolean emailSubscribe;
	/** 短信订阅；1=>订阅 0=>未订阅 */
	private java.lang.Boolean shortMessageSubscribe;
	/** 1=>绑定 2=>未绑定 */
	private java.lang.Integer isBond;
	/** 哪些用户属性送过积分 */
	private java.lang.String addScoreLog;
	/** 最后一次下单时填写的地址ID */
	private java.lang.Integer lastOrderAddr;
	/** 最后一次下单时选择的支付方式序列化信息 */
	private java.lang.String lastOrderPayment;
	/** 最后一次下单时选择的配送时间信息id */
	private Integer lastOrderShippingtime;
	/** 最后一次下单时填写的发票序列化信息 */
	private java.lang.String lastOrderInvoiceInfo;
	/** 来源 */
	private java.lang.String source;
	/** hasCard */
	private java.lang.Boolean hasCard;
	/** hasPet */
	private java.lang.Boolean hasPet;
	/** hobby */
	private java.lang.String hobby;
	/** liveDetail */
	private java.lang.String liveDetail;
	/**注册来源 1：PC端    2：M端   3：APP端*/
	private java.lang.String  channel;

	public java.lang.String getChannel() {
		return channel;
	}

	public void setChannel(java.lang.String channel) {
		this.channel = channel;
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
	
	public java.lang.String getRealname() {
		return this.realname;
	}
	
	public void setRealname(java.lang.String value) {
		this.realname = value;
	}
	
	public java.lang.Integer getCurLevel() {
		return this.curLevel;
	}
	
	public void setCurLevel(java.lang.Integer value) {
		this.curLevel = value;
	}
	
	public java.lang.Integer getTopLevel() {
		return this.topLevel;
	}
	
	public void setTopLevel(java.lang.Integer value) {
		this.topLevel = value;
	}
	
	public Long getTotalConsumption() {
		return this.totalConsumption;
	}
	
	public void setTotalConsumption(Long value) {
		this.totalConsumption = value;
	}
	
	public Long getActiveConsumption() {
		return this.activeConsumption;
	}
	
	public void setActiveConsumption(Long value) {
		this.activeConsumption = value;
	}
	
	public java.lang.Integer getActiveOrderNum() {
		return this.activeOrderNum;
	}
	
	public void setActiveOrderNum(java.lang.Integer value) {
		this.activeOrderNum = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.Boolean getEmailIsNoneffective() {
		return this.emailIsNoneffective;
	}
	
	public void setEmailIsNoneffective(java.lang.Boolean value) {
		this.emailIsNoneffective = value;
	}
	
	public java.lang.Boolean getEmailCheck() {
		return this.emailCheck;
	}
	
	public void setEmailCheck(java.lang.Boolean value) {
		this.emailCheck = value;
	}
	
	public java.lang.String getCheckSalt() {
		return this.checkSalt;
	}
	
	public void setCheckSalt(java.lang.String value) {
		this.checkSalt = value;
	}
	
	public java.lang.Integer getSaltCreateTime() {
		return this.saltCreateTime;
	}
	
	public void setSaltCreateTime(java.lang.Integer value) {
		this.saltCreateTime = value;
	}
	
	public java.lang.Boolean getReceiveEmail() {
		return this.receiveEmail;
	}
	
	public void setReceiveEmail(java.lang.Boolean value) {
		this.receiveEmail = value;
	}
	
	public java.lang.Integer getGender() {
		return this.gender;
	}
	
	public void setGender(java.lang.Integer value) {
		this.gender = value;
	}
	
	public java.lang.String getAvater() {
		return this.avater;
	}
	
	public void setAvater(java.lang.String value) {
		this.avater = value;
	}
	
	public java.lang.String getAge() {
		return this.age;
	}
	
	public void setAge(java.lang.String value) {
		this.age = value;
	}
	
	public java.lang.Integer getBirthday() {
		return this.birthday;
	}
	
	public void setBirthday(java.lang.Integer value) {
		this.birthday = value;
	}
	
	public java.lang.Integer getAdvisId() {
		return this.advisId;
	}
	
	public void setAdvisId(java.lang.Integer value) {
		this.advisId = value;
	}
	
	public java.lang.String getMobile() {
		return this.mobile;
	}
	
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	public java.lang.String getIdcard() {
		return this.idcard;
	}
	
	public void setIdcard(java.lang.String value) {
		this.idcard = value;
	}
	
	public java.lang.Integer getVipLevel() {
		return this.vipLevel;
	}
	
	public void setVipLevel(java.lang.Integer value) {
		this.vipLevel = value;
	}
	
	public java.lang.String getVipType() {
		return this.vipType;
	}
	
	public void setVipType(java.lang.String value) {
		this.vipType = value;
	}
	
	public Long getBalance() {
		return this.balance;
	}
	
	public void setBalance(Long value) {
		this.balance = value;
	}
	
	public Long getScore() {
		return this.score;
	}
	
	public void setScore(Long value) {
		this.score = value;
	}
	
	public Long getPoints() {
		return this.points;
	}
	
	public void setPoints(Long value) {
		this.points = value;
	}
	
	public Long getGifts() {
		return this.gifts;
	}
	
	public void setGifts(Long value) {
		this.gifts = value;
	}
	
	public java.lang.Integer getConsumeTimes() {
		return this.consumeTimes;
	}
	
	public void setConsumeTimes(java.lang.Integer value) {
		this.consumeTimes = value;
	}
	
	public java.lang.Integer getIsRecharge() {
		return this.isRecharge;
	}
	
	public void setIsRecharge(java.lang.Integer value) {
		this.isRecharge = value;
	}
	
	public java.lang.String getCompany() {
		return this.company;
	}
	
	public void setCompany(java.lang.String value) {
		this.company = value;
	}
	
	public java.lang.String getIndustry() {
		return this.industry;
	}
	
	public void setIndustry(java.lang.String value) {
		this.industry = value;
	}
	
	public java.lang.String getPosition() {
		return this.position;
	}
	
	public void setPosition(java.lang.String value) {
		this.position = value;
	}
	
	public java.lang.String getIncome() {
		return this.income;
	}
	
	public void setIncome(java.lang.String value) {
		this.income = value;
	}
	
	public java.lang.String getTelephone() {
		return this.telephone;
	}
	
	public void setTelephone(java.lang.String value) {
		this.telephone = value;
	}
	
	public java.lang.String getQq() {
		return this.qq;
	}
	
	public void setQq(java.lang.String value) {
		this.qq = value;
	}
	
	public java.lang.String getMsn() {
		return this.msn;
	}
	
	public void setMsn(java.lang.String value) {
		this.msn = value;
	}
	
	public java.lang.Integer getHeight() {
		return this.height;
	}
	
	public void setHeight(java.lang.Integer value) {
		this.height = value;
	}
	
	public java.lang.Integer getWeight() {
		return this.weight;
	}
	
	public void setWeight(java.lang.Integer value) {
		this.weight = value;
	}
	
	public Integer getChest() {
		return this.chest;
	}
	
	public void setChest(Integer value) {
		this.chest = value;
	}
	
	public Integer getWaist() {
		return this.waist;
	}
	
	public void setWaist(Integer value) {
		this.waist = value;
	}
	
	public Integer getHip() {
		return this.hip;
	}
	
	public void setHip(Integer value) {
		this.hip = value;
	}
	
	public Integer getShoeSize() {
		return this.shoeSize;
	}
	
	public void setShoeSize(Integer value) {
		this.shoeSize = value;
	}
	
	public java.lang.Integer getLiveProvinceRegionId() {
		return this.liveProvinceRegionId;
	}
	
	public void setLiveProvinceRegionId(java.lang.Integer value) {
		this.liveProvinceRegionId = value;
	}
	
	public java.lang.Integer getLiveCityRegionId() {
		return this.liveCityRegionId;
	}
	
	public void setLiveCityRegionId(java.lang.Integer value) {
		this.liveCityRegionId = value;
	}
	
	public java.lang.Integer getLiveTownRegionId() {
		return this.liveTownRegionId;
	}
	
	public void setLiveTownRegionId(java.lang.Integer value) {
		this.liveTownRegionId = value;
	}
	
	public java.lang.Integer getHometownRegionId() {
		return this.hometownRegionId;
	}
	
	public void setHometownRegionId(java.lang.Integer value) {
		this.hometownRegionId = value;
	}
	
	public java.lang.Boolean getIsMarried() {
		return this.isMarried;
	}
	
	public void setIsMarried(java.lang.Boolean value) {
		this.isMarried = value;
	}
	
	public java.lang.Boolean getHasChild() {
		return this.hasChild;
	}
	
	public void setHasChild(java.lang.Boolean value) {
		this.hasChild = value;
	}
	
	public java.lang.Boolean getHasParent() {
		return this.hasParent;
	}
	
	public void setHasParent(java.lang.Boolean value) {
		this.hasParent = value;
	}
	
	public java.lang.Integer getRegTime() {
		return this.regTime;
	}
	
	public void setRegTime(java.lang.Integer value) {
		this.regTime = value;
	}
	
	public java.lang.Boolean getEmailSubscribe() {
		return this.emailSubscribe;
	}
	
	public void setEmailSubscribe(java.lang.Boolean value) {
		this.emailSubscribe = value;
	}
	
	public java.lang.Boolean getShortMessageSubscribe() {
		return this.shortMessageSubscribe;
	}
	
	public void setShortMessageSubscribe(java.lang.Boolean value) {
		this.shortMessageSubscribe = value;
	}
	
	public Integer getIsBond() {
		return this.isBond;
	}
	
	public void setIsBond(Integer value) {
		this.isBond = value;
	}
	
	public java.lang.String getAddScoreLog() {
		return this.addScoreLog;
	}
	
	public void setAddScoreLog(java.lang.String value) {
		this.addScoreLog = value;
	}
	
	public java.lang.Integer getLastOrderAddr() {
		return this.lastOrderAddr;
	}
	
	public void setLastOrderAddr(java.lang.Integer value) {
		this.lastOrderAddr = value;
	}
	
	public java.lang.String getLastOrderPayment() {
		return this.lastOrderPayment;
	}
	
	public void setLastOrderPayment(java.lang.String value) {
		this.lastOrderPayment = value;
	}
	
	public Integer getLastOrderShippingtime() {
		return this.lastOrderShippingtime;
	}
	
	public void setLastOrderShippingtime(Integer value) {
		this.lastOrderShippingtime = value;
	}
	
	public java.lang.String getLastOrderInvoiceInfo() {
		return this.lastOrderInvoiceInfo;
	}
	
	public void setLastOrderInvoiceInfo(java.lang.String value) {
		this.lastOrderInvoiceInfo = value;
	}
	
	public java.lang.String getSource() {
		return this.source;
	}
	
	public void setSource(java.lang.String value) {
		this.source = value;
	}
	
	public java.lang.Boolean getHasCard() {
		return this.hasCard;
	}
	
	public void setHasCard(java.lang.Boolean value) {
		this.hasCard = value;
	}
	
	public java.lang.Boolean getHasPet() {
		return this.hasPet;
	}
	
	public void setHasPet(java.lang.Boolean value) {
		this.hasPet = value;
	}
	
	public java.lang.String getHobby() {
		return this.hobby;
	}
	
	public void setHobby(java.lang.String value) {
		this.hobby = value;
	}
	
	public java.lang.String getLiveDetail() {
		return this.liveDetail;
	}
	
	public void setLiveDetail(java.lang.String value) {
		this.liveDetail = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

