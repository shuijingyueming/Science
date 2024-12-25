package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdyhfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdyhfExample() {
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

        public Criteria andYhf001IsNull() {
            addCriterion("YHF001 is null");
            return (Criteria) this;
        }

        public Criteria andYhf001IsNotNull() {
            addCriterion("YHF001 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf001EqualTo(String value) {
            addCriterion("YHF001 =", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001NotEqualTo(String value) {
            addCriterion("YHF001 <>", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001GreaterThan(String value) {
            addCriterion("YHF001 >", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001GreaterThanOrEqualTo(String value) {
            addCriterion("YHF001 >=", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001LessThan(String value) {
            addCriterion("YHF001 <", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001LessThanOrEqualTo(String value) {
            addCriterion("YHF001 <=", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001Like(String value) {
            addCriterion("YHF001 like", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001NotLike(String value) {
            addCriterion("YHF001 not like", value, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001In(List<String> values) {
            addCriterion("YHF001 in", values, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001NotIn(List<String> values) {
            addCriterion("YHF001 not in", values, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001Between(String value1, String value2) {
            addCriterion("YHF001 between", value1, value2, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf001NotBetween(String value1, String value2) {
            addCriterion("YHF001 not between", value1, value2, "yhf001");
            return (Criteria) this;
        }

        public Criteria andYhf002IsNull() {
            addCriterion("YHF002 is null");
            return (Criteria) this;
        }

        public Criteria andYhf002IsNotNull() {
            addCriterion("YHF002 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf002EqualTo(Integer value) {
            addCriterion("YHF002 =", value, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002NotEqualTo(Integer value) {
            addCriterion("YHF002 <>", value, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002GreaterThan(Integer value) {
            addCriterion("YHF002 >", value, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHF002 >=", value, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002LessThan(Integer value) {
            addCriterion("YHF002 <", value, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002LessThanOrEqualTo(Integer value) {
            addCriterion("YHF002 <=", value, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002In(List<Integer> values) {
            addCriterion("YHF002 in", values, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002NotIn(List<Integer> values) {
            addCriterion("YHF002 not in", values, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002Between(Integer value1, Integer value2) {
            addCriterion("YHF002 between", value1, value2, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf002NotBetween(Integer value1, Integer value2) {
            addCriterion("YHF002 not between", value1, value2, "yhf002");
            return (Criteria) this;
        }

        public Criteria andYhf003IsNull() {
            addCriterion("YHF003 is null");
            return (Criteria) this;
        }

        public Criteria andYhf003IsNotNull() {
            addCriterion("YHF003 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf003EqualTo(String value) {
            addCriterion("YHF003 =", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003NotEqualTo(String value) {
            addCriterion("YHF003 <>", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003GreaterThan(String value) {
            addCriterion("YHF003 >", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003GreaterThanOrEqualTo(String value) {
            addCriterion("YHF003 >=", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003LessThan(String value) {
            addCriterion("YHF003 <", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003LessThanOrEqualTo(String value) {
            addCriterion("YHF003 <=", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003Like(String value) {
            addCriterion("YHF003 like", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003NotLike(String value) {
            addCriterion("YHF003 not like", value, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003In(List<String> values) {
            addCriterion("YHF003 in", values, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003NotIn(List<String> values) {
            addCriterion("YHF003 not in", values, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003Between(String value1, String value2) {
            addCriterion("YHF003 between", value1, value2, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf003NotBetween(String value1, String value2) {
            addCriterion("YHF003 not between", value1, value2, "yhf003");
            return (Criteria) this;
        }

        public Criteria andYhf004IsNull() {
            addCriterion("YHF004 is null");
            return (Criteria) this;
        }

        public Criteria andYhf004IsNotNull() {
            addCriterion("YHF004 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf004EqualTo(String value) {
            addCriterion("YHF004 =", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004NotEqualTo(String value) {
            addCriterion("YHF004 <>", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004GreaterThan(String value) {
            addCriterion("YHF004 >", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004GreaterThanOrEqualTo(String value) {
            addCriterion("YHF004 >=", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004LessThan(String value) {
            addCriterion("YHF004 <", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004LessThanOrEqualTo(String value) {
            addCriterion("YHF004 <=", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004Like(String value) {
            addCriterion("YHF004 like", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004NotLike(String value) {
            addCriterion("YHF004 not like", value, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004In(List<String> values) {
            addCriterion("YHF004 in", values, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004NotIn(List<String> values) {
            addCriterion("YHF004 not in", values, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004Between(String value1, String value2) {
            addCriterion("YHF004 between", value1, value2, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf004NotBetween(String value1, String value2) {
            addCriterion("YHF004 not between", value1, value2, "yhf004");
            return (Criteria) this;
        }

        public Criteria andYhf005IsNull() {
            addCriterion("YHF005 is null");
            return (Criteria) this;
        }

        public Criteria andYhf005IsNotNull() {
            addCriterion("YHF005 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf005EqualTo(String value) {
            addCriterion("YHF005 =", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005NotEqualTo(String value) {
            addCriterion("YHF005 <>", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005GreaterThan(String value) {
            addCriterion("YHF005 >", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005GreaterThanOrEqualTo(String value) {
            addCriterion("YHF005 >=", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005LessThan(String value) {
            addCriterion("YHF005 <", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005LessThanOrEqualTo(String value) {
            addCriterion("YHF005 <=", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005Like(String value) {
            addCriterion("YHF005 like", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005NotLike(String value) {
            addCriterion("YHF005 not like", value, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005In(List<String> values) {
            addCriterion("YHF005 in", values, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005NotIn(List<String> values) {
            addCriterion("YHF005 not in", values, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005Between(String value1, String value2) {
            addCriterion("YHF005 between", value1, value2, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf005NotBetween(String value1, String value2) {
            addCriterion("YHF005 not between", value1, value2, "yhf005");
            return (Criteria) this;
        }

        public Criteria andYhf006IsNull() {
            addCriterion("YHF006 is null");
            return (Criteria) this;
        }

        public Criteria andYhf006IsNotNull() {
            addCriterion("YHF006 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf006EqualTo(String value) {
            addCriterion("YHF006 =", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006NotEqualTo(String value) {
            addCriterion("YHF006 <>", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006GreaterThan(String value) {
            addCriterion("YHF006 >", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006GreaterThanOrEqualTo(String value) {
            addCriterion("YHF006 >=", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006LessThan(String value) {
            addCriterion("YHF006 <", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006LessThanOrEqualTo(String value) {
            addCriterion("YHF006 <=", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006Like(String value) {
            addCriterion("YHF006 like", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006NotLike(String value) {
            addCriterion("YHF006 not like", value, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006In(List<String> values) {
            addCriterion("YHF006 in", values, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006NotIn(List<String> values) {
            addCriterion("YHF006 not in", values, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006Between(String value1, String value2) {
            addCriterion("YHF006 between", value1, value2, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf006NotBetween(String value1, String value2) {
            addCriterion("YHF006 not between", value1, value2, "yhf006");
            return (Criteria) this;
        }

        public Criteria andYhf007IsNull() {
            addCriterion("YHF007 is null");
            return (Criteria) this;
        }

        public Criteria andYhf007IsNotNull() {
            addCriterion("YHF007 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf007EqualTo(Integer value) {
            addCriterion("YHF007 =", value, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007NotEqualTo(Integer value) {
            addCriterion("YHF007 <>", value, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007GreaterThan(Integer value) {
            addCriterion("YHF007 >", value, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHF007 >=", value, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007LessThan(Integer value) {
            addCriterion("YHF007 <", value, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007LessThanOrEqualTo(Integer value) {
            addCriterion("YHF007 <=", value, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007In(List<Integer> values) {
            addCriterion("YHF007 in", values, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007NotIn(List<Integer> values) {
            addCriterion("YHF007 not in", values, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007Between(Integer value1, Integer value2) {
            addCriterion("YHF007 between", value1, value2, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf007NotBetween(Integer value1, Integer value2) {
            addCriterion("YHF007 not between", value1, value2, "yhf007");
            return (Criteria) this;
        }

        public Criteria andYhf008IsNull() {
            addCriterion("YHF008 is null");
            return (Criteria) this;
        }

        public Criteria andYhf008IsNotNull() {
            addCriterion("YHF008 is not null");
            return (Criteria) this;
        }

        public Criteria andYhf008EqualTo(Date value) {
            addCriterion("YHF008 =", value, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008NotEqualTo(Date value) {
            addCriterion("YHF008 <>", value, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008GreaterThan(Date value) {
            addCriterion("YHF008 >", value, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008GreaterThanOrEqualTo(Date value) {
            addCriterion("YHF008 >=", value, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008LessThan(Date value) {
            addCriterion("YHF008 <", value, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008LessThanOrEqualTo(Date value) {
            addCriterion("YHF008 <=", value, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008In(List<Date> values) {
            addCriterion("YHF008 in", values, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008NotIn(List<Date> values) {
            addCriterion("YHF008 not in", values, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008Between(Date value1, Date value2) {
            addCriterion("YHF008 between", value1, value2, "yhf008");
            return (Criteria) this;
        }

        public Criteria andYhf008NotBetween(Date value1, Date value2) {
            addCriterion("YHF008 not between", value1, value2, "yhf008");
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