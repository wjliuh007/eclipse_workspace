package com.wjliuh.model;

public class CommonMethodEntity {
	private String id;

	private String methodCode;

	private String methodName;

	private String description;

	private String appendix;

	private String appendixpath;

	private String createtime;

	private String updatetime;

	private String isdelete;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getMethodCode() {
		return methodCode;
	}

	public void setMethodCode(String methodCode) {
		this.methodCode = methodCode == null ? null : methodCode.trim();
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName == null ? null : methodName.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	public String getAppendix() {
		return appendix;
	}

	public void setAppendix(String appendix) {
		this.appendix = appendix == null ? null : appendix.trim();
	}

	public String getAppendixpath() {
		return appendixpath;
	}

	public void setAppendixpath(String appendixpath) {
		this.appendixpath = appendixpath == null ? null : appendixpath.trim();
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime == null ? null : createtime.trim();
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime == null ? null : updatetime.trim();
	}

	public String getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(String isdelete) {
		this.isdelete = isdelete == null ? null : isdelete.trim();
	}

	@Override
	public String toString() {
		StringBuffer toStr = new StringBuffer();
		toStr.append("id:").append(getId()).append(";");
		toStr.append("methodCode:").append(getMethodCode()).append(";");
		toStr.append("methodName:").append(getMethodName()).append(";");
		toStr.append("description:").append(getDescription()).append(";");
		toStr.append("appendix:").append(getAppendix()).append(";");
		toStr.append("appendixpath:").append(getAppendixpath()).append(";");
		toStr.append("createtime:").append(getCreatetime()).append(";");
		toStr.append("updatetime:").append(getUpdatetime()).append(";");
		toStr.append("isdelete:").append(getIsdelete()).append(";");
		return toStr.toString();

	}
}