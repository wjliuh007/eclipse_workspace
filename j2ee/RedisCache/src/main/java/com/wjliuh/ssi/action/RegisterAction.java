package com.wjliuh.ssi.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wjliuh.ssi.model.User;
import com.wjliuh.ssi.service.SsiService;

public class RegisterAction extends BaseAction {

	private static final long serialVersionUID = 1903698983120236234L;

	@Resource
	private SsiService ssiService;

	private User user;

	private String username;
	private String password;

	public String execute(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println(request.getSession().getId());
		user = ssiService.queryReg(username);
		if (user != null) {
			if (user.getPwd().equals(password)) {
				return SUCCESS;
			}
		}
		return ERROR;

	}

	public SsiService getSsiService() {
		return ssiService;
	}

	public void setSsiService(SsiService ssiService) {
		this.ssiService = ssiService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
