package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NcAnalysisListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcAnalysisListExample() {
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

        public Criteria andPkAnalysisListIsNull() {
            addCriterion("PK_ANALYSIS_LIST is null");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListIsNotNull() {
            addCriterion("PK_ANALYSIS_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListEqualTo(String value) {
            addCriterion("PK_ANALYSIS_LIST =", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListNotEqualTo(String value) {
            addCriterion("PK_ANALYSIS_LIST <>", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListGreaterThan(String value) {
            addCriterion("PK_ANALYSIS_LIST >", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ANALYSIS_LIST >=", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListLessThan(String value) {
            addCriterion("PK_ANALYSIS_LIST <", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListLessThanOrEqualTo(String value) {
            addCriterion("PK_ANALYSIS_LIST <=", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListLike(String value) {
            addCriterion("PK_ANALYSIS_LIST like", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListNotLike(String value) {
            addCriterion("PK_ANALYSIS_LIST not like", value, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListIn(List<String> values) {
            addCriterion("PK_ANALYSIS_LIST in", values, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListNotIn(List<String> values) {
            addCriterion("PK_ANALYSIS_LIST not in", values, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListBetween(String value1, String value2) {
            addCriterion("PK_ANALYSIS_LIST between", value1, value2, "pkAnalysisList");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisListNotBetween(String value1, String value2) {
            addCriterion("PK_ANALYSIS_LIST not between", value1, value2, "pkAnalysisList");
            return (Criteria) this;
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

        public Criteria andNcAnalysisCodeIsNull() {
            addCriterion("NC_ANALYSIS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeIsNotNull() {
            addCriterion("NC_ANALYSIS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeEqualTo(String value) {
            addCriterion("NC_ANALYSIS_CODE =", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeNotEqualTo(String value) {
            addCriterion("NC_ANALYSIS_CODE <>", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeGreaterThan(String value) {
            addCriterion("NC_ANALYSIS_CODE >", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_CODE >=", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeLessThan(String value) {
            addCriterion("NC_ANALYSIS_CODE <", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_CODE <=", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeLike(String value) {
            addCriterion("NC_ANALYSIS_CODE like", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeNotLike(String value) {
            addCriterion("NC_ANALYSIS_CODE not like", value, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeIn(List<String> values) {
            addCriterion("NC_ANALYSIS_CODE in", values, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeNotIn(List<String> values) {
            addCriterion("NC_ANALYSIS_CODE not in", values, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_CODE between", value1, value2, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisCodeNotBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_CODE not between", value1, value2, "ncAnalysisCode");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameIsNull() {
            addCriterion("NC_ANALYSIS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameIsNotNull() {
            addCriterion("NC_ANALYSIS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameEqualTo(String value) {
            addCriterion("NC_ANALYSIS_NAME =", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameNotEqualTo(String value) {
            addCriterion("NC_ANALYSIS_NAME <>", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameGreaterThan(String value) {
            addCriterion("NC_ANALYSIS_NAME >", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_NAME >=", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameLessThan(String value) {
            addCriterion("NC_ANALYSIS_NAME <", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameLessThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_NAME <=", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameLike(String value) {
            addCriterion("NC_ANALYSIS_NAME like", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameNotLike(String value) {
            addCriterion("NC_ANALYSIS_NAME not like", value, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameIn(List<String> values) {
            addCriterion("NC_ANALYSIS_NAME in", values, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameNotIn(List<String> values) {
            addCriterion("NC_ANALYSIS_NAME not in", values, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_NAME between", value1, value2, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisNameNotBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_NAME not between", value1, value2, "ncAnalysisName");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNull() {
            addCriterion("ISENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("ISENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(BigDecimal value) {
            addCriterion("ISENABLE =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(BigDecimal value) {
            addCriterion("ISENABLE <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(BigDecimal value) {
            addCriterion("ISENABLE >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISENABLE >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(BigDecimal value) {
            addCriterion("ISENABLE <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISENABLE <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<BigDecimal> values) {
            addCriterion("ISENABLE in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<BigDecimal> values) {
            addCriterion("ISENABLE not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISENABLE between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISENABLE not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionIsNull() {
            addCriterion("NC_TEST_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionIsNotNull() {
            addCriterion("NC_TEST_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionEqualTo(String value) {
            addCriterion("NC_TEST_CONDITION =", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionNotEqualTo(String value) {
            addCriterion("NC_TEST_CONDITION <>", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionGreaterThan(String value) {
            addCriterion("NC_TEST_CONDITION >", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TEST_CONDITION >=", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionLessThan(String value) {
            addCriterion("NC_TEST_CONDITION <", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionLessThanOrEqualTo(String value) {
            addCriterion("NC_TEST_CONDITION <=", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionLike(String value) {
            addCriterion("NC_TEST_CONDITION like", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionNotLike(String value) {
            addCriterion("NC_TEST_CONDITION not like", value, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionIn(List<String> values) {
            addCriterion("NC_TEST_CONDITION in", values, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionNotIn(List<String> values) {
            addCriterion("NC_TEST_CONDITION not in", values, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionBetween(String value1, String value2) {
            addCriterion("NC_TEST_CONDITION between", value1, value2, "ncTestCondition");
            return (Criteria) this;
        }

        public Criteria andNcTestConditionNotBetween(String value1, String value2) {
            addCriterion("NC_TEST_CONDITION not between", value1, value2, "ncTestCondition");
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