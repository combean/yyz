package com.bean.model;

import java.util.ArrayList;
import java.util.List;

public class FillQuestionAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FillQuestionAnswerExample() {
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

        public Criteria andFillAnswerIdIsNull() {
            addCriterion("fill_answer_id is null");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdIsNotNull() {
            addCriterion("fill_answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdEqualTo(Integer value) {
            addCriterion("fill_answer_id =", value, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdNotEqualTo(Integer value) {
            addCriterion("fill_answer_id <>", value, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdGreaterThan(Integer value) {
            addCriterion("fill_answer_id >", value, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_answer_id >=", value, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdLessThan(Integer value) {
            addCriterion("fill_answer_id <", value, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("fill_answer_id <=", value, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdIn(List<Integer> values) {
            addCriterion("fill_answer_id in", values, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdNotIn(List<Integer> values) {
            addCriterion("fill_answer_id not in", values, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("fill_answer_id between", value1, value2, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andFillAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_answer_id not between", value1, value2, "fillAnswerId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andBlankNoIsNull() {
            addCriterion("blank_no is null");
            return (Criteria) this;
        }

        public Criteria andBlankNoIsNotNull() {
            addCriterion("blank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBlankNoEqualTo(String value) {
            addCriterion("blank_no =", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotEqualTo(String value) {
            addCriterion("blank_no <>", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoGreaterThan(String value) {
            addCriterion("blank_no >", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoGreaterThanOrEqualTo(String value) {
            addCriterion("blank_no >=", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoLessThan(String value) {
            addCriterion("blank_no <", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoLessThanOrEqualTo(String value) {
            addCriterion("blank_no <=", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoLike(String value) {
            addCriterion("blank_no like", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotLike(String value) {
            addCriterion("blank_no not like", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoIn(List<String> values) {
            addCriterion("blank_no in", values, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotIn(List<String> values) {
            addCriterion("blank_no not in", values, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoBetween(String value1, String value2) {
            addCriterion("blank_no between", value1, value2, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotBetween(String value1, String value2) {
            addCriterion("blank_no not between", value1, value2, "blankNo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoIsNull() {
            addCriterion("answer_info is null");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoIsNotNull() {
            addCriterion("answer_info is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoEqualTo(String value) {
            addCriterion("answer_info =", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoNotEqualTo(String value) {
            addCriterion("answer_info <>", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoGreaterThan(String value) {
            addCriterion("answer_info >", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoGreaterThanOrEqualTo(String value) {
            addCriterion("answer_info >=", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoLessThan(String value) {
            addCriterion("answer_info <", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoLessThanOrEqualTo(String value) {
            addCriterion("answer_info <=", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoLike(String value) {
            addCriterion("answer_info like", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoNotLike(String value) {
            addCriterion("answer_info not like", value, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoIn(List<String> values) {
            addCriterion("answer_info in", values, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoNotIn(List<String> values) {
            addCriterion("answer_info not in", values, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoBetween(String value1, String value2) {
            addCriterion("answer_info between", value1, value2, "answerInfo");
            return (Criteria) this;
        }

        public Criteria andAnswerInfoNotBetween(String value1, String value2) {
            addCriterion("answer_info not between", value1, value2, "answerInfo");
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