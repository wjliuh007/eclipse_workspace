package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtOrdersExample() {
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

        public Criteria andBelongToIsNull() {
            addCriterion("belong_to is null");
            return (Criteria) this;
        }

        public Criteria andBelongToIsNotNull() {
            addCriterion("belong_to is not null");
            return (Criteria) this;
        }

        public Criteria andBelongToEqualTo(Integer value) {
            addCriterion("belong_to =", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotEqualTo(Integer value) {
            addCriterion("belong_to <>", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToGreaterThan(Integer value) {
            addCriterion("belong_to >", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToGreaterThanOrEqualTo(Integer value) {
            addCriterion("belong_to >=", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLessThan(Integer value) {
            addCriterion("belong_to <", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLessThanOrEqualTo(Integer value) {
            addCriterion("belong_to <=", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToIn(List<Integer> values) {
            addCriterion("belong_to in", values, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotIn(List<Integer> values) {
            addCriterion("belong_to not in", values, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToBetween(Integer value1, Integer value2) {
            addCriterion("belong_to between", value1, value2, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotBetween(Integer value1, Integer value2) {
            addCriterion("belong_to not between", value1, value2, "belongTo");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdIsNull() {
            addCriterion("first_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdIsNotNull() {
            addCriterion("first_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdEqualTo(Integer value) {
            addCriterion("first_warehouse_id =", value, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdNotEqualTo(Integer value) {
            addCriterion("first_warehouse_id <>", value, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdGreaterThan(Integer value) {
            addCriterion("first_warehouse_id >", value, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_warehouse_id >=", value, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdLessThan(Integer value) {
            addCriterion("first_warehouse_id <", value, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_warehouse_id <=", value, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdIn(List<Integer> values) {
            addCriterion("first_warehouse_id in", values, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdNotIn(List<Integer> values) {
            addCriterion("first_warehouse_id not in", values, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("first_warehouse_id between", value1, value2, "firstWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFirstWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_warehouse_id not between", value1, value2, "firstWarehouseId");
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

        public Criteria andOriginalWarehouseIdIsNull() {
            addCriterion("original_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdIsNotNull() {
            addCriterion("original_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdEqualTo(Integer value) {
            addCriterion("original_warehouse_id =", value, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdNotEqualTo(Integer value) {
            addCriterion("original_warehouse_id <>", value, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdGreaterThan(Integer value) {
            addCriterion("original_warehouse_id >", value, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("original_warehouse_id >=", value, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdLessThan(Integer value) {
            addCriterion("original_warehouse_id <", value, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("original_warehouse_id <=", value, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdIn(List<Integer> values) {
            addCriterion("original_warehouse_id in", values, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdNotIn(List<Integer> values) {
            addCriterion("original_warehouse_id not in", values, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("original_warehouse_id between", value1, value2, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOriginalWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("original_warehouse_id not between", value1, value2, "originalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdIsNull() {
            addCriterion("final_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdIsNotNull() {
            addCriterion("final_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdEqualTo(Integer value) {
            addCriterion("final_warehouse_id =", value, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdNotEqualTo(Integer value) {
            addCriterion("final_warehouse_id <>", value, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdGreaterThan(Integer value) {
            addCriterion("final_warehouse_id >", value, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_warehouse_id >=", value, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdLessThan(Integer value) {
            addCriterion("final_warehouse_id <", value, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("final_warehouse_id <=", value, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdIn(List<Integer> values) {
            addCriterion("final_warehouse_id in", values, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdNotIn(List<Integer> values) {
            addCriterion("final_warehouse_id not in", values, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("final_warehouse_id between", value1, value2, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andFinalWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("final_warehouse_id not between", value1, value2, "finalWarehouseId");
            return (Criteria) this;
        }

        public Criteria andIsOurSendIsNull() {
            addCriterion("is_our_send is null");
            return (Criteria) this;
        }

        public Criteria andIsOurSendIsNotNull() {
            addCriterion("is_our_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsOurSendEqualTo(Integer value) {
            addCriterion("is_our_send =", value, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendNotEqualTo(Integer value) {
            addCriterion("is_our_send <>", value, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendGreaterThan(Integer value) {
            addCriterion("is_our_send >", value, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_our_send >=", value, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendLessThan(Integer value) {
            addCriterion("is_our_send <", value, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendLessThanOrEqualTo(Integer value) {
            addCriterion("is_our_send <=", value, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendIn(List<Integer> values) {
            addCriterion("is_our_send in", values, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendNotIn(List<Integer> values) {
            addCriterion("is_our_send not in", values, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendBetween(Integer value1, Integer value2) {
            addCriterion("is_our_send between", value1, value2, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsOurSendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_our_send not between", value1, value2, "isOurSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendIsNull() {
            addCriterion("is_all_send is null");
            return (Criteria) this;
        }

        public Criteria andIsAllSendIsNotNull() {
            addCriterion("is_all_send is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllSendEqualTo(Integer value) {
            addCriterion("is_all_send =", value, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendNotEqualTo(Integer value) {
            addCriterion("is_all_send <>", value, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGreaterThan(Integer value) {
            addCriterion("is_all_send >", value, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_all_send >=", value, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendLessThan(Integer value) {
            addCriterion("is_all_send <", value, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendLessThanOrEqualTo(Integer value) {
            addCriterion("is_all_send <=", value, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendIn(List<Integer> values) {
            addCriterion("is_all_send in", values, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendNotIn(List<Integer> values) {
            addCriterion("is_all_send not in", values, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendBetween(Integer value1, Integer value2) {
            addCriterion("is_all_send between", value1, value2, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andIsAllSendNotBetween(Integer value1, Integer value2) {
            addCriterion("is_all_send not between", value1, value2, "isAllSend");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdIsNull() {
            addCriterion("sina_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdIsNotNull() {
            addCriterion("sina_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdEqualTo(String value) {
            addCriterion("sina_order_id =", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdNotEqualTo(String value) {
            addCriterion("sina_order_id <>", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdGreaterThan(String value) {
            addCriterion("sina_order_id >", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("sina_order_id >=", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdLessThan(String value) {
            addCriterion("sina_order_id <", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdLessThanOrEqualTo(String value) {
            addCriterion("sina_order_id <=", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdLike(String value) {
            addCriterion("sina_order_id like", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdNotLike(String value) {
            addCriterion("sina_order_id not like", value, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdIn(List<String> values) {
            addCriterion("sina_order_id in", values, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdNotIn(List<String> values) {
            addCriterion("sina_order_id not in", values, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdBetween(String value1, String value2) {
            addCriterion("sina_order_id between", value1, value2, "sinaOrderId");
            return (Criteria) this;
        }

        public Criteria andSinaOrderIdNotBetween(String value1, String value2) {
            addCriterion("sina_order_id not between", value1, value2, "sinaOrderId");
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

        public Criteria andSecExpressIdIsNull() {
            addCriterion("sec_express_id is null");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdIsNotNull() {
            addCriterion("sec_express_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdEqualTo(Integer value) {
            addCriterion("sec_express_id =", value, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdNotEqualTo(Integer value) {
            addCriterion("sec_express_id <>", value, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdGreaterThan(Integer value) {
            addCriterion("sec_express_id >", value, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sec_express_id >=", value, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdLessThan(Integer value) {
            addCriterion("sec_express_id <", value, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdLessThanOrEqualTo(Integer value) {
            addCriterion("sec_express_id <=", value, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdIn(List<Integer> values) {
            addCriterion("sec_express_id in", values, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdNotIn(List<Integer> values) {
            addCriterion("sec_express_id not in", values, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdBetween(Integer value1, Integer value2) {
            addCriterion("sec_express_id between", value1, value2, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sec_express_id not between", value1, value2, "secExpressId");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnIsNull() {
            addCriterion("sec_express_sn is null");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnIsNotNull() {
            addCriterion("sec_express_sn is not null");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnEqualTo(String value) {
            addCriterion("sec_express_sn =", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnNotEqualTo(String value) {
            addCriterion("sec_express_sn <>", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnGreaterThan(String value) {
            addCriterion("sec_express_sn >", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnGreaterThanOrEqualTo(String value) {
            addCriterion("sec_express_sn >=", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnLessThan(String value) {
            addCriterion("sec_express_sn <", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnLessThanOrEqualTo(String value) {
            addCriterion("sec_express_sn <=", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnLike(String value) {
            addCriterion("sec_express_sn like", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnNotLike(String value) {
            addCriterion("sec_express_sn not like", value, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnIn(List<String> values) {
            addCriterion("sec_express_sn in", values, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnNotIn(List<String> values) {
            addCriterion("sec_express_sn not in", values, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnBetween(String value1, String value2) {
            addCriterion("sec_express_sn between", value1, value2, "secExpressSn");
            return (Criteria) this;
        }

        public Criteria andSecExpressSnNotBetween(String value1, String value2) {
            addCriterion("sec_express_sn not between", value1, value2, "secExpressSn");
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

        public Criteria andChangeHouseIdIsNull() {
            addCriterion("change_house_id is null");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdIsNotNull() {
            addCriterion("change_house_id is not null");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdEqualTo(Integer value) {
            addCriterion("change_house_id =", value, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdNotEqualTo(Integer value) {
            addCriterion("change_house_id <>", value, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdGreaterThan(Integer value) {
            addCriterion("change_house_id >", value, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_house_id >=", value, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdLessThan(Integer value) {
            addCriterion("change_house_id <", value, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("change_house_id <=", value, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdIn(List<Integer> values) {
            addCriterion("change_house_id in", values, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdNotIn(List<Integer> values) {
            addCriterion("change_house_id not in", values, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdBetween(Integer value1, Integer value2) {
            addCriterion("change_house_id between", value1, value2, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andChangeHouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("change_house_id not between", value1, value2, "changeHouseId");
            return (Criteria) this;
        }

        public Criteria andPacketNumIsNull() {
            addCriterion("packet_num is null");
            return (Criteria) this;
        }

        public Criteria andPacketNumIsNotNull() {
            addCriterion("packet_num is not null");
            return (Criteria) this;
        }

        public Criteria andPacketNumEqualTo(Integer value) {
            addCriterion("packet_num =", value, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumNotEqualTo(Integer value) {
            addCriterion("packet_num <>", value, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumGreaterThan(Integer value) {
            addCriterion("packet_num >", value, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("packet_num >=", value, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumLessThan(Integer value) {
            addCriterion("packet_num <", value, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumLessThanOrEqualTo(Integer value) {
            addCriterion("packet_num <=", value, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumIn(List<Integer> values) {
            addCriterion("packet_num in", values, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumNotIn(List<Integer> values) {
            addCriterion("packet_num not in", values, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumBetween(Integer value1, Integer value2) {
            addCriterion("packet_num between", value1, value2, "packetNum");
            return (Criteria) this;
        }

        public Criteria andPacketNumNotBetween(Integer value1, Integer value2) {
            addCriterion("packet_num not between", value1, value2, "packetNum");
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

        public Criteria andAddStatusIsNull() {
            addCriterion("add_status is null");
            return (Criteria) this;
        }

        public Criteria andAddStatusIsNotNull() {
            addCriterion("add_status is not null");
            return (Criteria) this;
        }

        public Criteria andAddStatusEqualTo(Integer value) {
            addCriterion("add_status =", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotEqualTo(Integer value) {
            addCriterion("add_status <>", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusGreaterThan(Integer value) {
            addCriterion("add_status >", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_status >=", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusLessThan(Integer value) {
            addCriterion("add_status <", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusLessThanOrEqualTo(Integer value) {
            addCriterion("add_status <=", value, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusIn(List<Integer> values) {
            addCriterion("add_status in", values, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotIn(List<Integer> values) {
            addCriterion("add_status not in", values, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusBetween(Integer value1, Integer value2) {
            addCriterion("add_status between", value1, value2, "addStatus");
            return (Criteria) this;
        }

        public Criteria andAddStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("add_status not between", value1, value2, "addStatus");
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

        public Criteria andDiscountCardNumIsNull() {
            addCriterion("discount_card_num is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumIsNotNull() {
            addCriterion("discount_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumEqualTo(String value) {
            addCriterion("discount_card_num =", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumNotEqualTo(String value) {
            addCriterion("discount_card_num <>", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumGreaterThan(String value) {
            addCriterion("discount_card_num >", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("discount_card_num >=", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumLessThan(String value) {
            addCriterion("discount_card_num <", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumLessThanOrEqualTo(String value) {
            addCriterion("discount_card_num <=", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumLike(String value) {
            addCriterion("discount_card_num like", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumNotLike(String value) {
            addCriterion("discount_card_num not like", value, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumIn(List<String> values) {
            addCriterion("discount_card_num in", values, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumNotIn(List<String> values) {
            addCriterion("discount_card_num not in", values, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumBetween(String value1, String value2) {
            addCriterion("discount_card_num between", value1, value2, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardNumNotBetween(String value1, String value2) {
            addCriterion("discount_card_num not between", value1, value2, "discountCardNum");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionIsNull() {
            addCriterion("discount_card_condition is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionIsNotNull() {
            addCriterion("discount_card_condition is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionEqualTo(BigDecimal value) {
            addCriterion("discount_card_condition =", value, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionNotEqualTo(BigDecimal value) {
            addCriterion("discount_card_condition <>", value, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionGreaterThan(BigDecimal value) {
            addCriterion("discount_card_condition >", value, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_card_condition >=", value, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionLessThan(BigDecimal value) {
            addCriterion("discount_card_condition <", value, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_card_condition <=", value, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionIn(List<BigDecimal> values) {
            addCriterion("discount_card_condition in", values, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionNotIn(List<BigDecimal> values) {
            addCriterion("discount_card_condition not in", values, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_card_condition between", value1, value2, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardConditionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_card_condition not between", value1, value2, "discountCardCondition");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyIsNull() {
            addCriterion("discount_card_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyIsNotNull() {
            addCriterion("discount_card_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyEqualTo(BigDecimal value) {
            addCriterion("discount_card_money =", value, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyNotEqualTo(BigDecimal value) {
            addCriterion("discount_card_money <>", value, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyGreaterThan(BigDecimal value) {
            addCriterion("discount_card_money >", value, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_card_money >=", value, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyLessThan(BigDecimal value) {
            addCriterion("discount_card_money <", value, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_card_money <=", value, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyIn(List<BigDecimal> values) {
            addCriterion("discount_card_money in", values, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyNotIn(List<BigDecimal> values) {
            addCriterion("discount_card_money not in", values, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_card_money between", value1, value2, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountCardMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_card_money not between", value1, value2, "discountCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumIsNull() {
            addCriterion("category_card_num is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumIsNotNull() {
            addCriterion("category_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumEqualTo(String value) {
            addCriterion("category_card_num =", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumNotEqualTo(String value) {
            addCriterion("category_card_num <>", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumGreaterThan(String value) {
            addCriterion("category_card_num >", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("category_card_num >=", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumLessThan(String value) {
            addCriterion("category_card_num <", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumLessThanOrEqualTo(String value) {
            addCriterion("category_card_num <=", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumLike(String value) {
            addCriterion("category_card_num like", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumNotLike(String value) {
            addCriterion("category_card_num not like", value, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumIn(List<String> values) {
            addCriterion("category_card_num in", values, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumNotIn(List<String> values) {
            addCriterion("category_card_num not in", values, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumBetween(String value1, String value2) {
            addCriterion("category_card_num between", value1, value2, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardNumNotBetween(String value1, String value2) {
            addCriterion("category_card_num not between", value1, value2, "categoryCardNum");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyIsNull() {
            addCriterion("category_card_money is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyIsNotNull() {
            addCriterion("category_card_money is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyEqualTo(BigDecimal value) {
            addCriterion("category_card_money =", value, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyNotEqualTo(BigDecimal value) {
            addCriterion("category_card_money <>", value, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyGreaterThan(BigDecimal value) {
            addCriterion("category_card_money >", value, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("category_card_money >=", value, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyLessThan(BigDecimal value) {
            addCriterion("category_card_money <", value, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("category_card_money <=", value, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyIn(List<BigDecimal> values) {
            addCriterion("category_card_money in", values, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyNotIn(List<BigDecimal> values) {
            addCriterion("category_card_money not in", values, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("category_card_money between", value1, value2, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andCategoryCardMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("category_card_money not between", value1, value2, "categoryCardMoney");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyIsNull() {
            addCriterion("fill_reduce_money is null");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyIsNotNull() {
            addCriterion("fill_reduce_money is not null");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyEqualTo(BigDecimal value) {
            addCriterion("fill_reduce_money =", value, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyNotEqualTo(BigDecimal value) {
            addCriterion("fill_reduce_money <>", value, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyGreaterThan(BigDecimal value) {
            addCriterion("fill_reduce_money >", value, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fill_reduce_money >=", value, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyLessThan(BigDecimal value) {
            addCriterion("fill_reduce_money <", value, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fill_reduce_money <=", value, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyIn(List<BigDecimal> values) {
            addCriterion("fill_reduce_money in", values, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyNotIn(List<BigDecimal> values) {
            addCriterion("fill_reduce_money not in", values, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fill_reduce_money between", value1, value2, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andFillReduceMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fill_reduce_money not between", value1, value2, "fillReduceMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumIsNull() {
            addCriterion("real_discount_card_num is null");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumIsNotNull() {
            addCriterion("real_discount_card_num is not null");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumEqualTo(String value) {
            addCriterion("real_discount_card_num =", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumNotEqualTo(String value) {
            addCriterion("real_discount_card_num <>", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumGreaterThan(String value) {
            addCriterion("real_discount_card_num >", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumGreaterThanOrEqualTo(String value) {
            addCriterion("real_discount_card_num >=", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumLessThan(String value) {
            addCriterion("real_discount_card_num <", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumLessThanOrEqualTo(String value) {
            addCriterion("real_discount_card_num <=", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumLike(String value) {
            addCriterion("real_discount_card_num like", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumNotLike(String value) {
            addCriterion("real_discount_card_num not like", value, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumIn(List<String> values) {
            addCriterion("real_discount_card_num in", values, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumNotIn(List<String> values) {
            addCriterion("real_discount_card_num not in", values, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumBetween(String value1, String value2) {
            addCriterion("real_discount_card_num between", value1, value2, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountCardNumNotBetween(String value1, String value2) {
            addCriterion("real_discount_card_num not between", value1, value2, "realDiscountCardNum");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateIsNull() {
            addCriterion("real_discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateIsNotNull() {
            addCriterion("real_discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateEqualTo(BigDecimal value) {
            addCriterion("real_discount_rate =", value, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateNotEqualTo(BigDecimal value) {
            addCriterion("real_discount_rate <>", value, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateGreaterThan(BigDecimal value) {
            addCriterion("real_discount_rate >", value, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_discount_rate >=", value, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateLessThan(BigDecimal value) {
            addCriterion("real_discount_rate <", value, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_discount_rate <=", value, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateIn(List<BigDecimal> values) {
            addCriterion("real_discount_rate in", values, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateNotIn(List<BigDecimal> values) {
            addCriterion("real_discount_rate not in", values, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_discount_rate between", value1, value2, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_discount_rate not between", value1, value2, "realDiscountRate");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyIsNull() {
            addCriterion("real_discount_money is null");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyIsNotNull() {
            addCriterion("real_discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyEqualTo(BigDecimal value) {
            addCriterion("real_discount_money =", value, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyNotEqualTo(BigDecimal value) {
            addCriterion("real_discount_money <>", value, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyGreaterThan(BigDecimal value) {
            addCriterion("real_discount_money >", value, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_discount_money >=", value, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyLessThan(BigDecimal value) {
            addCriterion("real_discount_money <", value, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_discount_money <=", value, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyIn(List<BigDecimal> values) {
            addCriterion("real_discount_money in", values, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyNotIn(List<BigDecimal> values) {
            addCriterion("real_discount_money not in", values, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_discount_money between", value1, value2, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andRealDiscountMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_discount_money not between", value1, value2, "realDiscountMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNull() {
            addCriterion("gift_money is null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNotNull() {
            addCriterion("gift_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyEqualTo(BigDecimal value) {
            addCriterion("gift_money =", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotEqualTo(BigDecimal value) {
            addCriterion("gift_money <>", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThan(BigDecimal value) {
            addCriterion("gift_money >", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gift_money >=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThan(BigDecimal value) {
            addCriterion("gift_money <", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gift_money <=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIn(List<BigDecimal> values) {
            addCriterion("gift_money in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotIn(List<BigDecimal> values) {
            addCriterion("gift_money not in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gift_money between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gift_money not between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andVipRateIsNull() {
            addCriterion("vip_rate is null");
            return (Criteria) this;
        }

        public Criteria andVipRateIsNotNull() {
            addCriterion("vip_rate is not null");
            return (Criteria) this;
        }

        public Criteria andVipRateEqualTo(BigDecimal value) {
            addCriterion("vip_rate =", value, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateNotEqualTo(BigDecimal value) {
            addCriterion("vip_rate <>", value, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateGreaterThan(BigDecimal value) {
            addCriterion("vip_rate >", value, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_rate >=", value, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateLessThan(BigDecimal value) {
            addCriterion("vip_rate <", value, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_rate <=", value, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateIn(List<BigDecimal> values) {
            addCriterion("vip_rate in", values, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateNotIn(List<BigDecimal> values) {
            addCriterion("vip_rate not in", values, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_rate between", value1, value2, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_rate not between", value1, value2, "vipRate");
            return (Criteria) this;
        }

        public Criteria andVipReducedIsNull() {
            addCriterion("vip_reduced is null");
            return (Criteria) this;
        }

        public Criteria andVipReducedIsNotNull() {
            addCriterion("vip_reduced is not null");
            return (Criteria) this;
        }

        public Criteria andVipReducedEqualTo(BigDecimal value) {
            addCriterion("vip_reduced =", value, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedNotEqualTo(BigDecimal value) {
            addCriterion("vip_reduced <>", value, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedGreaterThan(BigDecimal value) {
            addCriterion("vip_reduced >", value, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_reduced >=", value, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedLessThan(BigDecimal value) {
            addCriterion("vip_reduced <", value, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("vip_reduced <=", value, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedIn(List<BigDecimal> values) {
            addCriterion("vip_reduced in", values, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedNotIn(List<BigDecimal> values) {
            addCriterion("vip_reduced not in", values, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_reduced between", value1, value2, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andVipReducedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("vip_reduced not between", value1, value2, "vipReduced");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentIsNull() {
            addCriterion("is_installment is null");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentIsNotNull() {
            addCriterion("is_installment is not null");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentEqualTo(Boolean value) {
            addCriterion("is_installment =", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentNotEqualTo(Boolean value) {
            addCriterion("is_installment <>", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentGreaterThan(Boolean value) {
            addCriterion("is_installment >", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_installment >=", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentLessThan(Boolean value) {
            addCriterion("is_installment <", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentLessThanOrEqualTo(Boolean value) {
            addCriterion("is_installment <=", value, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentIn(List<Boolean> values) {
            addCriterion("is_installment in", values, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentNotIn(List<Boolean> values) {
            addCriterion("is_installment not in", values, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentBetween(Boolean value1, Boolean value2) {
            addCriterion("is_installment between", value1, value2, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andIsInstallmentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_installment not between", value1, value2, "isInstallment");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeIsNull() {
            addCriterion("installment_paycode is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeIsNotNull() {
            addCriterion("installment_paycode is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeEqualTo(String value) {
            addCriterion("installment_paycode =", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeNotEqualTo(String value) {
            addCriterion("installment_paycode <>", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeGreaterThan(String value) {
            addCriterion("installment_paycode >", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeGreaterThanOrEqualTo(String value) {
            addCriterion("installment_paycode >=", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeLessThan(String value) {
            addCriterion("installment_paycode <", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeLessThanOrEqualTo(String value) {
            addCriterion("installment_paycode <=", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeLike(String value) {
            addCriterion("installment_paycode like", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeNotLike(String value) {
            addCriterion("installment_paycode not like", value, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeIn(List<String> values) {
            addCriterion("installment_paycode in", values, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeNotIn(List<String> values) {
            addCriterion("installment_paycode not in", values, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeBetween(String value1, String value2) {
            addCriterion("installment_paycode between", value1, value2, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andInstallmentPaycodeNotBetween(String value1, String value2) {
            addCriterion("installment_paycode not between", value1, value2, "installmentPaycode");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeIsNull() {
            addCriterion("voucherFee is null");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeIsNotNull() {
            addCriterion("voucherFee is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeEqualTo(BigDecimal value) {
            addCriterion("voucherFee =", value, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeNotEqualTo(BigDecimal value) {
            addCriterion("voucherFee <>", value, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeGreaterThan(BigDecimal value) {
            addCriterion("voucherFee >", value, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("voucherFee >=", value, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeLessThan(BigDecimal value) {
            addCriterion("voucherFee <", value, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("voucherFee <=", value, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeIn(List<BigDecimal> values) {
            addCriterion("voucherFee in", values, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeNotIn(List<BigDecimal> values) {
            addCriterion("voucherFee not in", values, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucherFee between", value1, value2, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andVoucherfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("voucherFee not between", value1, value2, "voucherfee");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyIsNull() {
            addCriterion("installment_per_money is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyIsNotNull() {
            addCriterion("installment_per_money is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyEqualTo(BigDecimal value) {
            addCriterion("installment_per_money =", value, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyNotEqualTo(BigDecimal value) {
            addCriterion("installment_per_money <>", value, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyGreaterThan(BigDecimal value) {
            addCriterion("installment_per_money >", value, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_per_money >=", value, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyLessThan(BigDecimal value) {
            addCriterion("installment_per_money <", value, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_per_money <=", value, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyIn(List<BigDecimal> values) {
            addCriterion("installment_per_money in", values, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyNotIn(List<BigDecimal> values) {
            addCriterion("installment_per_money not in", values, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_per_money between", value1, value2, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentPerMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_per_money not between", value1, value2, "installmentPerMoney");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesIsNull() {
            addCriterion("installment_times is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesIsNotNull() {
            addCriterion("installment_times is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesEqualTo(Integer value) {
            addCriterion("installment_times =", value, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesNotEqualTo(Integer value) {
            addCriterion("installment_times <>", value, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesGreaterThan(Integer value) {
            addCriterion("installment_times >", value, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("installment_times >=", value, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesLessThan(Integer value) {
            addCriterion("installment_times <", value, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesLessThanOrEqualTo(Integer value) {
            addCriterion("installment_times <=", value, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesIn(List<Integer> values) {
            addCriterion("installment_times in", values, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesNotIn(List<Integer> values) {
            addCriterion("installment_times not in", values, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesBetween(Integer value1, Integer value2) {
            addCriterion("installment_times between", value1, value2, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("installment_times not between", value1, value2, "installmentTimes");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateIsNull() {
            addCriterion("installment_fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateIsNotNull() {
            addCriterion("installment_fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateEqualTo(BigDecimal value) {
            addCriterion("installment_fee_rate =", value, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateNotEqualTo(BigDecimal value) {
            addCriterion("installment_fee_rate <>", value, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateGreaterThan(BigDecimal value) {
            addCriterion("installment_fee_rate >", value, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_fee_rate >=", value, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateLessThan(BigDecimal value) {
            addCriterion("installment_fee_rate <", value, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_fee_rate <=", value, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateIn(List<BigDecimal> values) {
            addCriterion("installment_fee_rate in", values, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateNotIn(List<BigDecimal> values) {
            addCriterion("installment_fee_rate not in", values, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_fee_rate between", value1, value2, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_fee_rate not between", value1, value2, "installmentFeeRate");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerIsNull() {
            addCriterion("installment_fee_by_seller is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerIsNotNull() {
            addCriterion("installment_fee_by_seller is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_seller =", value, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerNotEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_seller <>", value, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerGreaterThan(BigDecimal value) {
            addCriterion("installment_fee_by_seller >", value, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_seller >=", value, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerLessThan(BigDecimal value) {
            addCriterion("installment_fee_by_seller <", value, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_seller <=", value, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerIn(List<BigDecimal> values) {
            addCriterion("installment_fee_by_seller in", values, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerNotIn(List<BigDecimal> values) {
            addCriterion("installment_fee_by_seller not in", values, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_fee_by_seller between", value1, value2, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeBySellerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_fee_by_seller not between", value1, value2, "installmentFeeBySeller");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerIsNull() {
            addCriterion("installment_fee_by_customer is null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerIsNotNull() {
            addCriterion("installment_fee_by_customer is not null");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_customer =", value, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerNotEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_customer <>", value, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerGreaterThan(BigDecimal value) {
            addCriterion("installment_fee_by_customer >", value, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_customer >=", value, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerLessThan(BigDecimal value) {
            addCriterion("installment_fee_by_customer <", value, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("installment_fee_by_customer <=", value, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerIn(List<BigDecimal> values) {
            addCriterion("installment_fee_by_customer in", values, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerNotIn(List<BigDecimal> values) {
            addCriterion("installment_fee_by_customer not in", values, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_fee_by_customer between", value1, value2, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andInstallmentFeeByCustomerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("installment_fee_by_customer not between", value1, value2, "installmentFeeByCustomer");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayIsNull() {
            addCriterion("give_point_online_pay is null");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayIsNotNull() {
            addCriterion("give_point_online_pay is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayEqualTo(BigDecimal value) {
            addCriterion("give_point_online_pay =", value, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayNotEqualTo(BigDecimal value) {
            addCriterion("give_point_online_pay <>", value, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayGreaterThan(BigDecimal value) {
            addCriterion("give_point_online_pay >", value, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("give_point_online_pay >=", value, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayLessThan(BigDecimal value) {
            addCriterion("give_point_online_pay <", value, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("give_point_online_pay <=", value, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayIn(List<BigDecimal> values) {
            addCriterion("give_point_online_pay in", values, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayNotIn(List<BigDecimal> values) {
            addCriterion("give_point_online_pay not in", values, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_point_online_pay between", value1, value2, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointOnlinePayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_point_online_pay not between", value1, value2, "givePointOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayIsNull() {
            addCriterion("give_point_rate_online_pay is null");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayIsNotNull() {
            addCriterion("give_point_rate_online_pay is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayEqualTo(Float value) {
            addCriterion("give_point_rate_online_pay =", value, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayNotEqualTo(Float value) {
            addCriterion("give_point_rate_online_pay <>", value, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayGreaterThan(Float value) {
            addCriterion("give_point_rate_online_pay >", value, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayGreaterThanOrEqualTo(Float value) {
            addCriterion("give_point_rate_online_pay >=", value, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayLessThan(Float value) {
            addCriterion("give_point_rate_online_pay <", value, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayLessThanOrEqualTo(Float value) {
            addCriterion("give_point_rate_online_pay <=", value, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayIn(List<Float> values) {
            addCriterion("give_point_rate_online_pay in", values, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayNotIn(List<Float> values) {
            addCriterion("give_point_rate_online_pay not in", values, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayBetween(Float value1, Float value2) {
            addCriterion("give_point_rate_online_pay between", value1, value2, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointRateOnlinePayNotBetween(Float value1, Float value2) {
            addCriterion("give_point_rate_online_pay not between", value1, value2, "givePointRateOnlinePay");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNull() {
            addCriterion("give_point is null");
            return (Criteria) this;
        }

        public Criteria andGivePointIsNotNull() {
            addCriterion("give_point is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointEqualTo(BigDecimal value) {
            addCriterion("give_point =", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotEqualTo(BigDecimal value) {
            addCriterion("give_point <>", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThan(BigDecimal value) {
            addCriterion("give_point >", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("give_point >=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThan(BigDecimal value) {
            addCriterion("give_point <", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("give_point <=", value, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointIn(List<BigDecimal> values) {
            addCriterion("give_point in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotIn(List<BigDecimal> values) {
            addCriterion("give_point not in", values, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_point between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("give_point not between", value1, value2, "givePoint");
            return (Criteria) this;
        }

        public Criteria andGivePointRateIsNull() {
            addCriterion("give_point_rate is null");
            return (Criteria) this;
        }

        public Criteria andGivePointRateIsNotNull() {
            addCriterion("give_point_rate is not null");
            return (Criteria) this;
        }

        public Criteria andGivePointRateEqualTo(Float value) {
            addCriterion("give_point_rate =", value, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateNotEqualTo(Float value) {
            addCriterion("give_point_rate <>", value, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateGreaterThan(Float value) {
            addCriterion("give_point_rate >", value, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateGreaterThanOrEqualTo(Float value) {
            addCriterion("give_point_rate >=", value, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateLessThan(Float value) {
            addCriterion("give_point_rate <", value, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateLessThanOrEqualTo(Float value) {
            addCriterion("give_point_rate <=", value, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateIn(List<Float> values) {
            addCriterion("give_point_rate in", values, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateNotIn(List<Float> values) {
            addCriterion("give_point_rate not in", values, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateBetween(Float value1, Float value2) {
            addCriterion("give_point_rate between", value1, value2, "givePointRate");
            return (Criteria) this;
        }

        public Criteria andGivePointRateNotBetween(Float value1, Float value2) {
            addCriterion("give_point_rate not between", value1, value2, "givePointRate");
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

        public Criteria andUsedPointIsNull() {
            addCriterion("used_point is null");
            return (Criteria) this;
        }

        public Criteria andUsedPointIsNotNull() {
            addCriterion("used_point is not null");
            return (Criteria) this;
        }

        public Criteria andUsedPointEqualTo(BigDecimal value) {
            addCriterion("used_point =", value, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointNotEqualTo(BigDecimal value) {
            addCriterion("used_point <>", value, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointGreaterThan(BigDecimal value) {
            addCriterion("used_point >", value, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("used_point >=", value, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointLessThan(BigDecimal value) {
            addCriterion("used_point <", value, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("used_point <=", value, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointIn(List<BigDecimal> values) {
            addCriterion("used_point in", values, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointNotIn(List<BigDecimal> values) {
            addCriterion("used_point not in", values, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_point between", value1, value2, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUsedPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_point not between", value1, value2, "usedPoint");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedIsNull() {
            addCriterion("use_online_payed is null");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedIsNotNull() {
            addCriterion("use_online_payed is not null");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedEqualTo(BigDecimal value) {
            addCriterion("use_online_payed =", value, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedNotEqualTo(BigDecimal value) {
            addCriterion("use_online_payed <>", value, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedGreaterThan(BigDecimal value) {
            addCriterion("use_online_payed >", value, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_online_payed >=", value, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedLessThan(BigDecimal value) {
            addCriterion("use_online_payed <", value, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_online_payed <=", value, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedIn(List<BigDecimal> values) {
            addCriterion("use_online_payed in", values, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedNotIn(List<BigDecimal> values) {
            addCriterion("use_online_payed not in", values, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_online_payed between", value1, value2, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOnlinePayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_online_payed not between", value1, value2, "useOnlinePayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedIsNull() {
            addCriterion("use_cash_payed is null");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedIsNotNull() {
            addCriterion("use_cash_payed is not null");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedEqualTo(BigDecimal value) {
            addCriterion("use_cash_payed =", value, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedNotEqualTo(BigDecimal value) {
            addCriterion("use_cash_payed <>", value, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedGreaterThan(BigDecimal value) {
            addCriterion("use_cash_payed >", value, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_cash_payed >=", value, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedLessThan(BigDecimal value) {
            addCriterion("use_cash_payed <", value, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_cash_payed <=", value, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedIn(List<BigDecimal> values) {
            addCriterion("use_cash_payed in", values, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedNotIn(List<BigDecimal> values) {
            addCriterion("use_cash_payed not in", values, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_cash_payed between", value1, value2, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUseCashPayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_cash_payed not between", value1, value2, "useCashPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedIsNull() {
            addCriterion("use_pos_payed is null");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedIsNotNull() {
            addCriterion("use_pos_payed is not null");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedEqualTo(BigDecimal value) {
            addCriterion("use_pos_payed =", value, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedNotEqualTo(BigDecimal value) {
            addCriterion("use_pos_payed <>", value, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedGreaterThan(BigDecimal value) {
            addCriterion("use_pos_payed >", value, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_pos_payed >=", value, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedLessThan(BigDecimal value) {
            addCriterion("use_pos_payed <", value, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_pos_payed <=", value, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedIn(List<BigDecimal> values) {
            addCriterion("use_pos_payed in", values, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedNotIn(List<BigDecimal> values) {
            addCriterion("use_pos_payed not in", values, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_pos_payed between", value1, value2, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsePosPayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_pos_payed not between", value1, value2, "usePosPayed");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceIsNull() {
            addCriterion("used_balance is null");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceIsNotNull() {
            addCriterion("used_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceEqualTo(BigDecimal value) {
            addCriterion("used_balance =", value, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceNotEqualTo(BigDecimal value) {
            addCriterion("used_balance <>", value, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceGreaterThan(BigDecimal value) {
            addCriterion("used_balance >", value, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("used_balance >=", value, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceLessThan(BigDecimal value) {
            addCriterion("used_balance <", value, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("used_balance <=", value, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceIn(List<BigDecimal> values) {
            addCriterion("used_balance in", values, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceNotIn(List<BigDecimal> values) {
            addCriterion("used_balance not in", values, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_balance between", value1, value2, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUsedBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("used_balance not between", value1, value2, "usedBalance");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedIsNull() {
            addCriterion("use_offline_payed is null");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedIsNotNull() {
            addCriterion("use_offline_payed is not null");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedEqualTo(BigDecimal value) {
            addCriterion("use_offline_payed =", value, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedNotEqualTo(BigDecimal value) {
            addCriterion("use_offline_payed <>", value, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedGreaterThan(BigDecimal value) {
            addCriterion("use_offline_payed >", value, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_offline_payed >=", value, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedLessThan(BigDecimal value) {
            addCriterion("use_offline_payed <", value, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_offline_payed <=", value, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedIn(List<BigDecimal> values) {
            addCriterion("use_offline_payed in", values, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedNotIn(List<BigDecimal> values) {
            addCriterion("use_offline_payed not in", values, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_offline_payed between", value1, value2, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflinePayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_offline_payed not between", value1, value2, "useOfflinePayed");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedIsNull() {
            addCriterion("use_offline_reduced is null");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedIsNotNull() {
            addCriterion("use_offline_reduced is not null");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedEqualTo(BigDecimal value) {
            addCriterion("use_offline_reduced =", value, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedNotEqualTo(BigDecimal value) {
            addCriterion("use_offline_reduced <>", value, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedGreaterThan(BigDecimal value) {
            addCriterion("use_offline_reduced >", value, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_offline_reduced >=", value, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedLessThan(BigDecimal value) {
            addCriterion("use_offline_reduced <", value, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_offline_reduced <=", value, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedIn(List<BigDecimal> values) {
            addCriterion("use_offline_reduced in", values, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedNotIn(List<BigDecimal> values) {
            addCriterion("use_offline_reduced not in", values, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_offline_reduced between", value1, value2, "useOfflineReduced");
            return (Criteria) this;
        }

        public Criteria andUseOfflineReducedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_offline_reduced not between", value1, value2, "useOfflineReduced");
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

        public Criteria andConsigneeEmailIsNull() {
            addCriterion("consignee_email is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNotNull() {
            addCriterion("consignee_email is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailEqualTo(String value) {
            addCriterion("consignee_email =", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotEqualTo(String value) {
            addCriterion("consignee_email <>", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThan(String value) {
            addCriterion("consignee_email >", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_email >=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThan(String value) {
            addCriterion("consignee_email <", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThanOrEqualTo(String value) {
            addCriterion("consignee_email <=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLike(String value) {
            addCriterion("consignee_email like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotLike(String value) {
            addCriterion("consignee_email not like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIn(List<String> values) {
            addCriterion("consignee_email in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotIn(List<String> values) {
            addCriterion("consignee_email not in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailBetween(String value1, String value2) {
            addCriterion("consignee_email between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotBetween(String value1, String value2) {
            addCriterion("consignee_email not between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNull() {
            addCriterion("consignee_tel is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIsNotNull() {
            addCriterion("consignee_tel is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelEqualTo(String value) {
            addCriterion("consignee_tel =", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotEqualTo(String value) {
            addCriterion("consignee_tel <>", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThan(String value) {
            addCriterion("consignee_tel >", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_tel >=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThan(String value) {
            addCriterion("consignee_tel <", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLessThanOrEqualTo(String value) {
            addCriterion("consignee_tel <=", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelLike(String value) {
            addCriterion("consignee_tel like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotLike(String value) {
            addCriterion("consignee_tel not like", value, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelIn(List<String> values) {
            addCriterion("consignee_tel in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotIn(List<String> values) {
            addCriterion("consignee_tel not in", values, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelBetween(String value1, String value2) {
            addCriterion("consignee_tel between", value1, value2, "consigneeTel");
            return (Criteria) this;
        }

        public Criteria andConsigneeTelNotBetween(String value1, String value2) {
            addCriterion("consignee_tel not between", value1, value2, "consigneeTel");
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

        public Criteria andManageMemoIsNull() {
            addCriterion("manage_memo is null");
            return (Criteria) this;
        }

        public Criteria andManageMemoIsNotNull() {
            addCriterion("manage_memo is not null");
            return (Criteria) this;
        }

        public Criteria andManageMemoEqualTo(String value) {
            addCriterion("manage_memo =", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoNotEqualTo(String value) {
            addCriterion("manage_memo <>", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoGreaterThan(String value) {
            addCriterion("manage_memo >", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoGreaterThanOrEqualTo(String value) {
            addCriterion("manage_memo >=", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoLessThan(String value) {
            addCriterion("manage_memo <", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoLessThanOrEqualTo(String value) {
            addCriterion("manage_memo <=", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoLike(String value) {
            addCriterion("manage_memo like", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoNotLike(String value) {
            addCriterion("manage_memo not like", value, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoIn(List<String> values) {
            addCriterion("manage_memo in", values, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoNotIn(List<String> values) {
            addCriterion("manage_memo not in", values, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoBetween(String value1, String value2) {
            addCriterion("manage_memo between", value1, value2, "manageMemo");
            return (Criteria) this;
        }

        public Criteria andManageMemoNotBetween(String value1, String value2) {
            addCriterion("manage_memo not between", value1, value2, "manageMemo");
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

        public Criteria andRefundOrderIdIsNull() {
            addCriterion("refund_order_id is null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdIsNotNull() {
            addCriterion("refund_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdEqualTo(Integer value) {
            addCriterion("refund_order_id =", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotEqualTo(Integer value) {
            addCriterion("refund_order_id <>", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThan(Integer value) {
            addCriterion("refund_order_id >", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_order_id >=", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThan(Integer value) {
            addCriterion("refund_order_id <", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("refund_order_id <=", value, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdIn(List<Integer> values) {
            addCriterion("refund_order_id in", values, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotIn(List<Integer> values) {
            addCriterion("refund_order_id not in", values, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("refund_order_id between", value1, value2, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andRefundOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_order_id not between", value1, value2, "refundOrderId");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnIsNull() {
            addCriterion("parent_order_sn is null");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnIsNotNull() {
            addCriterion("parent_order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnEqualTo(Long value) {
            addCriterion("parent_order_sn =", value, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnNotEqualTo(Long value) {
            addCriterion("parent_order_sn <>", value, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnGreaterThan(Long value) {
            addCriterion("parent_order_sn >", value, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_order_sn >=", value, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnLessThan(Long value) {
            addCriterion("parent_order_sn <", value, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnLessThanOrEqualTo(Long value) {
            addCriterion("parent_order_sn <=", value, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnIn(List<Long> values) {
            addCriterion("parent_order_sn in", values, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnNotIn(List<Long> values) {
            addCriterion("parent_order_sn not in", values, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnBetween(Long value1, Long value2) {
            addCriterion("parent_order_sn between", value1, value2, "parentOrderSn");
            return (Criteria) this;
        }

        public Criteria andParentOrderSnNotBetween(Long value1, Long value2) {
            addCriterion("parent_order_sn not between", value1, value2, "parentOrderSn");
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

        public Criteria andYiqifaFlagIsNull() {
            addCriterion("yiqifa_flag is null");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagIsNotNull() {
            addCriterion("yiqifa_flag is not null");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagEqualTo(Boolean value) {
            addCriterion("yiqifa_flag =", value, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagNotEqualTo(Boolean value) {
            addCriterion("yiqifa_flag <>", value, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagGreaterThan(Boolean value) {
            addCriterion("yiqifa_flag >", value, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("yiqifa_flag >=", value, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagLessThan(Boolean value) {
            addCriterion("yiqifa_flag <", value, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("yiqifa_flag <=", value, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagIn(List<Boolean> values) {
            addCriterion("yiqifa_flag in", values, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagNotIn(List<Boolean> values) {
            addCriterion("yiqifa_flag not in", values, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("yiqifa_flag between", value1, value2, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("yiqifa_flag not between", value1, value2, "yiqifaFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidIsNull() {
            addCriterion("yiqifa_cid is null");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidIsNotNull() {
            addCriterion("yiqifa_cid is not null");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidEqualTo(String value) {
            addCriterion("yiqifa_cid =", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidNotEqualTo(String value) {
            addCriterion("yiqifa_cid <>", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidGreaterThan(String value) {
            addCriterion("yiqifa_cid >", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidGreaterThanOrEqualTo(String value) {
            addCriterion("yiqifa_cid >=", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidLessThan(String value) {
            addCriterion("yiqifa_cid <", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidLessThanOrEqualTo(String value) {
            addCriterion("yiqifa_cid <=", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidLike(String value) {
            addCriterion("yiqifa_cid like", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidNotLike(String value) {
            addCriterion("yiqifa_cid not like", value, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidIn(List<String> values) {
            addCriterion("yiqifa_cid in", values, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidNotIn(List<String> values) {
            addCriterion("yiqifa_cid not in", values, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidBetween(String value1, String value2) {
            addCriterion("yiqifa_cid between", value1, value2, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaCidNotBetween(String value1, String value2) {
            addCriterion("yiqifa_cid not between", value1, value2, "yiqifaCid");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiIsNull() {
            addCriterion("yiqifa_wi is null");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiIsNotNull() {
            addCriterion("yiqifa_wi is not null");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiEqualTo(String value) {
            addCriterion("yiqifa_wi =", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiNotEqualTo(String value) {
            addCriterion("yiqifa_wi <>", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiGreaterThan(String value) {
            addCriterion("yiqifa_wi >", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiGreaterThanOrEqualTo(String value) {
            addCriterion("yiqifa_wi >=", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiLessThan(String value) {
            addCriterion("yiqifa_wi <", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiLessThanOrEqualTo(String value) {
            addCriterion("yiqifa_wi <=", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiLike(String value) {
            addCriterion("yiqifa_wi like", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiNotLike(String value) {
            addCriterion("yiqifa_wi not like", value, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiIn(List<String> values) {
            addCriterion("yiqifa_wi in", values, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiNotIn(List<String> values) {
            addCriterion("yiqifa_wi not in", values, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiBetween(String value1, String value2) {
            addCriterion("yiqifa_wi between", value1, value2, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaWiNotBetween(String value1, String value2) {
            addCriterion("yiqifa_wi not between", value1, value2, "yiqifaWi");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagIsNull() {
            addCriterion("yiqifa_note_flag is null");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagIsNotNull() {
            addCriterion("yiqifa_note_flag is not null");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagEqualTo(Boolean value) {
            addCriterion("yiqifa_note_flag =", value, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagNotEqualTo(Boolean value) {
            addCriterion("yiqifa_note_flag <>", value, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagGreaterThan(Boolean value) {
            addCriterion("yiqifa_note_flag >", value, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("yiqifa_note_flag >=", value, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagLessThan(Boolean value) {
            addCriterion("yiqifa_note_flag <", value, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("yiqifa_note_flag <=", value, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagIn(List<Boolean> values) {
            addCriterion("yiqifa_note_flag in", values, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagNotIn(List<Boolean> values) {
            addCriterion("yiqifa_note_flag not in", values, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("yiqifa_note_flag between", value1, value2, "yiqifaNoteFlag");
            return (Criteria) this;
        }

        public Criteria andYiqifaNoteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("yiqifa_note_flag not between", value1, value2, "yiqifaNoteFlag");
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

        public Criteria andAutoCheckIsNull() {
            addCriterion("auto_check is null");
            return (Criteria) this;
        }

        public Criteria andAutoCheckIsNotNull() {
            addCriterion("auto_check is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCheckEqualTo(Integer value) {
            addCriterion("auto_check =", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotEqualTo(Integer value) {
            addCriterion("auto_check <>", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckGreaterThan(Integer value) {
            addCriterion("auto_check >", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("auto_check >=", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckLessThan(Integer value) {
            addCriterion("auto_check <", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckLessThanOrEqualTo(Integer value) {
            addCriterion("auto_check <=", value, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckIn(List<Integer> values) {
            addCriterion("auto_check in", values, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotIn(List<Integer> values) {
            addCriterion("auto_check not in", values, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckBetween(Integer value1, Integer value2) {
            addCriterion("auto_check between", value1, value2, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andAutoCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("auto_check not between", value1, value2, "autoCheck");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Integer value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Integer value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Integer value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Integer value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Integer value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Integer> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Integer> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Integer value1, Integer value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria and360FlagIsNull() {
            addCriterion("360_flag is null");
            return (Criteria) this;
        }

        public Criteria and360FlagIsNotNull() {
            addCriterion("360_flag is not null");
            return (Criteria) this;
        }

        public Criteria and360FlagEqualTo(Boolean value) {
            addCriterion("360_flag =", value, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagNotEqualTo(Boolean value) {
            addCriterion("360_flag <>", value, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagGreaterThan(Boolean value) {
            addCriterion("360_flag >", value, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("360_flag >=", value, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagLessThan(Boolean value) {
            addCriterion("360_flag <", value, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagLessThanOrEqualTo(Boolean value) {
            addCriterion("360_flag <=", value, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagIn(List<Boolean> values) {
            addCriterion("360_flag in", values, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagNotIn(List<Boolean> values) {
            addCriterion("360_flag not in", values, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagBetween(Boolean value1, Boolean value2) {
            addCriterion("360_flag between", value1, value2, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360FlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("360_flag not between", value1, value2, "360Flag");
            return (Criteria) this;
        }

        public Criteria and360BidIsNull() {
            addCriterion("360_bid is null");
            return (Criteria) this;
        }

        public Criteria and360BidIsNotNull() {
            addCriterion("360_bid is not null");
            return (Criteria) this;
        }

        public Criteria and360BidEqualTo(String value) {
            addCriterion("360_bid =", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidNotEqualTo(String value) {
            addCriterion("360_bid <>", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidGreaterThan(String value) {
            addCriterion("360_bid >", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidGreaterThanOrEqualTo(String value) {
            addCriterion("360_bid >=", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidLessThan(String value) {
            addCriterion("360_bid <", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidLessThanOrEqualTo(String value) {
            addCriterion("360_bid <=", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidLike(String value) {
            addCriterion("360_bid like", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidNotLike(String value) {
            addCriterion("360_bid not like", value, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidIn(List<String> values) {
            addCriterion("360_bid in", values, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidNotIn(List<String> values) {
            addCriterion("360_bid not in", values, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidBetween(String value1, String value2) {
            addCriterion("360_bid between", value1, value2, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360BidNotBetween(String value1, String value2) {
            addCriterion("360_bid not between", value1, value2, "360Bid");
            return (Criteria) this;
        }

        public Criteria and360QidIsNull() {
            addCriterion("360_qid is null");
            return (Criteria) this;
        }

        public Criteria and360QidIsNotNull() {
            addCriterion("360_qid is not null");
            return (Criteria) this;
        }

        public Criteria and360QidEqualTo(String value) {
            addCriterion("360_qid =", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidNotEqualTo(String value) {
            addCriterion("360_qid <>", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidGreaterThan(String value) {
            addCriterion("360_qid >", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidGreaterThanOrEqualTo(String value) {
            addCriterion("360_qid >=", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidLessThan(String value) {
            addCriterion("360_qid <", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidLessThanOrEqualTo(String value) {
            addCriterion("360_qid <=", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidLike(String value) {
            addCriterion("360_qid like", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidNotLike(String value) {
            addCriterion("360_qid not like", value, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidIn(List<String> values) {
            addCriterion("360_qid in", values, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidNotIn(List<String> values) {
            addCriterion("360_qid not in", values, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidBetween(String value1, String value2) {
            addCriterion("360_qid between", value1, value2, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QidNotBetween(String value1, String value2) {
            addCriterion("360_qid not between", value1, value2, "360Qid");
            return (Criteria) this;
        }

        public Criteria and360QihooIdIsNull() {
            addCriterion("360_qihoo_id is null");
            return (Criteria) this;
        }

        public Criteria and360QihooIdIsNotNull() {
            addCriterion("360_qihoo_id is not null");
            return (Criteria) this;
        }

        public Criteria and360QihooIdEqualTo(String value) {
            addCriterion("360_qihoo_id =", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdNotEqualTo(String value) {
            addCriterion("360_qihoo_id <>", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdGreaterThan(String value) {
            addCriterion("360_qihoo_id >", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdGreaterThanOrEqualTo(String value) {
            addCriterion("360_qihoo_id >=", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdLessThan(String value) {
            addCriterion("360_qihoo_id <", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdLessThanOrEqualTo(String value) {
            addCriterion("360_qihoo_id <=", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdLike(String value) {
            addCriterion("360_qihoo_id like", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdNotLike(String value) {
            addCriterion("360_qihoo_id not like", value, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdIn(List<String> values) {
            addCriterion("360_qihoo_id in", values, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdNotIn(List<String> values) {
            addCriterion("360_qihoo_id not in", values, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdBetween(String value1, String value2) {
            addCriterion("360_qihoo_id between", value1, value2, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360QihooIdNotBetween(String value1, String value2) {
            addCriterion("360_qihoo_id not between", value1, value2, "360QihooId");
            return (Criteria) this;
        }

        public Criteria and360ExtIsNull() {
            addCriterion("360_ext is null");
            return (Criteria) this;
        }

        public Criteria and360ExtIsNotNull() {
            addCriterion("360_ext is not null");
            return (Criteria) this;
        }

        public Criteria and360ExtEqualTo(String value) {
            addCriterion("360_ext =", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtNotEqualTo(String value) {
            addCriterion("360_ext <>", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtGreaterThan(String value) {
            addCriterion("360_ext >", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtGreaterThanOrEqualTo(String value) {
            addCriterion("360_ext >=", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtLessThan(String value) {
            addCriterion("360_ext <", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtLessThanOrEqualTo(String value) {
            addCriterion("360_ext <=", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtLike(String value) {
            addCriterion("360_ext like", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtNotLike(String value) {
            addCriterion("360_ext not like", value, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtIn(List<String> values) {
            addCriterion("360_ext in", values, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtNotIn(List<String> values) {
            addCriterion("360_ext not in", values, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtBetween(String value1, String value2) {
            addCriterion("360_ext between", value1, value2, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360ExtNotBetween(String value1, String value2) {
            addCriterion("360_ext not between", value1, value2, "360Ext");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagIsNull() {
            addCriterion("360_note_flag is null");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagIsNotNull() {
            addCriterion("360_note_flag is not null");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagEqualTo(Integer value) {
            addCriterion("360_note_flag =", value, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagNotEqualTo(Integer value) {
            addCriterion("360_note_flag <>", value, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagGreaterThan(Integer value) {
            addCriterion("360_note_flag >", value, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("360_note_flag >=", value, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagLessThan(Integer value) {
            addCriterion("360_note_flag <", value, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("360_note_flag <=", value, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagIn(List<Integer> values) {
            addCriterion("360_note_flag in", values, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagNotIn(List<Integer> values) {
            addCriterion("360_note_flag not in", values, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagBetween(Integer value1, Integer value2) {
            addCriterion("360_note_flag between", value1, value2, "360NoteFlag");
            return (Criteria) this;
        }

        public Criteria and360NoteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("360_note_flag not between", value1, value2, "360NoteFlag");
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Boolean value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Boolean value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Boolean value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Boolean value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Boolean value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Boolean> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Boolean> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Boolean value1, Boolean value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andReserveOrderIsNull() {
            addCriterion("reserve_order is null");
            return (Criteria) this;
        }

        public Criteria andReserveOrderIsNotNull() {
            addCriterion("reserve_order is not null");
            return (Criteria) this;
        }

        public Criteria andReserveOrderEqualTo(Boolean value) {
            addCriterion("reserve_order =", value, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderNotEqualTo(Boolean value) {
            addCriterion("reserve_order <>", value, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderGreaterThan(Boolean value) {
            addCriterion("reserve_order >", value, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("reserve_order >=", value, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderLessThan(Boolean value) {
            addCriterion("reserve_order <", value, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderLessThanOrEqualTo(Boolean value) {
            addCriterion("reserve_order <=", value, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderIn(List<Boolean> values) {
            addCriterion("reserve_order in", values, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderNotIn(List<Boolean> values) {
            addCriterion("reserve_order not in", values, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderBetween(Boolean value1, Boolean value2) {
            addCriterion("reserve_order between", value1, value2, "reserveOrder");
            return (Criteria) this;
        }

        public Criteria andReserveOrderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("reserve_order not between", value1, value2, "reserveOrder");
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

        public Criteria andRefundMoneyIsNull() {
            addCriterion("refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(BigDecimal value) {
            addCriterion("refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(BigDecimal value) {
            addCriterion("refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(BigDecimal value) {
            addCriterion("refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(BigDecimal value) {
            addCriterion("refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<BigDecimal> values) {
            addCriterion("refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<BigDecimal> values) {
            addCriterion("refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("refund_money not between", value1, value2, "refundMoney");
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

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyIsNull() {
            addCriterion("foreign_money is null");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyIsNotNull() {
            addCriterion("foreign_money is not null");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyEqualTo(BigDecimal value) {
            addCriterion("foreign_money =", value, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyNotEqualTo(BigDecimal value) {
            addCriterion("foreign_money <>", value, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyGreaterThan(BigDecimal value) {
            addCriterion("foreign_money >", value, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("foreign_money >=", value, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyLessThan(BigDecimal value) {
            addCriterion("foreign_money <", value, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("foreign_money <=", value, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyIn(List<BigDecimal> values) {
            addCriterion("foreign_money in", values, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyNotIn(List<BigDecimal> values) {
            addCriterion("foreign_money not in", values, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreign_money between", value1, value2, "foreignMoney");
            return (Criteria) this;
        }

        public Criteria andForeignMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("foreign_money not between", value1, value2, "foreignMoney");
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