package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtOrdersItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtOrdersItemExample() {
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

        public Criteria andOrderItemIdIsNull() {
            addCriterion("order_item_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("order_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("order_item_id =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("order_item_id <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("order_item_id >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_item_id >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("order_item_id <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_item_id <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("order_item_id in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("order_item_id not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_item_id not between", value1, value2, "orderItemId");
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

        public Criteria andProductSpecIdIsNull() {
            addCriterion("product_spec_id is null");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdIsNotNull() {
            addCriterion("product_spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdEqualTo(Integer value) {
            addCriterion("product_spec_id =", value, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdNotEqualTo(Integer value) {
            addCriterion("product_spec_id <>", value, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdGreaterThan(Integer value) {
            addCriterion("product_spec_id >", value, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_spec_id >=", value, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdLessThan(Integer value) {
            addCriterion("product_spec_id <", value, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_spec_id <=", value, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdIn(List<Integer> values) {
            addCriterion("product_spec_id in", values, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdNotIn(List<Integer> values) {
            addCriterion("product_spec_id not in", values, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("product_spec_id between", value1, value2, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andProductSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_spec_id not between", value1, value2, "productSpecId");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNull() {
            addCriterion("is_special is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIsNotNull() {
            addCriterion("is_special is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialEqualTo(Boolean value) {
            addCriterion("is_special =", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotEqualTo(Boolean value) {
            addCriterion("is_special <>", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThan(Boolean value) {
            addCriterion("is_special >", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_special >=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThan(Boolean value) {
            addCriterion("is_special <", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialLessThanOrEqualTo(Boolean value) {
            addCriterion("is_special <=", value, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialIn(List<Boolean> values) {
            addCriterion("is_special in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotIn(List<Boolean> values) {
            addCriterion("is_special not in", values, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialBetween(Boolean value1, Boolean value2) {
            addCriterion("is_special between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andIsSpecialNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_special not between", value1, value2, "isSpecial");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andSkuIsNull() {
            addCriterion("sku is null");
            return (Criteria) this;
        }

        public Criteria andSkuIsNotNull() {
            addCriterion("sku is not null");
            return (Criteria) this;
        }

        public Criteria andSkuEqualTo(String value) {
            addCriterion("sku =", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotEqualTo(String value) {
            addCriterion("sku <>", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThan(String value) {
            addCriterion("sku >", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuGreaterThanOrEqualTo(String value) {
            addCriterion("sku >=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThan(String value) {
            addCriterion("sku <", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLessThanOrEqualTo(String value) {
            addCriterion("sku <=", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuLike(String value) {
            addCriterion("sku like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotLike(String value) {
            addCriterion("sku not like", value, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuIn(List<String> values) {
            addCriterion("sku in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotIn(List<String> values) {
            addCriterion("sku not in", values, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuBetween(String value1, String value2) {
            addCriterion("sku between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andSkuNotBetween(String value1, String value2) {
            addCriterion("sku not between", value1, value2, "sku");
            return (Criteria) this;
        }

        public Criteria andColorTextIsNull() {
            addCriterion("color_text is null");
            return (Criteria) this;
        }

        public Criteria andColorTextIsNotNull() {
            addCriterion("color_text is not null");
            return (Criteria) this;
        }

        public Criteria andColorTextEqualTo(String value) {
            addCriterion("color_text =", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextNotEqualTo(String value) {
            addCriterion("color_text <>", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextGreaterThan(String value) {
            addCriterion("color_text >", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextGreaterThanOrEqualTo(String value) {
            addCriterion("color_text >=", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextLessThan(String value) {
            addCriterion("color_text <", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextLessThanOrEqualTo(String value) {
            addCriterion("color_text <=", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextLike(String value) {
            addCriterion("color_text like", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextNotLike(String value) {
            addCriterion("color_text not like", value, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextIn(List<String> values) {
            addCriterion("color_text in", values, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextNotIn(List<String> values) {
            addCriterion("color_text not in", values, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextBetween(String value1, String value2) {
            addCriterion("color_text between", value1, value2, "colorText");
            return (Criteria) this;
        }

        public Criteria andColorTextNotBetween(String value1, String value2) {
            addCriterion("color_text not between", value1, value2, "colorText");
            return (Criteria) this;
        }

        public Criteria andSpecValueIsNull() {
            addCriterion("spec_value is null");
            return (Criteria) this;
        }

        public Criteria andSpecValueIsNotNull() {
            addCriterion("spec_value is not null");
            return (Criteria) this;
        }

        public Criteria andSpecValueEqualTo(String value) {
            addCriterion("spec_value =", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotEqualTo(String value) {
            addCriterion("spec_value <>", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThan(String value) {
            addCriterion("spec_value >", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueGreaterThanOrEqualTo(String value) {
            addCriterion("spec_value >=", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThan(String value) {
            addCriterion("spec_value <", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLessThanOrEqualTo(String value) {
            addCriterion("spec_value <=", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueLike(String value) {
            addCriterion("spec_value like", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotLike(String value) {
            addCriterion("spec_value not like", value, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueIn(List<String> values) {
            addCriterion("spec_value in", values, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotIn(List<String> values) {
            addCriterion("spec_value not in", values, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueBetween(String value1, String value2) {
            addCriterion("spec_value between", value1, value2, "specValue");
            return (Criteria) this;
        }

        public Criteria andSpecValueNotBetween(String value1, String value2) {
            addCriterion("spec_value not between", value1, value2, "specValue");
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

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andZpPriceIsNull() {
            addCriterion("zp_price is null");
            return (Criteria) this;
        }

        public Criteria andZpPriceIsNotNull() {
            addCriterion("zp_price is not null");
            return (Criteria) this;
        }

        public Criteria andZpPriceEqualTo(BigDecimal value) {
            addCriterion("zp_price =", value, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceNotEqualTo(BigDecimal value) {
            addCriterion("zp_price <>", value, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceGreaterThan(BigDecimal value) {
            addCriterion("zp_price >", value, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("zp_price >=", value, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceLessThan(BigDecimal value) {
            addCriterion("zp_price <", value, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("zp_price <=", value, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceIn(List<BigDecimal> values) {
            addCriterion("zp_price in", values, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceNotIn(List<BigDecimal> values) {
            addCriterion("zp_price not in", values, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zp_price between", value1, value2, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andZpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("zp_price not between", value1, value2, "zpPrice");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeIsNull() {
            addCriterion("security_code is null");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeIsNotNull() {
            addCriterion("security_code is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeEqualTo(String value) {
            addCriterion("security_code =", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeNotEqualTo(String value) {
            addCriterion("security_code <>", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeGreaterThan(String value) {
            addCriterion("security_code >", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("security_code >=", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeLessThan(String value) {
            addCriterion("security_code <", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeLessThanOrEqualTo(String value) {
            addCriterion("security_code <=", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeLike(String value) {
            addCriterion("security_code like", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeNotLike(String value) {
            addCriterion("security_code not like", value, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeIn(List<String> values) {
            addCriterion("security_code in", values, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeNotIn(List<String> values) {
            addCriterion("security_code not in", values, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeBetween(String value1, String value2) {
            addCriterion("security_code between", value1, value2, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSecurityCodeNotBetween(String value1, String value2) {
            addCriterion("security_code not between", value1, value2, "securityCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeIsNull() {
            addCriterion("sell_code is null");
            return (Criteria) this;
        }

        public Criteria andSellCodeIsNotNull() {
            addCriterion("sell_code is not null");
            return (Criteria) this;
        }

        public Criteria andSellCodeEqualTo(String value) {
            addCriterion("sell_code =", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeNotEqualTo(String value) {
            addCriterion("sell_code <>", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeGreaterThan(String value) {
            addCriterion("sell_code >", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_code >=", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeLessThan(String value) {
            addCriterion("sell_code <", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeLessThanOrEqualTo(String value) {
            addCriterion("sell_code <=", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeLike(String value) {
            addCriterion("sell_code like", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeNotLike(String value) {
            addCriterion("sell_code not like", value, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeIn(List<String> values) {
            addCriterion("sell_code in", values, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeNotIn(List<String> values) {
            addCriterion("sell_code not in", values, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeBetween(String value1, String value2) {
            addCriterion("sell_code between", value1, value2, "sellCode");
            return (Criteria) this;
        }

        public Criteria andSellCodeNotBetween(String value1, String value2) {
            addCriterion("sell_code not between", value1, value2, "sellCode");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNull() {
            addCriterion("discount_rate is null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIsNotNull() {
            addCriterion("discount_rate is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountRateEqualTo(Integer value) {
            addCriterion("discount_rate =", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotEqualTo(Integer value) {
            addCriterion("discount_rate <>", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThan(Integer value) {
            addCriterion("discount_rate >", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_rate >=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThan(Integer value) {
            addCriterion("discount_rate <", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateLessThanOrEqualTo(Integer value) {
            addCriterion("discount_rate <=", value, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateIn(List<Integer> values) {
            addCriterion("discount_rate in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotIn(List<Integer> values) {
            addCriterion("discount_rate not in", values, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateBetween(Integer value1, Integer value2) {
            addCriterion("discount_rate between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andDiscountRateNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_rate not between", value1, value2, "discountRate");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityIsNull() {
            addCriterion("refund_quantity is null");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityIsNotNull() {
            addCriterion("refund_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityEqualTo(Integer value) {
            addCriterion("refund_quantity =", value, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityNotEqualTo(Integer value) {
            addCriterion("refund_quantity <>", value, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityGreaterThan(Integer value) {
            addCriterion("refund_quantity >", value, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("refund_quantity >=", value, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityLessThan(Integer value) {
            addCriterion("refund_quantity <", value, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("refund_quantity <=", value, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityIn(List<Integer> values) {
            addCriterion("refund_quantity in", values, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityNotIn(List<Integer> values) {
            addCriterion("refund_quantity not in", values, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityBetween(Integer value1, Integer value2) {
            addCriterion("refund_quantity between", value1, value2, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRefundQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("refund_quantity not between", value1, value2, "refundQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityIsNull() {
            addCriterion("rejection_quantity is null");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityIsNotNull() {
            addCriterion("rejection_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityEqualTo(Integer value) {
            addCriterion("rejection_quantity =", value, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityNotEqualTo(Integer value) {
            addCriterion("rejection_quantity <>", value, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityGreaterThan(Integer value) {
            addCriterion("rejection_quantity >", value, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("rejection_quantity >=", value, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityLessThan(Integer value) {
            addCriterion("rejection_quantity <", value, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("rejection_quantity <=", value, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityIn(List<Integer> values) {
            addCriterion("rejection_quantity in", values, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityNotIn(List<Integer> values) {
            addCriterion("rejection_quantity not in", values, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityBetween(Integer value1, Integer value2) {
            addCriterion("rejection_quantity between", value1, value2, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andRejectionQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("rejection_quantity not between", value1, value2, "rejectionQuantity");
            return (Criteria) this;
        }

        public Criteria andIsShoworderIsNull() {
            addCriterion("is_showorder is null");
            return (Criteria) this;
        }

        public Criteria andIsShoworderIsNotNull() {
            addCriterion("is_showorder is not null");
            return (Criteria) this;
        }

        public Criteria andIsShoworderEqualTo(Boolean value) {
            addCriterion("is_showorder =", value, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderNotEqualTo(Boolean value) {
            addCriterion("is_showorder <>", value, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderGreaterThan(Boolean value) {
            addCriterion("is_showorder >", value, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_showorder >=", value, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderLessThan(Boolean value) {
            addCriterion("is_showorder <", value, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderLessThanOrEqualTo(Boolean value) {
            addCriterion("is_showorder <=", value, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderIn(List<Boolean> values) {
            addCriterion("is_showorder in", values, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderNotIn(List<Boolean> values) {
            addCriterion("is_showorder not in", values, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderBetween(Boolean value1, Boolean value2) {
            addCriterion("is_showorder between", value1, value2, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsShoworderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_showorder not between", value1, value2, "isShoworder");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateIsNull() {
            addCriterion("is_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateIsNotNull() {
            addCriterion("is_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateEqualTo(Boolean value) {
            addCriterion("is_evaluate =", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateNotEqualTo(Boolean value) {
            addCriterion("is_evaluate <>", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateGreaterThan(Boolean value) {
            addCriterion("is_evaluate >", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_evaluate >=", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateLessThan(Boolean value) {
            addCriterion("is_evaluate <", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateLessThanOrEqualTo(Boolean value) {
            addCriterion("is_evaluate <=", value, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateIn(List<Boolean> values) {
            addCriterion("is_evaluate in", values, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateNotIn(List<Boolean> values) {
            addCriterion("is_evaluate not in", values, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateBetween(Boolean value1, Boolean value2) {
            addCriterion("is_evaluate between", value1, value2, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andIsEvaluateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_evaluate not between", value1, value2, "isEvaluate");
            return (Criteria) this;
        }

        public Criteria andDishonourNumIsNull() {
            addCriterion("dishonour_num is null");
            return (Criteria) this;
        }

        public Criteria andDishonourNumIsNotNull() {
            addCriterion("dishonour_num is not null");
            return (Criteria) this;
        }

        public Criteria andDishonourNumEqualTo(Integer value) {
            addCriterion("dishonour_num =", value, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumNotEqualTo(Integer value) {
            addCriterion("dishonour_num <>", value, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumGreaterThan(Integer value) {
            addCriterion("dishonour_num >", value, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dishonour_num >=", value, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumLessThan(Integer value) {
            addCriterion("dishonour_num <", value, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumLessThanOrEqualTo(Integer value) {
            addCriterion("dishonour_num <=", value, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumIn(List<Integer> values) {
            addCriterion("dishonour_num in", values, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumNotIn(List<Integer> values) {
            addCriterion("dishonour_num not in", values, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumBetween(Integer value1, Integer value2) {
            addCriterion("dishonour_num between", value1, value2, "dishonourNum");
            return (Criteria) this;
        }

        public Criteria andDishonourNumNotBetween(Integer value1, Integer value2) {
            addCriterion("dishonour_num not between", value1, value2, "dishonourNum");
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

        public Criteria andItemStatusIsNull() {
            addCriterion("item_status is null");
            return (Criteria) this;
        }

        public Criteria andItemStatusIsNotNull() {
            addCriterion("item_status is not null");
            return (Criteria) this;
        }

        public Criteria andItemStatusEqualTo(Boolean value) {
            addCriterion("item_status =", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotEqualTo(Boolean value) {
            addCriterion("item_status <>", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThan(Boolean value) {
            addCriterion("item_status >", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("item_status >=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThan(Boolean value) {
            addCriterion("item_status <", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("item_status <=", value, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusIn(List<Boolean> values) {
            addCriterion("item_status in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotIn(List<Boolean> values) {
            addCriterion("item_status not in", values, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("item_status between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andItemStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("item_status not between", value1, value2, "itemStatus");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityIsNull() {
            addCriterion("exchange_quantity is null");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityIsNotNull() {
            addCriterion("exchange_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityEqualTo(Integer value) {
            addCriterion("exchange_quantity =", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityNotEqualTo(Integer value) {
            addCriterion("exchange_quantity <>", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityGreaterThan(Integer value) {
            addCriterion("exchange_quantity >", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchange_quantity >=", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityLessThan(Integer value) {
            addCriterion("exchange_quantity <", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("exchange_quantity <=", value, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityIn(List<Integer> values) {
            addCriterion("exchange_quantity in", values, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityNotIn(List<Integer> values) {
            addCriterion("exchange_quantity not in", values, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityBetween(Integer value1, Integer value2) {
            addCriterion("exchange_quantity between", value1, value2, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andExchangeQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("exchange_quantity not between", value1, value2, "exchangeQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityIsNull() {
            addCriterion("cancel_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityIsNotNull() {
            addCriterion("cancel_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityEqualTo(Integer value) {
            addCriterion("cancel_quantity =", value, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityNotEqualTo(Integer value) {
            addCriterion("cancel_quantity <>", value, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityGreaterThan(Integer value) {
            addCriterion("cancel_quantity >", value, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_quantity >=", value, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityLessThan(Integer value) {
            addCriterion("cancel_quantity <", value, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_quantity <=", value, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityIn(List<Integer> values) {
            addCriterion("cancel_quantity in", values, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityNotIn(List<Integer> values) {
            addCriterion("cancel_quantity not in", values, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityBetween(Integer value1, Integer value2) {
            addCriterion("cancel_quantity between", value1, value2, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andCancelQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_quantity not between", value1, value2, "cancelQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityIsNull() {
            addCriterion("delivery_quantity is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityIsNotNull() {
            addCriterion("delivery_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityEqualTo(Integer value) {
            addCriterion("delivery_quantity =", value, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityNotEqualTo(Integer value) {
            addCriterion("delivery_quantity <>", value, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityGreaterThan(Integer value) {
            addCriterion("delivery_quantity >", value, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_quantity >=", value, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityLessThan(Integer value) {
            addCriterion("delivery_quantity <", value, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_quantity <=", value, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityIn(List<Integer> values) {
            addCriterion("delivery_quantity in", values, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityNotIn(List<Integer> values) {
            addCriterion("delivery_quantity not in", values, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityBetween(Integer value1, Integer value2) {
            addCriterion("delivery_quantity between", value1, value2, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_quantity not between", value1, value2, "deliveryQuantity");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyIsNull() {
            addCriterion("delivery_money is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyIsNotNull() {
            addCriterion("delivery_money is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyEqualTo(BigDecimal value) {
            addCriterion("delivery_money =", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyNotEqualTo(BigDecimal value) {
            addCriterion("delivery_money <>", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyGreaterThan(BigDecimal value) {
            addCriterion("delivery_money >", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_money >=", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyLessThan(BigDecimal value) {
            addCriterion("delivery_money <", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("delivery_money <=", value, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyIn(List<BigDecimal> values) {
            addCriterion("delivery_money in", values, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyNotIn(List<BigDecimal> values) {
            addCriterion("delivery_money not in", values, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_money between", value1, value2, "deliveryMoney");
            return (Criteria) this;
        }

        public Criteria andDeliveryMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("delivery_money not between", value1, value2, "deliveryMoney");
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

        public Criteria andExchangeMoneyIsNull() {
            addCriterion("exchange_money is null");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyIsNotNull() {
            addCriterion("exchange_money is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyEqualTo(BigDecimal value) {
            addCriterion("exchange_money =", value, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("exchange_money <>", value, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyGreaterThan(BigDecimal value) {
            addCriterion("exchange_money >", value, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_money >=", value, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyLessThan(BigDecimal value) {
            addCriterion("exchange_money <", value, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_money <=", value, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyIn(List<BigDecimal> values) {
            addCriterion("exchange_money in", values, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("exchange_money not in", values, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_money between", value1, value2, "exchangeMoney");
            return (Criteria) this;
        }

        public Criteria andExchangeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_money not between", value1, value2, "exchangeMoney");
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