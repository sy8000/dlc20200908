package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NcTestListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcTestListExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPkTestListIsNull() {
            addCriterion("PK_TEST_LIST is null");
            return (Criteria) this;
        }

        public Criteria andPkTestListIsNotNull() {
            addCriterion("PK_TEST_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andPkTestListEqualTo(String value) {
            addCriterion("PK_TEST_LIST =", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListNotEqualTo(String value) {
            addCriterion("PK_TEST_LIST <>", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListGreaterThan(String value) {
            addCriterion("PK_TEST_LIST >", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TEST_LIST >=", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListLessThan(String value) {
            addCriterion("PK_TEST_LIST <", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListLessThanOrEqualTo(String value) {
            addCriterion("PK_TEST_LIST <=", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListLike(String value) {
            addCriterion("PK_TEST_LIST like", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListNotLike(String value) {
            addCriterion("PK_TEST_LIST not like", value, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListIn(List<String> values) {
            addCriterion("PK_TEST_LIST in", values, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListNotIn(List<String> values) {
            addCriterion("PK_TEST_LIST not in", values, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListBetween(String value1, String value2) {
            addCriterion("PK_TEST_LIST between", value1, value2, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andPkTestListNotBetween(String value1, String value2) {
            addCriterion("PK_TEST_LIST not between", value1, value2, "pkTestList");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeIsNull() {
            addCriterion("NC_TESTLIST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeIsNotNull() {
            addCriterion("NC_TESTLIST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeEqualTo(String value) {
            addCriterion("NC_TESTLIST_CODE =", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeNotEqualTo(String value) {
            addCriterion("NC_TESTLIST_CODE <>", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeGreaterThan(String value) {
            addCriterion("NC_TESTLIST_CODE >", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TESTLIST_CODE >=", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeLessThan(String value) {
            addCriterion("NC_TESTLIST_CODE <", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_TESTLIST_CODE <=", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeLike(String value) {
            addCriterion("NC_TESTLIST_CODE like", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeNotLike(String value) {
            addCriterion("NC_TESTLIST_CODE not like", value, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeIn(List<String> values) {
            addCriterion("NC_TESTLIST_CODE in", values, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeNotIn(List<String> values) {
            addCriterion("NC_TESTLIST_CODE not in", values, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeBetween(String value1, String value2) {
            addCriterion("NC_TESTLIST_CODE between", value1, value2, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistCodeNotBetween(String value1, String value2) {
            addCriterion("NC_TESTLIST_CODE not between", value1, value2, "ncTestlistCode");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameIsNull() {
            addCriterion("NC_TESTLIST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameIsNotNull() {
            addCriterion("NC_TESTLIST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameEqualTo(String value) {
            addCriterion("NC_TESTLIST_NAME =", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameNotEqualTo(String value) {
            addCriterion("NC_TESTLIST_NAME <>", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameGreaterThan(String value) {
            addCriterion("NC_TESTLIST_NAME >", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TESTLIST_NAME >=", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameLessThan(String value) {
            addCriterion("NC_TESTLIST_NAME <", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameLessThanOrEqualTo(String value) {
            addCriterion("NC_TESTLIST_NAME <=", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameLike(String value) {
            addCriterion("NC_TESTLIST_NAME like", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameNotLike(String value) {
            addCriterion("NC_TESTLIST_NAME not like", value, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameIn(List<String> values) {
            addCriterion("NC_TESTLIST_NAME in", values, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameNotIn(List<String> values) {
            addCriterion("NC_TESTLIST_NAME not in", values, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameBetween(String value1, String value2) {
            addCriterion("NC_TESTLIST_NAME between", value1, value2, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistNameNotBetween(String value1, String value2) {
            addCriterion("NC_TESTLIST_NAME not between", value1, value2, "ncTestlistName");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableIsNull() {
            addCriterion("NC_TESTLIST_ISDISABLE is null");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableIsNotNull() {
            addCriterion("NC_TESTLIST_ISDISABLE is not null");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableEqualTo(BigDecimal value) {
            addCriterion("NC_TESTLIST_ISDISABLE =", value, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableNotEqualTo(BigDecimal value) {
            addCriterion("NC_TESTLIST_ISDISABLE <>", value, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableGreaterThan(BigDecimal value) {
            addCriterion("NC_TESTLIST_ISDISABLE >", value, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NC_TESTLIST_ISDISABLE >=", value, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableLessThan(BigDecimal value) {
            addCriterion("NC_TESTLIST_ISDISABLE <", value, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NC_TESTLIST_ISDISABLE <=", value, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableIn(List<BigDecimal> values) {
            addCriterion("NC_TESTLIST_ISDISABLE in", values, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableNotIn(List<BigDecimal> values) {
            addCriterion("NC_TESTLIST_ISDISABLE not in", values, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NC_TESTLIST_ISDISABLE between", value1, value2, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcTestlistIsdisableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NC_TESTLIST_ISDISABLE not between", value1, value2, "ncTestlistIsdisable");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("DEF1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("DEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("DEF1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("DEF1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("DEF1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("DEF1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("DEF1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("DEF1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("DEF1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("DEF1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("DEF1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("DEF1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("DEF1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("DEF1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("DEF2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("DEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("DEF2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("DEF2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("DEF2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("DEF3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("DEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("DEF3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("DEF3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("DEF3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("DEF4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("DEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("DEF4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("DEF4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("DEF4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("DEF4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("DEF4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("DEF4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("DEF4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("DEF4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("DEF4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("DEF4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("DEF4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("DEF4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("DEF5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("DEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("DEF5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("DEF5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("DEF5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("DEF5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("DEF5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("DEF5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("DEF5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("DEF5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("DEF5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("DEF5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("DEF5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("DEF5 not between", value1, value2, "def5");
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