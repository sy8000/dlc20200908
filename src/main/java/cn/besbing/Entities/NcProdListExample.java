package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NcProdListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcProdListExample() {
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andPkProdListIsNull() {
            addCriterion("PK_PROD_LIST is null");
            return (Criteria) this;
        }

        public Criteria andPkProdListIsNotNull() {
            addCriterion("PK_PROD_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andPkProdListEqualTo(String value) {
            addCriterion("PK_PROD_LIST =", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListNotEqualTo(String value) {
            addCriterion("PK_PROD_LIST <>", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListGreaterThan(String value) {
            addCriterion("PK_PROD_LIST >", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PROD_LIST >=", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListLessThan(String value) {
            addCriterion("PK_PROD_LIST <", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListLessThanOrEqualTo(String value) {
            addCriterion("PK_PROD_LIST <=", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListLike(String value) {
            addCriterion("PK_PROD_LIST like", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListNotLike(String value) {
            addCriterion("PK_PROD_LIST not like", value, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListIn(List<String> values) {
            addCriterion("PK_PROD_LIST in", values, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListNotIn(List<String> values) {
            addCriterion("PK_PROD_LIST not in", values, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListBetween(String value1, String value2) {
            addCriterion("PK_PROD_LIST between", value1, value2, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andPkProdListNotBetween(String value1, String value2) {
            addCriterion("PK_PROD_LIST not between", value1, value2, "pkProdList");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeIsNull() {
            addCriterion("NC_PROD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeIsNotNull() {
            addCriterion("NC_PROD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeEqualTo(String value) {
            addCriterion("NC_PROD_CODE =", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeNotEqualTo(String value) {
            addCriterion("NC_PROD_CODE <>", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeGreaterThan(String value) {
            addCriterion("NC_PROD_CODE >", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_PROD_CODE >=", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeLessThan(String value) {
            addCriterion("NC_PROD_CODE <", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_PROD_CODE <=", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeLike(String value) {
            addCriterion("NC_PROD_CODE like", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeNotLike(String value) {
            addCriterion("NC_PROD_CODE not like", value, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeIn(List<String> values) {
            addCriterion("NC_PROD_CODE in", values, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeNotIn(List<String> values) {
            addCriterion("NC_PROD_CODE not in", values, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeBetween(String value1, String value2) {
            addCriterion("NC_PROD_CODE between", value1, value2, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdCodeNotBetween(String value1, String value2) {
            addCriterion("NC_PROD_CODE not between", value1, value2, "ncProdCode");
            return (Criteria) this;
        }

        public Criteria andNcProdNameIsNull() {
            addCriterion("NC_PROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcProdNameIsNotNull() {
            addCriterion("NC_PROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcProdNameEqualTo(String value) {
            addCriterion("NC_PROD_NAME =", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameNotEqualTo(String value) {
            addCriterion("NC_PROD_NAME <>", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameGreaterThan(String value) {
            addCriterion("NC_PROD_NAME >", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_PROD_NAME >=", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameLessThan(String value) {
            addCriterion("NC_PROD_NAME <", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameLessThanOrEqualTo(String value) {
            addCriterion("NC_PROD_NAME <=", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameLike(String value) {
            addCriterion("NC_PROD_NAME like", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameNotLike(String value) {
            addCriterion("NC_PROD_NAME not like", value, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameIn(List<String> values) {
            addCriterion("NC_PROD_NAME in", values, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameNotIn(List<String> values) {
            addCriterion("NC_PROD_NAME not in", values, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameBetween(String value1, String value2) {
            addCriterion("NC_PROD_NAME between", value1, value2, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdNameNotBetween(String value1, String value2) {
            addCriterion("NC_PROD_NAME not between", value1, value2, "ncProdName");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableIsNull() {
            addCriterion("NC_PROD_ISDISABLE is null");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableIsNotNull() {
            addCriterion("NC_PROD_ISDISABLE is not null");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableEqualTo(BigDecimal value) {
            addCriterion("NC_PROD_ISDISABLE =", value, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableNotEqualTo(BigDecimal value) {
            addCriterion("NC_PROD_ISDISABLE <>", value, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableGreaterThan(BigDecimal value) {
            addCriterion("NC_PROD_ISDISABLE >", value, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NC_PROD_ISDISABLE >=", value, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableLessThan(BigDecimal value) {
            addCriterion("NC_PROD_ISDISABLE <", value, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NC_PROD_ISDISABLE <=", value, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableIn(List<BigDecimal> values) {
            addCriterion("NC_PROD_ISDISABLE in", values, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableNotIn(List<BigDecimal> values) {
            addCriterion("NC_PROD_ISDISABLE not in", values, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NC_PROD_ISDISABLE between", value1, value2, "ncProdIsdisable");
            return (Criteria) this;
        }

        public Criteria andNcProdIsdisableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NC_PROD_ISDISABLE not between", value1, value2, "ncProdIsdisable");
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

        public Criteria andNcProdDesIsNull() {
            addCriterion("NC_PROD_DES is null");
            return (Criteria) this;
        }

        public Criteria andNcProdDesIsNotNull() {
            addCriterion("NC_PROD_DES is not null");
            return (Criteria) this;
        }

        public Criteria andNcProdDesEqualTo(String value) {
            addCriterion("NC_PROD_DES =", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesNotEqualTo(String value) {
            addCriterion("NC_PROD_DES <>", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesGreaterThan(String value) {
            addCriterion("NC_PROD_DES >", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesGreaterThanOrEqualTo(String value) {
            addCriterion("NC_PROD_DES >=", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesLessThan(String value) {
            addCriterion("NC_PROD_DES <", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesLessThanOrEqualTo(String value) {
            addCriterion("NC_PROD_DES <=", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesLike(String value) {
            addCriterion("NC_PROD_DES like", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesNotLike(String value) {
            addCriterion("NC_PROD_DES not like", value, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesIn(List<String> values) {
            addCriterion("NC_PROD_DES in", values, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesNotIn(List<String> values) {
            addCriterion("NC_PROD_DES not in", values, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesBetween(String value1, String value2) {
            addCriterion("NC_PROD_DES between", value1, value2, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdDesNotBetween(String value1, String value2) {
            addCriterion("NC_PROD_DES not between", value1, value2, "ncProdDes");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasIsNull() {
            addCriterion("NC_PROD_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasIsNotNull() {
            addCriterion("NC_PROD_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasEqualTo(String value) {
            addCriterion("NC_PROD_ALIAS =", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasNotEqualTo(String value) {
            addCriterion("NC_PROD_ALIAS <>", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasGreaterThan(String value) {
            addCriterion("NC_PROD_ALIAS >", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasGreaterThanOrEqualTo(String value) {
            addCriterion("NC_PROD_ALIAS >=", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasLessThan(String value) {
            addCriterion("NC_PROD_ALIAS <", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasLessThanOrEqualTo(String value) {
            addCriterion("NC_PROD_ALIAS <=", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasLike(String value) {
            addCriterion("NC_PROD_ALIAS like", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasNotLike(String value) {
            addCriterion("NC_PROD_ALIAS not like", value, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasIn(List<String> values) {
            addCriterion("NC_PROD_ALIAS in", values, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasNotIn(List<String> values) {
            addCriterion("NC_PROD_ALIAS not in", values, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasBetween(String value1, String value2) {
            addCriterion("NC_PROD_ALIAS between", value1, value2, "ncProdAlias");
            return (Criteria) this;
        }

        public Criteria andNcProdAliasNotBetween(String value1, String value2) {
            addCriterion("NC_PROD_ALIAS not between", value1, value2, "ncProdAlias");
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