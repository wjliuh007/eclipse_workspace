package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtSendOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtSendOrdersExample() {
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

        public Criteria andSendOrderIdIsNull() {
            addCriterion("send_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdIsNotNull() {
            addCriterion("send_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdEqualTo(Integer value) {
            addCriterion("send_order_id =", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotEqualTo(Integer value) {
            addCriterion("send_order_id <>", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdGreaterThan(Integer value) {
            addCriterion("send_order_id >", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_order_id >=", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdLessThan(Integer value) {
            addCriterion("send_order_id <", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("send_order_id <=", value, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdIn(List<Integer> values) {
            addCriterion("send_order_id in", values, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotIn(List<Integer> values) {
            addCriterion("send_order_id not in", values, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("send_order_id between", value1, value2, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andSendOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("send_order_id not between", value1, value2, "sendOrderId");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNull() {
            addCriterion("is_hidden is null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIsNotNull() {
            addCriterion("is_hidden is not null");
            return (Criteria) this;
        }

        public Criteria andIsHiddenEqualTo(Boolean value) {
            addCriterion("is_hidden =", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotEqualTo(Boolean value) {
            addCriterion("is_hidden <>", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThan(Boolean value) {
            addCriterion("is_hidden >", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hidden >=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThan(Boolean value) {
            addCriterion("is_hidden <", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hidden <=", value, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenIn(List<Boolean> values) {
            addCriterion("is_hidden in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotIn(List<Boolean> values) {
            addCriterion("is_hidden not in", values, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hidden between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andIsHiddenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hidden not between", value1, value2, "isHidden");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andSendOrderSnIsNull() {
            addCriterion("send_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnIsNotNull() {
            addCriterion("send_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnEqualTo(Long value) {
            addCriterion("send_order_sn =", value, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnNotEqualTo(Long value) {
            addCriterion("send_order_sn <>", value, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnGreaterThan(Long value) {
            addCriterion("send_order_sn >", value, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("send_order_sn >=", value, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnLessThan(Long value) {
            addCriterion("send_order_sn <", value, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("send_order_sn <=", value, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnIn(List<Long> values) {
            addCriterion("send_order_sn in", values, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnNotIn(List<Long> values) {
            addCriterion("send_order_sn not in", values, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnBetween(Long value1, Long value2) {
            addCriterion("send_order_sn between", value1, value2, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andSendOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("send_order_sn not between", value1, value2, "sendOrderSn");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
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

        public Criteria andEditStatusIsNull() {
            addCriterion("edit_status is null");
            return (Criteria) this;
        }

        public Criteria andEditStatusIsNotNull() {
            addCriterion("edit_status is not null");
            return (Criteria) this;
        }

        public Criteria andEditStatusEqualTo(Boolean value) {
            addCriterion("edit_status =", value, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusNotEqualTo(Boolean value) {
            addCriterion("edit_status <>", value, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusGreaterThan(Boolean value) {
            addCriterion("edit_status >", value, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("edit_status >=", value, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusLessThan(Boolean value) {
            addCriterion("edit_status <", value, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("edit_status <=", value, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusIn(List<Boolean> values) {
            addCriterion("edit_status in", values, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusNotIn(List<Boolean> values) {
            addCriterion("edit_status not in", values, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("edit_status between", value1, value2, "editStatus");
            return (Criteria) this;
        }

        public Criteria andEditStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("edit_status not between", value1, value2, "editStatus");
            return (Criteria) this;
        }

        public Criteria andAdvisIsNull() {
            addCriterion("advis is null");
            return (Criteria) this;
        }

        public Criteria andAdvisIsNotNull() {
            addCriterion("advis is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisEqualTo(String value) {
            addCriterion("advis =", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisNotEqualTo(String value) {
            addCriterion("advis <>", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisGreaterThan(String value) {
            addCriterion("advis >", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisGreaterThanOrEqualTo(String value) {
            addCriterion("advis >=", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisLessThan(String value) {
            addCriterion("advis <", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisLessThanOrEqualTo(String value) {
            addCriterion("advis <=", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisLike(String value) {
            addCriterion("advis like", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisNotLike(String value) {
            addCriterion("advis not like", value, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisIn(List<String> values) {
            addCriterion("advis in", values, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisNotIn(List<String> values) {
            addCriterion("advis not in", values, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisBetween(String value1, String value2) {
            addCriterion("advis between", value1, value2, "advis");
            return (Criteria) this;
        }

        public Criteria andAdvisNotBetween(String value1, String value2) {
            addCriterion("advis not between", value1, value2, "advis");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNull() {
            addCriterion("express_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressIdIsNotNull() {
            addCriterion("express_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressIdEqualTo(Integer value) {
            addCriterion("express_id =", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotEqualTo(Integer value) {
            addCriterion("express_id <>", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThan(Integer value) {
            addCriterion("express_id >", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_id >=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThan(Integer value) {
            addCriterion("express_id <", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdLessThanOrEqualTo(Integer value) {
            addCriterion("express_id <=", value, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdIn(List<Integer> values) {
            addCriterion("express_id in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotIn(List<Integer> values) {
            addCriterion("express_id not in", values, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdBetween(Integer value1, Integer value2) {
            addCriterion("express_id between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("express_id not between", value1, value2, "expressId");
            return (Criteria) this;
        }

        public Criteria andExpressSnIsNull() {
            addCriterion("express_sn is null");
            return (Criteria) this;
        }

        public Criteria andExpressSnIsNotNull() {
            addCriterion("express_sn is not null");
            return (Criteria) this;
        }

        public Criteria andExpressSnEqualTo(String value) {
            addCriterion("express_sn =", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotEqualTo(String value) {
            addCriterion("express_sn <>", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnGreaterThan(String value) {
            addCriterion("express_sn >", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnGreaterThanOrEqualTo(String value) {
            addCriterion("express_sn >=", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLessThan(String value) {
            addCriterion("express_sn <", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLessThanOrEqualTo(String value) {
            addCriterion("express_sn <=", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnLike(String value) {
            addCriterion("express_sn like", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotLike(String value) {
            addCriterion("express_sn not like", value, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnIn(List<String> values) {
            addCriterion("express_sn in", values, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotIn(List<String> values) {
            addCriterion("express_sn not in", values, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnBetween(String value1, String value2) {
            addCriterion("express_sn between", value1, value2, "expressSn");
            return (Criteria) this;
        }

        public Criteria andExpressSnNotBetween(String value1, String value2) {
            addCriterion("express_sn not between", value1, value2, "expressSn");
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

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andSubStatusIsNull() {
            addCriterion("sub_status is null");
            return (Criteria) this;
        }

        public Criteria andSubStatusIsNotNull() {
            addCriterion("sub_status is not null");
            return (Criteria) this;
        }

        public Criteria andSubStatusEqualTo(Integer value) {
            addCriterion("sub_status =", value, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusNotEqualTo(Integer value) {
            addCriterion("sub_status <>", value, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusGreaterThan(Integer value) {
            addCriterion("sub_status >", value, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_status >=", value, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusLessThan(Integer value) {
            addCriterion("sub_status <", value, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sub_status <=", value, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusIn(List<Integer> values) {
            addCriterion("sub_status in", values, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusNotIn(List<Integer> values) {
            addCriterion("sub_status not in", values, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusBetween(Integer value1, Integer value2) {
            addCriterion("sub_status between", value1, value2, "subStatus");
            return (Criteria) this;
        }

        public Criteria andSubStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_status not between", value1, value2, "subStatus");
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

        public Criteria andOfflinePaymentNameIsNull() {
            addCriterion("offline_payment_name is null");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameIsNotNull() {
            addCriterion("offline_payment_name is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameEqualTo(String value) {
            addCriterion("offline_payment_name =", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameNotEqualTo(String value) {
            addCriterion("offline_payment_name <>", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameGreaterThan(String value) {
            addCriterion("offline_payment_name >", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameGreaterThanOrEqualTo(String value) {
            addCriterion("offline_payment_name >=", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameLessThan(String value) {
            addCriterion("offline_payment_name <", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameLessThanOrEqualTo(String value) {
            addCriterion("offline_payment_name <=", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameLike(String value) {
            addCriterion("offline_payment_name like", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameNotLike(String value) {
            addCriterion("offline_payment_name not like", value, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameIn(List<String> values) {
            addCriterion("offline_payment_name in", values, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameNotIn(List<String> values) {
            addCriterion("offline_payment_name not in", values, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameBetween(String value1, String value2) {
            addCriterion("offline_payment_name between", value1, value2, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentNameNotBetween(String value1, String value2) {
            addCriterion("offline_payment_name not between", value1, value2, "offlinePaymentName");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andNeedPayIsNull() {
            addCriterion("need_pay is null");
            return (Criteria) this;
        }

        public Criteria andNeedPayIsNotNull() {
            addCriterion("need_pay is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPayEqualTo(BigDecimal value) {
            addCriterion("need_pay =", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayNotEqualTo(BigDecimal value) {
            addCriterion("need_pay <>", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayGreaterThan(BigDecimal value) {
            addCriterion("need_pay >", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("need_pay >=", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayLessThan(BigDecimal value) {
            addCriterion("need_pay <", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("need_pay <=", value, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayIn(List<BigDecimal> values) {
            addCriterion("need_pay in", values, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayNotIn(List<BigDecimal> values) {
            addCriterion("need_pay not in", values, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("need_pay between", value1, value2, "needPay");
            return (Criteria) this;
        }

        public Criteria andNeedPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("need_pay not between", value1, value2, "needPay");
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

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNull() {
            addCriterion("consignee_mobile is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIsNotNull() {
            addCriterion("consignee_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileEqualTo(String value) {
            addCriterion("consignee_mobile =", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotEqualTo(String value) {
            addCriterion("consignee_mobile <>", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThan(String value) {
            addCriterion("consignee_mobile >", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_mobile >=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThan(String value) {
            addCriterion("consignee_mobile <", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLessThanOrEqualTo(String value) {
            addCriterion("consignee_mobile <=", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileLike(String value) {
            addCriterion("consignee_mobile like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotLike(String value) {
            addCriterion("consignee_mobile not like", value, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileIn(List<String> values) {
            addCriterion("consignee_mobile in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotIn(List<String> values) {
            addCriterion("consignee_mobile not in", values, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileBetween(String value1, String value2) {
            addCriterion("consignee_mobile between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andConsigneeMobileNotBetween(String value1, String value2) {
            addCriterion("consignee_mobile not between", value1, value2, "consigneeMobile");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNull() {
            addCriterion("order_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIsNotNull() {
            addCriterion("order_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneEqualTo(String value) {
            addCriterion("order_phone =", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotEqualTo(String value) {
            addCriterion("order_phone <>", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThan(String value) {
            addCriterion("order_phone >", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_phone >=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThan(String value) {
            addCriterion("order_phone <", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLessThanOrEqualTo(String value) {
            addCriterion("order_phone <=", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneLike(String value) {
            addCriterion("order_phone like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotLike(String value) {
            addCriterion("order_phone not like", value, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneIn(List<String> values) {
            addCriterion("order_phone in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotIn(List<String> values) {
            addCriterion("order_phone not in", values, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneBetween(String value1, String value2) {
            addCriterion("order_phone between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andOrderPhoneNotBetween(String value1, String value2) {
            addCriterion("order_phone not between", value1, value2, "orderPhone");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIsNull() {
            addCriterion("shipping_area_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIsNotNull() {
            addCriterion("shipping_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdEqualTo(Integer value) {
            addCriterion("shipping_area_id =", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotEqualTo(Integer value) {
            addCriterion("shipping_area_id <>", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThan(Integer value) {
            addCriterion("shipping_area_id >", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_area_id >=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThan(Integer value) {
            addCriterion("shipping_area_id <", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_area_id <=", value, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdIn(List<Integer> values) {
            addCriterion("shipping_area_id in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotIn(List<Integer> values) {
            addCriterion("shipping_area_id not in", values, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_area_id between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_area_id not between", value1, value2, "shippingAreaId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdIsNull() {
            addCriterion("shipping_city_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdIsNotNull() {
            addCriterion("shipping_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdEqualTo(Integer value) {
            addCriterion("shipping_city_id =", value, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdNotEqualTo(Integer value) {
            addCriterion("shipping_city_id <>", value, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdGreaterThan(Integer value) {
            addCriterion("shipping_city_id >", value, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_city_id >=", value, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdLessThan(Integer value) {
            addCriterion("shipping_city_id <", value, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_city_id <=", value, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdIn(List<Integer> values) {
            addCriterion("shipping_city_id in", values, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdNotIn(List<Integer> values) {
            addCriterion("shipping_city_id not in", values, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_city_id between", value1, value2, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_city_id not between", value1, value2, "shippingCityId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdIsNull() {
            addCriterion("shipping_district_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdIsNotNull() {
            addCriterion("shipping_district_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdEqualTo(Integer value) {
            addCriterion("shipping_district_id =", value, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdNotEqualTo(Integer value) {
            addCriterion("shipping_district_id <>", value, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdGreaterThan(Integer value) {
            addCriterion("shipping_district_id >", value, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_district_id >=", value, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdLessThan(Integer value) {
            addCriterion("shipping_district_id <", value, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_district_id <=", value, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdIn(List<Integer> values) {
            addCriterion("shipping_district_id in", values, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdNotIn(List<Integer> values) {
            addCriterion("shipping_district_id not in", values, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_district_id between", value1, value2, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_district_id not between", value1, value2, "shippingDistrictId");
            return (Criteria) this;
        }

        public Criteria andShippingPriceIsNull() {
            addCriterion("shipping_price is null");
            return (Criteria) this;
        }

        public Criteria andShippingPriceIsNotNull() {
            addCriterion("shipping_price is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPriceEqualTo(BigDecimal value) {
            addCriterion("shipping_price =", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceNotEqualTo(BigDecimal value) {
            addCriterion("shipping_price <>", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceGreaterThan(BigDecimal value) {
            addCriterion("shipping_price >", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_price >=", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceLessThan(BigDecimal value) {
            addCriterion("shipping_price <", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shipping_price <=", value, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceIn(List<BigDecimal> values) {
            addCriterion("shipping_price in", values, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceNotIn(List<BigDecimal> values) {
            addCriterion("shipping_price not in", values, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_price between", value1, value2, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andShippingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shipping_price not between", value1, value2, "shippingPrice");
            return (Criteria) this;
        }

        public Criteria andRefundFareIsNull() {
            addCriterion("refund_fare is null");
            return (Criteria) this;
        }

        public Criteria andRefundFareIsNotNull() {
            addCriterion("refund_fare is not null");
            return (Criteria) this;
        }

        public Criteria andRefundFareEqualTo(Integer value) {
            addCriterion("refund_fare =", value, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareNotEqualTo(Integer value) {
            addCriterion("refund_fare <>", value, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareGreaterThan(Integer value) {
            addCriterion("refund_fare >", value, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_fare >=", value, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareLessThan(Integer value) {
            addCriterion("refund_fare <", value, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareLessThanOrEqualTo(Integer value) {
            addCriterion("refund_fare <=", value, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareIn(List<Integer> values) {
            addCriterion("refund_fare in", values, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareNotIn(List<Integer> values) {
            addCriterion("refund_fare not in", values, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareBetween(Integer value1, Integer value2) {
            addCriterion("refund_fare between", value1, value2, "refundFare");
            return (Criteria) this;
        }

        public Criteria andRefundFareNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_fare not between", value1, value2, "refundFare");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(String value) {
            addCriterion("shipping_time =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(String value) {
            addCriterion("shipping_time <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(String value) {
            addCriterion("shipping_time >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_time >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(String value) {
            addCriterion("shipping_time <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(String value) {
            addCriterion("shipping_time <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLike(String value) {
            addCriterion("shipping_time like", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotLike(String value) {
            addCriterion("shipping_time not like", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<String> values) {
            addCriterion("shipping_time in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<String> values) {
            addCriterion("shipping_time not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(String value1, String value2) {
            addCriterion("shipping_time between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(String value1, String value2) {
            addCriterion("shipping_time not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNull() {
            addCriterion("order_memo is null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIsNotNull() {
            addCriterion("order_memo is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMemoEqualTo(String value) {
            addCriterion("order_memo =", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotEqualTo(String value) {
            addCriterion("order_memo <>", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThan(String value) {
            addCriterion("order_memo >", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoGreaterThanOrEqualTo(String value) {
            addCriterion("order_memo >=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThan(String value) {
            addCriterion("order_memo <", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLessThanOrEqualTo(String value) {
            addCriterion("order_memo <=", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoLike(String value) {
            addCriterion("order_memo like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotLike(String value) {
            addCriterion("order_memo not like", value, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoIn(List<String> values) {
            addCriterion("order_memo in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotIn(List<String> values) {
            addCriterion("order_memo not in", values, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoBetween(String value1, String value2) {
            addCriterion("order_memo between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andOrderMemoNotBetween(String value1, String value2) {
            addCriterion("order_memo not between", value1, value2, "orderMemo");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNull() {
            addCriterion("cancel_reason is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIsNotNull() {
            addCriterion("cancel_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonEqualTo(String value) {
            addCriterion("cancel_reason =", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotEqualTo(String value) {
            addCriterion("cancel_reason <>", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThan(String value) {
            addCriterion("cancel_reason >", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonGreaterThanOrEqualTo(String value) {
            addCriterion("cancel_reason >=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThan(String value) {
            addCriterion("cancel_reason <", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLessThanOrEqualTo(String value) {
            addCriterion("cancel_reason <=", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonLike(String value) {
            addCriterion("cancel_reason like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotLike(String value) {
            addCriterion("cancel_reason not like", value, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIn(List<String> values) {
            addCriterion("cancel_reason in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotIn(List<String> values) {
            addCriterion("cancel_reason not in", values, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonBetween(String value1, String value2) {
            addCriterion("cancel_reason between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andCancelReasonNotBetween(String value1, String value2) {
            addCriterion("cancel_reason not between", value1, value2, "cancelReason");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeIsNull() {
            addCriterion("sign_order_time is null");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeIsNotNull() {
            addCriterion("sign_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeEqualTo(Integer value) {
            addCriterion("sign_order_time =", value, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeNotEqualTo(Integer value) {
            addCriterion("sign_order_time <>", value, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeGreaterThan(Integer value) {
            addCriterion("sign_order_time >", value, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sign_order_time >=", value, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeLessThan(Integer value) {
            addCriterion("sign_order_time <", value, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeLessThanOrEqualTo(Integer value) {
            addCriterion("sign_order_time <=", value, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeIn(List<Integer> values) {
            addCriterion("sign_order_time in", values, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeNotIn(List<Integer> values) {
            addCriterion("sign_order_time not in", values, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeBetween(Integer value1, Integer value2) {
            addCriterion("sign_order_time between", value1, value2, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andSignOrderTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("sign_order_time not between", value1, value2, "signOrderTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeIsNull() {
            addCriterion("last_op_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeIsNotNull() {
            addCriterion("last_op_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeEqualTo(Integer value) {
            addCriterion("last_op_time =", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeNotEqualTo(Integer value) {
            addCriterion("last_op_time <>", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeGreaterThan(Integer value) {
            addCriterion("last_op_time >", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_op_time >=", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeLessThan(Integer value) {
            addCriterion("last_op_time <", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_op_time <=", value, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeIn(List<Integer> values) {
            addCriterion("last_op_time in", values, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeNotIn(List<Integer> values) {
            addCriterion("last_op_time not in", values, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeBetween(Integer value1, Integer value2) {
            addCriterion("last_op_time between", value1, value2, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andLastOpTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_op_time not between", value1, value2, "lastOpTime");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNull() {
            addCriterion("is_send is null");
            return (Criteria) this;
        }

        public Criteria andIsSendIsNotNull() {
            addCriterion("is_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendEqualTo(Integer value) {
            addCriterion("is_send =", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotEqualTo(Integer value) {
            addCriterion("is_send <>", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThan(Integer value) {
            addCriterion("is_send >", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_send >=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThan(Integer value) {
            addCriterion("is_send <", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendLessThanOrEqualTo(Integer value) {
            addCriterion("is_send <=", value, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendIn(List<Integer> values) {
            addCriterion("is_send in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotIn(List<Integer> values) {
            addCriterion("is_send not in", values, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendBetween(Integer value1, Integer value2) {
            addCriterion("is_send between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andIsSendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_send not between", value1, value2, "isSend");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusIsNull() {
            addCriterion("rejection_status is null");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusIsNotNull() {
            addCriterion("rejection_status is not null");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusEqualTo(Boolean value) {
            addCriterion("rejection_status =", value, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusNotEqualTo(Boolean value) {
            addCriterion("rejection_status <>", value, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusGreaterThan(Boolean value) {
            addCriterion("rejection_status >", value, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("rejection_status >=", value, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusLessThan(Boolean value) {
            addCriterion("rejection_status <", value, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("rejection_status <=", value, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusIn(List<Boolean> values) {
            addCriterion("rejection_status in", values, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusNotIn(List<Boolean> values) {
            addCriterion("rejection_status not in", values, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("rejection_status between", value1, value2, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andRejectionStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("rejection_status not between", value1, value2, "rejectionStatus");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdIsNull() {
            addCriterion("cancel_reason_id is null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdIsNotNull() {
            addCriterion("cancel_reason_id is not null");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdEqualTo(Integer value) {
            addCriterion("cancel_reason_id =", value, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdNotEqualTo(Integer value) {
            addCriterion("cancel_reason_id <>", value, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdGreaterThan(Integer value) {
            addCriterion("cancel_reason_id >", value, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_reason_id >=", value, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdLessThan(Integer value) {
            addCriterion("cancel_reason_id <", value, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_reason_id <=", value, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdIn(List<Integer> values) {
            addCriterion("cancel_reason_id in", values, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdNotIn(List<Integer> values) {
            addCriterion("cancel_reason_id not in", values, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdBetween(Integer value1, Integer value2) {
            addCriterion("cancel_reason_id between", value1, value2, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelReasonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_reason_id not between", value1, value2, "cancelReasonId");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIsNull() {
            addCriterion("cancel_type is null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIsNotNull() {
            addCriterion("cancel_type is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTypeEqualTo(Integer value) {
            addCriterion("cancel_type =", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotEqualTo(Integer value) {
            addCriterion("cancel_type <>", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeGreaterThan(Integer value) {
            addCriterion("cancel_type >", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_type >=", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLessThan(Integer value) {
            addCriterion("cancel_type <", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_type <=", value, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeIn(List<Integer> values) {
            addCriterion("cancel_type in", values, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotIn(List<Integer> values) {
            addCriterion("cancel_type not in", values, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_type between", value1, value2, "cancelType");
            return (Criteria) this;
        }

        public Criteria andCancelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_type not between", value1, value2, "cancelType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("invoice_type is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("invoice_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("invoice_type =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("invoice_type <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("invoice_type >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("invoice_type <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("invoice_type like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("invoice_type not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("invoice_type in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("invoice_type not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("invoice_type between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("invoice_type not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("invoice_number is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("invoice_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("invoice_number =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("invoice_number <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("invoice_number >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_number >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("invoice_number <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("invoice_number <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("invoice_number like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("invoice_number not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("invoice_number in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("invoice_number not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("invoice_number between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("invoice_number not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("invoice_title is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("invoice_title is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("invoice_title =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("invoice_title <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("invoice_title >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_title >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("invoice_title <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("invoice_title <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("invoice_title like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("invoice_title not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("invoice_title in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("invoice_title not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("invoice_title between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("invoice_title not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIsNull() {
            addCriterion("invoice_item is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIsNotNull() {
            addCriterion("invoice_item is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemEqualTo(String value) {
            addCriterion("invoice_item =", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotEqualTo(String value) {
            addCriterion("invoice_item <>", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemGreaterThan(String value) {
            addCriterion("invoice_item >", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_item >=", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemLessThan(String value) {
            addCriterion("invoice_item <", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemLessThanOrEqualTo(String value) {
            addCriterion("invoice_item <=", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemLike(String value) {
            addCriterion("invoice_item like", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotLike(String value) {
            addCriterion("invoice_item not like", value, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemIn(List<String> values) {
            addCriterion("invoice_item in", values, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotIn(List<String> values) {
            addCriterion("invoice_item not in", values, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemBetween(String value1, String value2) {
            addCriterion("invoice_item between", value1, value2, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andInvoiceItemNotBetween(String value1, String value2) {
            addCriterion("invoice_item not between", value1, value2, "invoiceItem");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceIsNull() {
            addCriterion("print_invoice is null");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceIsNotNull() {
            addCriterion("print_invoice is not null");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceEqualTo(Boolean value) {
            addCriterion("print_invoice =", value, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceNotEqualTo(Boolean value) {
            addCriterion("print_invoice <>", value, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceGreaterThan(Boolean value) {
            addCriterion("print_invoice >", value, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("print_invoice >=", value, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceLessThan(Boolean value) {
            addCriterion("print_invoice <", value, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("print_invoice <=", value, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceIn(List<Boolean> values) {
            addCriterion("print_invoice in", values, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceNotIn(List<Boolean> values) {
            addCriterion("print_invoice not in", values, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("print_invoice between", value1, value2, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andPrintInvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("print_invoice not between", value1, value2, "printInvoice");
            return (Criteria) this;
        }

        public Criteria andOrderFlowIsNull() {
            addCriterion("order_flow is null");
            return (Criteria) this;
        }

        public Criteria andOrderFlowIsNotNull() {
            addCriterion("order_flow is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFlowEqualTo(Boolean value) {
            addCriterion("order_flow =", value, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNotEqualTo(Boolean value) {
            addCriterion("order_flow <>", value, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowGreaterThan(Boolean value) {
            addCriterion("order_flow >", value, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_flow >=", value, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowLessThan(Boolean value) {
            addCriterion("order_flow <", value, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowLessThanOrEqualTo(Boolean value) {
            addCriterion("order_flow <=", value, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowIn(List<Boolean> values) {
            addCriterion("order_flow in", values, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNotIn(List<Boolean> values) {
            addCriterion("order_flow not in", values, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowBetween(Boolean value1, Boolean value2) {
            addCriterion("order_flow between", value1, value2, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOrderFlowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_flow not between", value1, value2, "orderFlow");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdIsNull() {
            addCriterion("oversea_express_id is null");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdIsNotNull() {
            addCriterion("oversea_express_id is not null");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdEqualTo(Boolean value) {
            addCriterion("oversea_express_id =", value, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdNotEqualTo(Boolean value) {
            addCriterion("oversea_express_id <>", value, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdGreaterThan(Boolean value) {
            addCriterion("oversea_express_id >", value, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("oversea_express_id >=", value, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdLessThan(Boolean value) {
            addCriterion("oversea_express_id <", value, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdLessThanOrEqualTo(Boolean value) {
            addCriterion("oversea_express_id <=", value, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdIn(List<Boolean> values) {
            addCriterion("oversea_express_id in", values, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdNotIn(List<Boolean> values) {
            addCriterion("oversea_express_id not in", values, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdBetween(Boolean value1, Boolean value2) {
            addCriterion("oversea_express_id between", value1, value2, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andOverseaExpressIdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("oversea_express_id not between", value1, value2, "overseaExpressId");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberIsNull() {
            addCriterion("airway_billnumber is null");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberIsNotNull() {
            addCriterion("airway_billnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberEqualTo(String value) {
            addCriterion("airway_billnumber =", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberNotEqualTo(String value) {
            addCriterion("airway_billnumber <>", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberGreaterThan(String value) {
            addCriterion("airway_billnumber >", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberGreaterThanOrEqualTo(String value) {
            addCriterion("airway_billnumber >=", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberLessThan(String value) {
            addCriterion("airway_billnumber <", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberLessThanOrEqualTo(String value) {
            addCriterion("airway_billnumber <=", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberLike(String value) {
            addCriterion("airway_billnumber like", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberNotLike(String value) {
            addCriterion("airway_billnumber not like", value, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberIn(List<String> values) {
            addCriterion("airway_billnumber in", values, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberNotIn(List<String> values) {
            addCriterion("airway_billnumber not in", values, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberBetween(String value1, String value2) {
            addCriterion("airway_billnumber between", value1, value2, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andAirwayBillnumberNotBetween(String value1, String value2) {
            addCriterion("airway_billnumber not between", value1, value2, "airwayBillnumber");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusIsNull() {
            addCriterion("last_sub_status is null");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusIsNotNull() {
            addCriterion("last_sub_status is not null");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusEqualTo(Boolean value) {
            addCriterion("last_sub_status =", value, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusNotEqualTo(Boolean value) {
            addCriterion("last_sub_status <>", value, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusGreaterThan(Boolean value) {
            addCriterion("last_sub_status >", value, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("last_sub_status >=", value, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusLessThan(Boolean value) {
            addCriterion("last_sub_status <", value, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("last_sub_status <=", value, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusIn(List<Boolean> values) {
            addCriterion("last_sub_status in", values, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusNotIn(List<Boolean> values) {
            addCriterion("last_sub_status not in", values, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("last_sub_status between", value1, value2, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andLastSubStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("last_sub_status not between", value1, value2, "lastSubStatus");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdIsNull() {
            addCriterion("sendhouse_id is null");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdIsNotNull() {
            addCriterion("sendhouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdEqualTo(Integer value) {
            addCriterion("sendhouse_id =", value, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdNotEqualTo(Integer value) {
            addCriterion("sendhouse_id <>", value, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdGreaterThan(Integer value) {
            addCriterion("sendhouse_id >", value, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendhouse_id >=", value, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdLessThan(Integer value) {
            addCriterion("sendhouse_id <", value, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("sendhouse_id <=", value, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdIn(List<Integer> values) {
            addCriterion("sendhouse_id in", values, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdNotIn(List<Integer> values) {
            addCriterion("sendhouse_id not in", values, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdBetween(Integer value1, Integer value2) {
            addCriterion("sendhouse_id between", value1, value2, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sendhouse_id not between", value1, value2, "sendhouseId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdIsNull() {
            addCriterion("sendhouse_person_id is null");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdIsNotNull() {
            addCriterion("sendhouse_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdEqualTo(Integer value) {
            addCriterion("sendhouse_person_id =", value, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdNotEqualTo(Integer value) {
            addCriterion("sendhouse_person_id <>", value, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdGreaterThan(Integer value) {
            addCriterion("sendhouse_person_id >", value, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendhouse_person_id >=", value, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdLessThan(Integer value) {
            addCriterion("sendhouse_person_id <", value, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("sendhouse_person_id <=", value, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdIn(List<Integer> values) {
            addCriterion("sendhouse_person_id in", values, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdNotIn(List<Integer> values) {
            addCriterion("sendhouse_person_id not in", values, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdBetween(Integer value1, Integer value2) {
            addCriterion("sendhouse_person_id between", value1, value2, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andSendhousePersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sendhouse_person_id not between", value1, value2, "sendhousePersonId");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnIsNull() {
            addCriterion("express_generation_sn is null");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnIsNotNull() {
            addCriterion("express_generation_sn is not null");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnEqualTo(String value) {
            addCriterion("express_generation_sn =", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnNotEqualTo(String value) {
            addCriterion("express_generation_sn <>", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnGreaterThan(String value) {
            addCriterion("express_generation_sn >", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnGreaterThanOrEqualTo(String value) {
            addCriterion("express_generation_sn >=", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnLessThan(String value) {
            addCriterion("express_generation_sn <", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnLessThanOrEqualTo(String value) {
            addCriterion("express_generation_sn <=", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnLike(String value) {
            addCriterion("express_generation_sn like", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnNotLike(String value) {
            addCriterion("express_generation_sn not like", value, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnIn(List<String> values) {
            addCriterion("express_generation_sn in", values, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnNotIn(List<String> values) {
            addCriterion("express_generation_sn not in", values, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnBetween(String value1, String value2) {
            addCriterion("express_generation_sn between", value1, value2, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andExpressGenerationSnNotBetween(String value1, String value2) {
            addCriterion("express_generation_sn not between", value1, value2, "expressGenerationSn");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeIsNull() {
            addCriterion("offline_payment_type is null");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeIsNotNull() {
            addCriterion("offline_payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeEqualTo(Integer value) {
            addCriterion("offline_payment_type =", value, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeNotEqualTo(Integer value) {
            addCriterion("offline_payment_type <>", value, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeGreaterThan(Integer value) {
            addCriterion("offline_payment_type >", value, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("offline_payment_type >=", value, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeLessThan(Integer value) {
            addCriterion("offline_payment_type <", value, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("offline_payment_type <=", value, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeIn(List<Integer> values) {
            addCriterion("offline_payment_type in", values, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeNotIn(List<Integer> values) {
            addCriterion("offline_payment_type not in", values, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("offline_payment_type between", value1, value2, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andOfflinePaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("offline_payment_type not between", value1, value2, "offlinePaymentType");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andGiveScoreIsNull() {
            addCriterion("give_score is null");
            return (Criteria) this;
        }

        public Criteria andGiveScoreIsNotNull() {
            addCriterion("give_score is not null");
            return (Criteria) this;
        }

        public Criteria andGiveScoreEqualTo(Integer value) {
            addCriterion("give_score =", value, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreNotEqualTo(Integer value) {
            addCriterion("give_score <>", value, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreGreaterThan(Integer value) {
            addCriterion("give_score >", value, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_score >=", value, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreLessThan(Integer value) {
            addCriterion("give_score <", value, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreLessThanOrEqualTo(Integer value) {
            addCriterion("give_score <=", value, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreIn(List<Integer> values) {
            addCriterion("give_score in", values, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreNotIn(List<Integer> values) {
            addCriterion("give_score not in", values, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreBetween(Integer value1, Integer value2) {
            addCriterion("give_score between", value1, value2, "giveScore");
            return (Criteria) this;
        }

        public Criteria andGiveScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("give_score not between", value1, value2, "giveScore");
            return (Criteria) this;
        }

        public Criteria andPickingTypeIsNull() {
            addCriterion("picking_type is null");
            return (Criteria) this;
        }

        public Criteria andPickingTypeIsNotNull() {
            addCriterion("picking_type is not null");
            return (Criteria) this;
        }

        public Criteria andPickingTypeEqualTo(Integer value) {
            addCriterion("picking_type =", value, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeNotEqualTo(Integer value) {
            addCriterion("picking_type <>", value, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeGreaterThan(Integer value) {
            addCriterion("picking_type >", value, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("picking_type >=", value, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeLessThan(Integer value) {
            addCriterion("picking_type <", value, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("picking_type <=", value, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeIn(List<Integer> values) {
            addCriterion("picking_type in", values, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeNotIn(List<Integer> values) {
            addCriterion("picking_type not in", values, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeBetween(Integer value1, Integer value2) {
            addCriterion("picking_type between", value1, value2, "pickingType");
            return (Criteria) this;
        }

        public Criteria andPickingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("picking_type not between", value1, value2, "pickingType");
            return (Criteria) this;
        }

        public Criteria andIsTheseaIsNull() {
            addCriterion("is_thesea is null");
            return (Criteria) this;
        }

        public Criteria andIsTheseaIsNotNull() {
            addCriterion("is_thesea is not null");
            return (Criteria) this;
        }

        public Criteria andIsTheseaEqualTo(Boolean value) {
            addCriterion("is_thesea =", value, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaNotEqualTo(Boolean value) {
            addCriterion("is_thesea <>", value, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaGreaterThan(Boolean value) {
            addCriterion("is_thesea >", value, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_thesea >=", value, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaLessThan(Boolean value) {
            addCriterion("is_thesea <", value, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaLessThanOrEqualTo(Boolean value) {
            addCriterion("is_thesea <=", value, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaIn(List<Boolean> values) {
            addCriterion("is_thesea in", values, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaNotIn(List<Boolean> values) {
            addCriterion("is_thesea not in", values, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaBetween(Boolean value1, Boolean value2) {
            addCriterion("is_thesea between", value1, value2, "isThesea");
            return (Criteria) this;
        }

        public Criteria andIsTheseaNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_thesea not between", value1, value2, "isThesea");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Integer value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Integer value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Integer value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Integer value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Integer> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Integer> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
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