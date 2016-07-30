/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2014
 */

package com.zpapi.other.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import com.zpapi.other.query.BaseQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */


public class GtAppSendUserQuery extends BaseQuery implements Serializable {
    private static final long serialVersionUID = 3148176768559230877L;
    

	/** id */
	private java.lang.Integer id;
	/** model */
	private java.lang.String model;
	/** uid */
	private java.lang.Integer uid;
	
	private Integer apptype;

	private String idfa;
	
	public java.lang.Integer getId() {
		return this.id;
	}
	
	public void setId(java.lang.Integer value) {
		this.id = value;
	}
	
	public java.lang.String getModel() {
		return this.model;
	}
	
	public void setModel(java.lang.String value) {
		this.model = value;
	}
	
	public java.lang.Integer getUid() {
		return this.uid;
	}
	
	public void setUid(java.lang.Integer value) {
		this.uid = value;
	}
	

	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public Integer getApptype() {
		return apptype;
	}

	public void setApptype(Integer apptype) {
		this.apptype = apptype;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}

