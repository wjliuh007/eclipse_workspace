/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2013
 */

package com.zpapi.other.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.org.rapid_framework.page.Page;

import com.zhen.commons.base.EntityDao;
import com.zhen.commons.util.DateUtil;
import com.zhen.commons.base.BaseManager;
import com.zpapi.other.dao.GtCardBatchDao;
import com.zpapi.other.dao.GtCardDao;
import com.zpapi.other.dao.GtCouponCardTaskDao;
import com.zpapi.other.dao.GtDiscountCardDao;
import com.zpapi.other.dao.GtGiftCardDao;
import com.zpapi.other.dao.GtGoodsBrandDao;
import com.zpapi.other.dao.GtMemberProfileDao;
import com.zpapi.other.dao.GtOrdersDao;
import com.zpapi.other.dao.GtOrdersItemDao;
import com.zpapi.other.dao.GtOrdersLogDao;
import com.zpapi.other.dao.GtPointCardDao;
import com.zpapi.other.dao.GtQuanCardDao;
import com.zpapi.other.dao.GtQuanCardLogDao;
import com.zpapi.other.dao.GtQuanCardRoDao;
import com.zpapi.other.dao.GtSendOrdersDao;
import com.zpapi.other.error.ApiException;
import com.zpapi.other.model.GtCard;
import com.zpapi.other.model.GtCardBatch;
import com.zpapi.other.model.GtCouponCardTask;
import com.zpapi.other.model.GtDiscountCard;
import com.zpapi.other.model.GtGiftCard;
import com.zpapi.other.model.GtGoodsBrand;
import com.zpapi.other.model.GtOrders;
import com.zpapi.other.model.GtOrdersLog;
import com.zpapi.other.model.GtPointCard;
import com.zpapi.other.model.GtQuanCard;
import com.zpapi.other.model.GtQuanCardLog;
import com.zpapi.other.query.GtQuanCardQuery;
import com.zpapi.other.util.OrderCode;
import com.zpapi.other.util.OrderCreateTool;
import com.zpapi.other.util.StringUtils;

/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Service
@Transactional
public class GtQuanCardManager extends BaseManager<GtQuanCard, java.lang.Long> {

	/**
	 * 领券后多少天可用
	 */
	private static final Integer afterConfirmValidity = 2;
	@Resource
	private GtQuanCardDao gtQuanCardDao;
	@Resource
	private GtQuanCardRoDao gtQuanCardRoDao;
	@Resource
	private GtDiscountCardDao gtDiscountCardDao;
	@Resource
	private GtGiftCardDao gtGiftCardDao;
	@Resource
	private GtPointCardDao gtPointCardDao;
	@Resource
	private GtMemberProfileDao gtMemberProfileDao;
	@Resource
	private GtQuanCardLogDao gtQuanCardLogDao;
	@Resource
	private GtCardDao gtCardDao;
	@Resource
	private GtCardBatchDao gtCardBatchDao;
	@Resource
	private GtCouponCardTaskDao gtCouponCardTaskDao;
	@Resource
	private GtGoodsBrandDao gtGoodsBrandDao;
	@Resource
	private GtOrdersDao gtOrdersDao;
	@Resource
	private GtOrdersItemDao gtOrdersItemDao;
	@Resource
	private GtOrdersLogDao gtOrdersLogDao;
	@Resource
	private GtSendOrdersDao gtSendOrdersDao;

	@Override
	public EntityDao<?, ?> getEntityDao() {
		return this.gtQuanCardDao;
	}

	@Transactional(readOnly = true)
	public Page<?> findPage(GtQuanCardQuery query) {
		return gtQuanCardDao.findPage(query);
	}

	public Integer countQuan(Map<?, ?> map) {
		return gtQuanCardDao.countQuan(map);
	}

	public Integer activeCount(Map<?, ?> map) {
		return gtQuanCardDao.activeCount(map);
	}

	public GtQuanCard[] getQuanList(GtQuanCardQuery query) {
		return gtQuanCardDao.getQuanList(query);
	}

