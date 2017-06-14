package com.bean.model;

import java.util.ArrayList;
import java.util.List;

public class PqtQuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PqtQuestionExample() {
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

        public Criteria andPqtQuestionIdIsNull() {
            addCriterion("pqt_question_id is null");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdIsNotNull() {
            addCriterion("pqt_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdEqualTo(Integer value) {
            addCriterion("pqt_question_id =", value, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdNotEqualTo(Integer value) {
            addCriterion("pqt_question_id <>", value, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdGreaterThan(Integer value) {
            addCriterion("pqt_question_id >", value, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pqt_question_id >=", value, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdLessThan(Integer value) {
            addCriterion("pqt_question_id <", value, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("pqt_question_id <=", value, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdIn(List<Integer> values) {
            addCriterion("pqt_question_id in", values, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdNotIn(List<Integer> values) {
            addCriterion("pqt_question_id not in", values, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("pqt_question_id between", value1, value2, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPqtQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pqt_question_id not between", value1, value2, "pqtQuestionId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdIsNull() {
            addCriterion("paper_question_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdIsNotNull() {
            addCriterion("paper_question_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdEqualTo(Integer value) {
            addCriterion("paper_question_type_id =", value, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdNotEqualTo(Integer value) {
            addCriterion("paper_question_type_id <>", value, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdGreaterThan(Integer value) {
            addCriterion("paper_question_type_id >", value, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_question_type_id >=", value, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdLessThan(Integer value) {
            addCriterion("paper_question_type_id <", value, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_question_type_id <=", value, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdIn(List<Integer> values) {
            addCriterion("paper_question_type_id in", values, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdNotIn(List<Integer> values) {
            addCriterion("paper_question_type_id not in", values, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_question_type_id between", value1, value2, "paperQuestionTypeId");
            return (Criteria) this;
        }

        public Criteria andPaperQuestionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_question_type_id not between", value1, value2, "paperQuestionTypeId");
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

        public Criteria andRawScoreIsNull() {
            addCriterion("raw_score is null");
            return (Criteria) this;
        }

        public Criteria andRawScoreIsNotNull() {
            addCriterion("raw_score is not null");
            return (Criteria) this;
        }

        public Criteria andRawScoreEqualTo(Float value) {
            addCriterion("raw_score =", value, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreNotEqualTo(Float value) {
            addCriterion("raw_score <>", value, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreGreaterThan(Float value) {
            addCriterion("raw_score >", value, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("raw_score >=", value, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreLessThan(Float value) {
            addCriterion("raw_score <", value, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreLessThanOrEqualTo(Float value) {
            addCriterion("raw_score <=", value, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreIn(List<Float> values) {
            addCriterion("raw_score in", values, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreNotIn(List<Float> values) {
            addCriterion("raw_score not in", values, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreBetween(Float value1, Float value2) {
            addCriterion("raw_score between", value1, value2, "rawScore");
            return (Criteria) this;
        }

        public Criteria andRawScoreNotBetween(Float value1, Float value2) {
            addCriterion("raw_score not between", value1, value2, "rawScore");
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