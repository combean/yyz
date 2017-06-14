package com.bean.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Boolean value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Boolean value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Boolean value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Boolean value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Boolean value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Boolean> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Boolean> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Boolean value1, Boolean value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andAddnameIsNull() {
            addCriterion("addname is null");
            return (Criteria) this;
        }

        public Criteria andAddnameIsNotNull() {
            addCriterion("addname is not null");
            return (Criteria) this;
        }

        public Criteria andAddnameEqualTo(String value) {
            addCriterion("addname =", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotEqualTo(String value) {
            addCriterion("addname <>", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameGreaterThan(String value) {
            addCriterion("addname >", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameGreaterThanOrEqualTo(String value) {
            addCriterion("addname >=", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameLessThan(String value) {
            addCriterion("addname <", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameLessThanOrEqualTo(String value) {
            addCriterion("addname <=", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameLike(String value) {
            addCriterion("addname like", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotLike(String value) {
            addCriterion("addname not like", value, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameIn(List<String> values) {
            addCriterion("addname in", values, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotIn(List<String> values) {
            addCriterion("addname not in", values, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameBetween(String value1, String value2) {
            addCriterion("addname between", value1, value2, "addname");
            return (Criteria) this;
        }

        public Criteria andAddnameNotBetween(String value1, String value2) {
            addCriterion("addname not between", value1, value2, "addname");
            return (Criteria) this;
        }

        public Criteria andAddidIsNull() {
            addCriterion("addid is null");
            return (Criteria) this;
        }

        public Criteria andAddidIsNotNull() {
            addCriterion("addid is not null");
            return (Criteria) this;
        }

        public Criteria andAddidEqualTo(Integer value) {
            addCriterion("addid =", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotEqualTo(Integer value) {
            addCriterion("addid <>", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidGreaterThan(Integer value) {
            addCriterion("addid >", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidGreaterThanOrEqualTo(Integer value) {
            addCriterion("addid >=", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidLessThan(Integer value) {
            addCriterion("addid <", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidLessThanOrEqualTo(Integer value) {
            addCriterion("addid <=", value, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidIn(List<Integer> values) {
            addCriterion("addid in", values, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotIn(List<Integer> values) {
            addCriterion("addid not in", values, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidBetween(Integer value1, Integer value2) {
            addCriterion("addid between", value1, value2, "addid");
            return (Criteria) this;
        }

        public Criteria andAddidNotBetween(Integer value1, Integer value2) {
            addCriterion("addid not between", value1, value2, "addid");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andEditnameIsNull() {
            addCriterion("editname is null");
            return (Criteria) this;
        }

        public Criteria andEditnameIsNotNull() {
            addCriterion("editname is not null");
            return (Criteria) this;
        }

        public Criteria andEditnameEqualTo(String value) {
            addCriterion("editname =", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameNotEqualTo(String value) {
            addCriterion("editname <>", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameGreaterThan(String value) {
            addCriterion("editname >", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameGreaterThanOrEqualTo(String value) {
            addCriterion("editname >=", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameLessThan(String value) {
            addCriterion("editname <", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameLessThanOrEqualTo(String value) {
            addCriterion("editname <=", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameLike(String value) {
            addCriterion("editname like", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameNotLike(String value) {
            addCriterion("editname not like", value, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameIn(List<String> values) {
            addCriterion("editname in", values, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameNotIn(List<String> values) {
            addCriterion("editname not in", values, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameBetween(String value1, String value2) {
            addCriterion("editname between", value1, value2, "editname");
            return (Criteria) this;
        }

        public Criteria andEditnameNotBetween(String value1, String value2) {
            addCriterion("editname not between", value1, value2, "editname");
            return (Criteria) this;
        }

        public Criteria andEditidIsNull() {
            addCriterion("editid is null");
            return (Criteria) this;
        }

        public Criteria andEditidIsNotNull() {
            addCriterion("editid is not null");
            return (Criteria) this;
        }

        public Criteria andEditidEqualTo(Integer value) {
            addCriterion("editid =", value, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidNotEqualTo(Integer value) {
            addCriterion("editid <>", value, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidGreaterThan(Integer value) {
            addCriterion("editid >", value, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidGreaterThanOrEqualTo(Integer value) {
            addCriterion("editid >=", value, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidLessThan(Integer value) {
            addCriterion("editid <", value, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidLessThanOrEqualTo(Integer value) {
            addCriterion("editid <=", value, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidIn(List<Integer> values) {
            addCriterion("editid in", values, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidNotIn(List<Integer> values) {
            addCriterion("editid not in", values, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidBetween(Integer value1, Integer value2) {
            addCriterion("editid between", value1, value2, "editid");
            return (Criteria) this;
        }

        public Criteria andEditidNotBetween(Integer value1, Integer value2) {
            addCriterion("editid not between", value1, value2, "editid");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andDeleteidIsNull() {
            addCriterion("deleteid is null");
            return (Criteria) this;
        }

        public Criteria andDeleteidIsNotNull() {
            addCriterion("deleteid is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteidEqualTo(Integer value) {
            addCriterion("deleteid =", value, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidNotEqualTo(Integer value) {
            addCriterion("deleteid <>", value, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidGreaterThan(Integer value) {
            addCriterion("deleteid >", value, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleteid >=", value, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidLessThan(Integer value) {
            addCriterion("deleteid <", value, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidLessThanOrEqualTo(Integer value) {
            addCriterion("deleteid <=", value, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidIn(List<Integer> values) {
            addCriterion("deleteid in", values, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidNotIn(List<Integer> values) {
            addCriterion("deleteid not in", values, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidBetween(Integer value1, Integer value2) {
            addCriterion("deleteid between", value1, value2, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeleteidNotBetween(Integer value1, Integer value2) {
            addCriterion("deleteid not between", value1, value2, "deleteid");
            return (Criteria) this;
        }

        public Criteria andDeletenameIsNull() {
            addCriterion("deletename is null");
            return (Criteria) this;
        }

        public Criteria andDeletenameIsNotNull() {
            addCriterion("deletename is not null");
            return (Criteria) this;
        }

        public Criteria andDeletenameEqualTo(String value) {
            addCriterion("deletename =", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameNotEqualTo(String value) {
            addCriterion("deletename <>", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameGreaterThan(String value) {
            addCriterion("deletename >", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameGreaterThanOrEqualTo(String value) {
            addCriterion("deletename >=", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameLessThan(String value) {
            addCriterion("deletename <", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameLessThanOrEqualTo(String value) {
            addCriterion("deletename <=", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameLike(String value) {
            addCriterion("deletename like", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameNotLike(String value) {
            addCriterion("deletename not like", value, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameIn(List<String> values) {
            addCriterion("deletename in", values, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameNotIn(List<String> values) {
            addCriterion("deletename not in", values, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameBetween(String value1, String value2) {
            addCriterion("deletename between", value1, value2, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletenameNotBetween(String value1, String value2) {
            addCriterion("deletename not between", value1, value2, "deletename");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNull() {
            addCriterion("deletetime is null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNotNull() {
            addCriterion("deletetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeEqualTo(Date value) {
            addCriterion("deletetime =", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotEqualTo(Date value) {
            addCriterion("deletetime <>", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThan(Date value) {
            addCriterion("deletetime >", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deletetime >=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThan(Date value) {
            addCriterion("deletetime <", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("deletetime <=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIn(List<Date> values) {
            addCriterion("deletetime in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotIn(List<Date> values) {
            addCriterion("deletetime not in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeBetween(Date value1, Date value2) {
            addCriterion("deletetime between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("deletetime not between", value1, value2, "deletetime");
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