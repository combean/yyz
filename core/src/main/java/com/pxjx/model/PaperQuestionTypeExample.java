package com.pxjx.model;

import java.util.ArrayList;
import java.util.List;

public class PaperQuestionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperQuestionTypeExample() {
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

        public Criteria andTypeSequenceIsNull() {
            addCriterion("type_sequence is null");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceIsNotNull() {
            addCriterion("type_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceEqualTo(Integer value) {
            addCriterion("type_sequence =", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceNotEqualTo(Integer value) {
            addCriterion("type_sequence <>", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceGreaterThan(Integer value) {
            addCriterion("type_sequence >", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_sequence >=", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceLessThan(Integer value) {
            addCriterion("type_sequence <", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("type_sequence <=", value, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceIn(List<Integer> values) {
            addCriterion("type_sequence in", values, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceNotIn(List<Integer> values) {
            addCriterion("type_sequence not in", values, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceBetween(Integer value1, Integer value2) {
            addCriterion("type_sequence between", value1, value2, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("type_sequence not between", value1, value2, "typeSequence");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
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