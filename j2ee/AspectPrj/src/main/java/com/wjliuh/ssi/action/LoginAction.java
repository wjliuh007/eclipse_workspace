package com.wjliuh.ssi.action;

import com.wjliuh.ssi.model.User;
import com.wjliuh.ssi.service.SsiService;

public class LoginAction extends BaseAction {

	private static final long serialVersionUID = -4366677447539948750L;

    private SsiService ssiService;  
    
    private User user;  
  
    private String username;  
    private String password; 
    
	public String execute() throws Exception{
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
