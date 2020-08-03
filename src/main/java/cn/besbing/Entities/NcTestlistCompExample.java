package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NcTestlistCompExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcTestlistCompExample() {
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

        public Criteria andPkTestlistCompIsNull() {
            addCriterion("PK_TESTLIST_COMP is null");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompIsNotNull() {
            addCriterion("PK_TESTLIST_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompEqualTo(String value) {
            addCriterion("PK_TESTLIST_COMP =", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompNotEqualTo(String value) {
            addCriterion("PK_TESTLIST_COMP <>", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompGreaterThan(String value) {
            addCriterion("PK_TESTLIST_COMP >", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TESTLIST_COMP >=", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompLessThan(String value) {
            addCriterion("PK_TESTLIST_COMP <", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompLessThanOrEqualTo(String value) {
            addCriterion("PK_TESTLIST_COMP <=", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompLike(String value) {
            addCriterion("PK_TESTLIST_COMP like", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompNotLike(String value) {
            addCriterion("PK_TESTLIST_COMP not like", value, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompIn(List<String> values) {
            addCriterion("PK_TESTLIST_COMP in", values, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompNotIn(List<String> values) {
            addCriterion("PK_TESTLIST_COMP not in", values, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompBetween(String value1, String value2) {
            addCriterion("PK_TESTLIST_COMP between", value1, value2, "pkTestlistComp");
            return (Criteria) this;
        }

        public Criteria andPkTestlistCompNotBetween(String value1, String value2) {
            addCriterion("PK_TESTLIST_COMP not between", value1, value2, "pkTestlistComp");
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

        public Criteria andPkListTableIsNull() {
            addCriterion("PK_LIST_TABLE is null");
            return (Criteria) this;
        }

        public Criteria andPkListTableIsNotNull() {
            addCriterion("PK_LIST_TABLE is not null");
            return (Criteria) this;
        }

        public Criteria andPkListTableEqualTo(String value) {
            addCriterion("PK_LIST_TABLE =", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableNotEqualTo(String value) {
            addCriterion("PK_LIST_TABLE <>", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableGreaterThan(String value) {
            addCriterion("PK_LIST_TABLE >", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableGreaterThanOrEqualTo(String value) {
            addCriterion("PK_LIST_TABLE >=", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableLessThan(String value) {
            addCriterion("PK_LIST_TABLE <", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableLessThanOrEqualTo(String value) {
            addCriterion("PK_LIST_TABLE <=", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableLike(String value) {
            addCriterion("PK_LIST_TABLE like", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableNotLike(String value) {
            addCriterion("PK_LIST_TABLE not like", value, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableIn(List<String> values) {
            addCriterion("PK_LIST_TABLE in", values, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableNotIn(List<String> values) {
            addCriterion("PK_LIST_TABLE not in", values, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableBetween(String value1, String value2) {
            addCriterion("PK_LIST_TABLE between", value1, value2, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andPkListTableNotBetween(String value1, String value2) {
            addCriterion("PK_LIST_TABLE not between", value1, value2, "pkListTable");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeIsNull() {
            addCriterion("NC_TESTCOMP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeIsNotNull() {
            addCriterion("NC_TESTCOMP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeEqualTo(String value) {
            addCriterion("NC_TESTCOMP_CODE =", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeNotEqualTo(String value) {
            addCriterion("NC_TESTCOMP_CODE <>", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeGreaterThan(String value) {
            addCriterion("NC_TESTCOMP_CODE >", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TESTCOMP_CODE >=", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeLessThan(String value) {
            addCriterion("NC_TESTCOMP_CODE <", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_TESTCOMP_CODE <=", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeLike(String value) {
            addCriterion("NC_TESTCOMP_CODE like", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeNotLike(String value) {
            addCriterion("NC_TESTCOMP_CODE not like", value, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeIn(List<String> values) {
            addCriterion("NC_TESTCOMP_CODE in", values, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeNotIn(List<String> values) {
            addCriterion("NC_TESTCOMP_CODE not in", values, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeBetween(String value1, String value2) {
            addCriterion("NC_TESTCOMP_CODE between", value1, value2, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompCodeNotBetween(String value1, String value2) {
            addCriterion("NC_TESTCOMP_CODE not between", value1, value2, "ncTestcompCode");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameIsNull() {
            addCriterion("NC_TESTCOMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameIsNotNull() {
            addCriterion("NC_TESTCOMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameEqualTo(String value) {
            addCriterion("NC_TESTCOMP_NAME =", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameNotEqualTo(String value) {
            addCriterion("NC_TESTCOMP_NAME <>", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameGreaterThan(String value) {
            addCriterion("NC_TESTCOMP_NAME >", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TESTCOMP_NAME >=", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameLessThan(String value) {
            addCriterion("NC_TESTCOMP_NAME <", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameLessThanOrEqualTo(String value) {
            addCriterion("NC_TESTCOMP_NAME <=", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameLike(String value) {
            addCriterion("NC_TESTCOMP_NAME like", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameNotLike(String value) {
            addCriterion("NC_TESTCOMP_NAME not like", value, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameIn(List<String> values) {
            addCriterion("NC_TESTCOMP_NAME in", values, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameNotIn(List<String> values) {
            addCriterion("NC_TESTCOMP_NAME not in", values, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameBetween(String value1, String value2) {
            addCriterion("NC_TESTCOMP_NAME between", value1, value2, "ncTestcompName");
            return (Criteria) this;
        }

        public Criteria andNcTestcompNameNotBetween(String value1, String value2) {
            addCriterion("NC_TESTCOMP_NAME not between", value1, value2, "ncTestcompName");
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

        public Criteria andNcTlcComponentIsNull() {
            addCriterion("NC_TLC_COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentIsNotNull() {
            addCriterion("NC_TLC_COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentEqualTo(String value) {
            addCriterion("NC_TLC_COMPONENT =", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentNotEqualTo(String value) {
            addCriterion("NC_TLC_COMPONENT <>", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentGreaterThan(String value) {
            addCriterion("NC_TLC_COMPONENT >", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TLC_COMPONENT >=", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentLessThan(String value) {
            addCriterion("NC_TLC_COMPONENT <", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentLessThanOrEqualTo(String value) {
            addCriterion("NC_TLC_COMPONENT <=", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentLike(String value) {
            addCriterion("NC_TLC_COMPONENT like", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentNotLike(String value) {
            addCriterion("NC_TLC_COMPONENT not like", value, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentIn(List<String> values) {
            addCriterion("NC_TLC_COMPONENT in", values, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentNotIn(List<String> values) {
            addCriterion("NC_TLC_COMPONENT not in", values, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentBetween(String value1, String value2) {
            addCriterion("NC_TLC_COMPONENT between", value1, value2, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andNcTlcComponentNotBetween(String value1, String value2) {
            addCriterion("NC_TLC_COMPONENT not between", value1, value2, "ncTlcComponent");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountIsNull() {
            addCriterion("ANALYSIS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountIsNotNull() {
            addCriterion("ANALYSIS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountEqualTo(String value) {
            addCriterion("ANALYSIS_COUNT =", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotEqualTo(String value) {
            addCriterion("ANALYSIS_COUNT <>", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountGreaterThan(String value) {
            addCriterion("ANALYSIS_COUNT >", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS_COUNT >=", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountLessThan(String value) {
            addCriterion("ANALYSIS_COUNT <", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS_COUNT <=", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountLike(String value) {
            addCriterion("ANALYSIS_COUNT like", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotLike(String value) {
            addCriterion("ANALYSIS_COUNT not like", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountIn(List<String> values) {
            addCriterion("ANALYSIS_COUNT in", values, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotIn(List<String> values) {
            addCriterion("ANALYSIS_COUNT not in", values, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountBetween(String value1, String value2) {
            addCriterion("ANALYSIS_COUNT between", value1, value2, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS_COUNT not between", value1, value2, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("ORDER_NUMBER like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("ORDER_NUMBER not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoIsNull() {
            addCriterion("RESULT_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoIsNotNull() {
            addCriterion("RESULT_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoEqualTo(String value) {
            addCriterion("RESULT_ORDER_NO =", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoNotEqualTo(String value) {
            addCriterion("RESULT_ORDER_NO <>", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoGreaterThan(String value) {
            addCriterion("RESULT_ORDER_NO >", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_ORDER_NO >=", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoLessThan(String value) {
            addCriterion("RESULT_ORDER_NO <", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoLessThanOrEqualTo(String value) {
            addCriterion("RESULT_ORDER_NO <=", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoLike(String value) {
            addCriterion("RESULT_ORDER_NO like", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoNotLike(String value) {
            addCriterion("RESULT_ORDER_NO not like", value, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoIn(List<String> values) {
            addCriterion("RESULT_ORDER_NO in", values, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoNotIn(List<String> values) {
            addCriterion("RESULT_ORDER_NO not in", values, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoBetween(String value1, String value2) {
            addCriterion("RESULT_ORDER_NO between", value1, value2, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andResultOrderNoNotBetween(String value1, String value2) {
            addCriterion("RESULT_ORDER_NO not between", value1, value2, "resultOrderNo");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNull() {
            addCriterion("UNITS is null");
            return (Criteria) this;
        }

        public Criteria andUnitsIsNotNull() {
            addCriterion("UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andUnitsEqualTo(String value) {
            addCriterion("UNITS =", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotEqualTo(String value) {
            addCriterion("UNITS <>", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThan(String value) {
            addCriterion("UNITS >", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("UNITS >=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThan(String value) {
            addCriterion("UNITS <", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLessThanOrEqualTo(String value) {
            addCriterion("UNITS <=", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsLike(String value) {
            addCriterion("UNITS like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotLike(String value) {
            addCriterion("UNITS not like", value, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsIn(List<String> values) {
            addCriterion("UNITS in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotIn(List<String> values) {
            addCriterion("UNITS not in", values, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsBetween(String value1, String value2) {
            addCriterion("UNITS between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andUnitsNotBetween(String value1, String value2) {
            addCriterion("UNITS not between", value1, value2, "units");
            return (Criteria) this;
        }

        public Criteria andRoundIsNull() {
            addCriterion("ROUND is null");
            return (Criteria) this;
        }

        public Criteria andRoundIsNotNull() {
            addCriterion("ROUND is not null");
            return (Criteria) this;
        }

        public Criteria andRoundEqualTo(String value) {
            addCriterion("ROUND =", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotEqualTo(String value) {
            addCriterion("ROUND <>", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThan(String value) {
            addCriterion("ROUND >", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundGreaterThanOrEqualTo(String value) {
            addCriterion("ROUND >=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThan(String value) {
            addCriterion("ROUND <", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLessThanOrEqualTo(String value) {
            addCriterion("ROUND <=", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundLike(String value) {
            addCriterion("ROUND like", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotLike(String value) {
            addCriterion("ROUND not like", value, "round");
            return (Criteria) this;
        }

        public Criteria andRoundIn(List<String> values) {
            addCriterion("ROUND in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotIn(List<String> values) {
            addCriterion("ROUND not in", values, "round");
            return (Criteria) this;
        }

        public Criteria andRoundBetween(String value1, String value2) {
            addCriterion("ROUND between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andRoundNotBetween(String value1, String value2) {
            addCriterion("ROUND not between", value1, value2, "round");
            return (Criteria) this;
        }

        public Criteria andPlacesIsNull() {
            addCriterion("PLACES is null");
            return (Criteria) this;
        }

        public Criteria andPlacesIsNotNull() {
            addCriterion("PLACES is not null");
            return (Criteria) this;
        }

        public Criteria andPlacesEqualTo(Long value) {
            addCriterion("PLACES =", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesNotEqualTo(Long value) {
            addCriterion("PLACES <>", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesGreaterThan(Long value) {
            addCriterion("PLACES >", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesGreaterThanOrEqualTo(Long value) {
            addCriterion("PLACES >=", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesLessThan(Long value) {
            addCriterion("PLACES <", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesLessThanOrEqualTo(Long value) {
            addCriterion("PLACES <=", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesIn(List<Long> values) {
            addCriterion("PLACES in", values, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesNotIn(List<Long> values) {
            addCriterion("PLACES not in", values, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesBetween(Long value1, Long value2) {
            addCriterion("PLACES between", value1, value2, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesNotBetween(Long value1, Long value2) {
            addCriterion("PLACES not between", value1, value2, "places");
            return (Criteria) this;
        }

        public Criteria andReplicateCountIsNull() {
            addCriterion("REPLICATE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andReplicateCountIsNotNull() {
            addCriterion("REPLICATE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReplicateCountEqualTo(Long value) {
            addCriterion("REPLICATE_COUNT =", value, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountNotEqualTo(Long value) {
            addCriterion("REPLICATE_COUNT <>", value, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountGreaterThan(Long value) {
            addCriterion("REPLICATE_COUNT >", value, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountGreaterThanOrEqualTo(Long value) {
            addCriterion("REPLICATE_COUNT >=", value, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountLessThan(Long value) {
            addCriterion("REPLICATE_COUNT <", value, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountLessThanOrEqualTo(Long value) {
            addCriterion("REPLICATE_COUNT <=", value, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountIn(List<Long> values) {
            addCriterion("REPLICATE_COUNT in", values, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountNotIn(List<Long> values) {
            addCriterion("REPLICATE_COUNT not in", values, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountBetween(Long value1, Long value2) {
            addCriterion("REPLICATE_COUNT between", value1, value2, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andReplicateCountNotBetween(Long value1, Long value2) {
            addCriterion("REPLICATE_COUNT not between", value1, value2, "replicateCount");
            return (Criteria) this;
        }

        public Criteria andMinLimitIsNull() {
            addCriterion("MIN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andMinLimitIsNotNull() {
            addCriterion("MIN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andMinLimitEqualTo(BigDecimal value) {
            addCriterion("MIN_LIMIT =", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotEqualTo(BigDecimal value) {
            addCriterion("MIN_LIMIT <>", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitGreaterThan(BigDecimal value) {
            addCriterion("MIN_LIMIT >", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_LIMIT >=", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLessThan(BigDecimal value) {
            addCriterion("MIN_LIMIT <", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_LIMIT <=", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitIn(List<BigDecimal> values) {
            addCriterion("MIN_LIMIT in", values, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotIn(List<BigDecimal> values) {
            addCriterion("MIN_LIMIT not in", values, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_LIMIT between", value1, value2, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_LIMIT not between", value1, value2, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIsNull() {
            addCriterion("MAX_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIsNotNull() {
            addCriterion("MAX_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxLimitEqualTo(BigDecimal value) {
            addCriterion("MAX_LIMIT =", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotEqualTo(BigDecimal value) {
            addCriterion("MAX_LIMIT <>", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitGreaterThan(BigDecimal value) {
            addCriterion("MAX_LIMIT >", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_LIMIT >=", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLessThan(BigDecimal value) {
            addCriterion("MAX_LIMIT <", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_LIMIT <=", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIn(List<BigDecimal> values) {
            addCriterion("MAX_LIMIT in", values, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotIn(List<BigDecimal> values) {
            addCriterion("MAX_LIMIT not in", values, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_LIMIT between", value1, value2, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_LIMIT not between", value1, value2, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andReportableIsNull() {
            addCriterion("REPORTABLE is null");
            return (Criteria) this;
        }

        public Criteria andReportableIsNotNull() {
            addCriterion("REPORTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andReportableEqualTo(String value) {
            addCriterion("REPORTABLE =", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableNotEqualTo(String value) {
            addCriterion("REPORTABLE <>", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableGreaterThan(String value) {
            addCriterion("REPORTABLE >", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTABLE >=", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableLessThan(String value) {
            addCriterion("REPORTABLE <", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableLessThanOrEqualTo(String value) {
            addCriterion("REPORTABLE <=", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableLike(String value) {
            addCriterion("REPORTABLE like", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableNotLike(String value) {
            addCriterion("REPORTABLE not like", value, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableIn(List<String> values) {
            addCriterion("REPORTABLE in", values, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableNotIn(List<String> values) {
            addCriterion("REPORTABLE not in", values, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableBetween(String value1, String value2) {
            addCriterion("REPORTABLE between", value1, value2, "reportable");
            return (Criteria) this;
        }

        public Criteria andReportableNotBetween(String value1, String value2) {
            addCriterion("REPORTABLE not between", value1, value2, "reportable");
            return (Criteria) this;
        }

        public Criteria andOptionalIsNull() {
            addCriterion("OPTIONAL is null");
            return (Criteria) this;
        }

        public Criteria andOptionalIsNotNull() {
            addCriterion("OPTIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andOptionalEqualTo(String value) {
            addCriterion("OPTIONAL =", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotEqualTo(String value) {
            addCriterion("OPTIONAL <>", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalGreaterThan(String value) {
            addCriterion("OPTIONAL >", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalGreaterThanOrEqualTo(String value) {
            addCriterion("OPTIONAL >=", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalLessThan(String value) {
            addCriterion("OPTIONAL <", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalLessThanOrEqualTo(String value) {
            addCriterion("OPTIONAL <=", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalLike(String value) {
            addCriterion("OPTIONAL like", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotLike(String value) {
            addCriterion("OPTIONAL not like", value, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalIn(List<String> values) {
            addCriterion("OPTIONAL in", values, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotIn(List<String> values) {
            addCriterion("OPTIONAL not in", values, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalBetween(String value1, String value2) {
            addCriterion("OPTIONAL between", value1, value2, "optional");
            return (Criteria) this;
        }

        public Criteria andOptionalNotBetween(String value1, String value2) {
            addCriterion("OPTIONAL not between", value1, value2, "optional");
            return (Criteria) this;
        }

        public Criteria andDisplayedIsNull() {
            addCriterion("DISPLAYED is null");
            return (Criteria) this;
        }

        public Criteria andDisplayedIsNotNull() {
            addCriterion("DISPLAYED is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayedEqualTo(String value) {
            addCriterion("DISPLAYED =", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotEqualTo(String value) {
            addCriterion("DISPLAYED <>", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedGreaterThan(String value) {
            addCriterion("DISPLAYED >", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAYED >=", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedLessThan(String value) {
            addCriterion("DISPLAYED <", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedLessThanOrEqualTo(String value) {
            addCriterion("DISPLAYED <=", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedLike(String value) {
            addCriterion("DISPLAYED like", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotLike(String value) {
            addCriterion("DISPLAYED not like", value, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedIn(List<String> values) {
            addCriterion("DISPLAYED in", values, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotIn(List<String> values) {
            addCriterion("DISPLAYED not in", values, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedBetween(String value1, String value2) {
            addCriterion("DISPLAYED between", value1, value2, "displayed");
            return (Criteria) this;
        }

        public Criteria andDisplayedNotBetween(String value1, String value2) {
            addCriterion("DISPLAYED not between", value1, value2, "displayed");
            return (Criteria) this;
        }

        public Criteria andFactorValuesIsNull() {
            addCriterion("FACTOR_VALUES is null");
            return (Criteria) this;
        }

        public Criteria andFactorValuesIsNotNull() {
            addCriterion("FACTOR_VALUES is not null");
            return (Criteria) this;
        }

        public Criteria andFactorValuesEqualTo(String value) {
            addCriterion("FACTOR_VALUES =", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesNotEqualTo(String value) {
            addCriterion("FACTOR_VALUES <>", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesGreaterThan(String value) {
            addCriterion("FACTOR_VALUES >", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR_VALUES >=", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesLessThan(String value) {
            addCriterion("FACTOR_VALUES <", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesLessThanOrEqualTo(String value) {
            addCriterion("FACTOR_VALUES <=", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesLike(String value) {
            addCriterion("FACTOR_VALUES like", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesNotLike(String value) {
            addCriterion("FACTOR_VALUES not like", value, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesIn(List<String> values) {
            addCriterion("FACTOR_VALUES in", values, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesNotIn(List<String> values) {
            addCriterion("FACTOR_VALUES not in", values, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesBetween(String value1, String value2) {
            addCriterion("FACTOR_VALUES between", value1, value2, "factorValues");
            return (Criteria) this;
        }

        public Criteria andFactorValuesNotBetween(String value1, String value2) {
            addCriterion("FACTOR_VALUES not between", value1, value2, "factorValues");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionIsNull() {
            addCriterion("ANALYSIS_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionIsNotNull() {
            addCriterion("ANALYSIS_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION =", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionNotEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION <>", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionGreaterThan(Long value) {
            addCriterion("ANALYSIS_VERSION >", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION >=", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionLessThan(Long value) {
            addCriterion("ANALYSIS_VERSION <", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionLessThanOrEqualTo(Long value) {
            addCriterion("ANALYSIS_VERSION <=", value, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionIn(List<Long> values) {
            addCriterion("ANALYSIS_VERSION in", values, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionNotIn(List<Long> values) {
            addCriterion("ANALYSIS_VERSION not in", values, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionBetween(Long value1, Long value2) {
            addCriterion("ANALYSIS_VERSION between", value1, value2, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andAnalysisVersionNotBetween(Long value1, Long value2) {
            addCriterion("ANALYSIS_VERSION not between", value1, value2, "analysisVersion");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueIsNull() {
            addCriterion("C_DEFAULT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueIsNotNull() {
            addCriterion("C_DEFAULT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueEqualTo(String value) {
            addCriterion("C_DEFAULT_VALUE =", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueNotEqualTo(String value) {
            addCriterion("C_DEFAULT_VALUE <>", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueGreaterThan(String value) {
            addCriterion("C_DEFAULT_VALUE >", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEFAULT_VALUE >=", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueLessThan(String value) {
            addCriterion("C_DEFAULT_VALUE <", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("C_DEFAULT_VALUE <=", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueLike(String value) {
            addCriterion("C_DEFAULT_VALUE like", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueNotLike(String value) {
            addCriterion("C_DEFAULT_VALUE not like", value, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueIn(List<String> values) {
            addCriterion("C_DEFAULT_VALUE in", values, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueNotIn(List<String> values) {
            addCriterion("C_DEFAULT_VALUE not in", values, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueBetween(String value1, String value2) {
            addCriterion("C_DEFAULT_VALUE between", value1, value2, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCDefaultValueNotBetween(String value1, String value2) {
            addCriterion("C_DEFAULT_VALUE not between", value1, value2, "cDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueIsNull() {
            addCriterion("C_EN_DEFAULT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueIsNotNull() {
            addCriterion("C_EN_DEFAULT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueEqualTo(String value) {
            addCriterion("C_EN_DEFAULT_VALUE =", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueNotEqualTo(String value) {
            addCriterion("C_EN_DEFAULT_VALUE <>", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueGreaterThan(String value) {
            addCriterion("C_EN_DEFAULT_VALUE >", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueGreaterThanOrEqualTo(String value) {
            addCriterion("C_EN_DEFAULT_VALUE >=", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueLessThan(String value) {
            addCriterion("C_EN_DEFAULT_VALUE <", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueLessThanOrEqualTo(String value) {
            addCriterion("C_EN_DEFAULT_VALUE <=", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueLike(String value) {
            addCriterion("C_EN_DEFAULT_VALUE like", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueNotLike(String value) {
            addCriterion("C_EN_DEFAULT_VALUE not like", value, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueIn(List<String> values) {
            addCriterion("C_EN_DEFAULT_VALUE in", values, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueNotIn(List<String> values) {
            addCriterion("C_EN_DEFAULT_VALUE not in", values, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueBetween(String value1, String value2) {
            addCriterion("C_EN_DEFAULT_VALUE between", value1, value2, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andCEnDefaultValueNotBetween(String value1, String value2) {
            addCriterion("C_EN_DEFAULT_VALUE not between", value1, value2, "cEnDefaultValue");
            return (Criteria) this;
        }

        public Criteria andListKeyIsNull() {
            addCriterion("LIST_KEY is null");
            return (Criteria) this;
        }

        public Criteria andListKeyIsNotNull() {
            addCriterion("LIST_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andListKeyEqualTo(String value) {
            addCriterion("LIST_KEY =", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyNotEqualTo(String value) {
            addCriterion("LIST_KEY <>", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyGreaterThan(String value) {
            addCriterion("LIST_KEY >", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyGreaterThanOrEqualTo(String value) {
            addCriterion("LIST_KEY >=", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyLessThan(String value) {
            addCriterion("LIST_KEY <", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyLessThanOrEqualTo(String value) {
            addCriterion("LIST_KEY <=", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyLike(String value) {
            addCriterion("LIST_KEY like", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyNotLike(String value) {
            addCriterion("LIST_KEY not like", value, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyIn(List<String> values) {
            addCriterion("LIST_KEY in", values, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyNotIn(List<String> values) {
            addCriterion("LIST_KEY not in", values, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyBetween(String value1, String value2) {
            addCriterion("LIST_KEY between", value1, value2, "listKey");
            return (Criteria) this;
        }

        public Criteria andListKeyNotBetween(String value1, String value2) {
            addCriterion("LIST_KEY not between", value1, value2, "listKey");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileIsNull() {
            addCriterion("C_DEFAULT_DB_FILE is null");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileIsNotNull() {
            addCriterion("C_DEFAULT_DB_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileEqualTo(Long value) {
            addCriterion("C_DEFAULT_DB_FILE =", value, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileNotEqualTo(Long value) {
            addCriterion("C_DEFAULT_DB_FILE <>", value, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileGreaterThan(Long value) {
            addCriterion("C_DEFAULT_DB_FILE >", value, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileGreaterThanOrEqualTo(Long value) {
            addCriterion("C_DEFAULT_DB_FILE >=", value, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileLessThan(Long value) {
            addCriterion("C_DEFAULT_DB_FILE <", value, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileLessThanOrEqualTo(Long value) {
            addCriterion("C_DEFAULT_DB_FILE <=", value, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileIn(List<Long> values) {
            addCriterion("C_DEFAULT_DB_FILE in", values, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileNotIn(List<Long> values) {
            addCriterion("C_DEFAULT_DB_FILE not in", values, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileBetween(Long value1, Long value2) {
            addCriterion("C_DEFAULT_DB_FILE between", value1, value2, "cDefaultDbFile");
            return (Criteria) this;
        }

        public Criteria andCDefaultDbFileNotBetween(Long value1, Long value2) {
            addCriterion("C_DEFAULT_DB_FILE not between", value1, value2, "cDefaultDbFile");
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