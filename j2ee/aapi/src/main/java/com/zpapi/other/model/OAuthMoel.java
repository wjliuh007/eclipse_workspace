package com.zpapi.other.model;

public class OAuthMoel {
	private String accessId;
	private String expiresIn;
	private String refreshToken;
	private String failTime;

	public String getAccessId() {
		return accessId;
	}

	public void setAccessId(String accessId) {
		this.accessId = accessId;
	}

	public String getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(String expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getFailTime() {
		return failTime;
	}

	public void setFailTime(String failTime) {
		this.failTime = failTime;
	}

}
