package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtQuanCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtQuanCardExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCardBatchIdIsNull() {
            addCriterion("card_batch_id is null");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdIsNotNull() {
            addCriterion("card_batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdEqualTo(Integer value) {
            addCriterion("card_batch_id =", value, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdNotEqualTo(Integer value) {
            addCriterion("card_batch_id <>", value, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdGreaterThan(Integer value) {
            addCriterion("card_batch_id >", value, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_batch_id >=", value, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdLessThan(Integer value) {
            addCriterion("card_batch_id <", value, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_batch_id <=", value, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdIn(List<Integer> values) {
            addCriterion("card_batch_id in", values, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdNotIn(List<Integer> values) {
            addCriterion("card_batch_id not in", values, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("card_batch_id between", value1, value2, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_batch_id not between", value1, value2, "cardBatchId");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNull() {
            addCriterion("card_num is null");
            return (Criteria) this;
        }

        public Criteria andCardNumIsNotNull() {
            addCriterion("card_num is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumEqualTo(String value) {
            addCriterion("card_num =", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotEqualTo(String value) {
            addCriterion("card_num <>", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThan(String value) {
            addCriterion("card_num >", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("card_num >=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThan(String value) {
            addCriterion("card_num <", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLessThanOrEqualTo(String value) {
            addCriterion("card_num <=", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumLike(String value) {
            addCriterion("card_num like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotLike(String value) {
            addCriterion("card_num not like", value, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumIn(List<String> values) {
            addCriterion("card_num in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotIn(List<String> values) {
            addCriterion("card_num not in", values, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumBetween(String value1, String value2) {
            addCriterion("card_num between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andCardNumNotBetween(String value1, String value2) {
            addCriterion("card_num not between", value1, value2, "cardNum");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andCardTypeEqualTo(Integer value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Integer value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Integer value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Integer value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Integer value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Integer> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Integer> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Integer value1, Integer value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeIsNull() {
            addCriterion("validity_period_type is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeIsNotNull() {
            addCriterion("validity_period_type is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeEqualTo(Boolean value) {
            addCriterion("validity_period_type =", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeNotEqualTo(Boolean value) {
            addCriterion("validity_period_type <>", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeGreaterThan(Boolean value) {
            addCriterion("validity_period_type >", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("validity_period_type >=", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeLessThan(Boolean value) {
            addCriterion("validity_period_type <", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("validity_period_type <=", value, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeIn(List<Boolean> values) {
            addCriterion("validity_period_type in", values, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeNotIn(List<Boolean> values) {
            addCriterion("validity_period_type not in", values, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("validity_period_type between", value1, value2, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("validity_period_type not between", value1, value2, "validityPeriodType");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Integer value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Integer value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Integer value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Integer value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Integer value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Integer> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Integer> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Integer value1, Integer value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Integer value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Integer value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Integer value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Integer value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Integer value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Integer> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Integer> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Integer value1, Integer value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNull() {
            addCriterion("valid_time is null");
            return (Criteria) this;
        }

        public Criteria andValidTimeIsNotNull() {
            addCriterion("valid_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidTimeEqualTo(Integer value) {
            addCriterion("valid_time =", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotEqualTo(Integer value) {
            addCriterion("valid_time <>", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThan(Integer value) {
            addCriterion("valid_time >", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_time >=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThan(Integer value) {
            addCriterion("valid_time <", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeLessThanOrEqualTo(Integer value) {
            addCriterion("valid_time <=", value, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeIn(List<Integer> values) {
            addCriterion("valid_time in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotIn(List<Integer> values) {
            addCriterion("valid_time not in", values, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeBetween(Integer value1, Integer value2) {
            addCriterion("valid_time between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andValidTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_time not between", value1, value2, "validTime");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andLeastamountIsNull() {
            addCriterion("leastamount is null");
            return (Criteria) this;
        }

        public Criteria andLeastamountIsNotNull() {
            addCriterion("leastamount is not null");
            return (Criteria) this;
        }

        public Criteria andLeastamountEqualTo(Integer value) {
            addCriterion("leastamount =", value, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountNotEqualTo(Integer value) {
            addCriterion("leastamount <>", value, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountGreaterThan(Integer value) {
            addCriterion("leastamount >", value, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("leastamount >=", value, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountLessThan(Integer value) {
            addCriterion("leastamount <", value, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountLessThanOrEqualTo(Integer value) {
            addCriterion("leastamount <=", value, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountIn(List<Integer> values) {
            addCriterion("leastamount in", values, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountNotIn(List<Integer> values) {
            addCriterion("leastamount not in", values, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountBetween(Integer value1, Integer value2) {
            addCriterion("leastamount between", value1, value2, "leastamount");
            return (Criteria) this;
        }

        public Criteria andLeastamountNotBetween(Integer value1, Integer value2) {
            addCriterion("leastamount not between", value1, value2, "leastamount");
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

        public Criteria andSourceOrderSnIsNull() {
            addCriterion("source_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnIsNotNull() {
            addCriterion("source_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnEqualTo(Long value) {
            addCriterion("source_order_sn =", value, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnNotEqualTo(Long value) {
            addCriterion("source_order_sn <>", value, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnGreaterThan(Long value) {
            addCriterion("source_order_sn >", value, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("source_order_sn >=", value, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnLessThan(Long value) {
            addCriterion("source_order_sn <", value, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("source_order_sn <=", value, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnIn(List<Long> values) {
            addCriterion("source_order_sn in", values, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnNotIn(List<Long> values) {
            addCriterion("source_order_sn not in", values, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnBetween(Long value1, Long value2) {
            addCriterion("source_order_sn between", value1, value2, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andSourceOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("source_order_sn not between", value1, value2, "sourceOrderSn");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Integer value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Integer value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Integer value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Integer value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Integer> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Integer> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(Integer value) {
            addCriterion("use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(Integer value) {
            addCriterion("use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(Integer value) {
            addCriterion("use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(Integer value) {
            addCriterion("use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<Integer> values) {
            addCriterion("use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<Integer> values) {
            addCriterion("use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(Integer value1, Integer value2) {
            addCriterion("use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseRangeIsNull() {
            addCriterion("use_range is null");
            return (Criteria) this;
        }

        public Criteria andUseRangeIsNotNull() {
            addCriterion("use_range is not null");
            return (Criteria) this;
        }

        public Criteria andUseRangeEqualTo(String value) {
            addCriterion("use_range =", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotEqualTo(String value) {
            addCriterion("use_range <>", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeGreaterThan(String value) {
            addCriterion("use_range >", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeGreaterThanOrEqualTo(String value) {
            addCriterion("use_range >=", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeLessThan(String value) {
            addCriterion("use_range <", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeLessThanOrEqualTo(String value) {
            addCriterion("use_range <=", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeLike(String value) {
            addCriterion("use_range like", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotLike(String value) {
            addCriterion("use_range not like", value, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeIn(List<String> values) {
            addCriterion("use_range in", values, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotIn(List<String> values) {
            addCriterion("use_range not in", values, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeBetween(String value1, String value2) {
            addCriterion("use_range between", value1, value2, "useRange");
            return (Criteria) this;
        }

        public Criteria andUseRangeNotBetween(String value1, String value2) {
            addCriterion("use_range not between", value1, value2, "useRange");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Integer value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Integer value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Integer value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Integer value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Integer value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Integer> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Integer> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Integer value1, Integer value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailIsNull() {
            addCriterion("use_range_detail is null");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailIsNotNull() {
            addCriterion("use_range_detail is not null");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailEqualTo(String value) {
            addCriterion("use_range_detail =", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailNotEqualTo(String value) {
            addCriterion("use_range_detail <>", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailGreaterThan(String value) {
            addCriterion("use_range_detail >", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailGreaterThanOrEqualTo(String value) {
            addCriterion("use_range_detail >=", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailLessThan(String value) {
            addCriterion("use_range_detail <", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailLessThanOrEqualTo(String value) {
            addCriterion("use_range_detail <=", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailLike(String value) {
            addCriterion("use_range_detail like", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailNotLike(String value) {
            addCriterion("use_range_detail not like", value, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailIn(List<String> values) {
            addCriterion("use_range_detail in", values, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailNotIn(List<String> values) {
            addCriterion("use_range_detail not in", values, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailBetween(String value1, String value2) {
            addCriterion("use_range_detail between", value1, value2, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseRangeDetailNotBetween(String value1, String value2) {
            addCriterion("use_range_detail not between", value1, value2, "useRangeDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailIsNull() {
            addCriterion("use_condition_detail is null");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailIsNotNull() {
            addCriterion("use_condition_detail is not null");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailEqualTo(String value) {
            addCriterion("use_condition_detail =", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailNotEqualTo(String value) {
            addCriterion("use_condition_detail <>", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailGreaterThan(String value) {
            addCriterion("use_condition_detail >", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailGreaterThanOrEqualTo(String value) {
            addCriterion("use_condition_detail >=", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailLessThan(String value) {
            addCriterion("use_condition_detail <", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailLessThanOrEqualTo(String value) {
            addCriterion("use_condition_detail <=", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailLike(String value) {
            addCriterion("use_condition_detail like", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailNotLike(String value) {
            addCriterion("use_condition_detail not like", value, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailIn(List<String> values) {
            addCriterion("use_condition_detail in", values, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailNotIn(List<String> values) {
            addCriterion("use_condition_detail not in", values, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailBetween(String value1, String value2) {
            addCriterion("use_condition_detail between", value1, value2, "useConditionDetail");
            return (Criteria) this;
        }

        public Criteria andUseConditionDetailNotBetween(String value1, String value2) {
            addCriterion("use_condition_detail not between", value1, value2, "useConditionDetail");
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