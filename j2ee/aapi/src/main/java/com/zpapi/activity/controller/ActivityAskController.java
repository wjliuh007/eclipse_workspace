package com.zpapi.activity.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacommon.base.BaseRestSpringController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.util.StringUtils;
import com.zp.api.model.ActivityLimit;
import com.zp.api.model.ActivityPoint;
import com.zp.api.model.ActivityPointMembers;
import com.zp.api.vo.query.ActivityCardMemberidQuery;
import com.zp.commons.error.OrderCode;
import com.zp.commons.error.ResultTool;
import com.zpapi.activity.model.ActivityAsk;
import com.zpapi.activity.service.ActivityAnniversary2014Manager;
import com.zpapi.activity.service.ActivityAskManager;
import com.zpapi.other.error.BaseErrorTool;
import com.zpapi.other.error.BusinessException;
import com.zpapi.other.error.ErrorCode;
import com.zpapi.other.query.UcMembersQuery;
import com.zpapi.other.service.GtQuanCardManager;
import com.zpapi.other.service.OauthAccessTokenManager;
import com.zpapi.other.service.UcMembersManager;
import com.zpapi.other.util.OAuthUtil;
import com.zpapi.other.util.SendMessageUtil;

/**
 * 分拆重构活动、推广相关接口
 * 
 * @author wjliuh007@zhen.com
 * @version 1.1
 * @since 2016-03-29
 */

@Controller
@RequestMapping("/activity")
public class ActivityAskController extends BaseRestSpringController<ActivityAsk, java.lang.Integer> {
	// 默认多列排序,example: username desc,createTime asc
	protected static final String DEFAULT_SORT_COLUMNS = null;
	protected static final String wxGame = "wxGame";
	protected static final String wxGameisEnd = "wxGameisEnd";

	private Logger logger = Logger.getLogger(ActivityAskController.class);

	@Resource
	private ActivityAskManager activityAskManager;
	@Resource
	private UcMembersManager ucMembersManager;
	// @Resource
	// private ActivityPointMembersManager activityPointMembersManager;

	@Resource
	private OauthAccessTokenManager oauthAccessTokenManager;
	@Resource
	private GtQuanCardManager gtQuanCardManager;

	@Resource
	private ActivityAnniversary2014Manager activityAnniversary2014Manager;

