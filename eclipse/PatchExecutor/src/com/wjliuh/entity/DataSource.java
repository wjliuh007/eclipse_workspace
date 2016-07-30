package com.wjliuh.entity;

import nc.vo.framework.rsa.Encode;

public class DataSource {
	private String dataSourceName;
	private String oidMark;
	private String databaseUrl;
	private String user;
	private String password;
	private String driverClassName;
	private String databaseType;
	private String maxCon;
	private String minCon;
	private String dataSourceClassName;
	private String xaDataSourceClassName;
	private String conIncrement;
	private String conInUse;
	private String conIdle;
	private String isBase;
	
	public String getDataSourceName() {
		return dataSourceName;
	}
	public void setDataSourceName(String dataSourceName) {
		this.dataSourceName = dataSourceName;
	}
	public String getOidMark() {
		return oidMark;
	}
	public void setOidMark(String oidMark) {
		this.oidMark = oidMark;
	}
	public String getDatabaseUrl() {
		return databaseUrl;
	}
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return new Encode().decode(password);
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getDatabaseType() {
		return databaseType;
	}
	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
	public String getMaxCon() {
		return maxCon;
	}
	public void setMaxCon(String maxCon) {
		this.maxCon = maxCon;
	}
	public String getMinCon() {
		return minCon;
	}
	public void setMinCon(String minCon) {
		this.minCon = minCon;
	}
	public String getDataSourceClassName() {
		return dataSourceClassName;
	}
	public void setDataSourceClassName(String dataSourceClassName) {
		this.dataSourceClassName = dataSourceClassName;
	}
	public String getXaDataSourceClassName() {
		return xaDataSourceClassName;
	}
	public void setXaDataSourceClassName(String xaDataSourceClassName) {
		this.xaDataSourceClassName = xaDataSourceClassName;
	}
	public String getConIncrement() {
		return conIncrement;
	}
	public void setConIncrement(String conIncrement) {
		this.conIncrement = conIncrement;
	}
	public String getConInUse() {
		return conInUse;
	}
	public void setConInUse(String conInUse) {
		this.conInUse = conInUse;
	}
	public String getConIdle() {
		return conIdle;
	}
	public void setConIdle(String conIdle) {
		this.conIdle = conIdle;
	}
	public String getIsBase() {
		return isBase;
	}
	public void setIsBase(String isBase) {
		this.isBase = isBase;
	}
	
	
}
