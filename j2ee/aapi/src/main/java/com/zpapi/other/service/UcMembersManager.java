/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javacommon.Async;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.EntityDao;
import com.zhen.commons.util.PropertiesUtil;
import com.zpapi.activity.service.ActivityAskManager;
import com.zhen.commons.base.BaseManager;
import com.zpapi.other.dao.GtMemberLoginLogDao;
import com.zpapi.other.dao.GtMemberProfileDao;
import com.zpapi.other.dao.GtMemberScoreTradeDao;
import com.zpapi.other.dao.UcMemberLogDao;
import com.zpapi.other.dao.UcMembersDao;
import com.zpapi.other.dao.UcScoreDao;
import com.zpapi.other.model.GtMemberProfile;
import com.zpapi.other.model.UcMemberLog;
import com.zpapi.other.model.UcMembers;
import com.zpapi.other.model.UcScore;
import com.zpapi.other.query.GtMemberProfileQuery;
import com.zpapi.other.query.GtMemberScoreTradeQuery;
import com.zpapi.other.query.UcMembersQuery;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional("transactionManager1")
public class UcMembersManager extends BaseManager<UcMembers, java.lang.Long> {

	private Logger logger = Logger.getLogger(UcMembersManager.class);

	private UcMembersDao ucMembersDao;
	@SuppressWarnings("unused")
	private UcMemberLogDao ucMemberLogDao;

	private UcScoreDao ucScoreDao;

	private GtMemberScoreTradeDao gtMemberScoreTradeDao;

	private GtMemberLoginLogDao gtMemberLoginLogDao;

	private GtMemberProfileDao gtMemberProfileDao;

	private ZpuserRegCouponManager zpuserRegCouponManager;

	private GtQuanCardManager gtQuanCardManager;

	private ActivityAskManager activityAskManager;

	private GtAppSendUserManager gtAppSendUserManager;

	public void setUcScoreDao(UcScoreDao ucScoreDao) {
		this.ucScoreDao = ucScoreDao;
	}

	public void setUcMemberLogDao(UcMemberLogDao ucMemberLogDao) {
		this.ucMemberLogDao = ucMemberLogDao;
	}

	/** 增加setXXXX()方法,spring就可以通过autowire自动设置对象属性,请注意大小写 */
	public void setUcMembersDao(UcMembersDao dao) {
		this.ucMembersDao = dao;
	}

	public void setGtMemberProfileDao(GtMemberProfileDao gtMemberProfileDao) {
		this.gtMemberProfileDao = gtMemberProfileDao;
	}

	public void setGtMemberScoreTradeDao(GtMemberScoreTradeDao dao) {
		this.gtMemberScoreTradeDao = dao;
	}

	public void setGtMemberLoginLogDao(GtMemberLoginLogDao gtMemberLoginLogDao) {
		this.gtMemberLoginLogDao = gtMemberLoginLogDao;
	}

	public ZpuserRegCouponManager getZpuserRegCouponManager() {
		return zpuserRegCouponManager;
	}

	public void setZpuserRegCouponManager(ZpuserRegCouponManager zpuserRegCouponManager) {
		this.zpuserRegCouponManager = zpuserRegCouponManager;
	}

	public GtQuanCardManager getGtQuanCardManager() {
		return gtQuanCardManager;
	}

	public void setGtQuanCardManager(GtQuanCardManager gtQuanCardManager) {
		this.gtQuanCardManager = gtQuanCardManager;
	}

	public ActivityAskManager getActivityAskManager() {
		return activityAskManager;
	}

	public void setActivityAskManager(ActivityAskManager activityAskManager) {
		this.activityAskManager = activityAskManager;
	}

	public void setGtAppSendUserManager(GtAppSendUserManager manager) {
		this.gtAppSendUserManager = manager;
	}

	@Override
	public EntityDao getEntityDao() {
		return this.ucMembersDao;
	}

	@Transactional(readOnly = true)
	public Page findPage(UcMembersQuery query) {
		return ucMembersDao.findPage(query);
	}

	@Transactional(readOnly = true)
	public UcMembers getByUsername(java.lang.String v) {
		return ucMembersDao.getByUsername(v);
	}

	@Transactional(readOnly = true)
	public UcMembers getByMobile(java.lang.String v) {
		return ucMembersDao.getByMobile(v);
	}

