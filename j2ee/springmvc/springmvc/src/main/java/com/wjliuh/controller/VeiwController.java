package com.wjliuh.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/view")
public class VeiwController {

	@RequestMapping("/jsonview")
	@ResponseBody
	public Object jsonview(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("OK", true);
		return result;
	}

	@RequestMapping("/jspview")
	public Object jspview(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println(request.getSession().getId());
		return "jsp";
	}
}
