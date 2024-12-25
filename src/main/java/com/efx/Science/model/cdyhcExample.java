package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdyhcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdyhcExample() {
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

        public Criteria andYhc001IsNull() {
            addCriterion("YHC001 is null");
            return (Criteria) this;
        }

        public Criteria andYhc001IsNotNull() {
            addCriterion("YHC001 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc001EqualTo(Integer value) {
            addCriterion("YHC001 =", value, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001NotEqualTo(Integer value) {
            addCriterion("YHC001 <>", value, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001GreaterThan(Integer value) {
            addCriterion("YHC001 >", value, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHC001 >=", value, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001LessThan(Integer value) {
            addCriterion("YHC001 <", value, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001LessThanOrEqualTo(Integer value) {
            addCriterion("YHC001 <=", value, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001In(List<Integer> values) {
            addCriterion("YHC001 in", values, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001NotIn(List<Integer> values) {
            addCriterion("YHC001 not in", values, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001Between(Integer value1, Integer value2) {
            addCriterion("YHC001 between", value1, value2, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc001NotBetween(Integer value1, Integer value2) {
            addCriterion("YHC001 not between", value1, value2, "yhc001");
            return (Criteria) this;
        }

        public Criteria andYhc002IsNull() {
            addCriterion("YHC002 is null");
            return (Criteria) this;
        }

        public Criteria andYhc002IsNotNull() {
            addCriterion("YHC002 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc002EqualTo(Integer value) {
            addCriterion("YHC002 =", value, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002NotEqualTo(Integer value) {
            addCriterion("YHC002 <>", value, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002GreaterThan(Integer value) {
            addCriterion("YHC002 >", value, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHC002 >=", value, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002LessThan(Integer value) {
            addCriterion("YHC002 <", value, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002LessThanOrEqualTo(Integer value) {
            addCriterion("YHC002 <=", value, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002In(List<Integer> values) {
            addCriterion("YHC002 in", values, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002NotIn(List<Integer> values) {
            addCriterion("YHC002 not in", values, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002Between(Integer value1, Integer value2) {
            addCriterion("YHC002 between", value1, value2, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc002NotBetween(Integer value1, Integer value2) {
            addCriterion("YHC002 not between", value1, value2, "yhc002");
            return (Criteria) this;
        }

        public Criteria andYhc003IsNull() {
            addCriterion("YHC003 is null");
            return (Criteria) this;
        }

        public Criteria andYhc003IsNotNull() {
            addCriterion("YHC003 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc003EqualTo(String value) {
            addCriterion("YHC003 =", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003NotEqualTo(String value) {
            addCriterion("YHC003 <>", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003GreaterThan(String value) {
            addCriterion("YHC003 >", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003GreaterThanOrEqualTo(String value) {
            addCriterion("YHC003 >=", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003LessThan(String value) {
            addCriterion("YHC003 <", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003LessThanOrEqualTo(String value) {
            addCriterion("YHC003 <=", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003Like(String value) {
            addCriterion("YHC003 like", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003NotLike(String value) {
            addCriterion("YHC003 not like", value, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003In(List<String> values) {
            addCriterion("YHC003 in", values, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003NotIn(List<String> values) {
            addCriterion("YHC003 not in", values, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003Between(String value1, String value2) {
            addCriterion("YHC003 between", value1, value2, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc003NotBetween(String value1, String value2) {
            addCriterion("YHC003 not between", value1, value2, "yhc003");
            return (Criteria) this;
        }

        public Criteria andYhc005IsNull() {
            addCriterion("YHC005 is null");
            return (Criteria) this;
        }

        public Criteria andYhc005IsNotNull() {
            addCriterion("YHC005 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc005EqualTo(Integer value) {
            addCriterion("YHC005 =", value, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005NotEqualTo(Integer value) {
            addCriterion("YHC005 <>", value, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005GreaterThan(Integer value) {
            addCriterion("YHC005 >", value, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHC005 >=", value, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005LessThan(Integer value) {
            addCriterion("YHC005 <", value, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005LessThanOrEqualTo(Integer value) {
            addCriterion("YHC005 <=", value, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005In(List<Integer> values) {
            addCriterion("YHC005 in", values, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005NotIn(List<Integer> values) {
            addCriterion("YHC005 not in", values, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005Between(Integer value1, Integer value2) {
            addCriterion("YHC005 between", value1, value2, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc005NotBetween(Integer value1, Integer value2) {
            addCriterion("YHC005 not between", value1, value2, "yhc005");
            return (Criteria) this;
        }

        public Criteria andYhc006IsNull() {
            addCriterion("YHC006 is null");
            return (Criteria) this;
        }

        public Criteria andYhc006IsNotNull() {
            addCriterion("YHC006 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc006EqualTo(Date value) {
            addCriterion("YHC006 =", value, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006NotEqualTo(Date value) {
            addCriterion("YHC006 <>", value, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006GreaterThan(Date value) {
            addCriterion("YHC006 >", value, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006GreaterThanOrEqualTo(Date value) {
            addCriterion("YHC006 >=", value, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006LessThan(Date value) {
            addCriterion("YHC006 <", value, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006LessThanOrEqualTo(Date value) {
            addCriterion("YHC006 <=", value, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006In(List<Date> values) {
            addCriterion("YHC006 in", values, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006NotIn(List<Date> values) {
            addCriterion("YHC006 not in", values, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006Between(Date value1, Date value2) {
            addCriterion("YHC006 between", value1, value2, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc006NotBetween(Date value1, Date value2) {
            addCriterion("YHC006 not between", value1, value2, "yhc006");
            return (Criteria) this;
        }

        public Criteria andYhc007IsNull() {
            addCriterion("YHC007 is null");
            return (Criteria) this;
        }

        public Criteria andYhc007IsNotNull() {
            addCriterion("YHC007 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc007EqualTo(String value) {
            addCriterion("YHC007 =", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007NotEqualTo(String value) {
            addCriterion("YHC007 <>", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007GreaterThan(String value) {
            addCriterion("YHC007 >", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007GreaterThanOrEqualTo(String value) {
            addCriterion("YHC007 >=", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007LessThan(String value) {
            addCriterion("YHC007 <", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007LessThanOrEqualTo(String value) {
            addCriterion("YHC007 <=", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007Like(String value) {
            addCriterion("YHC007 like", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007NotLike(String value) {
            addCriterion("YHC007 not like", value, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007In(List<String> values) {
            addCriterion("YHC007 in", values, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007NotIn(List<String> values) {
            addCriterion("YHC007 not in", values, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007Between(String value1, String value2) {
            addCriterion("YHC007 between", value1, value2, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc007NotBetween(String value1, String value2) {
            addCriterion("YHC007 not between", value1, value2, "yhc007");
            return (Criteria) this;
        }

        public Criteria andYhc008IsNull() {
            addCriterion("YHC008 is null");
            return (Criteria) this;
        }

        public Criteria andYhc008IsNotNull() {
            addCriterion("YHC008 is not null");
            return (Criteria) this;
        }

        public Criteria andYhc008EqualTo(String value) {
            addCriterion("YHC008 =", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008NotEqualTo(String value) {
            addCriterion("YHC008 <>", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008GreaterThan(String value) {
            addCriterion("YHC008 >", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008GreaterThanOrEqualTo(String value) {
            addCriterion("YHC008 >=", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008LessThan(String value) {
            addCriterion("YHC008 <", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008LessThanOrEqualTo(String value) {
            addCriterion("YHC008 <=", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008Like(String value) {
            addCriterion("YHC008 like", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008NotLike(String value) {
            addCriterion("YHC008 not like", value, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008In(List<String> values) {
            addCriterion("YHC008 in", values, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008NotIn(List<String> values) {
            addCriterion("YHC008 not in", values, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008Between(String value1, String value2) {
            addCriterion("YHC008 between", value1, value2, "yhc008");
            return (Criteria) this;
        }

        public Criteria andYhc008NotBetween(String value1, String value2) {
            addCriterion("YHC008 not between", value1, value2, "yhc008");
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