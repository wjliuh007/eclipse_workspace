package com.zpapi.other.model;

import java.util.ArrayList;
import java.util.List;

public class GtPointCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtPointCardExample() {
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

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Boolean value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Boolean value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Boolean value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Boolean value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Boolean> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Boolean> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
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

        public Criteria andTimesNumIsNull() {
            addCriterion("times_num is null");
            return (Criteria) this;
        }

        public Criteria andTimesNumIsNotNull() {
            addCriterion("times_num is not null");
            return (Criteria) this;
        }

        public Criteria andTimesNumEqualTo(Integer value) {
            addCriterion("times_num =", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumNotEqualTo(Integer value) {
            addCriterion("times_num <>", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumGreaterThan(Integer value) {
            addCriterion("times_num >", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("times_num >=", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumLessThan(Integer value) {
            addCriterion("times_num <", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumLessThanOrEqualTo(Integer value) {
            addCriterion("times_num <=", value, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumIn(List<Integer> values) {
            addCriterion("times_num in", values, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumNotIn(List<Integer> values) {
            addCriterion("times_num not in", values, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumBetween(Integer value1, Integer value2) {
            addCriterion("times_num between", value1, value2, "timesNum");
            return (Criteria) this;
        }

        public Criteria andTimesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("times_num not between", value1, value2, "timesNum");
            return (Criteria) this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Integer value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Integer value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Integer value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Integer value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Integer value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Integer> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Integer> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Integer value1, Integer value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Integer value1, Integer value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNull() {
            addCriterion("due_date is null");
            return (Criteria) this;
        }

        public Criteria andDueDateIsNotNull() {
            addCriterion("due_date is not null");
            return (Criteria) this;
        }

        public Criteria andDueDateEqualTo(Integer value) {
            addCriterion("due_date =", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotEqualTo(Integer value) {
            addCriterion("due_date <>", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThan(Integer value) {
            addCriterion("due_date >", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("due_date >=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThan(Integer value) {
            addCriterion("due_date <", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateLessThanOrEqualTo(Integer value) {
            addCriterion("due_date <=", value, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateIn(List<Integer> values) {
            addCriterion("due_date in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotIn(List<Integer> values) {
            addCriterion("due_date not in", values, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateBetween(Integer value1, Integer value2) {
            addCriterion("due_date between", value1, value2, "dueDate");
            return (Criteria) this;
        }

        public Criteria andDueDateNotBetween(Integer value1, Integer value2) {
            addCriterion("due_date not between", value1, value2, "dueDate");
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

        public Criteria andActiveDateIsNull() {
            addCriterion("active_date is null");
            return (Criteria) this;
        }

        public Criteria andActiveDateIsNotNull() {
            addCriterion("active_date is not null");
            return (Criteria) this;
        }

        public Criteria andActiveDateEqualTo(Integer value) {
            addCriterion("active_date =", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotEqualTo(Integer value) {
            addCriterion("active_date <>", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateGreaterThan(Integer value) {
            addCriterion("active_date >", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_date >=", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateLessThan(Integer value) {
            addCriterion("active_date <", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateLessThanOrEqualTo(Integer value) {
            addCriterion("active_date <=", value, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateIn(List<Integer> values) {
            addCriterion("active_date in", values, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotIn(List<Integer> values) {
            addCriterion("active_date not in", values, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateBetween(Integer value1, Integer value2) {
            addCriterion("active_date between", value1, value2, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveDateNotBetween(Integer value1, Integer value2) {
            addCriterion("active_date not between", value1, value2, "activeDate");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdIsNull() {
            addCriterion("active_member_id is null");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdIsNotNull() {
            addCriterion("active_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdEqualTo(Long value) {
            addCriterion("active_member_id =", value, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdNotEqualTo(Long value) {
            addCriterion("active_member_id <>", value, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdGreaterThan(Long value) {
            addCriterion("active_member_id >", value, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdGreaterThanOrEqualTo(Long value) {
            addCriterion("active_member_id >=", value, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdLessThan(Long value) {
            addCriterion("active_member_id <", value, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdLessThanOrEqualTo(Long value) {
            addCriterion("active_member_id <=", value, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdIn(List<Long> values) {
            addCriterion("active_member_id in", values, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdNotIn(List<Long> values) {
            addCriterion("active_member_id not in", values, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdBetween(Long value1, Long value2) {
            addCriterion("active_member_id between", value1, value2, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andActiveMemberIdNotBetween(Long value1, Long value2) {
            addCriterion("active_member_id not between", value1, value2, "activeMemberId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
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