package com.zpapi.other.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GtGoodsBrandExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public GtGoodsBrandExample() {
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

		public Criteria andBrandIdIsNull() {
			addCriterion("brand_id is null");
			return (Criteria) this;
		}

		public Criteria andBrandIdIsNotNull() {
			addCriterion("brand_id is not null");
			return (Criteria) this;
		}

		public Criteria andBrandIdEqualTo(Integer value) {
			addCriterion("brand_id =", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotEqualTo(Integer value) {
			addCriterion("brand_id <>", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThan(Integer value) {
			addCriterion("brand_id >", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("brand_id >=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThan(Integer value) {
			addCriterion("brand_id <", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
			addCriterion("brand_id <=", value, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdIn(List<Integer> values) {
			addCriterion("brand_id in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotIn(List<Integer> values) {
			addCriterion("brand_id not in", values, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdBetween(Integer value1, Integer value2) {
			addCriterion("brand_id between", value1, value2, "brandId");
			return (Criteria) this;
		}

		public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
			addCriterion("brand_id not between", value1, value2, "brandId");
			return (Criteria) this;
		}

		public Criteria andIsTopIsNull() {
			addCriterion("is_top is null");
			return (Criteria) this;
		}

		public Criteria andIsTopIsNotNull() {
			addCriterion("is_top is not null");
			return (Criteria) this;
		}

		public Criteria andIsTopEqualTo(Boolean value) {
			addCriterion("is_top =", value, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopNotEqualTo(Boolean value) {
			addCriterion("is_top <>", value, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopGreaterThan(Boolean value) {
			addCriterion("is_top >", value, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopGreaterThanOrEqualTo(Boolean value) {
			addCriterion("is_top >=", value, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopLessThan(Boolean value) {
			addCriterion("is_top <", value, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopLessThanOrEqualTo(Boolean value) {
			addCriterion("is_top <=", value, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopIn(List<Boolean> values) {
			addCriterion("is_top in", values, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopNotIn(List<Boolean> values) {
			addCriterion("is_top not in", values, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopBetween(Boolean value1, Boolean value2) {
			addCriterion("is_top between", value1, value2, "isTop");
			return (Criteria) this;
		}

		public Criteria andIsTopNotBetween(Boolean value1, Boolean value2) {
			addCriterion("is_top not between", value1, value2, "isTop");
			return (Criteria) this;
		}

		public Criteria andBrandNameIsNull() {
			addCriterion("brand_name is null");
			return (Criteria) this;
		}

		public Criteria andBrandNameIsNotNull() {
			addCriterion("brand_name is not null");
			return (Criteria) this;
		}

		public Criteria andBrandNameEqualTo(String value) {
			addCriterion("brand_name =", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotEqualTo(String value) {
			addCriterion("brand_name <>", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameGreaterThan(String value) {
			addCriterion("brand_name >", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
			addCriterion("brand_name >=", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameLessThan(String value) {
			addCriterion("brand_name <", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameLessThanOrEqualTo(String value) {
			addCriterion("brand_name <=", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameLike(String value) {
			addCriterion("brand_name like", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotLike(String value) {
			addCriterion("brand_name not like", value, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameIn(List<String> values) {
			addCriterion("brand_name in", values, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotIn(List<String> values) {
			addCriterion("brand_name not in", values, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameBetween(String value1, String value2) {
			addCriterion("brand_name between", value1, value2, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameNotBetween(String value1, String value2) {
			addCriterion("brand_name not between", value1, value2, "brandName");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondIsNull() {
			addCriterion("brand_name_second is null");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondIsNotNull() {
			addCriterion("brand_name_second is not null");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondEqualTo(String value) {
			addCriterion("brand_name_second =", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondNotEqualTo(String value) {
			addCriterion("brand_name_second <>", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondGreaterThan(String value) {
			addCriterion("brand_name_second >", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondGreaterThanOrEqualTo(String value) {
			addCriterion("brand_name_second >=", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondLessThan(String value) {
			addCriterion("brand_name_second <", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondLessThanOrEqualTo(String value) {
			addCriterion("brand_name_second <=", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondLike(String value) {
			addCriterion("brand_name_second like", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondNotLike(String value) {
			addCriterion("brand_name_second not like", value, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondIn(List<String> values) {
			addCriterion("brand_name_second in", values, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondNotIn(List<String> values) {
			addCriterion("brand_name_second not in", values, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondBetween(String value1, String value2) {
			addCriterion("brand_name_second between", value1, value2, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandNameSecondNotBetween(String value1, String value2) {
			addCriterion("brand_name_second not between", value1, value2, "brandNameSecond");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinIsNull() {
			addCriterion("brand_pinyin is null");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinIsNotNull() {
			addCriterion("brand_pinyin is not null");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinEqualTo(String value) {
			addCriterion("brand_pinyin =", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinNotEqualTo(String value) {
			addCriterion("brand_pinyin <>", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinGreaterThan(String value) {
			addCriterion("brand_pinyin >", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinGreaterThanOrEqualTo(String value) {
			addCriterion("brand_pinyin >=", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinLessThan(String value) {
			addCriterion("brand_pinyin <", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinLessThanOrEqualTo(String value) {
			addCriterion("brand_pinyin <=", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinLike(String value) {
			addCriterion("brand_pinyin like", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinNotLike(String value) {
			addCriterion("brand_pinyin not like", value, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinIn(List<String> values) {
			addCriterion("brand_pinyin in", values, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinNotIn(List<String> values) {
			addCriterion("brand_pinyin not in", values, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinBetween(String value1, String value2) {
			addCriterion("brand_pinyin between", value1, value2, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandPinyinNotBetween(String value1, String value2) {
			addCriterion("brand_pinyin not between", value1, value2, "brandPinyin");
			return (Criteria) this;
		}

		public Criteria andBrandLogoIsNull() {
			addCriterion("brand_logo is null");
			return (Criteria) this;
		}

		public Criteria andBrandLogoIsNotNull() {
			addCriterion("brand_logo is not null");
			return (Criteria) this;
		}

		public Criteria andBrandLogoEqualTo(String value) {
			addCriterion("brand_logo =", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoNotEqualTo(String value) {
			addCriterion("brand_logo <>", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoGreaterThan(String value) {
			addCriterion("brand_logo >", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoGreaterThanOrEqualTo(String value) {
			addCriterion("brand_logo >=", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoLessThan(String value) {
			addCriterion("brand_logo <", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoLessThanOrEqualTo(String value) {
			addCriterion("brand_logo <=", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoLike(String value) {
			addCriterion("brand_logo like", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoNotLike(String value) {
			addCriterion("brand_logo not like", value, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoIn(List<String> values) {
			addCriterion("brand_logo in", values, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoNotIn(List<String> values) {
			addCriterion("brand_logo not in", values, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoBetween(String value1, String value2) {
			addCriterion("brand_logo between", value1, value2, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andBrandLogoNotBetween(String value1, String value2) {
			addCriterion("brand_logo not between", value1, value2, "brandLogo");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgIsNull() {
			addCriterion("thumb_brand_img is null");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgIsNotNull() {
			addCriterion("thumb_brand_img is not null");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgEqualTo(String value) {
			addCriterion("thumb_brand_img =", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgNotEqualTo(String value) {
			addCriterion("thumb_brand_img <>", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgGreaterThan(String value) {
			addCriterion("thumb_brand_img >", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgGreaterThanOrEqualTo(String value) {
			addCriterion("thumb_brand_img >=", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgLessThan(String value) {
			addCriterion("thumb_brand_img <", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgLessThanOrEqualTo(String value) {
			addCriterion("thumb_brand_img <=", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgLike(String value) {
			addCriterion("thumb_brand_img like", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgNotLike(String value) {
			addCriterion("thumb_brand_img not like", value, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgIn(List<String> values) {
			addCriterion("thumb_brand_img in", values, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgNotIn(List<String> values) {
			addCriterion("thumb_brand_img not in", values, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgBetween(String value1, String value2) {
			addCriterion("thumb_brand_img between", value1, value2, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andThumbBrandImgNotBetween(String value1, String value2) {
			addCriterion("thumb_brand_img not between", value1, value2, "thumbBrandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgIsNull() {
			addCriterion("brand_img is null");
			return (Criteria) this;
		}

		public Criteria andBrandImgIsNotNull() {
			addCriterion("brand_img is not null");
			return (Criteria) this;
		}

		public Criteria andBrandImgEqualTo(String value) {
			addCriterion("brand_img =", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgNotEqualTo(String value) {
			addCriterion("brand_img <>", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgGreaterThan(String value) {
			addCriterion("brand_img >", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgGreaterThanOrEqualTo(String value) {
			addCriterion("brand_img >=", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgLessThan(String value) {
			addCriterion("brand_img <", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgLessThanOrEqualTo(String value) {
			addCriterion("brand_img <=", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgLike(String value) {
			addCriterion("brand_img like", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgNotLike(String value) {
			addCriterion("brand_img not like", value, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgIn(List<String> values) {
			addCriterion("brand_img in", values, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgNotIn(List<String> values) {
			addCriterion("brand_img not in", values, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgBetween(String value1, String value2) {
			addCriterion("brand_img between", value1, value2, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandImgNotBetween(String value1, String value2) {
			addCriterion("brand_img not between", value1, value2, "brandImg");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathIsNull() {
			addCriterion("brand_css_path is null");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathIsNotNull() {
			addCriterion("brand_css_path is not null");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathEqualTo(String value) {
			addCriterion("brand_css_path =", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathNotEqualTo(String value) {
			addCriterion("brand_css_path <>", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathGreaterThan(String value) {
			addCriterion("brand_css_path >", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathGreaterThanOrEqualTo(String value) {
			addCriterion("brand_css_path >=", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathLessThan(String value) {
			addCriterion("brand_css_path <", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathLessThanOrEqualTo(String value) {
			addCriterion("brand_css_path <=", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathLike(String value) {
			addCriterion("brand_css_path like", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathNotLike(String value) {
			addCriterion("brand_css_path not like", value, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathIn(List<String> values) {
			addCriterion("brand_css_path in", values, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathNotIn(List<String> values) {
			addCriterion("brand_css_path not in", values, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathBetween(String value1, String value2) {
			addCriterion("brand_css_path between", value1, value2, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandCssPathNotBetween(String value1, String value2) {
			addCriterion("brand_css_path not between", value1, value2, "brandCssPath");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroIsNull() {
			addCriterion("brand_simple_intro is null");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroIsNotNull() {
			addCriterion("brand_simple_intro is not null");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroEqualTo(String value) {
			addCriterion("brand_simple_intro =", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroNotEqualTo(String value) {
			addCriterion("brand_simple_intro <>", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroGreaterThan(String value) {
			addCriterion("brand_simple_intro >", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroGreaterThanOrEqualTo(String value) {
			addCriterion("brand_simple_intro >=", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroLessThan(String value) {
			addCriterion("brand_simple_intro <", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroLessThanOrEqualTo(String value) {
			addCriterion("brand_simple_intro <=", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroLike(String value) {
			addCriterion("brand_simple_intro like", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroNotLike(String value) {
			addCriterion("brand_simple_intro not like", value, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroIn(List<String> values) {
			addCriterion("brand_simple_intro in", values, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroNotIn(List<String> values) {
			addCriterion("brand_simple_intro not in", values, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroBetween(String value1, String value2) {
			addCriterion("brand_simple_intro between", value1, value2, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andBrandSimpleIntroNotBetween(String value1, String value2) {
			addCriterion("brand_simple_intro not between", value1, value2, "brandSimpleIntro");
			return (Criteria) this;
		}

		public Criteria andNatureIsNull() {
			addCriterion("nature is null");
			return (Criteria) this;
		}

		public Criteria andNatureIsNotNull() {
			addCriterion("nature is not null");
			return (Criteria) this;
		}

		public Criteria andNatureEqualTo(String value) {
			addCriterion("nature =", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureNotEqualTo(String value) {
			addCriterion("nature <>", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureGreaterThan(String value) {
			addCriterion("nature >", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureGreaterThanOrEqualTo(String value) {
			addCriterion("nature >=", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureLessThan(String value) {
			addCriterion("nature <", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureLessThanOrEqualTo(String value) {
			addCriterion("nature <=", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureLike(String value) {
			addCriterion("nature like", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureNotLike(String value) {
			addCriterion("nature not like", value, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureIn(List<String> values) {
			addCriterion("nature in", values, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureNotIn(List<String> values) {
			addCriterion("nature not in", values, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureBetween(String value1, String value2) {
			addCriterion("nature between", value1, value2, "nature");
			return (Criteria) this;
		}

		public Criteria andNatureNotBetween(String value1, String value2) {
			addCriterion("nature not between", value1, value2, "nature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureIsNull() {
			addCriterion("chinese_nature is null");
			return (Criteria) this;
		}

		public Criteria andChineseNatureIsNotNull() {
			addCriterion("chinese_nature is not null");
			return (Criteria) this;
		}

		public Criteria andChineseNatureEqualTo(String value) {
			addCriterion("chinese_nature =", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureNotEqualTo(String value) {
			addCriterion("chinese_nature <>", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureGreaterThan(String value) {
			addCriterion("chinese_nature >", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureGreaterThanOrEqualTo(String value) {
			addCriterion("chinese_nature >=", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureLessThan(String value) {
			addCriterion("chinese_nature <", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureLessThanOrEqualTo(String value) {
			addCriterion("chinese_nature <=", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureLike(String value) {
			addCriterion("chinese_nature like", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureNotLike(String value) {
			addCriterion("chinese_nature not like", value, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureIn(List<String> values) {
			addCriterion("chinese_nature in", values, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureNotIn(List<String> values) {
			addCriterion("chinese_nature not in", values, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureBetween(String value1, String value2) {
			addCriterion("chinese_nature between", value1, value2, "chineseNature");
			return (Criteria) this;
		}

		public Criteria andChineseNatureNotBetween(String value1, String value2) {
			addCriterion("chinese_nature not between", value1, value2, "chineseNature");
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

		public Criteria andCmsBrandIdIsNull() {
			addCriterion("cms_brand_id is null");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdIsNotNull() {
			addCriterion("cms_brand_id is not null");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdEqualTo(Integer value) {
			addCriterion("cms_brand_id =", value, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdNotEqualTo(Integer value) {
			addCriterion("cms_brand_id <>", value, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdGreaterThan(Integer value) {
			addCriterion("cms_brand_id >", value, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("cms_brand_id >=", value, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdLessThan(Integer value) {
			addCriterion("cms_brand_id <", value, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdLessThanOrEqualTo(Integer value) {
			addCriterion("cms_brand_id <=", value, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdIn(List<Integer> values) {
			addCriterion("cms_brand_id in", values, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdNotIn(List<Integer> values) {
			addCriterion("cms_brand_id not in", values, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdBetween(Integer value1, Integer value2) {
			addCriterion("cms_brand_id between", value1, value2, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandIdNotBetween(Integer value1, Integer value2) {
			addCriterion("cms_brand_id not between", value1, value2, "cmsBrandId");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathIsNull() {
			addCriterion("cms_brand_path is null");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathIsNotNull() {
			addCriterion("cms_brand_path is not null");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathEqualTo(String value) {
			addCriterion("cms_brand_path =", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathNotEqualTo(String value) {
			addCriterion("cms_brand_path <>", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathGreaterThan(String value) {
			addCriterion("cms_brand_path >", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathGreaterThanOrEqualTo(String value) {
			addCriterion("cms_brand_path >=", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathLessThan(String value) {
			addCriterion("cms_brand_path <", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathLessThanOrEqualTo(String value) {
			addCriterion("cms_brand_path <=", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathLike(String value) {
			addCriterion("cms_brand_path like", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathNotLike(String value) {
			addCriterion("cms_brand_path not like", value, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathIn(List<String> values) {
			addCriterion("cms_brand_path in", values, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathNotIn(List<String> values) {
			addCriterion("cms_brand_path not in", values, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathBetween(String value1, String value2) {
			addCriterion("cms_brand_path between", value1, value2, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andCmsBrandPathNotBetween(String value1, String value2) {
			addCriterion("cms_brand_path not between", value1, value2, "cmsBrandPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathIsNull() {
			addCriterion("url_path is null");
			return (Criteria) this;
		}

		public Criteria andUrlPathIsNotNull() {
			addCriterion("url_path is not null");
			return (Criteria) this;
		}

		public Criteria andUrlPathEqualTo(String value) {
			addCriterion("url_path =", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathNotEqualTo(String value) {
			addCriterion("url_path <>", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathGreaterThan(String value) {
			addCriterion("url_path >", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathGreaterThanOrEqualTo(String value) {
			addCriterion("url_path >=", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathLessThan(String value) {
			addCriterion("url_path <", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathLessThanOrEqualTo(String value) {
			addCriterion("url_path <=", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathLike(String value) {
			addCriterion("url_path like", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathNotLike(String value) {
			addCriterion("url_path not like", value, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathIn(List<String> values) {
			addCriterion("url_path in", values, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathNotIn(List<String> values) {
			addCriterion("url_path not in", values, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathBetween(String value1, String value2) {
			addCriterion("url_path between", value1, value2, "urlPath");
			return (Criteria) this;
		}

		public Criteria andUrlPathNotBetween(String value1, String value2) {
			addCriterion("url_path not between", value1, value2, "urlPath");
			return (Criteria) this;
		}

		public Criteria andSeoInfoIsNull() {
			addCriterion("seo_info is null");
			return (Criteria) this;
		}

		public Criteria andSeoInfoIsNotNull() {
			addCriterion("seo_info is not null");
			return (Criteria) this;
		}

		public Criteria andSeoInfoEqualTo(String value) {
			addCriterion("seo_info =", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoNotEqualTo(String value) {
			addCriterion("seo_info <>", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoGreaterThan(String value) {
			addCriterion("seo_info >", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoGreaterThanOrEqualTo(String value) {
			addCriterion("seo_info >=", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoLessThan(String value) {
			addCriterion("seo_info <", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoLessThanOrEqualTo(String value) {
			addCriterion("seo_info <=", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoLike(String value) {
			addCriterion("seo_info like", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoNotLike(String value) {
			addCriterion("seo_info not like", value, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoIn(List<String> values) {
			addCriterion("seo_info in", values, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoNotIn(List<String> values) {
			addCriterion("seo_info not in", values, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoBetween(String value1, String value2) {
			addCriterion("seo_info between", value1, value2, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andSeoInfoNotBetween(String value1, String value2) {
			addCriterion("seo_info not between", value1, value2, "seoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoIsNull() {
			addCriterion("male_seo_info is null");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoIsNotNull() {
			addCriterion("male_seo_info is not null");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoEqualTo(String value) {
			addCriterion("male_seo_info =", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoNotEqualTo(String value) {
			addCriterion("male_seo_info <>", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoGreaterThan(String value) {
			addCriterion("male_seo_info >", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoGreaterThanOrEqualTo(String value) {
			addCriterion("male_seo_info >=", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoLessThan(String value) {
			addCriterion("male_seo_info <", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoLessThanOrEqualTo(String value) {
			addCriterion("male_seo_info <=", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoLike(String value) {
			addCriterion("male_seo_info like", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoNotLike(String value) {
			addCriterion("male_seo_info not like", value, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoIn(List<String> values) {
			addCriterion("male_seo_info in", values, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoNotIn(List<String> values) {
			addCriterion("male_seo_info not in", values, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoBetween(String value1, String value2) {
			addCriterion("male_seo_info between", value1, value2, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andMaleSeoInfoNotBetween(String value1, String value2) {
			addCriterion("male_seo_info not between", value1, value2, "maleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoIsNull() {
			addCriterion("female_seo_info is null");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoIsNotNull() {
			addCriterion("female_seo_info is not null");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoEqualTo(String value) {
			addCriterion("female_seo_info =", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoNotEqualTo(String value) {
			addCriterion("female_seo_info <>", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoGreaterThan(String value) {
			addCriterion("female_seo_info >", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoGreaterThanOrEqualTo(String value) {
			addCriterion("female_seo_info >=", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoLessThan(String value) {
			addCriterion("female_seo_info <", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoLessThanOrEqualTo(String value) {
			addCriterion("female_seo_info <=", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoLike(String value) {
			addCriterion("female_seo_info like", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoNotLike(String value) {
			addCriterion("female_seo_info not like", value, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoIn(List<String> values) {
			addCriterion("female_seo_info in", values, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoNotIn(List<String> values) {
			addCriterion("female_seo_info not in", values, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoBetween(String value1, String value2) {
			addCriterion("female_seo_info between", value1, value2, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andFemaleSeoInfoNotBetween(String value1, String value2) {
			addCriterion("female_seo_info not between", value1, value2, "femaleSeoInfo");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathIsNull() {
			addCriterion("banner_img_path is null");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathIsNotNull() {
			addCriterion("banner_img_path is not null");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathEqualTo(String value) {
			addCriterion("banner_img_path =", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathNotEqualTo(String value) {
			addCriterion("banner_img_path <>", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathGreaterThan(String value) {
			addCriterion("banner_img_path >", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathGreaterThanOrEqualTo(String value) {
			addCriterion("banner_img_path >=", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathLessThan(String value) {
			addCriterion("banner_img_path <", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathLessThanOrEqualTo(String value) {
			addCriterion("banner_img_path <=", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathLike(String value) {
			addCriterion("banner_img_path like", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathNotLike(String value) {
			addCriterion("banner_img_path not like", value, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathIn(List<String> values) {
			addCriterion("banner_img_path in", values, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathNotIn(List<String> values) {
			addCriterion("banner_img_path not in", values, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathBetween(String value1, String value2) {
			addCriterion("banner_img_path between", value1, value2, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerImgPathNotBetween(String value1, String value2) {
			addCriterion("banner_img_path not between", value1, value2, "bannerImgPath");
			return (Criteria) this;
		}

		public Criteria andBannerLinkIsNull() {
			addCriterion("banner_link is null");
			return (Criteria) this;
		}

		public Criteria andBannerLinkIsNotNull() {
			addCriterion("banner_link is not null");
			return (Criteria) this;
		}

		public Criteria andBannerLinkEqualTo(String value) {
			addCriterion("banner_link =", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkNotEqualTo(String value) {
			addCriterion("banner_link <>", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkGreaterThan(String value) {
			addCriterion("banner_link >", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkGreaterThanOrEqualTo(String value) {
			addCriterion("banner_link >=", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkLessThan(String value) {
			addCriterion("banner_link <", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkLessThanOrEqualTo(String value) {
			addCriterion("banner_link <=", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkLike(String value) {
			addCriterion("banner_link like", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkNotLike(String value) {
			addCriterion("banner_link not like", value, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkIn(List<String> values) {
			addCriterion("banner_link in", values, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkNotIn(List<String> values) {
			addCriterion("banner_link not in", values, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkBetween(String value1, String value2) {
			addCriterion("banner_link between", value1, value2, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andBannerLinkNotBetween(String value1, String value2) {
			addCriterion("banner_link not between", value1, value2, "bannerLink");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNull() {
			addCriterion("add_time is null");
			return (Criteria) this;
		}

		public Criteria andAddTimeIsNotNull() {
			addCriterion("add_time is not null");
			return (Criteria) this;
		}

		public Criteria andAddTimeEqualTo(Integer value) {
			addCriterion("add_time =", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotEqualTo(Integer value) {
			addCriterion("add_time <>", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThan(Integer value) {
			addCriterion("add_time >", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
			addCriterion("add_time >=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThan(Integer value) {
			addCriterion("add_time <", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
			addCriterion("add_time <=", value, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeIn(List<Integer> values) {
			addCriterion("add_time in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotIn(List<Integer> values) {
			addCriterion("add_time not in", values, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeBetween(Integer value1, Integer value2) {
			addCriterion("add_time between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
			addCriterion("add_time not between", value1, value2, "addTime");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andEditTimeIsNull() {
			addCriterion("edit_time is null");
			return (Criteria) this;
		}

		public Criteria andEditTimeIsNotNull() {
			addCriterion("edit_time is not null");
			return (Criteria) this;
		}

		public Criteria andEditTimeEqualTo(Date value) {
			addCriterion("edit_time =", value, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeNotEqualTo(Date value) {
			addCriterion("edit_time <>", value, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeGreaterThan(Date value) {
			addCriterion("edit_time >", value, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("edit_time >=", value, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeLessThan(Date value) {
			addCriterion("edit_time <", value, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeLessThanOrEqualTo(Date value) {
			addCriterion("edit_time <=", value, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeIn(List<Date> values) {
			addCriterion("edit_time in", values, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeNotIn(List<Date> values) {
			addCriterion("edit_time not in", values, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeBetween(Date value1, Date value2) {
			addCriterion("edit_time between", value1, value2, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditTimeNotBetween(Date value1, Date value2) {
			addCriterion("edit_time not between", value1, value2, "editTime");
			return (Criteria) this;
		}

		public Criteria andEditUserIdIsNull() {
			addCriterion("edit_user_id is null");
			return (Criteria) this;
		}

		public Criteria andEditUserIdIsNotNull() {
			addCriterion("edit_user_id is not null");
			return (Criteria) this;
		}

		public Criteria andEditUserIdEqualTo(Integer value) {
			addCriterion("edit_user_id =", value, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdNotEqualTo(Integer value) {
			addCriterion("edit_user_id <>", value, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdGreaterThan(Integer value) {
			addCriterion("edit_user_id >", value, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("edit_user_id >=", value, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdLessThan(Integer value) {
			addCriterion("edit_user_id <", value, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("edit_user_id <=", value, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdIn(List<Integer> values) {
			addCriterion("edit_user_id in", values, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdNotIn(List<Integer> values) {
			addCriterion("edit_user_id not in", values, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdBetween(Integer value1, Integer value2) {
			addCriterion("edit_user_id between", value1, value2, "editUserId");
			return (Criteria) this;
		}

		public Criteria andEditUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("edit_user_id not between", value1, value2, "editUserId");
			return (Criteria) this;
		}

		public Criteria andAmazonNameIsNull() {
			addCriterion("amazon_name is null");
			return (Criteria) this;
		}

		public Criteria andAmazonNameIsNotNull() {
			addCriterion("amazon_name is not null");
			return (Criteria) this;
		}

		public Criteria andAmazonNameEqualTo(String value) {
			addCriterion("amazon_name =", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameNotEqualTo(String value) {
			addCriterion("amazon_name <>", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameGreaterThan(String value) {
			addCriterion("amazon_name >", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameGreaterThanOrEqualTo(String value) {
			addCriterion("amazon_name >=", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameLessThan(String value) {
			addCriterion("amazon_name <", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameLessThanOrEqualTo(String value) {
			addCriterion("amazon_name <=", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameLike(String value) {
			addCriterion("amazon_name like", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameNotLike(String value) {
			addCriterion("amazon_name not like", value, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameIn(List<String> values) {
			addCriterion("amazon_name in", values, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameNotIn(List<String> values) {
			addCriterion("amazon_name not in", values, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameBetween(String value1, String value2) {
			addCriterion("amazon_name between", value1, value2, "amazonName");
			return (Criteria) this;
		}

		public Criteria andAmazonNameNotBetween(String value1, String value2) {
			addCriterion("amazon_name not between", value1, value2, "amazonName");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdIsNull() {
			addCriterion("coo8_brand_id is null");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdIsNotNull() {
			addCriterion("coo8_brand_id is not null");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdEqualTo(Integer value) {
			addCriterion("coo8_brand_id =", value, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdNotEqualTo(Integer value) {
			addCriterion("coo8_brand_id <>", value, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdGreaterThan(Integer value) {
			addCriterion("coo8_brand_id >", value, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("coo8_brand_id >=", value, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdLessThan(Integer value) {
			addCriterion("coo8_brand_id <", value, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdLessThanOrEqualTo(Integer value) {
			addCriterion("coo8_brand_id <=", value, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdIn(List<Integer> values) {
			addCriterion("coo8_brand_id in", values, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdNotIn(List<Integer> values) {
			addCriterion("coo8_brand_id not in", values, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdBetween(Integer value1, Integer value2) {
			addCriterion("coo8_brand_id between", value1, value2, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andCoo8BrandIdNotBetween(Integer value1, Integer value2) {
			addCriterion("coo8_brand_id not between", value1, value2, "coo8BrandId");
			return (Criteria) this;
		}

		public Criteria andRecomLabelIsNull() {
			addCriterion("recom_label is null");
			return (Criteria) this;
		}

		public Criteria andRecomLabelIsNotNull() {
			addCriterion("recom_label is not null");
			return (Criteria) this;
		}

		public Criteria andRecomLabelEqualTo(Integer value) {
			addCriterion("recom_label =", value, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelNotEqualTo(Integer value) {
			addCriterion("recom_label <>", value, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelGreaterThan(Integer value) {
			addCriterion("recom_label >", value, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelGreaterThanOrEqualTo(Integer value) {
			addCriterion("recom_label >=", value, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelLessThan(Integer value) {
			addCriterion("recom_label <", value, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelLessThanOrEqualTo(Integer value) {
			addCriterion("recom_label <=", value, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelIn(List<Integer> values) {
			addCriterion("recom_label in", values, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelNotIn(List<Integer> values) {
			addCriterion("recom_label not in", values, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelBetween(Integer value1, Integer value2) {
			addCriterion("recom_label between", value1, value2, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andRecomLabelNotBetween(Integer value1, Integer value2) {
			addCriterion("recom_label not between", value1, value2, "recomLabel");
			return (Criteria) this;
		}

		public Criteria andAppImgIsNull() {
			addCriterion("app_img is null");
			return (Criteria) this;
		}

		public Criteria andAppImgIsNotNull() {
			addCriterion("app_img is not null");
			return (Criteria) this;
		}

		public Criteria andAppImgEqualTo(String value) {
			addCriterion("app_img =", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgNotEqualTo(String value) {
			addCriterion("app_img <>", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgGreaterThan(String value) {
			addCriterion("app_img >", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgGreaterThanOrEqualTo(String value) {
			addCriterion("app_img >=", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgLessThan(String value) {
			addCriterion("app_img <", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgLessThanOrEqualTo(String value) {
			addCriterion("app_img <=", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgLike(String value) {
			addCriterion("app_img like", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgNotLike(String value) {
			addCriterion("app_img not like", value, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgIn(List<String> values) {
			addCriterion("app_img in", values, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgNotIn(List<String> values) {
			addCriterion("app_img not in", values, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgBetween(String value1, String value2) {
			addCriterion("app_img between", value1, value2, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppImgNotBetween(String value1, String value2) {
			addCriterion("app_img not between", value1, value2, "appImg");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameIsNull() {
			addCriterion("app_brand_name is null");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameIsNotNull() {
			addCriterion("app_brand_name is not null");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameEqualTo(String value) {
			addCriterion("app_brand_name =", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameNotEqualTo(String value) {
			addCriterion("app_brand_name <>", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameGreaterThan(String value) {
			addCriterion("app_brand_name >", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameGreaterThanOrEqualTo(String value) {
			addCriterion("app_brand_name >=", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameLessThan(String value) {
			addCriterion("app_brand_name <", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameLessThanOrEqualTo(String value) {
			addCriterion("app_brand_name <=", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameLike(String value) {
			addCriterion("app_brand_name like", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameNotLike(String value) {
			addCriterion("app_brand_name not like", value, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameIn(List<String> values) {
			addCriterion("app_brand_name in", values, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameNotIn(List<String> values) {
			addCriterion("app_brand_name not in", values, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameBetween(String value1, String value2) {
			addCriterion("app_brand_name between", value1, value2, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppBrandNameNotBetween(String value1, String value2) {
			addCriterion("app_brand_name not between", value1, value2, "appBrandName");
			return (Criteria) this;
		}

		public Criteria andAppSortIsNull() {
			addCriterion("app_sort is null");
			return (Criteria) this;
		}

		public Criteria andAppSortIsNotNull() {
			addCriterion("app_sort is not null");
			return (Criteria) this;
		}

		public Criteria andAppSortEqualTo(Integer value) {
			addCriterion("app_sort =", value, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortNotEqualTo(Integer value) {
			addCriterion("app_sort <>", value, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortGreaterThan(Integer value) {
			addCriterion("app_sort >", value, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortGreaterThanOrEqualTo(Integer value) {
			addCriterion("app_sort >=", value, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortLessThan(Integer value) {
			addCriterion("app_sort <", value, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortLessThanOrEqualTo(Integer value) {
			addCriterion("app_sort <=", value, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortIn(List<Integer> values) {
			addCriterion("app_sort in", values, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortNotIn(List<Integer> values) {
			addCriterion("app_sort not in", values, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortBetween(Integer value1, Integer value2) {
			addCriterion("app_sort between", value1, value2, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppSortNotBetween(Integer value1, Integer value2) {
			addCriterion("app_sort not between", value1, value2, "appSort");
			return (Criteria) this;
		}

		public Criteria andAppShowIsNull() {
			addCriterion("app_show is null");
			return (Criteria) this;
		}

		public Criteria andAppShowIsNotNull() {
			addCriterion("app_show is not null");
			return (Criteria) this;
		}

		public Criteria andAppShowEqualTo(Boolean value) {
			addCriterion("app_show =", value, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowNotEqualTo(Boolean value) {
			addCriterion("app_show <>", value, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowGreaterThan(Boolean value) {
			addCriterion("app_show >", value, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowGreaterThanOrEqualTo(Boolean value) {
			addCriterion("app_show >=", value, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowLessThan(Boolean value) {
			addCriterion("app_show <", value, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowLessThanOrEqualTo(Boolean value) {
			addCriterion("app_show <=", value, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowIn(List<Boolean> values) {
			addCriterion("app_show in", values, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowNotIn(List<Boolean> values) {
			addCriterion("app_show not in", values, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowBetween(Boolean value1, Boolean value2) {
			addCriterion("app_show between", value1, value2, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppShowNotBetween(Boolean value1, Boolean value2) {
			addCriterion("app_show not between", value1, value2, "appShow");
			return (Criteria) this;
		}

		public Criteria andAppStatusIsNull() {
			addCriterion("app_status is null");
			return (Criteria) this;
		}

		public Criteria andAppStatusIsNotNull() {
			addCriterion("app_status is not null");
			return (Criteria) this;
		}

		public Criteria andAppStatusEqualTo(Boolean value) {
			addCriterion("app_status =", value, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusNotEqualTo(Boolean value) {
			addCriterion("app_status <>", value, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusGreaterThan(Boolean value) {
			addCriterion("app_status >", value, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusGreaterThanOrEqualTo(Boolean value) {
			addCriterion("app_status >=", value, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusLessThan(Boolean value) {
			addCriterion("app_status <", value, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusLessThanOrEqualTo(Boolean value) {
			addCriterion("app_status <=", value, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusIn(List<Boolean> values) {
			addCriterion("app_status in", values, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusNotIn(List<Boolean> values) {
			addCriterion("app_status not in", values, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusBetween(Boolean value1, Boolean value2) {
			addCriterion("app_status between", value1, value2, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppStatusNotBetween(Boolean value1, Boolean value2) {
			addCriterion("app_status not between", value1, value2, "appStatus");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgIsNull() {
			addCriterion("app_small_img is null");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgIsNotNull() {
			addCriterion("app_small_img is not null");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgEqualTo(String value) {
			addCriterion("app_small_img =", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgNotEqualTo(String value) {
			addCriterion("app_small_img <>", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgGreaterThan(String value) {
			addCriterion("app_small_img >", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgGreaterThanOrEqualTo(String value) {
			addCriterion("app_small_img >=", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgLessThan(String value) {
			addCriterion("app_small_img <", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgLessThanOrEqualTo(String value) {
			addCriterion("app_small_img <=", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgLike(String value) {
			addCriterion("app_small_img like", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgNotLike(String value) {
			addCriterion("app_small_img not like", value, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgIn(List<String> values) {
			addCriterion("app_small_img in", values, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgNotIn(List<String> values) {
			addCriterion("app_small_img not in", values, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgBetween(String value1, String value2) {
			addCriterion("app_small_img between", value1, value2, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andAppSmallImgNotBetween(String value1, String value2) {
			addCriterion("app_small_img not between", value1, value2, "appSmallImg");
			return (Criteria) this;
		}

		public Criteria andOriginIsNull() {
			addCriterion("origin is null");
			return (Criteria) this;
		}

		public Criteria andOriginIsNotNull() {
			addCriterion("origin is not null");
			return (Criteria) this;
		}

		public Criteria andOriginEqualTo(String value) {
			addCriterion("origin =", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotEqualTo(String value) {
			addCriterion("origin <>", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginGreaterThan(String value) {
			addCriterion("origin >", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginGreaterThanOrEqualTo(String value) {
			addCriterion("origin >=", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginLessThan(String value) {
			addCriterion("origin <", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginLessThanOrEqualTo(String value) {
			addCriterion("origin <=", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginLike(String value) {
			addCriterion("origin like", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotLike(String value) {
			addCriterion("origin not like", value, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginIn(List<String> values) {
			addCriterion("origin in", values, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotIn(List<String> values) {
			addCriterion("origin not in", values, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginBetween(String value1, String value2) {
			addCriterion("origin between", value1, value2, "origin");
			return (Criteria) this;
		}

		public Criteria andOriginNotBetween(String value1, String value2) {
			addCriterion("origin not between", value1, value2, "origin");
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