	public Page<?> getQuanLists(GtQuanCardQuery query) {
		return gtQuanCardDao.getQuanLists(query);
	}

	public GtQuanCard[] getCardInfo(Map<String, String> map) {
		return gtQuanCardDao.getCardInfo(map);
	}

	public GtQuanCard[] getQuancardInfo(Map<String, Object> map) {
		return gtQuanCardDao.getQuancardInfo(map);
	}

	public GtQuanCard getQuanCard(Map<String, String> map) {
		return gtQuanCardDao.getQuanCard(map);
	}

	public GtQuanCard[] getQuanCardList(String memberid) {
		return gtQuanCardDao.getQuanCardList(memberid);
	}

	public Integer[] getQuanMoney(Map<String, String> map) {
		return gtQuanCardDao.getQuanMoney(map);
	}

	public GtGoodsBrandDao getGtGoodsBrandDao() {
		return gtGoodsBrandDao;
	}

	public void setGtGoodsBrandDao(GtGoodsBrandDao gtGoodsBrandDao) {
		this.gtGoodsBrandDao = gtGoodsBrandDao;
	}

	/**
	 * 
	 * @Title: changeQuancardInfo
	 * @Description: 此方法有事务问题，请调用activeQuanCard(Map<String, String> map)方法
	 * @param map
	 * @return
	 * @author zhupengren
	 * @date 2015年2月12日 下午8:23:17
	 */
	private Integer changeQuancardInfo(Map<String, String> map) {
		Integer ret = gtQuanCardDao.changeQuancardInfo(map);
		if (ret > 0) {
			GtQuanCard card = new GtQuanCard();
			GtDiscountCard discountCard = null;
			GtGiftCard giftCard = null;
			GtPointCard pointCard = null;
			GtCard gtCard = null;
			String cardRange = "";
			Integer gifts = null;
			// 1=>返券卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡
			if ("2".equals(map.get("type"))) {
				discountCard = gtDiscountCardDao.getDiscountCard(map.get("cardnum").toString());
			} else if ("5".equals(map.get("type"))) {
				giftCard = gtGiftCardDao.getGiftCard(map.get("cardnum").toString());
				gifts = gtMemberProfileDao.getmembergift(map.get("memberid").toString());
				Map<String, Object> tempMap = new HashMap<String, Object>();
				tempMap.put("gift", giftCard.getPoint());
				tempMap.put("memberid", map.get("memberid"));
				gtMemberProfileDao.updateGift(tempMap);
			} else if ("1".equals(map.get("type"))) {
				pointCard = gtPointCardDao.getPointCard(map.get("cardnum").toString());
			} else if ("3".equals(map.get("type"))) {// 打折卡
				gtCard = gtCardDao.getCardInfo(map);
				if (gtCard.getCardBatchId() != null) {
					GtCardBatch gtCardBatch = (GtCardBatch) gtCardBatchDao.getById(gtCard.getCardBatchId());
					cardRange = gtCardBatch.getRuleText();
				}
			}
			Integer startDate = 0;
			Integer endDate = 0;
			Integer price = 0;
			Integer createTime = 0;
			Integer leastamount = 0;
			Integer cardBatchId = 0;
			String useRange = null;
			String cardType = null;
			String taskId = null;
			if (discountCard != null) {// 满减卡
				taskId = String.valueOf(discountCard.getTaskId());
				startDate = discountCard.getStartDate();
				endDate = discountCard.getDueDate();
				card.setCardType(1);
				useRange = "全场通用（除特惠商品）";
				cardType = "满减卡";
				leastamount = Integer.valueOf(discountCard.getUseCondition().toString());
				price = Integer.parseInt(discountCard.getMoney().toString());
				createTime = discountCard.getCreateTime();
			}
			if (giftCard != null) {// 礼品卡
				taskId = String.valueOf(giftCard.getTaskId());
				startDate = giftCard.getStartDate();
				endDate = giftCard.getDueDate();
				price = giftCard.getPoint();
				card.setCardType(2);
				useRange = "全场通用";
				cardType = "礼品卡";
				createTime = giftCard.getCreateTime();
			}
			if (pointCard != null) {// 返券卡
				taskId = String.valueOf(pointCard.getTaskId());
				GtCouponCardTask task = (GtCouponCardTask) gtCouponCardTaskDao.getById(pointCard.getTaskId());
				if (task != null) {
					if (task.getScope().equals(1)) {
						useRange = "全场通用";
					} else if (task.getScope().equals(2)) {
						useRange = "全场通用（除特惠商品）";
					} else {
						useRange = "全场通用（除特惠商品）";
					}
				} else {
					useRange = "全场通用（除特惠商品）";
				}
				startDate = pointCard.getStartDate();
				endDate = pointCard.getDueDate();
				card.setCardType(0);
				price = pointCard.getPoint();
				cardType = "返券卡";
				createTime = pointCard.getCreateTime();
			}
			if (gtCard != null) {// 打折卡
				startDate = gtCard.getStartTime();
				endDate = gtCard.getEndTime();
				card.setCardType(12);
				price = (int) (gtCard.getAmount() * 100);
				useRange = cardRange;
				cardType = "打折卡";
				createTime = gtCard.getCreateTime();
				cardBatchId = gtCard.getCardBatchId();
			}
			if (discountCard != null || giftCard != null || pointCard != null || gtCard != null) {
				card.setCardNum(map.get("cardnum").toString());
				Long memberId = Long.parseLong(map.get("memberid").toString());
				card.setIsActive(1);
				card.setStatus(0);
				if (taskId != null) {
					GtCouponCardTask task = gtCouponCardTaskDao.queryByTaskId(taskId);
					card.setTitle(task.getTitle());
					card.setUseRangeDetail(task.getUseRangeDetail());
					card.setUseConditionDetail(task.getUseConditionDetail());
					card.setValidityPeriodType(task.getValidityPeriodType());
					card.setValidTime(task.getValidTime());
					// 有效期类型(1固定时长,2领券后多少天可用)
					if (task.getValidityPeriodType() == afterConfirmValidity) {
						startDate = DateUtil.nowTimeStamp();
						// 计算截止时间
						endDate = DateUtil.nowTimeStamp() + (task.getValidTime() * 24 * 60 * 60);
					}
				} else if (cardBatchId != null) {
					GtCardBatch gtCardBatch = (GtCardBatch) gtCardBatchDao.getById(cardBatchId);
					card.setTitle(gtCardBatch.getTitle());
					card.setUseRangeDetail(gtCardBatch.getUseRangeDetail());
					card.setUseConditionDetail(gtCardBatch.getUseConditionDetail());
					card.setValidityPeriodType(gtCardBatch.getValidityPeriodType());
					card.setValidTime(gtCardBatch.getValidTime());
					// 有效期类型(1固定时长,2领券后多少天可用)
					if (gtCardBatch.getValidityPeriodType() == afterConfirmValidity) {
						startDate = DateUtil.nowTimeStamp();
						// 计算截止时间
						endDate = DateUtil.nowTimeStamp() + (gtCardBatch.getValidTime() * 24 * 60 * 60);
					}
				}
				card.setStarttime(startDate);
				card.setEndtime(endDate);
				card.setCreateTime(createTime);
				card.setMemberId(memberId);
				card.setPrice(price);
				card.setUseRange(useRange);
				card.setLeastamount(leastamount);
				card.setCardBatchId(cardBatchId);
				gtQuanCardDao.addToQuan(card);
			}
			// 优惠券激活日志
			GtQuanCardLog cardLog = new GtQuanCardLog();
			cardLog.setCardType(card.getCardType().toString());
			cardLog.setMemberId(Long.parseLong(map.get("memberid").toString()));
			cardLog.setMoney(Long.valueOf(card.getPrice().toString()));
			cardLog.setTradeType(true);
			cardLog.setTradeRemark("激活" + cardType + "，卡号：" + card.getCardNum() + "");
			if (gifts != null) {
				cardLog.setHistoryTotalMoney(Long.valueOf(gifts.toString()) + giftCard.getPoint());
			}
			gtQuanCardLogDao.addCardLog(cardLog);
		}
		return ret;
	}

