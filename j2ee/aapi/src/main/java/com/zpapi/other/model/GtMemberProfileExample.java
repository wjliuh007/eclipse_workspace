package com.zpapi.other.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GtMemberProfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GtMemberProfileExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andCurLevelIsNull() {
            addCriterion("cur_level is null");
            return (Criteria) this;
        }

        public Criteria andCurLevelIsNotNull() {
            addCriterion("cur_level is not null");
            return (Criteria) this;
        }

        public Criteria andCurLevelEqualTo(Integer value) {
            addCriterion("cur_level =", value, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelNotEqualTo(Integer value) {
            addCriterion("cur_level <>", value, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelGreaterThan(Integer value) {
            addCriterion("cur_level >", value, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("cur_level >=", value, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelLessThan(Integer value) {
            addCriterion("cur_level <", value, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelLessThanOrEqualTo(Integer value) {
            addCriterion("cur_level <=", value, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelIn(List<Integer> values) {
            addCriterion("cur_level in", values, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelNotIn(List<Integer> values) {
            addCriterion("cur_level not in", values, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelBetween(Integer value1, Integer value2) {
            addCriterion("cur_level between", value1, value2, "curLevel");
            return (Criteria) this;
        }

        public Criteria andCurLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("cur_level not between", value1, value2, "curLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelIsNull() {
            addCriterion("top_level is null");
            return (Criteria) this;
        }

        public Criteria andTopLevelIsNotNull() {
            addCriterion("top_level is not null");
            return (Criteria) this;
        }

        public Criteria andTopLevelEqualTo(Integer value) {
            addCriterion("top_level =", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelNotEqualTo(Integer value) {
            addCriterion("top_level <>", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelGreaterThan(Integer value) {
            addCriterion("top_level >", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("top_level >=", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelLessThan(Integer value) {
            addCriterion("top_level <", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelLessThanOrEqualTo(Integer value) {
            addCriterion("top_level <=", value, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelIn(List<Integer> values) {
            addCriterion("top_level in", values, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelNotIn(List<Integer> values) {
            addCriterion("top_level not in", values, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelBetween(Integer value1, Integer value2) {
            addCriterion("top_level between", value1, value2, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTopLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("top_level not between", value1, value2, "topLevel");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionIsNull() {
            addCriterion("total_consumption is null");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionIsNotNull() {
            addCriterion("total_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionEqualTo(Integer value) {
            addCriterion("total_consumption =", value, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionNotEqualTo(Integer value) {
            addCriterion("total_consumption <>", value, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionGreaterThan(Integer value) {
            addCriterion("total_consumption >", value, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_consumption >=", value, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionLessThan(Integer value) {
            addCriterion("total_consumption <", value, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionLessThanOrEqualTo(Integer value) {
            addCriterion("total_consumption <=", value, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionIn(List<Integer> values) {
            addCriterion("total_consumption in", values, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionNotIn(List<Integer> values) {
            addCriterion("total_consumption not in", values, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionBetween(Integer value1, Integer value2) {
            addCriterion("total_consumption between", value1, value2, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andTotalConsumptionNotBetween(Integer value1, Integer value2) {
            addCriterion("total_consumption not between", value1, value2, "totalConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionIsNull() {
            addCriterion("active_consumption is null");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionIsNotNull() {
            addCriterion("active_consumption is not null");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionEqualTo(Integer value) {
            addCriterion("active_consumption =", value, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionNotEqualTo(Integer value) {
            addCriterion("active_consumption <>", value, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionGreaterThan(Integer value) {
            addCriterion("active_consumption >", value, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_consumption >=", value, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionLessThan(Integer value) {
            addCriterion("active_consumption <", value, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionLessThanOrEqualTo(Integer value) {
            addCriterion("active_consumption <=", value, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionIn(List<Integer> values) {
            addCriterion("active_consumption in", values, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionNotIn(List<Integer> values) {
            addCriterion("active_consumption not in", values, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionBetween(Integer value1, Integer value2) {
            addCriterion("active_consumption between", value1, value2, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveConsumptionNotBetween(Integer value1, Integer value2) {
            addCriterion("active_consumption not between", value1, value2, "activeConsumption");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumIsNull() {
            addCriterion("active_order_num is null");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumIsNotNull() {
            addCriterion("active_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumEqualTo(Integer value) {
            addCriterion("active_order_num =", value, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumNotEqualTo(Integer value) {
            addCriterion("active_order_num <>", value, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumGreaterThan(Integer value) {
            addCriterion("active_order_num >", value, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_order_num >=", value, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumLessThan(Integer value) {
            addCriterion("active_order_num <", value, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("active_order_num <=", value, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumIn(List<Integer> values) {
            addCriterion("active_order_num in", values, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumNotIn(List<Integer> values) {
            addCriterion("active_order_num not in", values, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("active_order_num between", value1, value2, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andActiveOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("active_order_num not between", value1, value2, "activeOrderNum");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveIsNull() {
            addCriterion("email_is_noneffective is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveIsNotNull() {
            addCriterion("email_is_noneffective is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveEqualTo(Boolean value) {
            addCriterion("email_is_noneffective =", value, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveNotEqualTo(Boolean value) {
            addCriterion("email_is_noneffective <>", value, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveGreaterThan(Boolean value) {
            addCriterion("email_is_noneffective >", value, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_is_noneffective >=", value, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveLessThan(Boolean value) {
            addCriterion("email_is_noneffective <", value, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveLessThanOrEqualTo(Boolean value) {
            addCriterion("email_is_noneffective <=", value, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveIn(List<Boolean> values) {
            addCriterion("email_is_noneffective in", values, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveNotIn(List<Boolean> values) {
            addCriterion("email_is_noneffective not in", values, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveBetween(Boolean value1, Boolean value2) {
            addCriterion("email_is_noneffective between", value1, value2, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailIsNoneffectiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_is_noneffective not between", value1, value2, "emailIsNoneffective");
            return (Criteria) this;
        }

        public Criteria andEmailCheckIsNull() {
            addCriterion("email_check is null");
            return (Criteria) this;
        }

        public Criteria andEmailCheckIsNotNull() {
            addCriterion("email_check is not null");
            return (Criteria) this;
        }

        public Criteria andEmailCheckEqualTo(Boolean value) {
            addCriterion("email_check =", value, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckNotEqualTo(Boolean value) {
            addCriterion("email_check <>", value, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckGreaterThan(Boolean value) {
            addCriterion("email_check >", value, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_check >=", value, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckLessThan(Boolean value) {
            addCriterion("email_check <", value, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("email_check <=", value, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckIn(List<Boolean> values) {
            addCriterion("email_check in", values, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckNotIn(List<Boolean> values) {
            addCriterion("email_check not in", values, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("email_check between", value1, value2, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andEmailCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_check not between", value1, value2, "emailCheck");
            return (Criteria) this;
        }

        public Criteria andCheckSaltIsNull() {
            addCriterion("check_salt is null");
            return (Criteria) this;
        }

        public Criteria andCheckSaltIsNotNull() {
            addCriterion("check_salt is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSaltEqualTo(String value) {
            addCriterion("check_salt =", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltNotEqualTo(String value) {
            addCriterion("check_salt <>", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltGreaterThan(String value) {
            addCriterion("check_salt >", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltGreaterThanOrEqualTo(String value) {
            addCriterion("check_salt >=", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltLessThan(String value) {
            addCriterion("check_salt <", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltLessThanOrEqualTo(String value) {
            addCriterion("check_salt <=", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltLike(String value) {
            addCriterion("check_salt like", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltNotLike(String value) {
            addCriterion("check_salt not like", value, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltIn(List<String> values) {
            addCriterion("check_salt in", values, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltNotIn(List<String> values) {
            addCriterion("check_salt not in", values, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltBetween(String value1, String value2) {
            addCriterion("check_salt between", value1, value2, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andCheckSaltNotBetween(String value1, String value2) {
            addCriterion("check_salt not between", value1, value2, "checkSalt");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeIsNull() {
            addCriterion("salt_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeIsNotNull() {
            addCriterion("salt_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeEqualTo(Integer value) {
            addCriterion("salt_create_time =", value, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeNotEqualTo(Integer value) {
            addCriterion("salt_create_time <>", value, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeGreaterThan(Integer value) {
            addCriterion("salt_create_time >", value, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("salt_create_time >=", value, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeLessThan(Integer value) {
            addCriterion("salt_create_time <", value, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("salt_create_time <=", value, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeIn(List<Integer> values) {
            addCriterion("salt_create_time in", values, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeNotIn(List<Integer> values) {
            addCriterion("salt_create_time not in", values, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeBetween(Integer value1, Integer value2) {
            addCriterion("salt_create_time between", value1, value2, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andSaltCreateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("salt_create_time not between", value1, value2, "saltCreateTime");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNull() {
            addCriterion("receive_email is null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNotNull() {
            addCriterion("receive_email is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailEqualTo(Boolean value) {
            addCriterion("receive_email =", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotEqualTo(Boolean value) {
            addCriterion("receive_email <>", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThan(Boolean value) {
            addCriterion("receive_email >", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThanOrEqualTo(Boolean value) {
            addCriterion("receive_email >=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThan(Boolean value) {
            addCriterion("receive_email <", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThanOrEqualTo(Boolean value) {
            addCriterion("receive_email <=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIn(List<Boolean> values) {
            addCriterion("receive_email in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotIn(List<Boolean> values) {
            addCriterion("receive_email not in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailBetween(Boolean value1, Boolean value2) {
            addCriterion("receive_email between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotBetween(Boolean value1, Boolean value2) {
            addCriterion("receive_email not between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAvaterIsNull() {
            addCriterion("avater is null");
            return (Criteria) this;
        }

        public Criteria andAvaterIsNotNull() {
            addCriterion("avater is not null");
            return (Criteria) this;
        }

        public Criteria andAvaterEqualTo(String value) {
            addCriterion("avater =", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterNotEqualTo(String value) {
            addCriterion("avater <>", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterGreaterThan(String value) {
            addCriterion("avater >", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterGreaterThanOrEqualTo(String value) {
            addCriterion("avater >=", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterLessThan(String value) {
            addCriterion("avater <", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterLessThanOrEqualTo(String value) {
            addCriterion("avater <=", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterLike(String value) {
            addCriterion("avater like", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterNotLike(String value) {
            addCriterion("avater not like", value, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterIn(List<String> values) {
            addCriterion("avater in", values, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterNotIn(List<String> values) {
            addCriterion("avater not in", values, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterBetween(String value1, String value2) {
            addCriterion("avater between", value1, value2, "avater");
            return (Criteria) this;
        }

        public Criteria andAvaterNotBetween(String value1, String value2) {
            addCriterion("avater not between", value1, value2, "avater");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Integer value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Integer value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Integer value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Integer value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Integer> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Integer> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andAdvisIdIsNull() {
            addCriterion("advis_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvisIdIsNotNull() {
            addCriterion("advis_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvisIdEqualTo(Integer value) {
            addCriterion("advis_id =", value, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdNotEqualTo(Integer value) {
            addCriterion("advis_id <>", value, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdGreaterThan(Integer value) {
            addCriterion("advis_id >", value, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("advis_id >=", value, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdLessThan(Integer value) {
            addCriterion("advis_id <", value, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdLessThanOrEqualTo(Integer value) {
            addCriterion("advis_id <=", value, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdIn(List<Integer> values) {
            addCriterion("advis_id in", values, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdNotIn(List<Integer> values) {
            addCriterion("advis_id not in", values, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdBetween(Integer value1, Integer value2) {
            addCriterion("advis_id between", value1, value2, "advisId");
            return (Criteria) this;
        }

        public Criteria andAdvisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("advis_id not between", value1, value2, "advisId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idcard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idcard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idcard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idcard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idcard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idcard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idcard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idcard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idcard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idcard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idcard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idcard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idcard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Integer value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Integer value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Integer value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Integer value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Integer> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Integer> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNull() {
            addCriterion("vip_type is null");
            return (Criteria) this;
        }

        public Criteria andVipTypeIsNotNull() {
            addCriterion("vip_type is not null");
            return (Criteria) this;
        }

        public Criteria andVipTypeEqualTo(String value) {
            addCriterion("vip_type =", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotEqualTo(String value) {
            addCriterion("vip_type <>", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThan(String value) {
            addCriterion("vip_type >", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("vip_type >=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThan(String value) {
            addCriterion("vip_type <", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLessThanOrEqualTo(String value) {
            addCriterion("vip_type <=", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeLike(String value) {
            addCriterion("vip_type like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotLike(String value) {
            addCriterion("vip_type not like", value, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeIn(List<String> values) {
            addCriterion("vip_type in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotIn(List<String> values) {
            addCriterion("vip_type not in", values, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeBetween(String value1, String value2) {
            addCriterion("vip_type between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andVipTypeNotBetween(String value1, String value2) {
            addCriterion("vip_type not between", value1, value2, "vipType");
            return (Criteria) this;
        }

        public Criteria andFixBalanceIsNull() {
            addCriterion("fix_balance is null");
            return (Criteria) this;
        }

        public Criteria andFixBalanceIsNotNull() {
            addCriterion("fix_balance is not null");
            return (Criteria) this;
        }

        public Criteria andFixBalanceEqualTo(BigDecimal value) {
            addCriterion("fix_balance =", value, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceNotEqualTo(BigDecimal value) {
            addCriterion("fix_balance <>", value, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceGreaterThan(BigDecimal value) {
            addCriterion("fix_balance >", value, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fix_balance >=", value, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceLessThan(BigDecimal value) {
            addCriterion("fix_balance <", value, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fix_balance <=", value, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceIn(List<BigDecimal> values) {
            addCriterion("fix_balance in", values, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceNotIn(List<BigDecimal> values) {
            addCriterion("fix_balance not in", values, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fix_balance between", value1, value2, "fixBalance");
            return (Criteria) this;
        }

        public Criteria andFixBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fix_balance not between", value1, value2, "fixBalance");
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

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(BigDecimal value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(BigDecimal value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(BigDecimal value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(BigDecimal value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<BigDecimal> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<BigDecimal> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andGiftsIsNull() {
            addCriterion("gifts is null");
            return (Criteria) this;
        }

        public Criteria andGiftsIsNotNull() {
            addCriterion("gifts is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsEqualTo(BigDecimal value) {
            addCriterion("gifts =", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotEqualTo(BigDecimal value) {
            addCriterion("gifts <>", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsGreaterThan(BigDecimal value) {
            addCriterion("gifts >", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("gifts >=", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsLessThan(BigDecimal value) {
            addCriterion("gifts <", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("gifts <=", value, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsIn(List<BigDecimal> values) {
            addCriterion("gifts in", values, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotIn(List<BigDecimal> values) {
            addCriterion("gifts not in", values, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gifts between", value1, value2, "gifts");
            return (Criteria) this;
        }

        public Criteria andGiftsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("gifts not between", value1, value2, "gifts");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesIsNull() {
            addCriterion("consume_times is null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesIsNotNull() {
            addCriterion("consume_times is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesEqualTo(Integer value) {
            addCriterion("consume_times =", value, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesNotEqualTo(Integer value) {
            addCriterion("consume_times <>", value, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesGreaterThan(Integer value) {
            addCriterion("consume_times >", value, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("consume_times >=", value, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesLessThan(Integer value) {
            addCriterion("consume_times <", value, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("consume_times <=", value, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesIn(List<Integer> values) {
            addCriterion("consume_times in", values, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesNotIn(List<Integer> values) {
            addCriterion("consume_times not in", values, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesBetween(Integer value1, Integer value2) {
            addCriterion("consume_times between", value1, value2, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andConsumeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("consume_times not between", value1, value2, "consumeTimes");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIsNull() {
            addCriterion("is_recharge is null");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIsNotNull() {
            addCriterion("is_recharge is not null");
            return (Criteria) this;
        }

        public Criteria andIsRechargeEqualTo(Integer value) {
            addCriterion("is_recharge =", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotEqualTo(Integer value) {
            addCriterion("is_recharge <>", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeGreaterThan(Integer value) {
            addCriterion("is_recharge >", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_recharge >=", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLessThan(Integer value) {
            addCriterion("is_recharge <", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeLessThanOrEqualTo(Integer value) {
            addCriterion("is_recharge <=", value, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeIn(List<Integer> values) {
            addCriterion("is_recharge in", values, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotIn(List<Integer> values) {
            addCriterion("is_recharge not in", values, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeBetween(Integer value1, Integer value2) {
            addCriterion("is_recharge between", value1, value2, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andIsRechargeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_recharge not between", value1, value2, "isRecharge");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(String value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(String value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(String value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(String value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(String value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLike(String value) {
            addCriterion("income like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotLike(String value) {
            addCriterion("income not like", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<String> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<String> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(String value1, String value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(String value1, String value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andMsnIsNull() {
            addCriterion("msn is null");
            return (Criteria) this;
        }

        public Criteria andMsnIsNotNull() {
            addCriterion("msn is not null");
            return (Criteria) this;
        }

        public Criteria andMsnEqualTo(String value) {
            addCriterion("msn =", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotEqualTo(String value) {
            addCriterion("msn <>", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThan(String value) {
            addCriterion("msn >", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnGreaterThanOrEqualTo(String value) {
            addCriterion("msn >=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThan(String value) {
            addCriterion("msn <", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLessThanOrEqualTo(String value) {
            addCriterion("msn <=", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnLike(String value) {
            addCriterion("msn like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotLike(String value) {
            addCriterion("msn not like", value, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnIn(List<String> values) {
            addCriterion("msn in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotIn(List<String> values) {
            addCriterion("msn not in", values, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnBetween(String value1, String value2) {
            addCriterion("msn between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andMsnNotBetween(String value1, String value2) {
            addCriterion("msn not between", value1, value2, "msn");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andChestIsNull() {
            addCriterion("chest is null");
            return (Criteria) this;
        }

        public Criteria andChestIsNotNull() {
            addCriterion("chest is not null");
            return (Criteria) this;
        }

        public Criteria andChestEqualTo(Integer value) {
            addCriterion("chest =", value, "chest");
            return (Criteria) this;
        }

        public Criteria andChestNotEqualTo(Integer value) {
            addCriterion("chest <>", value, "chest");
            return (Criteria) this;
        }

        public Criteria andChestGreaterThan(Integer value) {
            addCriterion("chest >", value, "chest");
            return (Criteria) this;
        }

        public Criteria andChestGreaterThanOrEqualTo(Integer value) {
            addCriterion("chest >=", value, "chest");
            return (Criteria) this;
        }

        public Criteria andChestLessThan(Integer value) {
            addCriterion("chest <", value, "chest");
            return (Criteria) this;
        }

        public Criteria andChestLessThanOrEqualTo(Integer value) {
            addCriterion("chest <=", value, "chest");
            return (Criteria) this;
        }

        public Criteria andChestIn(List<Integer> values) {
            addCriterion("chest in", values, "chest");
            return (Criteria) this;
        }

        public Criteria andChestNotIn(List<Integer> values) {
            addCriterion("chest not in", values, "chest");
            return (Criteria) this;
        }

        public Criteria andChestBetween(Integer value1, Integer value2) {
            addCriterion("chest between", value1, value2, "chest");
            return (Criteria) this;
        }

        public Criteria andChestNotBetween(Integer value1, Integer value2) {
            addCriterion("chest not between", value1, value2, "chest");
            return (Criteria) this;
        }

        public Criteria andWaistIsNull() {
            addCriterion("waist is null");
            return (Criteria) this;
        }

        public Criteria andWaistIsNotNull() {
            addCriterion("waist is not null");
            return (Criteria) this;
        }

        public Criteria andWaistEqualTo(Integer value) {
            addCriterion("waist =", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistNotEqualTo(Integer value) {
            addCriterion("waist <>", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistGreaterThan(Integer value) {
            addCriterion("waist >", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistGreaterThanOrEqualTo(Integer value) {
            addCriterion("waist >=", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistLessThan(Integer value) {
            addCriterion("waist <", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistLessThanOrEqualTo(Integer value) {
            addCriterion("waist <=", value, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistIn(List<Integer> values) {
            addCriterion("waist in", values, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistNotIn(List<Integer> values) {
            addCriterion("waist not in", values, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistBetween(Integer value1, Integer value2) {
            addCriterion("waist between", value1, value2, "waist");
            return (Criteria) this;
        }

        public Criteria andWaistNotBetween(Integer value1, Integer value2) {
            addCriterion("waist not between", value1, value2, "waist");
            return (Criteria) this;
        }

        public Criteria andHipIsNull() {
            addCriterion("hip is null");
            return (Criteria) this;
        }

        public Criteria andHipIsNotNull() {
            addCriterion("hip is not null");
            return (Criteria) this;
        }

        public Criteria andHipEqualTo(Integer value) {
            addCriterion("hip =", value, "hip");
            return (Criteria) this;
        }

        public Criteria andHipNotEqualTo(Integer value) {
            addCriterion("hip <>", value, "hip");
            return (Criteria) this;
        }

        public Criteria andHipGreaterThan(Integer value) {
            addCriterion("hip >", value, "hip");
            return (Criteria) this;
        }

        public Criteria andHipGreaterThanOrEqualTo(Integer value) {
            addCriterion("hip >=", value, "hip");
            return (Criteria) this;
        }

        public Criteria andHipLessThan(Integer value) {
            addCriterion("hip <", value, "hip");
            return (Criteria) this;
        }

        public Criteria andHipLessThanOrEqualTo(Integer value) {
            addCriterion("hip <=", value, "hip");
            return (Criteria) this;
        }

        public Criteria andHipIn(List<Integer> values) {
            addCriterion("hip in", values, "hip");
            return (Criteria) this;
        }

        public Criteria andHipNotIn(List<Integer> values) {
            addCriterion("hip not in", values, "hip");
            return (Criteria) this;
        }

        public Criteria andHipBetween(Integer value1, Integer value2) {
            addCriterion("hip between", value1, value2, "hip");
            return (Criteria) this;
        }

        public Criteria andHipNotBetween(Integer value1, Integer value2) {
            addCriterion("hip not between", value1, value2, "hip");
            return (Criteria) this;
        }

        public Criteria andShoeSizeIsNull() {
            addCriterion("shoe_size is null");
            return (Criteria) this;
        }

        public Criteria andShoeSizeIsNotNull() {
            addCriterion("shoe_size is not null");
            return (Criteria) this;
        }

        public Criteria andShoeSizeEqualTo(Integer value) {
            addCriterion("shoe_size =", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotEqualTo(Integer value) {
            addCriterion("shoe_size <>", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeGreaterThan(Integer value) {
            addCriterion("shoe_size >", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shoe_size >=", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeLessThan(Integer value) {
            addCriterion("shoe_size <", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeLessThanOrEqualTo(Integer value) {
            addCriterion("shoe_size <=", value, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeIn(List<Integer> values) {
            addCriterion("shoe_size in", values, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotIn(List<Integer> values) {
            addCriterion("shoe_size not in", values, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeBetween(Integer value1, Integer value2) {
            addCriterion("shoe_size between", value1, value2, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andShoeSizeNotBetween(Integer value1, Integer value2) {
            addCriterion("shoe_size not between", value1, value2, "shoeSize");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdIsNull() {
            addCriterion("live_province_region_id is null");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdIsNotNull() {
            addCriterion("live_province_region_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdEqualTo(Integer value) {
            addCriterion("live_province_region_id =", value, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdNotEqualTo(Integer value) {
            addCriterion("live_province_region_id <>", value, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdGreaterThan(Integer value) {
            addCriterion("live_province_region_id >", value, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_province_region_id >=", value, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdLessThan(Integer value) {
            addCriterion("live_province_region_id <", value, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("live_province_region_id <=", value, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdIn(List<Integer> values) {
            addCriterion("live_province_region_id in", values, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdNotIn(List<Integer> values) {
            addCriterion("live_province_region_id not in", values, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("live_province_region_id between", value1, value2, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveProvinceRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("live_province_region_id not between", value1, value2, "liveProvinceRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdIsNull() {
            addCriterion("live_city_region_id is null");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdIsNotNull() {
            addCriterion("live_city_region_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdEqualTo(Integer value) {
            addCriterion("live_city_region_id =", value, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdNotEqualTo(Integer value) {
            addCriterion("live_city_region_id <>", value, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdGreaterThan(Integer value) {
            addCriterion("live_city_region_id >", value, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_city_region_id >=", value, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdLessThan(Integer value) {
            addCriterion("live_city_region_id <", value, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("live_city_region_id <=", value, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdIn(List<Integer> values) {
            addCriterion("live_city_region_id in", values, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdNotIn(List<Integer> values) {
            addCriterion("live_city_region_id not in", values, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("live_city_region_id between", value1, value2, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveCityRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("live_city_region_id not between", value1, value2, "liveCityRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdIsNull() {
            addCriterion("live_town_region_id is null");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdIsNotNull() {
            addCriterion("live_town_region_id is not null");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdEqualTo(Integer value) {
            addCriterion("live_town_region_id =", value, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdNotEqualTo(Integer value) {
            addCriterion("live_town_region_id <>", value, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdGreaterThan(Integer value) {
            addCriterion("live_town_region_id >", value, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("live_town_region_id >=", value, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdLessThan(Integer value) {
            addCriterion("live_town_region_id <", value, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("live_town_region_id <=", value, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdIn(List<Integer> values) {
            addCriterion("live_town_region_id in", values, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdNotIn(List<Integer> values) {
            addCriterion("live_town_region_id not in", values, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("live_town_region_id between", value1, value2, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveTownRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("live_town_region_id not between", value1, value2, "liveTownRegionId");
            return (Criteria) this;
        }

        public Criteria andLiveDetailIsNull() {
            addCriterion("live_detail is null");
            return (Criteria) this;
        }

        public Criteria andLiveDetailIsNotNull() {
            addCriterion("live_detail is not null");
            return (Criteria) this;
        }

        public Criteria andLiveDetailEqualTo(String value) {
            addCriterion("live_detail =", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailNotEqualTo(String value) {
            addCriterion("live_detail <>", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailGreaterThan(String value) {
            addCriterion("live_detail >", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailGreaterThanOrEqualTo(String value) {
            addCriterion("live_detail >=", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailLessThan(String value) {
            addCriterion("live_detail <", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailLessThanOrEqualTo(String value) {
            addCriterion("live_detail <=", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailLike(String value) {
            addCriterion("live_detail like", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailNotLike(String value) {
            addCriterion("live_detail not like", value, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailIn(List<String> values) {
            addCriterion("live_detail in", values, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailNotIn(List<String> values) {
            addCriterion("live_detail not in", values, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailBetween(String value1, String value2) {
            addCriterion("live_detail between", value1, value2, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andLiveDetailNotBetween(String value1, String value2) {
            addCriterion("live_detail not between", value1, value2, "liveDetail");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdIsNull() {
            addCriterion("hometown_region_id is null");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdIsNotNull() {
            addCriterion("hometown_region_id is not null");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdEqualTo(Integer value) {
            addCriterion("hometown_region_id =", value, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdNotEqualTo(Integer value) {
            addCriterion("hometown_region_id <>", value, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdGreaterThan(Integer value) {
            addCriterion("hometown_region_id >", value, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hometown_region_id >=", value, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdLessThan(Integer value) {
            addCriterion("hometown_region_id <", value, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("hometown_region_id <=", value, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdIn(List<Integer> values) {
            addCriterion("hometown_region_id in", values, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdNotIn(List<Integer> values) {
            addCriterion("hometown_region_id not in", values, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("hometown_region_id between", value1, value2, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andHometownRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hometown_region_id not between", value1, value2, "hometownRegionId");
            return (Criteria) this;
        }

        public Criteria andIsMarriedIsNull() {
            addCriterion("is_married is null");
            return (Criteria) this;
        }

        public Criteria andIsMarriedIsNotNull() {
            addCriterion("is_married is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarriedEqualTo(Boolean value) {
            addCriterion("is_married =", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotEqualTo(Boolean value) {
            addCriterion("is_married <>", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedGreaterThan(Boolean value) {
            addCriterion("is_married >", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_married >=", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedLessThan(Boolean value) {
            addCriterion("is_married <", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_married <=", value, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedIn(List<Boolean> values) {
            addCriterion("is_married in", values, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotIn(List<Boolean> values) {
            addCriterion("is_married not in", values, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_married between", value1, value2, "isMarried");
            return (Criteria) this;
        }

        public Criteria andIsMarriedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_married not between", value1, value2, "isMarried");
            return (Criteria) this;
        }

        public Criteria andHasChildIsNull() {
            addCriterion("has_child is null");
            return (Criteria) this;
        }

        public Criteria andHasChildIsNotNull() {
            addCriterion("has_child is not null");
            return (Criteria) this;
        }

        public Criteria andHasChildEqualTo(Boolean value) {
            addCriterion("has_child =", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildNotEqualTo(Boolean value) {
            addCriterion("has_child <>", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildGreaterThan(Boolean value) {
            addCriterion("has_child >", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_child >=", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildLessThan(Boolean value) {
            addCriterion("has_child <", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildLessThanOrEqualTo(Boolean value) {
            addCriterion("has_child <=", value, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildIn(List<Boolean> values) {
            addCriterion("has_child in", values, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildNotIn(List<Boolean> values) {
            addCriterion("has_child not in", values, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildBetween(Boolean value1, Boolean value2) {
            addCriterion("has_child between", value1, value2, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasChildNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_child not between", value1, value2, "hasChild");
            return (Criteria) this;
        }

        public Criteria andHasParentIsNull() {
            addCriterion("has_parent is null");
            return (Criteria) this;
        }

        public Criteria andHasParentIsNotNull() {
            addCriterion("has_parent is not null");
            return (Criteria) this;
        }

        public Criteria andHasParentEqualTo(Boolean value) {
            addCriterion("has_parent =", value, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentNotEqualTo(Boolean value) {
            addCriterion("has_parent <>", value, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentGreaterThan(Boolean value) {
            addCriterion("has_parent >", value, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_parent >=", value, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentLessThan(Boolean value) {
            addCriterion("has_parent <", value, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentLessThanOrEqualTo(Boolean value) {
            addCriterion("has_parent <=", value, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentIn(List<Boolean> values) {
            addCriterion("has_parent in", values, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentNotIn(List<Boolean> values) {
            addCriterion("has_parent not in", values, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentBetween(Boolean value1, Boolean value2) {
            addCriterion("has_parent between", value1, value2, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasParentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_parent not between", value1, value2, "hasParent");
            return (Criteria) this;
        }

        public Criteria andHasCardIsNull() {
            addCriterion("has_card is null");
            return (Criteria) this;
        }

        public Criteria andHasCardIsNotNull() {
            addCriterion("has_card is not null");
            return (Criteria) this;
        }

        public Criteria andHasCardEqualTo(Boolean value) {
            addCriterion("has_card =", value, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardNotEqualTo(Boolean value) {
            addCriterion("has_card <>", value, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardGreaterThan(Boolean value) {
            addCriterion("has_card >", value, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_card >=", value, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardLessThan(Boolean value) {
            addCriterion("has_card <", value, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardLessThanOrEqualTo(Boolean value) {
            addCriterion("has_card <=", value, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardIn(List<Boolean> values) {
            addCriterion("has_card in", values, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardNotIn(List<Boolean> values) {
            addCriterion("has_card not in", values, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardBetween(Boolean value1, Boolean value2) {
            addCriterion("has_card between", value1, value2, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasCardNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_card not between", value1, value2, "hasCard");
            return (Criteria) this;
        }

        public Criteria andHasPetIsNull() {
            addCriterion("has_pet is null");
            return (Criteria) this;
        }

        public Criteria andHasPetIsNotNull() {
            addCriterion("has_pet is not null");
            return (Criteria) this;
        }

        public Criteria andHasPetEqualTo(Boolean value) {
            addCriterion("has_pet =", value, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetNotEqualTo(Boolean value) {
            addCriterion("has_pet <>", value, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetGreaterThan(Boolean value) {
            addCriterion("has_pet >", value, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("has_pet >=", value, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetLessThan(Boolean value) {
            addCriterion("has_pet <", value, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetLessThanOrEqualTo(Boolean value) {
            addCriterion("has_pet <=", value, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetIn(List<Boolean> values) {
            addCriterion("has_pet in", values, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetNotIn(List<Boolean> values) {
            addCriterion("has_pet not in", values, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetBetween(Boolean value1, Boolean value2) {
            addCriterion("has_pet between", value1, value2, "hasPet");
            return (Criteria) this;
        }

        public Criteria andHasPetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("has_pet not between", value1, value2, "hasPet");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Integer value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Integer value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Integer value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Integer value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Integer> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Integer> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Integer value1, Integer value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeIsNull() {
            addCriterion("email_subscribe is null");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeIsNotNull() {
            addCriterion("email_subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeEqualTo(Boolean value) {
            addCriterion("email_subscribe =", value, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeNotEqualTo(Boolean value) {
            addCriterion("email_subscribe <>", value, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeGreaterThan(Boolean value) {
            addCriterion("email_subscribe >", value, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_subscribe >=", value, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeLessThan(Boolean value) {
            addCriterion("email_subscribe <", value, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeLessThanOrEqualTo(Boolean value) {
            addCriterion("email_subscribe <=", value, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeIn(List<Boolean> values) {
            addCriterion("email_subscribe in", values, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeNotIn(List<Boolean> values) {
            addCriterion("email_subscribe not in", values, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeBetween(Boolean value1, Boolean value2) {
            addCriterion("email_subscribe between", value1, value2, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andEmailSubscribeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_subscribe not between", value1, value2, "emailSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeIsNull() {
            addCriterion("short_message_subscribe is null");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeIsNotNull() {
            addCriterion("short_message_subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeEqualTo(Boolean value) {
            addCriterion("short_message_subscribe =", value, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeNotEqualTo(Boolean value) {
            addCriterion("short_message_subscribe <>", value, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeGreaterThan(Boolean value) {
            addCriterion("short_message_subscribe >", value, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("short_message_subscribe >=", value, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeLessThan(Boolean value) {
            addCriterion("short_message_subscribe <", value, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeLessThanOrEqualTo(Boolean value) {
            addCriterion("short_message_subscribe <=", value, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeIn(List<Boolean> values) {
            addCriterion("short_message_subscribe in", values, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeNotIn(List<Boolean> values) {
            addCriterion("short_message_subscribe not in", values, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeBetween(Boolean value1, Boolean value2) {
            addCriterion("short_message_subscribe between", value1, value2, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andShortMessageSubscribeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("short_message_subscribe not between", value1, value2, "shortMessageSubscribe");
            return (Criteria) this;
        }

        public Criteria andIsBondIsNull() {
            addCriterion("is_bond is null");
            return (Criteria) this;
        }

        public Criteria andIsBondIsNotNull() {
            addCriterion("is_bond is not null");
            return (Criteria) this;
        }

        public Criteria andIsBondEqualTo(Boolean value) {
            addCriterion("is_bond =", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondNotEqualTo(Boolean value) {
            addCriterion("is_bond <>", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondGreaterThan(Boolean value) {
            addCriterion("is_bond >", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_bond >=", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondLessThan(Boolean value) {
            addCriterion("is_bond <", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondLessThanOrEqualTo(Boolean value) {
            addCriterion("is_bond <=", value, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondIn(List<Boolean> values) {
            addCriterion("is_bond in", values, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondNotIn(List<Boolean> values) {
            addCriterion("is_bond not in", values, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bond between", value1, value2, "isBond");
            return (Criteria) this;
        }

        public Criteria andIsBondNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_bond not between", value1, value2, "isBond");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrIsNull() {
            addCriterion("last_order_addr is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrIsNotNull() {
            addCriterion("last_order_addr is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrEqualTo(Integer value) {
            addCriterion("last_order_addr =", value, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrNotEqualTo(Integer value) {
            addCriterion("last_order_addr <>", value, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrGreaterThan(Integer value) {
            addCriterion("last_order_addr >", value, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_order_addr >=", value, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrLessThan(Integer value) {
            addCriterion("last_order_addr <", value, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrLessThanOrEqualTo(Integer value) {
            addCriterion("last_order_addr <=", value, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrIn(List<Integer> values) {
            addCriterion("last_order_addr in", values, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrNotIn(List<Integer> values) {
            addCriterion("last_order_addr not in", values, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrBetween(Integer value1, Integer value2) {
            addCriterion("last_order_addr between", value1, value2, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderAddrNotBetween(Integer value1, Integer value2) {
            addCriterion("last_order_addr not between", value1, value2, "lastOrderAddr");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeIsNull() {
            addCriterion("last_order_shippingtime is null");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeIsNotNull() {
            addCriterion("last_order_shippingtime is not null");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeEqualTo(Integer value) {
            addCriterion("last_order_shippingtime =", value, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeNotEqualTo(Integer value) {
            addCriterion("last_order_shippingtime <>", value, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeGreaterThan(Integer value) {
            addCriterion("last_order_shippingtime >", value, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_order_shippingtime >=", value, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeLessThan(Integer value) {
            addCriterion("last_order_shippingtime <", value, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeLessThanOrEqualTo(Integer value) {
            addCriterion("last_order_shippingtime <=", value, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeIn(List<Integer> values) {
            addCriterion("last_order_shippingtime in", values, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeNotIn(List<Integer> values) {
            addCriterion("last_order_shippingtime not in", values, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeBetween(Integer value1, Integer value2) {
            addCriterion("last_order_shippingtime between", value1, value2, "lastOrderShippingtime");
            return (Criteria) this;
        }

        public Criteria andLastOrderShippingtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("last_order_shippingtime not between", value1, value2, "lastOrderShippingtime");
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

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
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