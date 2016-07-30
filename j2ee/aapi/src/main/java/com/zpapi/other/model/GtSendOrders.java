/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
 */

package com.zpapi.other.model;

import java.util.HashMap;
import java.util.Map;

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


public class GtSendOrders extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtSendOrders";
	public static final String ALIAS_ORDER_SEND_ID = "sendOrderId";
	public static final String ALIAS_IS_HIDDEN = "isHidden";
	public static final String ALIAS_ORDER_ID = "订单id";
	public static final String ALIAS_ORDER_SN = "订单编号";
	public static final String ALIAS_SEND_ORDER_SN = "发货单编号";
	public static final String ALIAS_WAREHOUSE_ID = "此订单所属仓库";
	public static final String ALIAS_MEMBER_ID = "用户ID";
	public static final String ALIAS_EDIT_STATUS = "0=正常订单 1=修改订单 2=已确认修改的订单";
	public static final String ALIAS_ADVIS = "时尚顾问";
	public static final String ALIAS_EXPRESS_ID = "第三方物流编号";
	public static final String ALIAS_EXPRESS_SN = "第三方快递运单号";
	public static final String ALIAS_STATUS = "订单状态 0-未审核 1-已确认 2-备货中 3-已发货 4-已完成 5-取消 6-删除";
	public static final String ALIAS_SUB_STATUS = "0=待分拣打印 1=打印完成开始备货 2=打包完成待配载 3=配载完成待出库 4=待收货 5=待分配 6=待派件 7=待签收 8=待交款 9=待回收货 10=收款完毕 11=回收货物完毕 12=换货完毕 13=第一仓待接收 14=再次配载 15=待配送选择 20=商品异常订单";
	public static final String ALIAS_PAY_TYPE_ID = "=支付类型 如1-货到付款，2=在线支付 3=分期付款 4=线下支付";
	public static final String ALIAS_OFFLINE_PAYMENT_NAME = "货到付款支付方式（现金，pos机等）";
	public static final String ALIAS_TOTAL_AMOUNT = "发货订单总额";
	public static final String ALIAS_NEED_PAY = "要需支付的现金";
	public static final String ALIAS_CREATE_TIME = "创建时间";
	public static final String ALIAS_CONSIGNEE = "收货人";
	public static final String ALIAS_CONSIGNEE_MOBILE = "收货人手机";
	public static final String ALIAS_ORDER_PHONE = "订单通知手机号";
	public static final String ALIAS_ZIPCODE = "邮编";
	public static final String ALIAS_ADDRESS = "收货地址";
	public static final String ALIAS_SHIPPING_AREA_ID = "收货地区省级ID";
	public static final String ALIAS_SHIPPING_CITY_ID = "收货地区市级ID";
	public static final String ALIAS_SHIPPING_DISTRICT_ID = "收货地县级ID";
	public static final String ALIAS_SHIPPING_PRICE = "运费";
	public static final String ALIAS_ORDER_MEMO = "订单备注";
	public static final String ALIAS_CANCEL_REASON = "取消理由";
	public static final String ALIAS_SIGN_ORDER_TIME = "签收时间";
	public static final String ALIAS_LAST_OP_TIME = "最近一次状态改变时间";
	public static final String ALIAS_IS_SEND = "是否发送短信 0未发送 1已发送";
	public static final String ALIAS_REJECTION_STATUS = "拒收状态 0:无拒收 1:部分拒收 2:全部拒收 3:部分签收";
	public static final String ALIAS_CANCEL_REASON_ID = "取消原因id";
	public static final String ALIAS_CANCEL_TYPE = "0:未取消 1:前台取消 2：后台取消";
	public static final String ALIAS_INVOICE_TYPE = "发票类型名称 公司，个人等";
	public static final String ALIAS_INVOICE_NUMBER = "发票编号";
	public static final String ALIAS_INVOICE_TITLE = "发票抬头";
	public static final String ALIAS_INVOICE_ITEM = "发票明细 ,办公用品，服装等";
	public static final String ALIAS_PRINT_INVOICE = "是否打印发票，1为未打印，2已打印";
	public static final String ALIAS_ORDER_FLOW = "1为随单，2为不随单";
	public static final String ALIAS_OVERSEA_EXPRESS_ID = "海外供应商物流编号";
	public static final String ALIAS_AIRWAY_BILLNUMBER = "海关运单号";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * sendOrderId       db_column: order_send_id 
     */	
	
	private java.lang.Integer sendOrderId;
    /**
     * isHidden       db_column: is_hidden 
     */	
	@NotNull 
	private java.lang.Boolean isHidden;
    /**
     * 订单id       db_column: order_id 
     */	
	@NotNull 
	private java.lang.Integer orderId;
    /**
     * 订单编号       db_column: order_sn 
     */	
	@NotNull 
	private java.lang.Long orderSn;
    /**
     * 发货单编号       db_column: send_order_sn 
     */	
	@NotNull 
	private java.lang.Long sendOrderSn;
    /**
     * 此订单所属仓库       db_column: warehouse_id 
     */	
	@NotNull 
	private java.lang.Integer warehouseId;
    /**
     * 用户ID       db_column: member_id 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 0=正常订单 1=修改订单 2=已确认修改的订单       db_column: edit_status 
     */	
	@NotNull 
	private java.lang.Integer editStatus;
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
     * 第三方快递运单号       db_column: express_sn 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String expressSn;
    /**
     * 订单状态 0-未审核 1-已确认 2-备货中 3-已发货 4-已完成 5-取消 6-删除       db_column: status 
     */	
	@NotNull @Max(127)
	private Integer status;
    /**
     * 0=待分拣打印 1=打印完成开始备货 2=打包完成待配载 3=配载完成待出库 4=待收货 5=待分配 6=待派件 7=待签收 8=待交款 9=待回收货 10=收款完毕 11=回收货物完毕 12=换货完毕 13=第一仓待接收 14=再次配载 15=待配送选择 20=商品异常订单       db_column: sub_status 
     */	
	@Max(127)
	private Integer subStatus;
    /**
     * =支付类型 如1-货到付款，2=在线支付 3=分期付款 4=线下支付       db_column: pay_type_id 
     */	
	@NotNull @Max(127)
	private Integer payTypeId;
    /**
     * 货到付款支付方式（现金，pos机等）       db_column: offline_payment_name 
     */	
	@NotBlank @Length(max=50)
	private java.lang.String offlinePaymentName;
    /**
     * 发货订单总额       db_column: total_amount 
     */	
	@NotNull 
	private Long totalAmount;
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
     * 邮编       db_column: zipcode 
     */	
	@NotBlank @Length(max=20)
	private java.lang.String zipcode;
    /**
     * 收货地址       db_column: address 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String address;
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
	 * 退运费 db_column: refund_fare
	 */
	private int refundFare;
	
    /**
     * 订单备注       db_column: order_memo 
     */	
	@NotBlank @Length(max=255)
	private java.lang.String orderMemo;
    /**
     * 取消理由       db_column: cancel_reason 
     */	
	@NotBlank @Length(max=250)
	private java.lang.String cancelReason;
    /**
     * 签收时间       db_column: sign_order_time 
     */	
	@NotNull 
	private java.lang.Integer signOrderTime;
    /**
     * 最近一次状态改变时间       db_column: last_op_time 
     */	
	@NotNull 
	private java.lang.Integer lastOpTime;
    /**
     * 是否发送短信 0未发送 1已发送       db_column: is_send 
     */	
	@NotNull @Max(127)
	private Integer isSend;
    /**
     * 拒收状态 0:无拒收 1:部分拒收 2:全部拒收 3:部分签收       db_column: rejection_status 
     */	
	@NotNull 
	private java.lang.Integer rejectionStatus;
    /**
     * 取消原因id       db_column: cancel_reason_id 
     */	
	@NotNull 
	private java.lang.Integer cancelReasonId;
    /**
     * 0:未取消 1:前台取消 2：后台取消       db_column: cancel_type 
     */	
	@NotNull @Max(127)
	private Integer cancelType;
    /**
     * 发票类型名称 公司，个人等       db_column: invoice_type 
     */	
	@Length(max=50)
	private java.lang.String invoiceType;
    /**
     * 发票编号       db_column: invoice_number 
     */	
	@Length(max=50)
	private java.lang.String invoiceNumber;
    /**
     * 发票抬头       db_column: invoice_title 
     */	
	@Length(max=255)
	private java.lang.String invoiceTitle;
    /**
     * 发票明细 ,办公用品，服装等       db_column: invoice_item 
     */	
	@Length(max=255)
	private java.lang.String invoiceItem;
    /**
     * 是否打印发票，1为未打印，2已打印       db_column: print_invoice 
     */	
	
	private java.lang.Integer printInvoice;
    /**
     * 1为随单，2为不随单       db_column: order_flow 
     */	
	
	private java.lang.Integer orderFlow;
    /**
     * 海外供应商物流编号       db_column: oversea_express_id 
     */	
	@NotNull 
	private java.lang.Integer overseaExpressId;
    /**
     * 海关运单号       db_column: airway_billnumber 
     */	
	@Length(max=20)
	private java.lang.String airwayBillnumber;
	
	private String shippingTime;
	
	private Integer type;
	
	private Integer giveScore;
	
	private Long expressGenerationSn;
	
	private Integer  lastSubStatus;
	
	private Integer  payStatus;
	
	private Integer pickingType;
	
	private Integer isThesea;
	
	private Integer orderCreateTime;
	//columns END

	public GtSendOrders(){
	}

	public GtSendOrders(
		java.lang.Integer sendOrderId
	){
		this.sendOrderId = sendOrderId;
	}

	public void setSendOrderId(java.lang.Integer value) {
		this.sendOrderId = value;
	}
	
	public java.lang.Integer getSendOrderId() {
		return this.sendOrderId;
	}
	public void setIsHidden(java.lang.Boolean value) {
		this.isHidden = value;
	}
	
	public java.lang.Boolean getIsHidden() {
		return this.isHidden;
	}
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public Long getExpressGenerationSn() {
		return expressGenerationSn;
	}

	public void setExpressGenerationSn(Long expressGenerationSn) {
		this.expressGenerationSn = expressGenerationSn;
	}

	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	public void setSendOrderSn(java.lang.Long value) {
		this.sendOrderSn = value;
	}
	
	public java.lang.Long getSendOrderSn() {
		return this.sendOrderSn;
	}
	public void setWarehouseId(java.lang.Integer value) {
		this.warehouseId = value;
	}
	
	public String getShippingTime() {
		return shippingTime;
	}

	public void setShippingTime(String shippingTime) {
		this.shippingTime = shippingTime;
	}

	public java.lang.Integer getWarehouseId() {
		return this.warehouseId;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setEditStatus(java.lang.Integer value) {
		this.editStatus = value;
	}
	
	public java.lang.Integer getEditStatus() {
		return this.editStatus;
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
	public void setExpressSn(java.lang.String value) {
		this.expressSn = value;
	}
	
	public java.lang.String getExpressSn() {
		return this.expressSn;
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
	public void setPayTypeId(Integer value) {
		this.payTypeId = value;
	}
	
	public Integer getPayTypeId() {
		return this.payTypeId;
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
	public void setNeedPay(Long value) {
		this.needPay = value;
	}
	
	public Long getNeedPay() {
		return this.needPay;
	}
	public void setCreateTime(java.lang.Integer value) {
		this.createTime = value;
	}
	
	public Integer getLastSubStatus() {
		return lastSubStatus;
	}

	public void setLastSubStatus(Integer lastSubStatus) {
		this.lastSubStatus = lastSubStatus;
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
	public void setOrderMemo(java.lang.String value) {
		this.orderMemo = value;
	}
	
	public java.lang.String getOrderMemo() {
		return this.orderMemo;
	}
	public void setCancelReason(java.lang.String value) {
		this.cancelReason = value;
	}
	
	public java.lang.String getCancelReason() {
		return this.cancelReason;
	}
	public void setSignOrderTime(java.lang.Integer value) {
		this.signOrderTime = value;
	}
	
	public java.lang.Integer getSignOrderTime() {
		return this.signOrderTime;
	}
	public void setLastOpTime(java.lang.Integer value) {
		this.lastOpTime = value;
	}
	
	public java.lang.Integer getLastOpTime() {
		return this.lastOpTime;
	}
	public void setIsSend(Integer value) {
		this.isSend = value;
	}
	
	public Integer getIsSend() {
		return this.isSend;
	}
	public void setRejectionStatus(java.lang.Integer value) {
		this.rejectionStatus = value;
	}
	
	public java.lang.Integer getRejectionStatus() {
		return this.rejectionStatus;
	}
	public void setCancelReasonId(java.lang.Integer value) {
		this.cancelReasonId = value;
	}
	
	public java.lang.Integer getCancelReasonId() {
		return this.cancelReasonId;
	}
	public void setCancelType(Integer value) {
		this.cancelType = value;
	}
	
	public Integer getCancelType() {
		return this.cancelType;
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
	public void setPrintInvoice(java.lang.Integer value) {
		this.printInvoice = value;
	}
	
	public java.lang.Integer getPrintInvoice() {
		return this.printInvoice;
	}
	public void setOrderFlow(java.lang.Integer value) {
		this.orderFlow = value;
	}
	
	public java.lang.Integer getOrderFlow() {
		return this.orderFlow;
	}
	public void setOverseaExpressId(java.lang.Integer value) {
		this.overseaExpressId = value;
	}
	
	public java.lang.Integer getOverseaExpressId() {
		return this.overseaExpressId;
	}
	public void setAirwayBillnumber(java.lang.String value) {
		this.airwayBillnumber = value;
	}
	
	public java.lang.String getAirwayBillnumber() {
		return this.airwayBillnumber;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getGiveScore() {
		return giveScore;
	}

	public void setGiveScore(Integer giveScore) {
		this.giveScore = giveScore;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	
	

	public Integer getPickingType() {
		return pickingType;
	}

	public void setPickingType(Integer pickingType) {
		this.pickingType = pickingType;
	}

	public Integer getIsThesea() {
		return isThesea;
	}

	public void setIsThesea(Integer isThesea) {
		this.isThesea = isThesea;
	}

	public Integer getOrderCreateTime() {
		return orderCreateTime;
	}

	public void setOrderCreateTime(Integer orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}
	
	public int getRefundFare() {
		return refundFare;
	}

	public void setRefundFare(int refundFare) {
		this.refundFare = refundFare;
	}

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("sendOrderId",getSendOrderId())
			.append("IsHidden",getIsHidden())
			.append("OrderId",getOrderId())
			.append("OrderSn",getOrderSn())
			.append("SendOrderSn",getSendOrderSn())
			.append("WarehouseId",getWarehouseId())
			.append("MemberId",getMemberId())
			.append("EditStatus",getEditStatus())
			.append("Advis",getAdvis())
			.append("ExpressId",getExpressId())
			.append("ExpressSn",getExpressSn())
			.append("Status",getStatus())
			.append("SubStatus",getSubStatus())
			.append("PayTypeId",getPayTypeId())
			.append("OfflinePaymentName",getOfflinePaymentName())
			.append("TotalAmount",getTotalAmount())
			.append("NeedPay",getNeedPay())
			.append("CreateTime",getCreateTime())
			.append("Consignee",getConsignee())
			.append("ConsigneeMobile",getConsigneeMobile())
			.append("OrderPhone",getOrderPhone())
			.append("Zipcode",getZipcode())
			.append("Address",getAddress())
			.append("ShippingAreaId",getShippingAreaId())
			.append("ShippingCityId",getShippingCityId())
			.append("ShippingDistrictId",getShippingDistrictId())
			.append("ShippingPrice",getShippingPrice())
			.append("refundFare",getRefundFare())
			.append("OrderMemo",getOrderMemo())
			.append("CancelReason",getCancelReason())
			.append("SignOrderTime",getSignOrderTime())
			.append("LastOpTime",getLastOpTime())
			.append("IsSend",getIsSend())
			.append("RejectionStatus",getRejectionStatus())
			.append("CancelReasonId",getCancelReasonId())
			.append("CancelType",getCancelType())
			.append("InvoiceType",getInvoiceType())
			.append("InvoiceNumber",getInvoiceNumber())
			.append("InvoiceTitle",getInvoiceTitle())
			.append("InvoiceItem",getInvoiceItem())
			.append("PrintInvoice",getPrintInvoice())
			.append("OrderFlow",getOrderFlow())
			.append("OverseaExpressId",getOverseaExpressId())
			.append("AirwayBillnumber",getAirwayBillnumber())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getSendOrderId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtSendOrders == false) return false;
		if(this == obj) return true;
		GtSendOrders other = (GtSendOrders)obj;
		return new EqualsBuilder()
			.append(getSendOrderId(),other.getSendOrderId())
			.isEquals();
	}
	
	
	
	public Map<String,Object> getResultToOrderList(){
		Map<String,Object> result = new HashMap<String,Object>();
		result.put("orderId", this.getSendOrderId());
		result.put("orderSn", this.getSendOrderSn());
		result.put("status", this.getStatus());
		result.put("subStatus", this.getSubStatus());
		result.put("isHidden", this.getIsHidden());
		result.put("createTime", this.getCreateTime());
		result.put("editStatus", this.getEditStatus());
		result.put("lastOpTime", this.getLastOpTime());
		result.put("memberId", this.getMemberId());
		result.put("needPay", this.getNeedPay());
		result.put("orderMemo", this.getOrderMemo());
		result.put("payTypeId", this.getPayTypeId());
		result.put("totalAmount", this.getTotalAmount());
		result.put("type", this.getType());
		return result;
	}
	
	public Map<String , Object> getResultToOrderList(Map<String , Object> map){
		
		if(map == null || map.isEmpty()){
			return this.getResultToOrderList();
		}
		
		map.putAll(this.getResultToOrderList());
		
		return map;
	}
}

