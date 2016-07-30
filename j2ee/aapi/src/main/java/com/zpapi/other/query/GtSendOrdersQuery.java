/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2015
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


public class GtSendOrdersQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** orderSendId */
	private java.lang.Integer orderSendId;
	/** isHidden */
	private java.lang.Boolean isHidden;
	/** 订单id */
	private java.lang.Integer orderId;
	/** 订单编号 */
	private java.lang.Long orderSn;
	/** 发货单编号 */
	private java.lang.Long sendOrderSn;
	/** 此订单所属仓库 */
	private java.lang.Integer warehouseId;
	/** 用户ID */
	private java.lang.Long memberId;
	/** 0=正常订单 1=修改订单 2=已确认修改的订单 */
	private java.lang.Boolean editStatus;
	/** 时尚顾问 */
	private java.lang.String advis;
	/** 第三方物流编号 */
	private java.lang.Integer expressId;
	/** 第三方快递运单号 */
	private java.lang.String expressSn;
	/** 订单状态 0-未审核 1-已确认 2-备货中 3-已发货 4-已完成 5-取消 6-删除 */
	private Integer status;
	/** 0=待分拣打印 1=打印完成开始备货 2=打包完成待配载 3=配载完成待出库 4=待收货 5=待分配 6=待派件 7=待签收 8=待交款 9=待回收货 10=收款完毕 11=回收货物完毕 12=换货完毕 13=第一仓待接收 14=再次配载 15=待配送选择 20=商品异常订单 */
	private Integer subStatus;
	/** =支付类型 如1-货到付款，2=在线支付 3=分期付款 4=线下支付 */
	private Integer payTypeId;
	/** 货到付款支付方式（现金，pos机等） */
	private java.lang.String offlinePaymentName;
	/** 发货订单总额 */
	private Long totalAmount;
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
	/** 订单备注 */
	private java.lang.String orderMemo;
	/** 取消理由 */
	private java.lang.String cancelReason;
	/** 签收时间 */
	private java.lang.Integer signOrderTime;
	/** 最近一次状态改变时间 */
	private java.lang.Integer lastOpTime;
	/** 是否发送短信 0未发送 1已发送 */
	private Integer isSend;
	/** 拒收状态 0:无拒收 1:部分拒收 2:全部拒收 3:部分签收 */
	private java.lang.Boolean rejectionStatus;
	/** 取消原因id */
	private java.lang.Integer cancelReasonId;
	/** 0:未取消 1:前台取消 2：后台取消 */
	private Integer cancelType;
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
	/** 1为随单，2为不随单 */
	private java.lang.Boolean orderFlow;
	/** 海外供应商物流编号 */
	private java.lang.Boolean overseaExpressId;
	/** 海关运单号 */
	private java.lang.String airwayBillnumber;

	public java.lang.Integer getOrderSendId() {
		return this.orderSendId;
	}
	
	public void setOrderSendId(java.lang.Integer value) {
		this.orderSendId = value;
	}
	
	public java.lang.Boolean getIsHidden() {
		return this.isHidden;
	}
	
	public void setIsHidden(java.lang.Boolean value) {
		this.isHidden = value;
	}
	
	public java.lang.Integer getOrderId() {
		return this.orderId;
	}
	
	public void setOrderId(java.lang.Integer value) {
		this.orderId = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getSendOrderSn() {
		return this.sendOrderSn;
	}
	
	public void setSendOrderSn(java.lang.Long value) {
		this.sendOrderSn = value;
	}
	
	public java.lang.Integer getWarehouseId() {
		return this.warehouseId;
	}
	
	public void setWarehouseId(java.lang.Integer value) {
		this.warehouseId = value;
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
	
	public java.lang.String getExpressSn() {
		return this.expressSn;
	}
	
	public void setExpressSn(java.lang.String value) {
		this.expressSn = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
	
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getSubStatus() {
		return this.subStatus;
	}
	
	public void setSubStatus(Integer value) {
		this.subStatus = value;
	}
	
	public Integer getPayTypeId() {
		return this.payTypeId;
	}
	
	public void setPayTypeId(Integer value) {
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
	
	public java.lang.String getOrderMemo() {
		return this.orderMemo;
	}
	
	public void setOrderMemo(java.lang.String value) {
		this.orderMemo = value;
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
	
	public java.lang.Integer getLastOpTime() {
		return this.lastOpTime;
	}
	
	public void setLastOpTime(java.lang.Integer value) {
		this.lastOpTime = value;
	}
	
	public Integer getIsSend() {
		return this.isSend;
	}
	
	public void setIsSend(Integer value) {
		this.isSend = value;
	}
	
	public java.lang.Boolean getRejectionStatus() {
		return this.rejectionStatus;
	}
	
	public void setRejectionStatus(java.lang.Boolean value) {
		this.rejectionStatus = value;
	}
	
	public java.lang.Integer getCancelReasonId() {
		return this.cancelReasonId;
	}
	
	public void setCancelReasonId(java.lang.Integer value) {
		this.cancelReasonId = value;
	}
	
	public Integer getCancelType() {
		return this.cancelType;
	}
	
	public void setCancelType(Integer value) {
		this.cancelType = value;
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
	
	public java.lang.Boolean getOrderFlow() {
		return this.orderFlow;
	}
	
	public void setOrderFlow(java.lang.Boolean value) {
		this.orderFlow = value;
	}
	
	public java.lang.Boolean getOverseaExpressId() {
		return this.overseaExpressId;
	}
	
	public void setOverseaExpressId(java.lang.Boolean value) {
		this.overseaExpressId = value;
	}
	
	public java.lang.String getAirwayBillnumber() {
		return this.airwayBillnumber;
	}
	
	public void setAirwayBillnumber(java.lang.String value) {
		this.airwayBillnumber = value;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

