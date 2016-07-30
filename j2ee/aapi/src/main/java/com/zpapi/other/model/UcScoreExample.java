package com.zpapi.other.model;

import java.util.ArrayList;
import java.util.List;

public class UcScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UcScoreExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andShopScoreIsNull() {
            addCriterion("shop_score is null");
            return (Criteria) this;
        }

        public Criteria andShopScoreIsNotNull() {
            addCriterion("shop_score is not null");
            return (Criteria) this;
        }

        public Criteria andShopScoreEqualTo(Integer value) {
            addCriterion("shop_score =", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreNotEqualTo(Integer value) {
            addCriterion("shop_score <>", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreGreaterThan(Integer value) {
            addCriterion("shop_score >", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_score >=", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreLessThan(Integer value) {
            addCriterion("shop_score <", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreLessThanOrEqualTo(Integer value) {
            addCriterion("shop_score <=", value, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreIn(List<Integer> values) {
            addCriterion("shop_score in", values, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreNotIn(List<Integer> values) {
            addCriterion("shop_score not in", values, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreBetween(Integer value1, Integer value2) {
            addCriterion("shop_score between", value1, value2, "shopScore");
            return (Criteria) this;
        }

        public Criteria andShopScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_score not between", value1, value2, "shopScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreIsNull() {
            addCriterion("sns_score is null");
            return (Criteria) this;
        }

        public Criteria andSnsScoreIsNotNull() {
            addCriterion("sns_score is not null");
            return (Criteria) this;
        }

        public Criteria andSnsScoreEqualTo(Integer value) {
            addCriterion("sns_score =", value, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreNotEqualTo(Integer value) {
            addCriterion("sns_score <>", value, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreGreaterThan(Integer value) {
            addCriterion("sns_score >", value, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("sns_score >=", value, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreLessThan(Integer value) {
            addCriterion("sns_score <", value, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("sns_score <=", value, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreIn(List<Integer> values) {
            addCriterion("sns_score in", values, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreNotIn(List<Integer> values) {
            addCriterion("sns_score not in", values, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreBetween(Integer value1, Integer value2) {
            addCriterion("sns_score between", value1, value2, "snsScore");
            return (Criteria) this;
        }

        public Criteria andSnsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("sns_score not between", value1, value2, "snsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreIsNull() {
            addCriterion("cms_score is null");
            return (Criteria) this;
        }

        public Criteria andCmsScoreIsNotNull() {
            addCriterion("cms_score is not null");
            return (Criteria) this;
        }

        public Criteria andCmsScoreEqualTo(Integer value) {
            addCriterion("cms_score =", value, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreNotEqualTo(Integer value) {
            addCriterion("cms_score <>", value, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreGreaterThan(Integer value) {
            addCriterion("cms_score >", value, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("cms_score >=", value, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreLessThan(Integer value) {
            addCriterion("cms_score <", value, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreLessThanOrEqualTo(Integer value) {
            addCriterion("cms_score <=", value, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreIn(List<Integer> values) {
            addCriterion("cms_score in", values, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreNotIn(List<Integer> values) {
            addCriterion("cms_score not in", values, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreBetween(Integer value1, Integer value2) {
            addCriterion("cms_score between", value1, value2, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andCmsScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("cms_score not between", value1, value2, "cmsScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNull() {
            addCriterion("total_score is null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIsNotNull() {
            addCriterion("total_score is not null");
            return (Criteria) this;
        }

        public Criteria andTotalScoreEqualTo(Integer value) {
            addCriterion("total_score =", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotEqualTo(Integer value) {
            addCriterion("total_score <>", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThan(Integer value) {
            addCriterion("total_score >", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_score >=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThan(Integer value) {
            addCriterion("total_score <", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreLessThanOrEqualTo(Integer value) {
            addCriterion("total_score <=", value, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreIn(List<Integer> values) {
            addCriterion("total_score in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotIn(List<Integer> values) {
            addCriterion("total_score not in", values, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreBetween(Integer value1, Integer value2) {
            addCriterion("total_score between", value1, value2, "totalScore");
            return (Criteria) this;
        }

        public Criteria andTotalScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("total_score not between", value1, value2, "totalScore");
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