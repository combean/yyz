package com.bean.model;

import java.util.ArrayList;
import java.util.List;

public class AnalysisQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnalysisQuestionExample() {
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

        public Criteria andAnalysisQuestionIdIsNull() {
            addCriterion("analysis_question_id is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdIsNotNull() {
            addCriterion("analysis_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdEqualTo(Integer value) {
            addCriterion("analysis_question_id =", value, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdNotEqualTo(Integer value) {
            addCriterion("analysis_question_id <>", value, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdGreaterThan(Integer value) {
            addCriterion("analysis_question_id >", value, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("analysis_question_id >=", value, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdLessThan(Integer value) {
            addCriterion("analysis_question_id <", value, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("analysis_question_id <=", value, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdIn(List<Integer> values) {
            addCriterion("analysis_question_id in", values, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdNotIn(List<Integer> values) {
            addCriterion("analysis_question_id not in", values, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("analysis_question_id between", value1, value2, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnalysisQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("analysis_question_id not between", value1, value2, "analysisQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdIsNull() {
            addCriterion("f_question_id is null");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdIsNotNull() {
            addCriterion("f_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdEqualTo(Integer value) {
            addCriterion("f_question_id =", value, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdNotEqualTo(Integer value) {
            addCriterion("f_question_id <>", value, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdGreaterThan(Integer value) {
            addCriterion("f_question_id >", value, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_question_id >=", value, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdLessThan(Integer value) {
            addCriterion("f_question_id <", value, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_question_id <=", value, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdIn(List<Integer> values) {
            addCriterion("f_question_id in", values, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdNotIn(List<Integer> values) {
            addCriterion("f_question_id not in", values, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("f_question_id between", value1, value2, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andFQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_question_id not between", value1, value2, "fQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdIsNull() {
            addCriterion("s_question_id is null");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdIsNotNull() {
            addCriterion("s_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdEqualTo(Integer value) {
            addCriterion("s_question_id =", value, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdNotEqualTo(Integer value) {
            addCriterion("s_question_id <>", value, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdGreaterThan(Integer value) {
            addCriterion("s_question_id >", value, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_question_id >=", value, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdLessThan(Integer value) {
            addCriterion("s_question_id <", value, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_question_id <=", value, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdIn(List<Integer> values) {
            addCriterion("s_question_id in", values, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdNotIn(List<Integer> values) {
            addCriterion("s_question_id not in", values, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("s_question_id between", value1, value2, "sQuestionId");
            return (Criteria) this;
        }

        public Criteria andSQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_question_id not between", value1, value2, "sQuestionId");
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