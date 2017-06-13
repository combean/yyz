package com.pxjx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExamAnswerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExamAnswerExample() {
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

        public Criteria andUserExamAnswerIdIsNull() {
            addCriterion("user_exam_answer_id is null");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdIsNotNull() {
            addCriterion("user_exam_answer_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdEqualTo(Integer value) {
            addCriterion("user_exam_answer_id =", value, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdNotEqualTo(Integer value) {
            addCriterion("user_exam_answer_id <>", value, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdGreaterThan(Integer value) {
            addCriterion("user_exam_answer_id >", value, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_exam_answer_id >=", value, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdLessThan(Integer value) {
            addCriterion("user_exam_answer_id <", value, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_exam_answer_id <=", value, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdIn(List<Integer> values) {
            addCriterion("user_exam_answer_id in", values, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdNotIn(List<Integer> values) {
            addCriterion("user_exam_answer_id not in", values, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdBetween(Integer value1, Integer value2) {
            addCriterion("user_exam_answer_id between", value1, value2, "userExamAnswerId");
            return (Criteria) this;
        }

        public Criteria andUserExamAnswerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_exam_answer_id not between", value1, value2, "userExamAnswerId");
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

        public Criteria andBlankNoIsNull() {
            addCriterion("blank_no is null");
            return (Criteria) this;
        }

        public Criteria andBlankNoIsNotNull() {
            addCriterion("blank_no is not null");
            return (Criteria) this;
        }

        public Criteria andBlankNoEqualTo(Integer value) {
            addCriterion("blank_no =", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotEqualTo(Integer value) {
            addCriterion("blank_no <>", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoGreaterThan(Integer value) {
            addCriterion("blank_no >", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("blank_no >=", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoLessThan(Integer value) {
            addCriterion("blank_no <", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoLessThanOrEqualTo(Integer value) {
            addCriterion("blank_no <=", value, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoIn(List<Integer> values) {
            addCriterion("blank_no in", values, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotIn(List<Integer> values) {
            addCriterion("blank_no not in", values, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoBetween(Integer value1, Integer value2) {
            addCriterion("blank_no between", value1, value2, "blankNo");
            return (Criteria) this;
        }

        public Criteria andBlankNoNotBetween(Integer value1, Integer value2) {
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

        public Criteria andIfRightIsNull() {
            addCriterion("if_right is null");
            return (Criteria) this;
        }

        public Criteria andIfRightIsNotNull() {
            addCriterion("if_right is not null");
            return (Criteria) this;
        }

        public Criteria andIfRightEqualTo(Boolean value) {
            addCriterion("if_right =", value, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightNotEqualTo(Boolean value) {
            addCriterion("if_right <>", value, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightGreaterThan(Boolean value) {
            addCriterion("if_right >", value, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_right >=", value, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightLessThan(Boolean value) {
            addCriterion("if_right <", value, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightLessThanOrEqualTo(Boolean value) {
            addCriterion("if_right <=", value, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightIn(List<Boolean> values) {
            addCriterion("if_right in", values, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightNotIn(List<Boolean> values) {
            addCriterion("if_right not in", values, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightBetween(Boolean value1, Boolean value2) {
            addCriterion("if_right between", value1, value2, "ifRight");
            return (Criteria) this;
        }

        public Criteria andIfRightNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_right not between", value1, value2, "ifRight");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNull() {
            addCriterion("answer_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNotNull() {
            addCriterion("answer_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeEqualTo(Date value) {
            addCriterion("answer_time =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotEqualTo(Date value) {
            addCriterion("answer_time <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThan(Date value) {
            addCriterion("answer_time >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_time >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThan(Date value) {
            addCriterion("answer_time <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_time <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIn(List<Date> values) {
            addCriterion("answer_time in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotIn(List<Date> values) {
            addCriterion("answer_time not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeBetween(Date value1, Date value2) {
            addCriterion("answer_time between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_time not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeIsNull() {
            addCriterion("answer_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeIsNotNull() {
            addCriterion("answer_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeEqualTo(Date value) {
            addCriterion("answer_edit_time =", value, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeNotEqualTo(Date value) {
            addCriterion("answer_edit_time <>", value, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeGreaterThan(Date value) {
            addCriterion("answer_edit_time >", value, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("answer_edit_time >=", value, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeLessThan(Date value) {
            addCriterion("answer_edit_time <", value, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("answer_edit_time <=", value, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeIn(List<Date> values) {
            addCriterion("answer_edit_time in", values, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeNotIn(List<Date> values) {
            addCriterion("answer_edit_time not in", values, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeBetween(Date value1, Date value2) {
            addCriterion("answer_edit_time between", value1, value2, "answerEditTime");
            return (Criteria) this;
        }

        public Criteria andAnswerEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("answer_edit_time not between", value1, value2, "answerEditTime");
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