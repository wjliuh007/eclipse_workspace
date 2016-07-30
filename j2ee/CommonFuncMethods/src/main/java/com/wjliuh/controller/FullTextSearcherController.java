package com.wjliuh.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.wjliuh.model.CommonMethodEntity;
import com.wjliuh.service.CommonMethodEntityServiceI;

@Controller
@Scope("prototype")
@RequestMapping("/fts")
public class FullTextSearcherController {

	CommonMethodEntityServiceI service;
	Logger logger = Logger.getLogger(this.getClass());

	public CommonMethodEntityServiceI getService() {
		return service;
	}

	@Autowired
	public void setService(CommonMethodEntityServiceI service) {
		this.service = service;
	}
	
	@RequestMapping("/skipToAdd")
	public ModelAndView skipToAdd() {
		return new ModelAndView("redirect:/ctrler/addMethods.do");
//		this.getServletContext().getRequestDispatcher("/rentHouse.htm?method=display").forward(request,response);
//		return null;

	}
	
	@RequestMapping("/ftsMethods")
	public String showMethods(HttpServletRequest request,HttpServletResponse response) {

		return "ftsMethods";

	}
	
	@RequestMapping("/ftsAjax")
	public String qryAjax(HttpServletRequest request,HttpServletResponse response) {
		try {
		request.setCharacterEncoding("utf-8");
		Map<Object,Object> params = new HashMap<Object,Object>();
		params.put("fts", getParameter(request.getParameter("fts")));

		List<CommonMethodEntity> list = service.fullTextSearcher(params);//.selectByWhere(qry);

			response.reset();
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw = response.getWriter();

			Object obj = JSON.toJSON(list);
			pw.print(obj);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private Object getParameter(Object obj){
		if(!"".equals(obj) && null != obj){
			return obj;
		}else{
			return null;
		}
	}
}
