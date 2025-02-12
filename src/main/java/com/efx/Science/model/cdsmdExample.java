package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdsmdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdsmdExample() {
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

        public Criteria andSmd001IsNull() {
            addCriterion("SMD001 is null");
            return (Criteria) this;
        }

        public Criteria andSmd001IsNotNull() {
            addCriterion("SMD001 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd001EqualTo(Integer value) {
            addCriterion("SMD001 =", value, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001NotEqualTo(Integer value) {
            addCriterion("SMD001 <>", value, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001GreaterThan(Integer value) {
            addCriterion("SMD001 >", value, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD001 >=", value, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001LessThan(Integer value) {
            addCriterion("SMD001 <", value, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001LessThanOrEqualTo(Integer value) {
            addCriterion("SMD001 <=", value, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001In(List<Integer> values) {
            addCriterion("SMD001 in", values, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001NotIn(List<Integer> values) {
            addCriterion("SMD001 not in", values, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001Between(Integer value1, Integer value2) {
            addCriterion("SMD001 between", value1, value2, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd001NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD001 not between", value1, value2, "smd001");
            return (Criteria) this;
        }

        public Criteria andSmd002IsNull() {
            addCriterion("SMD002 is null");
            return (Criteria) this;
        }

        public Criteria andSmd002IsNotNull() {
            addCriterion("SMD002 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd002EqualTo(String value) {
            addCriterion("SMD002 =", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002NotEqualTo(String value) {
            addCriterion("SMD002 <>", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002GreaterThan(String value) {
            addCriterion("SMD002 >", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002GreaterThanOrEqualTo(String value) {
            addCriterion("SMD002 >=", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002LessThan(String value) {
            addCriterion("SMD002 <", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002LessThanOrEqualTo(String value) {
            addCriterion("SMD002 <=", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002Like(String value) {
            addCriterion("SMD002 like", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002NotLike(String value) {
            addCriterion("SMD002 not like", value, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002In(List<String> values) {
            addCriterion("SMD002 in", values, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002NotIn(List<String> values) {
            addCriterion("SMD002 not in", values, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002Between(String value1, String value2) {
            addCriterion("SMD002 between", value1, value2, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd002NotBetween(String value1, String value2) {
            addCriterion("SMD002 not between", value1, value2, "smd002");
            return (Criteria) this;
        }

        public Criteria andSmd003IsNull() {
            addCriterion("SMD003 is null");
            return (Criteria) this;
        }

        public Criteria andSmd003IsNotNull() {
            addCriterion("SMD003 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd003EqualTo(String value) {
            addCriterion("SMD003 =", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003NotEqualTo(String value) {
            addCriterion("SMD003 <>", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003GreaterThan(String value) {
            addCriterion("SMD003 >", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003GreaterThanOrEqualTo(String value) {
            addCriterion("SMD003 >=", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003LessThan(String value) {
            addCriterion("SMD003 <", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003LessThanOrEqualTo(String value) {
            addCriterion("SMD003 <=", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003Like(String value) {
            addCriterion("SMD003 like", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003NotLike(String value) {
            addCriterion("SMD003 not like", value, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003In(List<String> values) {
            addCriterion("SMD003 in", values, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003NotIn(List<String> values) {
            addCriterion("SMD003 not in", values, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003Between(String value1, String value2) {
            addCriterion("SMD003 between", value1, value2, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd003NotBetween(String value1, String value2) {
            addCriterion("SMD003 not between", value1, value2, "smd003");
            return (Criteria) this;
        }

        public Criteria andSmd004IsNull() {
            addCriterion("SMD004 is null");
            return (Criteria) this;
        }

        public Criteria andSmd004IsNotNull() {
            addCriterion("SMD004 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd004EqualTo(String value) {
            addCriterion("SMD004 =", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004NotEqualTo(String value) {
            addCriterion("SMD004 <>", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004GreaterThan(String value) {
            addCriterion("SMD004 >", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004GreaterThanOrEqualTo(String value) {
            addCriterion("SMD004 >=", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004LessThan(String value) {
            addCriterion("SMD004 <", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004LessThanOrEqualTo(String value) {
            addCriterion("SMD004 <=", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004Like(String value) {
            addCriterion("SMD004 like", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004NotLike(String value) {
            addCriterion("SMD004 not like", value, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004In(List<String> values) {
            addCriterion("SMD004 in", values, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004NotIn(List<String> values) {
            addCriterion("SMD004 not in", values, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004Between(String value1, String value2) {
            addCriterion("SMD004 between", value1, value2, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd004NotBetween(String value1, String value2) {
            addCriterion("SMD004 not between", value1, value2, "smd004");
            return (Criteria) this;
        }

        public Criteria andSmd005IsNull() {
            addCriterion("SMD005 is null");
            return (Criteria) this;
        }

        public Criteria andSmd005IsNotNull() {
            addCriterion("SMD005 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd005EqualTo(String value) {
            addCriterion("SMD005 =", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005NotEqualTo(String value) {
            addCriterion("SMD005 <>", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005GreaterThan(String value) {
            addCriterion("SMD005 >", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005GreaterThanOrEqualTo(String value) {
            addCriterion("SMD005 >=", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005LessThan(String value) {
            addCriterion("SMD005 <", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005LessThanOrEqualTo(String value) {
            addCriterion("SMD005 <=", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005Like(String value) {
            addCriterion("SMD005 like", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005NotLike(String value) {
            addCriterion("SMD005 not like", value, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005In(List<String> values) {
            addCriterion("SMD005 in", values, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005NotIn(List<String> values) {
            addCriterion("SMD005 not in", values, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005Between(String value1, String value2) {
            addCriterion("SMD005 between", value1, value2, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd005NotBetween(String value1, String value2) {
            addCriterion("SMD005 not between", value1, value2, "smd005");
            return (Criteria) this;
        }

        public Criteria andSmd006IsNull() {
            addCriterion("SMD006 is null");
            return (Criteria) this;
        }

        public Criteria andSmd006IsNotNull() {
            addCriterion("SMD006 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd006EqualTo(String value) {
            addCriterion("SMD006 =", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006NotEqualTo(String value) {
            addCriterion("SMD006 <>", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006GreaterThan(String value) {
            addCriterion("SMD006 >", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006GreaterThanOrEqualTo(String value) {
            addCriterion("SMD006 >=", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006LessThan(String value) {
            addCriterion("SMD006 <", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006LessThanOrEqualTo(String value) {
            addCriterion("SMD006 <=", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006Like(String value) {
            addCriterion("SMD006 like", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006NotLike(String value) {
            addCriterion("SMD006 not like", value, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006In(List<String> values) {
            addCriterion("SMD006 in", values, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006NotIn(List<String> values) {
            addCriterion("SMD006 not in", values, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006Between(String value1, String value2) {
            addCriterion("SMD006 between", value1, value2, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd006NotBetween(String value1, String value2) {
            addCriterion("SMD006 not between", value1, value2, "smd006");
            return (Criteria) this;
        }

        public Criteria andSmd007IsNull() {
            addCriterion("SMD007 is null");
            return (Criteria) this;
        }

        public Criteria andSmd007IsNotNull() {
            addCriterion("SMD007 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd007EqualTo(String value) {
            addCriterion("SMD007 =", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007NotEqualTo(String value) {
            addCriterion("SMD007 <>", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007GreaterThan(String value) {
            addCriterion("SMD007 >", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007GreaterThanOrEqualTo(String value) {
            addCriterion("SMD007 >=", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007LessThan(String value) {
            addCriterion("SMD007 <", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007LessThanOrEqualTo(String value) {
            addCriterion("SMD007 <=", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007Like(String value) {
            addCriterion("SMD007 like", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007NotLike(String value) {
            addCriterion("SMD007 not like", value, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007In(List<String> values) {
            addCriterion("SMD007 in", values, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007NotIn(List<String> values) {
            addCriterion("SMD007 not in", values, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007Between(String value1, String value2) {
            addCriterion("SMD007 between", value1, value2, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd007NotBetween(String value1, String value2) {
            addCriterion("SMD007 not between", value1, value2, "smd007");
            return (Criteria) this;
        }

        public Criteria andSmd008IsNull() {
            addCriterion("SMD008 is null");
            return (Criteria) this;
        }

        public Criteria andSmd008IsNotNull() {
            addCriterion("SMD008 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd008EqualTo(Date value) {
            addCriterion("SMD008 =", value, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008NotEqualTo(Date value) {
            addCriterion("SMD008 <>", value, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008GreaterThan(Date value) {
            addCriterion("SMD008 >", value, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008GreaterThanOrEqualTo(Date value) {
            addCriterion("SMD008 >=", value, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008LessThan(Date value) {
            addCriterion("SMD008 <", value, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008LessThanOrEqualTo(Date value) {
            addCriterion("SMD008 <=", value, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008In(List<Date> values) {
            addCriterion("SMD008 in", values, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008NotIn(List<Date> values) {
            addCriterion("SMD008 not in", values, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008Between(Date value1, Date value2) {
            addCriterion("SMD008 between", value1, value2, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd008NotBetween(Date value1, Date value2) {
            addCriterion("SMD008 not between", value1, value2, "smd008");
            return (Criteria) this;
        }

        public Criteria andSmd009IsNull() {
            addCriterion("SMD009 is null");
            return (Criteria) this;
        }

        public Criteria andSmd009IsNotNull() {
            addCriterion("SMD009 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd009EqualTo(Integer value) {
            addCriterion("SMD009 =", value, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009NotEqualTo(Integer value) {
            addCriterion("SMD009 <>", value, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009GreaterThan(Integer value) {
            addCriterion("SMD009 >", value, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD009 >=", value, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009LessThan(Integer value) {
            addCriterion("SMD009 <", value, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009LessThanOrEqualTo(Integer value) {
            addCriterion("SMD009 <=", value, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009In(List<Integer> values) {
            addCriterion("SMD009 in", values, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009NotIn(List<Integer> values) {
            addCriterion("SMD009 not in", values, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009Between(Integer value1, Integer value2) {
            addCriterion("SMD009 between", value1, value2, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd009NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD009 not between", value1, value2, "smd009");
            return (Criteria) this;
        }

        public Criteria andSmd010IsNull() {
            addCriterion("SMD010 is null");
            return (Criteria) this;
        }

        public Criteria andSmd010IsNotNull() {
            addCriterion("SMD010 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd010EqualTo(Integer value) {
            addCriterion("SMD010 =", value, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010NotEqualTo(Integer value) {
            addCriterion("SMD010 <>", value, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010GreaterThan(Integer value) {
            addCriterion("SMD010 >", value, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD010 >=", value, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010LessThan(Integer value) {
            addCriterion("SMD010 <", value, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010LessThanOrEqualTo(Integer value) {
            addCriterion("SMD010 <=", value, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010In(List<Integer> values) {
            addCriterion("SMD010 in", values, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010NotIn(List<Integer> values) {
            addCriterion("SMD010 not in", values, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010Between(Integer value1, Integer value2) {
            addCriterion("SMD010 between", value1, value2, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd010NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD010 not between", value1, value2, "smd010");
            return (Criteria) this;
        }

        public Criteria andSmd011IsNull() {
            addCriterion("SMD011 is null");
            return (Criteria) this;
        }

        public Criteria andSmd011IsNotNull() {
            addCriterion("SMD011 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd011EqualTo(Integer value) {
            addCriterion("SMD011 =", value, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011NotEqualTo(Integer value) {
            addCriterion("SMD011 <>", value, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011GreaterThan(Integer value) {
            addCriterion("SMD011 >", value, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD011 >=", value, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011LessThan(Integer value) {
            addCriterion("SMD011 <", value, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011LessThanOrEqualTo(Integer value) {
            addCriterion("SMD011 <=", value, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011In(List<Integer> values) {
            addCriterion("SMD011 in", values, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011NotIn(List<Integer> values) {
            addCriterion("SMD011 not in", values, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011Between(Integer value1, Integer value2) {
            addCriterion("SMD011 between", value1, value2, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd011NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD011 not between", value1, value2, "smd011");
            return (Criteria) this;
        }

        public Criteria andSmd012IsNull() {
            addCriterion("SMD012 is null");
            return (Criteria) this;
        }

        public Criteria andSmd012IsNotNull() {
            addCriterion("SMD012 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd012EqualTo(Integer value) {
            addCriterion("SMD012 =", value, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012NotEqualTo(Integer value) {
            addCriterion("SMD012 <>", value, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012GreaterThan(Integer value) {
            addCriterion("SMD012 >", value, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD012 >=", value, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012LessThan(Integer value) {
            addCriterion("SMD012 <", value, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012LessThanOrEqualTo(Integer value) {
            addCriterion("SMD012 <=", value, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012In(List<Integer> values) {
            addCriterion("SMD012 in", values, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012NotIn(List<Integer> values) {
            addCriterion("SMD012 not in", values, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012Between(Integer value1, Integer value2) {
            addCriterion("SMD012 between", value1, value2, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd012NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD012 not between", value1, value2, "smd012");
            return (Criteria) this;
        }

        public Criteria andSmd013IsNull() {
            addCriterion("SMD013 is null");
            return (Criteria) this;
        }

        public Criteria andSmd013IsNotNull() {
            addCriterion("SMD013 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd013EqualTo(Integer value) {
            addCriterion("SMD013 =", value, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013NotEqualTo(Integer value) {
            addCriterion("SMD013 <>", value, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013GreaterThan(Integer value) {
            addCriterion("SMD013 >", value, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD013 >=", value, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013LessThan(Integer value) {
            addCriterion("SMD013 <", value, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013LessThanOrEqualTo(Integer value) {
            addCriterion("SMD013 <=", value, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013In(List<Integer> values) {
            addCriterion("SMD013 in", values, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013NotIn(List<Integer> values) {
            addCriterion("SMD013 not in", values, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013Between(Integer value1, Integer value2) {
            addCriterion("SMD013 between", value1, value2, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd013NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD013 not between", value1, value2, "smd013");
            return (Criteria) this;
        }

        public Criteria andSmd014IsNull() {
            addCriterion("SMD014 is null");
            return (Criteria) this;
        }

        public Criteria andSmd014IsNotNull() {
            addCriterion("SMD014 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd014EqualTo(String value) {
            addCriterion("SMD014 =", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014NotEqualTo(String value) {
            addCriterion("SMD014 <>", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014GreaterThan(String value) {
            addCriterion("SMD014 >", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014GreaterThanOrEqualTo(String value) {
            addCriterion("SMD014 >=", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014LessThan(String value) {
            addCriterion("SMD014 <", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014LessThanOrEqualTo(String value) {
            addCriterion("SMD014 <=", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014Like(String value) {
            addCriterion("SMD014 like", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014NotLike(String value) {
            addCriterion("SMD014 not like", value, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014In(List<String> values) {
            addCriterion("SMD014 in", values, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014NotIn(List<String> values) {
            addCriterion("SMD014 not in", values, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014Between(String value1, String value2) {
            addCriterion("SMD014 between", value1, value2, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd014NotBetween(String value1, String value2) {
            addCriterion("SMD014 not between", value1, value2, "smd014");
            return (Criteria) this;
        }

        public Criteria andSmd015IsNull() {
            addCriterion("SMD015 is null");
            return (Criteria) this;
        }

        public Criteria andSmd015IsNotNull() {
            addCriterion("SMD015 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd015EqualTo(Integer value) {
            addCriterion("SMD015 =", value, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015NotEqualTo(Integer value) {
            addCriterion("SMD015 <>", value, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015GreaterThan(Integer value) {
            addCriterion("SMD015 >", value, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015GreaterThanOrEqualTo(Integer value) {
            addCriterion("SMD015 >=", value, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015LessThan(Integer value) {
            addCriterion("SMD015 <", value, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015LessThanOrEqualTo(Integer value) {
            addCriterion("SMD015 <=", value, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015In(List<Integer> values) {
            addCriterion("SMD015 in", values, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015NotIn(List<Integer> values) {
            addCriterion("SMD015 not in", values, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015Between(Integer value1, Integer value2) {
            addCriterion("SMD015 between", value1, value2, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd015NotBetween(Integer value1, Integer value2) {
            addCriterion("SMD015 not between", value1, value2, "smd015");
            return (Criteria) this;
        }

        public Criteria andSmd016IsNull() {
            addCriterion("SMD016 is null");
            return (Criteria) this;
        }

        public Criteria andSmd016IsNotNull() {
            addCriterion("SMD016 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd016EqualTo(Float value) {
            addCriterion("SMD016 =", value, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016NotEqualTo(Float value) {
            addCriterion("SMD016 <>", value, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016GreaterThan(Float value) {
            addCriterion("SMD016 >", value, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016GreaterThanOrEqualTo(Float value) {
            addCriterion("SMD016 >=", value, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016LessThan(Float value) {
            addCriterion("SMD016 <", value, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016LessThanOrEqualTo(Float value) {
            addCriterion("SMD016 <=", value, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016In(List<Float> values) {
            addCriterion("SMD016 in", values, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016NotIn(List<Float> values) {
            addCriterion("SMD016 not in", values, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016Between(Float value1, Float value2) {
            addCriterion("SMD016 between", value1, value2, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd016NotBetween(Float value1, Float value2) {
            addCriterion("SMD016 not between", value1, value2, "smd016");
            return (Criteria) this;
        }

        public Criteria andSmd017IsNull() {
            addCriterion("SMD017 is null");
            return (Criteria) this;
        }

        public Criteria andSmd017IsNotNull() {
            addCriterion("SMD017 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd017EqualTo(String value) {
            addCriterion("SMD017 =", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017NotEqualTo(String value) {
            addCriterion("SMD017 <>", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017GreaterThan(String value) {
            addCriterion("SMD017 >", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017GreaterThanOrEqualTo(String value) {
            addCriterion("SMD017 >=", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017LessThan(String value) {
            addCriterion("SMD017 <", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017LessThanOrEqualTo(String value) {
            addCriterion("SMD017 <=", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017Like(String value) {
            addCriterion("SMD017 like", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017NotLike(String value) {
            addCriterion("SMD017 not like", value, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017In(List<String> values) {
            addCriterion("SMD017 in", values, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017NotIn(List<String> values) {
            addCriterion("SMD017 not in", values, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017Between(String value1, String value2) {
            addCriterion("SMD017 between", value1, value2, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd017NotBetween(String value1, String value2) {
            addCriterion("SMD017 not between", value1, value2, "smd017");
            return (Criteria) this;
        }

        public Criteria andSmd018IsNull() {
            addCriterion("SMD018 is null");
            return (Criteria) this;
        }

        public Criteria andSmd018IsNotNull() {
            addCriterion("SMD018 is not null");
            return (Criteria) this;
        }

        public Criteria andSmd018EqualTo(String value) {
            addCriterion("SMD018 =", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018NotEqualTo(String value) {
            addCriterion("SMD018 <>", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018GreaterThan(String value) {
            addCriterion("SMD018 >", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018GreaterThanOrEqualTo(String value) {
            addCriterion("SMD018 >=", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018LessThan(String value) {
            addCriterion("SMD018 <", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018LessThanOrEqualTo(String value) {
            addCriterion("SMD018 <=", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018Like(String value) {
            addCriterion("SMD018 like", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018NotLike(String value) {
            addCriterion("SMD018 not like", value, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018In(List<String> values) {
            addCriterion("SMD018 in", values, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018NotIn(List<String> values) {
            addCriterion("SMD018 not in", values, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018Between(String value1, String value2) {
            addCriterion("SMD018 between", value1, value2, "smd018");
            return (Criteria) this;
        }

        public Criteria andSmd018NotBetween(String value1, String value2) {
            addCriterion("SMD018 not between", value1, value2, "smd018");
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