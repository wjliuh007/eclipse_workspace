package com.wjliuh.ssi.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.wjliuh.ssi.model.User;
import com.wjliuh.ssi.service.SsiService;

@Controller
public class LoginAction extends BaseAction {

	Logger logger = Logger.getLogger(LoginAction.class);
	private static final long serialVersionUID = -4366677447539948750L;

	@Resource
	private SsiService ssiService;

	private User user;

	private String username;
	private String password;

	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		logger.info("the request's sessionid is :"
				+ request.getSession().getId());
		user = ssiService.query(username);
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
