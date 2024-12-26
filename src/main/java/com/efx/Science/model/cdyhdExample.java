package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdyhdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdyhdExample() {
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

        public Criteria andYhd001IsNull() {
            addCriterion("YHD001 is null");
            return (Criteria) this;
        }

        public Criteria andYhd001IsNotNull() {
            addCriterion("YHD001 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd001EqualTo(String value) {
            addCriterion("YHD001 =", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001NotEqualTo(String value) {
            addCriterion("YHD001 <>", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001GreaterThan(String value) {
            addCriterion("YHD001 >", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001GreaterThanOrEqualTo(String value) {
            addCriterion("YHD001 >=", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001LessThan(String value) {
            addCriterion("YHD001 <", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001LessThanOrEqualTo(String value) {
            addCriterion("YHD001 <=", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001Like(String value) {
            addCriterion("YHD001 like", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001NotLike(String value) {
            addCriterion("YHD001 not like", value, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001In(List<String> values) {
            addCriterion("YHD001 in", values, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001NotIn(List<String> values) {
            addCriterion("YHD001 not in", values, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001Between(String value1, String value2) {
            addCriterion("YHD001 between", value1, value2, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd001NotBetween(String value1, String value2) {
            addCriterion("YHD001 not between", value1, value2, "yhd001");
            return (Criteria) this;
        }

        public Criteria andYhd002IsNull() {
            addCriterion("YHD002 is null");
            return (Criteria) this;
        }

        public Criteria andYhd002IsNotNull() {
            addCriterion("YHD002 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd002EqualTo(Integer value) {
            addCriterion("YHD002 =", value, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002NotEqualTo(Integer value) {
            addCriterion("YHD002 <>", value, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002GreaterThan(Integer value) {
            addCriterion("YHD002 >", value, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD002 >=", value, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002LessThan(Integer value) {
            addCriterion("YHD002 <", value, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002LessThanOrEqualTo(Integer value) {
            addCriterion("YHD002 <=", value, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002In(List<Integer> values) {
            addCriterion("YHD002 in", values, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002NotIn(List<Integer> values) {
            addCriterion("YHD002 not in", values, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002Between(Integer value1, Integer value2) {
            addCriterion("YHD002 between", value1, value2, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd002NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD002 not between", value1, value2, "yhd002");
            return (Criteria) this;
        }

        public Criteria andYhd003IsNull() {
            addCriterion("YHD003 is null");
            return (Criteria) this;
        }

        public Criteria andYhd003IsNotNull() {
            addCriterion("YHD003 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd003EqualTo(Date value) {
            addCriterion("YHD003 =", value, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003NotEqualTo(Date value) {
            addCriterion("YHD003 <>", value, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003GreaterThan(Date value) {
            addCriterion("YHD003 >", value, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003GreaterThanOrEqualTo(Date value) {
            addCriterion("YHD003 >=", value, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003LessThan(Date value) {
            addCriterion("YHD003 <", value, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003LessThanOrEqualTo(Date value) {
            addCriterion("YHD003 <=", value, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003In(List<Date> values) {
            addCriterion("YHD003 in", values, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003NotIn(List<Date> values) {
            addCriterion("YHD003 not in", values, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003Between(Date value1, Date value2) {
            addCriterion("YHD003 between", value1, value2, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd003NotBetween(Date value1, Date value2) {
            addCriterion("YHD003 not between", value1, value2, "yhd003");
            return (Criteria) this;
        }

        public Criteria andYhd004IsNull() {
            addCriterion("YHD004 is null");
            return (Criteria) this;
        }

        public Criteria andYhd004IsNotNull() {
            addCriterion("YHD004 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd004EqualTo(String value) {
            addCriterion("YHD004 =", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004NotEqualTo(String value) {
            addCriterion("YHD004 <>", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004GreaterThan(String value) {
            addCriterion("YHD004 >", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004GreaterThanOrEqualTo(String value) {
            addCriterion("YHD004 >=", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004LessThan(String value) {
            addCriterion("YHD004 <", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004LessThanOrEqualTo(String value) {
            addCriterion("YHD004 <=", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004Like(String value) {
            addCriterion("YHD004 like", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004NotLike(String value) {
            addCriterion("YHD004 not like", value, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004In(List<String> values) {
            addCriterion("YHD004 in", values, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004NotIn(List<String> values) {
            addCriterion("YHD004 not in", values, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004Between(String value1, String value2) {
            addCriterion("YHD004 between", value1, value2, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd004NotBetween(String value1, String value2) {
            addCriterion("YHD004 not between", value1, value2, "yhd004");
            return (Criteria) this;
        }

        public Criteria andYhd005IsNull() {
            addCriterion("YHD005 is null");
            return (Criteria) this;
        }

        public Criteria andYhd005IsNotNull() {
            addCriterion("YHD005 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd005EqualTo(String value) {
            addCriterion("YHD005 =", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005NotEqualTo(String value) {
            addCriterion("YHD005 <>", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005GreaterThan(String value) {
            addCriterion("YHD005 >", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005GreaterThanOrEqualTo(String value) {
            addCriterion("YHD005 >=", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005LessThan(String value) {
            addCriterion("YHD005 <", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005LessThanOrEqualTo(String value) {
            addCriterion("YHD005 <=", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005Like(String value) {
            addCriterion("YHD005 like", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005NotLike(String value) {
            addCriterion("YHD005 not like", value, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005In(List<String> values) {
            addCriterion("YHD005 in", values, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005NotIn(List<String> values) {
            addCriterion("YHD005 not in", values, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005Between(String value1, String value2) {
            addCriterion("YHD005 between", value1, value2, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd005NotBetween(String value1, String value2) {
            addCriterion("YHD005 not between", value1, value2, "yhd005");
            return (Criteria) this;
        }

        public Criteria andYhd006IsNull() {
            addCriterion("YHD006 is null");
            return (Criteria) this;
        }

        public Criteria andYhd006IsNotNull() {
            addCriterion("YHD006 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd006EqualTo(String value) {
            addCriterion("YHD006 =", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006NotEqualTo(String value) {
            addCriterion("YHD006 <>", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006GreaterThan(String value) {
            addCriterion("YHD006 >", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006GreaterThanOrEqualTo(String value) {
            addCriterion("YHD006 >=", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006LessThan(String value) {
            addCriterion("YHD006 <", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006LessThanOrEqualTo(String value) {
            addCriterion("YHD006 <=", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006Like(String value) {
            addCriterion("YHD006 like", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006NotLike(String value) {
            addCriterion("YHD006 not like", value, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006In(List<String> values) {
            addCriterion("YHD006 in", values, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006NotIn(List<String> values) {
            addCriterion("YHD006 not in", values, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006Between(String value1, String value2) {
            addCriterion("YHD006 between", value1, value2, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd006NotBetween(String value1, String value2) {
            addCriterion("YHD006 not between", value1, value2, "yhd006");
            return (Criteria) this;
        }

        public Criteria andYhd007IsNull() {
            addCriterion("YHD007 is null");
            return (Criteria) this;
        }

        public Criteria andYhd007IsNotNull() {
            addCriterion("YHD007 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd007EqualTo(Integer value) {
            addCriterion("YHD007 =", value, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007NotEqualTo(Integer value) {
            addCriterion("YHD007 <>", value, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007GreaterThan(Integer value) {
            addCriterion("YHD007 >", value, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD007 >=", value, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007LessThan(Integer value) {
            addCriterion("YHD007 <", value, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007LessThanOrEqualTo(Integer value) {
            addCriterion("YHD007 <=", value, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007In(List<Integer> values) {
            addCriterion("YHD007 in", values, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007NotIn(List<Integer> values) {
            addCriterion("YHD007 not in", values, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007Between(Integer value1, Integer value2) {
            addCriterion("YHD007 between", value1, value2, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd007NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD007 not between", value1, value2, "yhd007");
            return (Criteria) this;
        }

        public Criteria andYhd008IsNull() {
            addCriterion("YHD008 is null");
            return (Criteria) this;
        }

        public Criteria andYhd008IsNotNull() {
            addCriterion("YHD008 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd008EqualTo(String value) {
            addCriterion("YHD008 =", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008NotEqualTo(String value) {
            addCriterion("YHD008 <>", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008GreaterThan(String value) {
            addCriterion("YHD008 >", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008GreaterThanOrEqualTo(String value) {
            addCriterion("YHD008 >=", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008LessThan(String value) {
            addCriterion("YHD008 <", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008LessThanOrEqualTo(String value) {
            addCriterion("YHD008 <=", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008Like(String value) {
            addCriterion("YHD008 like", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008NotLike(String value) {
            addCriterion("YHD008 not like", value, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008In(List<String> values) {
            addCriterion("YHD008 in", values, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008NotIn(List<String> values) {
            addCriterion("YHD008 not in", values, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008Between(String value1, String value2) {
            addCriterion("YHD008 between", value1, value2, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd008NotBetween(String value1, String value2) {
            addCriterion("YHD008 not between", value1, value2, "yhd008");
            return (Criteria) this;
        }

        public Criteria andYhd009IsNull() {
            addCriterion("YHD009 is null");
            return (Criteria) this;
        }

        public Criteria andYhd009IsNotNull() {
            addCriterion("YHD009 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd009EqualTo(String value) {
            addCriterion("YHD009 =", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009NotEqualTo(String value) {
            addCriterion("YHD009 <>", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009GreaterThan(String value) {
            addCriterion("YHD009 >", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009GreaterThanOrEqualTo(String value) {
            addCriterion("YHD009 >=", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009LessThan(String value) {
            addCriterion("YHD009 <", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009LessThanOrEqualTo(String value) {
            addCriterion("YHD009 <=", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009Like(String value) {
            addCriterion("YHD009 like", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009NotLike(String value) {
            addCriterion("YHD009 not like", value, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009In(List<String> values) {
            addCriterion("YHD009 in", values, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009NotIn(List<String> values) {
            addCriterion("YHD009 not in", values, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009Between(String value1, String value2) {
            addCriterion("YHD009 between", value1, value2, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd009NotBetween(String value1, String value2) {
            addCriterion("YHD009 not between", value1, value2, "yhd009");
            return (Criteria) this;
        }

        public Criteria andYhd010IsNull() {
            addCriterion("YHD010 is null");
            return (Criteria) this;
        }

        public Criteria andYhd010IsNotNull() {
            addCriterion("YHD010 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd010EqualTo(Integer value) {
            addCriterion("YHD010 =", value, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010NotEqualTo(Integer value) {
            addCriterion("YHD010 <>", value, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010GreaterThan(Integer value) {
            addCriterion("YHD010 >", value, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD010 >=", value, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010LessThan(Integer value) {
            addCriterion("YHD010 <", value, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010LessThanOrEqualTo(Integer value) {
            addCriterion("YHD010 <=", value, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010In(List<Integer> values) {
            addCriterion("YHD010 in", values, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010NotIn(List<Integer> values) {
            addCriterion("YHD010 not in", values, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010Between(Integer value1, Integer value2) {
            addCriterion("YHD010 between", value1, value2, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd010NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD010 not between", value1, value2, "yhd010");
            return (Criteria) this;
        }

        public Criteria andYhd011IsNull() {
            addCriterion("YHD011 is null");
            return (Criteria) this;
        }

        public Criteria andYhd011IsNotNull() {
            addCriterion("YHD011 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd011EqualTo(Integer value) {
            addCriterion("YHD011 =", value, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011NotEqualTo(Integer value) {
            addCriterion("YHD011 <>", value, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011GreaterThan(Integer value) {
            addCriterion("YHD011 >", value, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD011 >=", value, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011LessThan(Integer value) {
            addCriterion("YHD011 <", value, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011LessThanOrEqualTo(Integer value) {
            addCriterion("YHD011 <=", value, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011In(List<Integer> values) {
            addCriterion("YHD011 in", values, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011NotIn(List<Integer> values) {
            addCriterion("YHD011 not in", values, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011Between(Integer value1, Integer value2) {
            addCriterion("YHD011 between", value1, value2, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd011NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD011 not between", value1, value2, "yhd011");
            return (Criteria) this;
        }

        public Criteria andYhd012IsNull() {
            addCriterion("YHD012 is null");
            return (Criteria) this;
        }

        public Criteria andYhd012IsNotNull() {
            addCriterion("YHD012 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd012EqualTo(Integer value) {
            addCriterion("YHD012 =", value, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012NotEqualTo(Integer value) {
            addCriterion("YHD012 <>", value, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012GreaterThan(Integer value) {
            addCriterion("YHD012 >", value, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD012 >=", value, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012LessThan(Integer value) {
            addCriterion("YHD012 <", value, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012LessThanOrEqualTo(Integer value) {
            addCriterion("YHD012 <=", value, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012In(List<Integer> values) {
            addCriterion("YHD012 in", values, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012NotIn(List<Integer> values) {
            addCriterion("YHD012 not in", values, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012Between(Integer value1, Integer value2) {
            addCriterion("YHD012 between", value1, value2, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd012NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD012 not between", value1, value2, "yhd012");
            return (Criteria) this;
        }

        public Criteria andYhd013IsNull() {
            addCriterion("YHD013 is null");
            return (Criteria) this;
        }

        public Criteria andYhd013IsNotNull() {
            addCriterion("YHD013 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd013EqualTo(Integer value) {
            addCriterion("YHD013 =", value, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013NotEqualTo(Integer value) {
            addCriterion("YHD013 <>", value, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013GreaterThan(Integer value) {
            addCriterion("YHD013 >", value, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD013 >=", value, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013LessThan(Integer value) {
            addCriterion("YHD013 <", value, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013LessThanOrEqualTo(Integer value) {
            addCriterion("YHD013 <=", value, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013In(List<Integer> values) {
            addCriterion("YHD013 in", values, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013NotIn(List<Integer> values) {
            addCriterion("YHD013 not in", values, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013Between(Integer value1, Integer value2) {
            addCriterion("YHD013 between", value1, value2, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd013NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD013 not between", value1, value2, "yhd013");
            return (Criteria) this;
        }

        public Criteria andYhd014IsNull() {
            addCriterion("YHD014 is null");
            return (Criteria) this;
        }

        public Criteria andYhd014IsNotNull() {
            addCriterion("YHD014 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd014EqualTo(Integer value) {
            addCriterion("YHD014 =", value, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014NotEqualTo(Integer value) {
            addCriterion("YHD014 <>", value, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014GreaterThan(Integer value) {
            addCriterion("YHD014 >", value, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD014 >=", value, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014LessThan(Integer value) {
            addCriterion("YHD014 <", value, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014LessThanOrEqualTo(Integer value) {
            addCriterion("YHD014 <=", value, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014In(List<Integer> values) {
            addCriterion("YHD014 in", values, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014NotIn(List<Integer> values) {
            addCriterion("YHD014 not in", values, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014Between(Integer value1, Integer value2) {
            addCriterion("YHD014 between", value1, value2, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd014NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD014 not between", value1, value2, "yhd014");
            return (Criteria) this;
        }

        public Criteria andYhd015IsNull() {
            addCriterion("YHD015 is null");
            return (Criteria) this;
        }

        public Criteria andYhd015IsNotNull() {
            addCriterion("YHD015 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd015EqualTo(Integer value) {
            addCriterion("YHD015 =", value, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015NotEqualTo(Integer value) {
            addCriterion("YHD015 <>", value, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015GreaterThan(Integer value) {
            addCriterion("YHD015 >", value, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD015 >=", value, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015LessThan(Integer value) {
            addCriterion("YHD015 <", value, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015LessThanOrEqualTo(Integer value) {
            addCriterion("YHD015 <=", value, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015In(List<Integer> values) {
            addCriterion("YHD015 in", values, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015NotIn(List<Integer> values) {
            addCriterion("YHD015 not in", values, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015Between(Integer value1, Integer value2) {
            addCriterion("YHD015 between", value1, value2, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd015NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD015 not between", value1, value2, "yhd015");
            return (Criteria) this;
        }

        public Criteria andYhd016IsNull() {
            addCriterion("YHD016 is null");
            return (Criteria) this;
        }

        public Criteria andYhd016IsNotNull() {
            addCriterion("YHD016 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd016EqualTo(Integer value) {
            addCriterion("YHD016 =", value, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016NotEqualTo(Integer value) {
            addCriterion("YHD016 <>", value, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016GreaterThan(Integer value) {
            addCriterion("YHD016 >", value, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD016 >=", value, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016LessThan(Integer value) {
            addCriterion("YHD016 <", value, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016LessThanOrEqualTo(Integer value) {
            addCriterion("YHD016 <=", value, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016In(List<Integer> values) {
            addCriterion("YHD016 in", values, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016NotIn(List<Integer> values) {
            addCriterion("YHD016 not in", values, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016Between(Integer value1, Integer value2) {
            addCriterion("YHD016 between", value1, value2, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd016NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD016 not between", value1, value2, "yhd016");
            return (Criteria) this;
        }

        public Criteria andYhd017IsNull() {
            addCriterion("YHD017 is null");
            return (Criteria) this;
        }

        public Criteria andYhd017IsNotNull() {
            addCriterion("YHD017 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd017EqualTo(Integer value) {
            addCriterion("YHD017 =", value, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017NotEqualTo(Integer value) {
            addCriterion("YHD017 <>", value, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017GreaterThan(Integer value) {
            addCriterion("YHD017 >", value, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHD017 >=", value, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017LessThan(Integer value) {
            addCriterion("YHD017 <", value, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017LessThanOrEqualTo(Integer value) {
            addCriterion("YHD017 <=", value, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017In(List<Integer> values) {
            addCriterion("YHD017 in", values, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017NotIn(List<Integer> values) {
            addCriterion("YHD017 not in", values, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017Between(Integer value1, Integer value2) {
            addCriterion("YHD017 between", value1, value2, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd017NotBetween(Integer value1, Integer value2) {
            addCriterion("YHD017 not between", value1, value2, "yhd017");
            return (Criteria) this;
        }

        public Criteria andYhd018IsNull() {
            addCriterion("YHD018 is null");
            return (Criteria) this;
        }

        public Criteria andYhd018IsNotNull() {
            addCriterion("YHD018 is not null");
            return (Criteria) this;
        }

        public Criteria andYhd018EqualTo(Float value) {
            addCriterion("YHD018 =", value, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018NotEqualTo(Float value) {
            addCriterion("YHD018 <>", value, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018GreaterThan(Float value) {
            addCriterion("YHD018 >", value, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018GreaterThanOrEqualTo(Float value) {
            addCriterion("YHD018 >=", value, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018LessThan(Float value) {
            addCriterion("YHD018 <", value, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018LessThanOrEqualTo(Float value) {
            addCriterion("YHD018 <=", value, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018In(List<Float> values) {
            addCriterion("YHD018 in", values, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018NotIn(List<Float> values) {
            addCriterion("YHD018 not in", values, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018Between(Float value1, Float value2) {
            addCriterion("YHD018 between", value1, value2, "yhd018");
            return (Criteria) this;
        }

        public Criteria andYhd018NotBetween(Float value1, Float value2) {
            addCriterion("YHD018 not between", value1, value2, "yhd018");
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