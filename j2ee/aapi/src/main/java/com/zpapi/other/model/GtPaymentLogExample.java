package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtPaymentLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtPaymentLogExample() {
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

        public Criteria andPayTypeIdIsNull() {
            addCriterion("pay_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIsNotNull() {
            addCriterion("pay_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdEqualTo(Integer value) {
            addCriterion("pay_type_id =", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotEqualTo(Integer value) {
            addCriterion("pay_type_id <>", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThan(Integer value) {
            addCriterion("pay_type_id >", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type_id >=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThan(Integer value) {
            addCriterion("pay_type_id <", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type_id <=", value, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdIn(List<Integer> values) {
            addCriterion("pay_type_id in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotIn(List<Integer> values) {
            addCriterion("pay_type_id not in", values, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_id between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPayTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type_id not between", value1, value2, "payTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNull() {
            addCriterion("payment_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIsNotNull() {
            addCriterion("payment_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentIdEqualTo(Integer value) {
            addCriterion("payment_id =", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotEqualTo(Integer value) {
            addCriterion("payment_id <>", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThan(Integer value) {
            addCriterion("payment_id >", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_id >=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThan(Integer value) {
            addCriterion("payment_id <", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_id <=", value, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdIn(List<Integer> values) {
            addCriterion("payment_id in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotIn(List<Integer> values) {
            addCriterion("payment_id not in", values, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_id between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaymentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_id not between", value1, value2, "paymentId");
            return (Criteria) this;
        }

        public Criteria andPaycodeIsNull() {
            addCriterion("paycode is null");
            return (Criteria) this;
        }

        public Criteria andPaycodeIsNotNull() {
            addCriterion("paycode is not null");
            return (Criteria) this;
        }

        public Criteria andPaycodeEqualTo(String value) {
            addCriterion("paycode =", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotEqualTo(String value) {
            addCriterion("paycode <>", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeGreaterThan(String value) {
            addCriterion("paycode >", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeGreaterThanOrEqualTo(String value) {
            addCriterion("paycode >=", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLessThan(String value) {
            addCriterion("paycode <", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLessThanOrEqualTo(String value) {
            addCriterion("paycode <=", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLike(String value) {
            addCriterion("paycode like", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotLike(String value) {
            addCriterion("paycode not like", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeIn(List<String> values) {
            addCriterion("paycode in", values, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotIn(List<String> values) {
            addCriterion("paycode not in", values, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeBetween(String value1, String value2) {
            addCriterion("paycode between", value1, value2, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotBetween(String value1, String value2) {
            addCriterion("paycode not between", value1, value2, "paycode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
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

        public Criteria andHistoryNeedpayIsNull() {
            addCriterion("history_needpay is null");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayIsNotNull() {
            addCriterion("history_needpay is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayEqualTo(BigDecimal value) {
            addCriterion("history_needpay =", value, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayNotEqualTo(BigDecimal value) {
            addCriterion("history_needpay <>", value, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayGreaterThan(BigDecimal value) {
            addCriterion("history_needpay >", value, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("history_needpay >=", value, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayLessThan(BigDecimal value) {
            addCriterion("history_needpay <", value, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("history_needpay <=", value, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayIn(List<BigDecimal> values) {
            addCriterion("history_needpay in", values, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayNotIn(List<BigDecimal> values) {
            addCriterion("history_needpay not in", values, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("history_needpay between", value1, value2, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andHistoryNeedpayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("history_needpay not between", value1, value2, "historyNeedpay");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Integer value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Integer value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Integer value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Integer value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Integer> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Integer> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Integer value1, Integer value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNull() {
            addCriterion("pay_sn is null");
            return (Criteria) this;
        }

        public Criteria andPaySnIsNotNull() {
            addCriterion("pay_sn is not null");
            return (Criteria) this;
        }

        public Criteria andPaySnEqualTo(Long value) {
            addCriterion("pay_sn =", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotEqualTo(Long value) {
            addCriterion("pay_sn <>", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThan(Long value) {
            addCriterion("pay_sn >", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_sn >=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThan(Long value) {
            addCriterion("pay_sn <", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnLessThanOrEqualTo(Long value) {
            addCriterion("pay_sn <=", value, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnIn(List<Long> values) {
            addCriterion("pay_sn in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotIn(List<Long> values) {
            addCriterion("pay_sn not in", values, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnBetween(Long value1, Long value2) {
            addCriterion("pay_sn between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andPaySnNotBetween(Long value1, Long value2) {
            addCriterion("pay_sn not between", value1, value2, "paySn");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueIsNull() {
            addCriterion("pay_return_value is null");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueIsNotNull() {
            addCriterion("pay_return_value is not null");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueEqualTo(String value) {
            addCriterion("pay_return_value =", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueNotEqualTo(String value) {
            addCriterion("pay_return_value <>", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueGreaterThan(String value) {
            addCriterion("pay_return_value >", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueGreaterThanOrEqualTo(String value) {
            addCriterion("pay_return_value >=", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueLessThan(String value) {
            addCriterion("pay_return_value <", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueLessThanOrEqualTo(String value) {
            addCriterion("pay_return_value <=", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueLike(String value) {
            addCriterion("pay_return_value like", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueNotLike(String value) {
            addCriterion("pay_return_value not like", value, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueIn(List<String> values) {
            addCriterion("pay_return_value in", values, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueNotIn(List<String> values) {
            addCriterion("pay_return_value not in", values, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueBetween(String value1, String value2) {
            addCriterion("pay_return_value between", value1, value2, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andPayReturnValueNotBetween(String value1, String value2) {
            addCriterion("pay_return_value not between", value1, value2, "payReturnValue");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Boolean value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Boolean value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Boolean value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Boolean value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Boolean value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Boolean> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Boolean> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Boolean value1, Boolean value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberIsNull() {
            addCriterion("pay_serial_number is null");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberIsNotNull() {
            addCriterion("pay_serial_number is not null");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberEqualTo(String value) {
            addCriterion("pay_serial_number =", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberNotEqualTo(String value) {
            addCriterion("pay_serial_number <>", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberGreaterThan(String value) {
            addCriterion("pay_serial_number >", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("pay_serial_number >=", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberLessThan(String value) {
            addCriterion("pay_serial_number <", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberLessThanOrEqualTo(String value) {
            addCriterion("pay_serial_number <=", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberLike(String value) {
            addCriterion("pay_serial_number like", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberNotLike(String value) {
            addCriterion("pay_serial_number not like", value, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberIn(List<String> values) {
            addCriterion("pay_serial_number in", values, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberNotIn(List<String> values) {
            addCriterion("pay_serial_number not in", values, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberBetween(String value1, String value2) {
            addCriterion("pay_serial_number between", value1, value2, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andPaySerialNumberNotBetween(String value1, String value2) {
            addCriterion("pay_serial_number not between", value1, value2, "paySerialNumber");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefIsNull() {
            addCriterion("crd_bll_ref is null");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefIsNotNull() {
            addCriterion("crd_bll_ref is not null");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefEqualTo(String value) {
            addCriterion("crd_bll_ref =", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefNotEqualTo(String value) {
            addCriterion("crd_bll_ref <>", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefGreaterThan(String value) {
            addCriterion("crd_bll_ref >", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefGreaterThanOrEqualTo(String value) {
            addCriterion("crd_bll_ref >=", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefLessThan(String value) {
            addCriterion("crd_bll_ref <", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefLessThanOrEqualTo(String value) {
            addCriterion("crd_bll_ref <=", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefLike(String value) {
            addCriterion("crd_bll_ref like", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefNotLike(String value) {
            addCriterion("crd_bll_ref not like", value, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefIn(List<String> values) {
            addCriterion("crd_bll_ref in", values, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefNotIn(List<String> values) {
            addCriterion("crd_bll_ref not in", values, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefBetween(String value1, String value2) {
            addCriterion("crd_bll_ref between", value1, value2, "crdBllRef");
            return (Criteria) this;
        }

        public Criteria andCrdBllRefNotBetween(String value1, String value2) {
            addCriterion("crd_bll_ref not between", value1, value2, "crdBllRef");
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