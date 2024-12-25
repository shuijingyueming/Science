package com.efx.Science.model;

import java.util.ArrayList;
import java.util.List;

public class cdhbbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdhbbExample() {
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

        public Criteria andHbb001IsNull() {
            addCriterion("HBB001 is null");
            return (Criteria) this;
        }

        public Criteria andHbb001IsNotNull() {
            addCriterion("HBB001 is not null");
            return (Criteria) this;
        }

        public Criteria andHbb001EqualTo(Integer value) {
            addCriterion("HBB001 =", value, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001NotEqualTo(Integer value) {
            addCriterion("HBB001 <>", value, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001GreaterThan(Integer value) {
            addCriterion("HBB001 >", value, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBB001 >=", value, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001LessThan(Integer value) {
            addCriterion("HBB001 <", value, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001LessThanOrEqualTo(Integer value) {
            addCriterion("HBB001 <=", value, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001In(List<Integer> values) {
            addCriterion("HBB001 in", values, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001NotIn(List<Integer> values) {
            addCriterion("HBB001 not in", values, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001Between(Integer value1, Integer value2) {
            addCriterion("HBB001 between", value1, value2, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb001NotBetween(Integer value1, Integer value2) {
            addCriterion("HBB001 not between", value1, value2, "hbb001");
            return (Criteria) this;
        }

        public Criteria andHbb002IsNull() {
            addCriterion("HBB002 is null");
            return (Criteria) this;
        }

        public Criteria andHbb002IsNotNull() {
            addCriterion("HBB002 is not null");
            return (Criteria) this;
        }

        public Criteria andHbb002EqualTo(String value) {
            addCriterion("HBB002 =", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002NotEqualTo(String value) {
            addCriterion("HBB002 <>", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002GreaterThan(String value) {
            addCriterion("HBB002 >", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002GreaterThanOrEqualTo(String value) {
            addCriterion("HBB002 >=", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002LessThan(String value) {
            addCriterion("HBB002 <", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002LessThanOrEqualTo(String value) {
            addCriterion("HBB002 <=", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002Like(String value) {
            addCriterion("HBB002 like", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002NotLike(String value) {
            addCriterion("HBB002 not like", value, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002In(List<String> values) {
            addCriterion("HBB002 in", values, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002NotIn(List<String> values) {
            addCriterion("HBB002 not in", values, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002Between(String value1, String value2) {
            addCriterion("HBB002 between", value1, value2, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb002NotBetween(String value1, String value2) {
            addCriterion("HBB002 not between", value1, value2, "hbb002");
            return (Criteria) this;
        }

        public Criteria andHbb003IsNull() {
            addCriterion("HBB003 is null");
            return (Criteria) this;
        }

        public Criteria andHbb003IsNotNull() {
            addCriterion("HBB003 is not null");
            return (Criteria) this;
        }

        public Criteria andHbb003EqualTo(Integer value) {
            addCriterion("HBB003 =", value, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003NotEqualTo(Integer value) {
            addCriterion("HBB003 <>", value, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003GreaterThan(Integer value) {
            addCriterion("HBB003 >", value, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBB003 >=", value, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003LessThan(Integer value) {
            addCriterion("HBB003 <", value, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003LessThanOrEqualTo(Integer value) {
            addCriterion("HBB003 <=", value, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003In(List<Integer> values) {
            addCriterion("HBB003 in", values, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003NotIn(List<Integer> values) {
            addCriterion("HBB003 not in", values, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003Between(Integer value1, Integer value2) {
            addCriterion("HBB003 between", value1, value2, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb003NotBetween(Integer value1, Integer value2) {
            addCriterion("HBB003 not between", value1, value2, "hbb003");
            return (Criteria) this;
        }

        public Criteria andHbb004IsNull() {
            addCriterion("HBB004 is null");
            return (Criteria) this;
        }

        public Criteria andHbb004IsNotNull() {
            addCriterion("HBB004 is not null");
            return (Criteria) this;
        }

        public Criteria andHbb004EqualTo(String value) {
            addCriterion("HBB004 =", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004NotEqualTo(String value) {
            addCriterion("HBB004 <>", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004GreaterThan(String value) {
            addCriterion("HBB004 >", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004GreaterThanOrEqualTo(String value) {
            addCriterion("HBB004 >=", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004LessThan(String value) {
            addCriterion("HBB004 <", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004LessThanOrEqualTo(String value) {
            addCriterion("HBB004 <=", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004Like(String value) {
            addCriterion("HBB004 like", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004NotLike(String value) {
            addCriterion("HBB004 not like", value, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004In(List<String> values) {
            addCriterion("HBB004 in", values, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004NotIn(List<String> values) {
            addCriterion("HBB004 not in", values, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004Between(String value1, String value2) {
            addCriterion("HBB004 between", value1, value2, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb004NotBetween(String value1, String value2) {
            addCriterion("HBB004 not between", value1, value2, "hbb004");
            return (Criteria) this;
        }

        public Criteria andHbb005IsNull() {
            addCriterion("HBB005 is null");
            return (Criteria) this;
        }

        public Criteria andHbb005IsNotNull() {
            addCriterion("HBB005 is not null");
            return (Criteria) this;
        }

        public Criteria andHbb005EqualTo(String value) {
            addCriterion("HBB005 =", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005NotEqualTo(String value) {
            addCriterion("HBB005 <>", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005GreaterThan(String value) {
            addCriterion("HBB005 >", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005GreaterThanOrEqualTo(String value) {
            addCriterion("HBB005 >=", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005LessThan(String value) {
            addCriterion("HBB005 <", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005LessThanOrEqualTo(String value) {
            addCriterion("HBB005 <=", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005Like(String value) {
            addCriterion("HBB005 like", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005NotLike(String value) {
            addCriterion("HBB005 not like", value, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005In(List<String> values) {
            addCriterion("HBB005 in", values, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005NotIn(List<String> values) {
            addCriterion("HBB005 not in", values, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005Between(String value1, String value2) {
            addCriterion("HBB005 between", value1, value2, "hbb005");
            return (Criteria) this;
        }

        public Criteria andHbb005NotBetween(String value1, String value2) {
            addCriterion("HBB005 not between", value1, value2, "hbb005");
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