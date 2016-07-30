package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtQuanCardLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtQuanCardLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserCardIdIsNull() {
            addCriterion("user_card_id is null");
            return (Criteria) this;
        }

        public Criteria andUserCardIdIsNotNull() {
            addCriterion("user_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserCardIdEqualTo(Integer value) {
            addCriterion("user_card_id =", value, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdNotEqualTo(Integer value) {
            addCriterion("user_card_id <>", value, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdGreaterThan(Integer value) {
            addCriterion("user_card_id >", value, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_card_id >=", value, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdLessThan(Integer value) {
            addCriterion("user_card_id <", value, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_card_id <=", value, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdIn(List<Integer> values) {
            addCriterion("user_card_id in", values, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdNotIn(List<Integer> values) {
            addCriterion("user_card_id not in", values, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdBetween(Integer value1, Integer value2) {
            addCriterion("user_card_id between", value1, value2, "userCardId");
            return (Criteria) this;
        }

        public Criteria andUserCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_card_id not between", value1, value2, "userCardId");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Boolean value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Boolean value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Boolean value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Boolean value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Boolean> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Boolean> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Long value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Long value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Long value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Long value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Long> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Long> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Long value1, Long value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Boolean value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Boolean value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Boolean value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Boolean value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Boolean> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Boolean> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyIsNull() {
            addCriterion("history_total_money is null");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyIsNotNull() {
            addCriterion("history_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("history_total_money =", value, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("history_total_money <>", value, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("history_total_money >", value, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("history_total_money >=", value, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyLessThan(BigDecimal value) {
            addCriterion("history_total_money <", value, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("history_total_money <=", value, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("history_total_money in", values, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("history_total_money not in", values, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("history_total_money between", value1, value2, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andHistoryTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("history_total_money not between", value1, value2, "historyTotalMoney");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkIsNull() {
            addCriterion("trade_remark is null");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkIsNotNull() {
            addCriterion("trade_remark is not null");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkEqualTo(String value) {
            addCriterion("trade_remark =", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotEqualTo(String value) {
            addCriterion("trade_remark <>", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkGreaterThan(String value) {
            addCriterion("trade_remark >", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("trade_remark >=", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkLessThan(String value) {
            addCriterion("trade_remark <", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkLessThanOrEqualTo(String value) {
            addCriterion("trade_remark <=", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkLike(String value) {
            addCriterion("trade_remark like", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotLike(String value) {
            addCriterion("trade_remark not like", value, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkIn(List<String> values) {
            addCriterion("trade_remark in", values, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotIn(List<String> values) {
            addCriterion("trade_remark not in", values, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkBetween(String value1, String value2) {
            addCriterion("trade_remark between", value1, value2, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andTradeRemarkNotBetween(String value1, String value2) {
            addCriterion("trade_remark not between", value1, value2, "tradeRemark");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(Long value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(Long value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(Long value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(Long value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<Long> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<Long> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(Long value1, Long value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(Integer value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(Integer value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(Integer value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(Integer value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(Integer value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<Integer> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<Integer> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(Integer value1, Integer value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}