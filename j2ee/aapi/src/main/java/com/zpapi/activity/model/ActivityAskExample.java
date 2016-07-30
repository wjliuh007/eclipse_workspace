package com.zpapi.activity.model;

import java.util.ArrayList;
import java.util.List;

public class ActivityAskExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ActivityAskExample() {
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

		public Criteria andPidIsNull() {
			addCriterion("pid is null");
			return (Criteria) this;
		}

		public Criteria andPidIsNotNull() {
			addCriterion("pid is not null");
			return (Criteria) this;
		}

		public Criteria andPidEqualTo(Integer value) {
			addCriterion("pid =", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotEqualTo(Integer value) {
			addCriterion("pid <>", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidGreaterThan(Integer value) {
			addCriterion("pid >", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidGreaterThanOrEqualTo(Integer value) {
			addCriterion("pid >=", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidLessThan(Integer value) {
			addCriterion("pid <", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidLessThanOrEqualTo(Integer value) {
			addCriterion("pid <=", value, "pid");
			return (Criteria) this;
		}

		public Criteria andPidIn(List<Integer> values) {
			addCriterion("pid in", values, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotIn(List<Integer> values) {
			addCriterion("pid not in", values, "pid");
			return (Criteria) this;
		}

		public Criteria andPidBetween(Integer value1, Integer value2) {
			addCriterion("pid between", value1, value2, "pid");
			return (Criteria) this;
		}

		public Criteria andPidNotBetween(Integer value1, Integer value2) {
			addCriterion("pid not between", value1, value2, "pid");
			return (Criteria) this;
		}

		public Criteria andTextIsNull() {
			addCriterion("text is null");
			return (Criteria) this;
		}

		public Criteria andTextIsNotNull() {
			addCriterion("text is not null");
			return (Criteria) this;
		}

		public Criteria andTextEqualTo(String value) {
			addCriterion("text =", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotEqualTo(String value) {
			addCriterion("text <>", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextGreaterThan(String value) {
			addCriterion("text >", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextGreaterThanOrEqualTo(String value) {
			addCriterion("text >=", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextLessThan(String value) {
			addCriterion("text <", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextLessThanOrEqualTo(String value) {
			addCriterion("text <=", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextLike(String value) {
			addCriterion("text like", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotLike(String value) {
			addCriterion("text not like", value, "text");
			return (Criteria) this;
		}

		public Criteria andTextIn(List<String> values) {
			addCriterion("text in", values, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotIn(List<String> values) {
			addCriterion("text not in", values, "text");
			return (Criteria) this;
		}

		public Criteria andTextBetween(String value1, String value2) {
			addCriterion("text between", value1, value2, "text");
			return (Criteria) this;
		}

		public Criteria andTextNotBetween(String value1, String value2) {
			addCriterion("text not between", value1, value2, "text");
			return (Criteria) this;
		}

		public Criteria andSortIsNull() {
			addCriterion("sort is null");
			return (Criteria) this;
		}

		public Criteria andSortIsNotNull() {
			addCriterion("sort is not null");
			return (Criteria) this;
		}

		public Criteria andSortEqualTo(Integer value) {
			addCriterion("sort =", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotEqualTo(Integer value) {
			addCriterion("sort <>", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortGreaterThan(Integer value) {
			addCriterion("sort >", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("sort >=", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLessThan(Integer value) {
			addCriterion("sort <", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortLessThanOrEqualTo(Integer value) {
			addCriterion("sort <=", value, "sort");
			return (Criteria) this;
		}

		public Criteria andSortIn(List<Integer> values) {
			addCriterion("sort in", values, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotIn(List<Integer> values) {
			addCriterion("sort not in", values, "sort");
			return (Criteria) this;
		}

		public Criteria andSortBetween(Integer value1, Integer value2) {
			addCriterion("sort between", value1, value2, "sort");
			return (Criteria) this;
		}

		public Criteria andSortNotBetween(Integer value1, Integer value2) {
			addCriterion("sort not between", value1, value2, "sort");
			return (Criteria) this;
		}

		public Criteria andIsCorrectIsNull() {
			addCriterion("is_correct is null");
			return (Criteria) this;
		}

		public Criteria andIsCorrectIsNotNull() {
			addCriterion("is_correct is not null");
			return (Criteria) this;
		}

		public Criteria andIsCorrectEqualTo(Integer value) {
			addCriterion("is_correct =", value, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectNotEqualTo(Integer value) {
			addCriterion("is_correct <>", value, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectGreaterThan(Integer value) {
			addCriterion("is_correct >", value, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_correct >=", value, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectLessThan(Integer value) {
			addCriterion("is_correct <", value, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectLessThanOrEqualTo(Integer value) {
			addCriterion("is_correct <=", value, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectIn(List<Integer> values) {
			addCriterion("is_correct in", values, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectNotIn(List<Integer> values) {
			addCriterion("is_correct not in", values, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectBetween(Integer value1, Integer value2) {
			addCriterion("is_correct between", value1, value2, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andIsCorrectNotBetween(Integer value1, Integer value2) {
			addCriterion("is_correct not between", value1, value2, "isCorrect");
			return (Criteria) this;
		}

		public Criteria andLevelIsNull() {
			addCriterion("level is null");
			return (Criteria) this;
		}

		public Criteria andLevelIsNotNull() {
			addCriterion("level is not null");
			return (Criteria) this;
		}

		public Criteria andLevelEqualTo(Integer value) {
			addCriterion("level =", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotEqualTo(Integer value) {
			addCriterion("level <>", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThan(Integer value) {
			addCriterion("level >", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
			addCriterion("level >=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThan(Integer value) {
			addCriterion("level <", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelLessThanOrEqualTo(Integer value) {
			addCriterion("level <=", value, "level");
			return (Criteria) this;
		}

		public Criteria andLevelIn(List<Integer> values) {
			addCriterion("level in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotIn(List<Integer> values) {
			addCriterion("level not in", values, "level");
			return (Criteria) this;
		}

		public Criteria andLevelBetween(Integer value1, Integer value2) {
			addCriterion("level between", value1, value2, "level");
			return (Criteria) this;
		}

		public Criteria andLevelNotBetween(Integer value1, Integer value2) {
			addCriterion("level not between", value1, value2, "level");
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

		public Criteria andImgIsNull() {
			addCriterion("img is null");
			return (Criteria) this;
		}

		public Criteria andImgIsNotNull() {
			addCriterion("img is not null");
			return (Criteria) this;
		}

		public Criteria andImgEqualTo(String value) {
			addCriterion("img =", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotEqualTo(String value) {
			addCriterion("img <>", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThan(String value) {
			addCriterion("img >", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThanOrEqualTo(String value) {
			addCriterion("img >=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThan(String value) {
			addCriterion("img <", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThanOrEqualTo(String value) {
			addCriterion("img <=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLike(String value) {
			addCriterion("img like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotLike(String value) {
			addCriterion("img not like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgIn(List<String> values) {
			addCriterion("img in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotIn(List<String> values) {
			addCriterion("img not in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgBetween(String value1, String value2) {
			addCriterion("img between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotBetween(String value1, String value2) {
			addCriterion("img not between", value1, value2, "img");
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