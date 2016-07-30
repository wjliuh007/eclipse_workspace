package com.zpapi.other.model;

public class PaymentLog extends GtPaymentLog{
	private static final long serialVersionUID = 7260725116670771663L;

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	private String config;
}