	/**
	 * 激活券
	 * 
	 * @param map
	 * @return
	 */
	public Map<String, Object> activeQuanCard(Map<String, String> map) {
		Map<String, Object> tempMap = new HashMap<String, Object>();
		String cardnum = map.get("cardnum");
		String type = null;// $type为卡号类型，1:满减卡 2：礼品卡 3：返券卡
		if (StringUtils.isNotEmpty(cardnum)) {
			type = judgeCardType(cardnum);
			Integer count = 0;
			Integer validCount = 0;
			Integer ret = 0;
			Integer check = 0;
			Map<String, String> amap = new HashMap<String, String>();
			amap.put("cardnum", map.get("cardnum"));

			// 锁表gt_member_profile
			if (map.get("memberid") != null && StringUtils.isNum(map.get("memberid"))) {
				gtMemberProfileDao.getMyProfileForUpdate(Integer.parseInt(map.get("memberid")));
			}
			// 1=>返券卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡
			if ("2".equals(type)) {
				GtDiscountCard discountCard = gtDiscountCardDao.getDiscountCard(cardnum);
				if (discountCard != null) {
					count = 1;
					if (discountCard.getCardStatus().equals(2)) {
						ret = gtQuanCardDao.activeCount(map);
					} else {
						ret = gtQuanCardDao.activeCount(amap);
					}
					// 判断卡是否过期
					validCount = judgeValidCount(String.valueOf(discountCard.getTaskId()));
				}
			} else if ("5".equals(type)) {
				count = gtGiftCardDao.getCardCount(cardnum);
				ret = gtQuanCardDao.activeCount(amap);
				if (count > 0) {
					GtGiftCard giftCard = gtGiftCardDao.getGiftCard(cardnum);
					validCount = judgeValidCount(String.valueOf(giftCard.getTaskId()));
				}
			} else if ("1".equals(type)) {
				ret = gtQuanCardDao.activeCount(amap);
				GtPointCard pointCard = gtPointCardDao.getPointCard(cardnum);
				if (pointCard != null) {
					count = 1;
					if (pointCard.getIsCheck()) {
						Map<String, Object> pmap = new HashMap<String, Object>();
						pmap.put("timesnum", pointCard.getTimesNum());
						pmap.put("activememberid", map.get("memberid"));
						check = gtPointCardDao.checkPointCard(pmap);
					}
					validCount = judgeValidCount(String.valueOf(pointCard.getTaskId()));
				}
			} else if ("3".equals(type)) {
				count = gtCardDao.getCardCount(cardnum);
				// 是否通用
				Integer cardStatus = gtCardBatchDao.getStatusByCard(cardnum);
				if (cardStatus != null && cardStatus == 1) {
					ret = gtQuanCardDao.activeCount(map);
				} else {
					ret = gtQuanCardDao.activeCount(amap);
				}

				if (count > 0) {
					Integer batchId = gtCardDao.getBatchIdByNum(cardnum);
					GtCardBatch batch = gtCardBatchDao.getByBatchId(batchId);
					Integer nowTime = DateUtil.nowTimeStamp();
					if (batch.getValidityPeriodType() == afterConfirmValidity) {
						validCount = 1;
					} else if (batch.getStartTime() < nowTime && batch.getEndTime() > nowTime) {
						validCount = 1;
					}
				}
			} else {
				tempMap.put("result", "9");// 该优惠券不存在
				return tempMap;
			}

			if (validCount > 0) {
				if (count > 0) {
					if (check > 0) {
						tempMap.put("result", "6");// 已经使用过该批次的充值卡充过值
					} else {
						if (ret > 0) {
							tempMap.put("result", "8");// 该优惠券已被激活
						} else {
							map.put("type", type);
							Integer info = changeQuancardInfo(map);
							if (info > 0) {
								tempMap.put("result", "1");// 激活成功
								Map<String, String> cardMap = new HashMap<String, String>();
								cardMap.put("cardnum", cardnum);
								cardMap.put("memberid", map.get("memberid"));
								GtQuanCard card = gtQuanCardDao.getQuanCard(cardMap);
								tempMap.put("card", card);// 激活成功
							} else {
								tempMap.put("result", "0");// 激活失败
							}
						}
					}
				} else {
					tempMap.put("result", "9");// 该优惠券不存在
				}
			} else {
				tempMap.put("result", "7");// 该优惠券过期
			}
		} else {
			tempMap.put("result", "9");// 该优惠券不存在
		}
		return tempMap;
	}

