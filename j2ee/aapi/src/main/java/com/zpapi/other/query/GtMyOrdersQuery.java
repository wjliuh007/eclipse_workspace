package com.zpapi.other.query;


public class GtMyOrdersQuery extends GtOrdersQuery{
	private static final long serialVersionUID = -727131242943385599L;
	private String index;
	private String source;
	public Integer getBegintime() {
		return begintime;
	}

	public void setBegintime(Integer begintime) {
		this.begintime = begintime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Integer getEndtime() {
		return endtime;
	}

	public void setEndtime(Integer endtime) {
		this.endtime = endtime;
	}

	private Integer begintime;
	private Integer endtime;

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
	
	
}