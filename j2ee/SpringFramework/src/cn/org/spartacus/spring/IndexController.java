/**   
 * 项目名称：Spring3mvc demo 
 * Copyright © 2010-2012 spartacus.org.cn All Rights Reserved 
 */    
package cn.org.spartacus.spring;    
  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
  
/** 
 * Description: TODO 
 * @author hankaibo 
 * @date 2012-11-4 
 * @version v1.0 
 */  
@Controller  
public class IndexController extends AbstractController{  
       public String helloworld() {  
      
        return "index";  
    }

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 System.out.println("sdfsadf");
		
		return new ModelAndView("index");
	}  
  
}