package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdyhbExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdyhbExample() {
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

        public Criteria andYhb001IsNull() {
            addCriterion("YHB001 is null");
            return (Criteria) this;
        }

        public Criteria andYhb001IsNotNull() {
            addCriterion("YHB001 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb001EqualTo(Integer value) {
            addCriterion("YHB001 =", value, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001NotEqualTo(Integer value) {
            addCriterion("YHB001 <>", value, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001GreaterThan(Integer value) {
            addCriterion("YHB001 >", value, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB001 >=", value, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001LessThan(Integer value) {
            addCriterion("YHB001 <", value, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001LessThanOrEqualTo(Integer value) {
            addCriterion("YHB001 <=", value, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001In(List<Integer> values) {
            addCriterion("YHB001 in", values, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001NotIn(List<Integer> values) {
            addCriterion("YHB001 not in", values, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001Between(Integer value1, Integer value2) {
            addCriterion("YHB001 between", value1, value2, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb001NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB001 not between", value1, value2, "yhb001");
            return (Criteria) this;
        }

        public Criteria andYhb002IsNull() {
            addCriterion("YHB002 is null");
            return (Criteria) this;
        }

        public Criteria andYhb002IsNotNull() {
            addCriterion("YHB002 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb002EqualTo(Integer value) {
            addCriterion("YHB002 =", value, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002NotEqualTo(Integer value) {
            addCriterion("YHB002 <>", value, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002GreaterThan(Integer value) {
            addCriterion("YHB002 >", value, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB002 >=", value, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002LessThan(Integer value) {
            addCriterion("YHB002 <", value, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002LessThanOrEqualTo(Integer value) {
            addCriterion("YHB002 <=", value, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002In(List<Integer> values) {
            addCriterion("YHB002 in", values, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002NotIn(List<Integer> values) {
            addCriterion("YHB002 not in", values, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002Between(Integer value1, Integer value2) {
            addCriterion("YHB002 between", value1, value2, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb002NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB002 not between", value1, value2, "yhb002");
            return (Criteria) this;
        }

        public Criteria andYhb003IsNull() {
            addCriterion("YHB003 is null");
            return (Criteria) this;
        }

        public Criteria andYhb003IsNotNull() {
            addCriterion("YHB003 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb003EqualTo(Integer value) {
            addCriterion("YHB003 =", value, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003NotEqualTo(Integer value) {
            addCriterion("YHB003 <>", value, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003GreaterThan(Integer value) {
            addCriterion("YHB003 >", value, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB003 >=", value, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003LessThan(Integer value) {
            addCriterion("YHB003 <", value, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003LessThanOrEqualTo(Integer value) {
            addCriterion("YHB003 <=", value, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003In(List<Integer> values) {
            addCriterion("YHB003 in", values, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003NotIn(List<Integer> values) {
            addCriterion("YHB003 not in", values, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003Between(Integer value1, Integer value2) {
            addCriterion("YHB003 between", value1, value2, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb003NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB003 not between", value1, value2, "yhb003");
            return (Criteria) this;
        }

        public Criteria andYhb004IsNull() {
            addCriterion("YHB004 is null");
            return (Criteria) this;
        }

        public Criteria andYhb004IsNotNull() {
            addCriterion("YHB004 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb004EqualTo(String value) {
            addCriterion("YHB004 =", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004NotEqualTo(String value) {
            addCriterion("YHB004 <>", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004GreaterThan(String value) {
            addCriterion("YHB004 >", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004GreaterThanOrEqualTo(String value) {
            addCriterion("YHB004 >=", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004LessThan(String value) {
            addCriterion("YHB004 <", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004LessThanOrEqualTo(String value) {
            addCriterion("YHB004 <=", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004Like(String value) {
            addCriterion("YHB004 like", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004NotLike(String value) {
            addCriterion("YHB004 not like", value, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004In(List<String> values) {
            addCriterion("YHB004 in", values, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004NotIn(List<String> values) {
            addCriterion("YHB004 not in", values, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004Between(String value1, String value2) {
            addCriterion("YHB004 between", value1, value2, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb004NotBetween(String value1, String value2) {
            addCriterion("YHB004 not between", value1, value2, "yhb004");
            return (Criteria) this;
        }

        public Criteria andYhb005IsNull() {
            addCriterion("YHB005 is null");
            return (Criteria) this;
        }

        public Criteria andYhb005IsNotNull() {
            addCriterion("YHB005 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb005EqualTo(String value) {
            addCriterion("YHB005 =", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005NotEqualTo(String value) {
            addCriterion("YHB005 <>", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005GreaterThan(String value) {
            addCriterion("YHB005 >", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005GreaterThanOrEqualTo(String value) {
            addCriterion("YHB005 >=", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005LessThan(String value) {
            addCriterion("YHB005 <", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005LessThanOrEqualTo(String value) {
            addCriterion("YHB005 <=", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005Like(String value) {
            addCriterion("YHB005 like", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005NotLike(String value) {
            addCriterion("YHB005 not like", value, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005In(List<String> values) {
            addCriterion("YHB005 in", values, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005NotIn(List<String> values) {
            addCriterion("YHB005 not in", values, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005Between(String value1, String value2) {
            addCriterion("YHB005 between", value1, value2, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb005NotBetween(String value1, String value2) {
            addCriterion("YHB005 not between", value1, value2, "yhb005");
            return (Criteria) this;
        }

        public Criteria andYhb006IsNull() {
            addCriterion("YHB006 is null");
            return (Criteria) this;
        }

        public Criteria andYhb006IsNotNull() {
            addCriterion("YHB006 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb006EqualTo(String value) {
            addCriterion("YHB006 =", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006NotEqualTo(String value) {
            addCriterion("YHB006 <>", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006GreaterThan(String value) {
            addCriterion("YHB006 >", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006GreaterThanOrEqualTo(String value) {
            addCriterion("YHB006 >=", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006LessThan(String value) {
            addCriterion("YHB006 <", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006LessThanOrEqualTo(String value) {
            addCriterion("YHB006 <=", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006Like(String value) {
            addCriterion("YHB006 like", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006NotLike(String value) {
            addCriterion("YHB006 not like", value, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006In(List<String> values) {
            addCriterion("YHB006 in", values, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006NotIn(List<String> values) {
            addCriterion("YHB006 not in", values, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006Between(String value1, String value2) {
            addCriterion("YHB006 between", value1, value2, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb006NotBetween(String value1, String value2) {
            addCriterion("YHB006 not between", value1, value2, "yhb006");
            return (Criteria) this;
        }

        public Criteria andYhb007IsNull() {
            addCriterion("YHB007 is null");
            return (Criteria) this;
        }

        public Criteria andYhb007IsNotNull() {
            addCriterion("YHB007 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb007EqualTo(String value) {
            addCriterion("YHB007 =", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007NotEqualTo(String value) {
            addCriterion("YHB007 <>", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007GreaterThan(String value) {
            addCriterion("YHB007 >", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007GreaterThanOrEqualTo(String value) {
            addCriterion("YHB007 >=", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007LessThan(String value) {
            addCriterion("YHB007 <", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007LessThanOrEqualTo(String value) {
            addCriterion("YHB007 <=", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007Like(String value) {
            addCriterion("YHB007 like", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007NotLike(String value) {
            addCriterion("YHB007 not like", value, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007In(List<String> values) {
            addCriterion("YHB007 in", values, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007NotIn(List<String> values) {
            addCriterion("YHB007 not in", values, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007Between(String value1, String value2) {
            addCriterion("YHB007 between", value1, value2, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb007NotBetween(String value1, String value2) {
            addCriterion("YHB007 not between", value1, value2, "yhb007");
            return (Criteria) this;
        }

        public Criteria andYhb008IsNull() {
            addCriterion("YHB008 is null");
            return (Criteria) this;
        }

        public Criteria andYhb008IsNotNull() {
            addCriterion("YHB008 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb008EqualTo(String value) {
            addCriterion("YHB008 =", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008NotEqualTo(String value) {
            addCriterion("YHB008 <>", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008GreaterThan(String value) {
            addCriterion("YHB008 >", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008GreaterThanOrEqualTo(String value) {
            addCriterion("YHB008 >=", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008LessThan(String value) {
            addCriterion("YHB008 <", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008LessThanOrEqualTo(String value) {
            addCriterion("YHB008 <=", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008Like(String value) {
            addCriterion("YHB008 like", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008NotLike(String value) {
            addCriterion("YHB008 not like", value, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008In(List<String> values) {
            addCriterion("YHB008 in", values, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008NotIn(List<String> values) {
            addCriterion("YHB008 not in", values, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008Between(String value1, String value2) {
            addCriterion("YHB008 between", value1, value2, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb008NotBetween(String value1, String value2) {
            addCriterion("YHB008 not between", value1, value2, "yhb008");
            return (Criteria) this;
        }

        public Criteria andYhb009IsNull() {
            addCriterion("YHB009 is null");
            return (Criteria) this;
        }

        public Criteria andYhb009IsNotNull() {
            addCriterion("YHB009 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb009EqualTo(String value) {
            addCriterion("YHB009 =", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009NotEqualTo(String value) {
            addCriterion("YHB009 <>", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009GreaterThan(String value) {
            addCriterion("YHB009 >", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009GreaterThanOrEqualTo(String value) {
            addCriterion("YHB009 >=", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009LessThan(String value) {
            addCriterion("YHB009 <", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009LessThanOrEqualTo(String value) {
            addCriterion("YHB009 <=", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009Like(String value) {
            addCriterion("YHB009 like", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009NotLike(String value) {
            addCriterion("YHB009 not like", value, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009In(List<String> values) {
            addCriterion("YHB009 in", values, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009NotIn(List<String> values) {
            addCriterion("YHB009 not in", values, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009Between(String value1, String value2) {
            addCriterion("YHB009 between", value1, value2, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb009NotBetween(String value1, String value2) {
            addCriterion("YHB009 not between", value1, value2, "yhb009");
            return (Criteria) this;
        }

        public Criteria andYhb010IsNull() {
            addCriterion("YHB010 is null");
            return (Criteria) this;
        }

        public Criteria andYhb010IsNotNull() {
            addCriterion("YHB010 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb010EqualTo(String value) {
            addCriterion("YHB010 =", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010NotEqualTo(String value) {
            addCriterion("YHB010 <>", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010GreaterThan(String value) {
            addCriterion("YHB010 >", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010GreaterThanOrEqualTo(String value) {
            addCriterion("YHB010 >=", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010LessThan(String value) {
            addCriterion("YHB010 <", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010LessThanOrEqualTo(String value) {
            addCriterion("YHB010 <=", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010Like(String value) {
            addCriterion("YHB010 like", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010NotLike(String value) {
            addCriterion("YHB010 not like", value, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010In(List<String> values) {
            addCriterion("YHB010 in", values, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010NotIn(List<String> values) {
            addCriterion("YHB010 not in", values, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010Between(String value1, String value2) {
            addCriterion("YHB010 between", value1, value2, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb010NotBetween(String value1, String value2) {
            addCriterion("YHB010 not between", value1, value2, "yhb010");
            return (Criteria) this;
        }

        public Criteria andYhb011IsNull() {
            addCriterion("YHB011 is null");
            return (Criteria) this;
        }

        public Criteria andYhb011IsNotNull() {
            addCriterion("YHB011 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb011EqualTo(Date value) {
            addCriterion("YHB011 =", value, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011NotEqualTo(Date value) {
            addCriterion("YHB011 <>", value, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011GreaterThan(Date value) {
            addCriterion("YHB011 >", value, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011GreaterThanOrEqualTo(Date value) {
            addCriterion("YHB011 >=", value, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011LessThan(Date value) {
            addCriterion("YHB011 <", value, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011LessThanOrEqualTo(Date value) {
            addCriterion("YHB011 <=", value, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011In(List<Date> values) {
            addCriterion("YHB011 in", values, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011NotIn(List<Date> values) {
            addCriterion("YHB011 not in", values, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011Between(Date value1, Date value2) {
            addCriterion("YHB011 between", value1, value2, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb011NotBetween(Date value1, Date value2) {
            addCriterion("YHB011 not between", value1, value2, "yhb011");
            return (Criteria) this;
        }

        public Criteria andYhb012IsNull() {
            addCriterion("YHB012 is null");
            return (Criteria) this;
        }

        public Criteria andYhb012IsNotNull() {
            addCriterion("YHB012 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb012EqualTo(Integer value) {
            addCriterion("YHB012 =", value, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012NotEqualTo(Integer value) {
            addCriterion("YHB012 <>", value, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012GreaterThan(Integer value) {
            addCriterion("YHB012 >", value, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB012 >=", value, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012LessThan(Integer value) {
            addCriterion("YHB012 <", value, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012LessThanOrEqualTo(Integer value) {
            addCriterion("YHB012 <=", value, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012In(List<Integer> values) {
            addCriterion("YHB012 in", values, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012NotIn(List<Integer> values) {
            addCriterion("YHB012 not in", values, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012Between(Integer value1, Integer value2) {
            addCriterion("YHB012 between", value1, value2, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb012NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB012 not between", value1, value2, "yhb012");
            return (Criteria) this;
        }

        public Criteria andYhb013IsNull() {
            addCriterion("YHB013 is null");
            return (Criteria) this;
        }

        public Criteria andYhb013IsNotNull() {
            addCriterion("YHB013 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb013EqualTo(Integer value) {
            addCriterion("YHB013 =", value, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013NotEqualTo(Integer value) {
            addCriterion("YHB013 <>", value, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013GreaterThan(Integer value) {
            addCriterion("YHB013 >", value, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB013 >=", value, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013LessThan(Integer value) {
            addCriterion("YHB013 <", value, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013LessThanOrEqualTo(Integer value) {
            addCriterion("YHB013 <=", value, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013In(List<Integer> values) {
            addCriterion("YHB013 in", values, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013NotIn(List<Integer> values) {
            addCriterion("YHB013 not in", values, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013Between(Integer value1, Integer value2) {
            addCriterion("YHB013 between", value1, value2, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb013NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB013 not between", value1, value2, "yhb013");
            return (Criteria) this;
        }

        public Criteria andYhb014IsNull() {
            addCriterion("YHB014 is null");
            return (Criteria) this;
        }

        public Criteria andYhb014IsNotNull() {
            addCriterion("YHB014 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb014EqualTo(Integer value) {
            addCriterion("YHB014 =", value, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014NotEqualTo(Integer value) {
            addCriterion("YHB014 <>", value, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014GreaterThan(Integer value) {
            addCriterion("YHB014 >", value, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB014 >=", value, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014LessThan(Integer value) {
            addCriterion("YHB014 <", value, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014LessThanOrEqualTo(Integer value) {
            addCriterion("YHB014 <=", value, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014In(List<Integer> values) {
            addCriterion("YHB014 in", values, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014NotIn(List<Integer> values) {
            addCriterion("YHB014 not in", values, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014Between(Integer value1, Integer value2) {
            addCriterion("YHB014 between", value1, value2, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb014NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB014 not between", value1, value2, "yhb014");
            return (Criteria) this;
        }

        public Criteria andYhb015IsNull() {
            addCriterion("YHB015 is null");
            return (Criteria) this;
        }

        public Criteria andYhb015IsNotNull() {
            addCriterion("YHB015 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb015EqualTo(Integer value) {
            addCriterion("YHB015 =", value, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015NotEqualTo(Integer value) {
            addCriterion("YHB015 <>", value, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015GreaterThan(Integer value) {
            addCriterion("YHB015 >", value, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB015 >=", value, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015LessThan(Integer value) {
            addCriterion("YHB015 <", value, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015LessThanOrEqualTo(Integer value) {
            addCriterion("YHB015 <=", value, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015In(List<Integer> values) {
            addCriterion("YHB015 in", values, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015NotIn(List<Integer> values) {
            addCriterion("YHB015 not in", values, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015Between(Integer value1, Integer value2) {
            addCriterion("YHB015 between", value1, value2, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb015NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB015 not between", value1, value2, "yhb015");
            return (Criteria) this;
        }

        public Criteria andYhb016IsNull() {
            addCriterion("YHB016 is null");
            return (Criteria) this;
        }

        public Criteria andYhb016IsNotNull() {
            addCriterion("YHB016 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb016EqualTo(Integer value) {
            addCriterion("YHB016 =", value, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016NotEqualTo(Integer value) {
            addCriterion("YHB016 <>", value, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016GreaterThan(Integer value) {
            addCriterion("YHB016 >", value, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB016 >=", value, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016LessThan(Integer value) {
            addCriterion("YHB016 <", value, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016LessThanOrEqualTo(Integer value) {
            addCriterion("YHB016 <=", value, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016In(List<Integer> values) {
            addCriterion("YHB016 in", values, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016NotIn(List<Integer> values) {
            addCriterion("YHB016 not in", values, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016Between(Integer value1, Integer value2) {
            addCriterion("YHB016 between", value1, value2, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb016NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB016 not between", value1, value2, "yhb016");
            return (Criteria) this;
        }

        public Criteria andYhb017IsNull() {
            addCriterion("YHB017 is null");
            return (Criteria) this;
        }

        public Criteria andYhb017IsNotNull() {
            addCriterion("YHB017 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb017EqualTo(Float value) {
            addCriterion("YHB017 =", value, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017NotEqualTo(Float value) {
            addCriterion("YHB017 <>", value, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017GreaterThan(Float value) {
            addCriterion("YHB017 >", value, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017GreaterThanOrEqualTo(Float value) {
            addCriterion("YHB017 >=", value, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017LessThan(Float value) {
            addCriterion("YHB017 <", value, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017LessThanOrEqualTo(Float value) {
            addCriterion("YHB017 <=", value, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017In(List<Float> values) {
            addCriterion("YHB017 in", values, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017NotIn(List<Float> values) {
            addCriterion("YHB017 not in", values, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017Between(Float value1, Float value2) {
            addCriterion("YHB017 between", value1, value2, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb017NotBetween(Float value1, Float value2) {
            addCriterion("YHB017 not between", value1, value2, "yhb017");
            return (Criteria) this;
        }

        public Criteria andYhb018IsNull() {
            addCriterion("YHB018 is null");
            return (Criteria) this;
        }

        public Criteria andYhb018IsNotNull() {
            addCriterion("YHB018 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb018EqualTo(Float value) {
            addCriterion("YHB018 =", value, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018NotEqualTo(Float value) {
            addCriterion("YHB018 <>", value, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018GreaterThan(Float value) {
            addCriterion("YHB018 >", value, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018GreaterThanOrEqualTo(Float value) {
            addCriterion("YHB018 >=", value, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018LessThan(Float value) {
            addCriterion("YHB018 <", value, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018LessThanOrEqualTo(Float value) {
            addCriterion("YHB018 <=", value, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018In(List<Float> values) {
            addCriterion("YHB018 in", values, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018NotIn(List<Float> values) {
            addCriterion("YHB018 not in", values, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018Between(Float value1, Float value2) {
            addCriterion("YHB018 between", value1, value2, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb018NotBetween(Float value1, Float value2) {
            addCriterion("YHB018 not between", value1, value2, "yhb018");
            return (Criteria) this;
        }

        public Criteria andYhb019IsNull() {
            addCriterion("YHB019 is null");
            return (Criteria) this;
        }

        public Criteria andYhb019IsNotNull() {
            addCriterion("YHB019 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb019EqualTo(Float value) {
            addCriterion("YHB019 =", value, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019NotEqualTo(Float value) {
            addCriterion("YHB019 <>", value, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019GreaterThan(Float value) {
            addCriterion("YHB019 >", value, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019GreaterThanOrEqualTo(Float value) {
            addCriterion("YHB019 >=", value, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019LessThan(Float value) {
            addCriterion("YHB019 <", value, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019LessThanOrEqualTo(Float value) {
            addCriterion("YHB019 <=", value, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019In(List<Float> values) {
            addCriterion("YHB019 in", values, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019NotIn(List<Float> values) {
            addCriterion("YHB019 not in", values, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019Between(Float value1, Float value2) {
            addCriterion("YHB019 between", value1, value2, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb019NotBetween(Float value1, Float value2) {
            addCriterion("YHB019 not between", value1, value2, "yhb019");
            return (Criteria) this;
        }

        public Criteria andYhb020IsNull() {
            addCriterion("YHB020 is null");
            return (Criteria) this;
        }

        public Criteria andYhb020IsNotNull() {
            addCriterion("YHB020 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb020EqualTo(Integer value) {
            addCriterion("YHB020 =", value, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020NotEqualTo(Integer value) {
            addCriterion("YHB020 <>", value, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020GreaterThan(Integer value) {
            addCriterion("YHB020 >", value, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB020 >=", value, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020LessThan(Integer value) {
            addCriterion("YHB020 <", value, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020LessThanOrEqualTo(Integer value) {
            addCriterion("YHB020 <=", value, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020In(List<Integer> values) {
            addCriterion("YHB020 in", values, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020NotIn(List<Integer> values) {
            addCriterion("YHB020 not in", values, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020Between(Integer value1, Integer value2) {
            addCriterion("YHB020 between", value1, value2, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb020NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB020 not between", value1, value2, "yhb020");
            return (Criteria) this;
        }

        public Criteria andYhb021IsNull() {
            addCriterion("YHB021 is null");
            return (Criteria) this;
        }

        public Criteria andYhb021IsNotNull() {
            addCriterion("YHB021 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb021EqualTo(Integer value) {
            addCriterion("YHB021 =", value, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021NotEqualTo(Integer value) {
            addCriterion("YHB021 <>", value, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021GreaterThan(Integer value) {
            addCriterion("YHB021 >", value, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHB021 >=", value, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021LessThan(Integer value) {
            addCriterion("YHB021 <", value, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021LessThanOrEqualTo(Integer value) {
            addCriterion("YHB021 <=", value, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021In(List<Integer> values) {
            addCriterion("YHB021 in", values, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021NotIn(List<Integer> values) {
            addCriterion("YHB021 not in", values, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021Between(Integer value1, Integer value2) {
            addCriterion("YHB021 between", value1, value2, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb021NotBetween(Integer value1, Integer value2) {
            addCriterion("YHB021 not between", value1, value2, "yhb021");
            return (Criteria) this;
        }

        public Criteria andYhb022IsNull() {
            addCriterion("YHB022 is null");
            return (Criteria) this;
        }

        public Criteria andYhb022IsNotNull() {
            addCriterion("YHB022 is not null");
            return (Criteria) this;
        }

        public Criteria andYhb022EqualTo(Date value) {
            addCriterion("YHB022 =", value, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022NotEqualTo(Date value) {
            addCriterion("YHB022 <>", value, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022GreaterThan(Date value) {
            addCriterion("YHB022 >", value, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022GreaterThanOrEqualTo(Date value) {
            addCriterion("YHB022 >=", value, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022LessThan(Date value) {
            addCriterion("YHB022 <", value, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022LessThanOrEqualTo(Date value) {
            addCriterion("YHB022 <=", value, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022In(List<Date> values) {
            addCriterion("YHB022 in", values, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022NotIn(List<Date> values) {
            addCriterion("YHB022 not in", values, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022Between(Date value1, Date value2) {
            addCriterion("YHB022 between", value1, value2, "yhb022");
            return (Criteria) this;
        }

        public Criteria andYhb022NotBetween(Date value1, Date value2) {
            addCriterion("YHB022 not between", value1, value2, "yhb022");
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