	/**
	 * 判断卡是否过期
	 * 
	 * @param taskId
	 * @return
	 */
	private Integer judgeValidCount(String taskId) {
		GtCouponCardTask task = gtCouponCardTaskDao.queryByTaskId(taskId);
		Integer nowTime = DateUtil.nowTimeStamp();
		if (task == null) {
			return 0;
		}
		if (task.getValidityPeriodType() == afterConfirmValidity) {
			return 1;
		} else if (task.getStartDate() < nowTime && task.getDueDate() > nowTime) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * 判断优惠券类型
	 * 
	 * @param cardnum
	 * @return
	 */
	private String judgeCardType(String cardnum) {
		// 1=>返券卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡
		String type = null;
		if (startCheck("^[a-zA-Z]{3}\\d{10}$", cardnum)) {
			type = "2";
		} else if (startCheck("^[a-zA-Z]{5}\\d{9}$", cardnum)) {
			type = "5";
		} else if (startCheck("^[a-zA-Z]{2}\\d{10}$", cardnum)) {
			type = "1";
		} else if (startCheck("^[a-zA-Z]{1,5}\\d{11}$", cardnum)) {
			type = "3";
		} else { // 通码不为空，无法判断卡种类，可能是自定义通码,根据到表里查询判断
			GtCouponCardTask task = gtCouponCardTaskDao.queryByCardNum(cardnum);
			if (task != null && task.getType() != null) {
				type = String.valueOf(task.getType());
			} else {
				int count = gtCardDao.getCardCount(cardnum);
				if (count > 0) {
					type = "3";
				}
			}
		}
		return type;
	}

	public boolean startCheck(String reg, String string) {
		boolean tem = false;
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(string);
		tem = matcher.matches();
		return tem;
	}

	public void addToQuan(GtQuanCard gtQuanCard) {
		gtQuanCardDao.addToQuan(gtQuanCard);

	}

	@Transactional(readOnly = true)
	public Integer getQuanCount(Map<?, ?> map) {
		return gtQuanCardRoDao.countQuan(map);
	}

	public Integer createQuanCard(String taskId, Long memberid, int type) {
		boolean createQuanCard = createQuanCard(taskId, memberid, type, 0);
		if (createQuanCard == true) {
			return 1;
		}
		return 2;
	}

	public void createQuanCardByOrder(String orderId) {
		List<Map<String, Object>> taskidInOrders = gtOrdersDao.getTaskidInOrdersitemByorderId(orderId);
		if (taskidInOrders.size() <= 0) {
			throw new ApiException(OrderCode.order_729);
		}
		for (Map<String, Object> Ordersitem : taskidInOrders) {
			Object quantity = Ordersitem.get("quantity");
			if (!StringUtils.isEmpty(String.valueOf(quantity)) && StringUtils.isNum(String.valueOf(quantity))) {
				int quanCount = Integer.valueOf(String.valueOf(quantity));
				Object id = Ordersitem.get("batchId") == null ? Ordersitem.get("taskId") : Ordersitem
						.get("batchId");
				int type = Ordersitem.get("batchId") == null ? 0 : 1;
				for (int i = 0; i < quanCount; i++) {
					if (!createQuanCard(id.toString(),
							Long.valueOf(String.valueOf(Ordersitem.get("memberId"))), type, 0)) {
						throw new ApiException(OrderCode.order_729);
					}
				}
				GtOrdersLog gtOrdersLog = new GtOrdersLog();
				gtOrdersLog.setIp("192.168.1.126");
				gtOrdersLog.setOrderId(Integer.valueOf(orderId));
				gtOrdersLog.setUserId(1);
				gtOrdersLog.setStatus(4);
				gtOrdersLog.setSubStatus(8);
				gtOrdersLog.setType(false);
				gtOrdersLog.setOpTime(DateUtil.nowTimeStamp());
				gtOrdersLog.setOpType(19);
				gtOrdersLog.setExpressId(0);
				gtOrdersLog.setMemo("订单已确认,送出礼券");
				gtOrdersLog.setFormerly(id.toString());
				gtOrdersLogDao.insertOrderLog(gtOrdersLog);
			}
		}
		GtOrders order = gtOrdersDao.getDataByOrderid(orderId);
		order.setSubStatus(8);
		order.setStatus(4);
		gtOrdersDao.updateOrderStatus(order);
		// 更改发货单状态
		gtSendOrdersDao.updateOrderStatusDone(orderId);
	}

	/**
	 * 
	 * @Title: createQuanCard
	 * @Description:
	 * @param taskId
	 * @param memberid
	 * @param type
	 * @param amount
	 *            卡面额，根据不同卡做不同判断。（eg. 返券判断任务金额为0，则使用此值作为返券面额）
	 * @throws BusinessException
	 * @author zhupengren
	 * @date 2014年11月4日 下午7:41:25
	 */
	public boolean createQuanCard(String taskId, Long memberid, int type, int amount) {
		String cardsn = "";
		if (1 == type) {
			GtCardBatch batch = gtCardBatchDao.getByBatchId(Integer.parseInt(taskId));
			// 1=>返券卡 2=>满减卡 3=>打折卡（旧） 4=>品类卡（旧） 5=>礼品卡
			if (null != batch) {
				if (4 == batch.getStatus() && 12 == batch.getType()) {// 判断状态为审核通过的打折卡
					while (true) {
						cardsn = OrderCreateTool.createCardsn(11, batch.getCardPrefix());
						Integer count = gtCardDao.getCardCount(cardsn);
						if (count == 0) {
							break;
						}
					}

					// 有效期类型(1固定时长,2领券后多少天可用)
					if (batch.getValidityPeriodType() == afterConfirmValidity) {
						Integer nowTime = DateUtil.nowTimeStamp();
						batch.setStartTime(nowTime);
						// 计算截止时间
						batch.setEndTime(nowTime + (batch.getValidTime() * 24 * 60 * 60));
					}

					GtCard card = new GtCard();
					card.setActiveMemberId(memberid.intValue());
					card.setActiveTime((int) (System.currentTimeMillis() / 1000));
					card.setAmount(batch.getAmount());
					card.setCardBatchId(batch.getId());
					card.setCardNumber(cardsn);
					card.setCreateTime((int) (System.currentTimeMillis() / 1000));
					card.setStartTime(batch.getStartTime());
					card.setEndTime(batch.getEndTime());
					card.setStatus(1);
					card.setType(12);
					gtCardDao.save(card);

					GtQuanCard gtQuanCard = new GtQuanCard();
					gtQuanCard.setIsActive(1);
					gtQuanCard.setStatus(0);
					gtQuanCard.setCardNum(cardsn);
					gtQuanCard.setCardType(12);
					gtQuanCard.setStarttime(batch.getStartTime());
					gtQuanCard.setEndtime(batch.getEndTime());
					gtQuanCard.setMemberId(memberid);
					gtQuanCard.setPrice((int) (batch.getAmount() * 100));
					gtQuanCard.setUseRange(batch.getRuleText());

					gtQuanCard.setTitle(batch.getTitle());
					gtQuanCard.setUseRangeDetail(batch.getUseRangeDetail());
					gtQuanCard.setUseConditionDetail(batch.getUseConditionDetail());
					gtQuanCard.setValidityPeriodType(batch.getValidityPeriodType());
					gtQuanCard.setValidTime(batch.getValidTime());
					// 有效期类型(1固定时长,2领券后多少天可用)
					if (batch.getValidityPeriodType() == afterConfirmValidity) {
						Integer nowTime = DateUtil.nowTimeStamp();
						gtQuanCard.setStarttime(nowTime);
						// 计算截止时间
						gtQuanCard.setEndtime(nowTime + (batch.getValidTime() * 24 * 60 * 60));
					} else {
						gtQuanCard.setStarttime(batch.getStartTime());
						gtQuanCard.setEndtime(batch.getEndTime());
					}

					if (batch.getUseCondition() != null) {
						gtQuanCard.setLeastamount(batch.getUseCondition());
					}
					gtQuanCard.setCardBatchId(batch.getId());
					gtQuanCardDao.addToQuan(gtQuanCard);
				}
				return true;
			} else {
				return false;
			}
		} else {
			GtCouponCardTask task = gtCouponCardTaskDao.queryByTaskId(taskId);
			if (task != null) {
				// 有效期类型(1固定时长,2领券后多少天可用)
				if (task.getValidityPeriodType() == afterConfirmValidity) {
					Integer nowTime = DateUtil.nowTimeStamp();
					task.setStartDate(nowTime);
					// 计算截止时间
					task.setDueDate(nowTime + (task.getValidTime() * 24 * 60 * 60));
				}
				// ======>满减卡
				if (task.getType() == 2) {
					// ^[a-zA-Z]{3}\\d{10}$
					while (true) {
						cardsn = OrderCreateTool.createCardsn(10, task.getCardPre());
						Integer count = gtDiscountCardDao.getCardCount(cardsn);
						if (count == 0) {
							break;
						}
					}

					GtDiscountCard gtDiscountCard = new GtDiscountCard();
					gtDiscountCard.setCardNum(cardsn);
					gtDiscountCard.setCategoryId(task.getCategoryId());
					gtDiscountCard.setUseCondition(task.getUseCondition());
					gtDiscountCard.setMoney(task.getMoney());
					gtDiscountCard.setStartDate(task.getStartDate());
					gtDiscountCard.setDueDate(task.getDueDate());
					gtDiscountCard.setStatus(true);
					gtDiscountCard.setCardStatus(task.getCardStatus());
					gtDiscountCard.setActiveMemberId(memberid);
					gtDiscountCard.setTaskId(task.getTaskId());
					gtDiscountCard.setBrandId(task.getBrandId());
					gtDiscountCard.setCardType(task.getCardType());
					gtDiscountCard.setIsSended(0);
					gtDiscountCardDao.createCard(gtDiscountCard);

					GtQuanCard gtQuanCard = buildQuanCard(memberid, cardsn, 1, task);
					if (task.getMoney() != null) {
						gtQuanCard.setPrice(task.getMoney().intValue());
					}
					if (task.getCardType() == 1 && task.getBrandId() != 0) {
						GtGoodsBrand[] gtbrand = gtGoodsBrandDao.getBrand(task.getBrandId().toString());
						String brand = gtbrand[0].getBrandName();
						if (StringUtils.isEmpty(brand)) {
							brand = "";
						}
						gtQuanCard.setUseRange("限" + brand + "品牌使用");
					} else {
						gtQuanCard.setUseRange("特殊商品除外,不与其他优惠叠加");
					}
					gtQuanCardDao.addToQuan(gtQuanCard);
				} else

				// ====>返券卡
				if (task.getType() == 1) {
					// ^[a-zA-Z]{2}\\d{10}$
					while (true) {
						cardsn = OrderCreateTool.createCardsn(10, task.getCardPre());
						Integer count = gtPointCardDao.getCardCount(cardsn);
						if (count == 0) {
							break;
						}
					}

					GtPointCard gtPointCard = new GtPointCard();
					gtPointCard.setIsCheck(true);
					gtPointCard.setCardNum(cardsn);
					gtPointCard.setTimesNum(task.getTimesNum());
					if (task.getMoney() != null) {
						if (0 == task.getMoney().intValue()) {
							gtPointCard.setPoint(amount);
						} else {
							gtPointCard.setPoint(task.getMoney().intValue());
						}
					}
					gtPointCard.setStartDate(task.getStartDate());
					gtPointCard.setDueDate(task.getDueDate());
					gtPointCard.setStatus(true);
					gtPointCard.setActiveMemberId(memberid);
					gtPointCard.setTaskId(task.getTaskId());
					gtPointCardDao.createCard(gtPointCard);

					GtQuanCard gtQuanCard = buildQuanCard(memberid, cardsn, 0, task);
					if (task.getMoney() != null) {
						if (0 == task.getMoney().intValue()) {
							gtQuanCard.setPrice(amount);
						} else {
							gtQuanCard.setPrice(task.getMoney().intValue());
						}
					}
					if (task.getScope() == 1) {
						gtQuanCard.setUseRange("全场通用");
					} else if (task.getScope() == 2) {
						gtQuanCard.setUseRange("全场通用（特殊商品除外,不与其他优惠叠加）");
					}
					gtQuanCardDao.addToQuan(gtQuanCard);
				} else
				// ====>礼品卡
				if (task.getType() == 5) {
					// ^[a-zA-Z]{2}\\d{10}$
					while (true) {
						cardsn = OrderCreateTool.createCardsn(10, task.getCardPre());
						Integer count = gtGiftCardDao.getCardCount(cardsn);
						if (count == 0) {
							break;
						}
					}
					GtGiftCard card = new GtGiftCard();
					card.setCardNum(cardsn);
					card.setStartDate(task.getStartDate());
					card.setDueDate(task.getDueDate());
					card.setActiveMemberId(memberid);
					card.setStatus(true);
					card.setTaskId(task.getTaskId());
					card.setCreateTime((int) (System.currentTimeMillis() / 1000));
					if (task.getMoney() != null) {
						card.setPoint(task.getMoney().intValue());
					}
					card.setSerialNumber(1);
					gtGiftCardDao.save(card);

					Map<String, Object> map = new HashMap<String, Object>(2);
					map.put("memberid", memberid);
					map.put("gift", task.getMoney());
					gtMemberProfileDao.updateGift(map);

					GtQuanCard gtQuanCard = buildQuanCard(memberid, cardsn, 2, task);
					if (task.getMoney() != null) {
						gtQuanCard.setPrice(task.getMoney().intValue());
					}
					gtQuanCard.setUseRange("全场通用");
					gtQuanCardDao.addToQuan(gtQuanCard);
					// 礼品卡日志

					Integer his = gtMemberProfileDao.getmembergift(memberid.toString());

					GtQuanCardLog log = new GtQuanCardLog();
					log.setCardType("2");
					log.setMemberId(memberid);
					log.setTradeType(Boolean.TRUE);
					log.setTradeRemark("购买自动激活礼品卡，卡号：" + cardsn + "");
					log.setMoney(task.getMoney());
					log.setOrderSn(0L);
					log.setHistoryTotalMoney(Long.valueOf(his));
					gtQuanCardLogDao.insertUsequanCardLog(log);
				}
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * 构造QuanCard
	 * 
	 * @param memberid
	 * @param cardsn
	 * @param cardType
	 * @param task
	 * @return
	 */
	private GtQuanCard buildQuanCard(Long memberid, String cardsn, Integer cardType, GtCouponCardTask task) {
		GtQuanCard gtQuanCard = new GtQuanCard();
		gtQuanCard.setCardNum(cardsn);
		gtQuanCard.setIsActive(1);
		gtQuanCard.setStatus(0);
		gtQuanCard.setCardType(cardType);
		gtQuanCard.setMemberId(memberid);
		gtQuanCard.setCardBatchId(0);
		gtQuanCard.setTitle(task.getTitle());
		gtQuanCard.setUseRangeDetail(task.getUseRangeDetail());
		gtQuanCard.setUseConditionDetail(task.getUseConditionDetail());
		gtQuanCard.setValidityPeriodType(task.getValidityPeriodType());
		gtQuanCard.setValidTime(task.getValidTime());
		gtQuanCard.setStarttime(task.getStartDate());
		gtQuanCard.setEndtime(task.getDueDate());
		if (task.getUseCondition() != null) {
			gtQuanCard.setLeastamount(task.getUseCondition().intValue());
		}
		return gtQuanCard;
	}
}