	/**
	 * 获取问题
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/getQuestion.json")
	@ResponseBody
	public ModelAndView getQuestion(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView result = new ModelAndView();
		try {
			String memberid = request.getParameter("memberid");
			Integer count = activityAnniversary2014Manager.countByMemberid(memberid);
			if (count == 3) {
				throw new BusinessException(ErrorCode.sys_090);
			}
			// 判断用户是否有做过答题
			Integer level = activityAnniversary2014Manager.getLevel(memberid);
			ActivityAsk[] activityAsk = activityAskManager.getQuestion(level);

			result.addObject("question", activityAsk);
			return result;
		} catch (Exception e) {
			result = BaseErrorTool.create(e);
			return result;
		}
	}

	// /**
	// * 答案
	// *
	// * @param request
	// * @param response
	// * @return
	// */
	// @RequestMapping(value = "/checkAnswer.json")
	// public @ResponseBody
	// ModelAndView checkAnswer(HttpServletRequest request,
	// HttpServletResponse response) {
	//
	// ModelAndView result = new ModelAndView();
	// Map ret = new HashMap();
	// try{
	// String id = request.getParameter("id");
	// String memberid = request.getParameter("memberid");
	// String[] ids = id.split(",");
	// boolean isok = true;
	//
	// Integer count =
	// activityAnniversary2014Manager.countAnswerByMemberid(memberid);
	// if(count == 0){
	// throw new BusinessException(ErrorCode.sys_012);
	// }
	// //答案是否正确
	// for(String idd:ids){
	// Integer ok = activityAskManager.checkRight(idd);
	// if(ok == 0){
	// isok = false;
	// break;
	// }
	// }
	//
	// ret = activityAnniversary2014Manager.doCheckAnswer(memberid,isok);
	//
	// result.addObject(ret);
	// return result;
	// } catch (Exception e) {
	// result = BaseErrorTool.create(e);
	// return result;
	// }
	//
	// }
	//
	/**
	 * 生成卡号，自动激活
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/createCard.json")
	public @ResponseBody ModelAndView createCard(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView result = new ModelAndView();
		String accesstoken = request.getParameter("access_token");
		String thirdpartyid = request.getParameter("thirdpartyid");
		String memberid = request.getParameter("memberid");

		try {
			 if(!SendMessageUtil.checkIPValid(StringUtils.getRealRemoteAddr(request))){
			 throw new
			 BusinessException(com.zpapi.other.error.ErrorCode.sys_004);
			 }
			if (thirdpartyid != null) {
				UcMembersQuery query = new UcMembersQuery();
				query.setUid(Long.valueOf(memberid));
				query.setThirdPartyId(thirdpartyid);

				Page page = ucMembersManager.findPage(query);
				if (page.getTotalCount() == 0) {
					throw new BusinessException(com.zpapi.other.error.ErrorCode.sys_053);
				}

			} else {
				Map tempMap = new HashMap();
				tempMap.put("accesstoken", accesstoken);
				tempMap.put("memberid", memberid);
				OAuthUtil.check(oauthAccessTokenManager, ucMembersManager, tempMap);
			}

			String taskId = request.getParameter("taskId");
			String batchId = request.getParameter("batchId");
			Integer num = 0;
			if (null != taskId && taskId.trim().length() > 0) {
				num = gtQuanCardManager.createQuanCard(taskId, Long.parseLong(memberid), 0);
			} else if (null != batchId && batchId.trim().length() > 0) {
				num = gtQuanCardManager.createQuanCard(batchId, Long.parseLong(memberid), 1);
			} else {
				throw new BusinessException(com.zpapi.other.error.ErrorCode.sys_008);
			}
			if (num == 1) {
				result.addObject("isOK", true);
				result.addObject("code", 200);
				return result;
			} else {
				result.addObject("isNO", false);
				result.addObject("code", "生成卡失败");
				return result;
			}

		} catch (Exception e) {
			result = BaseErrorTool.create(e);
			return result;
		}

	}
	
	/**
	 * 获取权限
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/checkMemberChance.json")
	public @ResponseBody
	ModelAndView checkMemberChance(HttpServletRequest request,
 HttpServletResponse response) {
		ModelAndView result = new ModelAndView();
		Map map = new HashMap();
		ActivityCardMemberidQuery activityCardMemberidQuery = new ActivityCardMemberidQuery();
		String memberid = request.getParameter("memberid");
		String activityname = request.getParameter("activityname");
		String accesstoken = request.getParameter("access_token");
		String thirdpartyid = request.getParameter("thirdpartyid");
		String weixinid = request.getParameter("weixinid");
		try {
			//白名单 
			List<ActivityPointMembers> list = activityPointMembersManager.getByPointId(memberid);
			if(list.size() > 0){
				List<ActivityPoint> lst = activityPointManager.findData(activityname);
				if(lst.size() == 0){
					return ResultTool.create(OrderCode.order_607, result);
				} 
			}
			if (thirdpartyid != null) {
				UcMembersQuery query = new UcMembersQuery();
				query.setUid(Long.valueOf(memberid));
				query.setThirdPartyId(thirdpartyid);

				Page page = ucMembersManager.findPage(query);
				if (page.getTotalCount() == 0) {
					throw new BusinessException(ErrorCode.sys_053);
				}

				activityCardMemberidQuery.setMemberId(memberid);
			} else if (weixinid != null) {

				activityCardMemberidQuery.setMemberId(weixinid);
			} else {
				Map tempMap = new HashMap();
				tempMap.put("accesstoken", accesstoken);
				tempMap.put("memberid", memberid);
				OAuthUtil.check(oauthAccessTokenManager, ucMembersManager, tempMap);

				activityCardMemberidQuery.setMemberId(memberid);
			}
			activityCardMemberidQuery.setActivityName(activityname);
			Map<String, Object> paraMap=new HashMap<String, Object>();
			paraMap.put("activityname", activityname);
			
			ActivityLimit activityLimit =activityCardMemberidManager.getlimitCount(paraMap);
			if(activityLimit==null){
				throw new BusinessException(ErrorCode.sys_008);
			}
			int limitNum=activityLimit.getLimitNum();
			int type=activityLimit.getLimitType();
			int count=0;
			if(type==1){
				count = activityCardMemberidManager.check(activityCardMemberidQuery);
			}else if(type==2){
				count=activityCardMemberidManager.checkActivity(activityCardMemberidQuery);
			}
			
			if(limitNum==-1){
				map.put("chancenum", -1);
			}else{
				if (count >= limitNum) {
					map.put("chancenum", 0);
				} else {
					map.put("chancenum", limitNum-count);
				}
			}
			result = ResultTool.createSuccess(map, result);
		} catch (Exception e) {
			result = BaseErrorTool.create(e);
			return result;
		}
		return result;
	}
}