	@Transactional(readOnly = true)
	public UcMembers getByEmail(java.lang.String v) {
		return ucMembersDao.getByEmail(v);
	}

	public Long readScore(String scoreType) {
		String score = PropertiesUtil.getProperty(scoreType, "editscore.properties");
		return Long.parseLong(score);
	}

	// 注册获得积分
	public void updateScoreForRegister(String memberid) {
		Long score = this.readScore("register");
		Map map = new HashMap();
		map.put("score", score);
		map.put("memberid", memberid);
		gtMemberProfileDao.updateScore(map);
	}

	// 每日登陆获得积分
	public void updateScoreForLogin(String memberid) {
		Long score = this.readScore("loginscore");
		Map map = new HashMap();
		map.put("score", score);
		map.put("memberid", memberid);
		gtMemberProfileDao.updateScore(map);
	}

	public void updateScoreForOrder(String memberid, Integer score) {
		Map map = new HashMap();
		map.put("score", score);
		map.put("memberid", memberid);
		gtMemberProfileDao.updateScore(map);
	}

	public UcMembers onRegister(UcMembersQuery query) {
		UcMembers uc = null;
		try {
			if (query.getEmail() != null) {
				ucMembersDao.onRegister(query);
				uc = ucMembersDao.getByUsername(query.getUsername());
			} else {
				ucMembersDao.onRegisterByMobileNumber(query);
				uc = ucMembersDao.getByMobile(query.getMobile());
			}

			GtMemberProfileQuery mQuery = new GtMemberProfileQuery();
			if (uc.getUid() != null) {
				mQuery.setMemberId(uc.getUid());
			}
			if (query.getUsername() != null) {
				mQuery.setUsername(query.getUsername());
			}
			if (query.getEmail() != null) {
				mQuery.setEmail(query.getEmail());
			}
			if (query.getMobile() != null) {
				mQuery.setMobile(query.getMobile());
			}
			if (query.getChannel() != null) {
				mQuery.setChannel(query.getChannel());
			}
			GtMemberProfile memberProfile = (GtMemberProfile) gtMemberProfileDao.getById(uc.getUid());
			if (memberProfile == null) {
				if (query.getMobile() != null) {
					gtMemberProfileDao.addMemberProfileByMobile(mQuery);
				} else {
					gtMemberProfileDao.addMemberProfile(mQuery);
				}
				this.updateScoreForRegister(uc.getUid().toString());
				GtMemberScoreTradeQuery scoreQuery = new GtMemberScoreTradeQuery();
				scoreQuery.setMemberId(uc.getUid());
				scoreQuery.setTradeType(true);
				scoreQuery.setScoreType("shop_score");
				scoreQuery.setTradeScore(readScore("register"));
				scoreQuery.setHistoryTotalScore(readScore("register"));
				scoreQuery.setTradeMethod("注册，赠送积分");
				gtMemberScoreTradeDao.addScoreTrade(scoreQuery);

				//
				UcScore ucScore = new UcScore();
				ucScore.setUid(uc.getUid());
				ucScore.setShopScore(readScore("register").intValue());
				ucScore.setTotalScore(readScore("register").intValue());
				ucScoreDao.insertScore(ucScore);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return uc;
	}

	public Integer exitsUserName(String username) {
		return ucMembersDao.exitsUserName(username);
	}

	public Integer exitsEmail(String email) {
		return ucMembersDao.exitsEmail(email);
	}

	public Integer exitsMobile(String mobile) {
		return ucMembersDao.exitsMobile(mobile);
	}

	public Integer exitsSalt(Map<String, String> map) {
		return ucMembersDao.exitsSalt(map);
	}

	public UcMembers getUserByEmail(String email) {
		return ucMembersDao.getUserByEmail(email);
	}

	public UcMembers getUserByMobileNumber(String mobileNumber) {
		return ucMembersDao.getUserByMobileNumber(mobileNumber);
	}

	public Integer onLogin(final Map<String, String> map) {
		Integer ret = ucMembersDao.onLogin(map);
		if (ret > 0) {
			// 登陆信息异步处理
			new Async() {
				@Override
				public void process() {
					try {
						processLogin(map);
					} catch (Exception e) {
						logger.error(e.getMessage(), e);
					}
				}
			}.run();
		}
		return ret;
	}

	public Integer onLoginOauth(Map<String, String> map) {
		Integer ret = ucMembersDao.onLogin(map);
		return ret;
	}

	public String getSalt(Map<String, String> map) {
		return ucMembersDao.getSalt(map);
	}

	public Integer checkMember(String memberid) {
		return ucMembersDao.checkMember(memberid);
	}

	public void updateErrorNum(UcMembers model) {
		ucMembersDao.updateErrorNum(model);

	}

	public void updateMobile(UcMembersQuery query) {
		ucMembersDao.updateMobile(query);
	}

	public void updateUid(UcMembersQuery query) {
		ucMembersDao.updateUid(query);

	}

	@Transactional("transactionManager1")
	public boolean updateNmae(UcMembers model, GtMemberProfile newModel) throws RuntimeException {
		Long id = model.getUid();
		StringBuffer oldValue = new StringBuffer();
		StringBuffer newValue = new StringBuffer();
		oldValue.append(model.getUsername() + "," + model.getMobile() + "," + model.getEmail());
		newValue.append(newModel.getUsername() + "," + newModel.getMobile() + "," + newModel.getEmail());
		try {
			model.setUsername(newModel.getUsername());
			model.setMobile(newModel.getMobile());
			model.setEmail(newModel.getEmail());

			ucMembersDao.updateName(model);
			gtMemberProfileDao.updatename(newModel);
			editUserLog(oldValue.toString(), newValue.toString(), Integer.valueOf(id.toString()), "修改成功");
			return true;
		} catch (Exception e) {
			editUserLog(oldValue.toString(), newValue.toString(), Integer.valueOf(id.toString()), "修改失败");
			throw new RuntimeException(e);
		}

	}

	public void editUserLog(String oldValue, String newValue, Integer memberid, String content) {
		UcMemberLog ul = new UcMemberLog();
		ul.setLogType(1);
		ul.setNewValue(newValue);
		ul.setOldValue(oldValue);
		ul.setMemberid(memberid);
		ul.setOperationContent(content);
		ul.setOperationField("username");
		ucMemberLogDao.insertLog(ul);
	}

	public List<UcMembers> exitsOpenId(Map<String, String> paramMap) {
		return ucMembersDao.exutsOpenId(paramMap);
	}

	@Transactional("transactionManager1")
	public void insertThuc(UcMembers uc, GtMemberProfile gp) throws RuntimeException {
		try {
			ucMembersDao.save(uc);
			gp.setMemberId(uc.getUid());
			gtMemberProfileDao.save(gp);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public void upThirdName(UcMembers up_uc) {
		ucMembersDao.upThirdName(up_uc);

	}

	public UcMembers exitThUser(Map tempMap) {
		return ucMembersDao.exitThUser(tempMap);
	}

	public UcMembers bindAccount(Map<String, String> paraMap) {
		return ucMembersDao.bindAccount(paraMap);
	}

	public int bindAccountById(UcMembers ucMember) {
		return ucMembersDao.bindAccountById(ucMember);

	}

	public void addScore(Map<String, Object> map) {
		try {
			Long memberId = Long.valueOf(map.get("memberId").toString());
			Integer giveScore = Integer.valueOf(map.get("giveScore").toString());
			String type = (String) map.get("type");
			Long historyTotalScore = gtMemberProfileDao.getScore(memberId.toString());
			this.updateScoreForOrder(memberId.toString(), giveScore);

			if (historyTotalScore == null) {
				historyTotalScore = (long) 0;
			}

			GtMemberScoreTradeQuery scoreQuery = new GtMemberScoreTradeQuery();
			if ("1".equals(type)) {
				scoreQuery.setTradeMethod("订单完成，赠送积分");
			} else if ("2".equals(type)) {
				scoreQuery.setTradeMethod("用户签到，赠送积分");
			} else if ("3".equals(type)) {
				scoreQuery.setTradeMethod("晒单评价，赠送积分");
			} else if ("4".equals(type)) {
				scoreQuery.setTradeMethod("参加活动 ，积分改变");
			}
			scoreQuery.setMemberId(memberId);
			if (giveScore < 0) {
				scoreQuery.setTradeType(false);
			} else {
				scoreQuery.setTradeType(true);
			}
			scoreQuery.setTradeScore(Math.abs(Long.valueOf(giveScore)));
			scoreQuery.setHistoryTotalScore(historyTotalScore + Long.valueOf(giveScore));
			scoreQuery.setScoreType("shop_score");
			gtMemberScoreTradeDao.addScoreTrade(scoreQuery);

			UcScore ucScore = new UcScore();
			ucScore.setUid(memberId);
			ucScore.setShopScore(historyTotalScore.intValue() + giveScore);
			ucScore.setTotalScore(historyTotalScore.intValue() + giveScore);
			ucScoreDao.updateScore(ucScore);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	public Integer onLogins(Map<String, String> checkMap) {
		return ucMembersDao.onLogin(checkMap);
	}

	public Long getUesrHasThirdId(Map<String, String> paraMap2) {
		return ucMembersDao.getUesrHasThirdId(paraMap2);
	}

	public int passwordToken(UcMembers uc) {
		return ucMembersDao.passwordToken(uc);
	}

	/**
	 * 获取对应登陆方式的用户信息。
	 * 
	 * @author Luffy
	 * @param mode
	 *            登陆方式：1为用户，2为邮箱，3为手机号
	 * @param userName
	 * @return
	 */
	@Transactional(readOnly = true)
	public UcMembers getUserInfo(String mode, String userName) {
		return com.zpapi.other.model.LoginMode.getUcMember(this, mode, userName);
	}

	/**
	 * 用户登陆时积分，日志，返券，活动等处理。
	 * 
	 * @author Luffy
	 * @param map
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private void processLogin(final Map<String, String> map) throws NumberFormatException, IOException {
		// Long memberid = Long.valueOf(map.get("memberid"));
		// // 每日登陆获得积分
		// Integer count =
		// gtMemberLoginLogDao.checkLoginTimeToday(memberid.intValue());
		// if (count == 0) {
		// // 历史积分
		// Long historyTotalScore =
		// gtMemberProfileDao.getScore(map.get("memberid"));
		// if (historyTotalScore == null) {
		// historyTotalScore = 0L;
		// }
		// // 现总积分
		// Long score = historyTotalScore + readScore("loginscore");
		// this.updateScoreForLogin(map.get("memberid"));
		// GtMemberScoreTradeQuery scoreQuery = new GtMemberScoreTradeQuery();
		// scoreQuery.setMemberId(memberid);
		// scoreQuery.setTradeType(true);
		// scoreQuery.setScoreType("shop_score");
		// scoreQuery.setTradeScore(readScore("loginscore"));
		// scoreQuery.setHistoryTotalScore(score);
		// scoreQuery.setTradeMethod("每日登录，赠送积分");
		// gtMemberScoreTradeDao.addScoreTrade(scoreQuery);
		//
		// UcScore ucScore = new UcScore();
		// ucScore.setUid(memberid);
		// ucScore.setShopScore(score.intValue());
		// ucScore.setTotalScore(score.intValue());
		// ucScoreDao.updateScore(ucScore);
		// }
		//
		// // 登陆日志
		// GtMemberLoginLog loginLog = new GtMemberLoginLog();
		// loginLog.setMemberId(memberid);
		// loginLog.setUsername(map.get("realUserName"));
		// loginLog.setLoginIp(map.get("loginip"));
		// gtMemberLoginLogDao.addLoginLog(loginLog);
		//
		// // 登陆送返券卡
		// List<ZpuserRegCoupon> coupons = zpuserRegCouponManager.getTaskId(2,
		// map.get("channel"));
		// if (memberid != null && coupons != null && coupons.size() > 0) {
		// for (ZpuserRegCoupon c : coupons) {
		// Integer cardCount =
		// zpuserRegCouponManager.getOnloginCardCount(c.getCardType(),
		// c.getCouponTaskId(), memberid);
		// if (cardCount > 0) {
		// continue;
		// }
		// // 生成其他卡
		// int type = 0;
		// // 生成打折卡
		// if (c.getCardType() == 12) {
		// type = 1;
		// }
		// gtQuanCardManager.createQuanCard(String.valueOf(c.getCouponTaskId()),
		// memberid, type);
		// }
		// }
		// // 营销活动
		// activityAskManager.onLoginActivity(map.get("username"), memberid,
		// map.get("channel"));
		//
		// // app设备号录入
		// if (map.get("model") != null) {
		// GtAppSendUser appUser = new GtAppSendUser();
		// appUser.setModel(map.get("model"));
		// appUser.setUid(memberid.intValue());
		// appUser.setApptype(StringUtils.defaultIfEmpty(map.get("apptype"),
		// "0"));
		// gtAppSendUserManager.updateByModel(appUser);
		// }
	}

}
