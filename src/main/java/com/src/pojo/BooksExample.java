package com.src.pojo;

import java.util.ArrayList;
import java.util.List;

public class BooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BooksExample() {
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

        public Criteria andBookIDIsNull() {
            addCriterion("bookID is null");
            return (Criteria) this;
        }

        public Criteria andBookIDIsNotNull() {
            addCriterion("bookID is not null");
            return (Criteria) this;
        }

        public Criteria andBookIDEqualTo(Integer value) {
            addCriterion("bookID =", value, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDNotEqualTo(Integer value) {
            addCriterion("bookID <>", value, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDGreaterThan(Integer value) {
            addCriterion("bookID >", value, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookID >=", value, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDLessThan(Integer value) {
            addCriterion("bookID <", value, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDLessThanOrEqualTo(Integer value) {
            addCriterion("bookID <=", value, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDIn(List<Integer> values) {
            addCriterion("bookID in", values, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDNotIn(List<Integer> values) {
            addCriterion("bookID not in", values, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDBetween(Integer value1, Integer value2) {
            addCriterion("bookID between", value1, value2, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookIDNotBetween(Integer value1, Integer value2) {
            addCriterion("bookID not between", value1, value2, "bookID");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNull() {
            addCriterion("bookName is null");
            return (Criteria) this;
        }

        public Criteria andBookNameIsNotNull() {
            addCriterion("bookName is not null");
            return (Criteria) this;
        }

        public Criteria andBookNameEqualTo(String value) {
            addCriterion("bookName =", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotEqualTo(String value) {
            addCriterion("bookName <>", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThan(String value) {
            addCriterion("bookName >", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("bookName >=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThan(String value) {
            addCriterion("bookName <", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLessThanOrEqualTo(String value) {
            addCriterion("bookName <=", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameLike(String value) {
            addCriterion("bookName like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotLike(String value) {
            addCriterion("bookName not like", value, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameIn(List<String> values) {
            addCriterion("bookName in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotIn(List<String> values) {
            addCriterion("bookName not in", values, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameBetween(String value1, String value2) {
            addCriterion("bookName between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookNameNotBetween(String value1, String value2) {
            addCriterion("bookName not between", value1, value2, "bookName");
            return (Criteria) this;
        }

        public Criteria andBookCountsIsNull() {
            addCriterion("bookCounts is null");
            return (Criteria) this;
        }

        public Criteria andBookCountsIsNotNull() {
            addCriterion("bookCounts is not null");
            return (Criteria) this;
        }

        public Criteria andBookCountsEqualTo(Integer value) {
            addCriterion("bookCounts =", value, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsNotEqualTo(Integer value) {
            addCriterion("bookCounts <>", value, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsGreaterThan(Integer value) {
            addCriterion("bookCounts >", value, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookCounts >=", value, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsLessThan(Integer value) {
            addCriterion("bookCounts <", value, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsLessThanOrEqualTo(Integer value) {
            addCriterion("bookCounts <=", value, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsIn(List<Integer> values) {
            addCriterion("bookCounts in", values, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsNotIn(List<Integer> values) {
            addCriterion("bookCounts not in", values, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsBetween(Integer value1, Integer value2) {
            addCriterion("bookCounts between", value1, value2, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andBookCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("bookCounts not between", value1, value2, "bookCounts");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
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