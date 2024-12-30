package com.efx.Science.model;

import java.util.ArrayList;
import java.util.List;

public class cdhbaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cdhbaExample() {
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

        public Criteria andHba001IsNull() {
            addCriterion("HBA001 is null");
            return (Criteria) this;
        }

        public Criteria andHba001IsNotNull() {
            addCriterion("HBA001 is not null");
            return (Criteria) this;
        }

        public Criteria andHba001EqualTo(Integer value) {
            addCriterion("HBA001 =", value, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001NotEqualTo(Integer value) {
            addCriterion("HBA001 <>", value, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001GreaterThan(Integer value) {
            addCriterion("HBA001 >", value, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBA001 >=", value, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001LessThan(Integer value) {
            addCriterion("HBA001 <", value, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001LessThanOrEqualTo(Integer value) {
            addCriterion("HBA001 <=", value, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001In(List<Integer> values) {
            addCriterion("HBA001 in", values, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001NotIn(List<Integer> values) {
            addCriterion("HBA001 not in", values, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001Between(Integer value1, Integer value2) {
            addCriterion("HBA001 between", value1, value2, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba001NotBetween(Integer value1, Integer value2) {
            addCriterion("HBA001 not between", value1, value2, "hba001");
            return (Criteria) this;
        }

        public Criteria andHba002IsNull() {
            addCriterion("HBA002 is null");
            return (Criteria) this;
        }

        public Criteria andHba002IsNotNull() {
            addCriterion("HBA002 is not null");
            return (Criteria) this;
        }

        public Criteria andHba002EqualTo(String value) {
            addCriterion("HBA002 =", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002NotEqualTo(String value) {
            addCriterion("HBA002 <>", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002GreaterThan(String value) {
            addCriterion("HBA002 >", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002GreaterThanOrEqualTo(String value) {
            addCriterion("HBA002 >=", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002LessThan(String value) {
            addCriterion("HBA002 <", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002LessThanOrEqualTo(String value) {
            addCriterion("HBA002 <=", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002Like(String value) {
            addCriterion("HBA002 like", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002NotLike(String value) {
            addCriterion("HBA002 not like", value, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002In(List<String> values) {
            addCriterion("HBA002 in", values, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002NotIn(List<String> values) {
            addCriterion("HBA002 not in", values, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002Between(String value1, String value2) {
            addCriterion("HBA002 between", value1, value2, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba002NotBetween(String value1, String value2) {
            addCriterion("HBA002 not between", value1, value2, "hba002");
            return (Criteria) this;
        }

        public Criteria andHba003IsNull() {
            addCriterion("HBA003 is null");
            return (Criteria) this;
        }

        public Criteria andHba003IsNotNull() {
            addCriterion("HBA003 is not null");
            return (Criteria) this;
        }

        public Criteria andHba003EqualTo(String value) {
            addCriterion("HBA003 =", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003NotEqualTo(String value) {
            addCriterion("HBA003 <>", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003GreaterThan(String value) {
            addCriterion("HBA003 >", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003GreaterThanOrEqualTo(String value) {
            addCriterion("HBA003 >=", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003LessThan(String value) {
            addCriterion("HBA003 <", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003LessThanOrEqualTo(String value) {
            addCriterion("HBA003 <=", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003Like(String value) {
            addCriterion("HBA003 like", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003NotLike(String value) {
            addCriterion("HBA003 not like", value, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003In(List<String> values) {
            addCriterion("HBA003 in", values, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003NotIn(List<String> values) {
            addCriterion("HBA003 not in", values, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003Between(String value1, String value2) {
            addCriterion("HBA003 between", value1, value2, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba003NotBetween(String value1, String value2) {
            addCriterion("HBA003 not between", value1, value2, "hba003");
            return (Criteria) this;
        }

        public Criteria andHba004IsNull() {
            addCriterion("HBA004 is null");
            return (Criteria) this;
        }

        public Criteria andHba004IsNotNull() {
            addCriterion("HBA004 is not null");
            return (Criteria) this;
        }

        public Criteria andHba004EqualTo(String value) {
            addCriterion("HBA004 =", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004NotEqualTo(String value) {
            addCriterion("HBA004 <>", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004GreaterThan(String value) {
            addCriterion("HBA004 >", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004GreaterThanOrEqualTo(String value) {
            addCriterion("HBA004 >=", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004LessThan(String value) {
            addCriterion("HBA004 <", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004LessThanOrEqualTo(String value) {
            addCriterion("HBA004 <=", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004Like(String value) {
            addCriterion("HBA004 like", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004NotLike(String value) {
            addCriterion("HBA004 not like", value, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004In(List<String> values) {
            addCriterion("HBA004 in", values, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004NotIn(List<String> values) {
            addCriterion("HBA004 not in", values, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004Between(String value1, String value2) {
            addCriterion("HBA004 between", value1, value2, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba004NotBetween(String value1, String value2) {
            addCriterion("HBA004 not between", value1, value2, "hba004");
            return (Criteria) this;
        }

        public Criteria andHba005IsNull() {
            addCriterion("HBA005 is null");
            return (Criteria) this;
        }

        public Criteria andHba005IsNotNull() {
            addCriterion("HBA005 is not null");
            return (Criteria) this;
        }

        public Criteria andHba005EqualTo(String value) {
            addCriterion("HBA005 =", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005NotEqualTo(String value) {
            addCriterion("HBA005 <>", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005GreaterThan(String value) {
            addCriterion("HBA005 >", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005GreaterThanOrEqualTo(String value) {
            addCriterion("HBA005 >=", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005LessThan(String value) {
            addCriterion("HBA005 <", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005LessThanOrEqualTo(String value) {
            addCriterion("HBA005 <=", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005Like(String value) {
            addCriterion("HBA005 like", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005NotLike(String value) {
            addCriterion("HBA005 not like", value, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005In(List<String> values) {
            addCriterion("HBA005 in", values, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005NotIn(List<String> values) {
            addCriterion("HBA005 not in", values, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005Between(String value1, String value2) {
            addCriterion("HBA005 between", value1, value2, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba005NotBetween(String value1, String value2) {
            addCriterion("HBA005 not between", value1, value2, "hba005");
            return (Criteria) this;
        }

        public Criteria andHba006IsNull() {
            addCriterion("HBA006 is null");
            return (Criteria) this;
        }

        public Criteria andHba006IsNotNull() {
            addCriterion("HBA006 is not null");
            return (Criteria) this;
        }

        public Criteria andHba006EqualTo(Float value) {
            addCriterion("HBA006 =", value, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006NotEqualTo(Float value) {
            addCriterion("HBA006 <>", value, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006GreaterThan(Float value) {
            addCriterion("HBA006 >", value, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA006 >=", value, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006LessThan(Float value) {
            addCriterion("HBA006 <", value, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006LessThanOrEqualTo(Float value) {
            addCriterion("HBA006 <=", value, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006In(List<Float> values) {
            addCriterion("HBA006 in", values, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006NotIn(List<Float> values) {
            addCriterion("HBA006 not in", values, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006Between(Float value1, Float value2) {
            addCriterion("HBA006 between", value1, value2, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba006NotBetween(Float value1, Float value2) {
            addCriterion("HBA006 not between", value1, value2, "hba006");
            return (Criteria) this;
        }

        public Criteria andHba007IsNull() {
            addCriterion("HBA007 is null");
            return (Criteria) this;
        }

        public Criteria andHba007IsNotNull() {
            addCriterion("HBA007 is not null");
            return (Criteria) this;
        }

        public Criteria andHba007EqualTo(String value) {
            addCriterion("HBA007 =", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007NotEqualTo(String value) {
            addCriterion("HBA007 <>", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007GreaterThan(String value) {
            addCriterion("HBA007 >", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007GreaterThanOrEqualTo(String value) {
            addCriterion("HBA007 >=", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007LessThan(String value) {
            addCriterion("HBA007 <", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007LessThanOrEqualTo(String value) {
            addCriterion("HBA007 <=", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007Like(String value) {
            addCriterion("HBA007 like", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007NotLike(String value) {
            addCriterion("HBA007 not like", value, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007In(List<String> values) {
            addCriterion("HBA007 in", values, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007NotIn(List<String> values) {
            addCriterion("HBA007 not in", values, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007Between(String value1, String value2) {
            addCriterion("HBA007 between", value1, value2, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba007NotBetween(String value1, String value2) {
            addCriterion("HBA007 not between", value1, value2, "hba007");
            return (Criteria) this;
        }

        public Criteria andHba008IsNull() {
            addCriterion("HBA008 is null");
            return (Criteria) this;
        }

        public Criteria andHba008IsNotNull() {
            addCriterion("HBA008 is not null");
            return (Criteria) this;
        }

        public Criteria andHba008EqualTo(String value) {
            addCriterion("HBA008 =", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008NotEqualTo(String value) {
            addCriterion("HBA008 <>", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008GreaterThan(String value) {
            addCriterion("HBA008 >", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008GreaterThanOrEqualTo(String value) {
            addCriterion("HBA008 >=", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008LessThan(String value) {
            addCriterion("HBA008 <", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008LessThanOrEqualTo(String value) {
            addCriterion("HBA008 <=", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008Like(String value) {
            addCriterion("HBA008 like", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008NotLike(String value) {
            addCriterion("HBA008 not like", value, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008In(List<String> values) {
            addCriterion("HBA008 in", values, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008NotIn(List<String> values) {
            addCriterion("HBA008 not in", values, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008Between(String value1, String value2) {
            addCriterion("HBA008 between", value1, value2, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba008NotBetween(String value1, String value2) {
            addCriterion("HBA008 not between", value1, value2, "hba008");
            return (Criteria) this;
        }

        public Criteria andHba009IsNull() {
            addCriterion("HBA009 is null");
            return (Criteria) this;
        }

        public Criteria andHba009IsNotNull() {
            addCriterion("HBA009 is not null");
            return (Criteria) this;
        }

        public Criteria andHba009EqualTo(String value) {
            addCriterion("HBA009 =", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009NotEqualTo(String value) {
            addCriterion("HBA009 <>", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009GreaterThan(String value) {
            addCriterion("HBA009 >", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009GreaterThanOrEqualTo(String value) {
            addCriterion("HBA009 >=", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009LessThan(String value) {
            addCriterion("HBA009 <", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009LessThanOrEqualTo(String value) {
            addCriterion("HBA009 <=", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009Like(String value) {
            addCriterion("HBA009 like", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009NotLike(String value) {
            addCriterion("HBA009 not like", value, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009In(List<String> values) {
            addCriterion("HBA009 in", values, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009NotIn(List<String> values) {
            addCriterion("HBA009 not in", values, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009Between(String value1, String value2) {
            addCriterion("HBA009 between", value1, value2, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba009NotBetween(String value1, String value2) {
            addCriterion("HBA009 not between", value1, value2, "hba009");
            return (Criteria) this;
        }

        public Criteria andHba010IsNull() {
            addCriterion("HBA010 is null");
            return (Criteria) this;
        }

        public Criteria andHba010IsNotNull() {
            addCriterion("HBA010 is not null");
            return (Criteria) this;
        }

        public Criteria andHba010EqualTo(String value) {
            addCriterion("HBA010 =", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010NotEqualTo(String value) {
            addCriterion("HBA010 <>", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010GreaterThan(String value) {
            addCriterion("HBA010 >", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010GreaterThanOrEqualTo(String value) {
            addCriterion("HBA010 >=", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010LessThan(String value) {
            addCriterion("HBA010 <", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010LessThanOrEqualTo(String value) {
            addCriterion("HBA010 <=", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010Like(String value) {
            addCriterion("HBA010 like", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010NotLike(String value) {
            addCriterion("HBA010 not like", value, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010In(List<String> values) {
            addCriterion("HBA010 in", values, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010NotIn(List<String> values) {
            addCriterion("HBA010 not in", values, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010Between(String value1, String value2) {
            addCriterion("HBA010 between", value1, value2, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba010NotBetween(String value1, String value2) {
            addCriterion("HBA010 not between", value1, value2, "hba010");
            return (Criteria) this;
        }

        public Criteria andHba011IsNull() {
            addCriterion("HBA011 is null");
            return (Criteria) this;
        }

        public Criteria andHba011IsNotNull() {
            addCriterion("HBA011 is not null");
            return (Criteria) this;
        }

        public Criteria andHba011EqualTo(String value) {
            addCriterion("HBA011 =", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011NotEqualTo(String value) {
            addCriterion("HBA011 <>", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011GreaterThan(String value) {
            addCriterion("HBA011 >", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011GreaterThanOrEqualTo(String value) {
            addCriterion("HBA011 >=", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011LessThan(String value) {
            addCriterion("HBA011 <", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011LessThanOrEqualTo(String value) {
            addCriterion("HBA011 <=", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011Like(String value) {
            addCriterion("HBA011 like", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011NotLike(String value) {
            addCriterion("HBA011 not like", value, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011In(List<String> values) {
            addCriterion("HBA011 in", values, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011NotIn(List<String> values) {
            addCriterion("HBA011 not in", values, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011Between(String value1, String value2) {
            addCriterion("HBA011 between", value1, value2, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba011NotBetween(String value1, String value2) {
            addCriterion("HBA011 not between", value1, value2, "hba011");
            return (Criteria) this;
        }

        public Criteria andHba012IsNull() {
            addCriterion("HBA012 is null");
            return (Criteria) this;
        }

        public Criteria andHba012IsNotNull() {
            addCriterion("HBA012 is not null");
            return (Criteria) this;
        }

        public Criteria andHba012EqualTo(Float value) {
            addCriterion("HBA012 =", value, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012NotEqualTo(Float value) {
            addCriterion("HBA012 <>", value, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012GreaterThan(Float value) {
            addCriterion("HBA012 >", value, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA012 >=", value, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012LessThan(Float value) {
            addCriterion("HBA012 <", value, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012LessThanOrEqualTo(Float value) {
            addCriterion("HBA012 <=", value, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012In(List<Float> values) {
            addCriterion("HBA012 in", values, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012NotIn(List<Float> values) {
            addCriterion("HBA012 not in", values, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012Between(Float value1, Float value2) {
            addCriterion("HBA012 between", value1, value2, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba012NotBetween(Float value1, Float value2) {
            addCriterion("HBA012 not between", value1, value2, "hba012");
            return (Criteria) this;
        }

        public Criteria andHba013IsNull() {
            addCriterion("HBA013 is null");
            return (Criteria) this;
        }

        public Criteria andHba013IsNotNull() {
            addCriterion("HBA013 is not null");
            return (Criteria) this;
        }

        public Criteria andHba013EqualTo(Integer value) {
            addCriterion("HBA013 =", value, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013NotEqualTo(Integer value) {
            addCriterion("HBA013 <>", value, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013GreaterThan(Integer value) {
            addCriterion("HBA013 >", value, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBA013 >=", value, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013LessThan(Integer value) {
            addCriterion("HBA013 <", value, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013LessThanOrEqualTo(Integer value) {
            addCriterion("HBA013 <=", value, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013In(List<Integer> values) {
            addCriterion("HBA013 in", values, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013NotIn(List<Integer> values) {
            addCriterion("HBA013 not in", values, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013Between(Integer value1, Integer value2) {
            addCriterion("HBA013 between", value1, value2, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba013NotBetween(Integer value1, Integer value2) {
            addCriterion("HBA013 not between", value1, value2, "hba013");
            return (Criteria) this;
        }

        public Criteria andHba014IsNull() {
            addCriterion("HBA014 is null");
            return (Criteria) this;
        }

        public Criteria andHba014IsNotNull() {
            addCriterion("HBA014 is not null");
            return (Criteria) this;
        }

        public Criteria andHba014EqualTo(String value) {
            addCriterion("HBA014 =", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014NotEqualTo(String value) {
            addCriterion("HBA014 <>", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014GreaterThan(String value) {
            addCriterion("HBA014 >", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014GreaterThanOrEqualTo(String value) {
            addCriterion("HBA014 >=", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014LessThan(String value) {
            addCriterion("HBA014 <", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014LessThanOrEqualTo(String value) {
            addCriterion("HBA014 <=", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014Like(String value) {
            addCriterion("HBA014 like", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014NotLike(String value) {
            addCriterion("HBA014 not like", value, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014In(List<String> values) {
            addCriterion("HBA014 in", values, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014NotIn(List<String> values) {
            addCriterion("HBA014 not in", values, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014Between(String value1, String value2) {
            addCriterion("HBA014 between", value1, value2, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba014NotBetween(String value1, String value2) {
            addCriterion("HBA014 not between", value1, value2, "hba014");
            return (Criteria) this;
        }

        public Criteria andHba015IsNull() {
            addCriterion("HBA015 is null");
            return (Criteria) this;
        }

        public Criteria andHba015IsNotNull() {
            addCriterion("HBA015 is not null");
            return (Criteria) this;
        }

        public Criteria andHba015EqualTo(String value) {
            addCriterion("HBA015 =", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015NotEqualTo(String value) {
            addCriterion("HBA015 <>", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015GreaterThan(String value) {
            addCriterion("HBA015 >", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015GreaterThanOrEqualTo(String value) {
            addCriterion("HBA015 >=", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015LessThan(String value) {
            addCriterion("HBA015 <", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015LessThanOrEqualTo(String value) {
            addCriterion("HBA015 <=", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015Like(String value) {
            addCriterion("HBA015 like", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015NotLike(String value) {
            addCriterion("HBA015 not like", value, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015In(List<String> values) {
            addCriterion("HBA015 in", values, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015NotIn(List<String> values) {
            addCriterion("HBA015 not in", values, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015Between(String value1, String value2) {
            addCriterion("HBA015 between", value1, value2, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba015NotBetween(String value1, String value2) {
            addCriterion("HBA015 not between", value1, value2, "hba015");
            return (Criteria) this;
        }

        public Criteria andHba016IsNull() {
            addCriterion("HBA016 is null");
            return (Criteria) this;
        }

        public Criteria andHba016IsNotNull() {
            addCriterion("HBA016 is not null");
            return (Criteria) this;
        }

        public Criteria andHba016EqualTo(String value) {
            addCriterion("HBA016 =", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016NotEqualTo(String value) {
            addCriterion("HBA016 <>", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016GreaterThan(String value) {
            addCriterion("HBA016 >", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016GreaterThanOrEqualTo(String value) {
            addCriterion("HBA016 >=", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016LessThan(String value) {
            addCriterion("HBA016 <", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016LessThanOrEqualTo(String value) {
            addCriterion("HBA016 <=", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016Like(String value) {
            addCriterion("HBA016 like", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016NotLike(String value) {
            addCriterion("HBA016 not like", value, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016In(List<String> values) {
            addCriterion("HBA016 in", values, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016NotIn(List<String> values) {
            addCriterion("HBA016 not in", values, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016Between(String value1, String value2) {
            addCriterion("HBA016 between", value1, value2, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba016NotBetween(String value1, String value2) {
            addCriterion("HBA016 not between", value1, value2, "hba016");
            return (Criteria) this;
        }

        public Criteria andHba017IsNull() {
            addCriterion("HBA017 is null");
            return (Criteria) this;
        }

        public Criteria andHba017IsNotNull() {
            addCriterion("HBA017 is not null");
            return (Criteria) this;
        }

        public Criteria andHba017EqualTo(String value) {
            addCriterion("HBA017 =", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017NotEqualTo(String value) {
            addCriterion("HBA017 <>", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017GreaterThan(String value) {
            addCriterion("HBA017 >", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017GreaterThanOrEqualTo(String value) {
            addCriterion("HBA017 >=", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017LessThan(String value) {
            addCriterion("HBA017 <", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017LessThanOrEqualTo(String value) {
            addCriterion("HBA017 <=", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017Like(String value) {
            addCriterion("HBA017 like", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017NotLike(String value) {
            addCriterion("HBA017 not like", value, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017In(List<String> values) {
            addCriterion("HBA017 in", values, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017NotIn(List<String> values) {
            addCriterion("HBA017 not in", values, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017Between(String value1, String value2) {
            addCriterion("HBA017 between", value1, value2, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba017NotBetween(String value1, String value2) {
            addCriterion("HBA017 not between", value1, value2, "hba017");
            return (Criteria) this;
        }

        public Criteria andHba018IsNull() {
            addCriterion("HBA018 is null");
            return (Criteria) this;
        }

        public Criteria andHba018IsNotNull() {
            addCriterion("HBA018 is not null");
            return (Criteria) this;
        }

        public Criteria andHba018EqualTo(String value) {
            addCriterion("HBA018 =", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018NotEqualTo(String value) {
            addCriterion("HBA018 <>", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018GreaterThan(String value) {
            addCriterion("HBA018 >", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018GreaterThanOrEqualTo(String value) {
            addCriterion("HBA018 >=", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018LessThan(String value) {
            addCriterion("HBA018 <", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018LessThanOrEqualTo(String value) {
            addCriterion("HBA018 <=", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018Like(String value) {
            addCriterion("HBA018 like", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018NotLike(String value) {
            addCriterion("HBA018 not like", value, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018In(List<String> values) {
            addCriterion("HBA018 in", values, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018NotIn(List<String> values) {
            addCriterion("HBA018 not in", values, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018Between(String value1, String value2) {
            addCriterion("HBA018 between", value1, value2, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba018NotBetween(String value1, String value2) {
            addCriterion("HBA018 not between", value1, value2, "hba018");
            return (Criteria) this;
        }

        public Criteria andHba020IsNull() {
            addCriterion("HBA020 is null");
            return (Criteria) this;
        }

        public Criteria andHba020IsNotNull() {
            addCriterion("HBA020 is not null");
            return (Criteria) this;
        }

        public Criteria andHba020EqualTo(String value) {
            addCriterion("HBA020 =", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020NotEqualTo(String value) {
            addCriterion("HBA020 <>", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020GreaterThan(String value) {
            addCriterion("HBA020 >", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020GreaterThanOrEqualTo(String value) {
            addCriterion("HBA020 >=", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020LessThan(String value) {
            addCriterion("HBA020 <", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020LessThanOrEqualTo(String value) {
            addCriterion("HBA020 <=", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020Like(String value) {
            addCriterion("HBA020 like", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020NotLike(String value) {
            addCriterion("HBA020 not like", value, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020In(List<String> values) {
            addCriterion("HBA020 in", values, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020NotIn(List<String> values) {
            addCriterion("HBA020 not in", values, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020Between(String value1, String value2) {
            addCriterion("HBA020 between", value1, value2, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba020NotBetween(String value1, String value2) {
            addCriterion("HBA020 not between", value1, value2, "hba020");
            return (Criteria) this;
        }

        public Criteria andHba021IsNull() {
            addCriterion("HBA021 is null");
            return (Criteria) this;
        }

        public Criteria andHba021IsNotNull() {
            addCriterion("HBA021 is not null");
            return (Criteria) this;
        }

        public Criteria andHba021EqualTo(Integer value) {
            addCriterion("HBA021 =", value, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021NotEqualTo(Integer value) {
            addCriterion("HBA021 <>", value, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021GreaterThan(Integer value) {
            addCriterion("HBA021 >", value, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBA021 >=", value, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021LessThan(Integer value) {
            addCriterion("HBA021 <", value, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021LessThanOrEqualTo(Integer value) {
            addCriterion("HBA021 <=", value, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021In(List<Integer> values) {
            addCriterion("HBA021 in", values, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021NotIn(List<Integer> values) {
            addCriterion("HBA021 not in", values, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021Between(Integer value1, Integer value2) {
            addCriterion("HBA021 between", value1, value2, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba021NotBetween(Integer value1, Integer value2) {
            addCriterion("HBA021 not between", value1, value2, "hba021");
            return (Criteria) this;
        }

        public Criteria andHba022IsNull() {
            addCriterion("HBA022 is null");
            return (Criteria) this;
        }

        public Criteria andHba022IsNotNull() {
            addCriterion("HBA022 is not null");
            return (Criteria) this;
        }

        public Criteria andHba022EqualTo(Integer value) {
            addCriterion("HBA022 =", value, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022NotEqualTo(Integer value) {
            addCriterion("HBA022 <>", value, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022GreaterThan(Integer value) {
            addCriterion("HBA022 >", value, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBA022 >=", value, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022LessThan(Integer value) {
            addCriterion("HBA022 <", value, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022LessThanOrEqualTo(Integer value) {
            addCriterion("HBA022 <=", value, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022In(List<Integer> values) {
            addCriterion("HBA022 in", values, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022NotIn(List<Integer> values) {
            addCriterion("HBA022 not in", values, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022Between(Integer value1, Integer value2) {
            addCriterion("HBA022 between", value1, value2, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba022NotBetween(Integer value1, Integer value2) {
            addCriterion("HBA022 not between", value1, value2, "hba022");
            return (Criteria) this;
        }

        public Criteria andHba023IsNull() {
            addCriterion("HBA023 is null");
            return (Criteria) this;
        }

        public Criteria andHba023IsNotNull() {
            addCriterion("HBA023 is not null");
            return (Criteria) this;
        }

        public Criteria andHba023EqualTo(Integer value) {
            addCriterion("HBA023 =", value, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023NotEqualTo(Integer value) {
            addCriterion("HBA023 <>", value, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023GreaterThan(Integer value) {
            addCriterion("HBA023 >", value, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBA023 >=", value, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023LessThan(Integer value) {
            addCriterion("HBA023 <", value, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023LessThanOrEqualTo(Integer value) {
            addCriterion("HBA023 <=", value, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023In(List<Integer> values) {
            addCriterion("HBA023 in", values, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023NotIn(List<Integer> values) {
            addCriterion("HBA023 not in", values, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023Between(Integer value1, Integer value2) {
            addCriterion("HBA023 between", value1, value2, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba023NotBetween(Integer value1, Integer value2) {
            addCriterion("HBA023 not between", value1, value2, "hba023");
            return (Criteria) this;
        }

        public Criteria andHba024IsNull() {
            addCriterion("HBA024 is null");
            return (Criteria) this;
        }

        public Criteria andHba024IsNotNull() {
            addCriterion("HBA024 is not null");
            return (Criteria) this;
        }

        public Criteria andHba024EqualTo(String value) {
            addCriterion("HBA024 =", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024NotEqualTo(String value) {
            addCriterion("HBA024 <>", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024GreaterThan(String value) {
            addCriterion("HBA024 >", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024GreaterThanOrEqualTo(String value) {
            addCriterion("HBA024 >=", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024LessThan(String value) {
            addCriterion("HBA024 <", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024LessThanOrEqualTo(String value) {
            addCriterion("HBA024 <=", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024Like(String value) {
            addCriterion("HBA024 like", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024NotLike(String value) {
            addCriterion("HBA024 not like", value, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024In(List<String> values) {
            addCriterion("HBA024 in", values, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024NotIn(List<String> values) {
            addCriterion("HBA024 not in", values, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024Between(String value1, String value2) {
            addCriterion("HBA024 between", value1, value2, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba024NotBetween(String value1, String value2) {
            addCriterion("HBA024 not between", value1, value2, "hba024");
            return (Criteria) this;
        }

        public Criteria andHba025IsNull() {
            addCriterion("HBA025 is null");
            return (Criteria) this;
        }

        public Criteria andHba025IsNotNull() {
            addCriterion("HBA025 is not null");
            return (Criteria) this;
        }

        public Criteria andHba025EqualTo(String value) {
            addCriterion("HBA025 =", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025NotEqualTo(String value) {
            addCriterion("HBA025 <>", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025GreaterThan(String value) {
            addCriterion("HBA025 >", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025GreaterThanOrEqualTo(String value) {
            addCriterion("HBA025 >=", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025LessThan(String value) {
            addCriterion("HBA025 <", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025LessThanOrEqualTo(String value) {
            addCriterion("HBA025 <=", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025Like(String value) {
            addCriterion("HBA025 like", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025NotLike(String value) {
            addCriterion("HBA025 not like", value, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025In(List<String> values) {
            addCriterion("HBA025 in", values, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025NotIn(List<String> values) {
            addCriterion("HBA025 not in", values, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025Between(String value1, String value2) {
            addCriterion("HBA025 between", value1, value2, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba025NotBetween(String value1, String value2) {
            addCriterion("HBA025 not between", value1, value2, "hba025");
            return (Criteria) this;
        }

        public Criteria andHba026IsNull() {
            addCriterion("HBA026 is null");
            return (Criteria) this;
        }

        public Criteria andHba026IsNotNull() {
            addCriterion("HBA026 is not null");
            return (Criteria) this;
        }

        public Criteria andHba026EqualTo(String value) {
            addCriterion("HBA026 =", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026NotEqualTo(String value) {
            addCriterion("HBA026 <>", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026GreaterThan(String value) {
            addCriterion("HBA026 >", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026GreaterThanOrEqualTo(String value) {
            addCriterion("HBA026 >=", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026LessThan(String value) {
            addCriterion("HBA026 <", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026LessThanOrEqualTo(String value) {
            addCriterion("HBA026 <=", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026Like(String value) {
            addCriterion("HBA026 like", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026NotLike(String value) {
            addCriterion("HBA026 not like", value, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026In(List<String> values) {
            addCriterion("HBA026 in", values, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026NotIn(List<String> values) {
            addCriterion("HBA026 not in", values, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026Between(String value1, String value2) {
            addCriterion("HBA026 between", value1, value2, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba026NotBetween(String value1, String value2) {
            addCriterion("HBA026 not between", value1, value2, "hba026");
            return (Criteria) this;
        }

        public Criteria andHba027IsNull() {
            addCriterion("HBA027 is null");
            return (Criteria) this;
        }

        public Criteria andHba027IsNotNull() {
            addCriterion("HBA027 is not null");
            return (Criteria) this;
        }

        public Criteria andHba027EqualTo(Float value) {
            addCriterion("HBA027 =", value, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027NotEqualTo(Float value) {
            addCriterion("HBA027 <>", value, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027GreaterThan(Float value) {
            addCriterion("HBA027 >", value, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA027 >=", value, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027LessThan(Float value) {
            addCriterion("HBA027 <", value, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027LessThanOrEqualTo(Float value) {
            addCriterion("HBA027 <=", value, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027In(List<Float> values) {
            addCriterion("HBA027 in", values, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027NotIn(List<Float> values) {
            addCriterion("HBA027 not in", values, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027Between(Float value1, Float value2) {
            addCriterion("HBA027 between", value1, value2, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba027NotBetween(Float value1, Float value2) {
            addCriterion("HBA027 not between", value1, value2, "hba027");
            return (Criteria) this;
        }

        public Criteria andHba028IsNull() {
            addCriterion("HBA028 is null");
            return (Criteria) this;
        }

        public Criteria andHba028IsNotNull() {
            addCriterion("HBA028 is not null");
            return (Criteria) this;
        }

        public Criteria andHba028EqualTo(Float value) {
            addCriterion("HBA028 =", value, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028NotEqualTo(Float value) {
            addCriterion("HBA028 <>", value, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028GreaterThan(Float value) {
            addCriterion("HBA028 >", value, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA028 >=", value, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028LessThan(Float value) {
            addCriterion("HBA028 <", value, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028LessThanOrEqualTo(Float value) {
            addCriterion("HBA028 <=", value, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028In(List<Float> values) {
            addCriterion("HBA028 in", values, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028NotIn(List<Float> values) {
            addCriterion("HBA028 not in", values, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028Between(Float value1, Float value2) {
            addCriterion("HBA028 between", value1, value2, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba028NotBetween(Float value1, Float value2) {
            addCriterion("HBA028 not between", value1, value2, "hba028");
            return (Criteria) this;
        }

        public Criteria andHba029IsNull() {
            addCriterion("HBA029 is null");
            return (Criteria) this;
        }

        public Criteria andHba029IsNotNull() {
            addCriterion("HBA029 is not null");
            return (Criteria) this;
        }

        public Criteria andHba029EqualTo(Float value) {
            addCriterion("HBA029 =", value, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029NotEqualTo(Float value) {
            addCriterion("HBA029 <>", value, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029GreaterThan(Float value) {
            addCriterion("HBA029 >", value, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA029 >=", value, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029LessThan(Float value) {
            addCriterion("HBA029 <", value, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029LessThanOrEqualTo(Float value) {
            addCriterion("HBA029 <=", value, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029In(List<Float> values) {
            addCriterion("HBA029 in", values, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029NotIn(List<Float> values) {
            addCriterion("HBA029 not in", values, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029Between(Float value1, Float value2) {
            addCriterion("HBA029 between", value1, value2, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba029NotBetween(Float value1, Float value2) {
            addCriterion("HBA029 not between", value1, value2, "hba029");
            return (Criteria) this;
        }

        public Criteria andHba030IsNull() {
            addCriterion("HBA030 is null");
            return (Criteria) this;
        }

        public Criteria andHba030IsNotNull() {
            addCriterion("HBA030 is not null");
            return (Criteria) this;
        }

        public Criteria andHba030EqualTo(Float value) {
            addCriterion("HBA030 =", value, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030NotEqualTo(Float value) {
            addCriterion("HBA030 <>", value, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030GreaterThan(Float value) {
            addCriterion("HBA030 >", value, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA030 >=", value, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030LessThan(Float value) {
            addCriterion("HBA030 <", value, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030LessThanOrEqualTo(Float value) {
            addCriterion("HBA030 <=", value, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030In(List<Float> values) {
            addCriterion("HBA030 in", values, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030NotIn(List<Float> values) {
            addCriterion("HBA030 not in", values, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030Between(Float value1, Float value2) {
            addCriterion("HBA030 between", value1, value2, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba030NotBetween(Float value1, Float value2) {
            addCriterion("HBA030 not between", value1, value2, "hba030");
            return (Criteria) this;
        }

        public Criteria andHba031IsNull() {
            addCriterion("HBA031 is null");
            return (Criteria) this;
        }

        public Criteria andHba031IsNotNull() {
            addCriterion("HBA031 is not null");
            return (Criteria) this;
        }

        public Criteria andHba031EqualTo(Float value) {
            addCriterion("HBA031 =", value, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031NotEqualTo(Float value) {
            addCriterion("HBA031 <>", value, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031GreaterThan(Float value) {
            addCriterion("HBA031 >", value, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA031 >=", value, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031LessThan(Float value) {
            addCriterion("HBA031 <", value, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031LessThanOrEqualTo(Float value) {
            addCriterion("HBA031 <=", value, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031In(List<Float> values) {
            addCriterion("HBA031 in", values, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031NotIn(List<Float> values) {
            addCriterion("HBA031 not in", values, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031Between(Float value1, Float value2) {
            addCriterion("HBA031 between", value1, value2, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba031NotBetween(Float value1, Float value2) {
            addCriterion("HBA031 not between", value1, value2, "hba031");
            return (Criteria) this;
        }

        public Criteria andHba032IsNull() {
            addCriterion("HBA032 is null");
            return (Criteria) this;
        }

        public Criteria andHba032IsNotNull() {
            addCriterion("HBA032 is not null");
            return (Criteria) this;
        }

        public Criteria andHba032EqualTo(Float value) {
            addCriterion("HBA032 =", value, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032NotEqualTo(Float value) {
            addCriterion("HBA032 <>", value, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032GreaterThan(Float value) {
            addCriterion("HBA032 >", value, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA032 >=", value, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032LessThan(Float value) {
            addCriterion("HBA032 <", value, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032LessThanOrEqualTo(Float value) {
            addCriterion("HBA032 <=", value, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032In(List<Float> values) {
            addCriterion("HBA032 in", values, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032NotIn(List<Float> values) {
            addCriterion("HBA032 not in", values, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032Between(Float value1, Float value2) {
            addCriterion("HBA032 between", value1, value2, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba032NotBetween(Float value1, Float value2) {
            addCriterion("HBA032 not between", value1, value2, "hba032");
            return (Criteria) this;
        }

        public Criteria andHba033IsNull() {
            addCriterion("HBA033 is null");
            return (Criteria) this;
        }

        public Criteria andHba033IsNotNull() {
            addCriterion("HBA033 is not null");
            return (Criteria) this;
        }

        public Criteria andHba033EqualTo(Float value) {
            addCriterion("HBA033 =", value, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033NotEqualTo(Float value) {
            addCriterion("HBA033 <>", value, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033GreaterThan(Float value) {
            addCriterion("HBA033 >", value, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033GreaterThanOrEqualTo(Float value) {
            addCriterion("HBA033 >=", value, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033LessThan(Float value) {
            addCriterion("HBA033 <", value, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033LessThanOrEqualTo(Float value) {
            addCriterion("HBA033 <=", value, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033In(List<Float> values) {
            addCriterion("HBA033 in", values, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033NotIn(List<Float> values) {
            addCriterion("HBA033 not in", values, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033Between(Float value1, Float value2) {
            addCriterion("HBA033 between", value1, value2, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba033NotBetween(Float value1, Float value2) {
            addCriterion("HBA033 not between", value1, value2, "hba033");
            return (Criteria) this;
        }

        public Criteria andHba034IsNull() {
            addCriterion("HBA034 is null");
            return (Criteria) this;
        }

        public Criteria andHba034IsNotNull() {
            addCriterion("HBA034 is not null");
            return (Criteria) this;
        }

        public Criteria andHba034EqualTo(Integer value) {
            addCriterion("HBA034 =", value, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034NotEqualTo(Integer value) {
            addCriterion("HBA034 <>", value, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034GreaterThan(Integer value) {
            addCriterion("HBA034 >", value, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034GreaterThanOrEqualTo(Integer value) {
            addCriterion("HBA034 >=", value, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034LessThan(Integer value) {
            addCriterion("HBA034 <", value, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034LessThanOrEqualTo(Integer value) {
            addCriterion("HBA034 <=", value, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034In(List<Integer> values) {
            addCriterion("HBA034 in", values, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034NotIn(List<Integer> values) {
            addCriterion("HBA034 not in", values, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034Between(Integer value1, Integer value2) {
            addCriterion("HBA034 between", value1, value2, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba034NotBetween(Integer value1, Integer value2) {
            addCriterion("HBA034 not between", value1, value2, "hba034");
            return (Criteria) this;
        }

        public Criteria andHba035IsNull() {
            addCriterion("HBA035 is null");
            return (Criteria) this;
        }

        public Criteria andHba035IsNotNull() {
            addCriterion("HBA035 is not null");
            return (Criteria) this;
        }

        public Criteria andHba035EqualTo(String value) {
            addCriterion("HBA035 =", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035NotEqualTo(String value) {
            addCriterion("HBA035 <>", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035GreaterThan(String value) {
            addCriterion("HBA035 >", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035GreaterThanOrEqualTo(String value) {
            addCriterion("HBA035 >=", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035LessThan(String value) {
            addCriterion("HBA035 <", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035LessThanOrEqualTo(String value) {
            addCriterion("HBA035 <=", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035Like(String value) {
            addCriterion("HBA035 like", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035NotLike(String value) {
            addCriterion("HBA035 not like", value, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035In(List<String> values) {
            addCriterion("HBA035 in", values, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035NotIn(List<String> values) {
            addCriterion("HBA035 not in", values, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035Between(String value1, String value2) {
            addCriterion("HBA035 between", value1, value2, "hba035");
            return (Criteria) this;
        }

        public Criteria andHba035NotBetween(String value1, String value2) {
            addCriterion("HBA035 not between", value1, value2, "hba035");
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