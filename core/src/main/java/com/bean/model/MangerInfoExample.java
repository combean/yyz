package com.bean.model;

import java.util.ArrayList;
import java.util.List;

public class MangerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MangerInfoExample() {
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

        public Criteria andManagerInfoIdIsNull() {
            addCriterion("manager_info_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdIsNotNull() {
            addCriterion("manager_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdEqualTo(Integer value) {
            addCriterion("manager_info_id =", value, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdNotEqualTo(Integer value) {
            addCriterion("manager_info_id <>", value, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdGreaterThan(Integer value) {
            addCriterion("manager_info_id >", value, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_info_id >=", value, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdLessThan(Integer value) {
            addCriterion("manager_info_id <", value, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_info_id <=", value, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdIn(List<Integer> values) {
            addCriterion("manager_info_id in", values, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdNotIn(List<Integer> values) {
            addCriterion("manager_info_id not in", values, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_info_id between", value1, value2, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_info_id not between", value1, value2, "managerInfoId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Integer value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Integer value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Integer value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Integer value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Integer> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Integer> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerMobileIsNull() {
            addCriterion("manager_mobile is null");
            return (Criteria) this;
        }

        public Criteria andManagerMobileIsNotNull() {
            addCriterion("manager_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andManagerMobileEqualTo(String value) {
            addCriterion("manager_mobile =", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileNotEqualTo(String value) {
            addCriterion("manager_mobile <>", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileGreaterThan(String value) {
            addCriterion("manager_mobile >", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileGreaterThanOrEqualTo(String value) {
            addCriterion("manager_mobile >=", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileLessThan(String value) {
            addCriterion("manager_mobile <", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileLessThanOrEqualTo(String value) {
            addCriterion("manager_mobile <=", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileLike(String value) {
            addCriterion("manager_mobile like", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileNotLike(String value) {
            addCriterion("manager_mobile not like", value, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileIn(List<String> values) {
            addCriterion("manager_mobile in", values, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileNotIn(List<String> values) {
            addCriterion("manager_mobile not in", values, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileBetween(String value1, String value2) {
            addCriterion("manager_mobile between", value1, value2, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerMobileNotBetween(String value1, String value2) {
            addCriterion("manager_mobile not between", value1, value2, "managerMobile");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("manager_name is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("manager_name is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("manager_name =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("manager_name <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("manager_name >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_name >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("manager_name <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("manager_name <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("manager_name like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("manager_name not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("manager_name in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("manager_name not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("manager_name between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("manager_name not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgIsNull() {
            addCriterion("manager_profile_img is null");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgIsNotNull() {
            addCriterion("manager_profile_img is not null");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgEqualTo(String value) {
            addCriterion("manager_profile_img =", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgNotEqualTo(String value) {
            addCriterion("manager_profile_img <>", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgGreaterThan(String value) {
            addCriterion("manager_profile_img >", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgGreaterThanOrEqualTo(String value) {
            addCriterion("manager_profile_img >=", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgLessThan(String value) {
            addCriterion("manager_profile_img <", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgLessThanOrEqualTo(String value) {
            addCriterion("manager_profile_img <=", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgLike(String value) {
            addCriterion("manager_profile_img like", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgNotLike(String value) {
            addCriterion("manager_profile_img not like", value, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgIn(List<String> values) {
            addCriterion("manager_profile_img in", values, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgNotIn(List<String> values) {
            addCriterion("manager_profile_img not in", values, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgBetween(String value1, String value2) {
            addCriterion("manager_profile_img between", value1, value2, "managerProfileImg");
            return (Criteria) this;
        }

        public Criteria andManagerProfileImgNotBetween(String value1, String value2) {
            addCriterion("manager_profile_img not between", value1, value2, "managerProfileImg");
            return (Criteria) this;
        }
    }

    /**
     */
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