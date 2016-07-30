package com.wjliuh.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.wjliuh.model.CommonMethodEntity;
import com.wjliuh.service.CommonMethodEntityServiceI;
import com.wjliuh.utils.HttpHelper;

@Controller
@RequestMapping("/ctrler")
public class CommonMethodController {
	CommonMethodEntityServiceI service;
	Logger logger = Logger.getLogger(this.getClass());

	public CommonMethodEntityServiceI getService() {
		return service;
	}

	@Autowired
	public void setService(CommonMethodEntityServiceI service) {
		this.service = service;
	}

	@RequestMapping("/showMethods")
	public String showMethods(HttpServletRequest request) {
		 List<CommonMethodEntity> list = service.queryCommonMethodEntity();
		 request.setAttribute("list", list);
		 System.out.println(this.toString());
		return "showMethods";

	}

	@RequestMapping("/addMethods")
	public String addCommonMethod(HttpServletRequest request) {
		return "add";
	}

	@RequestMapping("/saveMethod")
	public ModelAndView saveCommonMethod(HttpServletRequest request) {
		CommonMethodEntity toSave = HttpHelper.getFormBean(request,	CommonMethodEntity.class);
		logger.info(JSON.toJSON(toSave));
		// tosave CommonMethod
		service.insertCommonMethod(toSave);

		// to q3uery
		List<CommonMethodEntity> list = service.queryCommonMethodEntity();
		request.setAttribute("list", list);
//		return "showMethods";
		return new ModelAndView("redirect:/fts/ftsMethods.do");
	}

	@RequestMapping("/qryAjax")
	public String qryAjax(HttpServletRequest request,HttpServletResponse response) {
		try {
		request.setCharacterEncoding("utf-8");
		Map<Object,Object> params = new HashMap<Object,Object>();
		params.put("methodCode", getParameter(request.getParameter("methodCode")));
		params.put("methodName", getParameter(request.getParameter("methodName")));
		params.put("description", getParameter(request.getParameter("description")));
		if(null != getParameter(request.getParameter("isdelete"))){
			params.put("isdelete", getParameter(request.getParameter("isdelete")).toString().toUpperCase());
		}
		
//		System.out.println(params.get("methodCode"));
//		CommonMethodEntity qry = new CommonMethodEntity();
//		qry.setMethodCode(request.getParameter("qryCode"));
//		qry.setMethodName(request.getParameter("qryName"));
//		qry.setDescription(request.getParameter("qryDes"));
		// qry.setIsdelete(isdelete);
		List<CommonMethodEntity> list = service.selectByOptions(params);//.selectByWhere(qry);


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
