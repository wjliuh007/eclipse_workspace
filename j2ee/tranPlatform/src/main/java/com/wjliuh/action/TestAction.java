package com.wjliuh.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestAction {

	public Object executeTest(HttpServletRequest request,
			HttpServletResponse response) {

		request.getSession();
		return null;
	}
}
