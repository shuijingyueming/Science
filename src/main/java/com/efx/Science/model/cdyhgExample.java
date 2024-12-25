package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdyhgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdyhgExample() {
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

        public Criteria andYhg001IsNull() {
            addCriterion("YHG001 is null");
            return (Criteria) this;
        }

        public Criteria andYhg001IsNotNull() {
            addCriterion("YHG001 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg001EqualTo(String value) {
            addCriterion("YHG001 =", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001NotEqualTo(String value) {
            addCriterion("YHG001 <>", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001GreaterThan(String value) {
            addCriterion("YHG001 >", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001GreaterThanOrEqualTo(String value) {
            addCriterion("YHG001 >=", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001LessThan(String value) {
            addCriterion("YHG001 <", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001LessThanOrEqualTo(String value) {
            addCriterion("YHG001 <=", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001Like(String value) {
            addCriterion("YHG001 like", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001NotLike(String value) {
            addCriterion("YHG001 not like", value, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001In(List<String> values) {
            addCriterion("YHG001 in", values, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001NotIn(List<String> values) {
            addCriterion("YHG001 not in", values, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001Between(String value1, String value2) {
            addCriterion("YHG001 between", value1, value2, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg001NotBetween(String value1, String value2) {
            addCriterion("YHG001 not between", value1, value2, "yhg001");
            return (Criteria) this;
        }

        public Criteria andYhg002IsNull() {
            addCriterion("YHG002 is null");
            return (Criteria) this;
        }

        public Criteria andYhg002IsNotNull() {
            addCriterion("YHG002 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg002EqualTo(String value) {
            addCriterion("YHG002 =", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002NotEqualTo(String value) {
            addCriterion("YHG002 <>", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002GreaterThan(String value) {
            addCriterion("YHG002 >", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002GreaterThanOrEqualTo(String value) {
            addCriterion("YHG002 >=", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002LessThan(String value) {
            addCriterion("YHG002 <", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002LessThanOrEqualTo(String value) {
            addCriterion("YHG002 <=", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002Like(String value) {
            addCriterion("YHG002 like", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002NotLike(String value) {
            addCriterion("YHG002 not like", value, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002In(List<String> values) {
            addCriterion("YHG002 in", values, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002NotIn(List<String> values) {
            addCriterion("YHG002 not in", values, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002Between(String value1, String value2) {
            addCriterion("YHG002 between", value1, value2, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg002NotBetween(String value1, String value2) {
            addCriterion("YHG002 not between", value1, value2, "yhg002");
            return (Criteria) this;
        }

        public Criteria andYhg003IsNull() {
            addCriterion("YHG003 is null");
            return (Criteria) this;
        }

        public Criteria andYhg003IsNotNull() {
            addCriterion("YHG003 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg003EqualTo(Date value) {
            addCriterion("YHG003 =", value, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003NotEqualTo(Date value) {
            addCriterion("YHG003 <>", value, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003GreaterThan(Date value) {
            addCriterion("YHG003 >", value, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003GreaterThanOrEqualTo(Date value) {
            addCriterion("YHG003 >=", value, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003LessThan(Date value) {
            addCriterion("YHG003 <", value, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003LessThanOrEqualTo(Date value) {
            addCriterion("YHG003 <=", value, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003In(List<Date> values) {
            addCriterion("YHG003 in", values, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003NotIn(List<Date> values) {
            addCriterion("YHG003 not in", values, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003Between(Date value1, Date value2) {
            addCriterion("YHG003 between", value1, value2, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg003NotBetween(Date value1, Date value2) {
            addCriterion("YHG003 not between", value1, value2, "yhg003");
            return (Criteria) this;
        }

        public Criteria andYhg004IsNull() {
            addCriterion("YHG004 is null");
            return (Criteria) this;
        }

        public Criteria andYhg004IsNotNull() {
            addCriterion("YHG004 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg004EqualTo(String value) {
            addCriterion("YHG004 =", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004NotEqualTo(String value) {
            addCriterion("YHG004 <>", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004GreaterThan(String value) {
            addCriterion("YHG004 >", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004GreaterThanOrEqualTo(String value) {
            addCriterion("YHG004 >=", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004LessThan(String value) {
            addCriterion("YHG004 <", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004LessThanOrEqualTo(String value) {
            addCriterion("YHG004 <=", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004Like(String value) {
            addCriterion("YHG004 like", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004NotLike(String value) {
            addCriterion("YHG004 not like", value, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004In(List<String> values) {
            addCriterion("YHG004 in", values, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004NotIn(List<String> values) {
            addCriterion("YHG004 not in", values, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004Between(String value1, String value2) {
            addCriterion("YHG004 between", value1, value2, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg004NotBetween(String value1, String value2) {
            addCriterion("YHG004 not between", value1, value2, "yhg004");
            return (Criteria) this;
        }

        public Criteria andYhg005IsNull() {
            addCriterion("YHG005 is null");
            return (Criteria) this;
        }

        public Criteria andYhg005IsNotNull() {
            addCriterion("YHG005 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg005EqualTo(Integer value) {
            addCriterion("YHG005 =", value, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005NotEqualTo(Integer value) {
            addCriterion("YHG005 <>", value, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005GreaterThan(Integer value) {
            addCriterion("YHG005 >", value, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHG005 >=", value, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005LessThan(Integer value) {
            addCriterion("YHG005 <", value, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005LessThanOrEqualTo(Integer value) {
            addCriterion("YHG005 <=", value, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005In(List<Integer> values) {
            addCriterion("YHG005 in", values, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005NotIn(List<Integer> values) {
            addCriterion("YHG005 not in", values, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005Between(Integer value1, Integer value2) {
            addCriterion("YHG005 between", value1, value2, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg005NotBetween(Integer value1, Integer value2) {
            addCriterion("YHG005 not between", value1, value2, "yhg005");
            return (Criteria) this;
        }

        public Criteria andYhg007IsNull() {
            addCriterion("YHG007 is null");
            return (Criteria) this;
        }

        public Criteria andYhg007IsNotNull() {
            addCriterion("YHG007 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg007EqualTo(Integer value) {
            addCriterion("YHG007 =", value, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007NotEqualTo(Integer value) {
            addCriterion("YHG007 <>", value, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007GreaterThan(Integer value) {
            addCriterion("YHG007 >", value, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHG007 >=", value, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007LessThan(Integer value) {
            addCriterion("YHG007 <", value, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007LessThanOrEqualTo(Integer value) {
            addCriterion("YHG007 <=", value, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007In(List<Integer> values) {
            addCriterion("YHG007 in", values, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007NotIn(List<Integer> values) {
            addCriterion("YHG007 not in", values, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007Between(Integer value1, Integer value2) {
            addCriterion("YHG007 between", value1, value2, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg007NotBetween(Integer value1, Integer value2) {
            addCriterion("YHG007 not between", value1, value2, "yhg007");
            return (Criteria) this;
        }

        public Criteria andYhg008IsNull() {
            addCriterion("YHG008 is null");
            return (Criteria) this;
        }

        public Criteria andYhg008IsNotNull() {
            addCriterion("YHG008 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg008EqualTo(Integer value) {
            addCriterion("YHG008 =", value, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008NotEqualTo(Integer value) {
            addCriterion("YHG008 <>", value, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008GreaterThan(Integer value) {
            addCriterion("YHG008 >", value, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHG008 >=", value, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008LessThan(Integer value) {
            addCriterion("YHG008 <", value, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008LessThanOrEqualTo(Integer value) {
            addCriterion("YHG008 <=", value, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008In(List<Integer> values) {
            addCriterion("YHG008 in", values, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008NotIn(List<Integer> values) {
            addCriterion("YHG008 not in", values, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008Between(Integer value1, Integer value2) {
            addCriterion("YHG008 between", value1, value2, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg008NotBetween(Integer value1, Integer value2) {
            addCriterion("YHG008 not between", value1, value2, "yhg008");
            return (Criteria) this;
        }

        public Criteria andYhg009IsNull() {
            addCriterion("YHG009 is null");
            return (Criteria) this;
        }

        public Criteria andYhg009IsNotNull() {
            addCriterion("YHG009 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg009EqualTo(String value) {
            addCriterion("YHG009 =", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009NotEqualTo(String value) {
            addCriterion("YHG009 <>", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009GreaterThan(String value) {
            addCriterion("YHG009 >", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009GreaterThanOrEqualTo(String value) {
            addCriterion("YHG009 >=", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009LessThan(String value) {
            addCriterion("YHG009 <", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009LessThanOrEqualTo(String value) {
            addCriterion("YHG009 <=", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009Like(String value) {
            addCriterion("YHG009 like", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009NotLike(String value) {
            addCriterion("YHG009 not like", value, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009In(List<String> values) {
            addCriterion("YHG009 in", values, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009NotIn(List<String> values) {
            addCriterion("YHG009 not in", values, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009Between(String value1, String value2) {
            addCriterion("YHG009 between", value1, value2, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg009NotBetween(String value1, String value2) {
            addCriterion("YHG009 not between", value1, value2, "yhg009");
            return (Criteria) this;
        }

        public Criteria andYhg010IsNull() {
            addCriterion("YHG010 is null");
            return (Criteria) this;
        }

        public Criteria andYhg010IsNotNull() {
            addCriterion("YHG010 is not null");
            return (Criteria) this;
        }

        public Criteria andYhg010EqualTo(String value) {
            addCriterion("YHG010 =", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010NotEqualTo(String value) {
            addCriterion("YHG010 <>", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010GreaterThan(String value) {
            addCriterion("YHG010 >", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010GreaterThanOrEqualTo(String value) {
            addCriterion("YHG010 >=", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010LessThan(String value) {
            addCriterion("YHG010 <", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010LessThanOrEqualTo(String value) {
            addCriterion("YHG010 <=", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010Like(String value) {
            addCriterion("YHG010 like", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010NotLike(String value) {
            addCriterion("YHG010 not like", value, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010In(List<String> values) {
            addCriterion("YHG010 in", values, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010NotIn(List<String> values) {
            addCriterion("YHG010 not in", values, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010Between(String value1, String value2) {
            addCriterion("YHG010 between", value1, value2, "yhg010");
            return (Criteria) this;
        }

        public Criteria andYhg010NotBetween(String value1, String value2) {
            addCriterion("YHG010 not between", value1, value2, "yhg010");
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