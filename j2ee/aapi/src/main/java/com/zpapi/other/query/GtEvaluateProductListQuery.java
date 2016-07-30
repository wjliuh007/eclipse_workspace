package com.zpapi.other.query;

public class GtEvaluateProductListQuery extends BaseQuery{
	private static final long serialVersionUID = 2381309261103641523L;
	public Boolean getIsevaluate() {
		return isevaluate;
	}
	public void setIsevaluate(Boolean isevaluate) {
		this.isevaluate = isevaluate;
	}
	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}
	private Boolean isevaluate;
	private Long memberid;
}