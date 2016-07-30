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


public class GtOrdersQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** orderId */
	private java.lang.Integer orderId;
	/** isHidden */
	private java.lang.Boolean isHidden;
	/** 订单编号 */
	private java.lang.Long orderSn;
	/** 子订单标志，该项值为母订单id */
	private java.lang.Integer belongTo;
	/** 第一仓 */
	private Integer firstWarehouseId;
	/** 此订单所属仓库 */
	private java.lang.Integer warehouseId;
	/** 原有的处理仓 */
	private Integer originalWarehouseId;
	/** 最终发货仓 */
	private Integer finalWarehouseId;
	/** 是否配送区域1是2否 */
	private Integer isOurSend;
	/** 订单是否分开配送1是2否 */
	private Integer isAllSend;
	/** sinaOrderId */
	private java.lang.String sinaOrderId;
	/** 用户ID */
	private java.lang.Long memberId;
	/** 0=正常订单 1=修改订单 2=已确认修改的订单 */
	private java.lang.Boolean editStatus;
	/** 配送点编号 */
	private java.lang.Integer sendhouseId;
	/** 配送员工号 */
	private java.lang.Integer sendhousePersonId;
	/** 时尚顾问 */
	private java.lang.String advis;
	/** 第三方物流编号 */
	private java.lang.Integer expressId;
	/** 第二次配载的第三方物流编号 */
	private java.lang.Integer secExpressId;
	/** 第二次配载账号 */
	private java.lang.String secExpressSn;
	/** 第三方快递运单号 */
	private java.lang.String expressSn;
	/** 退换货点id */
	private java.lang.Integer changeHouseId;
	/** 订单打包后的件数 */
	private java.lang.Integer packetNum;
	/** 订单状态 0-未审核 1-已确认 2-备货中 3-已发货 4-已完成 5-取消 6-删除 */
	private String status;
	/** 0=待打印 1=打印完成开始备货 2=打包完成待配载 3=配载完成待出库 4=待收货 5=待分配 6=待派件 7=待签收 8=待交款 9=待回收货 10=收款完毕 11=回收货物完毕 12=换货完毕 */
	private Integer subStatus;
	/** 附属状态 */
	private Integer addStatus;
	/** 支付状态 0-未支付 1-已支付 2-部分付款 */
	private String payStatus;
	/** =支付类型 如1-货到付款，2=在线支付 3=分期付款 4=线下支付 */
	private String payTypeId;
	/** 货到付款支付方式（现金，pos机等） */
	private java.lang.String offlinePaymentName;
	/** 订单总额 */
	private Long totalAmount;
	/** 打折卡号 */
	private java.lang.String discountCardNum;
	/** 打折卡使用条件 */
	private Long discountCardCondition;
	/** 打折卡面值 */
	private Long discountCardMoney;
	/** categoryCardNum */
	private java.lang.String categoryCardNum;
	/** categoryCardMoney */
	private Long categoryCardMoney;
	/** 活动ID */
	private java.lang.Integer actId;
	/** 活动满减金额 */
	private Long fillReduceMoney;
	/** 活动满减少规则 */
	private java.lang.String fillReduceRule;
	/** 打折卡号 */
	private java.lang.String realDiscountCardNum;
	/** 打折比率 */
	private Long realDiscountRate;
	/** 打折优惠金额 */
	private Long realDiscountMoney;
	/** giftMoney */
	private Long giftMoney;
	/** 会员下单时折扣 */
	private Long vipRate;
	/** 会员下单时优惠值 */
	private Long vipReduced;
	/** 是否分期 0=非分期 1=分期 */
	private java.lang.Boolean isInstallment;
	/** 期分付款支付方式代码 */
	private java.lang.String installmentPaycode;
	/** voucherFee */
	private Long voucherFee;
	/** 每期支付金额 */
	private Long installmentPerMoney;
	/** 期数 */
	private java.lang.Integer installmentTimes;
	/** 手续费比例 */
	private Long installmentFeeRate;
	/** 卖家承担的手续费 */
	private Long installmentFeeBySeller;
	/** 买家承担的手续费 */
	private Long installmentFeeByCustomer;
	/** 在线支付赠送返券金额 */
	private Long givePointOnlinePay;
	/** 在线支付赠送返券金额比率 */
	private java.lang.Float givePointRateOnlinePay;
	/** 获赠抵用点 */
	private Long givePoint;
	/** 当时返券比例 */
	private java.lang.Float givePointRate;
	/** 下单时返券规则 */
	private java.lang.String givePointRule;
	/** 需要给用户的积分 */
	private java.lang.Integer giveScore;
	/** 订单使用珍品币数额 */
	private Long usedPoint;
	/** 在线已支付金额 */
	private Long useOnlinePayed;
	/** 现金已支付金额 */
	private Long useCashPayed;
	/** pos机支付 */
	private Long usePosPayed;
	/** 订单使用的余额数额 */
	private Long usedBalance;
	/** 线下支付金额（银行转账、邮政汇款） */
	private Long useOfflinePayed;
	/** 线下支付优惠 */
	private Long useOfflineReduced;
	/** 要需支付的现金 */
	private Long needPay;
	/** 创建时间 */
	private java.lang.Integer createTime;
	/** 收货人 */
	private java.lang.String consignee;
	/** 收货人手机 */
	private java.lang.String consigneeMobile;
	/** 订单通知手机号 */
	private java.lang.String orderPhone;
	/** 收货邮箱 */
	private java.lang.String consigneeEmail;
	/** 收货人电话 */
	private java.lang.String consigneeTel;
	/** 邮编 */
	private java.lang.String zipcode;
	/** 收货地址 */
	private java.lang.String address;
	/** 收货地区省级ID */
	private java.lang.Integer shippingAreaId;
	/** 收货地区市级ID */
	private java.lang.Integer shippingCityId;
	/** 收货地县级ID */
	private java.lang.Integer shippingDistrictId;
	/** 运费 */
	private Long shippingPrice;
	/** 收货时间 */
	private java.lang.String shippingTime;
	/** 发票类型名称 公司，个人等 */
	private java.lang.String invoiceType;
	/** 发票编号 */
	private java.lang.String invoiceNumber;
	/** 发票抬头 */
	private java.lang.String invoiceTitle;
	/** 发票明细 ,办公用品，服装等 */
	private java.lang.String invoiceItem;
	/** 是否打印发票，1为未打印，2已打印 */
	private java.lang.Boolean printInvoice;
	/** 订单备注 */
	private java.lang.String orderMemo;
	/** 管理员添加备注 */
	private java.lang.String manageMemo;
	/** 1=>正常购买 2=>换货退货 */
	private java.lang.Boolean type;
	/** 退货订单ID */
	private java.lang.Integer refundOrderId;
	/** 购买时订单号 */
	private java.lang.Long parentOrderSn;
	/** 取消理由 */
	private java.lang.String cancelReason;
	/** 签收时间 */
	private java.lang.Integer signOrderTime;
	/** 是否亿起发订单 0-否 1-是 */
	private java.lang.Boolean yiqifaFlag;
	/** 亿起发推广标识 */
	private java.lang.String yiqifaCid;
	/** 亿起发下级网站信息 base64编码0-未发送 1-已发送 */
	private java.lang.String yiqifaWi;
	/** 亿起发同步通知是否发送标记 0-未发送 1-已发送 */
	private java.lang.Boolean yiqifaNoteFlag;
	/** 最近一次状态改变时间 */
	private java.lang.Integer lastOpTime;
	/** 禁止自动审核 */
	private Integer autoCheck;
	/** 审核时间 */
	private java.lang.Integer checkTime;
	private java.lang.String source;
	
	private String airwayBillNumber;
	private Integer isThesea;
	private Integer orderStatus;
	
	public String getAirwayBillNumber() {
		return airwayBillNumber;
	}

	public void setAirwayBillNumber(String airwayBillNumber) {
		this.airwayBillNumber = airwayBillNumber;
	}

	public Integer getIsThesea() {
		return isThesea;
	}

	public void setIsThesea(Integer isThesea) {
		this.isThesea = isThesea;
	}

	public java.lang.String getSource() {
		return source;
	}

	public void setSource(java.lang.String source) {
		this.source = source;
	}

	public java.lang.Boolean getB360Flag() {
		return b360Flag;
	}

	public void setB360Flag(java.lang.Boolean b360Flag) {
		this.b360Flag = b360Flag;
	}

	public java.lang.String getS360Bid() {
		return s360Bid;
	}

	public void setS360Bid(java.lang.String s360Bid) {
		this.s360Bid = s360Bid;
	}

	public java.lang.String getS360Qid() {
		return s360Qid;
	}

	public void setS360Qid(java.lang.String s360Qid) {
		this.s360Qid = s360Qid;
	}

	public java.lang.String getS360QihooId() {
		return s360QihooId;
	}

	public void setS360QihooId(java.lang.String s360QihooId) {
		this.s360QihooId = s360QihooId;
	}

	public java.lang.String getS360Ext() {
		return s360Ext;
	}

	public void setS360Ext(java.lang.String s360Ext) {
		this.s360Ext = s360Ext;
	}

	public Integer getI360NoteFlag() {
		return i360NoteFlag;
	}

	public void setI360NoteFlag(Integer i360NoteFlag) {
		this.i360NoteFlag = i360NoteFlag;
	}
	 
	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	/** 是否360cps订单 1-是 0-否 */
	private java.lang.Boolean b360Flag;
	/** 360cps合作网站编号 */
	private java.lang.String s360Bid;
	/** 360用户ID */
	private java.lang.String s360Qid;
	/** 360业务编号 */
	private java.lang.String s360QihooId;
	/** 360cps扩展字符串 */
	private java.lang.String s360Ext;
	/** 360cps同步通知是否发送标记 0-未发送 1-已发送 */
	private Integer i360NoteFlag;
	/** 是否发送短信 0未发送 1已发送 */
	private Integer isSend;

	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Boolean getIsHidden() {
		return this.isHidden;
	}
	
	public void setIsHidden(java.lang.Boolean value) {
		this.isHidden = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Integer getBelongTo() {
		return this.belongTo;
	}
	
	public void setBelongTo(java.lang.Integer value) {
		this.belongTo = value;
	}
	
	public Integer getFirstWarehouseId() {
		return this.firstWarehouseId;
	}
	
	public void setFirstWarehouseId(Integer value) {
		this.firstWarehouseId = value;
	}
	
	public java.lang.Integer getWarehouseId() {
		return this.warehouseId;
	}
	
	public void setWarehouseId(java.lang.Integer value) {
		this.warehouseId = value;
	}
	
	public Integer getOriginalWarehouseId() {
		return this.originalWarehouseId;
	}
	
	public void setOriginalWarehouseId(Integer value) {
		this.originalWarehouseId = value;
	}
	
	public Integer getFinalWarehouseId() {
		return this.finalWarehouseId;
	}
	
	public void setFinalWarehouseId(Integer value) {
		this.finalWarehouseId = value;
	}
	
	public Integer getIsOurSend() {
		return this.isOurSend;
	}
	
	public void setIsOurSend(Integer value) {
		this.isOurSend = value;
	}
	
	public Integer getIsAllSend() {
		return this.isAllSend;
	}
	
	public void setIsAllSend(Integer value) {
		this.isAllSend = value;
	}
	
	public java.lang.String getSinaOrderId() {
		return this.sinaOrderId;
	}
	
	public void setSinaOrderId(java.lang.String value) {
		this.sinaOrderId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Boolean getEditStatus() {
		return this.editStatus;
	}
	
	public void setEditStatus(java.lang.Boolean value) {
		this.editStatus = value;
	}
	
	public java.lang.Integer getSendhouseId() {
		return this.sendhouseId;
	}
	
	public void setSendhouseId(java.lang.Integer value) {
		this.sendhouseId = value;
	}
	
	public java.lang.Integer getSendhousePersonId() {
		return this.sendhousePersonId;
	}
	
	public void setSendhousePersonId(java.lang.Integer value) {
		this.sendhousePersonId = value;
	}
	
	public java.lang.String getAdvis() {
		return this.advis;
	}
	
	public void setAdvis(java.lang.String value) {
		this.advis = value;
	}
	
	public java.lang.Integer getExpressId() {
		return this.expressId;
	}
	
	public void setExpressId(java.lang.Integer value) {
		this.expressId = value;
	}
	
	public java.lang.Integer getSecExpressId() {
		return this.secExpressId;
	}
	
	public void setSecExpressId(java.lang.Integer value) {
		this.secExpressId = value;
	}
	
	public java.lang.String getSecExpressSn() {
		return this.secExpressSn;
	}
	
	public void setSecExpressSn(java.lang.String value) {
		this.secExpressSn = value;
	}
	
	public java.lang.String getExpressSn() {
		return this.expressSn;
	}
	
	public void setExpressSn(java.lang.String value) {
		this.expressSn = value;
	}
	
	public java.lang.Integer getChangeHouseId() {
		return this.changeHouseId;
	}
	
	public void setChangeHouseId(java.lang.Integer value) {
		this.changeHouseId = value;
	}
	
	public java.lang.Integer getPacketNum() {
		return this.packetNum;
	}
	
	public void setPacketNum(java.lang.Integer value) {
		this.packetNum = value;
	}
	
	public String getStatus() {
		return this.status;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public Integer getSubStatus() {
		return this.subStatus;
	}
	
	public void setSubStatus(Integer value) {
		this.subStatus = value;
	}
	
	public Integer getAddStatus() {
		return this.addStatus;
	}
	
	public void setAddStatus(Integer value) {
		this.addStatus = value;
	}
	
	public String getPayStatus() {
		return this.payStatus;
	}
	
	public void setPayStatus(String value) {
		this.payStatus = value;
	}
	
	public String getPayTypeId() {
		return this.payTypeId;
	}
	
	public void setPayTypeId(String value) {
		this.payTypeId = value;
	}
	
	public java.lang.String getOfflinePaymentName() {
		return this.offlinePaymentName;
	}
	
	public void setOfflinePaymentName(java.lang.String value) {
		this.offlinePaymentName = value;
	}
	
	public Long getTotalAmount() {
		return this.totalAmount;
	}
	
	public void setTotalAmount(Long value) {
		this.totalAmount = value;
	}
	
	public java.lang.String getDiscountCardNum() {
		return this.discountCardNum;
	}
	
	public void setDiscountCardNum(java.lang.String value) {
		this.discountCardNum = value;
	}
	
	public Long getDiscountCardCondition() {
		return this.discountCardCondition;
	}
	
	public void setDiscountCardCondition(Long value) {
		this.discountCardCondition = value;
	}
	
	public Long getDiscountCardMoney() {
		return this.discountCardMoney;
	}
	
	public void setDiscountCardMoney(Long value) {
		this.discountCardMoney = value;
	}
	
	public java.lang.String getCategoryCardNum() {
		return this.categoryCardNum;
	}
	
	public void setCategoryCardNum(java.lang.String value) {
		this.categoryCardNum = value;
	}
	
	public Long getCategoryCardMoney() {
		return this.categoryCardMoney;
	}
	
	public void setCategoryCardMoney(Long value) {
		this.categoryCardMoney = value;
	}
	
	public java.lang.Integer getActId() {
		return this.actId;
	}
	
	public void setActId(java.lang.Integer value) {
		this.actId = value;
	}
	
	public Long getFillReduceMoney() {
		return this.fillReduceMoney;
	}
	
	public void setFillReduceMoney(Long value) {
		this.fillReduceMoney = value;
	}
	
	public java.lang.String getFillReduceRule() {
		return this.fillReduceRule;
	}
	
	public void setFillReduceRule(java.lang.String value) {
		this.fillReduceRule = value;
	}
	
	public java.lang.String getRealDiscountCardNum() {
		return this.realDiscountCardNum;
	}
	
	public void setRealDiscountCardNum(java.lang.String value) {
		this.realDiscountCardNum = value;
	}
	
	public Long getRealDiscountRate() {
		return this.realDiscountRate;
	}
	
	public void setRealDiscountRate(Long value) {
		this.realDiscountRate = value;
	}
	
	public Long getRealDiscountMoney() {
		return this.realDiscountMoney;
	}
	
	public void setRealDiscountMoney(Long value) {
		this.realDiscountMoney = value;
	}
	
	public Long getGiftMoney() {
		return this.giftMoney;
	}
	
	public void setGiftMoney(Long value) {
		this.giftMoney = value;
	}
	
	public Long getVipRate() {
		return this.vipRate;
	}
	
	public void setVipRate(Long value) {
		this.vipRate = value;
	}
	
	public Long getVipReduced() {
		return this.vipReduced;
	}
	
	public void setVipReduced(Long value) {
		this.vipReduced = value;
	}
	
	public java.lang.Boolean getIsInstallment() {
		return this.isInstallment;
	}
	
	public void setIsInstallment(java.lang.Boolean value) {
		this.isInstallment = value;
	}
	
	public java.lang.String getInstallmentPaycode() {
		return this.installmentPaycode;
	}
	
	public void setInstallmentPaycode(java.lang.String value) {
		this.installmentPaycode = value;
	}
	
	public Long getVoucherFee() {
		return this.voucherFee;
	}
	
	public void setVoucherFee(Long value) {
		this.voucherFee = value;
	}
	
	public Long getInstallmentPerMoney() {
		return this.installmentPerMoney;
	}
	
	public void setInstallmentPerMoney(Long value) {
		this.installmentPerMoney = value;
	}
	
	public java.lang.Integer getInstallmentTimes() {
		return this.installmentTimes;
	}
	
	public void setInstallmentTimes(java.lang.Integer value) {
		this.installmentTimes = value;
	}
	
	public Long getInstallmentFeeRate() {
		return this.installmentFeeRate;
	}
	
	public void setInstallmentFeeRate(Long value) {
		this.installmentFeeRate = value;
	}
	
	public Long getInstallmentFeeBySeller() {
		return this.installmentFeeBySeller;
	}
	
	public void setInstallmentFeeBySeller(Long value) {
		this.installmentFeeBySeller = value;
	}
	
	public Long getInstallmentFeeByCustomer() {
		return this.installmentFeeByCustomer;
	}
	
	public void setInstallmentFeeByCustomer(Long value) {
		this.installmentFeeByCustomer = value;
	}
	
	public Long getGivePointOnlinePay() {
		return this.givePointOnlinePay;
	}
	
	public void setGivePointOnlinePay(Long value) {
		this.givePointOnlinePay = value;
	}
	
	public java.lang.Float getGivePointRateOnlinePay() {
		return this.givePointRateOnlinePay;
	}
	
	public void setGivePointRateOnlinePay(java.lang.Float value) {
		this.givePointRateOnlinePay = value;
	}
	
	public Long getGivePoint() {
		return this.givePoint;
	}
	
	public void setGivePoint(Long value) {
		this.givePoint = value;
	}
	
	public java.lang.Float getGivePointRate() {
		return this.givePointRate;
	}
	
	public void setGivePointRate(java.lang.Float value) {
		this.givePointRate = value;
	}
	
	public java.lang.String getGivePointRule() {
		return this.givePointRule;
	}
	
	public void setGivePointRule(java.lang.String value) {
		this.givePointRule = value;
	}
	
	public java.lang.Integer getGiveScore() {
		return this.giveScore;
	}
	
	public void setGiveScore(java.lang.Integer value) {
		this.giveScore = value;
	}
	
	public Long getUsedPoint() {
		return this.usedPoint;
	}
	
	public void setUsedPoint(Long value) {
		this.usedPoint = value;
	}
	
	public Long getUseOnlinePayed() {
		return this.useOnlinePayed;
	}
	
	public void setUseOnlinePayed(Long value) {
		this.useOnlinePayed = value;
	}
	
	public Long getUseCashPayed() {
		return this.useCashPayed;
	}
	
	public void setUseCashPayed(Long value) {
		this.useCashPayed = value;
	}
	
	public Long getUsePosPayed() {
		return this.usePosPayed;
	}
	
	public void setUsePosPayed(Long value) {
		this.usePosPayed = value;
	}
	
	public Long getUsedBalance() {
		return this.usedBalance;
	}
	
	public void setUsedBalance(Long value) {
		this.usedBalance = value;
	}
	
	public Long getUseOfflinePayed() {
		return this.useOfflinePayed;
	}
	
	public void setUseOfflinePayed(Long value) {
		this.useOfflinePayed = value;
	}
	
	public Long getUseOfflineReduced() {
		return this.useOfflineReduced;
	}
	
	public void setUseOfflineReduced(Long value) {
		this.useOfflineReduced = value;
	}
	
	public Long getNeedPay() {
		return this.needPay;
	}
	
	public void setNeedPay(Long value) {
		this.needPay = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.String getConsignee() {
		return this.consignee;
	}
	
	public void setConsignee(java.lang.String value) {
		this.consignee = value;
	}
	
	public java.lang.String getConsigneeMobile() {
		return this.consigneeMobile;
	}
	
	public void setConsigneeMobile(java.lang.String value) {
		this.consigneeMobile = value;
	}
	
	public java.lang.String getOrderPhone() {
		return this.orderPhone;
	}
	
	public void setOrderPhone(java.lang.String value) {
		this.orderPhone = value;
	}
	
	public java.lang.String getConsigneeEmail() {
		return this.consigneeEmail;
	}
	
	public void setConsigneeEmail(java.lang.String value) {
		this.consigneeEmail = value;
	}
	
	public java.lang.String getConsigneeTel() {
		return this.consigneeTel;
	}
	
	public void setConsigneeTel(java.lang.String value) {
		this.consigneeTel = value;
	}
	
	public java.lang.String getZipcode() {
		return this.zipcode;
	}
	
	public void setZipcode(java.lang.String value) {
		this.zipcode = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.Integer getShippingAreaId() {
		return this.shippingAreaId;
	}
	
	public void setShippingAreaId(java.lang.Integer value) {
		this.shippingAreaId = value;
	}
	
	public java.lang.Integer getShippingCityId() {
		return this.shippingCityId;
	}
	
	public void setShippingCityId(java.lang.Integer value) {
		this.shippingCityId = value;
	}
	
	public java.lang.Integer getShippingDistrictId() {
		return this.shippingDistrictId;
	}
	
	public void setShippingDistrictId(java.lang.Integer value) {
		this.shippingDistrictId = value;
	}
	
	public Long getShippingPrice() {
		return this.shippingPrice;
	}
	
	public void setShippingPrice(Long value) {
		this.shippingPrice = value;
	}
	
	public java.lang.String getShippingTime() {
		return this.shippingTime;
	}
	
	public void setShippingTime(java.lang.String value) {
		this.shippingTime = value;
	}
	
	public java.lang.String getInvoiceType() {
		return this.invoiceType;
	}
	
	public void setInvoiceType(java.lang.String value) {
		this.invoiceType = value;
	}
	
	public java.lang.String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	
	public void setInvoiceNumber(java.lang.String value) {
		this.invoiceNumber = value;
	}
	
	public java.lang.String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	
	public void setInvoiceTitle(java.lang.String value) {
		this.invoiceTitle = value;
	}
	
	public java.lang.String getInvoiceItem() {
		return this.invoiceItem;
	}
	
	public void setInvoiceItem(java.lang.String value) {
		this.invoiceItem = value;
	}
	
	public java.lang.Boolean getPrintInvoice() {
		return this.printInvoice;
	}
	
	public void setPrintInvoice(java.lang.Boolean value) {
		this.printInvoice = value;
	}
	
	public java.lang.String getOrderMemo() {
		return this.orderMemo;
	}
	
	public void setOrderMemo(java.lang.String value) {
		this.orderMemo = value;
	}
	
	public java.lang.String getManageMemo() {
		return this.manageMemo;
	}
	
	public void setManageMemo(java.lang.String value) {
		this.manageMemo = value;
	}
	
	public java.lang.Boolean getType() {
		return this.type;
	}
	
	public void setType(java.lang.Boolean value) {
		this.type = value;
	}
	
	public java.lang.Integer getRefundOrderId() {
		return this.refundOrderId;
	}
	
	public void setRefundOrderId(java.lang.Integer value) {
		this.refundOrderId = value;
	}
	
	public java.lang.Long getParentOrderSn() {
		return this.parentOrderSn;
	}
	
	public void setParentOrderSn(java.lang.Long value) {
		this.parentOrderSn = value;
	}
	
	public java.lang.String getCancelReason() {
		return this.cancelReason;
	}
	
	public void setCancelReason(java.lang.String value) {
		this.cancelReason = value;
	}
	
	public java.lang.Integer getSignOrderTime() {
		return this.signOrderTime;
	}
	
	public void setSignOrderTime(java.lang.Integer value) {
		this.signOrderTime = value;
	}
	
	public java.lang.Boolean getYiqifaFlag() {
		return this.yiqifaFlag;
	}
	
	public void setYiqifaFlag(java.lang.Boolean value) {
		this.yiqifaFlag = value;
	}
	
	public java.lang.String getYiqifaCid() {
		return this.yiqifaCid;
	}
	
	public void setYiqifaCid(java.lang.String value) {
		this.yiqifaCid = value;
	}
	
	public java.lang.String getYiqifaWi() {
		return this.yiqifaWi;
	}
	
	public void setYiqifaWi(java.lang.String value) {
		this.yiqifaWi = value;
	}
	
	public java.lang.Boolean getYiqifaNoteFlag() {
		return this.yiqifaNoteFlag;
	}
	
	public void setYiqifaNoteFlag(java.lang.Boolean value) {
		this.yiqifaNoteFlag = value;
	}
	
	public java.lang.Integer getLastOpTime() {
		return this.lastOpTime;
	}
	
	public void setLastOpTime(java.lang.Integer value) {
		this.lastOpTime = value;
	}
	
	public Integer getAutoCheck() {
		return this.autoCheck;
	}
	
	public void setAutoCheck(Integer value) {
		this.autoCheck = value;
	}
	
	public java.lang.Integer getCheckTime() {
		return this.checkTime;
	}
	
	public void setCheckTime(java.lang.Integer value) {
		this.checkTime = value;
	}
	
	public Integer getIsSend() {
		return this.isSend;
	}
	
	public void setIsSend(Integer value) {
		this.isSend = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

