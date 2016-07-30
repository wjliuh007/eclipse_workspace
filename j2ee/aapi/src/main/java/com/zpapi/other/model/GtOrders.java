/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
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

import javacommon.CacheKeyConst;
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


public class GtOrders extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtOrders";
	public static final String ALIAS_ORDER_ID = "orderId";
	public static final String ALIAS_IS_HIDDEN = "isHidden";
	public static final String ALIAS_ORDER_SN = "订单编号";
	public static final String ALIAS_BELONG_TO = "子订单标志，该项值为母订单id";
	public static final String ALIAS_FIRST_WAREHOUSE_ID = "第一仓";
	public static final String ALIAS_WAREHOUSE_ID = "此订单所属仓库";
	public static final String ALIAS_ORIGINAL_WAREHOUSE_ID = "原有的处理仓";
	public static final String ALIAS_FINAL_WAREHOUSE_ID = "最终发货仓";
	public static final String ALIAS_IS_OUR_SEND = "是否配送区域1是2否";
	public static final String ALIAS_IS_ALL_SEND = "订单是否分开配送1是2否";
	public static final String ALIAS_SINA_ORDER_ID = "sinaOrderId";
	public static final String ALIAS_MEMBER_ID = "用户ID";
	public static final String ALIAS_EDIT_STATUS = "0=正常订单 1=修改订单 2=已确认修改的订单";
	public static final String ALIAS_SENDHOUSE_ID = "配送点编号";
	public static final String ALIAS_SENDHOUSE_PERSON_ID = "配送员工号";
	public static final String ALIAS_ADVIS = "时尚顾问";
	public static final String ALIAS_EXPRESS_ID = "第三方物流编号";
	public static final String ALIAS_SEC_EXPRESS_ID = "第二次配载的第三方物流编号";
	public static final String ALIAS_SEC_EXPRESS_SN = "第二次配载账号";
	public static final String ALIAS_EXPRESS_SN = "第三方快递运单号";
	public static final String ALIAS_CHANGE_HOUSE_ID = "退换货点id";
	public static final String ALIAS_PACKET_NUM = "订单打包后的件数";
	public static final String ALIAS_STATUS = "订单状态 0-未审核 1-已确认 2-备货中 3-已发货 4-已完成 5-取消 6-删除";
	public static final String ALIAS_SUB_STATUS = "0=待打印 1=打印完成开始备货 2=打包完成待配载 3=配载完成待出库 4=待收货 5=待分配 6=待派件 7=待签收 8=待交款 9=待回收货 10=收款完毕 11=回收货物完毕 12=换货完毕";
	public static final String ALIAS_ADD_STATUS = "附属状态";
	public static final String ALIAS_PAY_STATUS = "支付状态 0-未支付 1-已支付 2-部分付款";
	public static final String ALIAS_PAY_TYPE_ID = "=支付类型 如1-货到付款，2=在线支付 3=分期付款 4=线下支付";
	public static final String ALIAS_OFFLINE_PAYMENT_NAME = "货到付款支付方式（现金，pos机等）";
	public static final String ALIAS_TOTAL_AMOUNT = "订单总额";
	public static final String ALIAS_DISCOUNT_CARD_NUM = "打折卡号";
	public static final String ALIAS_DISCOUNT_CARD_CONDITION = "打折卡使用条件";
	public static final String ALIAS_DISCOUNT_CARD_MONEY = "打折卡面值";
	public static final String ALIAS_CATEGORY_CARD_NUM = "categoryCardNum";
	public static final String ALIAS_CATEGORY_CARD_MONEY = "categoryCardMoney";
	public static final String ALIAS_ACT_ID = "活动ID";
	public static final String ALIAS_FILL_REDUCE_MONEY = "活动满减金额";
	public static final String ALIAS_FILL_REDUCE_RULE = "活动满减少规则";
	public static final String ALIAS_REAL_DISCOUNT_CARD_NUM = "打折卡号";
	public static final String ALIAS_REAL_DISCOUNT_RATE = "打折比率";
	public static final String ALIAS_REAL_DISCOUNT_MONEY = "打折优惠金额";
	public static final String ALIAS_GIFT_MONEY = "礼品金额";
	public static final String ALIAS_GIFT_CARD_NUM = "礼品卡号";
	public static final String ALIAS_VIP_RATE = "会员下单时折扣";
	public static final String ALIAS_VIP_REDUCED = "会员下单时优惠值";
	public static final String ALIAS_IS_INSTALLMENT = "是否分期 0=非分期 1=分期";
	public static final String ALIAS_INSTALLMENT_PAYCODE = "期分付款支付方式代码";
	public static final String ALIAS_VOUCHER_FEE = "voucherFee";
	public static final String ALIAS_INSTALLMENT_PER_MONEY = "每期支付金额";
	public static final String ALIAS_INSTALLMENT_TIMES = "期数";
	public static final String ALIAS_INSTALLMENT_FEE_RATE = "手续费比例";
	public static final String ALIAS_INSTALLMENT_FEE_BY_SELLER = "卖家承担的手续费";
	public static final String ALIAS_INSTALLMENT_FEE_BY_CUSTOMER = "买家承担的手续费";
	public static final String ALIAS_GIVE_POINT_ONLINE_PAY = "在线支付赠送返券金额";
	public static final String ALIAS_GIVE_POINT_RATE_ONLINE_PAY = "在线支付赠送返券金额比率";
	public static final String ALIAS_GIVE_POINT = "获赠抵用点";
	public static final String ALIAS_GIVE_POINT_RATE = "当时返券比例";
	public static final String ALIAS_GIVE_POINT_RULE = "下单时返券规则";
	public static final String ALIAS_GIVE_SCORE = "需要给用户的积分";
	public static final String ALIAS_USED_POINT = "订单使用珍品币数额";
	public static final String ALIAS_USE_ONLINE_PAYED = "在线已支付金额";
	public static final String ALIAS_USE_CASH_PAYED = "现金已支付金额";
	public static final String ALIAS_USE_POS_PAYED = "pos机支付";
	public static final String ALIAS_USED_BALANCE = "订单使用的余额数额";
	public static final String ALIAS_USE_OFFLINE_PAYED = "线下支付金额（银行转账、邮政汇款）";
	public static final String ALIAS_USE_OFFLINE_REDUCED = "线下支付优惠";
	public static final String ALIAS_NEED_PAY = "要需支付的现金";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_CONSIGNEE = "收货人";
	public static final String ALIAS_CONSIGNEE_MOBILE = "收货人手机";
	public static final String ALIAS_ORDER_PHONE = "订单通知手机号";
	public static final String ALIAS_CONSIGNEE_EMAIL = "收货邮箱";
	public static final String ALIAS_CONSIGNEE_TEL = "收货人电话";
	public static final String ALIAS_ZIPCODE = "邮编";
	public static final String ALIAS_ADDRESS = "收货地址";
	public static final String ALIAS_SHIPPING_AREA_ID = "收货地区省级ID";
	public static final String ALIAS_SHIPPING_CITY_ID = "收货地区市级ID";
	public static final String ALIAS_SHIPPING_DISTRICT_ID = "收货地县级ID";
	public static final String ALIAS_SHIPPING_PRICE = "运费";
	public static final String ALIAS_SHIPPING_TIME = "收货时间";
	public static final String ALIAS_INVOICE_TYPE = "发票类型名称 公司，个人等";
	public static final String ALIAS_INVOICE_NUMBER = "发票编号";
	public static final String ALIAS_INVOICE_TITLE = "发票抬头";
	public static final String ALIAS_INVOICE_ITEM = "发票明细 ,办公用品，服装等";
	public static final String ALIAS_PRINT_INVOICE = "是否打印发票，1为未打印，2已打印";
	public static final String ALIAS_ORDER_MEMO = "订单备注";
	public static final String ALIAS_MANAGE_MEMO = "管理员添加备注";
	public static final String ALIAS_TYPE = "1=>正常购买 2=>换货退货";
	public static final String ALIAS_REFUND_ORDER_ID = "退货订单ID";
	public static final String ALIAS_PARENT_ORDER_SN = "购买时订单号";
	public static final String ALIAS_CANCEL_REASON = "取消理由";
	public static final String ALIAS_SIGN_ORDER_TIME = "签收时间";
	public static final String ALIAS_YIQIFA_FLAG = "是否亿起发订单 0-否 1-是";
	public static final String ALIAS_YIQIFA_CID = "亿起发推广标识";
	public static final String ALIAS_YIQIFA_WI = "亿起发下级网站信息 base64编码0-未发送 1-已发送";
	public static final String ALIAS_YIQIFA_NOTE_FLAG = "亿起发同步通知是否发送标记 0-未发送 1-已发送";
	public static final String ALIAS_LAST_OP_TIME = "最近一次状态改变时间";
	public static final String ALIAS_AUTO_CHECK = "禁止自动审核";
	public static final String ALIAS_CHECK_TIME = "审核时间";
	public static final String ALIAS_360_FLAG = "是否360cps订单 1-是 0-否";
	public static final String ALIAS_360_BID = "360cps合作网站编号";
	public static final String ALIAS_360_QID = "360用户ID";
	public static final String ALIAS_360_QIHOO_ID = "360业务编号";
	public static final String ALIAS_360_EXT = "360cps扩展字符串";
	public static final String ALIAS_360_NOTE_FLAG = "360cps同步通知是否发送标记 0-未发送 1-已发送";
	public static final String ALIAS_IS_SEND = "是否发送短信 0未发送 1已发送";
	public static final String ALIAS_AIRWAYBILLNUMBER = "海关运单号";
	public static final String CURRENCY="交易币种";
	public static final String FOREIGNMONEY="外币金额";
	
	
	
	public static String getCacheKey() {
		return CacheKeyConst.GtOrders;
	}
	public static final String CackeKey_sn = new StringBuffer(getCacheKey()).append("sn").append(CacheKeyConst.separator).toString();
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * orderId       db_column: order_id 
     */	
	
	private java.lang.Integer orderId;
    /**
     * isHidden       db_column: is_hidden 
     */	
	@NotNull 
	private java.lang.Boolean isHidden;
    /**
     * 订单编号       db_column: order_sn 
     */	
	@NotNull 
	private java.lang.Long orderSn;
    /**
     * 子订单标志，该项值为母订单id       db_column: belong_to 
     */	
	@NotNull 
	private java.lang.Integer belongTo;
    /**
     * 第一仓       db_column: first_warehouse_id 
     */	
	@NotNull @Max(127)
	private Integer firstWarehouseId;
    /**
     * 此订单所属仓库       db_column: warehouse_id 
     */	
	@NotNull 
	private java.lang.Integer warehouseId;
    /**
     * 原有的处理仓       db_column: original_warehouse_id 
     */	
	@NotNull @Max(127)
	private Integer originalWarehouseId;
    /**
     * 最终发货仓       db_column: final_warehouse_id 
     */	
	@NotNull @Max(127)
	private Integer finalWarehouseId;
    /**
     * 是否配送区域1是2否       db_column: is_our_send 
     */	
	@NotNull @Max(127)
	private Integer isOurSend;
    /**
     * 订单是否分开配送1是2否       db_column: is_all_send 
     */	
	@NotNull @Max(127)
	private Integer isAllSend;
    /**
     * sinaOrderId       db_column: sina_order_id 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String sinaOrderId;
    /**
     * 用户ID       db_column: member_id 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 0=正常订单 1=修改订单 2=已确认修改的订单       db_column: edit_status 
     */	
	@NotNull 
	private Integer editStatus;
    /**
     * 配送点编号       db_column: sendhouse_id 
     */	
	@NotNull 
	private java.lang.Integer sendhouseId;
    /**
     * 配送员工号       db_column: sendhouse_person_id 
     */	
	@NotNull 
	private java.lang.Integer sendhousePersonId;
    /**
     * 时尚顾问       db_column: advis 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String advis;
    /**
     * 第三方物流编号       db_column: express_id 
     */	
	@NotNull 
	private java.lang.Integer expressId;
    /**
     * 第二次配载的第三方物流编号       db_column: sec_express_id 
     */	
	@NotNull 
	private java.lang.Integer secExpressId;
    /**
     * 第二次配载账号       db_column: sec_express_sn 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String secExpressSn;
    /**
     * 第三方快递运单号       db_column: express_sn 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String expressSn;
    /**
     * 退换货点id       db_column: change_house_id 
     */	
	@NotNull 
	private java.lang.Integer changeHouseId;
    /**
     * 订单打包后的件数       db_column: packet_num 
     */	
	@NotNull 
	private java.lang.Integer packetNum;
    /**
     * 订单状态 0-未审核 1-已确认 2-备货中 3-已发货 4-已完成 5-取消 6-删除       db_column: status 
     */	
	@NotNull @Max(127)
	private Integer status;
    /**
     * 0=待打印 1=打印完成开始备货 2=打包完成待配载 3=配载完成待出库 4=待收货 5=待分配 6=待派件 7=待签收 8=待交款 9=待回收货 10=收款完毕 11=回收货物完毕 12=换货完毕       db_column: sub_status 
     */	
	@NotNull @Max(127)
	private Integer subStatus;
    /**
     * 附属状态       db_column: add_status 
     */	
	@NotNull @Max(127)
	private Integer addStatus;
    /**
     * 支付状态 0-未支付 1-已支付 2-部分付款       db_column: pay_status 
     */	
	@NotNull @Max(127)
	private Integer payStatus;
    /**
     * =支付类型 如1-货到付款，2=在线支付 3=分期付款 4=线下支付       db_column: pay_type_id 
     */	
	@NotNull @Max(127)
	private Integer payTypeId;
	/**
	 * 订单支付方式id
	 */
	private Integer paymentId;
	/**
	 * 订单支付方式名称
	 */
	private String paymentName;

	/**
     * 货到付款支付方式（现金，pos机等）       db_column: offline_payment_name 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String offlinePaymentName;
    /**
     * 订单总额       db_column: total_amount 
     */	
	@NotNull 
	private Long totalAmount;
    /**
     * 打折卡号       db_column: discount_card_num 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String discountCardNum;
	
    public java.lang.String getGiftCardNum() {
		return giftCardNum;
	}

	public void setGiftCardNum(java.lang.String giftCardNum) {
		this.giftCardNum = giftCardNum;
	}

	/**
     * 打折卡号       db_column: discount_card_num 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String giftCardNum;
	
    /**
     * 打折卡使用条件       db_column: discount_card_condition 
     */	
	@NotNull 
	private Long discountCardCondition;
    /**
     * 打折卡面值       db_column: discount_card_money 
     */	
	@NotNull 
	private Long discountCardMoney;
    /**
     * categoryCardNum       db_column: category_card_num 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String categoryCardNum;
    /**
     * categoryCardMoney       db_column: category_card_money 
     */	
	@NotNull 
	private Long categoryCardMoney;
    /**
     * 活动ID       db_column: act_id 
     */	
	@NotNull 
	private java.lang.Integer actId;
    /**
     * 活动满减金额       db_column: fill_reduce_money 
     */	
	@NotNull 
	private Long fillReduceMoney;
    /**
     * 活动满减少规则       db_column: fill_reduce_rule 
     */	
	@NotBlank @Length(max=65535)
	private java.lang.String fillReduceRule;
    /**
     * 打折卡号       db_column: real_discount_card_num 
     */	
	@NotBlank @Length(max=30)
	private java.lang.String realDiscountCardNum;
    /**
     * 打折比率       db_column: real_discount_rate 
     */	
	@NotNull 
	private Long realDiscountRate;
    /**
     * 打折优惠金额       db_column: real_discount_money 
     */	
	@NotNull 
	private Long realDiscountMoney;
    /**
     * giftMoney       db_column: gift_money 
     */	
	
	private Long giftMoney;
    /**
     * 会员下单时折扣       db_column: vip_rate 
     */	
	@NotNull 
	private Long vipRate;
    /**
     * 会员下单时优惠值       db_column: vip_reduced 
     */	
	@NotNull 
	private Long vipReduced;
    /**
     * 是否分期 0=非分期 1=分期       db_column: is_installment 
     */	
	@NotNull 
	private java.lang.Boolean isInstallment;
    /**
     * 期分付款支付方式代码       db_column: installment_paycode 
     */	
	@NotBlank @Length(max=100)
	private java.lang.String installmentPaycode;
    /**
     * voucherFee       db_column: voucherFee 
     */	
	@NotNull 
	private Long voucherFee;
    /**
     * 每期支付金额       db_column: installment_per_money 
     */	
	@NotNull 
	private Long installmentPerMoney;
    /**
     * 期数       db_column: installment_times 
     */	
	@NotNull 
	private java.lang.Integer installmentTimes;
    /**
     * 手续费比例       db_column: installment_fee_rate 
     */	
	@NotNull 
	private Long installmentFeeRate;
    /**
     * 卖家承担的手续费       db_column: installment_fee_by_seller 
     */	
	@NotNull 
	private Long installmentFeeBySeller;
    /**
     * 买家承担的手续费       db_column: installment_fee_by_customer 
     */	
	@NotNull 
	private Long installmentFeeByCustomer;
    /**
     * 在线支付赠送返券金额       db_column: give_point_online_pay 
     */	
	@NotNull 
	private Long givePointOnlinePay;
    /**
     * 在线支付赠送返券金额比率       db_column: give_point_rate_online_pay 
     */	
	@NotNull 
	private java.lang.Float givePointRateOnlinePay;
    /**
     * 获赠抵用点       db_column: give_point 
     */	
	@NotNull 
	private Long givePoint;
    /**
     * 当时返券比例       db_column: give_point_rate 
     */	
	@NotNull 
	private java.lang.Float givePointRate;
    /**
     * 下单时返券规则       db_column: give_point_rule 
     */	
	@NotBlank @Length(max=65535)
	private java.lang.String givePointRule;
    /**
     * 需要给用户的积分       db_column: give_score 
     */	
	@NotNull 
	private java.lang.Integer giveScore;
    /**
     * 订单使用珍品币数额       db_column: used_point 
     */	
	@NotNull 
	private Long usedPoint;
    /**
     * 在线已支付金额       db_column: use_online_payed 
     */	
	@NotNull 
	private Long useOnlinePayed;
    /**
     * 现金已支付金额       db_column: use_cash_payed 
     */	
	@NotNull 
	private Long useCashPayed;
    /**
     * pos机支付       db_column: use_pos_payed 
     */	
	@NotNull 
	private Long usePosPayed;
    /**
     * 订单使用的余额数额       db_column: used_balance 
     */	
	@NotNull 
	private Long usedBalance;
    /**
     * 线下支付金额（银行转账、邮政汇款）       db_column: use_offline_payed 
     */	
	@NotNull 
	private Long useOfflinePayed;
    /**
     * 线下支付优惠       db_column: use_offline_reduced 
     */	
	@NotNull 
	private Long useOfflineReduced;
    /**
     * 要需支付的现金       db_column: need_pay 
     */	
	@NotNull 
	private Long needPay;
    /**
     * 创建时间       db_column: create_time 
     */	
	@NotNull 
	private java.lang.Integer createTime;
    /**
     * 收货人       db_column: consignee 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String consignee;
    /**
     * 收货人手机       db_column: consignee_mobile 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String consigneeMobile;
    /**
     * 订单通知手机号       db_column: order_phone 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String orderPhone;
    /**
     * 收货邮箱       db_column: consignee_email 
     */	
	@NotBlank @Email @Length(max=255)
	private java.lang.String consigneeEmail;
    /**
     * 收货人电话       db_column: consignee_tel 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String consigneeTel;
    /**
     * 邮编       db_column: zipcode 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String zipcode;
    /**
     * 收货地址       db_column: address 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String address;
	
	private java.lang.Integer addressid;
	
	/**
	 * 是否是海外订单 0 否 1 是
	 */
	private Integer isThesea;
	/**
	 * 海外供应商物流编号
	 */
	private Integer overseaExpressId;
	
	private String airwayBillnumber;
	
	
    public Integer getOverseaExpressId() {
		return overseaExpressId;
	}

	public void setOverseaExpressId(Integer overseaExpressId) {
		this.overseaExpressId = overseaExpressId;
	}

	public String getAirwayBillnumber() {
		return airwayBillnumber;
	}

	public void setAirwayBillnumber(String airwayBillnumber) {
		this.airwayBillnumber = airwayBillnumber;
	}

	public Integer getIsThesea() {
		return isThesea;
	}

	public void setIsThesea(Integer isThesea) {
		this.isThesea = isThesea;
	}

	public java.lang.Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(java.lang.Integer addressid) {
		this.addressid = addressid;
	}

	/**
     * 收货地区省级ID       db_column: shipping_area_id 
     */	
	@NotNull 
	private java.lang.Integer shippingAreaId;
    /**
     * 收货地区市级ID       db_column: shipping_city_id 
     */	
	@NotNull 
	private java.lang.Integer shippingCityId;
    /**
     * 收货地县级ID       db_column: shipping_district_id 
     */	
	@NotNull 
	private java.lang.Integer shippingDistrictId;
    /**
     * 运费       db_column: shipping_price 
     */	
	@NotNull 
	private Long shippingPrice;
    /**
     * 收货时间       db_column: shipping_time 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String shippingTime;
    /**
     * 发票类型名称 公司，个人等       db_column: invoice_type 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String invoiceType;
    /**
     * 发票编号       db_column: invoice_number 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String invoiceNumber;
    /**
     * 发票抬头       db_column: invoice_title 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String invoiceTitle;
    /**
     * 发票明细 ,办公用品，服装等       db_column: invoice_item 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String invoiceItem;
    /**
     * 是否打印发票，1为未打印，2已打印       db_column: print_invoice 
     */	
	@NotNull 
	private java.lang.Boolean printInvoice;
    /**
     * 订单备注       db_column: order_memo 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String orderMemo;
    /**
     * 管理员添加备注       db_column: manage_memo 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String manageMemo;
    /**
     * 1=>正常购买 2=>换货退货       db_column: type 
     */	
	@NotNull 
	private java.lang.Integer type;
    /**
     * 退货订单ID       db_column: refund_order_id 
     */	
	@NotNull 
	private java.lang.Integer refundOrderId;
    /**
     * 购买时订单号       db_column: parent_order_sn 
     */	
	@NotNull 
	private java.lang.Long parentOrderSn;
    /**
     * 取消理由       db_column: cancel_reason 
     */	
	@NotBlank @Length(max=250)
	private java.lang.String cancelReason;
	/**
	 * 取消理由id       db_column: cancel_reason_id
	 */	
	@NotBlank @Length(max=250)
	private java.lang.Integer cancelReasonId;
	/**
	 * 取消类型，0:未取消 1:前台取消 2：后台取消       db_column: cancel_type
	 */	
	@NotBlank @Length(max=250)
	private java.lang.Integer cancelType;
    /**
     * 签收时间       db_column: sign_order_time 
     */	
	@NotNull 
	private java.lang.Integer signOrderTime;
    /**
     * 是否亿起发订单 0-否 1-是       db_column: yiqifa_flag 
     */	
	@NotNull 
	private java.lang.Boolean yiqifaFlag;
    /**
     * 亿起发推广标识       db_column: yiqifa_cid 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String yiqifaCid;
    /**
     * 亿起发下级网站信息 base64编码0-未发送 1-已发送       db_column: yiqifa_wi 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String yiqifaWi;
    /**
     * 亿起发同步通知是否发送标记 0-未发送 1-已发送       db_column: yiqifa_note_flag 
     */	
	@NotNull 
	private java.lang.Boolean yiqifaNoteFlag;
    /**
     * 最近一次状态改变时间       db_column: last_op_time 
     */	
	@NotNull 
	private java.lang.Integer lastOpTime;
    /**
     * 禁止自动审核       db_column: auto_check 
     */	
	@Max(127)
	private Integer autoCheck;
    /**
     * 审核时间       db_column: check_time 
     */	
	@NotNull 
	private java.lang.Integer checkTime;
	
	private java.lang.String currency;//交易币种
	
	private Double foreignMoney;//外币金额
	
    public Double getForeignMoney() {
		return foreignMoney;
	}

	public void setForeignMoney(Double foreignMoney) {
		this.foreignMoney = foreignMoney;
	}

	public java.lang.String getCurrency() {
		return currency;
	}

	public void setCurrency(java.lang.String currency) {
		this.currency = currency;
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

	/**
     * 是否360cps订单 1-是 0-否       db_column: 360_flag 
     */	
	@NotNull 
	private java.lang.Boolean b360Flag;
    /**
     * 360cps合作网站编号       db_column: 360_bid 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String s360Bid;
    /**
     * 360用户ID       db_column: 360_qid 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String s360Qid;
    /**
     * 360业务编号       db_column: 360_qihoo_id 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String s360QihooId;
    /**
     * 360cps扩展字符串       db_column: 360_ext 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String s360Ext;
    /**
     * 360cps同步通知是否发送标记 0-未发送 1-已发送       db_column: 360_note_flag 
     */	
	@NotNull @Max(127)
	private Integer i360NoteFlag;
    /**
     * 是否发送短信 0未发送 1已发送       db_column: is_send 
     */	
	@NotNull @Max(127)
	private Integer isSend;
	
	private Integer source;
	
	/**拒收状态*/
	private Integer rejectionStatus;
	//columns END
	
	@NotBlank @Length(max=100)
	private java.lang.String airwayBillNumber;

	public Integer getRejectionStatus() {
		return rejectionStatus;
	}

	public void setRejectionStatus(Integer rejectionStatus) {
		this.rejectionStatus = rejectionStatus;
	}

	public Integer getSource() {
		return source;
	}

	public void setSource(Integer source) {
		this.source = source;
	}

	public GtOrders(){
	}

	public GtOrders(
		java.lang.Integer orderId
	){
		this.orderId = orderId;
	}

	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	public void setIsHidden(java.lang.Boolean value) {
		this.isHidden = value;
	}
	
	public java.lang.Boolean getIsHidden() {
		return this.isHidden;
	}
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	public void setBelongTo(java.lang.Integer value) {
		this.belongTo = value;
	}
	
	public java.lang.Integer getBelongTo() {
		return this.belongTo;
	}
	public void setFirstWarehouseId(Integer value) {
		this.firstWarehouseId = value;
	}
	
	public Integer getFirstWarehouseId() {
		return this.firstWarehouseId;
	}
	public void setWarehouseId(java.lang.Integer value) {
		this.warehouseId = value;
	}
	
	public java.lang.Integer getWarehouseId() {
		return this.warehouseId;
	}
	public void setOriginalWarehouseId(Integer value) {
		this.originalWarehouseId = value;
	}
	
	public Integer getOriginalWarehouseId() {
		return this.originalWarehouseId;
	}
	public void setFinalWarehouseId(Integer value) {
		this.finalWarehouseId = value;
	}
	
	public Integer getFinalWarehouseId() {
		return this.finalWarehouseId;
	}
	public void setIsOurSend(Integer value) {
		this.isOurSend = value;
	}
	
	public Integer getIsOurSend() {
		return this.isOurSend;
	}
	public void setIsAllSend(Integer value) {
		this.isAllSend = value;
	}
	
	public Integer getIsAllSend() {
		return this.isAllSend;
	}
	public void setSinaOrderId(java.lang.String value) {
		this.sinaOrderId = value;
	}
	
	public java.lang.String getSinaOrderId() {
		return this.sinaOrderId;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setEditStatus(Integer value) {
		this.editStatus = value;
	}
	
	public Integer getEditStatus() {
		return this.editStatus;
	}
	public void setSendhouseId(java.lang.Integer value) {
		this.sendhouseId = value;
	}
	
	public java.lang.Integer getSendhouseId() {
		return this.sendhouseId;
	}
	public void setSendhousePersonId(java.lang.Integer value) {
		this.sendhousePersonId = value;
	}
	
	public java.lang.Integer getSendhousePersonId() {
		return this.sendhousePersonId;
	}
	public void setAdvis(java.lang.String value) {
		this.advis = value;
	}
	
	public java.lang.String getAdvis() {
		return this.advis;
	}
	public void setExpressId(java.lang.Integer value) {
		this.expressId = value;
	}
	
	public java.lang.Integer getExpressId() {
		return this.expressId;
	}
	public void setSecExpressId(java.lang.Integer value) {
		this.secExpressId = value;
	}
	
	public java.lang.Integer getSecExpressId() {
		return this.secExpressId;
	}
	public void setSecExpressSn(java.lang.String value) {
		this.secExpressSn = value;
	}
	
	public java.lang.String getSecExpressSn() {
		return this.secExpressSn;
	}
	public void setExpressSn(java.lang.String value) {
		this.expressSn = value;
	}
	
	public java.lang.String getExpressSn() {
		return this.expressSn;
	}
	public void setChangeHouseId(java.lang.Integer value) {
		this.changeHouseId = value;
	}
	
	public java.lang.Integer getChangeHouseId() {
		return this.changeHouseId;
	}
	public void setPacketNum(java.lang.Integer value) {
		this.packetNum = value;
	}
	
	public java.lang.Integer getPacketNum() {
		return this.packetNum;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	public void setSubStatus(Integer value) {
		this.subStatus = value;
	}
	
	public Integer getSubStatus() {
		return this.subStatus;
	}
	public void setAddStatus(Integer value) {
		this.addStatus = value;
	}
	
	public Integer getAddStatus() {
		return this.addStatus;
	}
	public void setPayStatus(Integer value) {
		this.payStatus = value;
	}
	
	public Integer getPayStatus() {
		return this.payStatus;
	}
	public void setPayTypeId(Integer value) {
		this.payTypeId = value;
	}
	
	public Integer getPayTypeId() {
		return this.payTypeId;
	}
	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public void setOfflinePaymentName(java.lang.String value) {
		this.offlinePaymentName = value;
	}
	
	public java.lang.String getOfflinePaymentName() {
		return this.offlinePaymentName;
	}
	public void setTotalAmount(Long value) {
		this.totalAmount = value;
	}
	
	public Long getTotalAmount() {
		return this.totalAmount;
	}
	public void setDiscountCardNum(java.lang.String value) {
		this.discountCardNum = value;
	}
	
	public java.lang.String getDiscountCardNum() {
		return this.discountCardNum;
	}
	public void setDiscountCardCondition(Long value) {
		this.discountCardCondition = value;
	}
	
	public Long getDiscountCardCondition() {
		return this.discountCardCondition;
	}
	public void setDiscountCardMoney(Long value) {
		this.discountCardMoney = value;
	}
	
	public Long getDiscountCardMoney() {
		return this.discountCardMoney;
	}
	public void setCategoryCardNum(java.lang.String value) {
		this.categoryCardNum = value;
	}
	
	public java.lang.String getCategoryCardNum() {
		return this.categoryCardNum;
	}
	public void setCategoryCardMoney(Long value) {
		this.categoryCardMoney = value;
	}
	
	public Long getCategoryCardMoney() {
		return this.categoryCardMoney;
	}
	public void setActId(java.lang.Integer value) {
		this.actId = value;
	}
	
	public java.lang.Integer getActId() {
		return this.actId;
	}
	public void setFillReduceMoney(Long value) {
		this.fillReduceMoney = value;
	}
	
	public Long getFillReduceMoney() {
		return this.fillReduceMoney;
	}
	public void setFillReduceRule(java.lang.String value) {
		this.fillReduceRule = value;
	}
	
	public java.lang.String getFillReduceRule() {
		return this.fillReduceRule;
	}
	public void setRealDiscountCardNum(java.lang.String value) {
		this.realDiscountCardNum = value;
	}
	
	public java.lang.String getRealDiscountCardNum() {
		return this.realDiscountCardNum;
	}
	public void setRealDiscountRate(Long value) {
		this.realDiscountRate = value;
	}
	
	public Long getRealDiscountRate() {
		return this.realDiscountRate;
	}
	public void setRealDiscountMoney(Long value) {
		this.realDiscountMoney = value;
	}
	
	public Long getRealDiscountMoney() {
		return this.realDiscountMoney;
	}
	public void setGiftMoney(Long value) {
		this.giftMoney = value;
	}
	
	public Long getGiftMoney() {
		return this.giftMoney;
	}
	public void setVipRate(Long value) {
		this.vipRate = value;
	}
	
	public Long getVipRate() {
		return this.vipRate;
	}
	public void setVipReduced(Long value) {
		this.vipReduced = value;
	}
	
	public Long getVipReduced() {
		return this.vipReduced;
	}
	public void setIsInstallment(java.lang.Boolean value) {
		this.isInstallment = value;
	}
	
	public java.lang.Boolean getIsInstallment() {
		return this.isInstallment;
	}
	public void setInstallmentPaycode(java.lang.String value) {
		this.installmentPaycode = value;
	}
	
	public java.lang.String getInstallmentPaycode() {
		return this.installmentPaycode;
	}
	public void setVoucherFee(Long value) {
		this.voucherFee = value;
	}
	
	public Long getVoucherFee() {
		return this.voucherFee;
	}
	public void setInstallmentPerMoney(Long value) {
		this.installmentPerMoney = value;
	}
	
	public Long getInstallmentPerMoney() {
		return this.installmentPerMoney;
	}
	public void setInstallmentTimes(java.lang.Integer value) {
		this.installmentTimes = value;
	}
	
	public java.lang.Integer getInstallmentTimes() {
		return this.installmentTimes;
	}
	public void setInstallmentFeeRate(Long value) {
		this.installmentFeeRate = value;
	}
	
	public Long getInstallmentFeeRate() {
		return this.installmentFeeRate;
	}
	public void setInstallmentFeeBySeller(Long value) {
		this.installmentFeeBySeller = value;
	}
	
	public Long getInstallmentFeeBySeller() {
		return this.installmentFeeBySeller;
	}
	public void setInstallmentFeeByCustomer(Long value) {
		this.installmentFeeByCustomer = value;
	}
	
	public Long getInstallmentFeeByCustomer() {
		return this.installmentFeeByCustomer;
	}
	public void setGivePointOnlinePay(Long value) {
		this.givePointOnlinePay = value;
	}
	
	public Long getGivePointOnlinePay() {
		return this.givePointOnlinePay;
	}
	public void setGivePointRateOnlinePay(java.lang.Float value) {
		this.givePointRateOnlinePay = value;
	}
	
	public java.lang.Float getGivePointRateOnlinePay() {
		return this.givePointRateOnlinePay;
	}
	public void setGivePoint(Long value) {
		this.givePoint = value;
	}
	
	public Long getGivePoint() {
		return this.givePoint;
	}
	public void setGivePointRate(java.lang.Float value) {
		this.givePointRate = value;
	}
	
	public java.lang.Float getGivePointRate() {
		return this.givePointRate;
	}
	public void setGivePointRule(java.lang.String value) {
		this.givePointRule = value;
	}
	
	public java.lang.String getGivePointRule() {
		return this.givePointRule;
	}
	public void setGiveScore(java.lang.Integer value) {
		this.giveScore = value;
	}
	
	public java.lang.Integer getGiveScore() {
		return this.giveScore;
	}
	public void setUsedPoint(Long value) {
		this.usedPoint = value;
	}
	
	public Long getUsedPoint() {
		return this.usedPoint;
	}
	public void setUseOnlinePayed(Long value) {
		this.useOnlinePayed = value;
	}
	
	public Long getUseOnlinePayed() {
		return this.useOnlinePayed;
	}
	public void setUseCashPayed(Long value) {
		this.useCashPayed = value;
	}
	
	public Long getUseCashPayed() {
		return this.useCashPayed;
	}
	public void setUsePosPayed(Long value) {
		this.usePosPayed = value;
	}
	
	public Long getUsePosPayed() {
		return this.usePosPayed;
	}
	public void setUsedBalance(Long value) {
		this.usedBalance = value;
	}
	
	public Long getUsedBalance() {
		return this.usedBalance;
	}
	public void setUseOfflinePayed(Long value) {
		this.useOfflinePayed = value;
	}
	
	public Long getUseOfflinePayed() {
		return this.useOfflinePayed;
	}
	public void setUseOfflineReduced(Long value) {
		this.useOfflineReduced = value;
	}
	
	public Long getUseOfflineReduced() {
		return this.useOfflineReduced;
	}
	public void setNeedPay(Long value) {
		this.needPay = value;
	}
	
	public Long getNeedPay() {
		return this.needPay;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public java.lang.Integer getCreateTime() {
		return this.createTime;
	}
	public void setConsignee(java.lang.String value) {
		this.consignee = value;
	}
	
	public java.lang.String getConsignee() {
		return this.consignee;
	}
	public void setConsigneeMobile(java.lang.String value) {
		this.consigneeMobile = value;
	}
	
	public java.lang.String getConsigneeMobile() {
		return this.consigneeMobile;
	}
	public void setOrderPhone(java.lang.String value) {
		this.orderPhone = value;
	}
	
	public java.lang.String getOrderPhone() {
		return this.orderPhone;
	}
	public void setConsigneeEmail(java.lang.String value) {
		this.consigneeEmail = value;
	}
	
	public java.lang.String getConsigneeEmail() {
		return this.consigneeEmail;
	}
	public void setConsigneeTel(java.lang.String value) {
		this.consigneeTel = value;
	}
	
	public java.lang.String getConsigneeTel() {
		return this.consigneeTel;
	}
	public void setZipcode(java.lang.String value) {
		this.zipcode = value;
	}
	
	public java.lang.String getZipcode() {
		return this.zipcode;
	}
	public void setAddress(java.lang.String value) {
		this.address = value;
	}
	
	public java.lang.String getAddress() {
		return this.address;
	}
	public void setShippingAreaId(java.lang.Integer value) {
		this.shippingAreaId = value;
	}
	
	public java.lang.Integer getShippingAreaId() {
		return this.shippingAreaId;
	}
	public void setShippingCityId(java.lang.Integer value) {
		this.shippingCityId = value;
	}
	
	public java.lang.Integer getShippingCityId() {
		return this.shippingCityId;
	}
	public void setShippingDistrictId(java.lang.Integer value) {
		this.shippingDistrictId = value;
	}
	
	public java.lang.Integer getShippingDistrictId() {
		return this.shippingDistrictId;
	}
	public void setShippingPrice(Long value) {
		this.shippingPrice = value;
	}
	
	public Long getShippingPrice() {
		return this.shippingPrice;
	}
	public void setShippingTime(java.lang.String value) {
		this.shippingTime = value;
	}
	
	public java.lang.String getShippingTime() {
		return this.shippingTime;
	}
	public void setInvoiceType(java.lang.String value) {
		this.invoiceType = value;
	}
	
	public java.lang.String getInvoiceType() {
		return this.invoiceType;
	}
	public void setInvoiceNumber(java.lang.String value) {
		this.invoiceNumber = value;
	}
	
	public java.lang.String getInvoiceNumber() {
		return this.invoiceNumber;
	}
	public void setInvoiceTitle(java.lang.String value) {
		this.invoiceTitle = value;
	}
	
	public java.lang.String getInvoiceTitle() {
		return this.invoiceTitle;
	}
	public void setInvoiceItem(java.lang.String value) {
		this.invoiceItem = value;
	}
	
	public java.lang.String getInvoiceItem() {
		return this.invoiceItem;
	}
	public void setPrintInvoice(java.lang.Boolean value) {
		this.printInvoice = value;
	}
	
	public java.lang.Boolean getPrintInvoice() {
		return this.printInvoice;
	}
	public void setOrderMemo(java.lang.String value) {
		this.orderMemo = value;
	}
	
	public java.lang.String getOrderMemo() {
		return this.orderMemo;
	}
	public void setManageMemo(java.lang.String value) {
		this.manageMemo = value;
	}
	
	public java.lang.String getManageMemo() {
		return this.manageMemo;
	}
	public void setType(Integer value) {
		this.type = value;
	}
	
	public Integer getType() {
		return this.type;
	}
	public void setRefundOrderId(java.lang.Integer value) {
		this.refundOrderId = value;
	}
	
	public java.lang.Integer getRefundOrderId() {
		return this.refundOrderId;
	}
	public void setParentOrderSn(java.lang.Long value) {
		this.parentOrderSn = value;
	}
	
	public java.lang.Long getParentOrderSn() {
		return this.parentOrderSn;
	}
	public void setCancelReason(java.lang.String value) {
		this.cancelReason = value;
	}
	
	public java.lang.String getCancelReason() {
		return this.cancelReason;
	}
	public java.lang.Integer getCancelReasonId() {
		return cancelReasonId;
	}

	public void setCancelReasonId(java.lang.Integer cancelReasonId) {
		this.cancelReasonId = cancelReasonId;
	}

	public java.lang.Integer getCancelType() {
		return cancelType;
	}

	public void setCancelType(java.lang.Integer cancelType) {
		this.cancelType = cancelType;
	}

	public void setSignOrderTime(java.lang.Integer value) {
		this.signOrderTime = value;
	}
	
	public java.lang.Integer getSignOrderTime() {
		return this.signOrderTime;
	}
	public void setYiqifaFlag(java.lang.Boolean value) {
		this.yiqifaFlag = value;
	}
	
	public java.lang.Boolean getYiqifaFlag() {
		return this.yiqifaFlag;
	}
	public void setYiqifaCid(java.lang.String value) {
		this.yiqifaCid = value;
	}
	
	public java.lang.String getYiqifaCid() {
		return this.yiqifaCid;
	}
	public void setYiqifaWi(java.lang.String value) {
		this.yiqifaWi = value;
	}
	
	public java.lang.String getYiqifaWi() {
		return this.yiqifaWi;
	}
	public void setYiqifaNoteFlag(java.lang.Boolean value) {
		this.yiqifaNoteFlag = value;
	}
	
	public java.lang.Boolean getYiqifaNoteFlag() {
		return this.yiqifaNoteFlag;
	}
	public void setLastOpTime(java.lang.Integer value) {
		this.lastOpTime = value;
	}
	
	public java.lang.Integer getLastOpTime() {
		return this.lastOpTime;
	}
	public void setAutoCheck(Integer value) {
		this.autoCheck = value;
	}
	
	public Integer getAutoCheck() {
		return this.autoCheck;
	}
	public void setCheckTime(java.lang.Integer value) {
		this.checkTime = value;
	}
	
	public java.lang.Integer getCheckTime() {
		return this.checkTime;
	}
	public void setIsSend(Integer value) {
		this.isSend = value;
	}
	
	public Integer getIsSend() {
		return this.isSend;
	}

	public java.lang.String getAirwayBillNumber() {
		return airwayBillNumber;
	}

	public void setAirwayBillNumber(java.lang.String airwayBillNumber) {
		this.airwayBillNumber = airwayBillNumber;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("OrderId",getOrderId())
			.append("IsHidden",getIsHidden())
			.append("OrderSn",getOrderSn())
			.append("BelongTo",getBelongTo())
			.append("FirstWarehouseId",getFirstWarehouseId())
			.append("WarehouseId",getWarehouseId())
			.append("OriginalWarehouseId",getOriginalWarehouseId())
			.append("FinalWarehouseId",getFinalWarehouseId())
			.append("IsOurSend",getIsOurSend())
			.append("IsAllSend",getIsAllSend())
			.append("SinaOrderId",getSinaOrderId())
			.append("MemberId",getMemberId())
			.append("EditStatus",getEditStatus())
			.append("SendhouseId",getSendhouseId())
			.append("SendhousePersonId",getSendhousePersonId())
			.append("Advis",getAdvis())
			.append("ExpressId",getExpressId())
			.append("SecExpressId",getSecExpressId())
			.append("SecExpressSn",getSecExpressSn())
			.append("ExpressSn",getExpressSn())
			.append("ChangeHouseId",getChangeHouseId())
			.append("PacketNum",getPacketNum())
			.append("Status",getStatus())
			.append("SubStatus",getSubStatus())
			.append("AddStatus",getAddStatus())
			.append("PayStatus",getPayStatus())
			.append("PayTypeId",getPayTypeId())
			.append("OfflinePaymentName",getOfflinePaymentName())
			.append("TotalAmount",getTotalAmount())
			.append("DiscountCardNum",getDiscountCardNum())
			.append("DiscountCardCondition",getDiscountCardCondition())
			.append("DiscountCardMoney",getDiscountCardMoney())
			.append("CategoryCardNum",getCategoryCardNum())
			.append("CategoryCardMoney",getCategoryCardMoney())
			.append("ActId",getActId())
			.append("FillReduceMoney",getFillReduceMoney())
			.append("FillReduceRule",getFillReduceRule())
			.append("RealDiscountCardNum",getRealDiscountCardNum())
			.append("RealDiscountRate",getRealDiscountRate())
			.append("RealDiscountMoney",getRealDiscountMoney())
			.append("GiftMoney",getGiftMoney())
			.append("VipRate",getVipRate())
			.append("VipReduced",getVipReduced())
			.append("IsInstallment",getIsInstallment())
			.append("InstallmentPaycode",getInstallmentPaycode())
			.append("VoucherFee",getVoucherFee())
			.append("InstallmentPerMoney",getInstallmentPerMoney())
			.append("InstallmentTimes",getInstallmentTimes())
			.append("InstallmentFeeRate",getInstallmentFeeRate())
			.append("InstallmentFeeBySeller",getInstallmentFeeBySeller())
			.append("InstallmentFeeByCustomer",getInstallmentFeeByCustomer())
			.append("GivePointOnlinePay",getGivePointOnlinePay())
			.append("GivePointRateOnlinePay",getGivePointRateOnlinePay())
			.append("GivePoint",getGivePoint())
			.append("GivePointRate",getGivePointRate())
			.append("GivePointRule",getGivePointRule())
			.append("GiveScore",getGiveScore())
			.append("UsedPoint",getUsedPoint())
			.append("UseOnlinePayed",getUseOnlinePayed())
			.append("UseCashPayed",getUseCashPayed())
			.append("UsePosPayed",getUsePosPayed())
			.append("UsedBalance",getUsedBalance())
			.append("UseOfflinePayed",getUseOfflinePayed())
			.append("UseOfflineReduced",getUseOfflineReduced())
			.append("NeedPay",getNeedPay())
			.append("CreateTime",getCreateTime())
			.append("Consignee",getConsignee())
			.append("ConsigneeMobile",getConsigneeMobile())
			.append("OrderPhone",getOrderPhone())
			.append("ConsigneeEmail",getConsigneeEmail())
			.append("ConsigneeTel",getConsigneeTel())
			.append("Zipcode",getZipcode())
			.append("Address",getAddress())
			.append("ShippingAreaId",getShippingAreaId())
			.append("ShippingCityId",getShippingCityId())
			.append("ShippingDistrictId",getShippingDistrictId())
			.append("ShippingPrice",getShippingPrice())
			.append("ShippingTime",getShippingTime())
			.append("InvoiceType",getInvoiceType())
			.append("InvoiceNumber",getInvoiceNumber())
			.append("InvoiceTitle",getInvoiceTitle())
			.append("InvoiceItem",getInvoiceItem())
			.append("PrintInvoice",getPrintInvoice())
			.append("OrderMemo",getOrderMemo())
			.append("ManageMemo",getManageMemo())
			.append("Type",getType())
			.append("RefundOrderId",getRefundOrderId())
			.append("ParentOrderSn",getParentOrderSn())
			.append("CancelReason",getCancelReason())
			.append("SignOrderTime",getSignOrderTime())
			.append("YiqifaFlag",getYiqifaFlag())
			.append("YiqifaCid",getYiqifaCid())
			.append("YiqifaWi",getYiqifaWi())
			.append("YiqifaNoteFlag",getYiqifaNoteFlag())
			.append("LastOpTime",getLastOpTime())
			.append("AutoCheck",getAutoCheck())
			.append("CheckTime",getCheckTime())
			.append("360Flag",getB360Flag())
			.append("360Bid",getS360Bid())
			.append("360Qid",getS360Qid())
			.append("360QihooId",getS360QihooId())
			.append("360Ext",getS360Ext())
			.append("360NoteFlag",getI360NoteFlag())
			.append("IsSend",getIsSend())
			.append("Source",getSource())
			.toString();
	}
	
	public Map<String,Object> getResultToOrderList(){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("orderId", this.getOrderId());
		result.put("orderSn", this.getOrderSn());
		result.put("status", this.getStatus());
		result.put("subStatus", this.getSubStatus());
		result.put("isHidden", this.getIsHidden());
		result.put("createTime", this.getCreateTime());
		result.put("editStatus", this.getEditStatus());
		result.put("lastOpTime", this.getLastOpTime());
		result.put("memberId", this.getMemberId());
		result.put("needPay", this.getNeedPay());
		result.put("orderMemo", this.getOrderMemo());
		result.put("payStatus", this.getPayStatus());
		result.put("payTypeId", this.getPayTypeId());
		result.put("source", this.getSource());
		result.put("totalAmount", this.getTotalAmount());
		result.put("type", this.getType());
		return result;
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getOrderId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtOrders == false) return false;
		if(this == obj) return true;
		GtOrders other = (GtOrders)obj;
		return new EqualsBuilder()
			.append(getOrderId(),other.getOrderId())
			.isEquals();
	}
}

