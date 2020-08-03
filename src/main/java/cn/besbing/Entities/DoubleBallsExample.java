package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DoubleBallsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoubleBallsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("OPEN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("OPEN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(String value) {
            addCriterion("OPEN_DATE =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(String value) {
            addCriterion("OPEN_DATE <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(String value) {
            addCriterion("OPEN_DATE >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_DATE >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(String value) {
            addCriterion("OPEN_DATE <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(String value) {
            addCriterion("OPEN_DATE <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLike(String value) {
            addCriterion("OPEN_DATE like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotLike(String value) {
            addCriterion("OPEN_DATE not like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<String> values) {
            addCriterion("OPEN_DATE in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<String> values) {
            addCriterion("OPEN_DATE not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(String value1, String value2) {
            addCriterion("OPEN_DATE between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(String value1, String value2) {
            addCriterion("OPEN_DATE not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterionForJDBCDate("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterionForJDBCDate("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterionForJDBCDate("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterionForJDBCDate("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterionForJDBCDate("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterionForJDBCDate("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TS not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andRedball1IsNull() {
            addCriterion("REDBALL1 is null");
            return (Criteria) this;
        }

        public Criteria andRedball1IsNotNull() {
            addCriterion("REDBALL1 is not null");
            return (Criteria) this;
        }

        public Criteria andRedball1EqualTo(String value) {
            addCriterion("REDBALL1 =", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1NotEqualTo(String value) {
            addCriterion("REDBALL1 <>", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1GreaterThan(String value) {
            addCriterion("REDBALL1 >", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1GreaterThanOrEqualTo(String value) {
            addCriterion("REDBALL1 >=", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1LessThan(String value) {
            addCriterion("REDBALL1 <", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1LessThanOrEqualTo(String value) {
            addCriterion("REDBALL1 <=", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1Like(String value) {
            addCriterion("REDBALL1 like", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1NotLike(String value) {
            addCriterion("REDBALL1 not like", value, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1In(List<String> values) {
            addCriterion("REDBALL1 in", values, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1NotIn(List<String> values) {
            addCriterion("REDBALL1 not in", values, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1Between(String value1, String value2) {
            addCriterion("REDBALL1 between", value1, value2, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball1NotBetween(String value1, String value2) {
            addCriterion("REDBALL1 not between", value1, value2, "redball1");
            return (Criteria) this;
        }

        public Criteria andRedball2IsNull() {
            addCriterion("REDBALL2 is null");
            return (Criteria) this;
        }

        public Criteria andRedball2IsNotNull() {
            addCriterion("REDBALL2 is not null");
            return (Criteria) this;
        }

        public Criteria andRedball2EqualTo(String value) {
            addCriterion("REDBALL2 =", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2NotEqualTo(String value) {
            addCriterion("REDBALL2 <>", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2GreaterThan(String value) {
            addCriterion("REDBALL2 >", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2GreaterThanOrEqualTo(String value) {
            addCriterion("REDBALL2 >=", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2LessThan(String value) {
            addCriterion("REDBALL2 <", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2LessThanOrEqualTo(String value) {
            addCriterion("REDBALL2 <=", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2Like(String value) {
            addCriterion("REDBALL2 like", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2NotLike(String value) {
            addCriterion("REDBALL2 not like", value, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2In(List<String> values) {
            addCriterion("REDBALL2 in", values, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2NotIn(List<String> values) {
            addCriterion("REDBALL2 not in", values, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2Between(String value1, String value2) {
            addCriterion("REDBALL2 between", value1, value2, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball2NotBetween(String value1, String value2) {
            addCriterion("REDBALL2 not between", value1, value2, "redball2");
            return (Criteria) this;
        }

        public Criteria andRedball3IsNull() {
            addCriterion("REDBALL3 is null");
            return (Criteria) this;
        }

        public Criteria andRedball3IsNotNull() {
            addCriterion("REDBALL3 is not null");
            return (Criteria) this;
        }

        public Criteria andRedball3EqualTo(String value) {
            addCriterion("REDBALL3 =", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3NotEqualTo(String value) {
            addCriterion("REDBALL3 <>", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3GreaterThan(String value) {
            addCriterion("REDBALL3 >", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3GreaterThanOrEqualTo(String value) {
            addCriterion("REDBALL3 >=", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3LessThan(String value) {
            addCriterion("REDBALL3 <", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3LessThanOrEqualTo(String value) {
            addCriterion("REDBALL3 <=", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3Like(String value) {
            addCriterion("REDBALL3 like", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3NotLike(String value) {
            addCriterion("REDBALL3 not like", value, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3In(List<String> values) {
            addCriterion("REDBALL3 in", values, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3NotIn(List<String> values) {
            addCriterion("REDBALL3 not in", values, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3Between(String value1, String value2) {
            addCriterion("REDBALL3 between", value1, value2, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball3NotBetween(String value1, String value2) {
            addCriterion("REDBALL3 not between", value1, value2, "redball3");
            return (Criteria) this;
        }

        public Criteria andRedball4IsNull() {
            addCriterion("REDBALL4 is null");
            return (Criteria) this;
        }

        public Criteria andRedball4IsNotNull() {
            addCriterion("REDBALL4 is not null");
            return (Criteria) this;
        }

        public Criteria andRedball4EqualTo(String value) {
            addCriterion("REDBALL4 =", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4NotEqualTo(String value) {
            addCriterion("REDBALL4 <>", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4GreaterThan(String value) {
            addCriterion("REDBALL4 >", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4GreaterThanOrEqualTo(String value) {
            addCriterion("REDBALL4 >=", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4LessThan(String value) {
            addCriterion("REDBALL4 <", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4LessThanOrEqualTo(String value) {
            addCriterion("REDBALL4 <=", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4Like(String value) {
            addCriterion("REDBALL4 like", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4NotLike(String value) {
            addCriterion("REDBALL4 not like", value, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4In(List<String> values) {
            addCriterion("REDBALL4 in", values, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4NotIn(List<String> values) {
            addCriterion("REDBALL4 not in", values, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4Between(String value1, String value2) {
            addCriterion("REDBALL4 between", value1, value2, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball4NotBetween(String value1, String value2) {
            addCriterion("REDBALL4 not between", value1, value2, "redball4");
            return (Criteria) this;
        }

        public Criteria andRedball5IsNull() {
            addCriterion("REDBALL5 is null");
            return (Criteria) this;
        }

        public Criteria andRedball5IsNotNull() {
            addCriterion("REDBALL5 is not null");
            return (Criteria) this;
        }

        public Criteria andRedball5EqualTo(String value) {
            addCriterion("REDBALL5 =", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5NotEqualTo(String value) {
            addCriterion("REDBALL5 <>", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5GreaterThan(String value) {
            addCriterion("REDBALL5 >", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5GreaterThanOrEqualTo(String value) {
            addCriterion("REDBALL5 >=", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5LessThan(String value) {
            addCriterion("REDBALL5 <", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5LessThanOrEqualTo(String value) {
            addCriterion("REDBALL5 <=", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5Like(String value) {
            addCriterion("REDBALL5 like", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5NotLike(String value) {
            addCriterion("REDBALL5 not like", value, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5In(List<String> values) {
            addCriterion("REDBALL5 in", values, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5NotIn(List<String> values) {
            addCriterion("REDBALL5 not in", values, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5Between(String value1, String value2) {
            addCriterion("REDBALL5 between", value1, value2, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball5NotBetween(String value1, String value2) {
            addCriterion("REDBALL5 not between", value1, value2, "redball5");
            return (Criteria) this;
        }

        public Criteria andRedball6IsNull() {
            addCriterion("REDBALL6 is null");
            return (Criteria) this;
        }

        public Criteria andRedball6IsNotNull() {
            addCriterion("REDBALL6 is not null");
            return (Criteria) this;
        }

        public Criteria andRedball6EqualTo(String value) {
            addCriterion("REDBALL6 =", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6NotEqualTo(String value) {
            addCriterion("REDBALL6 <>", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6GreaterThan(String value) {
            addCriterion("REDBALL6 >", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6GreaterThanOrEqualTo(String value) {
            addCriterion("REDBALL6 >=", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6LessThan(String value) {
            addCriterion("REDBALL6 <", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6LessThanOrEqualTo(String value) {
            addCriterion("REDBALL6 <=", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6Like(String value) {
            addCriterion("REDBALL6 like", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6NotLike(String value) {
            addCriterion("REDBALL6 not like", value, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6In(List<String> values) {
            addCriterion("REDBALL6 in", values, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6NotIn(List<String> values) {
            addCriterion("REDBALL6 not in", values, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6Between(String value1, String value2) {
            addCriterion("REDBALL6 between", value1, value2, "redball6");
            return (Criteria) this;
        }

        public Criteria andRedball6NotBetween(String value1, String value2) {
            addCriterion("REDBALL6 not between", value1, value2, "redball6");
            return (Criteria) this;
        }

        public Criteria andBlueballIsNull() {
            addCriterion("BLUEBALL is null");
            return (Criteria) this;
        }

        public Criteria andBlueballIsNotNull() {
            addCriterion("BLUEBALL is not null");
            return (Criteria) this;
        }

        public Criteria andBlueballEqualTo(String value) {
            addCriterion("BLUEBALL =", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballNotEqualTo(String value) {
            addCriterion("BLUEBALL <>", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballGreaterThan(String value) {
            addCriterion("BLUEBALL >", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballGreaterThanOrEqualTo(String value) {
            addCriterion("BLUEBALL >=", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballLessThan(String value) {
            addCriterion("BLUEBALL <", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballLessThanOrEqualTo(String value) {
            addCriterion("BLUEBALL <=", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballLike(String value) {
            addCriterion("BLUEBALL like", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballNotLike(String value) {
            addCriterion("BLUEBALL not like", value, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballIn(List<String> values) {
            addCriterion("BLUEBALL in", values, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballNotIn(List<String> values) {
            addCriterion("BLUEBALL not in", values, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballBetween(String value1, String value2) {
            addCriterion("BLUEBALL between", value1, value2, "blueball");
            return (Criteria) this;
        }

        public Criteria andBlueballNotBetween(String value1, String value2) {
            addCriterion("BLUEBALL not between", value1, value2, "blueball");
            return (Criteria) this;
        }

        public Criteria andVdef1IsNull() {
            addCriterion("VDEF1 is null");
            return (Criteria) this;
        }

        public Criteria andVdef1IsNotNull() {
            addCriterion("VDEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef1EqualTo(String value) {
            addCriterion("VDEF1 =", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotEqualTo(String value) {
            addCriterion("VDEF1 <>", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1GreaterThan(String value) {
            addCriterion("VDEF1 >", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF1 >=", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1LessThan(String value) {
            addCriterion("VDEF1 <", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1LessThanOrEqualTo(String value) {
            addCriterion("VDEF1 <=", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1Like(String value) {
            addCriterion("VDEF1 like", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotLike(String value) {
            addCriterion("VDEF1 not like", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1In(List<String> values) {
            addCriterion("VDEF1 in", values, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotIn(List<String> values) {
            addCriterion("VDEF1 not in", values, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1Between(String value1, String value2) {
            addCriterion("VDEF1 between", value1, value2, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotBetween(String value1, String value2) {
            addCriterion("VDEF1 not between", value1, value2, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef2IsNull() {
            addCriterion("VDEF2 is null");
            return (Criteria) this;
        }

        public Criteria andVdef2IsNotNull() {
            addCriterion("VDEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef2EqualTo(String value) {
            addCriterion("VDEF2 =", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotEqualTo(String value) {
            addCriterion("VDEF2 <>", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2GreaterThan(String value) {
            addCriterion("VDEF2 >", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF2 >=", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2LessThan(String value) {
            addCriterion("VDEF2 <", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2LessThanOrEqualTo(String value) {
            addCriterion("VDEF2 <=", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2Like(String value) {
            addCriterion("VDEF2 like", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotLike(String value) {
            addCriterion("VDEF2 not like", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2In(List<String> values) {
            addCriterion("VDEF2 in", values, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotIn(List<String> values) {
            addCriterion("VDEF2 not in", values, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2Between(String value1, String value2) {
            addCriterion("VDEF2 between", value1, value2, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotBetween(String value1, String value2) {
            addCriterion("VDEF2 not between", value1, value2, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef3IsNull() {
            addCriterion("VDEF3 is null");
            return (Criteria) this;
        }

        public Criteria andVdef3IsNotNull() {
            addCriterion("VDEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef3EqualTo(String value) {
            addCriterion("VDEF3 =", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotEqualTo(String value) {
            addCriterion("VDEF3 <>", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3GreaterThan(String value) {
            addCriterion("VDEF3 >", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF3 >=", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3LessThan(String value) {
            addCriterion("VDEF3 <", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3LessThanOrEqualTo(String value) {
            addCriterion("VDEF3 <=", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3Like(String value) {
            addCriterion("VDEF3 like", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotLike(String value) {
            addCriterion("VDEF3 not like", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3In(List<String> values) {
            addCriterion("VDEF3 in", values, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotIn(List<String> values) {
            addCriterion("VDEF3 not in", values, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3Between(String value1, String value2) {
            addCriterion("VDEF3 between", value1, value2, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotBetween(String value1, String value2) {
            addCriterion("VDEF3 not between", value1, value2, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef4IsNull() {
            addCriterion("VDEF4 is null");
            return (Criteria) this;
        }

        public Criteria andVdef4IsNotNull() {
            addCriterion("VDEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef4EqualTo(String value) {
            addCriterion("VDEF4 =", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotEqualTo(String value) {
            addCriterion("VDEF4 <>", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4GreaterThan(String value) {
            addCriterion("VDEF4 >", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF4 >=", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4LessThan(String value) {
            addCriterion("VDEF4 <", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4LessThanOrEqualTo(String value) {
            addCriterion("VDEF4 <=", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4Like(String value) {
            addCriterion("VDEF4 like", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotLike(String value) {
            addCriterion("VDEF4 not like", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4In(List<String> values) {
            addCriterion("VDEF4 in", values, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotIn(List<String> values) {
            addCriterion("VDEF4 not in", values, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4Between(String value1, String value2) {
            addCriterion("VDEF4 between", value1, value2, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotBetween(String value1, String value2) {
            addCriterion("VDEF4 not between", value1, value2, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef5IsNull() {
            addCriterion("VDEF5 is null");
            return (Criteria) this;
        }

        public Criteria andVdef5IsNotNull() {
            addCriterion("VDEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef5EqualTo(String value) {
            addCriterion("VDEF5 =", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotEqualTo(String value) {
            addCriterion("VDEF5 <>", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5GreaterThan(String value) {
            addCriterion("VDEF5 >", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF5 >=", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5LessThan(String value) {
            addCriterion("VDEF5 <", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5LessThanOrEqualTo(String value) {
            addCriterion("VDEF5 <=", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5Like(String value) {
            addCriterion("VDEF5 like", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotLike(String value) {
            addCriterion("VDEF5 not like", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5In(List<String> values) {
            addCriterion("VDEF5 in", values, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotIn(List<String> values) {
            addCriterion("VDEF5 not in", values, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5Between(String value1, String value2) {
            addCriterion("VDEF5 between", value1, value2, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotBetween(String value1, String value2) {
            addCriterion("VDEF5 not between", value1, value2, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef6IsNull() {
            addCriterion("VDEF6 is null");
            return (Criteria) this;
        }

        public Criteria andVdef6IsNotNull() {
            addCriterion("VDEF6 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef6EqualTo(String value) {
            addCriterion("VDEF6 =", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotEqualTo(String value) {
            addCriterion("VDEF6 <>", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6GreaterThan(String value) {
            addCriterion("VDEF6 >", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF6 >=", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6LessThan(String value) {
            addCriterion("VDEF6 <", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6LessThanOrEqualTo(String value) {
            addCriterion("VDEF6 <=", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6Like(String value) {
            addCriterion("VDEF6 like", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotLike(String value) {
            addCriterion("VDEF6 not like", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6In(List<String> values) {
            addCriterion("VDEF6 in", values, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotIn(List<String> values) {
            addCriterion("VDEF6 not in", values, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6Between(String value1, String value2) {
            addCriterion("VDEF6 between", value1, value2, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotBetween(String value1, String value2) {
            addCriterion("VDEF6 not between", value1, value2, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef7IsNull() {
            addCriterion("VDEF7 is null");
            return (Criteria) this;
        }

        public Criteria andVdef7IsNotNull() {
            addCriterion("VDEF7 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef7EqualTo(String value) {
            addCriterion("VDEF7 =", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotEqualTo(String value) {
            addCriterion("VDEF7 <>", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7GreaterThan(String value) {
            addCriterion("VDEF7 >", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF7 >=", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7LessThan(String value) {
            addCriterion("VDEF7 <", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7LessThanOrEqualTo(String value) {
            addCriterion("VDEF7 <=", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7Like(String value) {
            addCriterion("VDEF7 like", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotLike(String value) {
            addCriterion("VDEF7 not like", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7In(List<String> values) {
            addCriterion("VDEF7 in", values, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotIn(List<String> values) {
            addCriterion("VDEF7 not in", values, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7Between(String value1, String value2) {
            addCriterion("VDEF7 between", value1, value2, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotBetween(String value1, String value2) {
            addCriterion("VDEF7 not between", value1, value2, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef8IsNull() {
            addCriterion("VDEF8 is null");
            return (Criteria) this;
        }

        public Criteria andVdef8IsNotNull() {
            addCriterion("VDEF8 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef8EqualTo(String value) {
            addCriterion("VDEF8 =", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotEqualTo(String value) {
            addCriterion("VDEF8 <>", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8GreaterThan(String value) {
            addCriterion("VDEF8 >", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF8 >=", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8LessThan(String value) {
            addCriterion("VDEF8 <", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8LessThanOrEqualTo(String value) {
            addCriterion("VDEF8 <=", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8Like(String value) {
            addCriterion("VDEF8 like", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotLike(String value) {
            addCriterion("VDEF8 not like", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8In(List<String> values) {
            addCriterion("VDEF8 in", values, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotIn(List<String> values) {
            addCriterion("VDEF8 not in", values, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8Between(String value1, String value2) {
            addCriterion("VDEF8 between", value1, value2, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotBetween(String value1, String value2) {
            addCriterion("VDEF8 not between", value1, value2, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef9IsNull() {
            addCriterion("VDEF9 is null");
            return (Criteria) this;
        }

        public Criteria andVdef9IsNotNull() {
            addCriterion("VDEF9 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef9EqualTo(String value) {
            addCriterion("VDEF9 =", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotEqualTo(String value) {
            addCriterion("VDEF9 <>", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9GreaterThan(String value) {
            addCriterion("VDEF9 >", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF9 >=", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9LessThan(String value) {
            addCriterion("VDEF9 <", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9LessThanOrEqualTo(String value) {
            addCriterion("VDEF9 <=", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9Like(String value) {
            addCriterion("VDEF9 like", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotLike(String value) {
            addCriterion("VDEF9 not like", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9In(List<String> values) {
            addCriterion("VDEF9 in", values, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotIn(List<String> values) {
            addCriterion("VDEF9 not in", values, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9Between(String value1, String value2) {
            addCriterion("VDEF9 between", value1, value2, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotBetween(String value1, String value2) {
            addCriterion("VDEF9 not between", value1, value2, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef10IsNull() {
            addCriterion("VDEF10 is null");
            return (Criteria) this;
        }

        public Criteria andVdef10IsNotNull() {
            addCriterion("VDEF10 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef10EqualTo(String value) {
            addCriterion("VDEF10 =", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotEqualTo(String value) {
            addCriterion("VDEF10 <>", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10GreaterThan(String value) {
            addCriterion("VDEF10 >", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF10 >=", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10LessThan(String value) {
            addCriterion("VDEF10 <", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10LessThanOrEqualTo(String value) {
            addCriterion("VDEF10 <=", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10Like(String value) {
            addCriterion("VDEF10 like", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotLike(String value) {
            addCriterion("VDEF10 not like", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10In(List<String> values) {
            addCriterion("VDEF10 in", values, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotIn(List<String> values) {
            addCriterion("VDEF10 not in", values, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10Between(String value1, String value2) {
            addCriterion("VDEF10 between", value1, value2, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotBetween(String value1, String value2) {
            addCriterion("VDEF10 not between", value1, value2, "vdef10");
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