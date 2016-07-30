package com.zpapi.other.model;

import com.zhen.commons.base.BaseEntity;


public class ButtonStatus extends BaseEntity implements java.io.Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2340324306521581849L;
	private boolean checkButton;
	private boolean delButton;
	private boolean PayButton;
	private boolean cancelButton;
	private boolean logisticsButton;
	private boolean refunedButton;
	private boolean deliverButton;
	public boolean isCheckButton() {
		return checkButton;
	}
	public void setCheckButton(boolean checkButton) {
		this.checkButton = checkButton;
	}
	public boolean isDelButton() {
		return delButton;
	}
	public void setDelButton(boolean delButton) {
		this.delButton = delButton;
	}
	public boolean isPayButton() {
		return PayButton;
	}
	public void setPayButton(boolean payButton) {
		PayButton = payButton;
	}
	public boolean isCancelButton() {
		return cancelButton;
	}
	public void setCancelButton(boolean cancelButton) {
		this.cancelButton = cancelButton;
	}
	public boolean isLogisticsButton() {
		return logisticsButton;
	}
	public void setLogisticsButton(boolean logisticsButton) {
		this.logisticsButton = logisticsButton;
	}
	public boolean isRefunedButton() {
		return refunedButton;
	}
	public void setRefunedButton(boolean refunedButton) {
		this.refunedButton = refunedButton;
	}
	public boolean isDeliverButton() {
		return deliverButton;
	}
	public void setDeliverButton(boolean deliverButton) {
		this.deliverButton = deliverButton;
	}
	

}
