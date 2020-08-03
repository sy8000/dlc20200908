package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComponentExample() {
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

        public Criteria andAnalysisIsNull() {
            addCriterion("ANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisIsNotNull() {
            addCriterion("ANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisEqualTo(String value) {
            addCriterion("ANALYSIS =", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotEqualTo(String value) {
            addCriterion("ANALYSIS <>", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThan(String value) {
            addCriterion("ANALYSIS >", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSIS >=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThan(String value) {
            addCriterion("ANALYSIS <", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLessThanOrEqualTo(String value) {
            addCriterion("ANALYSIS <=", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisLike(String value) {
            addCriterion("ANALYSIS like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotLike(String value) {
            addCriterion("ANALYSIS not like", value, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisIn(List<String> values) {
            addCriterion("ANALYSIS in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotIn(List<String> values) {
            addCriterion("ANALYSIS not in", values, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisBetween(String value1, String value2) {
            addCriterion("ANALYSIS between", value1, value2, "analysis");
            return (Criteria) this;
        }

        public Criteria andAnalysisNotBetween(String value1, String value2) {
            addCriterion("ANALYSIS not between", value1, value2, "analysis");
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Long value) {
            addCriterion("ORDER_NUMBER =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Long value) {
            addCriterion("ORDER_NUMBER <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Long value) {
            addCriterion("ORDER_NUMBER >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("ORDER_NUMBER >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Long value) {
            addCriterion("ORDER_NUMBER <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Long value) {
            addCriterion("ORDER_NUMBER <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Long> values) {
            addCriterion("ORDER_NUMBER in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Long> values) {
            addCriterion("ORDER_NUMBER not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Long value1, Long value2) {
            addCriterion("ORDER_NUMBER between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Long value1, Long value2) {
            addCriterion("ORDER_NUMBER not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNull() {
            addCriterion("RESULT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andResultTypeIsNotNull() {
            addCriterion("RESULT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResultTypeEqualTo(String value) {
            addCriterion("RESULT_TYPE =", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotEqualTo(String value) {
            addCriterion("RESULT_TYPE <>", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThan(String value) {
            addCriterion("RESULT_TYPE >", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_TYPE >=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThan(String value) {
            addCriterion("RESULT_TYPE <", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLessThanOrEqualTo(String value) {
            addCriterion("RESULT_TYPE <=", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeLike(String value) {
            addCriterion("RESULT_TYPE like", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotLike(String value) {
            addCriterion("RESULT_TYPE not like", value, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeIn(List<String> values) {
            addCriterion("RESULT_TYPE in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotIn(List<String> values) {
            addCriterion("RESULT_TYPE not in", values, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeBetween(String value1, String value2) {
            addCriterion("RESULT_TYPE between", value1, value2, "resultType");
            return (Criteria) this;
        }

        public Criteria andResultTypeNotBetween(String value1, String value2) {
            addCriterion("RESULT_TYPE not between", value1, value2, "resultType");
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

        public Criteria andMinimumIsNull() {
            addCriterion("MINIMUM is null");
            return (Criteria) this;
        }

        public Criteria andMinimumIsNotNull() {
            addCriterion("MINIMUM is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumEqualTo(String value) {
            addCriterion("MINIMUM =", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotEqualTo(String value) {
            addCriterion("MINIMUM <>", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumGreaterThan(String value) {
            addCriterion("MINIMUM >", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumGreaterThanOrEqualTo(String value) {
            addCriterion("MINIMUM >=", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumLessThan(String value) {
            addCriterion("MINIMUM <", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumLessThanOrEqualTo(String value) {
            addCriterion("MINIMUM <=", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumLike(String value) {
            addCriterion("MINIMUM like", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotLike(String value) {
            addCriterion("MINIMUM not like", value, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumIn(List<String> values) {
            addCriterion("MINIMUM in", values, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotIn(List<String> values) {
            addCriterion("MINIMUM not in", values, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumBetween(String value1, String value2) {
            addCriterion("MINIMUM between", value1, value2, "minimum");
            return (Criteria) this;
        }

        public Criteria andMinimumNotBetween(String value1, String value2) {
            addCriterion("MINIMUM not between", value1, value2, "minimum");
            return (Criteria) this;
        }

        public Criteria andMaximumIsNull() {
            addCriterion("MAXIMUM is null");
            return (Criteria) this;
        }

        public Criteria andMaximumIsNotNull() {
            addCriterion("MAXIMUM is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumEqualTo(String value) {
            addCriterion("MAXIMUM =", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotEqualTo(String value) {
            addCriterion("MAXIMUM <>", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumGreaterThan(String value) {
            addCriterion("MAXIMUM >", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumGreaterThanOrEqualTo(String value) {
            addCriterion("MAXIMUM >=", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumLessThan(String value) {
            addCriterion("MAXIMUM <", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumLessThanOrEqualTo(String value) {
            addCriterion("MAXIMUM <=", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumLike(String value) {
            addCriterion("MAXIMUM like", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotLike(String value) {
            addCriterion("MAXIMUM not like", value, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumIn(List<String> values) {
            addCriterion("MAXIMUM in", values, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotIn(List<String> values) {
            addCriterion("MAXIMUM not in", values, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumBetween(String value1, String value2) {
            addCriterion("MAXIMUM between", value1, value2, "maximum");
            return (Criteria) this;
        }

        public Criteria andMaximumNotBetween(String value1, String value2) {
            addCriterion("MAXIMUM not between", value1, value2, "maximum");
            return (Criteria) this;
        }

        public Criteria andAllowOutIsNull() {
            addCriterion("ALLOW_OUT is null");
            return (Criteria) this;
        }

        public Criteria andAllowOutIsNotNull() {
            addCriterion("ALLOW_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andAllowOutEqualTo(String value) {
            addCriterion("ALLOW_OUT =", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutNotEqualTo(String value) {
            addCriterion("ALLOW_OUT <>", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutGreaterThan(String value) {
            addCriterion("ALLOW_OUT >", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_OUT >=", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutLessThan(String value) {
            addCriterion("ALLOW_OUT <", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_OUT <=", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutLike(String value) {
            addCriterion("ALLOW_OUT like", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutNotLike(String value) {
            addCriterion("ALLOW_OUT not like", value, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutIn(List<String> values) {
            addCriterion("ALLOW_OUT in", values, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutNotIn(List<String> values) {
            addCriterion("ALLOW_OUT not in", values, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutBetween(String value1, String value2) {
            addCriterion("ALLOW_OUT between", value1, value2, "allowOut");
            return (Criteria) this;
        }

        public Criteria andAllowOutNotBetween(String value1, String value2) {
            addCriterion("ALLOW_OUT not between", value1, value2, "allowOut");
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

        public Criteria andNumReplicatesIsNull() {
            addCriterion("NUM_REPLICATES is null");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesIsNotNull() {
            addCriterion("NUM_REPLICATES is not null");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesEqualTo(Long value) {
            addCriterion("NUM_REPLICATES =", value, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesNotEqualTo(Long value) {
            addCriterion("NUM_REPLICATES <>", value, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesGreaterThan(Long value) {
            addCriterion("NUM_REPLICATES >", value, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_REPLICATES >=", value, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesLessThan(Long value) {
            addCriterion("NUM_REPLICATES <", value, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesLessThanOrEqualTo(Long value) {
            addCriterion("NUM_REPLICATES <=", value, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesIn(List<Long> values) {
            addCriterion("NUM_REPLICATES in", values, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesNotIn(List<Long> values) {
            addCriterion("NUM_REPLICATES not in", values, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesBetween(Long value1, Long value2) {
            addCriterion("NUM_REPLICATES between", value1, value2, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andNumReplicatesNotBetween(Long value1, Long value2) {
            addCriterion("NUM_REPLICATES not between", value1, value2, "numReplicates");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentIsNull() {
            addCriterion("USES_INSTRUMENT is null");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentIsNotNull() {
            addCriterion("USES_INSTRUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentEqualTo(String value) {
            addCriterion("USES_INSTRUMENT =", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentNotEqualTo(String value) {
            addCriterion("USES_INSTRUMENT <>", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentGreaterThan(String value) {
            addCriterion("USES_INSTRUMENT >", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentGreaterThanOrEqualTo(String value) {
            addCriterion("USES_INSTRUMENT >=", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentLessThan(String value) {
            addCriterion("USES_INSTRUMENT <", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentLessThanOrEqualTo(String value) {
            addCriterion("USES_INSTRUMENT <=", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentLike(String value) {
            addCriterion("USES_INSTRUMENT like", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentNotLike(String value) {
            addCriterion("USES_INSTRUMENT not like", value, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentIn(List<String> values) {
            addCriterion("USES_INSTRUMENT in", values, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentNotIn(List<String> values) {
            addCriterion("USES_INSTRUMENT not in", values, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentBetween(String value1, String value2) {
            addCriterion("USES_INSTRUMENT between", value1, value2, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesInstrumentNotBetween(String value1, String value2) {
            addCriterion("USES_INSTRUMENT not between", value1, value2, "usesInstrument");
            return (Criteria) this;
        }

        public Criteria andUsesCodesIsNull() {
            addCriterion("USES_CODES is null");
            return (Criteria) this;
        }

        public Criteria andUsesCodesIsNotNull() {
            addCriterion("USES_CODES is not null");
            return (Criteria) this;
        }

        public Criteria andUsesCodesEqualTo(String value) {
            addCriterion("USES_CODES =", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesNotEqualTo(String value) {
            addCriterion("USES_CODES <>", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesGreaterThan(String value) {
            addCriterion("USES_CODES >", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesGreaterThanOrEqualTo(String value) {
            addCriterion("USES_CODES >=", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesLessThan(String value) {
            addCriterion("USES_CODES <", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesLessThanOrEqualTo(String value) {
            addCriterion("USES_CODES <=", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesLike(String value) {
            addCriterion("USES_CODES like", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesNotLike(String value) {
            addCriterion("USES_CODES not like", value, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesIn(List<String> values) {
            addCriterion("USES_CODES in", values, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesNotIn(List<String> values) {
            addCriterion("USES_CODES not in", values, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesBetween(String value1, String value2) {
            addCriterion("USES_CODES between", value1, value2, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andUsesCodesNotBetween(String value1, String value2) {
            addCriterion("USES_CODES not between", value1, value2, "usesCodes");
            return (Criteria) this;
        }

        public Criteria andAutoCalcIsNull() {
            addCriterion("AUTO_CALC is null");
            return (Criteria) this;
        }

        public Criteria andAutoCalcIsNotNull() {
            addCriterion("AUTO_CALC is not null");
            return (Criteria) this;
        }

        public Criteria andAutoCalcEqualTo(String value) {
            addCriterion("AUTO_CALC =", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcNotEqualTo(String value) {
            addCriterion("AUTO_CALC <>", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcGreaterThan(String value) {
            addCriterion("AUTO_CALC >", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_CALC >=", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcLessThan(String value) {
            addCriterion("AUTO_CALC <", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcLessThanOrEqualTo(String value) {
            addCriterion("AUTO_CALC <=", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcLike(String value) {
            addCriterion("AUTO_CALC like", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcNotLike(String value) {
            addCriterion("AUTO_CALC not like", value, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcIn(List<String> values) {
            addCriterion("AUTO_CALC in", values, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcNotIn(List<String> values) {
            addCriterion("AUTO_CALC not in", values, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcBetween(String value1, String value2) {
            addCriterion("AUTO_CALC between", value1, value2, "autoCalc");
            return (Criteria) this;
        }

        public Criteria andAutoCalcNotBetween(String value1, String value2) {
            addCriterion("AUTO_CALC not between", value1, value2, "autoCalc");
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

        public Criteria andAllowCancelIsNull() {
            addCriterion("ALLOW_CANCEL is null");
            return (Criteria) this;
        }

        public Criteria andAllowCancelIsNotNull() {
            addCriterion("ALLOW_CANCEL is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCancelEqualTo(String value) {
            addCriterion("ALLOW_CANCEL =", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelNotEqualTo(String value) {
            addCriterion("ALLOW_CANCEL <>", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelGreaterThan(String value) {
            addCriterion("ALLOW_CANCEL >", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOW_CANCEL >=", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelLessThan(String value) {
            addCriterion("ALLOW_CANCEL <", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelLessThanOrEqualTo(String value) {
            addCriterion("ALLOW_CANCEL <=", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelLike(String value) {
            addCriterion("ALLOW_CANCEL like", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelNotLike(String value) {
            addCriterion("ALLOW_CANCEL not like", value, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelIn(List<String> values) {
            addCriterion("ALLOW_CANCEL in", values, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelNotIn(List<String> values) {
            addCriterion("ALLOW_CANCEL not in", values, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelBetween(String value1, String value2) {
            addCriterion("ALLOW_CANCEL between", value1, value2, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andAllowCancelNotBetween(String value1, String value2) {
            addCriterion("ALLOW_CANCEL not between", value1, value2, "allowCancel");
            return (Criteria) this;
        }

        public Criteria andCasNumberIsNull() {
            addCriterion("CAS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCasNumberIsNotNull() {
            addCriterion("CAS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCasNumberEqualTo(String value) {
            addCriterion("CAS_NUMBER =", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberNotEqualTo(String value) {
            addCriterion("CAS_NUMBER <>", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberGreaterThan(String value) {
            addCriterion("CAS_NUMBER >", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CAS_NUMBER >=", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberLessThan(String value) {
            addCriterion("CAS_NUMBER <", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberLessThanOrEqualTo(String value) {
            addCriterion("CAS_NUMBER <=", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberLike(String value) {
            addCriterion("CAS_NUMBER like", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberNotLike(String value) {
            addCriterion("CAS_NUMBER not like", value, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberIn(List<String> values) {
            addCriterion("CAS_NUMBER in", values, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberNotIn(List<String> values) {
            addCriterion("CAS_NUMBER not in", values, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberBetween(String value1, String value2) {
            addCriterion("CAS_NUMBER between", value1, value2, "casNumber");
            return (Criteria) this;
        }

        public Criteria andCasNumberNotBetween(String value1, String value2) {
            addCriterion("CAS_NUMBER not between", value1, value2, "casNumber");
            return (Criteria) this;
        }

        public Criteria andAliasNameIsNull() {
            addCriterion("ALIAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAliasNameIsNotNull() {
            addCriterion("ALIAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAliasNameEqualTo(String value) {
            addCriterion("ALIAS_NAME =", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotEqualTo(String value) {
            addCriterion("ALIAS_NAME <>", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameGreaterThan(String value) {
            addCriterion("ALIAS_NAME >", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("ALIAS_NAME >=", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLessThan(String value) {
            addCriterion("ALIAS_NAME <", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLessThanOrEqualTo(String value) {
            addCriterion("ALIAS_NAME <=", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLike(String value) {
            addCriterion("ALIAS_NAME like", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotLike(String value) {
            addCriterion("ALIAS_NAME not like", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameIn(List<String> values) {
            addCriterion("ALIAS_NAME in", values, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotIn(List<String> values) {
            addCriterion("ALIAS_NAME not in", values, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameBetween(String value1, String value2) {
            addCriterion("ALIAS_NAME between", value1, value2, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotBetween(String value1, String value2) {
            addCriterion("ALIAS_NAME not between", value1, value2, "aliasName");
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

        public Criteria andClampLowIsNull() {
            addCriterion("CLAMP_LOW is null");
            return (Criteria) this;
        }

        public Criteria andClampLowIsNotNull() {
            addCriterion("CLAMP_LOW is not null");
            return (Criteria) this;
        }

        public Criteria andClampLowEqualTo(String value) {
            addCriterion("CLAMP_LOW =", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowNotEqualTo(String value) {
            addCriterion("CLAMP_LOW <>", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowGreaterThan(String value) {
            addCriterion("CLAMP_LOW >", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowGreaterThanOrEqualTo(String value) {
            addCriterion("CLAMP_LOW >=", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowLessThan(String value) {
            addCriterion("CLAMP_LOW <", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowLessThanOrEqualTo(String value) {
            addCriterion("CLAMP_LOW <=", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowLike(String value) {
            addCriterion("CLAMP_LOW like", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowNotLike(String value) {
            addCriterion("CLAMP_LOW not like", value, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowIn(List<String> values) {
            addCriterion("CLAMP_LOW in", values, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowNotIn(List<String> values) {
            addCriterion("CLAMP_LOW not in", values, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowBetween(String value1, String value2) {
            addCriterion("CLAMP_LOW between", value1, value2, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampLowNotBetween(String value1, String value2) {
            addCriterion("CLAMP_LOW not between", value1, value2, "clampLow");
            return (Criteria) this;
        }

        public Criteria andClampHighIsNull() {
            addCriterion("CLAMP_HIGH is null");
            return (Criteria) this;
        }

        public Criteria andClampHighIsNotNull() {
            addCriterion("CLAMP_HIGH is not null");
            return (Criteria) this;
        }

        public Criteria andClampHighEqualTo(String value) {
            addCriterion("CLAMP_HIGH =", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighNotEqualTo(String value) {
            addCriterion("CLAMP_HIGH <>", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighGreaterThan(String value) {
            addCriterion("CLAMP_HIGH >", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighGreaterThanOrEqualTo(String value) {
            addCriterion("CLAMP_HIGH >=", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighLessThan(String value) {
            addCriterion("CLAMP_HIGH <", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighLessThanOrEqualTo(String value) {
            addCriterion("CLAMP_HIGH <=", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighLike(String value) {
            addCriterion("CLAMP_HIGH like", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighNotLike(String value) {
            addCriterion("CLAMP_HIGH not like", value, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighIn(List<String> values) {
            addCriterion("CLAMP_HIGH in", values, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighNotIn(List<String> values) {
            addCriterion("CLAMP_HIGH not in", values, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighBetween(String value1, String value2) {
            addCriterion("CLAMP_HIGH between", value1, value2, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andClampHighNotBetween(String value1, String value2) {
            addCriterion("CLAMP_HIGH not between", value1, value2, "clampHigh");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateIsNull() {
            addCriterion("STD_REAG_TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateIsNotNull() {
            addCriterion("STD_REAG_TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateEqualTo(String value) {
            addCriterion("STD_REAG_TEMPLATE =", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateNotEqualTo(String value) {
            addCriterion("STD_REAG_TEMPLATE <>", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateGreaterThan(String value) {
            addCriterion("STD_REAG_TEMPLATE >", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("STD_REAG_TEMPLATE >=", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateLessThan(String value) {
            addCriterion("STD_REAG_TEMPLATE <", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateLessThanOrEqualTo(String value) {
            addCriterion("STD_REAG_TEMPLATE <=", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateLike(String value) {
            addCriterion("STD_REAG_TEMPLATE like", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateNotLike(String value) {
            addCriterion("STD_REAG_TEMPLATE not like", value, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateIn(List<String> values) {
            addCriterion("STD_REAG_TEMPLATE in", values, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateNotIn(List<String> values) {
            addCriterion("STD_REAG_TEMPLATE not in", values, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateBetween(String value1, String value2) {
            addCriterion("STD_REAG_TEMPLATE between", value1, value2, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andStdReagTemplateNotBetween(String value1, String value2) {
            addCriterion("STD_REAG_TEMPLATE not between", value1, value2, "stdReagTemplate");
            return (Criteria) this;
        }

        public Criteria andHasAttributesIsNull() {
            addCriterion("HAS_ATTRIBUTES is null");
            return (Criteria) this;
        }

        public Criteria andHasAttributesIsNotNull() {
            addCriterion("HAS_ATTRIBUTES is not null");
            return (Criteria) this;
        }

        public Criteria andHasAttributesEqualTo(String value) {
            addCriterion("HAS_ATTRIBUTES =", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesNotEqualTo(String value) {
            addCriterion("HAS_ATTRIBUTES <>", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesGreaterThan(String value) {
            addCriterion("HAS_ATTRIBUTES >", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_ATTRIBUTES >=", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesLessThan(String value) {
            addCriterion("HAS_ATTRIBUTES <", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesLessThanOrEqualTo(String value) {
            addCriterion("HAS_ATTRIBUTES <=", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesLike(String value) {
            addCriterion("HAS_ATTRIBUTES like", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesNotLike(String value) {
            addCriterion("HAS_ATTRIBUTES not like", value, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesIn(List<String> values) {
            addCriterion("HAS_ATTRIBUTES in", values, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesNotIn(List<String> values) {
            addCriterion("HAS_ATTRIBUTES not in", values, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesBetween(String value1, String value2) {
            addCriterion("HAS_ATTRIBUTES between", value1, value2, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andHasAttributesNotBetween(String value1, String value2) {
            addCriterion("HAS_ATTRIBUTES not between", value1, value2, "hasAttributes");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationIsNull() {
            addCriterion("FORMAT_CALCULATION is null");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationIsNotNull() {
            addCriterion("FORMAT_CALCULATION is not null");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationEqualTo(String value) {
            addCriterion("FORMAT_CALCULATION =", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationNotEqualTo(String value) {
            addCriterion("FORMAT_CALCULATION <>", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationGreaterThan(String value) {
            addCriterion("FORMAT_CALCULATION >", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationGreaterThanOrEqualTo(String value) {
            addCriterion("FORMAT_CALCULATION >=", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationLessThan(String value) {
            addCriterion("FORMAT_CALCULATION <", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationLessThanOrEqualTo(String value) {
            addCriterion("FORMAT_CALCULATION <=", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationLike(String value) {
            addCriterion("FORMAT_CALCULATION like", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationNotLike(String value) {
            addCriterion("FORMAT_CALCULATION not like", value, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationIn(List<String> values) {
            addCriterion("FORMAT_CALCULATION in", values, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationNotIn(List<String> values) {
            addCriterion("FORMAT_CALCULATION not in", values, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationBetween(String value1, String value2) {
            addCriterion("FORMAT_CALCULATION between", value1, value2, "formatCalculation");
            return (Criteria) this;
        }

        public Criteria andFormatCalculationNotBetween(String value1, String value2) {
            addCriterion("FORMAT_CALCULATION not between", value1, value2, "formatCalculation");
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

        public Criteria andVersionFilesIsNull() {
            addCriterion("VERSION_FILES is null");
            return (Criteria) this;
        }

        public Criteria andVersionFilesIsNotNull() {
            addCriterion("VERSION_FILES is not null");
            return (Criteria) this;
        }

        public Criteria andVersionFilesEqualTo(String value) {
            addCriterion("VERSION_FILES =", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesNotEqualTo(String value) {
            addCriterion("VERSION_FILES <>", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesGreaterThan(String value) {
            addCriterion("VERSION_FILES >", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION_FILES >=", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesLessThan(String value) {
            addCriterion("VERSION_FILES <", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesLessThanOrEqualTo(String value) {
            addCriterion("VERSION_FILES <=", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesLike(String value) {
            addCriterion("VERSION_FILES like", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesNotLike(String value) {
            addCriterion("VERSION_FILES not like", value, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesIn(List<String> values) {
            addCriterion("VERSION_FILES in", values, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesNotIn(List<String> values) {
            addCriterion("VERSION_FILES not in", values, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesBetween(String value1, String value2) {
            addCriterion("VERSION_FILES between", value1, value2, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andVersionFilesNotBetween(String value1, String value2) {
            addCriterion("VERSION_FILES not between", value1, value2, "versionFiles");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineIsNull() {
            addCriterion("BROWSE_SUBROUTINE is null");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineIsNotNull() {
            addCriterion("BROWSE_SUBROUTINE is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineEqualTo(String value) {
            addCriterion("BROWSE_SUBROUTINE =", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineNotEqualTo(String value) {
            addCriterion("BROWSE_SUBROUTINE <>", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineGreaterThan(String value) {
            addCriterion("BROWSE_SUBROUTINE >", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSE_SUBROUTINE >=", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineLessThan(String value) {
            addCriterion("BROWSE_SUBROUTINE <", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineLessThanOrEqualTo(String value) {
            addCriterion("BROWSE_SUBROUTINE <=", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineLike(String value) {
            addCriterion("BROWSE_SUBROUTINE like", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineNotLike(String value) {
            addCriterion("BROWSE_SUBROUTINE not like", value, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineIn(List<String> values) {
            addCriterion("BROWSE_SUBROUTINE in", values, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineNotIn(List<String> values) {
            addCriterion("BROWSE_SUBROUTINE not in", values, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineBetween(String value1, String value2) {
            addCriterion("BROWSE_SUBROUTINE between", value1, value2, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andBrowseSubroutineNotBetween(String value1, String value2) {
            addCriterion("BROWSE_SUBROUTINE not between", value1, value2, "browseSubroutine");
            return (Criteria) this;
        }

        public Criteria andStepIsNull() {
            addCriterion("STEP is null");
            return (Criteria) this;
        }

        public Criteria andStepIsNotNull() {
            addCriterion("STEP is not null");
            return (Criteria) this;
        }

        public Criteria andStepEqualTo(String value) {
            addCriterion("STEP =", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotEqualTo(String value) {
            addCriterion("STEP <>", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThan(String value) {
            addCriterion("STEP >", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepGreaterThanOrEqualTo(String value) {
            addCriterion("STEP >=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThan(String value) {
            addCriterion("STEP <", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLessThanOrEqualTo(String value) {
            addCriterion("STEP <=", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepLike(String value) {
            addCriterion("STEP like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotLike(String value) {
            addCriterion("STEP not like", value, "step");
            return (Criteria) this;
        }

        public Criteria andStepIn(List<String> values) {
            addCriterion("STEP in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotIn(List<String> values) {
            addCriterion("STEP not in", values, "step");
            return (Criteria) this;
        }

        public Criteria andStepBetween(String value1, String value2) {
            addCriterion("STEP between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andStepNotBetween(String value1, String value2) {
            addCriterion("STEP not between", value1, value2, "step");
            return (Criteria) this;
        }

        public Criteria andNwaNameIsNull() {
            addCriterion("NWA_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNwaNameIsNotNull() {
            addCriterion("NWA_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNwaNameEqualTo(String value) {
            addCriterion("NWA_NAME =", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameNotEqualTo(String value) {
            addCriterion("NWA_NAME <>", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameGreaterThan(String value) {
            addCriterion("NWA_NAME >", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameGreaterThanOrEqualTo(String value) {
            addCriterion("NWA_NAME >=", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameLessThan(String value) {
            addCriterion("NWA_NAME <", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameLessThanOrEqualTo(String value) {
            addCriterion("NWA_NAME <=", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameLike(String value) {
            addCriterion("NWA_NAME like", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameNotLike(String value) {
            addCriterion("NWA_NAME not like", value, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameIn(List<String> values) {
            addCriterion("NWA_NAME in", values, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameNotIn(List<String> values) {
            addCriterion("NWA_NAME not in", values, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameBetween(String value1, String value2) {
            addCriterion("NWA_NAME between", value1, value2, "nwaName");
            return (Criteria) this;
        }

        public Criteria andNwaNameNotBetween(String value1, String value2) {
            addCriterion("NWA_NAME not between", value1, value2, "nwaName");
            return (Criteria) this;
        }

        public Criteria andPlaces2IsNull() {
            addCriterion("PLACES_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlaces2IsNotNull() {
            addCriterion("PLACES_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlaces2EqualTo(Long value) {
            addCriterion("PLACES_2 =", value, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2NotEqualTo(Long value) {
            addCriterion("PLACES_2 <>", value, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2GreaterThan(Long value) {
            addCriterion("PLACES_2 >", value, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2GreaterThanOrEqualTo(Long value) {
            addCriterion("PLACES_2 >=", value, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2LessThan(Long value) {
            addCriterion("PLACES_2 <", value, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2LessThanOrEqualTo(Long value) {
            addCriterion("PLACES_2 <=", value, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2In(List<Long> values) {
            addCriterion("PLACES_2 in", values, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2NotIn(List<Long> values) {
            addCriterion("PLACES_2 not in", values, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2Between(Long value1, Long value2) {
            addCriterion("PLACES_2 between", value1, value2, "places2");
            return (Criteria) this;
        }

        public Criteria andPlaces2NotBetween(Long value1, Long value2) {
            addCriterion("PLACES_2 not between", value1, value2, "places2");
            return (Criteria) this;
        }

        public Criteria andReportedResultIsNull() {
            addCriterion("REPORTED_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andReportedResultIsNotNull() {
            addCriterion("REPORTED_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andReportedResultEqualTo(String value) {
            addCriterion("REPORTED_RESULT =", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultNotEqualTo(String value) {
            addCriterion("REPORTED_RESULT <>", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultGreaterThan(String value) {
            addCriterion("REPORTED_RESULT >", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTED_RESULT >=", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultLessThan(String value) {
            addCriterion("REPORTED_RESULT <", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultLessThanOrEqualTo(String value) {
            addCriterion("REPORTED_RESULT <=", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultLike(String value) {
            addCriterion("REPORTED_RESULT like", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultNotLike(String value) {
            addCriterion("REPORTED_RESULT not like", value, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultIn(List<String> values) {
            addCriterion("REPORTED_RESULT in", values, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultNotIn(List<String> values) {
            addCriterion("REPORTED_RESULT not in", values, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultBetween(String value1, String value2) {
            addCriterion("REPORTED_RESULT between", value1, value2, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andReportedResultNotBetween(String value1, String value2) {
            addCriterion("REPORTED_RESULT not between", value1, value2, "reportedResult");
            return (Criteria) this;
        }

        public Criteria andConversionTypeIsNull() {
            addCriterion("CONVERSION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andConversionTypeIsNotNull() {
            addCriterion("CONVERSION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andConversionTypeEqualTo(String value) {
            addCriterion("CONVERSION_TYPE =", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeNotEqualTo(String value) {
            addCriterion("CONVERSION_TYPE <>", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeGreaterThan(String value) {
            addCriterion("CONVERSION_TYPE >", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONVERSION_TYPE >=", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeLessThan(String value) {
            addCriterion("CONVERSION_TYPE <", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeLessThanOrEqualTo(String value) {
            addCriterion("CONVERSION_TYPE <=", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeLike(String value) {
            addCriterion("CONVERSION_TYPE like", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeNotLike(String value) {
            addCriterion("CONVERSION_TYPE not like", value, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeIn(List<String> values) {
            addCriterion("CONVERSION_TYPE in", values, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeNotIn(List<String> values) {
            addCriterion("CONVERSION_TYPE not in", values, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeBetween(String value1, String value2) {
            addCriterion("CONVERSION_TYPE between", value1, value2, "conversionType");
            return (Criteria) this;
        }

        public Criteria andConversionTypeNotBetween(String value1, String value2) {
            addCriterion("CONVERSION_TYPE not between", value1, value2, "conversionType");
            return (Criteria) this;
        }

        public Criteria andFromCategoryIsNull() {
            addCriterion("FROM_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andFromCategoryIsNotNull() {
            addCriterion("FROM_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andFromCategoryEqualTo(String value) {
            addCriterion("FROM_CATEGORY =", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryNotEqualTo(String value) {
            addCriterion("FROM_CATEGORY <>", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryGreaterThan(String value) {
            addCriterion("FROM_CATEGORY >", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_CATEGORY >=", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryLessThan(String value) {
            addCriterion("FROM_CATEGORY <", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryLessThanOrEqualTo(String value) {
            addCriterion("FROM_CATEGORY <=", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryLike(String value) {
            addCriterion("FROM_CATEGORY like", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryNotLike(String value) {
            addCriterion("FROM_CATEGORY not like", value, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryIn(List<String> values) {
            addCriterion("FROM_CATEGORY in", values, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryNotIn(List<String> values) {
            addCriterion("FROM_CATEGORY not in", values, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryBetween(String value1, String value2) {
            addCriterion("FROM_CATEGORY between", value1, value2, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andFromCategoryNotBetween(String value1, String value2) {
            addCriterion("FROM_CATEGORY not between", value1, value2, "fromCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryIsNull() {
            addCriterion("TO_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andToCategoryIsNotNull() {
            addCriterion("TO_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andToCategoryEqualTo(String value) {
            addCriterion("TO_CATEGORY =", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryNotEqualTo(String value) {
            addCriterion("TO_CATEGORY <>", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryGreaterThan(String value) {
            addCriterion("TO_CATEGORY >", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("TO_CATEGORY >=", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryLessThan(String value) {
            addCriterion("TO_CATEGORY <", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryLessThanOrEqualTo(String value) {
            addCriterion("TO_CATEGORY <=", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryLike(String value) {
            addCriterion("TO_CATEGORY like", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryNotLike(String value) {
            addCriterion("TO_CATEGORY not like", value, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryIn(List<String> values) {
            addCriterion("TO_CATEGORY in", values, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryNotIn(List<String> values) {
            addCriterion("TO_CATEGORY not in", values, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryBetween(String value1, String value2) {
            addCriterion("TO_CATEGORY between", value1, value2, "toCategory");
            return (Criteria) this;
        }

        public Criteria andToCategoryNotBetween(String value1, String value2) {
            addCriterion("TO_CATEGORY not between", value1, value2, "toCategory");
            return (Criteria) this;
        }

        public Criteria andFromUnitsIsNull() {
            addCriterion("FROM_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andFromUnitsIsNotNull() {
            addCriterion("FROM_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andFromUnitsEqualTo(String value) {
            addCriterion("FROM_UNITS =", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsNotEqualTo(String value) {
            addCriterion("FROM_UNITS <>", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsGreaterThan(String value) {
            addCriterion("FROM_UNITS >", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_UNITS >=", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsLessThan(String value) {
            addCriterion("FROM_UNITS <", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsLessThanOrEqualTo(String value) {
            addCriterion("FROM_UNITS <=", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsLike(String value) {
            addCriterion("FROM_UNITS like", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsNotLike(String value) {
            addCriterion("FROM_UNITS not like", value, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsIn(List<String> values) {
            addCriterion("FROM_UNITS in", values, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsNotIn(List<String> values) {
            addCriterion("FROM_UNITS not in", values, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsBetween(String value1, String value2) {
            addCriterion("FROM_UNITS between", value1, value2, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andFromUnitsNotBetween(String value1, String value2) {
            addCriterion("FROM_UNITS not between", value1, value2, "fromUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsIsNull() {
            addCriterion("TO_UNITS is null");
            return (Criteria) this;
        }

        public Criteria andToUnitsIsNotNull() {
            addCriterion("TO_UNITS is not null");
            return (Criteria) this;
        }

        public Criteria andToUnitsEqualTo(String value) {
            addCriterion("TO_UNITS =", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsNotEqualTo(String value) {
            addCriterion("TO_UNITS <>", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsGreaterThan(String value) {
            addCriterion("TO_UNITS >", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsGreaterThanOrEqualTo(String value) {
            addCriterion("TO_UNITS >=", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsLessThan(String value) {
            addCriterion("TO_UNITS <", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsLessThanOrEqualTo(String value) {
            addCriterion("TO_UNITS <=", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsLike(String value) {
            addCriterion("TO_UNITS like", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsNotLike(String value) {
            addCriterion("TO_UNITS not like", value, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsIn(List<String> values) {
            addCriterion("TO_UNITS in", values, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsNotIn(List<String> values) {
            addCriterion("TO_UNITS not in", values, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsBetween(String value1, String value2) {
            addCriterion("TO_UNITS between", value1, value2, "toUnits");
            return (Criteria) this;
        }

        public Criteria andToUnitsNotBetween(String value1, String value2) {
            addCriterion("TO_UNITS not between", value1, value2, "toUnits");
            return (Criteria) this;
        }

        public Criteria andConversionFactorIsNull() {
            addCriterion("CONVERSION_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andConversionFactorIsNotNull() {
            addCriterion("CONVERSION_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andConversionFactorEqualTo(BigDecimal value) {
            addCriterion("CONVERSION_FACTOR =", value, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorNotEqualTo(BigDecimal value) {
            addCriterion("CONVERSION_FACTOR <>", value, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorGreaterThan(BigDecimal value) {
            addCriterion("CONVERSION_FACTOR >", value, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONVERSION_FACTOR >=", value, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorLessThan(BigDecimal value) {
            addCriterion("CONVERSION_FACTOR <", value, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONVERSION_FACTOR <=", value, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorIn(List<BigDecimal> values) {
            addCriterion("CONVERSION_FACTOR in", values, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorNotIn(List<BigDecimal> values) {
            addCriterion("CONVERSION_FACTOR not in", values, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONVERSION_FACTOR between", value1, value2, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andConversionFactorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONVERSION_FACTOR not between", value1, value2, "conversionFactor");
            return (Criteria) this;
        }

        public Criteria andTShortNameIsNull() {
            addCriterion("T_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTShortNameIsNotNull() {
            addCriterion("T_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTShortNameEqualTo(String value) {
            addCriterion("T_SHORT_NAME =", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameNotEqualTo(String value) {
            addCriterion("T_SHORT_NAME <>", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameGreaterThan(String value) {
            addCriterion("T_SHORT_NAME >", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("T_SHORT_NAME >=", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameLessThan(String value) {
            addCriterion("T_SHORT_NAME <", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameLessThanOrEqualTo(String value) {
            addCriterion("T_SHORT_NAME <=", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameLike(String value) {
            addCriterion("T_SHORT_NAME like", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameNotLike(String value) {
            addCriterion("T_SHORT_NAME not like", value, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameIn(List<String> values) {
            addCriterion("T_SHORT_NAME in", values, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameNotIn(List<String> values) {
            addCriterion("T_SHORT_NAME not in", values, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameBetween(String value1, String value2) {
            addCriterion("T_SHORT_NAME between", value1, value2, "tShortName");
            return (Criteria) this;
        }

        public Criteria andTShortNameNotBetween(String value1, String value2) {
            addCriterion("T_SHORT_NAME not between", value1, value2, "tShortName");
            return (Criteria) this;
        }

        public Criteria andCContactTypeIsNull() {
            addCriterion("C_CONTACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCContactTypeIsNotNull() {
            addCriterion("C_CONTACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCContactTypeEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE =", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE <>", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeGreaterThan(String value) {
            addCriterion("C_CONTACT_TYPE >", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE >=", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeLessThan(String value) {
            addCriterion("C_CONTACT_TYPE <", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeLessThanOrEqualTo(String value) {
            addCriterion("C_CONTACT_TYPE <=", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeLike(String value) {
            addCriterion("C_CONTACT_TYPE like", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotLike(String value) {
            addCriterion("C_CONTACT_TYPE not like", value, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeIn(List<String> values) {
            addCriterion("C_CONTACT_TYPE in", values, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotIn(List<String> values) {
            addCriterion("C_CONTACT_TYPE not in", values, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeBetween(String value1, String value2) {
            addCriterion("C_CONTACT_TYPE between", value1, value2, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCContactTypeNotBetween(String value1, String value2) {
            addCriterion("C_CONTACT_TYPE not between", value1, value2, "cContactType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeIsNull() {
            addCriterion("C_COIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeIsNotNull() {
            addCriterion("C_COIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeEqualTo(String value) {
            addCriterion("C_COIL_TYPE =", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeNotEqualTo(String value) {
            addCriterion("C_COIL_TYPE <>", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeGreaterThan(String value) {
            addCriterion("C_COIL_TYPE >", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_COIL_TYPE >=", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeLessThan(String value) {
            addCriterion("C_COIL_TYPE <", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeLessThanOrEqualTo(String value) {
            addCriterion("C_COIL_TYPE <=", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeLike(String value) {
            addCriterion("C_COIL_TYPE like", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeNotLike(String value) {
            addCriterion("C_COIL_TYPE not like", value, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeIn(List<String> values) {
            addCriterion("C_COIL_TYPE in", values, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeNotIn(List<String> values) {
            addCriterion("C_COIL_TYPE not in", values, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeBetween(String value1, String value2) {
            addCriterion("C_COIL_TYPE between", value1, value2, "cCoilType");
            return (Criteria) this;
        }

        public Criteria andCCoilTypeNotBetween(String value1, String value2) {
            addCriterion("C_COIL_TYPE not between", value1, value2, "cCoilType");
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

        public Criteria andReportedNameIsNull() {
            addCriterion("REPORTED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportedNameIsNotNull() {
            addCriterion("REPORTED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportedNameEqualTo(String value) {
            addCriterion("REPORTED_NAME =", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameNotEqualTo(String value) {
            addCriterion("REPORTED_NAME <>", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameGreaterThan(String value) {
            addCriterion("REPORTED_NAME >", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTED_NAME >=", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameLessThan(String value) {
            addCriterion("REPORTED_NAME <", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameLessThanOrEqualTo(String value) {
            addCriterion("REPORTED_NAME <=", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameLike(String value) {
            addCriterion("REPORTED_NAME like", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameNotLike(String value) {
            addCriterion("REPORTED_NAME not like", value, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameIn(List<String> values) {
            addCriterion("REPORTED_NAME in", values, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameNotIn(List<String> values) {
            addCriterion("REPORTED_NAME not in", values, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameBetween(String value1, String value2) {
            addCriterion("REPORTED_NAME between", value1, value2, "reportedName");
            return (Criteria) this;
        }

        public Criteria andReportedNameNotBetween(String value1, String value2) {
            addCriterion("REPORTED_NAME not between", value1, value2, "reportedName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameIsNull() {
            addCriterion("C_ALIAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAliasNameIsNotNull() {
            addCriterion("C_ALIAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAliasNameEqualTo(String value) {
            addCriterion("C_ALIAS_NAME =", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameNotEqualTo(String value) {
            addCriterion("C_ALIAS_NAME <>", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameGreaterThan(String value) {
            addCriterion("C_ALIAS_NAME >", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ALIAS_NAME >=", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameLessThan(String value) {
            addCriterion("C_ALIAS_NAME <", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameLessThanOrEqualTo(String value) {
            addCriterion("C_ALIAS_NAME <=", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameLike(String value) {
            addCriterion("C_ALIAS_NAME like", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameNotLike(String value) {
            addCriterion("C_ALIAS_NAME not like", value, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameIn(List<String> values) {
            addCriterion("C_ALIAS_NAME in", values, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameNotIn(List<String> values) {
            addCriterion("C_ALIAS_NAME not in", values, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameBetween(String value1, String value2) {
            addCriterion("C_ALIAS_NAME between", value1, value2, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCAliasNameNotBetween(String value1, String value2) {
            addCriterion("C_ALIAS_NAME not between", value1, value2, "cAliasName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameIsNull() {
            addCriterion("C_UPDATE_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameIsNotNull() {
            addCriterion("C_UPDATE_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameEqualTo(String value) {
            addCriterion("C_UPDATE_EN_NAME =", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameNotEqualTo(String value) {
            addCriterion("C_UPDATE_EN_NAME <>", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameGreaterThan(String value) {
            addCriterion("C_UPDATE_EN_NAME >", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_UPDATE_EN_NAME >=", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameLessThan(String value) {
            addCriterion("C_UPDATE_EN_NAME <", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameLessThanOrEqualTo(String value) {
            addCriterion("C_UPDATE_EN_NAME <=", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameLike(String value) {
            addCriterion("C_UPDATE_EN_NAME like", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameNotLike(String value) {
            addCriterion("C_UPDATE_EN_NAME not like", value, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameIn(List<String> values) {
            addCriterion("C_UPDATE_EN_NAME in", values, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameNotIn(List<String> values) {
            addCriterion("C_UPDATE_EN_NAME not in", values, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameBetween(String value1, String value2) {
            addCriterion("C_UPDATE_EN_NAME between", value1, value2, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCUpdateEnNameNotBetween(String value1, String value2) {
            addCriterion("C_UPDATE_EN_NAME not between", value1, value2, "cUpdateEnName");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureIsNull() {
            addCriterion("C_DETAILDED_FAILURE is null");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureIsNotNull() {
            addCriterion("C_DETAILDED_FAILURE is not null");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureEqualTo(String value) {
            addCriterion("C_DETAILDED_FAILURE =", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureNotEqualTo(String value) {
            addCriterion("C_DETAILDED_FAILURE <>", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureGreaterThan(String value) {
            addCriterion("C_DETAILDED_FAILURE >", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureGreaterThanOrEqualTo(String value) {
            addCriterion("C_DETAILDED_FAILURE >=", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureLessThan(String value) {
            addCriterion("C_DETAILDED_FAILURE <", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureLessThanOrEqualTo(String value) {
            addCriterion("C_DETAILDED_FAILURE <=", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureLike(String value) {
            addCriterion("C_DETAILDED_FAILURE like", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureNotLike(String value) {
            addCriterion("C_DETAILDED_FAILURE not like", value, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureIn(List<String> values) {
            addCriterion("C_DETAILDED_FAILURE in", values, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureNotIn(List<String> values) {
            addCriterion("C_DETAILDED_FAILURE not in", values, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureBetween(String value1, String value2) {
            addCriterion("C_DETAILDED_FAILURE between", value1, value2, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCDetaildedFailureNotBetween(String value1, String value2) {
            addCriterion("C_DETAILDED_FAILURE not between", value1, value2, "cDetaildedFailure");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyIsNull() {
            addCriterion("C_INTERFACE_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyIsNotNull() {
            addCriterion("C_INTERFACE_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyEqualTo(String value) {
            addCriterion("C_INTERFACE_KEY =", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotEqualTo(String value) {
            addCriterion("C_INTERFACE_KEY <>", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyGreaterThan(String value) {
            addCriterion("C_INTERFACE_KEY >", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("C_INTERFACE_KEY >=", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyLessThan(String value) {
            addCriterion("C_INTERFACE_KEY <", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyLessThanOrEqualTo(String value) {
            addCriterion("C_INTERFACE_KEY <=", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyLike(String value) {
            addCriterion("C_INTERFACE_KEY like", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotLike(String value) {
            addCriterion("C_INTERFACE_KEY not like", value, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyIn(List<String> values) {
            addCriterion("C_INTERFACE_KEY in", values, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotIn(List<String> values) {
            addCriterion("C_INTERFACE_KEY not in", values, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyBetween(String value1, String value2) {
            addCriterion("C_INTERFACE_KEY between", value1, value2, "cInterfaceKey");
            return (Criteria) this;
        }

        public Criteria andCInterfaceKeyNotBetween(String value1, String value2) {
            addCriterion("C_INTERFACE_KEY not between", value1, value2, "cInterfaceKey");
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