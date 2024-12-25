package com.efx.Science.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cdyheExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdyheExample() {
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

        public Criteria andYhe001IsNull() {
            addCriterion("YHE001 is null");
            return (Criteria) this;
        }

        public Criteria andYhe001IsNotNull() {
            addCriterion("YHE001 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe001EqualTo(Integer value) {
            addCriterion("YHE001 =", value, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001NotEqualTo(Integer value) {
            addCriterion("YHE001 <>", value, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001GreaterThan(Integer value) {
            addCriterion("YHE001 >", value, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE001 >=", value, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001LessThan(Integer value) {
            addCriterion("YHE001 <", value, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001LessThanOrEqualTo(Integer value) {
            addCriterion("YHE001 <=", value, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001In(List<Integer> values) {
            addCriterion("YHE001 in", values, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001NotIn(List<Integer> values) {
            addCriterion("YHE001 not in", values, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001Between(Integer value1, Integer value2) {
            addCriterion("YHE001 between", value1, value2, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe001NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE001 not between", value1, value2, "yhe001");
            return (Criteria) this;
        }

        public Criteria andYhe002IsNull() {
            addCriterion("YHE002 is null");
            return (Criteria) this;
        }

        public Criteria andYhe002IsNotNull() {
            addCriterion("YHE002 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe002EqualTo(Integer value) {
            addCriterion("YHE002 =", value, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002NotEqualTo(Integer value) {
            addCriterion("YHE002 <>", value, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002GreaterThan(Integer value) {
            addCriterion("YHE002 >", value, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE002 >=", value, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002LessThan(Integer value) {
            addCriterion("YHE002 <", value, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002LessThanOrEqualTo(Integer value) {
            addCriterion("YHE002 <=", value, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002In(List<Integer> values) {
            addCriterion("YHE002 in", values, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002NotIn(List<Integer> values) {
            addCriterion("YHE002 not in", values, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002Between(Integer value1, Integer value2) {
            addCriterion("YHE002 between", value1, value2, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe002NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE002 not between", value1, value2, "yhe002");
            return (Criteria) this;
        }

        public Criteria andYhe003IsNull() {
            addCriterion("YHE003 is null");
            return (Criteria) this;
        }

        public Criteria andYhe003IsNotNull() {
            addCriterion("YHE003 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe003EqualTo(Integer value) {
            addCriterion("YHE003 =", value, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003NotEqualTo(Integer value) {
            addCriterion("YHE003 <>", value, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003GreaterThan(Integer value) {
            addCriterion("YHE003 >", value, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE003 >=", value, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003LessThan(Integer value) {
            addCriterion("YHE003 <", value, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003LessThanOrEqualTo(Integer value) {
            addCriterion("YHE003 <=", value, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003In(List<Integer> values) {
            addCriterion("YHE003 in", values, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003NotIn(List<Integer> values) {
            addCriterion("YHE003 not in", values, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003Between(Integer value1, Integer value2) {
            addCriterion("YHE003 between", value1, value2, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe003NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE003 not between", value1, value2, "yhe003");
            return (Criteria) this;
        }

        public Criteria andYhe004IsNull() {
            addCriterion("YHE004 is null");
            return (Criteria) this;
        }

        public Criteria andYhe004IsNotNull() {
            addCriterion("YHE004 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe004EqualTo(Integer value) {
            addCriterion("YHE004 =", value, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004NotEqualTo(Integer value) {
            addCriterion("YHE004 <>", value, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004GreaterThan(Integer value) {
            addCriterion("YHE004 >", value, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE004 >=", value, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004LessThan(Integer value) {
            addCriterion("YHE004 <", value, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004LessThanOrEqualTo(Integer value) {
            addCriterion("YHE004 <=", value, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004In(List<Integer> values) {
            addCriterion("YHE004 in", values, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004NotIn(List<Integer> values) {
            addCriterion("YHE004 not in", values, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004Between(Integer value1, Integer value2) {
            addCriterion("YHE004 between", value1, value2, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe004NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE004 not between", value1, value2, "yhe004");
            return (Criteria) this;
        }

        public Criteria andYhe005IsNull() {
            addCriterion("YHE005 is null");
            return (Criteria) this;
        }

        public Criteria andYhe005IsNotNull() {
            addCriterion("YHE005 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe005EqualTo(Integer value) {
            addCriterion("YHE005 =", value, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005NotEqualTo(Integer value) {
            addCriterion("YHE005 <>", value, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005GreaterThan(Integer value) {
            addCriterion("YHE005 >", value, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE005 >=", value, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005LessThan(Integer value) {
            addCriterion("YHE005 <", value, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005LessThanOrEqualTo(Integer value) {
            addCriterion("YHE005 <=", value, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005In(List<Integer> values) {
            addCriterion("YHE005 in", values, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005NotIn(List<Integer> values) {
            addCriterion("YHE005 not in", values, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005Between(Integer value1, Integer value2) {
            addCriterion("YHE005 between", value1, value2, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe005NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE005 not between", value1, value2, "yhe005");
            return (Criteria) this;
        }

        public Criteria andYhe006IsNull() {
            addCriterion("YHE006 is null");
            return (Criteria) this;
        }

        public Criteria andYhe006IsNotNull() {
            addCriterion("YHE006 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe006EqualTo(String value) {
            addCriterion("YHE006 =", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006NotEqualTo(String value) {
            addCriterion("YHE006 <>", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006GreaterThan(String value) {
            addCriterion("YHE006 >", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006GreaterThanOrEqualTo(String value) {
            addCriterion("YHE006 >=", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006LessThan(String value) {
            addCriterion("YHE006 <", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006LessThanOrEqualTo(String value) {
            addCriterion("YHE006 <=", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006Like(String value) {
            addCriterion("YHE006 like", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006NotLike(String value) {
            addCriterion("YHE006 not like", value, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006In(List<String> values) {
            addCriterion("YHE006 in", values, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006NotIn(List<String> values) {
            addCriterion("YHE006 not in", values, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006Between(String value1, String value2) {
            addCriterion("YHE006 between", value1, value2, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe006NotBetween(String value1, String value2) {
            addCriterion("YHE006 not between", value1, value2, "yhe006");
            return (Criteria) this;
        }

        public Criteria andYhe007IsNull() {
            addCriterion("YHE007 is null");
            return (Criteria) this;
        }

        public Criteria andYhe007IsNotNull() {
            addCriterion("YHE007 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe007EqualTo(String value) {
            addCriterion("YHE007 =", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007NotEqualTo(String value) {
            addCriterion("YHE007 <>", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007GreaterThan(String value) {
            addCriterion("YHE007 >", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007GreaterThanOrEqualTo(String value) {
            addCriterion("YHE007 >=", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007LessThan(String value) {
            addCriterion("YHE007 <", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007LessThanOrEqualTo(String value) {
            addCriterion("YHE007 <=", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007Like(String value) {
            addCriterion("YHE007 like", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007NotLike(String value) {
            addCriterion("YHE007 not like", value, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007In(List<String> values) {
            addCriterion("YHE007 in", values, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007NotIn(List<String> values) {
            addCriterion("YHE007 not in", values, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007Between(String value1, String value2) {
            addCriterion("YHE007 between", value1, value2, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe007NotBetween(String value1, String value2) {
            addCriterion("YHE007 not between", value1, value2, "yhe007");
            return (Criteria) this;
        }

        public Criteria andYhe008IsNull() {
            addCriterion("YHE008 is null");
            return (Criteria) this;
        }

        public Criteria andYhe008IsNotNull() {
            addCriterion("YHE008 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe008EqualTo(Date value) {
            addCriterion("YHE008 =", value, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008NotEqualTo(Date value) {
            addCriterion("YHE008 <>", value, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008GreaterThan(Date value) {
            addCriterion("YHE008 >", value, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008GreaterThanOrEqualTo(Date value) {
            addCriterion("YHE008 >=", value, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008LessThan(Date value) {
            addCriterion("YHE008 <", value, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008LessThanOrEqualTo(Date value) {
            addCriterion("YHE008 <=", value, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008In(List<Date> values) {
            addCriterion("YHE008 in", values, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008NotIn(List<Date> values) {
            addCriterion("YHE008 not in", values, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008Between(Date value1, Date value2) {
            addCriterion("YHE008 between", value1, value2, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe008NotBetween(Date value1, Date value2) {
            addCriterion("YHE008 not between", value1, value2, "yhe008");
            return (Criteria) this;
        }

        public Criteria andYhe009IsNull() {
            addCriterion("YHE009 is null");
            return (Criteria) this;
        }

        public Criteria andYhe009IsNotNull() {
            addCriterion("YHE009 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe009EqualTo(String value) {
            addCriterion("YHE009 =", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009NotEqualTo(String value) {
            addCriterion("YHE009 <>", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009GreaterThan(String value) {
            addCriterion("YHE009 >", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009GreaterThanOrEqualTo(String value) {
            addCriterion("YHE009 >=", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009LessThan(String value) {
            addCriterion("YHE009 <", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009LessThanOrEqualTo(String value) {
            addCriterion("YHE009 <=", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009Like(String value) {
            addCriterion("YHE009 like", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009NotLike(String value) {
            addCriterion("YHE009 not like", value, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009In(List<String> values) {
            addCriterion("YHE009 in", values, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009NotIn(List<String> values) {
            addCriterion("YHE009 not in", values, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009Between(String value1, String value2) {
            addCriterion("YHE009 between", value1, value2, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe009NotBetween(String value1, String value2) {
            addCriterion("YHE009 not between", value1, value2, "yhe009");
            return (Criteria) this;
        }

        public Criteria andYhe010IsNull() {
            addCriterion("YHE010 is null");
            return (Criteria) this;
        }

        public Criteria andYhe010IsNotNull() {
            addCriterion("YHE010 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe010EqualTo(Integer value) {
            addCriterion("YHE010 =", value, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010NotEqualTo(Integer value) {
            addCriterion("YHE010 <>", value, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010GreaterThan(Integer value) {
            addCriterion("YHE010 >", value, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE010 >=", value, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010LessThan(Integer value) {
            addCriterion("YHE010 <", value, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010LessThanOrEqualTo(Integer value) {
            addCriterion("YHE010 <=", value, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010In(List<Integer> values) {
            addCriterion("YHE010 in", values, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010NotIn(List<Integer> values) {
            addCriterion("YHE010 not in", values, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010Between(Integer value1, Integer value2) {
            addCriterion("YHE010 between", value1, value2, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe010NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE010 not between", value1, value2, "yhe010");
            return (Criteria) this;
        }

        public Criteria andYhe011IsNull() {
            addCriterion("YHE011 is null");
            return (Criteria) this;
        }

        public Criteria andYhe011IsNotNull() {
            addCriterion("YHE011 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe011EqualTo(Float value) {
            addCriterion("YHE011 =", value, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011NotEqualTo(Float value) {
            addCriterion("YHE011 <>", value, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011GreaterThan(Float value) {
            addCriterion("YHE011 >", value, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011GreaterThanOrEqualTo(Float value) {
            addCriterion("YHE011 >=", value, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011LessThan(Float value) {
            addCriterion("YHE011 <", value, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011LessThanOrEqualTo(Float value) {
            addCriterion("YHE011 <=", value, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011In(List<Float> values) {
            addCriterion("YHE011 in", values, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011NotIn(List<Float> values) {
            addCriterion("YHE011 not in", values, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011Between(Float value1, Float value2) {
            addCriterion("YHE011 between", value1, value2, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe011NotBetween(Float value1, Float value2) {
            addCriterion("YHE011 not between", value1, value2, "yhe011");
            return (Criteria) this;
        }

        public Criteria andYhe012IsNull() {
            addCriterion("YHE012 is null");
            return (Criteria) this;
        }

        public Criteria andYhe012IsNotNull() {
            addCriterion("YHE012 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe012EqualTo(Float value) {
            addCriterion("YHE012 =", value, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012NotEqualTo(Float value) {
            addCriterion("YHE012 <>", value, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012GreaterThan(Float value) {
            addCriterion("YHE012 >", value, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012GreaterThanOrEqualTo(Float value) {
            addCriterion("YHE012 >=", value, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012LessThan(Float value) {
            addCriterion("YHE012 <", value, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012LessThanOrEqualTo(Float value) {
            addCriterion("YHE012 <=", value, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012In(List<Float> values) {
            addCriterion("YHE012 in", values, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012NotIn(List<Float> values) {
            addCriterion("YHE012 not in", values, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012Between(Float value1, Float value2) {
            addCriterion("YHE012 between", value1, value2, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe012NotBetween(Float value1, Float value2) {
            addCriterion("YHE012 not between", value1, value2, "yhe012");
            return (Criteria) this;
        }

        public Criteria andYhe013IsNull() {
            addCriterion("YHE013 is null");
            return (Criteria) this;
        }

        public Criteria andYhe013IsNotNull() {
            addCriterion("YHE013 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe013EqualTo(Float value) {
            addCriterion("YHE013 =", value, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013NotEqualTo(Float value) {
            addCriterion("YHE013 <>", value, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013GreaterThan(Float value) {
            addCriterion("YHE013 >", value, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013GreaterThanOrEqualTo(Float value) {
            addCriterion("YHE013 >=", value, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013LessThan(Float value) {
            addCriterion("YHE013 <", value, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013LessThanOrEqualTo(Float value) {
            addCriterion("YHE013 <=", value, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013In(List<Float> values) {
            addCriterion("YHE013 in", values, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013NotIn(List<Float> values) {
            addCriterion("YHE013 not in", values, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013Between(Float value1, Float value2) {
            addCriterion("YHE013 between", value1, value2, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe013NotBetween(Float value1, Float value2) {
            addCriterion("YHE013 not between", value1, value2, "yhe013");
            return (Criteria) this;
        }

        public Criteria andYhe014IsNull() {
            addCriterion("YHE014 is null");
            return (Criteria) this;
        }

        public Criteria andYhe014IsNotNull() {
            addCriterion("YHE014 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe014EqualTo(Float value) {
            addCriterion("YHE014 =", value, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014NotEqualTo(Float value) {
            addCriterion("YHE014 <>", value, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014GreaterThan(Float value) {
            addCriterion("YHE014 >", value, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014GreaterThanOrEqualTo(Float value) {
            addCriterion("YHE014 >=", value, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014LessThan(Float value) {
            addCriterion("YHE014 <", value, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014LessThanOrEqualTo(Float value) {
            addCriterion("YHE014 <=", value, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014In(List<Float> values) {
            addCriterion("YHE014 in", values, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014NotIn(List<Float> values) {
            addCriterion("YHE014 not in", values, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014Between(Float value1, Float value2) {
            addCriterion("YHE014 between", value1, value2, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe014NotBetween(Float value1, Float value2) {
            addCriterion("YHE014 not between", value1, value2, "yhe014");
            return (Criteria) this;
        }

        public Criteria andYhe015IsNull() {
            addCriterion("YHE015 is null");
            return (Criteria) this;
        }

        public Criteria andYhe015IsNotNull() {
            addCriterion("YHE015 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe015EqualTo(Integer value) {
            addCriterion("YHE015 =", value, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015NotEqualTo(Integer value) {
            addCriterion("YHE015 <>", value, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015GreaterThan(Integer value) {
            addCriterion("YHE015 >", value, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE015 >=", value, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015LessThan(Integer value) {
            addCriterion("YHE015 <", value, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015LessThanOrEqualTo(Integer value) {
            addCriterion("YHE015 <=", value, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015In(List<Integer> values) {
            addCriterion("YHE015 in", values, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015NotIn(List<Integer> values) {
            addCriterion("YHE015 not in", values, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015Between(Integer value1, Integer value2) {
            addCriterion("YHE015 between", value1, value2, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe015NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE015 not between", value1, value2, "yhe015");
            return (Criteria) this;
        }

        public Criteria andYhe016IsNull() {
            addCriterion("YHE016 is null");
            return (Criteria) this;
        }

        public Criteria andYhe016IsNotNull() {
            addCriterion("YHE016 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe016EqualTo(Integer value) {
            addCriterion("YHE016 =", value, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016NotEqualTo(Integer value) {
            addCriterion("YHE016 <>", value, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016GreaterThan(Integer value) {
            addCriterion("YHE016 >", value, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE016 >=", value, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016LessThan(Integer value) {
            addCriterion("YHE016 <", value, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016LessThanOrEqualTo(Integer value) {
            addCriterion("YHE016 <=", value, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016In(List<Integer> values) {
            addCriterion("YHE016 in", values, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016NotIn(List<Integer> values) {
            addCriterion("YHE016 not in", values, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016Between(Integer value1, Integer value2) {
            addCriterion("YHE016 between", value1, value2, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe016NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE016 not between", value1, value2, "yhe016");
            return (Criteria) this;
        }

        public Criteria andYhe017IsNull() {
            addCriterion("YHE017 is null");
            return (Criteria) this;
        }

        public Criteria andYhe017IsNotNull() {
            addCriterion("YHE017 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe017EqualTo(Integer value) {
            addCriterion("YHE017 =", value, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017NotEqualTo(Integer value) {
            addCriterion("YHE017 <>", value, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017GreaterThan(Integer value) {
            addCriterion("YHE017 >", value, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE017 >=", value, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017LessThan(Integer value) {
            addCriterion("YHE017 <", value, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017LessThanOrEqualTo(Integer value) {
            addCriterion("YHE017 <=", value, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017In(List<Integer> values) {
            addCriterion("YHE017 in", values, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017NotIn(List<Integer> values) {
            addCriterion("YHE017 not in", values, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017Between(Integer value1, Integer value2) {
            addCriterion("YHE017 between", value1, value2, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe017NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE017 not between", value1, value2, "yhe017");
            return (Criteria) this;
        }

        public Criteria andYhe018IsNull() {
            addCriterion("YHE018 is null");
            return (Criteria) this;
        }

        public Criteria andYhe018IsNotNull() {
            addCriterion("YHE018 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe018EqualTo(Float value) {
            addCriterion("YHE018 =", value, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018NotEqualTo(Float value) {
            addCriterion("YHE018 <>", value, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018GreaterThan(Float value) {
            addCriterion("YHE018 >", value, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018GreaterThanOrEqualTo(Float value) {
            addCriterion("YHE018 >=", value, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018LessThan(Float value) {
            addCriterion("YHE018 <", value, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018LessThanOrEqualTo(Float value) {
            addCriterion("YHE018 <=", value, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018In(List<Float> values) {
            addCriterion("YHE018 in", values, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018NotIn(List<Float> values) {
            addCriterion("YHE018 not in", values, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018Between(Float value1, Float value2) {
            addCriterion("YHE018 between", value1, value2, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe018NotBetween(Float value1, Float value2) {
            addCriterion("YHE018 not between", value1, value2, "yhe018");
            return (Criteria) this;
        }

        public Criteria andYhe019IsNull() {
            addCriterion("YHE019 is null");
            return (Criteria) this;
        }

        public Criteria andYhe019IsNotNull() {
            addCriterion("YHE019 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe019EqualTo(Float value) {
            addCriterion("YHE019 =", value, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019NotEqualTo(Float value) {
            addCriterion("YHE019 <>", value, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019GreaterThan(Float value) {
            addCriterion("YHE019 >", value, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019GreaterThanOrEqualTo(Float value) {
            addCriterion("YHE019 >=", value, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019LessThan(Float value) {
            addCriterion("YHE019 <", value, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019LessThanOrEqualTo(Float value) {
            addCriterion("YHE019 <=", value, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019In(List<Float> values) {
            addCriterion("YHE019 in", values, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019NotIn(List<Float> values) {
            addCriterion("YHE019 not in", values, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019Between(Float value1, Float value2) {
            addCriterion("YHE019 between", value1, value2, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe019NotBetween(Float value1, Float value2) {
            addCriterion("YHE019 not between", value1, value2, "yhe019");
            return (Criteria) this;
        }

        public Criteria andYhe020IsNull() {
            addCriterion("YHE020 is null");
            return (Criteria) this;
        }

        public Criteria andYhe020IsNotNull() {
            addCriterion("YHE020 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe020EqualTo(Date value) {
            addCriterion("YHE020 =", value, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020NotEqualTo(Date value) {
            addCriterion("YHE020 <>", value, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020GreaterThan(Date value) {
            addCriterion("YHE020 >", value, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020GreaterThanOrEqualTo(Date value) {
            addCriterion("YHE020 >=", value, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020LessThan(Date value) {
            addCriterion("YHE020 <", value, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020LessThanOrEqualTo(Date value) {
            addCriterion("YHE020 <=", value, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020In(List<Date> values) {
            addCriterion("YHE020 in", values, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020NotIn(List<Date> values) {
            addCriterion("YHE020 not in", values, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020Between(Date value1, Date value2) {
            addCriterion("YHE020 between", value1, value2, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe020NotBetween(Date value1, Date value2) {
            addCriterion("YHE020 not between", value1, value2, "yhe020");
            return (Criteria) this;
        }

        public Criteria andYhe021IsNull() {
            addCriterion("YHE021 is null");
            return (Criteria) this;
        }

        public Criteria andYhe021IsNotNull() {
            addCriterion("YHE021 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe021EqualTo(String value) {
            addCriterion("YHE021 =", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021NotEqualTo(String value) {
            addCriterion("YHE021 <>", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021GreaterThan(String value) {
            addCriterion("YHE021 >", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021GreaterThanOrEqualTo(String value) {
            addCriterion("YHE021 >=", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021LessThan(String value) {
            addCriterion("YHE021 <", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021LessThanOrEqualTo(String value) {
            addCriterion("YHE021 <=", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021Like(String value) {
            addCriterion("YHE021 like", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021NotLike(String value) {
            addCriterion("YHE021 not like", value, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021In(List<String> values) {
            addCriterion("YHE021 in", values, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021NotIn(List<String> values) {
            addCriterion("YHE021 not in", values, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021Between(String value1, String value2) {
            addCriterion("YHE021 between", value1, value2, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe021NotBetween(String value1, String value2) {
            addCriterion("YHE021 not between", value1, value2, "yhe021");
            return (Criteria) this;
        }

        public Criteria andYhe022IsNull() {
            addCriterion("YHE022 is null");
            return (Criteria) this;
        }

        public Criteria andYhe022IsNotNull() {
            addCriterion("YHE022 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe022EqualTo(String value) {
            addCriterion("YHE022 =", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022NotEqualTo(String value) {
            addCriterion("YHE022 <>", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022GreaterThan(String value) {
            addCriterion("YHE022 >", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022GreaterThanOrEqualTo(String value) {
            addCriterion("YHE022 >=", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022LessThan(String value) {
            addCriterion("YHE022 <", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022LessThanOrEqualTo(String value) {
            addCriterion("YHE022 <=", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022Like(String value) {
            addCriterion("YHE022 like", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022NotLike(String value) {
            addCriterion("YHE022 not like", value, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022In(List<String> values) {
            addCriterion("YHE022 in", values, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022NotIn(List<String> values) {
            addCriterion("YHE022 not in", values, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022Between(String value1, String value2) {
            addCriterion("YHE022 between", value1, value2, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe022NotBetween(String value1, String value2) {
            addCriterion("YHE022 not between", value1, value2, "yhe022");
            return (Criteria) this;
        }

        public Criteria andYhe023IsNull() {
            addCriterion("YHE023 is null");
            return (Criteria) this;
        }

        public Criteria andYhe023IsNotNull() {
            addCriterion("YHE023 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe023EqualTo(String value) {
            addCriterion("YHE023 =", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023NotEqualTo(String value) {
            addCriterion("YHE023 <>", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023GreaterThan(String value) {
            addCriterion("YHE023 >", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023GreaterThanOrEqualTo(String value) {
            addCriterion("YHE023 >=", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023LessThan(String value) {
            addCriterion("YHE023 <", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023LessThanOrEqualTo(String value) {
            addCriterion("YHE023 <=", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023Like(String value) {
            addCriterion("YHE023 like", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023NotLike(String value) {
            addCriterion("YHE023 not like", value, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023In(List<String> values) {
            addCriterion("YHE023 in", values, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023NotIn(List<String> values) {
            addCriterion("YHE023 not in", values, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023Between(String value1, String value2) {
            addCriterion("YHE023 between", value1, value2, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe023NotBetween(String value1, String value2) {
            addCriterion("YHE023 not between", value1, value2, "yhe023");
            return (Criteria) this;
        }

        public Criteria andYhe024IsNull() {
            addCriterion("YHE024 is null");
            return (Criteria) this;
        }

        public Criteria andYhe024IsNotNull() {
            addCriterion("YHE024 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe024EqualTo(String value) {
            addCriterion("YHE024 =", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024NotEqualTo(String value) {
            addCriterion("YHE024 <>", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024GreaterThan(String value) {
            addCriterion("YHE024 >", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024GreaterThanOrEqualTo(String value) {
            addCriterion("YHE024 >=", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024LessThan(String value) {
            addCriterion("YHE024 <", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024LessThanOrEqualTo(String value) {
            addCriterion("YHE024 <=", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024Like(String value) {
            addCriterion("YHE024 like", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024NotLike(String value) {
            addCriterion("YHE024 not like", value, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024In(List<String> values) {
            addCriterion("YHE024 in", values, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024NotIn(List<String> values) {
            addCriterion("YHE024 not in", values, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024Between(String value1, String value2) {
            addCriterion("YHE024 between", value1, value2, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe024NotBetween(String value1, String value2) {
            addCriterion("YHE024 not between", value1, value2, "yhe024");
            return (Criteria) this;
        }

        public Criteria andYhe025IsNull() {
            addCriterion("YHE025 is null");
            return (Criteria) this;
        }

        public Criteria andYhe025IsNotNull() {
            addCriterion("YHE025 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe025EqualTo(String value) {
            addCriterion("YHE025 =", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025NotEqualTo(String value) {
            addCriterion("YHE025 <>", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025GreaterThan(String value) {
            addCriterion("YHE025 >", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025GreaterThanOrEqualTo(String value) {
            addCriterion("YHE025 >=", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025LessThan(String value) {
            addCriterion("YHE025 <", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025LessThanOrEqualTo(String value) {
            addCriterion("YHE025 <=", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025Like(String value) {
            addCriterion("YHE025 like", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025NotLike(String value) {
            addCriterion("YHE025 not like", value, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025In(List<String> values) {
            addCriterion("YHE025 in", values, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025NotIn(List<String> values) {
            addCriterion("YHE025 not in", values, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025Between(String value1, String value2) {
            addCriterion("YHE025 between", value1, value2, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe025NotBetween(String value1, String value2) {
            addCriterion("YHE025 not between", value1, value2, "yhe025");
            return (Criteria) this;
        }

        public Criteria andYhe026IsNull() {
            addCriterion("YHE026 is null");
            return (Criteria) this;
        }

        public Criteria andYhe026IsNotNull() {
            addCriterion("YHE026 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe026EqualTo(String value) {
            addCriterion("YHE026 =", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026NotEqualTo(String value) {
            addCriterion("YHE026 <>", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026GreaterThan(String value) {
            addCriterion("YHE026 >", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026GreaterThanOrEqualTo(String value) {
            addCriterion("YHE026 >=", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026LessThan(String value) {
            addCriterion("YHE026 <", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026LessThanOrEqualTo(String value) {
            addCriterion("YHE026 <=", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026Like(String value) {
            addCriterion("YHE026 like", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026NotLike(String value) {
            addCriterion("YHE026 not like", value, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026In(List<String> values) {
            addCriterion("YHE026 in", values, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026NotIn(List<String> values) {
            addCriterion("YHE026 not in", values, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026Between(String value1, String value2) {
            addCriterion("YHE026 between", value1, value2, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe026NotBetween(String value1, String value2) {
            addCriterion("YHE026 not between", value1, value2, "yhe026");
            return (Criteria) this;
        }

        public Criteria andYhe027IsNull() {
            addCriterion("YHE027 is null");
            return (Criteria) this;
        }

        public Criteria andYhe027IsNotNull() {
            addCriterion("YHE027 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe027EqualTo(String value) {
            addCriterion("YHE027 =", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027NotEqualTo(String value) {
            addCriterion("YHE027 <>", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027GreaterThan(String value) {
            addCriterion("YHE027 >", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027GreaterThanOrEqualTo(String value) {
            addCriterion("YHE027 >=", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027LessThan(String value) {
            addCriterion("YHE027 <", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027LessThanOrEqualTo(String value) {
            addCriterion("YHE027 <=", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027Like(String value) {
            addCriterion("YHE027 like", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027NotLike(String value) {
            addCriterion("YHE027 not like", value, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027In(List<String> values) {
            addCriterion("YHE027 in", values, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027NotIn(List<String> values) {
            addCriterion("YHE027 not in", values, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027Between(String value1, String value2) {
            addCriterion("YHE027 between", value1, value2, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe027NotBetween(String value1, String value2) {
            addCriterion("YHE027 not between", value1, value2, "yhe027");
            return (Criteria) this;
        }

        public Criteria andYhe028IsNull() {
            addCriterion("YHE028 is null");
            return (Criteria) this;
        }

        public Criteria andYhe028IsNotNull() {
            addCriterion("YHE028 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe028EqualTo(String value) {
            addCriterion("YHE028 =", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028NotEqualTo(String value) {
            addCriterion("YHE028 <>", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028GreaterThan(String value) {
            addCriterion("YHE028 >", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028GreaterThanOrEqualTo(String value) {
            addCriterion("YHE028 >=", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028LessThan(String value) {
            addCriterion("YHE028 <", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028LessThanOrEqualTo(String value) {
            addCriterion("YHE028 <=", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028Like(String value) {
            addCriterion("YHE028 like", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028NotLike(String value) {
            addCriterion("YHE028 not like", value, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028In(List<String> values) {
            addCriterion("YHE028 in", values, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028NotIn(List<String> values) {
            addCriterion("YHE028 not in", values, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028Between(String value1, String value2) {
            addCriterion("YHE028 between", value1, value2, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe028NotBetween(String value1, String value2) {
            addCriterion("YHE028 not between", value1, value2, "yhe028");
            return (Criteria) this;
        }

        public Criteria andYhe032IsNull() {
            addCriterion("YHE032 is null");
            return (Criteria) this;
        }

        public Criteria andYhe032IsNotNull() {
            addCriterion("YHE032 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe032EqualTo(Integer value) {
            addCriterion("YHE032 =", value, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032NotEqualTo(Integer value) {
            addCriterion("YHE032 <>", value, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032GreaterThan(Integer value) {
            addCriterion("YHE032 >", value, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE032 >=", value, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032LessThan(Integer value) {
            addCriterion("YHE032 <", value, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032LessThanOrEqualTo(Integer value) {
            addCriterion("YHE032 <=", value, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032In(List<Integer> values) {
            addCriterion("YHE032 in", values, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032NotIn(List<Integer> values) {
            addCriterion("YHE032 not in", values, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032Between(Integer value1, Integer value2) {
            addCriterion("YHE032 between", value1, value2, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe032NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE032 not between", value1, value2, "yhe032");
            return (Criteria) this;
        }

        public Criteria andYhe033IsNull() {
            addCriterion("YHE033 is null");
            return (Criteria) this;
        }

        public Criteria andYhe033IsNotNull() {
            addCriterion("YHE033 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe033EqualTo(String value) {
            addCriterion("YHE033 =", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033NotEqualTo(String value) {
            addCriterion("YHE033 <>", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033GreaterThan(String value) {
            addCriterion("YHE033 >", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033GreaterThanOrEqualTo(String value) {
            addCriterion("YHE033 >=", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033LessThan(String value) {
            addCriterion("YHE033 <", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033LessThanOrEqualTo(String value) {
            addCriterion("YHE033 <=", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033Like(String value) {
            addCriterion("YHE033 like", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033NotLike(String value) {
            addCriterion("YHE033 not like", value, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033In(List<String> values) {
            addCriterion("YHE033 in", values, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033NotIn(List<String> values) {
            addCriterion("YHE033 not in", values, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033Between(String value1, String value2) {
            addCriterion("YHE033 between", value1, value2, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe033NotBetween(String value1, String value2) {
            addCriterion("YHE033 not between", value1, value2, "yhe033");
            return (Criteria) this;
        }

        public Criteria andYhe034IsNull() {
            addCriterion("YHE034 is null");
            return (Criteria) this;
        }

        public Criteria andYhe034IsNotNull() {
            addCriterion("YHE034 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe034EqualTo(String value) {
            addCriterion("YHE034 =", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034NotEqualTo(String value) {
            addCriterion("YHE034 <>", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034GreaterThan(String value) {
            addCriterion("YHE034 >", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034GreaterThanOrEqualTo(String value) {
            addCriterion("YHE034 >=", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034LessThan(String value) {
            addCriterion("YHE034 <", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034LessThanOrEqualTo(String value) {
            addCriterion("YHE034 <=", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034Like(String value) {
            addCriterion("YHE034 like", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034NotLike(String value) {
            addCriterion("YHE034 not like", value, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034In(List<String> values) {
            addCriterion("YHE034 in", values, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034NotIn(List<String> values) {
            addCriterion("YHE034 not in", values, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034Between(String value1, String value2) {
            addCriterion("YHE034 between", value1, value2, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe034NotBetween(String value1, String value2) {
            addCriterion("YHE034 not between", value1, value2, "yhe034");
            return (Criteria) this;
        }

        public Criteria andYhe035IsNull() {
            addCriterion("YHE035 is null");
            return (Criteria) this;
        }

        public Criteria andYhe035IsNotNull() {
            addCriterion("YHE035 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe035EqualTo(String value) {
            addCriterion("YHE035 =", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035NotEqualTo(String value) {
            addCriterion("YHE035 <>", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035GreaterThan(String value) {
            addCriterion("YHE035 >", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035GreaterThanOrEqualTo(String value) {
            addCriterion("YHE035 >=", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035LessThan(String value) {
            addCriterion("YHE035 <", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035LessThanOrEqualTo(String value) {
            addCriterion("YHE035 <=", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035Like(String value) {
            addCriterion("YHE035 like", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035NotLike(String value) {
            addCriterion("YHE035 not like", value, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035In(List<String> values) {
            addCriterion("YHE035 in", values, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035NotIn(List<String> values) {
            addCriterion("YHE035 not in", values, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035Between(String value1, String value2) {
            addCriterion("YHE035 between", value1, value2, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe035NotBetween(String value1, String value2) {
            addCriterion("YHE035 not between", value1, value2, "yhe035");
            return (Criteria) this;
        }

        public Criteria andYhe036IsNull() {
            addCriterion("YHE036 is null");
            return (Criteria) this;
        }

        public Criteria andYhe036IsNotNull() {
            addCriterion("YHE036 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe036EqualTo(String value) {
            addCriterion("YHE036 =", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036NotEqualTo(String value) {
            addCriterion("YHE036 <>", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036GreaterThan(String value) {
            addCriterion("YHE036 >", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036GreaterThanOrEqualTo(String value) {
            addCriterion("YHE036 >=", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036LessThan(String value) {
            addCriterion("YHE036 <", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036LessThanOrEqualTo(String value) {
            addCriterion("YHE036 <=", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036Like(String value) {
            addCriterion("YHE036 like", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036NotLike(String value) {
            addCriterion("YHE036 not like", value, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036In(List<String> values) {
            addCriterion("YHE036 in", values, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036NotIn(List<String> values) {
            addCriterion("YHE036 not in", values, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036Between(String value1, String value2) {
            addCriterion("YHE036 between", value1, value2, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe036NotBetween(String value1, String value2) {
            addCriterion("YHE036 not between", value1, value2, "yhe036");
            return (Criteria) this;
        }

        public Criteria andYhe037IsNull() {
            addCriterion("YHE037 is null");
            return (Criteria) this;
        }

        public Criteria andYhe037IsNotNull() {
            addCriterion("YHE037 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe037EqualTo(String value) {
            addCriterion("YHE037 =", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037NotEqualTo(String value) {
            addCriterion("YHE037 <>", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037GreaterThan(String value) {
            addCriterion("YHE037 >", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037GreaterThanOrEqualTo(String value) {
            addCriterion("YHE037 >=", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037LessThan(String value) {
            addCriterion("YHE037 <", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037LessThanOrEqualTo(String value) {
            addCriterion("YHE037 <=", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037Like(String value) {
            addCriterion("YHE037 like", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037NotLike(String value) {
            addCriterion("YHE037 not like", value, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037In(List<String> values) {
            addCriterion("YHE037 in", values, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037NotIn(List<String> values) {
            addCriterion("YHE037 not in", values, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037Between(String value1, String value2) {
            addCriterion("YHE037 between", value1, value2, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe037NotBetween(String value1, String value2) {
            addCriterion("YHE037 not between", value1, value2, "yhe037");
            return (Criteria) this;
        }

        public Criteria andYhe038IsNull() {
            addCriterion("YHE038 is null");
            return (Criteria) this;
        }

        public Criteria andYhe038IsNotNull() {
            addCriterion("YHE038 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe038EqualTo(String value) {
            addCriterion("YHE038 =", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038NotEqualTo(String value) {
            addCriterion("YHE038 <>", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038GreaterThan(String value) {
            addCriterion("YHE038 >", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038GreaterThanOrEqualTo(String value) {
            addCriterion("YHE038 >=", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038LessThan(String value) {
            addCriterion("YHE038 <", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038LessThanOrEqualTo(String value) {
            addCriterion("YHE038 <=", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038Like(String value) {
            addCriterion("YHE038 like", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038NotLike(String value) {
            addCriterion("YHE038 not like", value, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038In(List<String> values) {
            addCriterion("YHE038 in", values, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038NotIn(List<String> values) {
            addCriterion("YHE038 not in", values, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038Between(String value1, String value2) {
            addCriterion("YHE038 between", value1, value2, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe038NotBetween(String value1, String value2) {
            addCriterion("YHE038 not between", value1, value2, "yhe038");
            return (Criteria) this;
        }

        public Criteria andYhe040IsNull() {
            addCriterion("YHE040 is null");
            return (Criteria) this;
        }

        public Criteria andYhe040IsNotNull() {
            addCriterion("YHE040 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe040EqualTo(Integer value) {
            addCriterion("YHE040 =", value, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040NotEqualTo(Integer value) {
            addCriterion("YHE040 <>", value, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040GreaterThan(Integer value) {
            addCriterion("YHE040 >", value, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040GreaterThanOrEqualTo(Integer value) {
            addCriterion("YHE040 >=", value, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040LessThan(Integer value) {
            addCriterion("YHE040 <", value, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040LessThanOrEqualTo(Integer value) {
            addCriterion("YHE040 <=", value, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040In(List<Integer> values) {
            addCriterion("YHE040 in", values, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040NotIn(List<Integer> values) {
            addCriterion("YHE040 not in", values, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040Between(Integer value1, Integer value2) {
            addCriterion("YHE040 between", value1, value2, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe040NotBetween(Integer value1, Integer value2) {
            addCriterion("YHE040 not between", value1, value2, "yhe040");
            return (Criteria) this;
        }

        public Criteria andYhe041IsNull() {
            addCriterion("YHE041 is null");
            return (Criteria) this;
        }

        public Criteria andYhe041IsNotNull() {
            addCriterion("YHE041 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe041EqualTo(String value) {
            addCriterion("YHE041 =", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041NotEqualTo(String value) {
            addCriterion("YHE041 <>", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041GreaterThan(String value) {
            addCriterion("YHE041 >", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041GreaterThanOrEqualTo(String value) {
            addCriterion("YHE041 >=", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041LessThan(String value) {
            addCriterion("YHE041 <", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041LessThanOrEqualTo(String value) {
            addCriterion("YHE041 <=", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041Like(String value) {
            addCriterion("YHE041 like", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041NotLike(String value) {
            addCriterion("YHE041 not like", value, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041In(List<String> values) {
            addCriterion("YHE041 in", values, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041NotIn(List<String> values) {
            addCriterion("YHE041 not in", values, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041Between(String value1, String value2) {
            addCriterion("YHE041 between", value1, value2, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe041NotBetween(String value1, String value2) {
            addCriterion("YHE041 not between", value1, value2, "yhe041");
            return (Criteria) this;
        }

        public Criteria andYhe042IsNull() {
            addCriterion("YHE042 is null");
            return (Criteria) this;
        }

        public Criteria andYhe042IsNotNull() {
            addCriterion("YHE042 is not null");
            return (Criteria) this;
        }

        public Criteria andYhe042EqualTo(String value) {
            addCriterion("YHE042 =", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042NotEqualTo(String value) {
            addCriterion("YHE042 <>", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042GreaterThan(String value) {
            addCriterion("YHE042 >", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042GreaterThanOrEqualTo(String value) {
            addCriterion("YHE042 >=", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042LessThan(String value) {
            addCriterion("YHE042 <", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042LessThanOrEqualTo(String value) {
            addCriterion("YHE042 <=", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042Like(String value) {
            addCriterion("YHE042 like", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042NotLike(String value) {
            addCriterion("YHE042 not like", value, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042In(List<String> values) {
            addCriterion("YHE042 in", values, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042NotIn(List<String> values) {
            addCriterion("YHE042 not in", values, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042Between(String value1, String value2) {
            addCriterion("YHE042 between", value1, value2, "yhe042");
            return (Criteria) this;
        }

        public Criteria andYhe042NotBetween(String value1, String value2) {
            addCriterion("YHE042 not between", value1, value2, "yhe042");
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