package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.List;

public class NcTestAfterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcTestAfterExample() {
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

        public Criteria andPkTestAfterIsNull() {
            addCriterion("PK_TEST_AFTER is null");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterIsNotNull() {
            addCriterion("PK_TEST_AFTER is not null");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterEqualTo(String value) {
            addCriterion("PK_TEST_AFTER =", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterNotEqualTo(String value) {
            addCriterion("PK_TEST_AFTER <>", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterGreaterThan(String value) {
            addCriterion("PK_TEST_AFTER >", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TEST_AFTER >=", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterLessThan(String value) {
            addCriterion("PK_TEST_AFTER <", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterLessThanOrEqualTo(String value) {
            addCriterion("PK_TEST_AFTER <=", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterLike(String value) {
            addCriterion("PK_TEST_AFTER like", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterNotLike(String value) {
            addCriterion("PK_TEST_AFTER not like", value, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterIn(List<String> values) {
            addCriterion("PK_TEST_AFTER in", values, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterNotIn(List<String> values) {
            addCriterion("PK_TEST_AFTER not in", values, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterBetween(String value1, String value2) {
            addCriterion("PK_TEST_AFTER between", value1, value2, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkTestAfterNotBetween(String value1, String value2) {
            addCriterion("PK_TEST_AFTER not between", value1, value2, "pkTestAfter");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeIsNull() {
            addCriterion("PK_RESULT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeIsNotNull() {
            addCriterion("PK_RESULT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeEqualTo(String value) {
            addCriterion("PK_RESULT_TYPE =", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeNotEqualTo(String value) {
            addCriterion("PK_RESULT_TYPE <>", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeGreaterThan(String value) {
            addCriterion("PK_RESULT_TYPE >", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_RESULT_TYPE >=", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeLessThan(String value) {
            addCriterion("PK_RESULT_TYPE <", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeLessThanOrEqualTo(String value) {
            addCriterion("PK_RESULT_TYPE <=", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeLike(String value) {
            addCriterion("PK_RESULT_TYPE like", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeNotLike(String value) {
            addCriterion("PK_RESULT_TYPE not like", value, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeIn(List<String> values) {
            addCriterion("PK_RESULT_TYPE in", values, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeNotIn(List<String> values) {
            addCriterion("PK_RESULT_TYPE not in", values, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeBetween(String value1, String value2) {
            addCriterion("PK_RESULT_TYPE between", value1, value2, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkResultTypeNotBetween(String value1, String value2) {
            addCriterion("PK_RESULT_TYPE not between", value1, value2, "pkResultType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeIsNull() {
            addCriterion("PK_UNITS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeIsNotNull() {
            addCriterion("PK_UNITS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeEqualTo(String value) {
            addCriterion("PK_UNITS_TYPE =", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeNotEqualTo(String value) {
            addCriterion("PK_UNITS_TYPE <>", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeGreaterThan(String value) {
            addCriterion("PK_UNITS_TYPE >", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_UNITS_TYPE >=", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeLessThan(String value) {
            addCriterion("PK_UNITS_TYPE <", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeLessThanOrEqualTo(String value) {
            addCriterion("PK_UNITS_TYPE <=", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeLike(String value) {
            addCriterion("PK_UNITS_TYPE like", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeNotLike(String value) {
            addCriterion("PK_UNITS_TYPE not like", value, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeIn(List<String> values) {
            addCriterion("PK_UNITS_TYPE in", values, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeNotIn(List<String> values) {
            addCriterion("PK_UNITS_TYPE not in", values, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeBetween(String value1, String value2) {
            addCriterion("PK_UNITS_TYPE between", value1, value2, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andPkUnitsTypeNotBetween(String value1, String value2) {
            addCriterion("PK_UNITS_TYPE not between", value1, value2, "pkUnitsType");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeIsNull() {
            addCriterion("TEST_AFTER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeIsNotNull() {
            addCriterion("TEST_AFTER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeEqualTo(String value) {
            addCriterion("TEST_AFTER_CODE =", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeNotEqualTo(String value) {
            addCriterion("TEST_AFTER_CODE <>", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeGreaterThan(String value) {
            addCriterion("TEST_AFTER_CODE >", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_AFTER_CODE >=", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeLessThan(String value) {
            addCriterion("TEST_AFTER_CODE <", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeLessThanOrEqualTo(String value) {
            addCriterion("TEST_AFTER_CODE <=", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeLike(String value) {
            addCriterion("TEST_AFTER_CODE like", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeNotLike(String value) {
            addCriterion("TEST_AFTER_CODE not like", value, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeIn(List<String> values) {
            addCriterion("TEST_AFTER_CODE in", values, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeNotIn(List<String> values) {
            addCriterion("TEST_AFTER_CODE not in", values, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeBetween(String value1, String value2) {
            addCriterion("TEST_AFTER_CODE between", value1, value2, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterCodeNotBetween(String value1, String value2) {
            addCriterion("TEST_AFTER_CODE not between", value1, value2, "testAfterCode");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameIsNull() {
            addCriterion("TEST_AFTER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameIsNotNull() {
            addCriterion("TEST_AFTER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameEqualTo(String value) {
            addCriterion("TEST_AFTER_NAME =", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameNotEqualTo(String value) {
            addCriterion("TEST_AFTER_NAME <>", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameGreaterThan(String value) {
            addCriterion("TEST_AFTER_NAME >", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_AFTER_NAME >=", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameLessThan(String value) {
            addCriterion("TEST_AFTER_NAME <", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameLessThanOrEqualTo(String value) {
            addCriterion("TEST_AFTER_NAME <=", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameLike(String value) {
            addCriterion("TEST_AFTER_NAME like", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameNotLike(String value) {
            addCriterion("TEST_AFTER_NAME not like", value, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameIn(List<String> values) {
            addCriterion("TEST_AFTER_NAME in", values, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameNotIn(List<String> values) {
            addCriterion("TEST_AFTER_NAME not in", values, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameBetween(String value1, String value2) {
            addCriterion("TEST_AFTER_NAME between", value1, value2, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andTestAfterNameNotBetween(String value1, String value2) {
            addCriterion("TEST_AFTER_NAME not between", value1, value2, "testAfterName");
            return (Criteria) this;
        }

        public Criteria andNcEnstardIsNull() {
            addCriterion("NC_ENSTARD is null");
            return (Criteria) this;
        }

        public Criteria andNcEnstardIsNotNull() {
            addCriterion("NC_ENSTARD is not null");
            return (Criteria) this;
        }

        public Criteria andNcEnstardEqualTo(Object value) {
            addCriterion("NC_ENSTARD =", value, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardNotEqualTo(Object value) {
            addCriterion("NC_ENSTARD <>", value, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardGreaterThan(Object value) {
            addCriterion("NC_ENSTARD >", value, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardGreaterThanOrEqualTo(Object value) {
            addCriterion("NC_ENSTARD >=", value, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardLessThan(Object value) {
            addCriterion("NC_ENSTARD <", value, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardLessThanOrEqualTo(Object value) {
            addCriterion("NC_ENSTARD <=", value, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardIn(List<Object> values) {
            addCriterion("NC_ENSTARD in", values, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardNotIn(List<Object> values) {
            addCriterion("NC_ENSTARD not in", values, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardBetween(Object value1, Object value2) {
            addCriterion("NC_ENSTARD between", value1, value2, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEnstardNotBetween(Object value1, Object value2) {
            addCriterion("NC_ENSTARD not between", value1, value2, "ncEnstard");
            return (Criteria) this;
        }

        public Criteria andNcEntryIsNull() {
            addCriterion("NC_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andNcEntryIsNotNull() {
            addCriterion("NC_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andNcEntryEqualTo(Long value) {
            addCriterion("NC_ENTRY =", value, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryNotEqualTo(Long value) {
            addCriterion("NC_ENTRY <>", value, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryGreaterThan(Long value) {
            addCriterion("NC_ENTRY >", value, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryGreaterThanOrEqualTo(Long value) {
            addCriterion("NC_ENTRY >=", value, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryLessThan(Long value) {
            addCriterion("NC_ENTRY <", value, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryLessThanOrEqualTo(Long value) {
            addCriterion("NC_ENTRY <=", value, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryIn(List<Long> values) {
            addCriterion("NC_ENTRY in", values, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryNotIn(List<Long> values) {
            addCriterion("NC_ENTRY not in", values, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryBetween(Long value1, Long value2) {
            addCriterion("NC_ENTRY between", value1, value2, "ncEntry");
            return (Criteria) this;
        }

        public Criteria andNcEntryNotBetween(Long value1, Long value2) {
            addCriterion("NC_ENTRY not between", value1, value2, "ncEntry");
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

        public Criteria andNcAnalysisVersionIsNull() {
            addCriterion("NC_ANALYSIS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionIsNotNull() {
            addCriterion("NC_ANALYSIS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionEqualTo(Long value) {
            addCriterion("NC_ANALYSIS_VERSION =", value, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionNotEqualTo(Long value) {
            addCriterion("NC_ANALYSIS_VERSION <>", value, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionGreaterThan(Long value) {
            addCriterion("NC_ANALYSIS_VERSION >", value, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("NC_ANALYSIS_VERSION >=", value, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionLessThan(Long value) {
            addCriterion("NC_ANALYSIS_VERSION <", value, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionLessThanOrEqualTo(Long value) {
            addCriterion("NC_ANALYSIS_VERSION <=", value, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionIn(List<Long> values) {
            addCriterion("NC_ANALYSIS_VERSION in", values, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionNotIn(List<Long> values) {
            addCriterion("NC_ANALYSIS_VERSION not in", values, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionBetween(Long value1, Long value2) {
            addCriterion("NC_ANALYSIS_VERSION between", value1, value2, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisVersionNotBetween(Long value1, Long value2) {
            addCriterion("NC_ANALYSIS_VERSION not between", value1, value2, "ncAnalysisVersion");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeIsNull() {
            addCriterion("NC_ANALYSIS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeIsNotNull() {
            addCriterion("NC_ANALYSIS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeEqualTo(String value) {
            addCriterion("NC_ANALYSIS_TYPE =", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeNotEqualTo(String value) {
            addCriterion("NC_ANALYSIS_TYPE <>", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeGreaterThan(String value) {
            addCriterion("NC_ANALYSIS_TYPE >", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_TYPE >=", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeLessThan(String value) {
            addCriterion("NC_ANALYSIS_TYPE <", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeLessThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_TYPE <=", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeLike(String value) {
            addCriterion("NC_ANALYSIS_TYPE like", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeNotLike(String value) {
            addCriterion("NC_ANALYSIS_TYPE not like", value, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeIn(List<String> values) {
            addCriterion("NC_ANALYSIS_TYPE in", values, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeNotIn(List<String> values) {
            addCriterion("NC_ANALYSIS_TYPE not in", values, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_TYPE between", value1, value2, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisTypeNotBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_TYPE not between", value1, value2, "ncAnalysisType");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleIsNull() {
            addCriterion("NC_SPEC_RULE is null");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleIsNotNull() {
            addCriterion("NC_SPEC_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleEqualTo(String value) {
            addCriterion("NC_SPEC_RULE =", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleNotEqualTo(String value) {
            addCriterion("NC_SPEC_RULE <>", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleGreaterThan(String value) {
            addCriterion("NC_SPEC_RULE >", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleGreaterThanOrEqualTo(String value) {
            addCriterion("NC_SPEC_RULE >=", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleLessThan(String value) {
            addCriterion("NC_SPEC_RULE <", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleLessThanOrEqualTo(String value) {
            addCriterion("NC_SPEC_RULE <=", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleLike(String value) {
            addCriterion("NC_SPEC_RULE like", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleNotLike(String value) {
            addCriterion("NC_SPEC_RULE not like", value, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleIn(List<String> values) {
            addCriterion("NC_SPEC_RULE in", values, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleNotIn(List<String> values) {
            addCriterion("NC_SPEC_RULE not in", values, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleBetween(String value1, String value2) {
            addCriterion("NC_SPEC_RULE between", value1, value2, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcSpecRuleNotBetween(String value1, String value2) {
            addCriterion("NC_SPEC_RULE not between", value1, value2, "ncSpecRule");
            return (Criteria) this;
        }

        public Criteria andNcMinValueIsNull() {
            addCriterion("NC_MIN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNcMinValueIsNotNull() {
            addCriterion("NC_MIN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNcMinValueEqualTo(String value) {
            addCriterion("NC_MIN_VALUE =", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueNotEqualTo(String value) {
            addCriterion("NC_MIN_VALUE <>", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueGreaterThan(String value) {
            addCriterion("NC_MIN_VALUE >", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueGreaterThanOrEqualTo(String value) {
            addCriterion("NC_MIN_VALUE >=", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueLessThan(String value) {
            addCriterion("NC_MIN_VALUE <", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueLessThanOrEqualTo(String value) {
            addCriterion("NC_MIN_VALUE <=", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueLike(String value) {
            addCriterion("NC_MIN_VALUE like", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueNotLike(String value) {
            addCriterion("NC_MIN_VALUE not like", value, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueIn(List<String> values) {
            addCriterion("NC_MIN_VALUE in", values, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueNotIn(List<String> values) {
            addCriterion("NC_MIN_VALUE not in", values, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueBetween(String value1, String value2) {
            addCriterion("NC_MIN_VALUE between", value1, value2, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMinValueNotBetween(String value1, String value2) {
            addCriterion("NC_MIN_VALUE not between", value1, value2, "ncMinValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueIsNull() {
            addCriterion("NC_MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueIsNotNull() {
            addCriterion("NC_MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueEqualTo(String value) {
            addCriterion("NC_MAX_VALUE =", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueNotEqualTo(String value) {
            addCriterion("NC_MAX_VALUE <>", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueGreaterThan(String value) {
            addCriterion("NC_MAX_VALUE >", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueGreaterThanOrEqualTo(String value) {
            addCriterion("NC_MAX_VALUE >=", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueLessThan(String value) {
            addCriterion("NC_MAX_VALUE <", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueLessThanOrEqualTo(String value) {
            addCriterion("NC_MAX_VALUE <=", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueLike(String value) {
            addCriterion("NC_MAX_VALUE like", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueNotLike(String value) {
            addCriterion("NC_MAX_VALUE not like", value, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueIn(List<String> values) {
            addCriterion("NC_MAX_VALUE in", values, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueNotIn(List<String> values) {
            addCriterion("NC_MAX_VALUE not in", values, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueBetween(String value1, String value2) {
            addCriterion("NC_MAX_VALUE between", value1, value2, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcMaxValueNotBetween(String value1, String value2) {
            addCriterion("NC_MAX_VALUE not between", value1, value2, "ncMaxValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueIsNull() {
            addCriterion("NC_TEXT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNcTextValueIsNotNull() {
            addCriterion("NC_TEXT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNcTextValueEqualTo(String value) {
            addCriterion("NC_TEXT_VALUE =", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueNotEqualTo(String value) {
            addCriterion("NC_TEXT_VALUE <>", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueGreaterThan(String value) {
            addCriterion("NC_TEXT_VALUE >", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TEXT_VALUE >=", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueLessThan(String value) {
            addCriterion("NC_TEXT_VALUE <", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueLessThanOrEqualTo(String value) {
            addCriterion("NC_TEXT_VALUE <=", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueLike(String value) {
            addCriterion("NC_TEXT_VALUE like", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueNotLike(String value) {
            addCriterion("NC_TEXT_VALUE not like", value, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueIn(List<String> values) {
            addCriterion("NC_TEXT_VALUE in", values, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueNotIn(List<String> values) {
            addCriterion("NC_TEXT_VALUE not in", values, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueBetween(String value1, String value2) {
            addCriterion("NC_TEXT_VALUE between", value1, value2, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcTextValueNotBetween(String value1, String value2) {
            addCriterion("NC_TEXT_VALUE not between", value1, value2, "ncTextValue");
            return (Criteria) this;
        }

        public Criteria andNcStageIsNull() {
            addCriterion("NC_STAGE is null");
            return (Criteria) this;
        }

        public Criteria andNcStageIsNotNull() {
            addCriterion("NC_STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andNcStageEqualTo(String value) {
            addCriterion("NC_STAGE =", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageNotEqualTo(String value) {
            addCriterion("NC_STAGE <>", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageGreaterThan(String value) {
            addCriterion("NC_STAGE >", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageGreaterThanOrEqualTo(String value) {
            addCriterion("NC_STAGE >=", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageLessThan(String value) {
            addCriterion("NC_STAGE <", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageLessThanOrEqualTo(String value) {
            addCriterion("NC_STAGE <=", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageLike(String value) {
            addCriterion("NC_STAGE like", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageNotLike(String value) {
            addCriterion("NC_STAGE not like", value, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageIn(List<String> values) {
            addCriterion("NC_STAGE in", values, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageNotIn(List<String> values) {
            addCriterion("NC_STAGE not in", values, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageBetween(String value1, String value2) {
            addCriterion("NC_STAGE between", value1, value2, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcStageNotBetween(String value1, String value2) {
            addCriterion("NC_STAGE not between", value1, value2, "ncStage");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointIsNull() {
            addCriterion("NC_SAMPLE_POINT is null");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointIsNotNull() {
            addCriterion("NC_SAMPLE_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointEqualTo(String value) {
            addCriterion("NC_SAMPLE_POINT =", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointNotEqualTo(String value) {
            addCriterion("NC_SAMPLE_POINT <>", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointGreaterThan(String value) {
            addCriterion("NC_SAMPLE_POINT >", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointGreaterThanOrEqualTo(String value) {
            addCriterion("NC_SAMPLE_POINT >=", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointLessThan(String value) {
            addCriterion("NC_SAMPLE_POINT <", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointLessThanOrEqualTo(String value) {
            addCriterion("NC_SAMPLE_POINT <=", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointLike(String value) {
            addCriterion("NC_SAMPLE_POINT like", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointNotLike(String value) {
            addCriterion("NC_SAMPLE_POINT not like", value, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointIn(List<String> values) {
            addCriterion("NC_SAMPLE_POINT in", values, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointNotIn(List<String> values) {
            addCriterion("NC_SAMPLE_POINT not in", values, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointBetween(String value1, String value2) {
            addCriterion("NC_SAMPLE_POINT between", value1, value2, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcSamplePointNotBetween(String value1, String value2) {
            addCriterion("NC_SAMPLE_POINT not between", value1, value2, "ncSamplePoint");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeIsNull() {
            addCriterion("NC_CONTACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeIsNotNull() {
            addCriterion("NC_CONTACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeEqualTo(String value) {
            addCriterion("NC_CONTACT_TYPE =", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeNotEqualTo(String value) {
            addCriterion("NC_CONTACT_TYPE <>", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeGreaterThan(String value) {
            addCriterion("NC_CONTACT_TYPE >", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_CONTACT_TYPE >=", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeLessThan(String value) {
            addCriterion("NC_CONTACT_TYPE <", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeLessThanOrEqualTo(String value) {
            addCriterion("NC_CONTACT_TYPE <=", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeLike(String value) {
            addCriterion("NC_CONTACT_TYPE like", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeNotLike(String value) {
            addCriterion("NC_CONTACT_TYPE not like", value, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeIn(List<String> values) {
            addCriterion("NC_CONTACT_TYPE in", values, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeNotIn(List<String> values) {
            addCriterion("NC_CONTACT_TYPE not in", values, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeBetween(String value1, String value2) {
            addCriterion("NC_CONTACT_TYPE between", value1, value2, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcContactTypeNotBetween(String value1, String value2) {
            addCriterion("NC_CONTACT_TYPE not between", value1, value2, "ncContactType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeIsNull() {
            addCriterion("NC_COIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeIsNotNull() {
            addCriterion("NC_COIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeEqualTo(String value) {
            addCriterion("NC_COIL_TYPE =", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeNotEqualTo(String value) {
            addCriterion("NC_COIL_TYPE <>", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeGreaterThan(String value) {
            addCriterion("NC_COIL_TYPE >", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_COIL_TYPE >=", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeLessThan(String value) {
            addCriterion("NC_COIL_TYPE <", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeLessThanOrEqualTo(String value) {
            addCriterion("NC_COIL_TYPE <=", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeLike(String value) {
            addCriterion("NC_COIL_TYPE like", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeNotLike(String value) {
            addCriterion("NC_COIL_TYPE not like", value, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeIn(List<String> values) {
            addCriterion("NC_COIL_TYPE in", values, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeNotIn(List<String> values) {
            addCriterion("NC_COIL_TYPE not in", values, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeBetween(String value1, String value2) {
            addCriterion("NC_COIL_TYPE between", value1, value2, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilTypeNotBetween(String value1, String value2) {
            addCriterion("NC_COIL_TYPE not between", value1, value2, "ncCoilType");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentIsNull() {
            addCriterion("NC_COIL_CURRENT is null");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentIsNotNull() {
            addCriterion("NC_COIL_CURRENT is not null");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentEqualTo(String value) {
            addCriterion("NC_COIL_CURRENT =", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentNotEqualTo(String value) {
            addCriterion("NC_COIL_CURRENT <>", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentGreaterThan(String value) {
            addCriterion("NC_COIL_CURRENT >", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentGreaterThanOrEqualTo(String value) {
            addCriterion("NC_COIL_CURRENT >=", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentLessThan(String value) {
            addCriterion("NC_COIL_CURRENT <", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentLessThanOrEqualTo(String value) {
            addCriterion("NC_COIL_CURRENT <=", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentLike(String value) {
            addCriterion("NC_COIL_CURRENT like", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentNotLike(String value) {
            addCriterion("NC_COIL_CURRENT not like", value, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentIn(List<String> values) {
            addCriterion("NC_COIL_CURRENT in", values, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentNotIn(List<String> values) {
            addCriterion("NC_COIL_CURRENT not in", values, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentBetween(String value1, String value2) {
            addCriterion("NC_COIL_CURRENT between", value1, value2, "ncCoilCurrent");
            return (Criteria) this;
        }

        public Criteria andNcCoilCurrentNotBetween(String value1, String value2) {
            addCriterion("NC_COIL_CURRENT not between", value1, value2, "ncCoilCurrent");
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