/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtMemberProfile extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtMemberProfile";
	public static final String ALIAS_MEMBER_ID = "memberId";
	public static final String ALIAS_USERNAME = "昵称";
	public static final String ALIAS_REALNAME = "realname";
	public static final String ALIAS_CUR_LEVEL = "用户当前等级";
	public static final String ALIAS_TOP_LEVEL = "用户历史最高等级";
	public static final String ALIAS_TOTAL_CONSUMPTION = "总消费额";
	public static final String ALIAS_ACTIVE_CONSUMPTION = "有效消费额";
	public static final String ALIAS_ACTIVE_ORDER_NUM = "总成交订单数";
	public static final String ALIAS_EMAIL = "email";
	public static final String ALIAS_EMAIL_IS_NONEFFECTIVE = "是否为非有效邮箱： 0=> 有效邮箱 1=>无效邮箱";
	public static final String ALIAS_EMAIL_CHECK = "emailCheck";
	public static final String ALIAS_CHECK_SALT = "checkSalt";
	public static final String ALIAS_SALT_CREATE_TIME = "saltCreateTime";
	public static final String ALIAS_RECEIVE_EMAIL = "receiveEmail";
	public static final String ALIAS_GENDER = "0=》女 1=》男";
	public static final String ALIAS_AVATER = "avater";
	public static final String ALIAS_AGE = "age";
	public static final String ALIAS_BIRTHDAY = "用户生日";
	public static final String ALIAS_ADVIS_ID = "时尚顾问id";
	public static final String ALIAS_MOBILE = "mobile";
	public static final String ALIAS_IDCARD = "份证身号";
	public static final String ALIAS_VIP_LEVEL = "会员等级";
	public static final String ALIAS_VIP_TYPE = "会员类型";
	public static final String ALIAS_BALANCE = "余额";
	public static final String ALIAS_SCORE = "积分";
	public static final String ALIAS_POINTS = "珍品币";
	public static final String ALIAS_GIFTS = "gifts";
	public static final String ALIAS_CONSUME_TIMES = "订单完成数量";
	public static final String ALIAS_IS_RECHARGE = "0=》未充值 1=》充值";
	public static final String ALIAS_COMPANY = "company";
	public static final String ALIAS_INDUSTRY = "行业";
	public static final String ALIAS_POSITION = "职位";
	public static final String ALIAS_INCOME = "income";
	public static final String ALIAS_TELEPHONE = "telephone";
	public static final String ALIAS_QQ = "qq";
	public static final String ALIAS_MSN = "msn";
	public static final String ALIAS_HEIGHT = "height";
	public static final String ALIAS_WEIGHT = "weight";
	public static final String ALIAS_CHEST = "胸围";
	public static final String ALIAS_WAIST = "腰围";
	public static final String ALIAS_HIP = "臀围";
	public static final String ALIAS_SHOE_SIZE = "shoeSize";
	public static final String ALIAS_LIVE_PROVINCE_REGION_ID = "当前居住地id";
	public static final String ALIAS_LIVE_CITY_REGION_ID = "liveCityRegionId";
	public static final String ALIAS_LIVE_TOWN_REGION_ID = "liveTownRegionId";
	public static final String ALIAS_HOMETOWN_REGION_ID = "用户家乡地区id";
	public static final String ALIAS_IS_MARRIED = "0=》未结婚 1=》结婚";
	public static final String ALIAS_HAS_CHILD = "0=》没有 1=》有";
	public static final String ALIAS_HAS_PARENT = "0=》没有 1=》有";
	public static final String ALIAS_REG_TIME = "regTime";
	public static final String ALIAS_EMAIL_SUBSCRIBE = "邮件订阅；1=>订阅 0=>未订阅";
	public static final String ALIAS_SHORT_MESSAGE_SUBSCRIBE = "短信订阅；1=>订阅 0=>未订阅";
	public static final String ALIAS_IS_BOND = "1=>绑定 2=>未绑定";
	public static final String ALIAS_ADD_SCORE_LOG = "哪些用户属性送过积分";
	public static final String ALIAS_LAST_ORDER_ADDR = "最后一次下单时填写的地址ID";
	public static final String ALIAS_LAST_ORDER_PAYMENT = "最后一次下单时选择的支付方式序列化信息";
	public static final String ALIAS_LAST_ORDER_SHIPPINGTIME = "最后一次下单时选择的配送时间信息id";
	public static final String ALIAS_LAST_ORDER_INVOICE_INFO = "最后一次下单时填写的发票序列化信息";
	public static final String ALIAS_SOURCE = "来源";
	public static final String ALIAS_HAS_CARD = "hasCard";
	public static final String ALIAS_HAS_PET = "hasPet";
	public static final String ALIAS_HOBBY = "hobby";
	public static final String ALIAS_LIVE_DETAIL = "liveDetail";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * memberId       db_column: member_id 
     */	
	
	private java.lang.Long memberId;
    /**
     * 昵称       db_column: username 
     */	
	@Length(max=50)
	private java.lang.String username;
    /**
     * realname       db_column: realname 
     */	
	@Length(max=50)
	private java.lang.String realname;
    /**
     * 用户当前等级       db_column: cur_level 
     */	
	@NotNull 
	private java.lang.Integer curLevel;
    /**
     * 用户历史最高等级       db_column: top_level 
     */	
	@NotNull 
	private java.lang.Integer topLevel;
    /**
     * 总消费额       db_column: total_consumption 
     */	
	@NotNull 
	private Long totalConsumption;
    /**
     * 有效消费额       db_column: active_consumption 
     */	
	@NotNull 
	private Long activeConsumption;
    /**
     * 总成交订单数       db_column: active_order_num 
     */	
	@NotNull 
	private java.lang.Integer activeOrderNum;
    /**
     * email       db_column: email 
     */	
	@Email @Length(max=100)
	private java.lang.String email;
    /**
     * 是否为非有效邮箱： 0=> 有效邮箱 1=>无效邮箱       db_column: email_is_noneffective 
     */	
	@NotNull @Email
	private java.lang.Boolean emailIsNoneffective;
    /**
     * emailCheck       db_column: email_check 
     */	
	@Email
	private java.lang.Boolean emailCheck;
    /**
     * checkSalt       db_column: check_salt 
     */	
	@Length(max=32)
	private java.lang.String checkSalt;
    /**
     * saltCreateTime       db_column: salt_create_time 
     */	
	
	private java.lang.Integer saltCreateTime;
    /**
     * receiveEmail       db_column: receive_email 
     */	
	@Email
	private java.lang.Boolean receiveEmail;
    /**
     * 0=》女 1=》男       db_column: gender 
     */	
	
	private java.lang.Integer gender;
    /**
     * avater       db_column: avater 
     */	
	@Length(max=50)
	private java.lang.String avater;
    /**
     * age       db_column: age 
     */	
	@Length(max=30)
	private java.lang.String age;
    /**
     * 用户生日       db_column: birthday 
     */	
	@NotNull 
	private java.lang.Integer birthday;
    /**
     * 时尚顾问id       db_column: advis_id 
     */	
	@NotNull 
	private java.lang.Integer advisId;
    /**
     * mobile       db_column: mobile 
     */	
	@Length(max=11)
	private java.lang.String mobile;
    /**
     * 份证身号       db_column: idcard 
     */	
	@Length(max=30)
	private java.lang.String idcard;
    /**
     * 会员等级       db_column: vip_level 
     */	
	
	private java.lang.Integer vipLevel;
    /**
     * 会员类型       db_column: vip_type 
     */	
	@Length(max=30)
	private java.lang.String vipType;
    /**
     * 余额       db_column: balance 
     */	
	
	private Long balance;
    /**
     * 积分       db_column: score 
     */	
	
	private Long score;
    /**
     * 珍品币       db_column: points 
     */	
	
	private Long points;
    /**
     * gifts       db_column: gifts 
     */	
	
	private Long gifts;
    /**
     * 订单完成数量       db_column: consume_times 
     */	
	
	private java.lang.Integer consumeTimes;
    /**
     * 0=》未充值 1=》充值       db_column: is_recharge 
     */	
	
	private java.lang.Integer isRecharge;
    /**
     * company       db_column: company 
     */	
	@Length(max=30)
	private java.lang.String company;
    /**
     * 行业       db_column: industry 
     */	
	@Length(max=30)
	private java.lang.String industry;
    /**
     * 职位       db_column: position 
     */	
	@Length(max=30)
	private java.lang.String position;
    /**
     * income       db_column: income 
     */	
	@Length(max=20)
	private java.lang.String income;
    /**
     * telephone       db_column: telephone 
     */	
	@Length(max=20)
	private java.lang.String telephone;
    /**
     * qq       db_column: qq 
     */	
	@Length(max=15)
	private java.lang.String qq;
    /**
     * msn       db_column: msn 
     */	
	@Length(max=50)
	private java.lang.String msn;
    /**
     * height       db_column: height 
     */	
	
	private java.lang.Integer height;
    /**
     * weight       db_column: weight 
     */	
	
	private java.lang.Integer weight;
    /**
     * 胸围       db_column: chest 
     */	
	@Max(127)
	private Integer chest;
    /**
     * 腰围       db_column: waist 
     */	
	@Max(127)
	private Integer waist;
    /**
     * 臀围       db_column: hip 
     */	
	@Max(127)
	private Integer hip;
    /**
     * shoeSize       db_column: shoe_size 
     */	
	@Max(127)
	private Integer shoeSize;
    /**
     * 当前居住地id       db_column: live_province_region_id 
     */	
	@NotNull 
	private java.lang.Integer liveProvinceRegionId;
    /**
     * liveCityRegionId       db_column: live_city_region_id 
     */	
	@NotNull 
	private java.lang.Integer liveCityRegionId;
    /**
     * liveTownRegionId       db_column: live_town_region_id 
     */	
	@NotNull 
	private java.lang.Integer liveTownRegionId;
    /**
     * 用户家乡地区id       db_column: hometown_region_id 
     */	
	@NotNull 
	private java.lang.Integer hometownRegionId;
    /**
     * 0=》未结婚 1=》结婚       db_column: is_married 
     */	
	
	private java.lang.Boolean isMarried;
    /**
     * 0=》没有 1=》有       db_column: has_child 
     */	
	
	private java.lang.Boolean hasChild;
    /**
     * 0=》没有 1=》有       db_column: has_parent 
     */	
	
	private java.lang.Boolean hasParent;
    /**
     * regTime       db_column: reg_time 
     */	
	@NotNull 
	private java.lang.Integer regTime;
    /**
     * 邮件订阅；1=>订阅 0=>未订阅       db_column: email_subscribe 
     */	
	@NotNull @Email
	private java.lang.Boolean emailSubscribe;
    /**
     * 短信订阅；1=>订阅 0=>未订阅       db_column: short_message_subscribe 
     */	
	@NotNull 
	private java.lang.Boolean shortMessageSubscribe;
    /**
     * 1=>绑定 2=>未绑定       db_column: is_bond 
     */	
	@NotNull 
	private java.lang.Integer isBond;
    /**
     * 哪些用户属性送过积分       db_column: add_score_log 
     */	
	@NotBlank @Length(max=65535)
	private java.lang.String addScoreLog;
    /**
     * 最后一次下单时填写的地址ID       db_column: last_order_addr 
     */	
	
	private java.lang.Integer lastOrderAddr;
    /**
     * 最后一次下单时选择的支付方式序列化信息       db_column: last_order_payment 
     */	
	@Length(max=16777215)
	private java.lang.String lastOrderPayment;
    /**
     * 最后一次下单时选择的配送时间信息id       db_column: last_order_shippingtime 
     */	
	@Max(127)
	private Integer lastOrderShippingtime;
    /**
     * 最后一次下单时填写的发票序列化信息       db_column: last_order_invoice_info 
     */	
	@Length(max=16777215)
	private java.lang.String lastOrderInvoiceInfo;
    /**
     * 来源       db_column: source 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String source;
    /**
     * hasCard       db_column: has_card 
     */	
	
	private java.lang.Boolean hasCard;
    /**
     * hasPet       db_column: has_pet 
     */	
	
	private java.lang.Boolean hasPet;
    /**
     * hobby       db_column: hobby 
     */	
	@Length(max=65535)
	private java.lang.String hobby;
    /**
     * liveDetail       db_column: live_detail 
     */	
	@Length(max=65535)
	private java.lang.String liveDetail;
	private Integer channel;
	//columns END

	public GtMemberProfile(){
	}

	public GtMemberProfile(
		java.lang.Long memberId
	){
		this.memberId = memberId;
	}

	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setUsername(java.lang.String value) {
		this.username = value;
	}
	
	public java.lang.String getUsername() {
		return this.username;
	}
	public void setRealname(java.lang.String value) {
		this.realname = value;
	}
	
	public java.lang.String getRealname() {
		return this.realname;
	}
	public void setCurLevel(java.lang.Integer value) {
		this.curLevel = value;
	}
	
	public java.lang.Integer getCurLevel() {
		return this.curLevel;
	}
	public void setTopLevel(java.lang.Integer value) {
		this.topLevel = value;
	}
	
	public java.lang.Integer getTopLevel() {
		return this.topLevel;
	}
	public void setTotalConsumption(Long value) {
		this.totalConsumption = value;
	}
	
	public Long getTotalConsumption() {
		return this.totalConsumption;
	}
	public void setActiveConsumption(Long value) {
		this.activeConsumption = value;
	}
	
	public Long getActiveConsumption() {
		return this.activeConsumption;
	}
	public void setActiveOrderNum(java.lang.Integer value) {
		this.activeOrderNum = value;
	}
	
	public java.lang.Integer getActiveOrderNum() {
		return this.activeOrderNum;
	}
	public void setEmail(java.lang.String value) {
		this.email = value;
	}
	
	public java.lang.String getEmail() {
		return this.email;
	}
	public void setEmailIsNoneffective(java.lang.Boolean value) {
		this.emailIsNoneffective = value;
	}
	
	public java.lang.Boolean getEmailIsNoneffective() {
		return this.emailIsNoneffective;
	}
	public void setEmailCheck(java.lang.Boolean value) {
		this.emailCheck = value;
	}
	
	public java.lang.Boolean getEmailCheck() {
		return this.emailCheck;
	}
	public void setCheckSalt(java.lang.String value) {
		this.checkSalt = value;
	}
	
	public java.lang.String getCheckSalt() {
		return this.checkSalt;
	}
	public void setSaltCreateTime(java.lang.Integer value) {
		this.saltCreateTime = value;
	}
	
	public java.lang.Integer getSaltCreateTime() {
		return this.saltCreateTime;
	}
	public void setReceiveEmail(java.lang.Boolean value) {
		this.receiveEmail = value;
	}
	
	public java.lang.Boolean getReceiveEmail() {
		return this.receiveEmail;
	}
	public void setGender(java.lang.Integer value) {
		this.gender = value;
	}
	
	public java.lang.Integer getGender() {
		return this.gender;
	}
	public void setAvater(java.lang.String value) {
		this.avater = value;
	}
	
	public java.lang.String getAvater() {
		return this.avater;
	}
	public void setAge(java.lang.String value) {
		this.age = value;
	}
	
	public java.lang.String getAge() {
		return this.age;
	}
	public void setBirthday(java.lang.Integer value) {
		this.birthday = value;
	}
	
	public java.lang.Integer getBirthday() {
		return this.birthday;
	}
	public void setAdvisId(java.lang.Integer value) {
		this.advisId = value;
	}
	
	public java.lang.Integer getAdvisId() {
		return this.advisId;
	}
	public void setMobile(java.lang.String value) {
		this.mobile = value;
	}
	
	public java.lang.String getMobile() {
		return this.mobile;
	}
	public void setIdcard(java.lang.String value) {
		this.idcard = value;
	}
	
	public java.lang.String getIdcard() {
		return this.idcard;
	}
	public void setVipLevel(java.lang.Integer value) {
		this.vipLevel = value;
	}
	
	public java.lang.Integer getVipLevel() {
		return this.vipLevel;
	}
	public void setVipType(java.lang.String value) {
		this.vipType = value;
	}
	
	public java.lang.String getVipType() {
		return this.vipType;
	}
	public void setBalance(Long value) {
		this.balance = value;
	}
	
	public Long getBalance() {
		return this.balance;
	}
	public void setScore(Long value) {
		this.score = value;
	}
	
	public Long getScore() {
		return this.score;
	}
	public void setPoints(Long value) {
		this.points = value;
	}
	
	public Long getPoints() {
		return this.points;
	}
	public void setGifts(Long value) {
		this.gifts = value;
	}
	
	public Long getGifts() {
		return this.gifts;
	}
	public void setConsumeTimes(java.lang.Integer value) {
		this.consumeTimes = value;
	}
	
	public java.lang.Integer getConsumeTimes() {
		return this.consumeTimes;
	}
	public void setIsRecharge(java.lang.Integer value) {
		this.isRecharge = value;
	}
	
	public java.lang.Integer getIsRecharge() {
		return this.isRecharge;
	}
	public void setCompany(java.lang.String value) {
		this.company = value;
	}
	
	public java.lang.String getCompany() {
		return this.company;
	}
	public void setIndustry(java.lang.String value) {
		this.industry = value;
	}
	
	public java.lang.String getIndustry() {
		return this.industry;
	}
	public void setPosition(java.lang.String value) {
		this.position = value;
	}
	
	public java.lang.String getPosition() {
		return this.position;
	}
	public void setIncome(java.lang.String value) {
		this.income = value;
	}
	
	public java.lang.String getIncome() {
		return this.income;
	}
	public void setTelephone(java.lang.String value) {
		this.telephone = value;
	}
	
	public java.lang.String getTelephone() {
		return this.telephone;
	}
	public void setQq(java.lang.String value) {
		this.qq = value;
	}
	
	public java.lang.String getQq() {
		return this.qq;
	}
	public void setMsn(java.lang.String value) {
		this.msn = value;
	}
	
	public java.lang.String getMsn() {
		return this.msn;
	}
	public void setHeight(java.lang.Integer value) {
		this.height = value;
	}
	
	public java.lang.Integer getHeight() {
		return this.height;
	}
	public void setWeight(java.lang.Integer value) {
		this.weight = value;
	}
	
	public java.lang.Integer getWeight() {
		return this.weight;
	}
	public void setChest(Integer value) {
		this.chest = value;
	}
	
	public Integer getChest() {
		return this.chest;
	}
	public void setWaist(Integer value) {
		this.waist = value;
	}
	
	public Integer getWaist() {
		return this.waist;
	}
	public void setHip(Integer value) {
		this.hip = value;
	}
	
	public Integer getHip() {
		return this.hip;
	}
	public void setShoeSize(Integer value) {
		this.shoeSize = value;
	}
	
	public Integer getShoeSize() {
		return this.shoeSize;
	}
	public void setLiveProvinceRegionId(java.lang.Integer value) {
		this.liveProvinceRegionId = value;
	}
	
	public java.lang.Integer getLiveProvinceRegionId() {
		return this.liveProvinceRegionId;
	}
	public void setLiveCityRegionId(java.lang.Integer value) {
		this.liveCityRegionId = value;
	}
	
	public java.lang.Integer getLiveCityRegionId() {
		return this.liveCityRegionId;
	}
	public void setLiveTownRegionId(java.lang.Integer value) {
		this.liveTownRegionId = value;
	}
	
	public java.lang.Integer getLiveTownRegionId() {
		return this.liveTownRegionId;
	}
	public void setHometownRegionId(java.lang.Integer value) {
		this.hometownRegionId = value;
	}
	
	public java.lang.Integer getHometownRegionId() {
		return this.hometownRegionId;
	}
	public void setIsMarried(java.lang.Boolean value) {
		this.isMarried = value;
	}
	
	public java.lang.Boolean getIsMarried() {
		return this.isMarried;
	}
	public void setHasChild(java.lang.Boolean value) {
		this.hasChild = value;
	}
	
	public java.lang.Boolean getHasChild() {
		return this.hasChild;
	}
	public void setHasParent(java.lang.Boolean value) {
		this.hasParent = value;
	}
	
	public java.lang.Boolean getHasParent() {
		return this.hasParent;
	}
	public void setRegTime(java.lang.Integer value) {
		this.regTime = value;
	}
	
	public java.lang.Integer getRegTime() {
		return this.regTime;
	}
	public void setEmailSubscribe(java.lang.Boolean value) {
		this.emailSubscribe = value;
	}
	
	public java.lang.Boolean getEmailSubscribe() {
		return this.emailSubscribe;
	}
	public void setShortMessageSubscribe(java.lang.Boolean value) {
		this.shortMessageSubscribe = value;
	}
	
	public java.lang.Boolean getShortMessageSubscribe() {
		return this.shortMessageSubscribe;
	}
	public void setIsBond(java.lang.Integer value) {
		this.isBond = value;
	}
	
	public java.lang.Integer getIsBond() {
		return this.isBond;
	}
	public void setAddScoreLog(java.lang.String value) {
		this.addScoreLog = value;
	}
	
	public java.lang.String getAddScoreLog() {
		return this.addScoreLog;
	}
	public void setLastOrderAddr(java.lang.Integer value) {
		this.lastOrderAddr = value;
	}
	
	public java.lang.Integer getLastOrderAddr() {
		return this.lastOrderAddr;
	}
	public void setLastOrderPayment(java.lang.String value) {
		this.lastOrderPayment = value;
	}
	
	public java.lang.String getLastOrderPayment() {
		return this.lastOrderPayment;
	}
	public void setLastOrderShippingtime(Integer value) {
		this.lastOrderShippingtime = value;
	}
	
	public Integer getLastOrderShippingtime() {
		return this.lastOrderShippingtime;
	}
	public void setLastOrderInvoiceInfo(java.lang.String value) {
		this.lastOrderInvoiceInfo = value;
	}
	
	public java.lang.String getLastOrderInvoiceInfo() {
		return this.lastOrderInvoiceInfo;
	}
	public void setSource(java.lang.String value) {
		this.source = value;
	}
	
	public java.lang.String getSource() {
		return this.source;
	}
	public void setHasCard(java.lang.Boolean value) {
		this.hasCard = value;
	}
	
	public java.lang.Boolean getHasCard() {
		return this.hasCard;
	}
	public void setHasPet(java.lang.Boolean value) {
		this.hasPet = value;
	}
	
	public java.lang.Boolean getHasPet() {
		return this.hasPet;
	}
	public void setHobby(java.lang.String value) {
		this.hobby = value;
	}
	
	public java.lang.String getHobby() {
		return this.hobby;
	}
	public void setLiveDetail(java.lang.String value) {
		this.liveDetail = value;
	}
	
	public java.lang.String getLiveDetail() {
		return this.liveDetail;
	}

	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("MemberId",getMemberId())
			.append("Username",getUsername())
			.append("Realname",getRealname())
			.append("CurLevel",getCurLevel())
			.append("TopLevel",getTopLevel())
			.append("TotalConsumption",getTotalConsumption())
			.append("ActiveConsumption",getActiveConsumption())
			.append("ActiveOrderNum",getActiveOrderNum())
			.append("Email",getEmail())
			.append("EmailIsNoneffective",getEmailIsNoneffective())
			.append("EmailCheck",getEmailCheck())
			.append("CheckSalt",getCheckSalt())
			.append("SaltCreateTime",getSaltCreateTime())
			.append("ReceiveEmail",getReceiveEmail())
			.append("Gender",getGender())
			.append("Avater",getAvater())
			.append("Age",getAge())
			.append("Birthday",getBirthday())
			.append("AdvisId",getAdvisId())
			.append("Mobile",getMobile())
			.append("Idcard",getIdcard())
			.append("VipLevel",getVipLevel())
			.append("VipType",getVipType())
			.append("Balance",getBalance())
			.append("Score",getScore())
			.append("Points",getPoints())
			.append("Gifts",getGifts())
			.append("ConsumeTimes",getConsumeTimes())
			.append("IsRecharge",getIsRecharge())
			.append("Company",getCompany())
			.append("Industry",getIndustry())
			.append("Position",getPosition())
			.append("Income",getIncome())
			.append("Telephone",getTelephone())
			.append("Qq",getQq())
			.append("Msn",getMsn())
			.append("Height",getHeight())
			.append("Weight",getWeight())
			.append("Chest",getChest())
			.append("Waist",getWaist())
			.append("Hip",getHip())
			.append("ShoeSize",getShoeSize())
			.append("LiveProvinceRegionId",getLiveProvinceRegionId())
			.append("LiveCityRegionId",getLiveCityRegionId())
			.append("LiveTownRegionId",getLiveTownRegionId())
			.append("HometownRegionId",getHometownRegionId())
			.append("IsMarried",getIsMarried())
			.append("HasChild",getHasChild())
			.append("HasParent",getHasParent())
			.append("RegTime",getRegTime())
			.append("EmailSubscribe",getEmailSubscribe())
			.append("ShortMessageSubscribe",getShortMessageSubscribe())
			.append("IsBond",getIsBond())
			.append("AddScoreLog",getAddScoreLog())
			.append("LastOrderAddr",getLastOrderAddr())
			.append("LastOrderPayment",getLastOrderPayment())
			.append("LastOrderShippingtime",getLastOrderShippingtime())
			.append("LastOrderInvoiceInfo",getLastOrderInvoiceInfo())
			.append("Source",getSource())
			.append("HasCard",getHasCard())
			.append("HasPet",getHasPet())
			.append("Hobby",getHobby())
			.append("LiveDetail",getLiveDetail())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getMemberId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtMemberProfile == false) return false;
		if(this == obj) return true;
		GtMemberProfile other = (GtMemberProfile)obj;
		return new EqualsBuilder()
			.append(getMemberId(),other.getMemberId())
			.isEquals();
	}
}

