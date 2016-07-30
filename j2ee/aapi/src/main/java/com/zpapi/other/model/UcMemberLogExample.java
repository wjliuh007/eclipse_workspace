package com.zpapi.other.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UcMemberLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UcMemberLogExample() {
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

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(Integer value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(Integer value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(Integer value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(Integer value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<Integer> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<Integer> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(Integer value1, Integer value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("log_type not between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andOperationTableIsNull() {
            addCriterion("operation_table is null");
            return (Criteria) this;
        }

        public Criteria andOperationTableIsNotNull() {
            addCriterion("operation_table is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTableEqualTo(String value) {
            addCriterion("operation_table =", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableNotEqualTo(String value) {
            addCriterion("operation_table <>", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableGreaterThan(String value) {
            addCriterion("operation_table >", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableGreaterThanOrEqualTo(String value) {
            addCriterion("operation_table >=", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableLessThan(String value) {
            addCriterion("operation_table <", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableLessThanOrEqualTo(String value) {
            addCriterion("operation_table <=", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableLike(String value) {
            addCriterion("operation_table like", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableNotLike(String value) {
            addCriterion("operation_table not like", value, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableIn(List<String> values) {
            addCriterion("operation_table in", values, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableNotIn(List<String> values) {
            addCriterion("operation_table not in", values, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableBetween(String value1, String value2) {
            addCriterion("operation_table between", value1, value2, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationTableNotBetween(String value1, String value2) {
            addCriterion("operation_table not between", value1, value2, "operationTable");
            return (Criteria) this;
        }

        public Criteria andOperationFieldIsNull() {
            addCriterion("operation_field is null");
            return (Criteria) this;
        }

        public Criteria andOperationFieldIsNotNull() {
            addCriterion("operation_field is not null");
            return (Criteria) this;
        }

        public Criteria andOperationFieldEqualTo(String value) {
            addCriterion("operation_field =", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldNotEqualTo(String value) {
            addCriterion("operation_field <>", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldGreaterThan(String value) {
            addCriterion("operation_field >", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldGreaterThanOrEqualTo(String value) {
            addCriterion("operation_field >=", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldLessThan(String value) {
            addCriterion("operation_field <", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldLessThanOrEqualTo(String value) {
            addCriterion("operation_field <=", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldLike(String value) {
            addCriterion("operation_field like", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldNotLike(String value) {
            addCriterion("operation_field not like", value, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldIn(List<String> values) {
            addCriterion("operation_field in", values, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldNotIn(List<String> values) {
            addCriterion("operation_field not in", values, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldBetween(String value1, String value2) {
            addCriterion("operation_field between", value1, value2, "operationField");
            return (Criteria) this;
        }

        public Criteria andOperationFieldNotBetween(String value1, String value2) {
            addCriterion("operation_field not between", value1, value2, "operationField");
            return (Criteria) this;
        }

        public Criteria andOldValueIsNull() {
            addCriterion("old_value is null");
            return (Criteria) this;
        }

        public Criteria andOldValueIsNotNull() {
            addCriterion("old_value is not null");
            return (Criteria) this;
        }

        public Criteria andOldValueEqualTo(String value) {
            addCriterion("old_value =", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotEqualTo(String value) {
            addCriterion("old_value <>", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueGreaterThan(String value) {
            addCriterion("old_value >", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueGreaterThanOrEqualTo(String value) {
            addCriterion("old_value >=", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueLessThan(String value) {
            addCriterion("old_value <", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueLessThanOrEqualTo(String value) {
            addCriterion("old_value <=", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueLike(String value) {
            addCriterion("old_value like", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotLike(String value) {
            addCriterion("old_value not like", value, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueIn(List<String> values) {
            addCriterion("old_value in", values, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotIn(List<String> values) {
            addCriterion("old_value not in", values, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueBetween(String value1, String value2) {
            addCriterion("old_value between", value1, value2, "oldValue");
            return (Criteria) this;
        }

        public Criteria andOldValueNotBetween(String value1, String value2) {
            addCriterion("old_value not between", value1, value2, "oldValue");
            return (Criteria) this;
        }

        public Criteria andNewValueIsNull() {
            addCriterion("new_value is null");
            return (Criteria) this;
        }

        public Criteria andNewValueIsNotNull() {
            addCriterion("new_value is not null");
            return (Criteria) this;
        }

        public Criteria andNewValueEqualTo(String value) {
            addCriterion("new_value =", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotEqualTo(String value) {
            addCriterion("new_value <>", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueGreaterThan(String value) {
            addCriterion("new_value >", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueGreaterThanOrEqualTo(String value) {
            addCriterion("new_value >=", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueLessThan(String value) {
            addCriterion("new_value <", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueLessThanOrEqualTo(String value) {
            addCriterion("new_value <=", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueLike(String value) {
            addCriterion("new_value like", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotLike(String value) {
            addCriterion("new_value not like", value, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueIn(List<String> values) {
            addCriterion("new_value in", values, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotIn(List<String> values) {
            addCriterion("new_value not in", values, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueBetween(String value1, String value2) {
            addCriterion("new_value between", value1, value2, "newValue");
            return (Criteria) this;
        }

        public Criteria andNewValueNotBetween(String value1, String value2) {
            addCriterion("new_value not between", value1, value2, "newValue");
            return (Criteria) this;
        }

        public Criteria andOperationContentIsNull() {
            addCriterion("operation_content is null");
            return (Criteria) this;
        }

        public Criteria andOperationContentIsNotNull() {
            addCriterion("operation_content is not null");
            return (Criteria) this;
        }

        public Criteria andOperationContentEqualTo(String value) {
            addCriterion("operation_content =", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotEqualTo(String value) {
            addCriterion("operation_content <>", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentGreaterThan(String value) {
            addCriterion("operation_content >", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentGreaterThanOrEqualTo(String value) {
            addCriterion("operation_content >=", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLessThan(String value) {
            addCriterion("operation_content <", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLessThanOrEqualTo(String value) {
            addCriterion("operation_content <=", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentLike(String value) {
            addCriterion("operation_content like", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotLike(String value) {
            addCriterion("operation_content not like", value, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentIn(List<String> values) {
            addCriterion("operation_content in", values, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotIn(List<String> values) {
            addCriterion("operation_content not in", values, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentBetween(String value1, String value2) {
            addCriterion("operation_content between", value1, value2, "operationContent");
            return (Criteria) this;
        }

        public Criteria andOperationContentNotBetween(String value1, String value2) {
            addCriterion("operation_content not between", value1, value2, "operationContent");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNull() {
            addCriterion("memberid is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("memberid is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("memberid =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("memberid <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("memberid >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("memberid >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("memberid <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("memberid <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("memberid in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("memberid not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("memberid between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("memberid not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLogTimeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLogTimeEqualTo(Date value) {
            addCriterion("log_time =", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotEqualTo(Date value) {
            addCriterion("log_time <>", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThan(Date value) {
            addCriterion("log_time >", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("log_time >=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThan(Date value) {
            addCriterion("log_time <", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeLessThanOrEqualTo(Date value) {
            addCriterion("log_time <=", value, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeIn(List<Date> values) {
            addCriterion("log_time in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotIn(List<Date> values) {
            addCriterion("log_time not in", values, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeBetween(Date value1, Date value2) {
            addCriterion("log_time between", value1, value2, "logTime");
            return (Criteria) this;
        }

        public Criteria andLogTimeNotBetween(Date value1, Date value2) {
            addCriterion("log_time not between", value1, value2, "logTime");
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