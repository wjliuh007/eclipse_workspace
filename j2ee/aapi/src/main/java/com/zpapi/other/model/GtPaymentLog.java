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
import org.hibernate.validator.constraints.Length;

import com.zhen.commons.base.BaseEntity;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtPaymentLog extends BaseEntity implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;
	
	//alias
	public static final String TABLE_ALIAS = "GtPaymentLog";
	public static final String ALIAS_ID = "id";
	public static final String ALIAS_ORDER_SN = "涉及的订单号";
	public static final String ALIAS_MEMBER_ID = "用户ID";
	public static final String ALIAS_PAY_TYPE_ID = "支付类型";
	public static final String ALIAS_PAYMENT_ID = "支付方式ID";
	public static final String ALIAS_PAYCODE = "支付方式唯一标识代码";
	public static final String ALIAS_BANK_CODE = "在线支付时银行代码";
	public static final String ALIAS_MONEY = "支付金额";
	public static final String ALIAS_HISTORY_NEEDPAY = "支付完成前订单应付总额历史记录";
	public static final String ALIAS_MEMO = "备注说明";
	public static final String ALIAS_BEGIN_TIME = "beginTime";
	public static final String ALIAS_END_TIME = "endTime";
	public static final String ALIAS_STATUS = "支付状态 0-末完成  1-付支结束";
	public static final String ALIAS_PAY_SN = "支付订单号，传递给支付接口用";
	public static final String ALIAS_CHANNEL = "channel";
	
	//date formats
	
	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
    /**
     * id       db_column: id 
     */	
	
	private java.lang.Integer id;
    /**
     * 涉及的订单号       db_column: order_sn 
     */	
	@NotNull 
	private java.lang.Long orderSn;
    /**
     * 用户ID       db_column: member_id 
     */	
	@NotNull 
	private java.lang.Long memberId;
    /**
     * 支付类型       db_column: pay_type_id 
     */	
	@NotNull @Max(127)
	private Integer payTypeId;
    /**
     * 支付方式ID       db_column: payment_id 
     */	
	
	private java.lang.Integer paymentId;
    /**
     * 支付方式唯一标识代码       db_column: paycode 
     */	
	@Length(max=50)
	private java.lang.String paycode;
    /**
     * 在线支付时银行代码       db_column: bank_code 
     */	
	@Length(max=50)
	private java.lang.String bankCode;
    /**
     * 支付金额       db_column: money 
     */	
	@NotNull 
	private Long money;
    /**
     * 支付完成前订单应付总额历史记录       db_column: history_needpay 
     */	
	@NotNull 
	private Long historyNeedpay;
    /**
     * 备注说明       db_column: memo 
     */	
	@Length(max=2147483647)
	private java.lang.String memo;
    /**
     * beginTime       db_column: begin_time 
     */	
	
	private java.lang.Integer beginTime;
    /**
     * endTime       db_column: end_time 
     */	
	
	private java.lang.Integer endTime;
    /**
     * 支付状态 0-末完成  1-付支结束       db_column: status 
     */	
	@NotNull @Max(127)
	private Integer status;
    /**
     * 支付订单号，传递给支付接口用       db_column: pay_sn 
     */	
	@NotNull 
	private java.lang.Long paySn;

	private java.lang.String paySerialNumber;
	
	@Max(256)
	private String token;
	
	private java.lang.String payReturnValue;
	
    /**
     * channel       db_column: channel 
     */	
	private Integer channel;
	
	private String crdBllRef;
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	public GtPaymentLog(){
	}

	public GtPaymentLog(
		java.lang.Integer id
	){
		this.id = id;
	}

	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}
	public void setOrderSn(java.lang.Long value) {
		this.orderSn = value;
	}
	
	public java.lang.Long getOrderSn() {
		return this.orderSn;
	}
	public void setMemberId(java.lang.Long value) {
		this.memberId = value;
	}
	
	public java.lang.Long getMemberId() {
		return this.memberId;
	}
	public void setPayTypeId(Integer value) {
		this.payTypeId = value;
	}
	
	public Integer getPayTypeId() {
		return this.payTypeId;
	}
	public void setPaymentId(java.lang.Integer value) {
		this.paymentId = value;
	}
	
	public java.lang.Integer getPaymentId() {
		return this.paymentId;
	}
	public void setPaycode(java.lang.String value) {
		this.paycode = value;
	}
	
	public java.lang.String getPaycode() {
		return this.paycode;
	}
	public void setBankCode(java.lang.String value) {
		this.bankCode = value;
	}
	
	public java.lang.String getBankCode() {
		return this.bankCode;
	}
	public void setMoney(Long value) {
		this.money = value;
	}
	
	public Long getMoney() {
		return this.money;
	}
	public void setHistoryNeedpay(Long value) {
		this.historyNeedpay = value;
	}
	
	public Long getHistoryNeedpay() {
		return this.historyNeedpay;
	}
	public void setMemo(java.lang.String value) {
		this.memo = value;
	}
	
	public java.lang.String getMemo() {
		return this.memo;
	}
	public void setBeginTime(java.lang.Integer value) {
		this.beginTime = value;
	}
	
	public java.lang.Integer getBeginTime() {
		return this.beginTime;
	}
	public void setEndTime(java.lang.Integer value) {
		this.endTime = value;
	}
	
	public java.lang.Integer getEndTime() {
		return this.endTime;
	}
	public void setStatus(Integer value) {
		this.status = value;
	}
	
	public Integer getStatus() {
		return this.status;
	}
 

	public java.lang.Long getPaySn() {
		return paySn;
	}

	public void setPaySn(java.lang.Long paySn) {
		this.paySn = paySn;
	}
	

	public java.lang.String getPayReturnValue() {
		return payReturnValue;
	}

	public void setPayReturnValue(java.lang.String payReturnValue) {
		this.payReturnValue = payReturnValue;
	}
	
	public Integer getChannel() {
		return channel;
	}

	public void setChannel(Integer channel) {
		this.channel = channel;
	}
	
	public java.lang.String getPaySerialNumber() {
		return paySerialNumber;
	}

	public void setPaySerialNumber(java.lang.String paySerialNumber) {
		this.paySerialNumber = paySerialNumber;
	}

	public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("Id",getId())
            .append("OrderSn",getOrderSn())
            .append("MemberId",getMemberId())
            .append("PayTypeId",getPayTypeId())
            .append("PaymentId",getPaymentId())
            .append("Paycode",getPaycode())
            .append("BankCode",getBankCode())
            .append("Money",getMoney())
            .append("HistoryNeedpay",getHistoryNeedpay())
            .append("Memo",getMemo())
            .append("BeginTime",getBeginTime())
            .append("EndTime",getEndTime())
            .append("Status",getStatus())
            .append("PaySn",getPaySn())
            .append("Channel",getChannel())
            .toString();
    }
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GtPaymentLog == false) return false;
		if(this == obj) return true;
		GtPaymentLog other = (GtPaymentLog)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}

	public String getCrdBllRef() {
		return crdBllRef;
	}

	public void setCrdBllRef(String crdBllRef) {
		this.crdBllRef = crdBllRef;
	}

    
    public String toString1() {
        return "GtPaymentLog [id=" + id + ", orderSn=" + orderSn
                + ", memberId=" + memberId + ", payTypeId=" + payTypeId
                + ", paymentId=" + paymentId + ", paycode=" + paycode
                + ", bankCode=" + bankCode + ", money=" + money
                + ", historyNeedpay=" + historyNeedpay + ", memo=" + memo
                + ", beginTime=" + beginTime + ", endTime=" + endTime
                + ", status=" + status + ", paySn=" + paySn
                + ", paySerialNumber=" + paySerialNumber + ", token=" + token
                + ", payReturnValue=" + payReturnValue + ", channel=" + channel
                + ", crdBllRef=" + crdBllRef + "]";
    }
}

