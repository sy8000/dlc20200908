package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andTestNumberIsNull() {
            addCriterion("TEST_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTestNumberIsNotNull() {
            addCriterion("TEST_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTestNumberEqualTo(Long value) {
            addCriterion("TEST_NUMBER =", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotEqualTo(Long value) {
            addCriterion("TEST_NUMBER <>", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberGreaterThan(Long value) {
            addCriterion("TEST_NUMBER >", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_NUMBER >=", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberLessThan(Long value) {
            addCriterion("TEST_NUMBER <", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberLessThanOrEqualTo(Long value) {
            addCriterion("TEST_NUMBER <=", value, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberIn(List<Long> values) {
            addCriterion("TEST_NUMBER in", values, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotIn(List<Long> values) {
            addCriterion("TEST_NUMBER not in", values, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberBetween(Long value1, Long value2) {
            addCriterion("TEST_NUMBER between", value1, value2, "testNumber");
            return (Criteria) this;
        }

        public Criteria andTestNumberNotBetween(Long value1, Long value2) {
            addCriterion("TEST_NUMBER not between", value1, value2, "testNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNull() {
            addCriterion("SAMPLE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNotNull() {
            addCriterion("SAMPLE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER =", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER <>", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThan(Long value) {
            addCriterion("SAMPLE_NUMBER >", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER >=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThan(Long value) {
            addCriterion("SAMPLE_NUMBER <", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThanOrEqualTo(Long value) {
            addCriterion("SAMPLE_NUMBER <=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIn(List<Long> values) {
            addCriterion("SAMPLE_NUMBER in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotIn(List<Long> values) {
            addCriterion("SAMPLE_NUMBER not in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_NUMBER between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotBetween(Long value1, Long value2) {
            addCriterion("SAMPLE_NUMBER not between", value1, value2, "sampleNumber");
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

        public Criteria andAnalysisCountIsNull() {
            addCriterion("ANALYSIS_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountIsNotNull() {
            addCriterion("ANALYSIS_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountEqualTo(Long value) {
            addCriterion("ANALYSIS_COUNT =", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotEqualTo(Long value) {
            addCriterion("ANALYSIS_COUNT <>", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountGreaterThan(Long value) {
            addCriterion("ANALYSIS_COUNT >", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountGreaterThanOrEqualTo(Long value) {
            addCriterion("ANALYSIS_COUNT >=", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountLessThan(Long value) {
            addCriterion("ANALYSIS_COUNT <", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountLessThanOrEqualTo(Long value) {
            addCriterion("ANALYSIS_COUNT <=", value, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountIn(List<Long> values) {
            addCriterion("ANALYSIS_COUNT in", values, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotIn(List<Long> values) {
            addCriterion("ANALYSIS_COUNT not in", values, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountBetween(Long value1, Long value2) {
            addCriterion("ANALYSIS_COUNT between", value1, value2, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andAnalysisCountNotBetween(Long value1, Long value2) {
            addCriterion("ANALYSIS_COUNT not between", value1, value2, "analysisCount");
            return (Criteria) this;
        }

        public Criteria andVariationIsNull() {
            addCriterion("VARIATION is null");
            return (Criteria) this;
        }

        public Criteria andVariationIsNotNull() {
            addCriterion("VARIATION is not null");
            return (Criteria) this;
        }

        public Criteria andVariationEqualTo(String value) {
            addCriterion("VARIATION =", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotEqualTo(String value) {
            addCriterion("VARIATION <>", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationGreaterThan(String value) {
            addCriterion("VARIATION >", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationGreaterThanOrEqualTo(String value) {
            addCriterion("VARIATION >=", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLessThan(String value) {
            addCriterion("VARIATION <", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLessThanOrEqualTo(String value) {
            addCriterion("VARIATION <=", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationLike(String value) {
            addCriterion("VARIATION like", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotLike(String value) {
            addCriterion("VARIATION not like", value, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationIn(List<String> values) {
            addCriterion("VARIATION in", values, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotIn(List<String> values) {
            addCriterion("VARIATION not in", values, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationBetween(String value1, String value2) {
            addCriterion("VARIATION between", value1, value2, "variation");
            return (Criteria) this;
        }

        public Criteria andVariationNotBetween(String value1, String value2) {
            addCriterion("VARIATION not between", value1, value2, "variation");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("GROUP_NAME =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("GROUP_NAME <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("GROUP_NAME >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("GROUP_NAME <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("GROUP_NAME like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("GROUP_NAME not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("GROUP_NAME in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("GROUP_NAME not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("GROUP_NAME between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME not between", value1, value2, "groupName");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNull() {
            addCriterion("OLD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOldStatusIsNotNull() {
            addCriterion("OLD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOldStatusEqualTo(String value) {
            addCriterion("OLD_STATUS =", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotEqualTo(String value) {
            addCriterion("OLD_STATUS <>", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThan(String value) {
            addCriterion("OLD_STATUS >", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_STATUS >=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThan(String value) {
            addCriterion("OLD_STATUS <", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLessThanOrEqualTo(String value) {
            addCriterion("OLD_STATUS <=", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusLike(String value) {
            addCriterion("OLD_STATUS like", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotLike(String value) {
            addCriterion("OLD_STATUS not like", value, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusIn(List<String> values) {
            addCriterion("OLD_STATUS in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotIn(List<String> values) {
            addCriterion("OLD_STATUS not in", values, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusBetween(String value1, String value2) {
            addCriterion("OLD_STATUS between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andOldStatusNotBetween(String value1, String value2) {
            addCriterion("OLD_STATUS not between", value1, value2, "oldStatus");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestIsNull() {
            addCriterion("BATCH_PARENT_TEST is null");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestIsNotNull() {
            addCriterion("BATCH_PARENT_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestEqualTo(Long value) {
            addCriterion("BATCH_PARENT_TEST =", value, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestNotEqualTo(Long value) {
            addCriterion("BATCH_PARENT_TEST <>", value, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestGreaterThan(Long value) {
            addCriterion("BATCH_PARENT_TEST >", value, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestGreaterThanOrEqualTo(Long value) {
            addCriterion("BATCH_PARENT_TEST >=", value, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestLessThan(Long value) {
            addCriterion("BATCH_PARENT_TEST <", value, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestLessThanOrEqualTo(Long value) {
            addCriterion("BATCH_PARENT_TEST <=", value, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestIn(List<Long> values) {
            addCriterion("BATCH_PARENT_TEST in", values, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestNotIn(List<Long> values) {
            addCriterion("BATCH_PARENT_TEST not in", values, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestBetween(Long value1, Long value2) {
            addCriterion("BATCH_PARENT_TEST between", value1, value2, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchParentTestNotBetween(Long value1, Long value2) {
            addCriterion("BATCH_PARENT_TEST not between", value1, value2, "batchParentTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestIsNull() {
            addCriterion("BATCH_SIBLING_TEST is null");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestIsNotNull() {
            addCriterion("BATCH_SIBLING_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestEqualTo(Long value) {
            addCriterion("BATCH_SIBLING_TEST =", value, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestNotEqualTo(Long value) {
            addCriterion("BATCH_SIBLING_TEST <>", value, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestGreaterThan(Long value) {
            addCriterion("BATCH_SIBLING_TEST >", value, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestGreaterThanOrEqualTo(Long value) {
            addCriterion("BATCH_SIBLING_TEST >=", value, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestLessThan(Long value) {
            addCriterion("BATCH_SIBLING_TEST <", value, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestLessThanOrEqualTo(Long value) {
            addCriterion("BATCH_SIBLING_TEST <=", value, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestIn(List<Long> values) {
            addCriterion("BATCH_SIBLING_TEST in", values, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestNotIn(List<Long> values) {
            addCriterion("BATCH_SIBLING_TEST not in", values, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestBetween(Long value1, Long value2) {
            addCriterion("BATCH_SIBLING_TEST between", value1, value2, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andBatchSiblingTestNotBetween(Long value1, Long value2) {
            addCriterion("BATCH_SIBLING_TEST not between", value1, value2, "batchSiblingTest");
            return (Criteria) this;
        }

        public Criteria andParentTestIsNull() {
            addCriterion("PARENT_TEST is null");
            return (Criteria) this;
        }

        public Criteria andParentTestIsNotNull() {
            addCriterion("PARENT_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andParentTestEqualTo(Long value) {
            addCriterion("PARENT_TEST =", value, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestNotEqualTo(Long value) {
            addCriterion("PARENT_TEST <>", value, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestGreaterThan(Long value) {
            addCriterion("PARENT_TEST >", value, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestGreaterThanOrEqualTo(Long value) {
            addCriterion("PARENT_TEST >=", value, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestLessThan(Long value) {
            addCriterion("PARENT_TEST <", value, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestLessThanOrEqualTo(Long value) {
            addCriterion("PARENT_TEST <=", value, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestIn(List<Long> values) {
            addCriterion("PARENT_TEST in", values, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestNotIn(List<Long> values) {
            addCriterion("PARENT_TEST not in", values, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestBetween(Long value1, Long value2) {
            addCriterion("PARENT_TEST between", value1, value2, "parentTest");
            return (Criteria) this;
        }

        public Criteria andParentTestNotBetween(Long value1, Long value2) {
            addCriterion("PARENT_TEST not between", value1, value2, "parentTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestIsNull() {
            addCriterion("ORIGINAL_TEST is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTestIsNotNull() {
            addCriterion("ORIGINAL_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTestEqualTo(Long value) {
            addCriterion("ORIGINAL_TEST =", value, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestNotEqualTo(Long value) {
            addCriterion("ORIGINAL_TEST <>", value, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestGreaterThan(Long value) {
            addCriterion("ORIGINAL_TEST >", value, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestGreaterThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_TEST >=", value, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestLessThan(Long value) {
            addCriterion("ORIGINAL_TEST <", value, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestLessThanOrEqualTo(Long value) {
            addCriterion("ORIGINAL_TEST <=", value, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestIn(List<Long> values) {
            addCriterion("ORIGINAL_TEST in", values, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestNotIn(List<Long> values) {
            addCriterion("ORIGINAL_TEST not in", values, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_TEST between", value1, value2, "originalTest");
            return (Criteria) this;
        }

        public Criteria andOriginalTestNotBetween(Long value1, Long value2) {
            addCriterion("ORIGINAL_TEST not between", value1, value2, "originalTest");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIsNull() {
            addCriterion("DATE_RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIsNotNull() {
            addCriterion("DATE_RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andDateReceivedEqualTo(Date value) {
            addCriterion("DATE_RECEIVED =", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotEqualTo(Date value) {
            addCriterion("DATE_RECEIVED <>", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedGreaterThan(Date value) {
            addCriterion("DATE_RECEIVED >", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_RECEIVED >=", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedLessThan(Date value) {
            addCriterion("DATE_RECEIVED <", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_RECEIVED <=", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIn(List<Date> values) {
            addCriterion("DATE_RECEIVED in", values, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotIn(List<Date> values) {
            addCriterion("DATE_RECEIVED not in", values, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedBetween(Date value1, Date value2) {
            addCriterion("DATE_RECEIVED between", value1, value2, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_RECEIVED not between", value1, value2, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateStartedIsNull() {
            addCriterion("DATE_STARTED is null");
            return (Criteria) this;
        }

        public Criteria andDateStartedIsNotNull() {
            addCriterion("DATE_STARTED is not null");
            return (Criteria) this;
        }

        public Criteria andDateStartedEqualTo(Date value) {
            addCriterion("DATE_STARTED =", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedNotEqualTo(Date value) {
            addCriterion("DATE_STARTED <>", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedGreaterThan(Date value) {
            addCriterion("DATE_STARTED >", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_STARTED >=", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedLessThan(Date value) {
            addCriterion("DATE_STARTED <", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_STARTED <=", value, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedIn(List<Date> values) {
            addCriterion("DATE_STARTED in", values, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedNotIn(List<Date> values) {
            addCriterion("DATE_STARTED not in", values, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedBetween(Date value1, Date value2) {
            addCriterion("DATE_STARTED between", value1, value2, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andDateStartedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_STARTED not between", value1, value2, "dateStarted");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorIsNull() {
            addCriterion("ASSIGNED_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorIsNotNull() {
            addCriterion("ASSIGNED_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR =", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR <>", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorGreaterThan(String value) {
            addCriterion("ASSIGNED_OPERATOR >", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR >=", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorLessThan(String value) {
            addCriterion("ASSIGNED_OPERATOR <", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorLessThanOrEqualTo(String value) {
            addCriterion("ASSIGNED_OPERATOR <=", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorLike(String value) {
            addCriterion("ASSIGNED_OPERATOR like", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotLike(String value) {
            addCriterion("ASSIGNED_OPERATOR not like", value, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorIn(List<String> values) {
            addCriterion("ASSIGNED_OPERATOR in", values, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotIn(List<String> values) {
            addCriterion("ASSIGNED_OPERATOR not in", values, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorBetween(String value1, String value2) {
            addCriterion("ASSIGNED_OPERATOR between", value1, value2, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andAssignedOperatorNotBetween(String value1, String value2) {
            addCriterion("ASSIGNED_OPERATOR not between", value1, value2, "assignedOperator");
            return (Criteria) this;
        }

        public Criteria andPrepIsNull() {
            addCriterion("PREP is null");
            return (Criteria) this;
        }

        public Criteria andPrepIsNotNull() {
            addCriterion("PREP is not null");
            return (Criteria) this;
        }

        public Criteria andPrepEqualTo(String value) {
            addCriterion("PREP =", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotEqualTo(String value) {
            addCriterion("PREP <>", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepGreaterThan(String value) {
            addCriterion("PREP >", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepGreaterThanOrEqualTo(String value) {
            addCriterion("PREP >=", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepLessThan(String value) {
            addCriterion("PREP <", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepLessThanOrEqualTo(String value) {
            addCriterion("PREP <=", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepLike(String value) {
            addCriterion("PREP like", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotLike(String value) {
            addCriterion("PREP not like", value, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepIn(List<String> values) {
            addCriterion("PREP in", values, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotIn(List<String> values) {
            addCriterion("PREP not in", values, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepBetween(String value1, String value2) {
            addCriterion("PREP between", value1, value2, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepNotBetween(String value1, String value2) {
            addCriterion("PREP not between", value1, value2, "prep");
            return (Criteria) this;
        }

        public Criteria andPrepDateIsNull() {
            addCriterion("PREP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrepDateIsNotNull() {
            addCriterion("PREP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrepDateEqualTo(Date value) {
            addCriterion("PREP_DATE =", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotEqualTo(Date value) {
            addCriterion("PREP_DATE <>", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateGreaterThan(Date value) {
            addCriterion("PREP_DATE >", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PREP_DATE >=", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateLessThan(Date value) {
            addCriterion("PREP_DATE <", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateLessThanOrEqualTo(Date value) {
            addCriterion("PREP_DATE <=", value, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateIn(List<Date> values) {
            addCriterion("PREP_DATE in", values, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotIn(List<Date> values) {
            addCriterion("PREP_DATE not in", values, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateBetween(Date value1, Date value2) {
            addCriterion("PREP_DATE between", value1, value2, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepDateNotBetween(Date value1, Date value2) {
            addCriterion("PREP_DATE not between", value1, value2, "prepDate");
            return (Criteria) this;
        }

        public Criteria andPrepByIsNull() {
            addCriterion("PREP_BY is null");
            return (Criteria) this;
        }

        public Criteria andPrepByIsNotNull() {
            addCriterion("PREP_BY is not null");
            return (Criteria) this;
        }

        public Criteria andPrepByEqualTo(String value) {
            addCriterion("PREP_BY =", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotEqualTo(String value) {
            addCriterion("PREP_BY <>", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByGreaterThan(String value) {
            addCriterion("PREP_BY >", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByGreaterThanOrEqualTo(String value) {
            addCriterion("PREP_BY >=", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByLessThan(String value) {
            addCriterion("PREP_BY <", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByLessThanOrEqualTo(String value) {
            addCriterion("PREP_BY <=", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByLike(String value) {
            addCriterion("PREP_BY like", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotLike(String value) {
            addCriterion("PREP_BY not like", value, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByIn(List<String> values) {
            addCriterion("PREP_BY in", values, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotIn(List<String> values) {
            addCriterion("PREP_BY not in", values, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByBetween(String value1, String value2) {
            addCriterion("PREP_BY between", value1, value2, "prepBy");
            return (Criteria) this;
        }

        public Criteria andPrepByNotBetween(String value1, String value2) {
            addCriterion("PREP_BY not between", value1, value2, "prepBy");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIsNull() {
            addCriterion("DATE_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIsNotNull() {
            addCriterion("DATE_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCompletedEqualTo(Date value) {
            addCriterion("DATE_COMPLETED =", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotEqualTo(Date value) {
            addCriterion("DATE_COMPLETED <>", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedGreaterThan(Date value) {
            addCriterion("DATE_COMPLETED >", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_COMPLETED >=", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedLessThan(Date value) {
            addCriterion("DATE_COMPLETED <", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_COMPLETED <=", value, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedIn(List<Date> values) {
            addCriterion("DATE_COMPLETED in", values, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotIn(List<Date> values) {
            addCriterion("DATE_COMPLETED not in", values, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedBetween(Date value1, Date value2) {
            addCriterion("DATE_COMPLETED between", value1, value2, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateCompletedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_COMPLETED not between", value1, value2, "dateCompleted");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIsNull() {
            addCriterion("DATE_REVIEWED is null");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIsNotNull() {
            addCriterion("DATE_REVIEWED is not null");
            return (Criteria) this;
        }

        public Criteria andDateReviewedEqualTo(Date value) {
            addCriterion("DATE_REVIEWED =", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotEqualTo(Date value) {
            addCriterion("DATE_REVIEWED <>", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedGreaterThan(Date value) {
            addCriterion("DATE_REVIEWED >", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_REVIEWED >=", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedLessThan(Date value) {
            addCriterion("DATE_REVIEWED <", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedLessThanOrEqualTo(Date value) {
            addCriterion("DATE_REVIEWED <=", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIn(List<Date> values) {
            addCriterion("DATE_REVIEWED in", values, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotIn(List<Date> values) {
            addCriterion("DATE_REVIEWED not in", values, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedBetween(Date value1, Date value2) {
            addCriterion("DATE_REVIEWED between", value1, value2, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotBetween(Date value1, Date value2) {
            addCriterion("DATE_REVIEWED not between", value1, value2, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNull() {
            addCriterion("REVIEWER is null");
            return (Criteria) this;
        }

        public Criteria andReviewerIsNotNull() {
            addCriterion("REVIEWER is not null");
            return (Criteria) this;
        }

        public Criteria andReviewerEqualTo(String value) {
            addCriterion("REVIEWER =", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotEqualTo(String value) {
            addCriterion("REVIEWER <>", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThan(String value) {
            addCriterion("REVIEWER >", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWER >=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThan(String value) {
            addCriterion("REVIEWER <", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLessThanOrEqualTo(String value) {
            addCriterion("REVIEWER <=", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerLike(String value) {
            addCriterion("REVIEWER like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotLike(String value) {
            addCriterion("REVIEWER not like", value, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerIn(List<String> values) {
            addCriterion("REVIEWER in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotIn(List<String> values) {
            addCriterion("REVIEWER not in", values, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerBetween(String value1, String value2) {
            addCriterion("REVIEWER between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReviewerNotBetween(String value1, String value2) {
            addCriterion("REVIEWER not between", value1, value2, "reviewer");
            return (Criteria) this;
        }

        public Criteria andReplicateTestIsNull() {
            addCriterion("REPLICATE_TEST is null");
            return (Criteria) this;
        }

        public Criteria andReplicateTestIsNotNull() {
            addCriterion("REPLICATE_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andReplicateTestEqualTo(String value) {
            addCriterion("REPLICATE_TEST =", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestNotEqualTo(String value) {
            addCriterion("REPLICATE_TEST <>", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestGreaterThan(String value) {
            addCriterion("REPLICATE_TEST >", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestGreaterThanOrEqualTo(String value) {
            addCriterion("REPLICATE_TEST >=", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestLessThan(String value) {
            addCriterion("REPLICATE_TEST <", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestLessThanOrEqualTo(String value) {
            addCriterion("REPLICATE_TEST <=", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestLike(String value) {
            addCriterion("REPLICATE_TEST like", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestNotLike(String value) {
            addCriterion("REPLICATE_TEST not like", value, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestIn(List<String> values) {
            addCriterion("REPLICATE_TEST in", values, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestNotIn(List<String> values) {
            addCriterion("REPLICATE_TEST not in", values, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestBetween(String value1, String value2) {
            addCriterion("REPLICATE_TEST between", value1, value2, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andReplicateTestNotBetween(String value1, String value2) {
            addCriterion("REPLICATE_TEST not between", value1, value2, "replicateTest");
            return (Criteria) this;
        }

        public Criteria andInstrumentIsNull() {
            addCriterion("INSTRUMENT is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentIsNotNull() {
            addCriterion("INSTRUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentEqualTo(String value) {
            addCriterion("INSTRUMENT =", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotEqualTo(String value) {
            addCriterion("INSTRUMENT <>", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentGreaterThan(String value) {
            addCriterion("INSTRUMENT >", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentGreaterThanOrEqualTo(String value) {
            addCriterion("INSTRUMENT >=", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLessThan(String value) {
            addCriterion("INSTRUMENT <", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLessThanOrEqualTo(String value) {
            addCriterion("INSTRUMENT <=", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentLike(String value) {
            addCriterion("INSTRUMENT like", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotLike(String value) {
            addCriterion("INSTRUMENT not like", value, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentIn(List<String> values) {
            addCriterion("INSTRUMENT in", values, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotIn(List<String> values) {
            addCriterion("INSTRUMENT not in", values, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentBetween(String value1, String value2) {
            addCriterion("INSTRUMENT between", value1, value2, "instrument");
            return (Criteria) this;
        }

        public Criteria andInstrumentNotBetween(String value1, String value2) {
            addCriterion("INSTRUMENT not between", value1, value2, "instrument");
            return (Criteria) this;
        }

        public Criteria andTestPriorityIsNull() {
            addCriterion("TEST_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andTestPriorityIsNotNull() {
            addCriterion("TEST_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andTestPriorityEqualTo(Long value) {
            addCriterion("TEST_PRIORITY =", value, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityNotEqualTo(Long value) {
            addCriterion("TEST_PRIORITY <>", value, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityGreaterThan(Long value) {
            addCriterion("TEST_PRIORITY >", value, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_PRIORITY >=", value, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityLessThan(Long value) {
            addCriterion("TEST_PRIORITY <", value, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityLessThanOrEqualTo(Long value) {
            addCriterion("TEST_PRIORITY <=", value, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityIn(List<Long> values) {
            addCriterion("TEST_PRIORITY in", values, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityNotIn(List<Long> values) {
            addCriterion("TEST_PRIORITY not in", values, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityBetween(Long value1, Long value2) {
            addCriterion("TEST_PRIORITY between", value1, value2, "testPriority");
            return (Criteria) this;
        }

        public Criteria andTestPriorityNotBetween(Long value1, Long value2) {
            addCriterion("TEST_PRIORITY not between", value1, value2, "testPriority");
            return (Criteria) this;
        }

        public Criteria andInSpecIsNull() {
            addCriterion("IN_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andInSpecIsNotNull() {
            addCriterion("IN_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andInSpecEqualTo(String value) {
            addCriterion("IN_SPEC =", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotEqualTo(String value) {
            addCriterion("IN_SPEC <>", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecGreaterThan(String value) {
            addCriterion("IN_SPEC >", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SPEC >=", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecLessThan(String value) {
            addCriterion("IN_SPEC <", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecLessThanOrEqualTo(String value) {
            addCriterion("IN_SPEC <=", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecLike(String value) {
            addCriterion("IN_SPEC like", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotLike(String value) {
            addCriterion("IN_SPEC not like", value, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecIn(List<String> values) {
            addCriterion("IN_SPEC in", values, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotIn(List<String> values) {
            addCriterion("IN_SPEC not in", values, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecBetween(String value1, String value2) {
            addCriterion("IN_SPEC between", value1, value2, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInSpecNotBetween(String value1, String value2) {
            addCriterion("IN_SPEC not between", value1, value2, "inSpec");
            return (Criteria) this;
        }

        public Criteria andInCalIsNull() {
            addCriterion("IN_CAL is null");
            return (Criteria) this;
        }

        public Criteria andInCalIsNotNull() {
            addCriterion("IN_CAL is not null");
            return (Criteria) this;
        }

        public Criteria andInCalEqualTo(String value) {
            addCriterion("IN_CAL =", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotEqualTo(String value) {
            addCriterion("IN_CAL <>", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalGreaterThan(String value) {
            addCriterion("IN_CAL >", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalGreaterThanOrEqualTo(String value) {
            addCriterion("IN_CAL >=", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalLessThan(String value) {
            addCriterion("IN_CAL <", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalLessThanOrEqualTo(String value) {
            addCriterion("IN_CAL <=", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalLike(String value) {
            addCriterion("IN_CAL like", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotLike(String value) {
            addCriterion("IN_CAL not like", value, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalIn(List<String> values) {
            addCriterion("IN_CAL in", values, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotIn(List<String> values) {
            addCriterion("IN_CAL not in", values, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalBetween(String value1, String value2) {
            addCriterion("IN_CAL between", value1, value2, "inCal");
            return (Criteria) this;
        }

        public Criteria andInCalNotBetween(String value1, String value2) {
            addCriterion("IN_CAL not between", value1, value2, "inCal");
            return (Criteria) this;
        }

        public Criteria andTestCommentIsNull() {
            addCriterion("TEST_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andTestCommentIsNotNull() {
            addCriterion("TEST_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTestCommentEqualTo(String value) {
            addCriterion("TEST_COMMENT =", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotEqualTo(String value) {
            addCriterion("TEST_COMMENT <>", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentGreaterThan(String value) {
            addCriterion("TEST_COMMENT >", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_COMMENT >=", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentLessThan(String value) {
            addCriterion("TEST_COMMENT <", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentLessThanOrEqualTo(String value) {
            addCriterion("TEST_COMMENT <=", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentLike(String value) {
            addCriterion("TEST_COMMENT like", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotLike(String value) {
            addCriterion("TEST_COMMENT not like", value, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentIn(List<String> values) {
            addCriterion("TEST_COMMENT in", values, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotIn(List<String> values) {
            addCriterion("TEST_COMMENT not in", values, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentBetween(String value1, String value2) {
            addCriterion("TEST_COMMENT between", value1, value2, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestCommentNotBetween(String value1, String value2) {
            addCriterion("TEST_COMMENT not between", value1, value2, "testComment");
            return (Criteria) this;
        }

        public Criteria andTestLocationIsNull() {
            addCriterion("TEST_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andTestLocationIsNotNull() {
            addCriterion("TEST_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andTestLocationEqualTo(String value) {
            addCriterion("TEST_LOCATION =", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotEqualTo(String value) {
            addCriterion("TEST_LOCATION <>", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationGreaterThan(String value) {
            addCriterion("TEST_LOCATION >", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_LOCATION >=", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationLessThan(String value) {
            addCriterion("TEST_LOCATION <", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationLessThanOrEqualTo(String value) {
            addCriterion("TEST_LOCATION <=", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationLike(String value) {
            addCriterion("TEST_LOCATION like", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotLike(String value) {
            addCriterion("TEST_LOCATION not like", value, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationIn(List<String> values) {
            addCriterion("TEST_LOCATION in", values, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotIn(List<String> values) {
            addCriterion("TEST_LOCATION not in", values, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationBetween(String value1, String value2) {
            addCriterion("TEST_LOCATION between", value1, value2, "testLocation");
            return (Criteria) this;
        }

        public Criteria andTestLocationNotBetween(String value1, String value2) {
            addCriterion("TEST_LOCATION not between", value1, value2, "testLocation");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNull() {
            addCriterion("PARAMETER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andParameterNameIsNotNull() {
            addCriterion("PARAMETER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andParameterNameEqualTo(String value) {
            addCriterion("PARAMETER_NAME =", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotEqualTo(String value) {
            addCriterion("PARAMETER_NAME <>", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThan(String value) {
            addCriterion("PARAMETER_NAME >", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME >=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThan(String value) {
            addCriterion("PARAMETER_NAME <", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_NAME <=", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameLike(String value) {
            addCriterion("PARAMETER_NAME like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotLike(String value) {
            addCriterion("PARAMETER_NAME not like", value, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameIn(List<String> values) {
            addCriterion("PARAMETER_NAME in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotIn(List<String> values) {
            addCriterion("PARAMETER_NAME not in", values, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterNameNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_NAME not between", value1, value2, "parameterName");
            return (Criteria) this;
        }

        public Criteria andParameterValueIsNull() {
            addCriterion("PARAMETER_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParameterValueIsNotNull() {
            addCriterion("PARAMETER_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParameterValueEqualTo(String value) {
            addCriterion("PARAMETER_VALUE =", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotEqualTo(String value) {
            addCriterion("PARAMETER_VALUE <>", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueGreaterThan(String value) {
            addCriterion("PARAMETER_VALUE >", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMETER_VALUE >=", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueLessThan(String value) {
            addCriterion("PARAMETER_VALUE <", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueLessThanOrEqualTo(String value) {
            addCriterion("PARAMETER_VALUE <=", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueLike(String value) {
            addCriterion("PARAMETER_VALUE like", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotLike(String value) {
            addCriterion("PARAMETER_VALUE not like", value, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueIn(List<String> values) {
            addCriterion("PARAMETER_VALUE in", values, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotIn(List<String> values) {
            addCriterion("PARAMETER_VALUE not in", values, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueBetween(String value1, String value2) {
            addCriterion("PARAMETER_VALUE between", value1, value2, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andParameterValueNotBetween(String value1, String value2) {
            addCriterion("PARAMETER_VALUE not between", value1, value2, "parameterValue");
            return (Criteria) this;
        }

        public Criteria andExpectedDateIsNull() {
            addCriterion("EXPECTED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpectedDateIsNotNull() {
            addCriterion("EXPECTED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedDateEqualTo(Date value) {
            addCriterion("EXPECTED_DATE =", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateNotEqualTo(Date value) {
            addCriterion("EXPECTED_DATE <>", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateGreaterThan(Date value) {
            addCriterion("EXPECTED_DATE >", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPECTED_DATE >=", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateLessThan(Date value) {
            addCriterion("EXPECTED_DATE <", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateLessThanOrEqualTo(Date value) {
            addCriterion("EXPECTED_DATE <=", value, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateIn(List<Date> values) {
            addCriterion("EXPECTED_DATE in", values, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateNotIn(List<Date> values) {
            addCriterion("EXPECTED_DATE not in", values, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateBetween(Date value1, Date value2) {
            addCriterion("EXPECTED_DATE between", value1, value2, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andExpectedDateNotBetween(Date value1, Date value2) {
            addCriterion("EXPECTED_DATE not between", value1, value2, "expectedDate");
            return (Criteria) this;
        }

        public Criteria andLabIsNull() {
            addCriterion("LAB is null");
            return (Criteria) this;
        }

        public Criteria andLabIsNotNull() {
            addCriterion("LAB is not null");
            return (Criteria) this;
        }

        public Criteria andLabEqualTo(String value) {
            addCriterion("LAB =", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotEqualTo(String value) {
            addCriterion("LAB <>", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabGreaterThan(String value) {
            addCriterion("LAB >", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabGreaterThanOrEqualTo(String value) {
            addCriterion("LAB >=", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLessThan(String value) {
            addCriterion("LAB <", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLessThanOrEqualTo(String value) {
            addCriterion("LAB <=", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLike(String value) {
            addCriterion("LAB like", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotLike(String value) {
            addCriterion("LAB not like", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabIn(List<String> values) {
            addCriterion("LAB in", values, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotIn(List<String> values) {
            addCriterion("LAB not in", values, "lab");
            return (Criteria) this;
        }

        public Criteria andLabBetween(String value1, String value2) {
            addCriterion("LAB between", value1, value2, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotBetween(String value1, String value2) {
            addCriterion("LAB not between", value1, value2, "lab");
            return (Criteria) this;
        }

        public Criteria andResolveReqdIsNull() {
            addCriterion("RESOLVE_REQD is null");
            return (Criteria) this;
        }

        public Criteria andResolveReqdIsNotNull() {
            addCriterion("RESOLVE_REQD is not null");
            return (Criteria) this;
        }

        public Criteria andResolveReqdEqualTo(String value) {
            addCriterion("RESOLVE_REQD =", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdNotEqualTo(String value) {
            addCriterion("RESOLVE_REQD <>", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdGreaterThan(String value) {
            addCriterion("RESOLVE_REQD >", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdGreaterThanOrEqualTo(String value) {
            addCriterion("RESOLVE_REQD >=", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdLessThan(String value) {
            addCriterion("RESOLVE_REQD <", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdLessThanOrEqualTo(String value) {
            addCriterion("RESOLVE_REQD <=", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdLike(String value) {
            addCriterion("RESOLVE_REQD like", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdNotLike(String value) {
            addCriterion("RESOLVE_REQD not like", value, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdIn(List<String> values) {
            addCriterion("RESOLVE_REQD in", values, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdNotIn(List<String> values) {
            addCriterion("RESOLVE_REQD not in", values, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdBetween(String value1, String value2) {
            addCriterion("RESOLVE_REQD between", value1, value2, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andResolveReqdNotBetween(String value1, String value2) {
            addCriterion("RESOLVE_REQD not between", value1, value2, "resolveReqd");
            return (Criteria) this;
        }

        public Criteria andChangedOnIsNull() {
            addCriterion("CHANGED_ON is null");
            return (Criteria) this;
        }

        public Criteria andChangedOnIsNotNull() {
            addCriterion("CHANGED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andChangedOnEqualTo(Date value) {
            addCriterion("CHANGED_ON =", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotEqualTo(Date value) {
            addCriterion("CHANGED_ON <>", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThan(Date value) {
            addCriterion("CHANGED_ON >", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGED_ON >=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThan(Date value) {
            addCriterion("CHANGED_ON <", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThanOrEqualTo(Date value) {
            addCriterion("CHANGED_ON <=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnIn(List<Date> values) {
            addCriterion("CHANGED_ON in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotIn(List<Date> values) {
            addCriterion("CHANGED_ON not in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnBetween(Date value1, Date value2) {
            addCriterion("CHANGED_ON between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotBetween(Date value1, Date value2) {
            addCriterion("CHANGED_ON not between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("STAGE like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("STAGE not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecIsNull() {
            addCriterion("PRIMARY_IN_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecIsNotNull() {
            addCriterion("PRIMARY_IN_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC =", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC <>", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecGreaterThan(String value) {
            addCriterion("PRIMARY_IN_SPEC >", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecGreaterThanOrEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC >=", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecLessThan(String value) {
            addCriterion("PRIMARY_IN_SPEC <", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecLessThanOrEqualTo(String value) {
            addCriterion("PRIMARY_IN_SPEC <=", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecLike(String value) {
            addCriterion("PRIMARY_IN_SPEC like", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotLike(String value) {
            addCriterion("PRIMARY_IN_SPEC not like", value, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecIn(List<String> values) {
            addCriterion("PRIMARY_IN_SPEC in", values, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotIn(List<String> values) {
            addCriterion("PRIMARY_IN_SPEC not in", values, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecBetween(String value1, String value2) {
            addCriterion("PRIMARY_IN_SPEC between", value1, value2, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andPrimaryInSpecNotBetween(String value1, String value2) {
            addCriterion("PRIMARY_IN_SPEC not between", value1, value2, "primaryInSpec");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("BATCH is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("BATCH =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("BATCH <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("BATCH >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("BATCH <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("BATCH <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("BATCH like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("BATCH not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("BATCH in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("BATCH not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("BATCH between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("BATCH not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andInControlIsNull() {
            addCriterion("IN_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andInControlIsNotNull() {
            addCriterion("IN_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andInControlEqualTo(String value) {
            addCriterion("IN_CONTROL =", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotEqualTo(String value) {
            addCriterion("IN_CONTROL <>", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlGreaterThan(String value) {
            addCriterion("IN_CONTROL >", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlGreaterThanOrEqualTo(String value) {
            addCriterion("IN_CONTROL >=", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlLessThan(String value) {
            addCriterion("IN_CONTROL <", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlLessThanOrEqualTo(String value) {
            addCriterion("IN_CONTROL <=", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlLike(String value) {
            addCriterion("IN_CONTROL like", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotLike(String value) {
            addCriterion("IN_CONTROL not like", value, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlIn(List<String> values) {
            addCriterion("IN_CONTROL in", values, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotIn(List<String> values) {
            addCriterion("IN_CONTROL not in", values, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlBetween(String value1, String value2) {
            addCriterion("IN_CONTROL between", value1, value2, "inControl");
            return (Criteria) this;
        }

        public Criteria andInControlNotBetween(String value1, String value2) {
            addCriterion("IN_CONTROL not between", value1, value2, "inControl");
            return (Criteria) this;
        }

        public Criteria andTestListIsNull() {
            addCriterion("TEST_LIST is null");
            return (Criteria) this;
        }

        public Criteria andTestListIsNotNull() {
            addCriterion("TEST_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andTestListEqualTo(String value) {
            addCriterion("TEST_LIST =", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotEqualTo(String value) {
            addCriterion("TEST_LIST <>", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListGreaterThan(String value) {
            addCriterion("TEST_LIST >", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_LIST >=", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLessThan(String value) {
            addCriterion("TEST_LIST <", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLessThanOrEqualTo(String value) {
            addCriterion("TEST_LIST <=", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLike(String value) {
            addCriterion("TEST_LIST like", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotLike(String value) {
            addCriterion("TEST_LIST not like", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListIn(List<String> values) {
            addCriterion("TEST_LIST in", values, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotIn(List<String> values) {
            addCriterion("TEST_LIST not in", values, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListBetween(String value1, String value2) {
            addCriterion("TEST_LIST between", value1, value2, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotBetween(String value1, String value2) {
            addCriterion("TEST_LIST not between", value1, value2, "testList");
            return (Criteria) this;
        }

        public Criteria andReTestedIsNull() {
            addCriterion("RE_TESTED is null");
            return (Criteria) this;
        }

        public Criteria andReTestedIsNotNull() {
            addCriterion("RE_TESTED is not null");
            return (Criteria) this;
        }

        public Criteria andReTestedEqualTo(String value) {
            addCriterion("RE_TESTED =", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedNotEqualTo(String value) {
            addCriterion("RE_TESTED <>", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedGreaterThan(String value) {
            addCriterion("RE_TESTED >", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedGreaterThanOrEqualTo(String value) {
            addCriterion("RE_TESTED >=", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedLessThan(String value) {
            addCriterion("RE_TESTED <", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedLessThanOrEqualTo(String value) {
            addCriterion("RE_TESTED <=", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedLike(String value) {
            addCriterion("RE_TESTED like", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedNotLike(String value) {
            addCriterion("RE_TESTED not like", value, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedIn(List<String> values) {
            addCriterion("RE_TESTED in", values, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedNotIn(List<String> values) {
            addCriterion("RE_TESTED not in", values, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedBetween(String value1, String value2) {
            addCriterion("RE_TESTED between", value1, value2, "reTested");
            return (Criteria) this;
        }

        public Criteria andReTestedNotBetween(String value1, String value2) {
            addCriterion("RE_TESTED not between", value1, value2, "reTested");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsIsNull() {
            addCriterion("MODIFIED_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsIsNotNull() {
            addCriterion("MODIFIED_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS =", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS <>", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsGreaterThan(String value) {
            addCriterion("MODIFIED_RESULTS >", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS >=", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsLessThan(String value) {
            addCriterion("MODIFIED_RESULTS <", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_RESULTS <=", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsLike(String value) {
            addCriterion("MODIFIED_RESULTS like", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotLike(String value) {
            addCriterion("MODIFIED_RESULTS not like", value, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsIn(List<String> values) {
            addCriterion("MODIFIED_RESULTS in", values, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotIn(List<String> values) {
            addCriterion("MODIFIED_RESULTS not in", values, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsBetween(String value1, String value2) {
            addCriterion("MODIFIED_RESULTS between", value1, value2, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andModifiedResultsNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_RESULTS not between", value1, value2, "modifiedResults");
            return (Criteria) this;
        }

        public Criteria andAliquotedToIsNull() {
            addCriterion("ALIQUOTED_TO is null");
            return (Criteria) this;
        }

        public Criteria andAliquotedToIsNotNull() {
            addCriterion("ALIQUOTED_TO is not null");
            return (Criteria) this;
        }

        public Criteria andAliquotedToEqualTo(Long value) {
            addCriterion("ALIQUOTED_TO =", value, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToNotEqualTo(Long value) {
            addCriterion("ALIQUOTED_TO <>", value, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToGreaterThan(Long value) {
            addCriterion("ALIQUOTED_TO >", value, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToGreaterThanOrEqualTo(Long value) {
            addCriterion("ALIQUOTED_TO >=", value, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToLessThan(Long value) {
            addCriterion("ALIQUOTED_TO <", value, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToLessThanOrEqualTo(Long value) {
            addCriterion("ALIQUOTED_TO <=", value, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToIn(List<Long> values) {
            addCriterion("ALIQUOTED_TO in", values, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToNotIn(List<Long> values) {
            addCriterion("ALIQUOTED_TO not in", values, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToBetween(Long value1, Long value2) {
            addCriterion("ALIQUOTED_TO between", value1, value2, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andAliquotedToNotBetween(Long value1, Long value2) {
            addCriterion("ALIQUOTED_TO not between", value1, value2, "aliquotedTo");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetIsNull() {
            addCriterion("ON_WORKSHEET is null");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetIsNotNull() {
            addCriterion("ON_WORKSHEET is not null");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetEqualTo(String value) {
            addCriterion("ON_WORKSHEET =", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetNotEqualTo(String value) {
            addCriterion("ON_WORKSHEET <>", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetGreaterThan(String value) {
            addCriterion("ON_WORKSHEET >", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetGreaterThanOrEqualTo(String value) {
            addCriterion("ON_WORKSHEET >=", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetLessThan(String value) {
            addCriterion("ON_WORKSHEET <", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetLessThanOrEqualTo(String value) {
            addCriterion("ON_WORKSHEET <=", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetLike(String value) {
            addCriterion("ON_WORKSHEET like", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetNotLike(String value) {
            addCriterion("ON_WORKSHEET not like", value, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetIn(List<String> values) {
            addCriterion("ON_WORKSHEET in", values, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetNotIn(List<String> values) {
            addCriterion("ON_WORKSHEET not in", values, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetBetween(String value1, String value2) {
            addCriterion("ON_WORKSHEET between", value1, value2, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andOnWorksheetNotBetween(String value1, String value2) {
            addCriterion("ON_WORKSHEET not between", value1, value2, "onWorksheet");
            return (Criteria) this;
        }

        public Criteria andDispFldsIsNull() {
            addCriterion("DISP_FLDS is null");
            return (Criteria) this;
        }

        public Criteria andDispFldsIsNotNull() {
            addCriterion("DISP_FLDS is not null");
            return (Criteria) this;
        }

        public Criteria andDispFldsEqualTo(String value) {
            addCriterion("DISP_FLDS =", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotEqualTo(String value) {
            addCriterion("DISP_FLDS <>", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsGreaterThan(String value) {
            addCriterion("DISP_FLDS >", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsGreaterThanOrEqualTo(String value) {
            addCriterion("DISP_FLDS >=", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsLessThan(String value) {
            addCriterion("DISP_FLDS <", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsLessThanOrEqualTo(String value) {
            addCriterion("DISP_FLDS <=", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsLike(String value) {
            addCriterion("DISP_FLDS like", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotLike(String value) {
            addCriterion("DISP_FLDS not like", value, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsIn(List<String> values) {
            addCriterion("DISP_FLDS in", values, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotIn(List<String> values) {
            addCriterion("DISP_FLDS not in", values, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsBetween(String value1, String value2) {
            addCriterion("DISP_FLDS between", value1, value2, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDispFldsNotBetween(String value1, String value2) {
            addCriterion("DISP_FLDS not between", value1, value2, "dispFlds");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsIsNull() {
            addCriterion("DISPLAY_RESULTS is null");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsIsNotNull() {
            addCriterion("DISPLAY_RESULTS is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsEqualTo(String value) {
            addCriterion("DISPLAY_RESULTS =", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsNotEqualTo(String value) {
            addCriterion("DISPLAY_RESULTS <>", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsGreaterThan(String value) {
            addCriterion("DISPLAY_RESULTS >", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_RESULTS >=", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsLessThan(String value) {
            addCriterion("DISPLAY_RESULTS <", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_RESULTS <=", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsLike(String value) {
            addCriterion("DISPLAY_RESULTS like", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsNotLike(String value) {
            addCriterion("DISPLAY_RESULTS not like", value, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsIn(List<String> values) {
            addCriterion("DISPLAY_RESULTS in", values, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsNotIn(List<String> values) {
            addCriterion("DISPLAY_RESULTS not in", values, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsBetween(String value1, String value2) {
            addCriterion("DISPLAY_RESULTS between", value1, value2, "displayResults");
            return (Criteria) this;
        }

        public Criteria andDisplayResultsNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_RESULTS not between", value1, value2, "displayResults");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupIsNull() {
            addCriterion("ALIQUOT_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupIsNotNull() {
            addCriterion("ALIQUOT_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP =", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP <>", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupGreaterThan(String value) {
            addCriterion("ALIQUOT_GROUP >", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupGreaterThanOrEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP >=", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupLessThan(String value) {
            addCriterion("ALIQUOT_GROUP <", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupLessThanOrEqualTo(String value) {
            addCriterion("ALIQUOT_GROUP <=", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupLike(String value) {
            addCriterion("ALIQUOT_GROUP like", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotLike(String value) {
            addCriterion("ALIQUOT_GROUP not like", value, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupIn(List<String> values) {
            addCriterion("ALIQUOT_GROUP in", values, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotIn(List<String> values) {
            addCriterion("ALIQUOT_GROUP not in", values, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupBetween(String value1, String value2) {
            addCriterion("ALIQUOT_GROUP between", value1, value2, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andAliquotGroupNotBetween(String value1, String value2) {
            addCriterion("ALIQUOT_GROUP not between", value1, value2, "aliquotGroup");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesIsNull() {
            addCriterion("SPLIT_REPLICATES is null");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesIsNotNull() {
            addCriterion("SPLIT_REPLICATES is not null");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesEqualTo(String value) {
            addCriterion("SPLIT_REPLICATES =", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesNotEqualTo(String value) {
            addCriterion("SPLIT_REPLICATES <>", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesGreaterThan(String value) {
            addCriterion("SPLIT_REPLICATES >", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesGreaterThanOrEqualTo(String value) {
            addCriterion("SPLIT_REPLICATES >=", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesLessThan(String value) {
            addCriterion("SPLIT_REPLICATES <", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesLessThanOrEqualTo(String value) {
            addCriterion("SPLIT_REPLICATES <=", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesLike(String value) {
            addCriterion("SPLIT_REPLICATES like", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesNotLike(String value) {
            addCriterion("SPLIT_REPLICATES not like", value, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesIn(List<String> values) {
            addCriterion("SPLIT_REPLICATES in", values, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesNotIn(List<String> values) {
            addCriterion("SPLIT_REPLICATES not in", values, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesBetween(String value1, String value2) {
            addCriterion("SPLIT_REPLICATES between", value1, value2, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andSplitReplicatesNotBetween(String value1, String value2) {
            addCriterion("SPLIT_REPLICATES not between", value1, value2, "splitReplicates");
            return (Criteria) this;
        }

        public Criteria andCrossSampleIsNull() {
            addCriterion("CROSS_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andCrossSampleIsNotNull() {
            addCriterion("CROSS_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andCrossSampleEqualTo(String value) {
            addCriterion("CROSS_SAMPLE =", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleNotEqualTo(String value) {
            addCriterion("CROSS_SAMPLE <>", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleGreaterThan(String value) {
            addCriterion("CROSS_SAMPLE >", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleGreaterThanOrEqualTo(String value) {
            addCriterion("CROSS_SAMPLE >=", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleLessThan(String value) {
            addCriterion("CROSS_SAMPLE <", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleLessThanOrEqualTo(String value) {
            addCriterion("CROSS_SAMPLE <=", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleLike(String value) {
            addCriterion("CROSS_SAMPLE like", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleNotLike(String value) {
            addCriterion("CROSS_SAMPLE not like", value, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleIn(List<String> values) {
            addCriterion("CROSS_SAMPLE in", values, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleNotIn(List<String> values) {
            addCriterion("CROSS_SAMPLE not in", values, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleBetween(String value1, String value2) {
            addCriterion("CROSS_SAMPLE between", value1, value2, "crossSample");
            return (Criteria) this;
        }

        public Criteria andCrossSampleNotBetween(String value1, String value2) {
            addCriterion("CROSS_SAMPLE not between", value1, value2, "crossSample");
            return (Criteria) this;
        }

        public Criteria andReleasedIsNull() {
            addCriterion("RELEASED is null");
            return (Criteria) this;
        }

        public Criteria andReleasedIsNotNull() {
            addCriterion("RELEASED is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedEqualTo(String value) {
            addCriterion("RELEASED =", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotEqualTo(String value) {
            addCriterion("RELEASED <>", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedGreaterThan(String value) {
            addCriterion("RELEASED >", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASED >=", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedLessThan(String value) {
            addCriterion("RELEASED <", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedLessThanOrEqualTo(String value) {
            addCriterion("RELEASED <=", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedLike(String value) {
            addCriterion("RELEASED like", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotLike(String value) {
            addCriterion("RELEASED not like", value, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedIn(List<String> values) {
            addCriterion("RELEASED in", values, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotIn(List<String> values) {
            addCriterion("RELEASED not in", values, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedBetween(String value1, String value2) {
            addCriterion("RELEASED between", value1, value2, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedNotBetween(String value1, String value2) {
            addCriterion("RELEASED not between", value1, value2, "released");
            return (Criteria) this;
        }

        public Criteria andReleasedByIsNull() {
            addCriterion("RELEASED_BY is null");
            return (Criteria) this;
        }

        public Criteria andReleasedByIsNotNull() {
            addCriterion("RELEASED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedByEqualTo(String value) {
            addCriterion("RELEASED_BY =", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotEqualTo(String value) {
            addCriterion("RELEASED_BY <>", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByGreaterThan(String value) {
            addCriterion("RELEASED_BY >", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASED_BY >=", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByLessThan(String value) {
            addCriterion("RELEASED_BY <", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByLessThanOrEqualTo(String value) {
            addCriterion("RELEASED_BY <=", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByLike(String value) {
            addCriterion("RELEASED_BY like", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotLike(String value) {
            addCriterion("RELEASED_BY not like", value, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByIn(List<String> values) {
            addCriterion("RELEASED_BY in", values, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotIn(List<String> values) {
            addCriterion("RELEASED_BY not in", values, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByBetween(String value1, String value2) {
            addCriterion("RELEASED_BY between", value1, value2, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedByNotBetween(String value1, String value2) {
            addCriterion("RELEASED_BY not between", value1, value2, "releasedBy");
            return (Criteria) this;
        }

        public Criteria andReleasedOnIsNull() {
            addCriterion("RELEASED_ON is null");
            return (Criteria) this;
        }

        public Criteria andReleasedOnIsNotNull() {
            addCriterion("RELEASED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedOnEqualTo(Date value) {
            addCriterion("RELEASED_ON =", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnNotEqualTo(Date value) {
            addCriterion("RELEASED_ON <>", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnGreaterThan(Date value) {
            addCriterion("RELEASED_ON >", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("RELEASED_ON >=", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnLessThan(Date value) {
            addCriterion("RELEASED_ON <", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnLessThanOrEqualTo(Date value) {
            addCriterion("RELEASED_ON <=", value, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnIn(List<Date> values) {
            addCriterion("RELEASED_ON in", values, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnNotIn(List<Date> values) {
            addCriterion("RELEASED_ON not in", values, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnBetween(Date value1, Date value2) {
            addCriterion("RELEASED_ON between", value1, value2, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleasedOnNotBetween(Date value1, Date value2) {
            addCriterion("RELEASED_ON not between", value1, value2, "releasedOn");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentIsNull() {
            addCriterion("RELEASE_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentIsNotNull() {
            addCriterion("RELEASE_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentEqualTo(String value) {
            addCriterion("RELEASE_COMMENT =", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentNotEqualTo(String value) {
            addCriterion("RELEASE_COMMENT <>", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentGreaterThan(String value) {
            addCriterion("RELEASE_COMMENT >", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASE_COMMENT >=", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentLessThan(String value) {
            addCriterion("RELEASE_COMMENT <", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentLessThanOrEqualTo(String value) {
            addCriterion("RELEASE_COMMENT <=", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentLike(String value) {
            addCriterion("RELEASE_COMMENT like", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentNotLike(String value) {
            addCriterion("RELEASE_COMMENT not like", value, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentIn(List<String> values) {
            addCriterion("RELEASE_COMMENT in", values, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentNotIn(List<String> values) {
            addCriterion("RELEASE_COMMENT not in", values, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentBetween(String value1, String value2) {
            addCriterion("RELEASE_COMMENT between", value1, value2, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andReleaseCommentNotBetween(String value1, String value2) {
            addCriterion("RELEASE_COMMENT not between", value1, value2, "releaseComment");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryIsNull() {
            addCriterion("DOUBLE_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryIsNotNull() {
            addCriterion("DOUBLE_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY =", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryNotEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY <>", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryGreaterThan(String value) {
            addCriterion("DOUBLE_ENTRY >", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryGreaterThanOrEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY >=", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryLessThan(String value) {
            addCriterion("DOUBLE_ENTRY <", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryLessThanOrEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY <=", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryLike(String value) {
            addCriterion("DOUBLE_ENTRY like", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryNotLike(String value) {
            addCriterion("DOUBLE_ENTRY not like", value, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryIn(List<String> values) {
            addCriterion("DOUBLE_ENTRY in", values, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryNotIn(List<String> values) {
            addCriterion("DOUBLE_ENTRY not in", values, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryBetween(String value1, String value2) {
            addCriterion("DOUBLE_ENTRY between", value1, value2, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryNotBetween(String value1, String value2) {
            addCriterion("DOUBLE_ENTRY not between", value1, value2, "doubleEntry");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecIsNull() {
            addCriterion("CHILD_OUT_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecIsNotNull() {
            addCriterion("CHILD_OUT_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecEqualTo(String value) {
            addCriterion("CHILD_OUT_SPEC =", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecNotEqualTo(String value) {
            addCriterion("CHILD_OUT_SPEC <>", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecGreaterThan(String value) {
            addCriterion("CHILD_OUT_SPEC >", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecGreaterThanOrEqualTo(String value) {
            addCriterion("CHILD_OUT_SPEC >=", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecLessThan(String value) {
            addCriterion("CHILD_OUT_SPEC <", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecLessThanOrEqualTo(String value) {
            addCriterion("CHILD_OUT_SPEC <=", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecLike(String value) {
            addCriterion("CHILD_OUT_SPEC like", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecNotLike(String value) {
            addCriterion("CHILD_OUT_SPEC not like", value, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecIn(List<String> values) {
            addCriterion("CHILD_OUT_SPEC in", values, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecNotIn(List<String> values) {
            addCriterion("CHILD_OUT_SPEC not in", values, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecBetween(String value1, String value2) {
            addCriterion("CHILD_OUT_SPEC between", value1, value2, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChildOutSpecNotBetween(String value1, String value2) {
            addCriterion("CHILD_OUT_SPEC not between", value1, value2, "childOutSpec");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIsNull() {
            addCriterion("CHARGE_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIsNotNull() {
            addCriterion("CHARGE_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEntryEqualTo(Long value) {
            addCriterion("CHARGE_ENTRY =", value, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryNotEqualTo(Long value) {
            addCriterion("CHARGE_ENTRY <>", value, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryGreaterThan(Long value) {
            addCriterion("CHARGE_ENTRY >", value, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryGreaterThanOrEqualTo(Long value) {
            addCriterion("CHARGE_ENTRY >=", value, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryLessThan(Long value) {
            addCriterion("CHARGE_ENTRY <", value, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryLessThanOrEqualTo(Long value) {
            addCriterion("CHARGE_ENTRY <=", value, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryIn(List<Long> values) {
            addCriterion("CHARGE_ENTRY in", values, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryNotIn(List<Long> values) {
            addCriterion("CHARGE_ENTRY not in", values, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryBetween(Long value1, Long value2) {
            addCriterion("CHARGE_ENTRY between", value1, value2, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andChargeEntryNotBetween(Long value1, Long value2) {
            addCriterion("CHARGE_ENTRY not between", value1, value2, "chargeEntry");
            return (Criteria) this;
        }

        public Criteria andSignedIsNull() {
            addCriterion("SIGNED is null");
            return (Criteria) this;
        }

        public Criteria andSignedIsNotNull() {
            addCriterion("SIGNED is not null");
            return (Criteria) this;
        }

        public Criteria andSignedEqualTo(String value) {
            addCriterion("SIGNED =", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotEqualTo(String value) {
            addCriterion("SIGNED <>", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThan(String value) {
            addCriterion("SIGNED >", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNED >=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThan(String value) {
            addCriterion("SIGNED <", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLessThanOrEqualTo(String value) {
            addCriterion("SIGNED <=", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedLike(String value) {
            addCriterion("SIGNED like", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotLike(String value) {
            addCriterion("SIGNED not like", value, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedIn(List<String> values) {
            addCriterion("SIGNED in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotIn(List<String> values) {
            addCriterion("SIGNED not in", values, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedBetween(String value1, String value2) {
            addCriterion("SIGNED between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andSignedNotBetween(String value1, String value2) {
            addCriterion("SIGNED not between", value1, value2, "signed");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestIsNull() {
            addCriterion("BATCH_ORIGINAL_TEST is null");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestIsNotNull() {
            addCriterion("BATCH_ORIGINAL_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestEqualTo(Long value) {
            addCriterion("BATCH_ORIGINAL_TEST =", value, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestNotEqualTo(Long value) {
            addCriterion("BATCH_ORIGINAL_TEST <>", value, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestGreaterThan(Long value) {
            addCriterion("BATCH_ORIGINAL_TEST >", value, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestGreaterThanOrEqualTo(Long value) {
            addCriterion("BATCH_ORIGINAL_TEST >=", value, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestLessThan(Long value) {
            addCriterion("BATCH_ORIGINAL_TEST <", value, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestLessThanOrEqualTo(Long value) {
            addCriterion("BATCH_ORIGINAL_TEST <=", value, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestIn(List<Long> values) {
            addCriterion("BATCH_ORIGINAL_TEST in", values, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestNotIn(List<Long> values) {
            addCriterion("BATCH_ORIGINAL_TEST not in", values, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestBetween(Long value1, Long value2) {
            addCriterion("BATCH_ORIGINAL_TEST between", value1, value2, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andBatchOriginalTestNotBetween(Long value1, Long value2) {
            addCriterion("BATCH_ORIGINAL_TEST not between", value1, value2, "batchOriginalTest");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoIsNull() {
            addCriterion("TEST_SEQUENCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoIsNotNull() {
            addCriterion("TEST_SEQUENCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoEqualTo(Long value) {
            addCriterion("TEST_SEQUENCE_NO =", value, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoNotEqualTo(Long value) {
            addCriterion("TEST_SEQUENCE_NO <>", value, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoGreaterThan(Long value) {
            addCriterion("TEST_SEQUENCE_NO >", value, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoGreaterThanOrEqualTo(Long value) {
            addCriterion("TEST_SEQUENCE_NO >=", value, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoLessThan(Long value) {
            addCriterion("TEST_SEQUENCE_NO <", value, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoLessThanOrEqualTo(Long value) {
            addCriterion("TEST_SEQUENCE_NO <=", value, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoIn(List<Long> values) {
            addCriterion("TEST_SEQUENCE_NO in", values, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoNotIn(List<Long> values) {
            addCriterion("TEST_SEQUENCE_NO not in", values, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoBetween(Long value1, Long value2) {
            addCriterion("TEST_SEQUENCE_NO between", value1, value2, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andTestSequenceNoNotBetween(Long value1, Long value2) {
            addCriterion("TEST_SEQUENCE_NO not between", value1, value2, "testSequenceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("INVOICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("INVOICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(Long value) {
            addCriterion("INVOICE_NUMBER =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(Long value) {
            addCriterion("INVOICE_NUMBER <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(Long value) {
            addCriterion("INVOICE_NUMBER >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("INVOICE_NUMBER >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(Long value) {
            addCriterion("INVOICE_NUMBER <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(Long value) {
            addCriterion("INVOICE_NUMBER <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<Long> values) {
            addCriterion("INVOICE_NUMBER in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<Long> values) {
            addCriterion("INVOICE_NUMBER not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(Long value1, Long value2) {
            addCriterion("INVOICE_NUMBER between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(Long value1, Long value2) {
            addCriterion("INVOICE_NUMBER not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescIsNull() {
            addCriterion("BILLING_ITEM_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescIsNotNull() {
            addCriterion("BILLING_ITEM_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC =", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC <>", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescGreaterThan(String value) {
            addCriterion("BILLING_ITEM_DESC >", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC >=", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescLessThan(String value) {
            addCriterion("BILLING_ITEM_DESC <", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescLessThanOrEqualTo(String value) {
            addCriterion("BILLING_ITEM_DESC <=", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescLike(String value) {
            addCriterion("BILLING_ITEM_DESC like", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotLike(String value) {
            addCriterion("BILLING_ITEM_DESC not like", value, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescIn(List<String> values) {
            addCriterion("BILLING_ITEM_DESC in", values, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotIn(List<String> values) {
            addCriterion("BILLING_ITEM_DESC not in", values, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescBetween(String value1, String value2) {
            addCriterion("BILLING_ITEM_DESC between", value1, value2, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andBillingItemDescNotBetween(String value1, String value2) {
            addCriterion("BILLING_ITEM_DESC not between", value1, value2, "billingItemDesc");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoIsNull() {
            addCriterion("CNTRCT_QTE_ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoIsNotNull() {
            addCriterion("CNTRCT_QTE_ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoEqualTo(Long value) {
            addCriterion("CNTRCT_QTE_ITEM_NO =", value, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoNotEqualTo(Long value) {
            addCriterion("CNTRCT_QTE_ITEM_NO <>", value, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoGreaterThan(Long value) {
            addCriterion("CNTRCT_QTE_ITEM_NO >", value, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoGreaterThanOrEqualTo(Long value) {
            addCriterion("CNTRCT_QTE_ITEM_NO >=", value, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoLessThan(Long value) {
            addCriterion("CNTRCT_QTE_ITEM_NO <", value, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoLessThanOrEqualTo(Long value) {
            addCriterion("CNTRCT_QTE_ITEM_NO <=", value, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoIn(List<Long> values) {
            addCriterion("CNTRCT_QTE_ITEM_NO in", values, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoNotIn(List<Long> values) {
            addCriterion("CNTRCT_QTE_ITEM_NO not in", values, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoBetween(Long value1, Long value2) {
            addCriterion("CNTRCT_QTE_ITEM_NO between", value1, value2, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andCntrctQteItemNoNotBetween(Long value1, Long value2) {
            addCriterion("CNTRCT_QTE_ITEM_NO not between", value1, value2, "cntrctQteItemNo");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosIsNull() {
            addCriterion("REPORTED_RSLT_OOS is null");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosIsNotNull() {
            addCriterion("REPORTED_RSLT_OOS is not null");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS =", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS <>", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosGreaterThan(String value) {
            addCriterion("REPORTED_RSLT_OOS >", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosGreaterThanOrEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS >=", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosLessThan(String value) {
            addCriterion("REPORTED_RSLT_OOS <", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosLessThanOrEqualTo(String value) {
            addCriterion("REPORTED_RSLT_OOS <=", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosLike(String value) {
            addCriterion("REPORTED_RSLT_OOS like", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotLike(String value) {
            addCriterion("REPORTED_RSLT_OOS not like", value, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosIn(List<String> values) {
            addCriterion("REPORTED_RSLT_OOS in", values, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotIn(List<String> values) {
            addCriterion("REPORTED_RSLT_OOS not in", values, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosBetween(String value1, String value2) {
            addCriterion("REPORTED_RSLT_OOS between", value1, value2, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andReportedRsltOosNotBetween(String value1, String value2) {
            addCriterion("REPORTED_RSLT_OOS not between", value1, value2, "reportedRsltOos");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNull() {
            addCriterion("CONTAINER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIsNotNull() {
            addCriterion("CONTAINER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContainerTypeEqualTo(String value) {
            addCriterion("CONTAINER_TYPE =", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotEqualTo(String value) {
            addCriterion("CONTAINER_TYPE <>", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThan(String value) {
            addCriterion("CONTAINER_TYPE >", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTAINER_TYPE >=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThan(String value) {
            addCriterion("CONTAINER_TYPE <", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTAINER_TYPE <=", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeLike(String value) {
            addCriterion("CONTAINER_TYPE like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotLike(String value) {
            addCriterion("CONTAINER_TYPE not like", value, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeIn(List<String> values) {
            addCriterion("CONTAINER_TYPE in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotIn(List<String> values) {
            addCriterion("CONTAINER_TYPE not in", values, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeBetween(String value1, String value2) {
            addCriterion("CONTAINER_TYPE between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andContainerTypeNotBetween(String value1, String value2) {
            addCriterion("CONTAINER_TYPE not between", value1, value2, "containerType");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindIsNull() {
            addCriterion("DOUBLE_BLIND is null");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindIsNotNull() {
            addCriterion("DOUBLE_BLIND is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindEqualTo(String value) {
            addCriterion("DOUBLE_BLIND =", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindNotEqualTo(String value) {
            addCriterion("DOUBLE_BLIND <>", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindGreaterThan(String value) {
            addCriterion("DOUBLE_BLIND >", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindGreaterThanOrEqualTo(String value) {
            addCriterion("DOUBLE_BLIND >=", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindLessThan(String value) {
            addCriterion("DOUBLE_BLIND <", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindLessThanOrEqualTo(String value) {
            addCriterion("DOUBLE_BLIND <=", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindLike(String value) {
            addCriterion("DOUBLE_BLIND like", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindNotLike(String value) {
            addCriterion("DOUBLE_BLIND not like", value, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindIn(List<String> values) {
            addCriterion("DOUBLE_BLIND in", values, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindNotIn(List<String> values) {
            addCriterion("DOUBLE_BLIND not in", values, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindBetween(String value1, String value2) {
            addCriterion("DOUBLE_BLIND between", value1, value2, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindNotBetween(String value1, String value2) {
            addCriterion("DOUBLE_BLIND not between", value1, value2, "doubleBlind");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberIsNull() {
            addCriterion("PRE_INVOICE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberIsNotNull() {
            addCriterion("PRE_INVOICE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberEqualTo(Long value) {
            addCriterion("PRE_INVOICE_NUMBER =", value, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberNotEqualTo(Long value) {
            addCriterion("PRE_INVOICE_NUMBER <>", value, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberGreaterThan(Long value) {
            addCriterion("PRE_INVOICE_NUMBER >", value, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("PRE_INVOICE_NUMBER >=", value, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberLessThan(Long value) {
            addCriterion("PRE_INVOICE_NUMBER <", value, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberLessThanOrEqualTo(Long value) {
            addCriterion("PRE_INVOICE_NUMBER <=", value, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberIn(List<Long> values) {
            addCriterion("PRE_INVOICE_NUMBER in", values, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberNotIn(List<Long> values) {
            addCriterion("PRE_INVOICE_NUMBER not in", values, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberBetween(Long value1, Long value2) {
            addCriterion("PRE_INVOICE_NUMBER between", value1, value2, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andPreInvoiceNumberNotBetween(Long value1, Long value2) {
            addCriterion("PRE_INVOICE_NUMBER not between", value1, value2, "preInvoiceNumber");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductIsNull() {
            addCriterion("T_ALLOWED_PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductIsNotNull() {
            addCriterion("T_ALLOWED_PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductEqualTo(String value) {
            addCriterion("T_ALLOWED_PRODUCT =", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductNotEqualTo(String value) {
            addCriterion("T_ALLOWED_PRODUCT <>", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductGreaterThan(String value) {
            addCriterion("T_ALLOWED_PRODUCT >", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductGreaterThanOrEqualTo(String value) {
            addCriterion("T_ALLOWED_PRODUCT >=", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductLessThan(String value) {
            addCriterion("T_ALLOWED_PRODUCT <", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductLessThanOrEqualTo(String value) {
            addCriterion("T_ALLOWED_PRODUCT <=", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductLike(String value) {
            addCriterion("T_ALLOWED_PRODUCT like", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductNotLike(String value) {
            addCriterion("T_ALLOWED_PRODUCT not like", value, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductIn(List<String> values) {
            addCriterion("T_ALLOWED_PRODUCT in", values, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductNotIn(List<String> values) {
            addCriterion("T_ALLOWED_PRODUCT not in", values, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductBetween(String value1, String value2) {
            addCriterion("T_ALLOWED_PRODUCT between", value1, value2, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedProductNotBetween(String value1, String value2) {
            addCriterion("T_ALLOWED_PRODUCT not between", value1, value2, "tAllowedProduct");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeIsNull() {
            addCriterion("T_ALLOWED_SAM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeIsNotNull() {
            addCriterion("T_ALLOWED_SAM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeEqualTo(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE =", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeNotEqualTo(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE <>", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeGreaterThan(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE >", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeGreaterThanOrEqualTo(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE >=", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeLessThan(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE <", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeLessThanOrEqualTo(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE <=", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeLike(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE like", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeNotLike(String value) {
            addCriterion("T_ALLOWED_SAM_TYPE not like", value, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeIn(List<String> values) {
            addCriterion("T_ALLOWED_SAM_TYPE in", values, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeNotIn(List<String> values) {
            addCriterion("T_ALLOWED_SAM_TYPE not in", values, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeBetween(String value1, String value2) {
            addCriterion("T_ALLOWED_SAM_TYPE between", value1, value2, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAllowedSamTypeNotBetween(String value1, String value2) {
            addCriterion("T_ALLOWED_SAM_TYPE not between", value1, value2, "tAllowedSamType");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodIsNull() {
            addCriterion("T_ANALYSIS_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodIsNotNull() {
            addCriterion("T_ANALYSIS_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodEqualTo(String value) {
            addCriterion("T_ANALYSIS_METHOD =", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodNotEqualTo(String value) {
            addCriterion("T_ANALYSIS_METHOD <>", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodGreaterThan(String value) {
            addCriterion("T_ANALYSIS_METHOD >", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodGreaterThanOrEqualTo(String value) {
            addCriterion("T_ANALYSIS_METHOD >=", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodLessThan(String value) {
            addCriterion("T_ANALYSIS_METHOD <", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodLessThanOrEqualTo(String value) {
            addCriterion("T_ANALYSIS_METHOD <=", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodLike(String value) {
            addCriterion("T_ANALYSIS_METHOD like", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodNotLike(String value) {
            addCriterion("T_ANALYSIS_METHOD not like", value, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodIn(List<String> values) {
            addCriterion("T_ANALYSIS_METHOD in", values, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodNotIn(List<String> values) {
            addCriterion("T_ANALYSIS_METHOD not in", values, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodBetween(String value1, String value2) {
            addCriterion("T_ANALYSIS_METHOD between", value1, value2, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTAnalysisMethodNotBetween(String value1, String value2) {
            addCriterion("T_ANALYSIS_METHOD not between", value1, value2, "tAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupIsNull() {
            addCriterion("T_CHARGE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupIsNotNull() {
            addCriterion("T_CHARGE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupEqualTo(Long value) {
            addCriterion("T_CHARGE_GROUP =", value, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupNotEqualTo(Long value) {
            addCriterion("T_CHARGE_GROUP <>", value, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupGreaterThan(Long value) {
            addCriterion("T_CHARGE_GROUP >", value, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("T_CHARGE_GROUP >=", value, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupLessThan(Long value) {
            addCriterion("T_CHARGE_GROUP <", value, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupLessThanOrEqualTo(Long value) {
            addCriterion("T_CHARGE_GROUP <=", value, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupIn(List<Long> values) {
            addCriterion("T_CHARGE_GROUP in", values, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupNotIn(List<Long> values) {
            addCriterion("T_CHARGE_GROUP not in", values, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupBetween(Long value1, Long value2) {
            addCriterion("T_CHARGE_GROUP between", value1, value2, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTChargeGroupNotBetween(Long value1, Long value2) {
            addCriterion("T_CHARGE_GROUP not between", value1, value2, "tChargeGroup");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateIsNull() {
            addCriterion("T_CLIENT_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateIsNotNull() {
            addCriterion("T_CLIENT_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateEqualTo(Date value) {
            addCriterion("T_CLIENT_DUE_DATE =", value, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateNotEqualTo(Date value) {
            addCriterion("T_CLIENT_DUE_DATE <>", value, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateGreaterThan(Date value) {
            addCriterion("T_CLIENT_DUE_DATE >", value, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("T_CLIENT_DUE_DATE >=", value, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateLessThan(Date value) {
            addCriterion("T_CLIENT_DUE_DATE <", value, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateLessThanOrEqualTo(Date value) {
            addCriterion("T_CLIENT_DUE_DATE <=", value, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateIn(List<Date> values) {
            addCriterion("T_CLIENT_DUE_DATE in", values, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateNotIn(List<Date> values) {
            addCriterion("T_CLIENT_DUE_DATE not in", values, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateBetween(Date value1, Date value2) {
            addCriterion("T_CLIENT_DUE_DATE between", value1, value2, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientDueDateNotBetween(Date value1, Date value2) {
            addCriterion("T_CLIENT_DUE_DATE not between", value1, value2, "tClientDueDate");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityIsNull() {
            addCriterion("T_CLIENT_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityIsNotNull() {
            addCriterion("T_CLIENT_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityEqualTo(String value) {
            addCriterion("T_CLIENT_PRIORITY =", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityNotEqualTo(String value) {
            addCriterion("T_CLIENT_PRIORITY <>", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityGreaterThan(String value) {
            addCriterion("T_CLIENT_PRIORITY >", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("T_CLIENT_PRIORITY >=", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityLessThan(String value) {
            addCriterion("T_CLIENT_PRIORITY <", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityLessThanOrEqualTo(String value) {
            addCriterion("T_CLIENT_PRIORITY <=", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityLike(String value) {
            addCriterion("T_CLIENT_PRIORITY like", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityNotLike(String value) {
            addCriterion("T_CLIENT_PRIORITY not like", value, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityIn(List<String> values) {
            addCriterion("T_CLIENT_PRIORITY in", values, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityNotIn(List<String> values) {
            addCriterion("T_CLIENT_PRIORITY not in", values, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityBetween(String value1, String value2) {
            addCriterion("T_CLIENT_PRIORITY between", value1, value2, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientPriorityNotBetween(String value1, String value2) {
            addCriterion("T_CLIENT_PRIORITY not between", value1, value2, "tClientPriority");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundIsNull() {
            addCriterion("T_CLIENT_TURNARUND is null");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundIsNotNull() {
            addCriterion("T_CLIENT_TURNARUND is not null");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundEqualTo(String value) {
            addCriterion("T_CLIENT_TURNARUND =", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundNotEqualTo(String value) {
            addCriterion("T_CLIENT_TURNARUND <>", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundGreaterThan(String value) {
            addCriterion("T_CLIENT_TURNARUND >", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundGreaterThanOrEqualTo(String value) {
            addCriterion("T_CLIENT_TURNARUND >=", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundLessThan(String value) {
            addCriterion("T_CLIENT_TURNARUND <", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundLessThanOrEqualTo(String value) {
            addCriterion("T_CLIENT_TURNARUND <=", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundLike(String value) {
            addCriterion("T_CLIENT_TURNARUND like", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundNotLike(String value) {
            addCriterion("T_CLIENT_TURNARUND not like", value, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundIn(List<String> values) {
            addCriterion("T_CLIENT_TURNARUND in", values, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundNotIn(List<String> values) {
            addCriterion("T_CLIENT_TURNARUND not in", values, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundBetween(String value1, String value2) {
            addCriterion("T_CLIENT_TURNARUND between", value1, value2, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTClientTurnarundNotBetween(String value1, String value2) {
            addCriterion("T_CLIENT_TURNARUND not between", value1, value2, "tClientTurnarund");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupIsNull() {
            addCriterion("T_CONTAINER_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupIsNotNull() {
            addCriterion("T_CONTAINER_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupEqualTo(String value) {
            addCriterion("T_CONTAINER_GROUP =", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupNotEqualTo(String value) {
            addCriterion("T_CONTAINER_GROUP <>", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupGreaterThan(String value) {
            addCriterion("T_CONTAINER_GROUP >", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("T_CONTAINER_GROUP >=", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupLessThan(String value) {
            addCriterion("T_CONTAINER_GROUP <", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupLessThanOrEqualTo(String value) {
            addCriterion("T_CONTAINER_GROUP <=", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupLike(String value) {
            addCriterion("T_CONTAINER_GROUP like", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupNotLike(String value) {
            addCriterion("T_CONTAINER_GROUP not like", value, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupIn(List<String> values) {
            addCriterion("T_CONTAINER_GROUP in", values, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupNotIn(List<String> values) {
            addCriterion("T_CONTAINER_GROUP not in", values, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupBetween(String value1, String value2) {
            addCriterion("T_CONTAINER_GROUP between", value1, value2, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTContainerGroupNotBetween(String value1, String value2) {
            addCriterion("T_CONTAINER_GROUP not between", value1, value2, "tContainerGroup");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledIsNull() {
            addCriterion("T_DATE_ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledIsNotNull() {
            addCriterion("T_DATE_ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledEqualTo(Date value) {
            addCriterion("T_DATE_ENABLED =", value, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledNotEqualTo(Date value) {
            addCriterion("T_DATE_ENABLED <>", value, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledGreaterThan(Date value) {
            addCriterion("T_DATE_ENABLED >", value, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledGreaterThanOrEqualTo(Date value) {
            addCriterion("T_DATE_ENABLED >=", value, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledLessThan(Date value) {
            addCriterion("T_DATE_ENABLED <", value, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledLessThanOrEqualTo(Date value) {
            addCriterion("T_DATE_ENABLED <=", value, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledIn(List<Date> values) {
            addCriterion("T_DATE_ENABLED in", values, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledNotIn(List<Date> values) {
            addCriterion("T_DATE_ENABLED not in", values, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledBetween(Date value1, Date value2) {
            addCriterion("T_DATE_ENABLED between", value1, value2, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTDateEnabledNotBetween(Date value1, Date value2) {
            addCriterion("T_DATE_ENABLED not between", value1, value2, "tDateEnabled");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateIsNull() {
            addCriterion("T_EXT_REQUEST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateIsNotNull() {
            addCriterion("T_EXT_REQUEST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateEqualTo(Date value) {
            addCriterion("T_EXT_REQUEST_DATE =", value, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateNotEqualTo(Date value) {
            addCriterion("T_EXT_REQUEST_DATE <>", value, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateGreaterThan(Date value) {
            addCriterion("T_EXT_REQUEST_DATE >", value, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateGreaterThanOrEqualTo(Date value) {
            addCriterion("T_EXT_REQUEST_DATE >=", value, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateLessThan(Date value) {
            addCriterion("T_EXT_REQUEST_DATE <", value, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateLessThanOrEqualTo(Date value) {
            addCriterion("T_EXT_REQUEST_DATE <=", value, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateIn(List<Date> values) {
            addCriterion("T_EXT_REQUEST_DATE in", values, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateNotIn(List<Date> values) {
            addCriterion("T_EXT_REQUEST_DATE not in", values, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateBetween(Date value1, Date value2) {
            addCriterion("T_EXT_REQUEST_DATE between", value1, value2, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTExtRequestDateNotBetween(Date value1, Date value2) {
            addCriterion("T_EXT_REQUEST_DATE not between", value1, value2, "tExtRequestDate");
            return (Criteria) this;
        }

        public Criteria andTInstTestsIsNull() {
            addCriterion("T_INST_TESTS is null");
            return (Criteria) this;
        }

        public Criteria andTInstTestsIsNotNull() {
            addCriterion("T_INST_TESTS is not null");
            return (Criteria) this;
        }

        public Criteria andTInstTestsEqualTo(String value) {
            addCriterion("T_INST_TESTS =", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsNotEqualTo(String value) {
            addCriterion("T_INST_TESTS <>", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsGreaterThan(String value) {
            addCriterion("T_INST_TESTS >", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsGreaterThanOrEqualTo(String value) {
            addCriterion("T_INST_TESTS >=", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsLessThan(String value) {
            addCriterion("T_INST_TESTS <", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsLessThanOrEqualTo(String value) {
            addCriterion("T_INST_TESTS <=", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsLike(String value) {
            addCriterion("T_INST_TESTS like", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsNotLike(String value) {
            addCriterion("T_INST_TESTS not like", value, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsIn(List<String> values) {
            addCriterion("T_INST_TESTS in", values, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsNotIn(List<String> values) {
            addCriterion("T_INST_TESTS not in", values, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsBetween(String value1, String value2) {
            addCriterion("T_INST_TESTS between", value1, value2, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTInstTestsNotBetween(String value1, String value2) {
            addCriterion("T_INST_TESTS not between", value1, value2, "tInstTests");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateIsNull() {
            addCriterion("T_LAB_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateIsNotNull() {
            addCriterion("T_LAB_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateEqualTo(Date value) {
            addCriterion("T_LAB_DUE_DATE =", value, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateNotEqualTo(Date value) {
            addCriterion("T_LAB_DUE_DATE <>", value, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateGreaterThan(Date value) {
            addCriterion("T_LAB_DUE_DATE >", value, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("T_LAB_DUE_DATE >=", value, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateLessThan(Date value) {
            addCriterion("T_LAB_DUE_DATE <", value, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateLessThanOrEqualTo(Date value) {
            addCriterion("T_LAB_DUE_DATE <=", value, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateIn(List<Date> values) {
            addCriterion("T_LAB_DUE_DATE in", values, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateNotIn(List<Date> values) {
            addCriterion("T_LAB_DUE_DATE not in", values, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateBetween(Date value1, Date value2) {
            addCriterion("T_LAB_DUE_DATE between", value1, value2, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTLabDueDateNotBetween(Date value1, Date value2) {
            addCriterion("T_LAB_DUE_DATE not between", value1, value2, "tLabDueDate");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationIsNull() {
            addCriterion("T_NEEDS_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationIsNotNull() {
            addCriterion("T_NEEDS_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationEqualTo(String value) {
            addCriterion("T_NEEDS_LOCATION =", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationNotEqualTo(String value) {
            addCriterion("T_NEEDS_LOCATION <>", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationGreaterThan(String value) {
            addCriterion("T_NEEDS_LOCATION >", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("T_NEEDS_LOCATION >=", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationLessThan(String value) {
            addCriterion("T_NEEDS_LOCATION <", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationLessThanOrEqualTo(String value) {
            addCriterion("T_NEEDS_LOCATION <=", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationLike(String value) {
            addCriterion("T_NEEDS_LOCATION like", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationNotLike(String value) {
            addCriterion("T_NEEDS_LOCATION not like", value, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationIn(List<String> values) {
            addCriterion("T_NEEDS_LOCATION in", values, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationNotIn(List<String> values) {
            addCriterion("T_NEEDS_LOCATION not in", values, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationBetween(String value1, String value2) {
            addCriterion("T_NEEDS_LOCATION between", value1, value2, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTNeedsLocationNotBetween(String value1, String value2) {
            addCriterion("T_NEEDS_LOCATION not between", value1, value2, "tNeedsLocation");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisIsNull() {
            addCriterion("T_PREP_ANALYSIS is null");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisIsNotNull() {
            addCriterion("T_PREP_ANALYSIS is not null");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS =", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisNotEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS <>", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGreaterThan(String value) {
            addCriterion("T_PREP_ANALYSIS >", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGreaterThanOrEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS >=", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisLessThan(String value) {
            addCriterion("T_PREP_ANALYSIS <", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisLessThanOrEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS <=", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisLike(String value) {
            addCriterion("T_PREP_ANALYSIS like", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisNotLike(String value) {
            addCriterion("T_PREP_ANALYSIS not like", value, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisIn(List<String> values) {
            addCriterion("T_PREP_ANALYSIS in", values, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisNotIn(List<String> values) {
            addCriterion("T_PREP_ANALYSIS not in", values, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisBetween(String value1, String value2) {
            addCriterion("T_PREP_ANALYSIS between", value1, value2, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisNotBetween(String value1, String value2) {
            addCriterion("T_PREP_ANALYSIS not between", value1, value2, "tPrepAnalysis");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpIsNull() {
            addCriterion("T_PREP_ANALYSIS_GRP is null");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpIsNotNull() {
            addCriterion("T_PREP_ANALYSIS_GRP is not null");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP =", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpNotEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP <>", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpGreaterThan(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP >", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpGreaterThanOrEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP >=", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpLessThan(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP <", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpLessThanOrEqualTo(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP <=", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpLike(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP like", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpNotLike(String value) {
            addCriterion("T_PREP_ANALYSIS_GRP not like", value, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpIn(List<String> values) {
            addCriterion("T_PREP_ANALYSIS_GRP in", values, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpNotIn(List<String> values) {
            addCriterion("T_PREP_ANALYSIS_GRP not in", values, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpBetween(String value1, String value2) {
            addCriterion("T_PREP_ANALYSIS_GRP between", value1, value2, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepAnalysisGrpNotBetween(String value1, String value2) {
            addCriterion("T_PREP_ANALYSIS_GRP not between", value1, value2, "tPrepAnalysisGrp");
            return (Criteria) this;
        }

        public Criteria andTPrepTestIsNull() {
            addCriterion("T_PREP_TEST is null");
            return (Criteria) this;
        }

        public Criteria andTPrepTestIsNotNull() {
            addCriterion("T_PREP_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andTPrepTestEqualTo(Long value) {
            addCriterion("T_PREP_TEST =", value, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestNotEqualTo(Long value) {
            addCriterion("T_PREP_TEST <>", value, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestGreaterThan(Long value) {
            addCriterion("T_PREP_TEST >", value, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestGreaterThanOrEqualTo(Long value) {
            addCriterion("T_PREP_TEST >=", value, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestLessThan(Long value) {
            addCriterion("T_PREP_TEST <", value, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestLessThanOrEqualTo(Long value) {
            addCriterion("T_PREP_TEST <=", value, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestIn(List<Long> values) {
            addCriterion("T_PREP_TEST in", values, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestNotIn(List<Long> values) {
            addCriterion("T_PREP_TEST not in", values, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestBetween(Long value1, Long value2) {
            addCriterion("T_PREP_TEST between", value1, value2, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTPrepTestNotBetween(Long value1, Long value2) {
            addCriterion("T_PREP_TEST not between", value1, value2, "tPrepTest");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceIsNull() {
            addCriterion("T_QC_REFERENCE is null");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceIsNotNull() {
            addCriterion("T_QC_REFERENCE is not null");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceEqualTo(Long value) {
            addCriterion("T_QC_REFERENCE =", value, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceNotEqualTo(Long value) {
            addCriterion("T_QC_REFERENCE <>", value, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceGreaterThan(Long value) {
            addCriterion("T_QC_REFERENCE >", value, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceGreaterThanOrEqualTo(Long value) {
            addCriterion("T_QC_REFERENCE >=", value, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceLessThan(Long value) {
            addCriterion("T_QC_REFERENCE <", value, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceLessThanOrEqualTo(Long value) {
            addCriterion("T_QC_REFERENCE <=", value, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceIn(List<Long> values) {
            addCriterion("T_QC_REFERENCE in", values, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceNotIn(List<Long> values) {
            addCriterion("T_QC_REFERENCE not in", values, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceBetween(Long value1, Long value2) {
            addCriterion("T_QC_REFERENCE between", value1, value2, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTQcReferenceNotBetween(Long value1, Long value2) {
            addCriterion("T_QC_REFERENCE not between", value1, value2, "tQcReference");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderIsNull() {
            addCriterion("T_REPORT_HEADER is null");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderIsNotNull() {
            addCriterion("T_REPORT_HEADER is not null");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderEqualTo(String value) {
            addCriterion("T_REPORT_HEADER =", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderNotEqualTo(String value) {
            addCriterion("T_REPORT_HEADER <>", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderGreaterThan(String value) {
            addCriterion("T_REPORT_HEADER >", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("T_REPORT_HEADER >=", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderLessThan(String value) {
            addCriterion("T_REPORT_HEADER <", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderLessThanOrEqualTo(String value) {
            addCriterion("T_REPORT_HEADER <=", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderLike(String value) {
            addCriterion("T_REPORT_HEADER like", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderNotLike(String value) {
            addCriterion("T_REPORT_HEADER not like", value, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderIn(List<String> values) {
            addCriterion("T_REPORT_HEADER in", values, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderNotIn(List<String> values) {
            addCriterion("T_REPORT_HEADER not in", values, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderBetween(String value1, String value2) {
            addCriterion("T_REPORT_HEADER between", value1, value2, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTReportHeaderNotBetween(String value1, String value2) {
            addCriterion("T_REPORT_HEADER not between", value1, value2, "tReportHeader");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaIsNull() {
            addCriterion("T_TURNAROUND_ACTUA is null");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaIsNotNull() {
            addCriterion("T_TURNAROUND_ACTUA is not null");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaEqualTo(Long value) {
            addCriterion("T_TURNAROUND_ACTUA =", value, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaNotEqualTo(Long value) {
            addCriterion("T_TURNAROUND_ACTUA <>", value, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaGreaterThan(Long value) {
            addCriterion("T_TURNAROUND_ACTUA >", value, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaGreaterThanOrEqualTo(Long value) {
            addCriterion("T_TURNAROUND_ACTUA >=", value, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaLessThan(Long value) {
            addCriterion("T_TURNAROUND_ACTUA <", value, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaLessThanOrEqualTo(Long value) {
            addCriterion("T_TURNAROUND_ACTUA <=", value, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaIn(List<Long> values) {
            addCriterion("T_TURNAROUND_ACTUA in", values, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaNotIn(List<Long> values) {
            addCriterion("T_TURNAROUND_ACTUA not in", values, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaBetween(Long value1, Long value2) {
            addCriterion("T_TURNAROUND_ACTUA between", value1, value2, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundActuaNotBetween(Long value1, Long value2) {
            addCriterion("T_TURNAROUND_ACTUA not between", value1, value2, "tTurnaroundActua");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargIsNull() {
            addCriterion("T_TURNAROUND_CHARG is null");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargIsNotNull() {
            addCriterion("T_TURNAROUND_CHARG is not null");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargEqualTo(Long value) {
            addCriterion("T_TURNAROUND_CHARG =", value, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargNotEqualTo(Long value) {
            addCriterion("T_TURNAROUND_CHARG <>", value, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargGreaterThan(Long value) {
            addCriterion("T_TURNAROUND_CHARG >", value, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargGreaterThanOrEqualTo(Long value) {
            addCriterion("T_TURNAROUND_CHARG >=", value, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargLessThan(Long value) {
            addCriterion("T_TURNAROUND_CHARG <", value, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargLessThanOrEqualTo(Long value) {
            addCriterion("T_TURNAROUND_CHARG <=", value, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargIn(List<Long> values) {
            addCriterion("T_TURNAROUND_CHARG in", values, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargNotIn(List<Long> values) {
            addCriterion("T_TURNAROUND_CHARG not in", values, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargBetween(Long value1, Long value2) {
            addCriterion("T_TURNAROUND_CHARG between", value1, value2, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundChargNotBetween(Long value1, Long value2) {
            addCriterion("T_TURNAROUND_CHARG not between", value1, value2, "tTurnaroundCharg");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetIsNull() {
            addCriterion("T_TURNAROUND_MET is null");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetIsNotNull() {
            addCriterion("T_TURNAROUND_MET is not null");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetEqualTo(String value) {
            addCriterion("T_TURNAROUND_MET =", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetNotEqualTo(String value) {
            addCriterion("T_TURNAROUND_MET <>", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetGreaterThan(String value) {
            addCriterion("T_TURNAROUND_MET >", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetGreaterThanOrEqualTo(String value) {
            addCriterion("T_TURNAROUND_MET >=", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetLessThan(String value) {
            addCriterion("T_TURNAROUND_MET <", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetLessThanOrEqualTo(String value) {
            addCriterion("T_TURNAROUND_MET <=", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetLike(String value) {
            addCriterion("T_TURNAROUND_MET like", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetNotLike(String value) {
            addCriterion("T_TURNAROUND_MET not like", value, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetIn(List<String> values) {
            addCriterion("T_TURNAROUND_MET in", values, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetNotIn(List<String> values) {
            addCriterion("T_TURNAROUND_MET not in", values, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetBetween(String value1, String value2) {
            addCriterion("T_TURNAROUND_MET between", value1, value2, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andTTurnaroundMetNotBetween(String value1, String value2) {
            addCriterion("T_TURNAROUND_MET not between", value1, value2, "tTurnaroundMet");
            return (Criteria) this;
        }

        public Criteria andCCertificationsIsNull() {
            addCriterion("C_CERTIFICATIONS is null");
            return (Criteria) this;
        }

        public Criteria andCCertificationsIsNotNull() {
            addCriterion("C_CERTIFICATIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCCertificationsEqualTo(String value) {
            addCriterion("C_CERTIFICATIONS =", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsNotEqualTo(String value) {
            addCriterion("C_CERTIFICATIONS <>", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsGreaterThan(String value) {
            addCriterion("C_CERTIFICATIONS >", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsGreaterThanOrEqualTo(String value) {
            addCriterion("C_CERTIFICATIONS >=", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsLessThan(String value) {
            addCriterion("C_CERTIFICATIONS <", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsLessThanOrEqualTo(String value) {
            addCriterion("C_CERTIFICATIONS <=", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsLike(String value) {
            addCriterion("C_CERTIFICATIONS like", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsNotLike(String value) {
            addCriterion("C_CERTIFICATIONS not like", value, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsIn(List<String> values) {
            addCriterion("C_CERTIFICATIONS in", values, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsNotIn(List<String> values) {
            addCriterion("C_CERTIFICATIONS not in", values, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsBetween(String value1, String value2) {
            addCriterion("C_CERTIFICATIONS between", value1, value2, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCCertificationsNotBetween(String value1, String value2) {
            addCriterion("C_CERTIFICATIONS not between", value1, value2, "cCertifications");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumIsNull() {
            addCriterion("C_TASK_SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumIsNotNull() {
            addCriterion("C_TASK_SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM =", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumNotEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM <>", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumGreaterThan(Long value) {
            addCriterion("C_TASK_SEQ_NUM >", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM >=", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumLessThan(Long value) {
            addCriterion("C_TASK_SEQ_NUM <", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("C_TASK_SEQ_NUM <=", value, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumIn(List<Long> values) {
            addCriterion("C_TASK_SEQ_NUM in", values, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumNotIn(List<Long> values) {
            addCriterion("C_TASK_SEQ_NUM not in", values, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumBetween(Long value1, Long value2) {
            addCriterion("C_TASK_SEQ_NUM between", value1, value2, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCTaskSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("C_TASK_SEQ_NUM not between", value1, value2, "cTaskSeqNum");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameIsNull() {
            addCriterion("C_ATT1_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameIsNotNull() {
            addCriterion("C_ATT1_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameEqualTo(String value) {
            addCriterion("C_ATT1_NAME =", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameNotEqualTo(String value) {
            addCriterion("C_ATT1_NAME <>", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameGreaterThan(String value) {
            addCriterion("C_ATT1_NAME >", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT1_NAME >=", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameLessThan(String value) {
            addCriterion("C_ATT1_NAME <", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT1_NAME <=", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameLike(String value) {
            addCriterion("C_ATT1_NAME like", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameNotLike(String value) {
            addCriterion("C_ATT1_NAME not like", value, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameIn(List<String> values) {
            addCriterion("C_ATT1_NAME in", values, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameNotIn(List<String> values) {
            addCriterion("C_ATT1_NAME not in", values, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameBetween(String value1, String value2) {
            addCriterion("C_ATT1_NAME between", value1, value2, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT1_NAME not between", value1, value2, "cAtt1Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameIsNull() {
            addCriterion("C_ATT2_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameIsNotNull() {
            addCriterion("C_ATT2_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameEqualTo(String value) {
            addCriterion("C_ATT2_NAME =", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameNotEqualTo(String value) {
            addCriterion("C_ATT2_NAME <>", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameGreaterThan(String value) {
            addCriterion("C_ATT2_NAME >", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT2_NAME >=", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameLessThan(String value) {
            addCriterion("C_ATT2_NAME <", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT2_NAME <=", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameLike(String value) {
            addCriterion("C_ATT2_NAME like", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameNotLike(String value) {
            addCriterion("C_ATT2_NAME not like", value, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameIn(List<String> values) {
            addCriterion("C_ATT2_NAME in", values, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameNotIn(List<String> values) {
            addCriterion("C_ATT2_NAME not in", values, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameBetween(String value1, String value2) {
            addCriterion("C_ATT2_NAME between", value1, value2, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt2NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT2_NAME not between", value1, value2, "cAtt2Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameIsNull() {
            addCriterion("C_ATT3_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameIsNotNull() {
            addCriterion("C_ATT3_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameEqualTo(String value) {
            addCriterion("C_ATT3_NAME =", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameNotEqualTo(String value) {
            addCriterion("C_ATT3_NAME <>", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameGreaterThan(String value) {
            addCriterion("C_ATT3_NAME >", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT3_NAME >=", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameLessThan(String value) {
            addCriterion("C_ATT3_NAME <", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT3_NAME <=", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameLike(String value) {
            addCriterion("C_ATT3_NAME like", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameNotLike(String value) {
            addCriterion("C_ATT3_NAME not like", value, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameIn(List<String> values) {
            addCriterion("C_ATT3_NAME in", values, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameNotIn(List<String> values) {
            addCriterion("C_ATT3_NAME not in", values, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameBetween(String value1, String value2) {
            addCriterion("C_ATT3_NAME between", value1, value2, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt3NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT3_NAME not between", value1, value2, "cAtt3Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameIsNull() {
            addCriterion("C_ATT4_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameIsNotNull() {
            addCriterion("C_ATT4_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameEqualTo(String value) {
            addCriterion("C_ATT4_NAME =", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameNotEqualTo(String value) {
            addCriterion("C_ATT4_NAME <>", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameGreaterThan(String value) {
            addCriterion("C_ATT4_NAME >", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT4_NAME >=", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameLessThan(String value) {
            addCriterion("C_ATT4_NAME <", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT4_NAME <=", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameLike(String value) {
            addCriterion("C_ATT4_NAME like", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameNotLike(String value) {
            addCriterion("C_ATT4_NAME not like", value, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameIn(List<String> values) {
            addCriterion("C_ATT4_NAME in", values, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameNotIn(List<String> values) {
            addCriterion("C_ATT4_NAME not in", values, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameBetween(String value1, String value2) {
            addCriterion("C_ATT4_NAME between", value1, value2, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt4NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT4_NAME not between", value1, value2, "cAtt4Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameIsNull() {
            addCriterion("C_ATT5_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameIsNotNull() {
            addCriterion("C_ATT5_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameEqualTo(String value) {
            addCriterion("C_ATT5_NAME =", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameNotEqualTo(String value) {
            addCriterion("C_ATT5_NAME <>", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameGreaterThan(String value) {
            addCriterion("C_ATT5_NAME >", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT5_NAME >=", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameLessThan(String value) {
            addCriterion("C_ATT5_NAME <", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT5_NAME <=", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameLike(String value) {
            addCriterion("C_ATT5_NAME like", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameNotLike(String value) {
            addCriterion("C_ATT5_NAME not like", value, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameIn(List<String> values) {
            addCriterion("C_ATT5_NAME in", values, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameNotIn(List<String> values) {
            addCriterion("C_ATT5_NAME not in", values, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameBetween(String value1, String value2) {
            addCriterion("C_ATT5_NAME between", value1, value2, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt5NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT5_NAME not between", value1, value2, "cAtt5Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameIsNull() {
            addCriterion("C_ATT6_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameIsNotNull() {
            addCriterion("C_ATT6_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameEqualTo(String value) {
            addCriterion("C_ATT6_NAME =", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameNotEqualTo(String value) {
            addCriterion("C_ATT6_NAME <>", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameGreaterThan(String value) {
            addCriterion("C_ATT6_NAME >", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT6_NAME >=", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameLessThan(String value) {
            addCriterion("C_ATT6_NAME <", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT6_NAME <=", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameLike(String value) {
            addCriterion("C_ATT6_NAME like", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameNotLike(String value) {
            addCriterion("C_ATT6_NAME not like", value, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameIn(List<String> values) {
            addCriterion("C_ATT6_NAME in", values, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameNotIn(List<String> values) {
            addCriterion("C_ATT6_NAME not in", values, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameBetween(String value1, String value2) {
            addCriterion("C_ATT6_NAME between", value1, value2, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt6NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT6_NAME not between", value1, value2, "cAtt6Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameIsNull() {
            addCriterion("C_ATT7_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameIsNotNull() {
            addCriterion("C_ATT7_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameEqualTo(String value) {
            addCriterion("C_ATT7_NAME =", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameNotEqualTo(String value) {
            addCriterion("C_ATT7_NAME <>", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameGreaterThan(String value) {
            addCriterion("C_ATT7_NAME >", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT7_NAME >=", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameLessThan(String value) {
            addCriterion("C_ATT7_NAME <", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT7_NAME <=", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameLike(String value) {
            addCriterion("C_ATT7_NAME like", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameNotLike(String value) {
            addCriterion("C_ATT7_NAME not like", value, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameIn(List<String> values) {
            addCriterion("C_ATT7_NAME in", values, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameNotIn(List<String> values) {
            addCriterion("C_ATT7_NAME not in", values, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameBetween(String value1, String value2) {
            addCriterion("C_ATT7_NAME between", value1, value2, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt7NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT7_NAME not between", value1, value2, "cAtt7Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameIsNull() {
            addCriterion("C_ATT8_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameIsNotNull() {
            addCriterion("C_ATT8_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameEqualTo(String value) {
            addCriterion("C_ATT8_NAME =", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameNotEqualTo(String value) {
            addCriterion("C_ATT8_NAME <>", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameGreaterThan(String value) {
            addCriterion("C_ATT8_NAME >", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT8_NAME >=", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameLessThan(String value) {
            addCriterion("C_ATT8_NAME <", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameLessThanOrEqualTo(String value) {
            addCriterion("C_ATT8_NAME <=", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameLike(String value) {
            addCriterion("C_ATT8_NAME like", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameNotLike(String value) {
            addCriterion("C_ATT8_NAME not like", value, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameIn(List<String> values) {
            addCriterion("C_ATT8_NAME in", values, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameNotIn(List<String> values) {
            addCriterion("C_ATT8_NAME not in", values, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameBetween(String value1, String value2) {
            addCriterion("C_ATT8_NAME between", value1, value2, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt8NameNotBetween(String value1, String value2) {
            addCriterion("C_ATT8_NAME not between", value1, value2, "cAtt8Name");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentIsNull() {
            addCriterion("C_ATT1_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentIsNotNull() {
            addCriterion("C_ATT1_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentEqualTo(String value) {
            addCriterion("C_ATT1_CONTENT =", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentNotEqualTo(String value) {
            addCriterion("C_ATT1_CONTENT <>", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentGreaterThan(String value) {
            addCriterion("C_ATT1_CONTENT >", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT1_CONTENT >=", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentLessThan(String value) {
            addCriterion("C_ATT1_CONTENT <", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT1_CONTENT <=", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentLike(String value) {
            addCriterion("C_ATT1_CONTENT like", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentNotLike(String value) {
            addCriterion("C_ATT1_CONTENT not like", value, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentIn(List<String> values) {
            addCriterion("C_ATT1_CONTENT in", values, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentNotIn(List<String> values) {
            addCriterion("C_ATT1_CONTENT not in", values, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentBetween(String value1, String value2) {
            addCriterion("C_ATT1_CONTENT between", value1, value2, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt1ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT1_CONTENT not between", value1, value2, "cAtt1Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentIsNull() {
            addCriterion("C_ATT2_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentIsNotNull() {
            addCriterion("C_ATT2_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentEqualTo(String value) {
            addCriterion("C_ATT2_CONTENT =", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentNotEqualTo(String value) {
            addCriterion("C_ATT2_CONTENT <>", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentGreaterThan(String value) {
            addCriterion("C_ATT2_CONTENT >", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT2_CONTENT >=", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentLessThan(String value) {
            addCriterion("C_ATT2_CONTENT <", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT2_CONTENT <=", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentLike(String value) {
            addCriterion("C_ATT2_CONTENT like", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentNotLike(String value) {
            addCriterion("C_ATT2_CONTENT not like", value, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentIn(List<String> values) {
            addCriterion("C_ATT2_CONTENT in", values, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentNotIn(List<String> values) {
            addCriterion("C_ATT2_CONTENT not in", values, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentBetween(String value1, String value2) {
            addCriterion("C_ATT2_CONTENT between", value1, value2, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt2ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT2_CONTENT not between", value1, value2, "cAtt2Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentIsNull() {
            addCriterion("C_ATT3_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentIsNotNull() {
            addCriterion("C_ATT3_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentEqualTo(String value) {
            addCriterion("C_ATT3_CONTENT =", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentNotEqualTo(String value) {
            addCriterion("C_ATT3_CONTENT <>", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentGreaterThan(String value) {
            addCriterion("C_ATT3_CONTENT >", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT3_CONTENT >=", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentLessThan(String value) {
            addCriterion("C_ATT3_CONTENT <", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT3_CONTENT <=", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentLike(String value) {
            addCriterion("C_ATT3_CONTENT like", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentNotLike(String value) {
            addCriterion("C_ATT3_CONTENT not like", value, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentIn(List<String> values) {
            addCriterion("C_ATT3_CONTENT in", values, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentNotIn(List<String> values) {
            addCriterion("C_ATT3_CONTENT not in", values, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentBetween(String value1, String value2) {
            addCriterion("C_ATT3_CONTENT between", value1, value2, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt3ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT3_CONTENT not between", value1, value2, "cAtt3Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentIsNull() {
            addCriterion("C_ATT4_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentIsNotNull() {
            addCriterion("C_ATT4_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentEqualTo(String value) {
            addCriterion("C_ATT4_CONTENT =", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentNotEqualTo(String value) {
            addCriterion("C_ATT4_CONTENT <>", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentGreaterThan(String value) {
            addCriterion("C_ATT4_CONTENT >", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT4_CONTENT >=", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentLessThan(String value) {
            addCriterion("C_ATT4_CONTENT <", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT4_CONTENT <=", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentLike(String value) {
            addCriterion("C_ATT4_CONTENT like", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentNotLike(String value) {
            addCriterion("C_ATT4_CONTENT not like", value, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentIn(List<String> values) {
            addCriterion("C_ATT4_CONTENT in", values, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentNotIn(List<String> values) {
            addCriterion("C_ATT4_CONTENT not in", values, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentBetween(String value1, String value2) {
            addCriterion("C_ATT4_CONTENT between", value1, value2, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt4ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT4_CONTENT not between", value1, value2, "cAtt4Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentIsNull() {
            addCriterion("C_ATT5_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentIsNotNull() {
            addCriterion("C_ATT5_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentEqualTo(String value) {
            addCriterion("C_ATT5_CONTENT =", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentNotEqualTo(String value) {
            addCriterion("C_ATT5_CONTENT <>", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentGreaterThan(String value) {
            addCriterion("C_ATT5_CONTENT >", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT5_CONTENT >=", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentLessThan(String value) {
            addCriterion("C_ATT5_CONTENT <", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT5_CONTENT <=", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentLike(String value) {
            addCriterion("C_ATT5_CONTENT like", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentNotLike(String value) {
            addCriterion("C_ATT5_CONTENT not like", value, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentIn(List<String> values) {
            addCriterion("C_ATT5_CONTENT in", values, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentNotIn(List<String> values) {
            addCriterion("C_ATT5_CONTENT not in", values, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentBetween(String value1, String value2) {
            addCriterion("C_ATT5_CONTENT between", value1, value2, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt5ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT5_CONTENT not between", value1, value2, "cAtt5Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentIsNull() {
            addCriterion("C_ATT6_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentIsNotNull() {
            addCriterion("C_ATT6_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentEqualTo(String value) {
            addCriterion("C_ATT6_CONTENT =", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentNotEqualTo(String value) {
            addCriterion("C_ATT6_CONTENT <>", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentGreaterThan(String value) {
            addCriterion("C_ATT6_CONTENT >", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT6_CONTENT >=", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentLessThan(String value) {
            addCriterion("C_ATT6_CONTENT <", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT6_CONTENT <=", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentLike(String value) {
            addCriterion("C_ATT6_CONTENT like", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentNotLike(String value) {
            addCriterion("C_ATT6_CONTENT not like", value, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentIn(List<String> values) {
            addCriterion("C_ATT6_CONTENT in", values, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentNotIn(List<String> values) {
            addCriterion("C_ATT6_CONTENT not in", values, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentBetween(String value1, String value2) {
            addCriterion("C_ATT6_CONTENT between", value1, value2, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt6ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT6_CONTENT not between", value1, value2, "cAtt6Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentIsNull() {
            addCriterion("C_ATT7_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentIsNotNull() {
            addCriterion("C_ATT7_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentEqualTo(String value) {
            addCriterion("C_ATT7_CONTENT =", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentNotEqualTo(String value) {
            addCriterion("C_ATT7_CONTENT <>", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentGreaterThan(String value) {
            addCriterion("C_ATT7_CONTENT >", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT7_CONTENT >=", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentLessThan(String value) {
            addCriterion("C_ATT7_CONTENT <", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT7_CONTENT <=", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentLike(String value) {
            addCriterion("C_ATT7_CONTENT like", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentNotLike(String value) {
            addCriterion("C_ATT7_CONTENT not like", value, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentIn(List<String> values) {
            addCriterion("C_ATT7_CONTENT in", values, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentNotIn(List<String> values) {
            addCriterion("C_ATT7_CONTENT not in", values, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentBetween(String value1, String value2) {
            addCriterion("C_ATT7_CONTENT between", value1, value2, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt7ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT7_CONTENT not between", value1, value2, "cAtt7Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentIsNull() {
            addCriterion("C_ATT8_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentIsNotNull() {
            addCriterion("C_ATT8_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentEqualTo(String value) {
            addCriterion("C_ATT8_CONTENT =", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentNotEqualTo(String value) {
            addCriterion("C_ATT8_CONTENT <>", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentGreaterThan(String value) {
            addCriterion("C_ATT8_CONTENT >", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentGreaterThanOrEqualTo(String value) {
            addCriterion("C_ATT8_CONTENT >=", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentLessThan(String value) {
            addCriterion("C_ATT8_CONTENT <", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentLessThanOrEqualTo(String value) {
            addCriterion("C_ATT8_CONTENT <=", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentLike(String value) {
            addCriterion("C_ATT8_CONTENT like", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentNotLike(String value) {
            addCriterion("C_ATT8_CONTENT not like", value, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentIn(List<String> values) {
            addCriterion("C_ATT8_CONTENT in", values, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentNotIn(List<String> values) {
            addCriterion("C_ATT8_CONTENT not in", values, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentBetween(String value1, String value2) {
            addCriterion("C_ATT8_CONTENT between", value1, value2, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCAtt8ContentNotBetween(String value1, String value2) {
            addCriterion("C_ATT8_CONTENT not between", value1, value2, "cAtt8Content");
            return (Criteria) this;
        }

        public Criteria andCTestTypeIsNull() {
            addCriterion("C_TEST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCTestTypeIsNotNull() {
            addCriterion("C_TEST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCTestTypeEqualTo(String value) {
            addCriterion("C_TEST_TYPE =", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeNotEqualTo(String value) {
            addCriterion("C_TEST_TYPE <>", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeGreaterThan(String value) {
            addCriterion("C_TEST_TYPE >", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_TEST_TYPE >=", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeLessThan(String value) {
            addCriterion("C_TEST_TYPE <", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeLessThanOrEqualTo(String value) {
            addCriterion("C_TEST_TYPE <=", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeLike(String value) {
            addCriterion("C_TEST_TYPE like", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeNotLike(String value) {
            addCriterion("C_TEST_TYPE not like", value, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeIn(List<String> values) {
            addCriterion("C_TEST_TYPE in", values, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeNotIn(List<String> values) {
            addCriterion("C_TEST_TYPE not in", values, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeBetween(String value1, String value2) {
            addCriterion("C_TEST_TYPE between", value1, value2, "cTestType");
            return (Criteria) this;
        }

        public Criteria andCTestTypeNotBetween(String value1, String value2) {
            addCriterion("C_TEST_TYPE not between", value1, value2, "cTestType");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNull() {
            addCriterion("TRANS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTransNumIsNotNull() {
            addCriterion("TRANS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTransNumEqualTo(Long value) {
            addCriterion("TRANS_NUM =", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotEqualTo(Long value) {
            addCriterion("TRANS_NUM <>", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThan(Long value) {
            addCriterion("TRANS_NUM >", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANS_NUM >=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThan(Long value) {
            addCriterion("TRANS_NUM <", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumLessThanOrEqualTo(Long value) {
            addCriterion("TRANS_NUM <=", value, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumIn(List<Long> values) {
            addCriterion("TRANS_NUM in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotIn(List<Long> values) {
            addCriterion("TRANS_NUM not in", values, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumBetween(Long value1, Long value2) {
            addCriterion("TRANS_NUM between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andTransNumNotBetween(Long value1, Long value2) {
            addCriterion("TRANS_NUM not between", value1, value2, "transNum");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedIsNull() {
            addCriterion("C_IF_ARRANGED is null");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedIsNotNull() {
            addCriterion("C_IF_ARRANGED is not null");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedEqualTo(String value) {
            addCriterion("C_IF_ARRANGED =", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedNotEqualTo(String value) {
            addCriterion("C_IF_ARRANGED <>", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedGreaterThan(String value) {
            addCriterion("C_IF_ARRANGED >", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedGreaterThanOrEqualTo(String value) {
            addCriterion("C_IF_ARRANGED >=", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedLessThan(String value) {
            addCriterion("C_IF_ARRANGED <", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedLessThanOrEqualTo(String value) {
            addCriterion("C_IF_ARRANGED <=", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedLike(String value) {
            addCriterion("C_IF_ARRANGED like", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedNotLike(String value) {
            addCriterion("C_IF_ARRANGED not like", value, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedIn(List<String> values) {
            addCriterion("C_IF_ARRANGED in", values, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedNotIn(List<String> values) {
            addCriterion("C_IF_ARRANGED not in", values, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedBetween(String value1, String value2) {
            addCriterion("C_IF_ARRANGED between", value1, value2, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCIfArrangedNotBetween(String value1, String value2) {
            addCriterion("C_IF_ARRANGED not between", value1, value2, "cIfArranged");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNull() {
            addCriterion("COMMON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNotNull() {
            addCriterion("COMMON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNameEqualTo(String value) {
            addCriterion("COMMON_NAME =", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotEqualTo(String value) {
            addCriterion("COMMON_NAME <>", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThan(String value) {
            addCriterion("COMMON_NAME >", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON_NAME >=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThan(String value) {
            addCriterion("COMMON_NAME <", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThanOrEqualTo(String value) {
            addCriterion("COMMON_NAME <=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLike(String value) {
            addCriterion("COMMON_NAME like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotLike(String value) {
            addCriterion("COMMON_NAME not like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameIn(List<String> values) {
            addCriterion("COMMON_NAME in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotIn(List<String> values) {
            addCriterion("COMMON_NAME not in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameBetween(String value1, String value2) {
            addCriterion("COMMON_NAME between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotBetween(String value1, String value2) {
            addCriterion("COMMON_NAME not between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andCTaskIdIsNull() {
            addCriterion("C_TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCTaskIdIsNotNull() {
            addCriterion("C_TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCTaskIdEqualTo(String value) {
            addCriterion("C_TASK_ID =", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotEqualTo(String value) {
            addCriterion("C_TASK_ID <>", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdGreaterThan(String value) {
            addCriterion("C_TASK_ID >", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("C_TASK_ID >=", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdLessThan(String value) {
            addCriterion("C_TASK_ID <", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdLessThanOrEqualTo(String value) {
            addCriterion("C_TASK_ID <=", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdLike(String value) {
            addCriterion("C_TASK_ID like", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotLike(String value) {
            addCriterion("C_TASK_ID not like", value, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdIn(List<String> values) {
            addCriterion("C_TASK_ID in", values, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotIn(List<String> values) {
            addCriterion("C_TASK_ID not in", values, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdBetween(String value1, String value2) {
            addCriterion("C_TASK_ID between", value1, value2, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCTaskIdNotBetween(String value1, String value2) {
            addCriterion("C_TASK_ID not between", value1, value2, "cTaskId");
            return (Criteria) this;
        }

        public Criteria andCConditionIsNull() {
            addCriterion("C_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andCConditionIsNotNull() {
            addCriterion("C_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andCConditionEqualTo(String value) {
            addCriterion("C_CONDITION =", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionNotEqualTo(String value) {
            addCriterion("C_CONDITION <>", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionGreaterThan(String value) {
            addCriterion("C_CONDITION >", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionGreaterThanOrEqualTo(String value) {
            addCriterion("C_CONDITION >=", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionLessThan(String value) {
            addCriterion("C_CONDITION <", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionLessThanOrEqualTo(String value) {
            addCriterion("C_CONDITION <=", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionLike(String value) {
            addCriterion("C_CONDITION like", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionNotLike(String value) {
            addCriterion("C_CONDITION not like", value, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionIn(List<String> values) {
            addCriterion("C_CONDITION in", values, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionNotIn(List<String> values) {
            addCriterion("C_CONDITION not in", values, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionBetween(String value1, String value2) {
            addCriterion("C_CONDITION between", value1, value2, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCConditionNotBetween(String value1, String value2) {
            addCriterion("C_CONDITION not between", value1, value2, "cCondition");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumIsNull() {
            addCriterion("C_ARRANGE_SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumIsNotNull() {
            addCriterion("C_ARRANGE_SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumEqualTo(Long value) {
            addCriterion("C_ARRANGE_SEQ_NUM =", value, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumNotEqualTo(Long value) {
            addCriterion("C_ARRANGE_SEQ_NUM <>", value, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumGreaterThan(Long value) {
            addCriterion("C_ARRANGE_SEQ_NUM >", value, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("C_ARRANGE_SEQ_NUM >=", value, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumLessThan(Long value) {
            addCriterion("C_ARRANGE_SEQ_NUM <", value, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("C_ARRANGE_SEQ_NUM <=", value, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumIn(List<Long> values) {
            addCriterion("C_ARRANGE_SEQ_NUM in", values, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumNotIn(List<Long> values) {
            addCriterion("C_ARRANGE_SEQ_NUM not in", values, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumBetween(Long value1, Long value2) {
            addCriterion("C_ARRANGE_SEQ_NUM between", value1, value2, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCArrangeSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("C_ARRANGE_SEQ_NUM not between", value1, value2, "cArrangeSeqNum");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewIsNull() {
            addCriterion("C_APPLY_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewIsNotNull() {
            addCriterion("C_APPLY_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewEqualTo(String value) {
            addCriterion("C_APPLY_REVIEW =", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewNotEqualTo(String value) {
            addCriterion("C_APPLY_REVIEW <>", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewGreaterThan(String value) {
            addCriterion("C_APPLY_REVIEW >", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewGreaterThanOrEqualTo(String value) {
            addCriterion("C_APPLY_REVIEW >=", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewLessThan(String value) {
            addCriterion("C_APPLY_REVIEW <", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewLessThanOrEqualTo(String value) {
            addCriterion("C_APPLY_REVIEW <=", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewLike(String value) {
            addCriterion("C_APPLY_REVIEW like", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewNotLike(String value) {
            addCriterion("C_APPLY_REVIEW not like", value, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewIn(List<String> values) {
            addCriterion("C_APPLY_REVIEW in", values, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewNotIn(List<String> values) {
            addCriterion("C_APPLY_REVIEW not in", values, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewBetween(String value1, String value2) {
            addCriterion("C_APPLY_REVIEW between", value1, value2, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCApplyReviewNotBetween(String value1, String value2) {
            addCriterion("C_APPLY_REVIEW not between", value1, value2, "cApplyReview");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeIsNull() {
            addCriterion("C_ARRANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeIsNotNull() {
            addCriterion("C_ARRANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeEqualTo(String value) {
            addCriterion("C_ARRANGE_TYPE =", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeNotEqualTo(String value) {
            addCriterion("C_ARRANGE_TYPE <>", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeGreaterThan(String value) {
            addCriterion("C_ARRANGE_TYPE >", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_ARRANGE_TYPE >=", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeLessThan(String value) {
            addCriterion("C_ARRANGE_TYPE <", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeLessThanOrEqualTo(String value) {
            addCriterion("C_ARRANGE_TYPE <=", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeLike(String value) {
            addCriterion("C_ARRANGE_TYPE like", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeNotLike(String value) {
            addCriterion("C_ARRANGE_TYPE not like", value, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeIn(List<String> values) {
            addCriterion("C_ARRANGE_TYPE in", values, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeNotIn(List<String> values) {
            addCriterion("C_ARRANGE_TYPE not in", values, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeBetween(String value1, String value2) {
            addCriterion("C_ARRANGE_TYPE between", value1, value2, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCArrangeTypeNotBetween(String value1, String value2) {
            addCriterion("C_ARRANGE_TYPE not between", value1, value2, "cArrangeType");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusIsNull() {
            addCriterion("C_TASK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusIsNotNull() {
            addCriterion("C_TASK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusEqualTo(Short value) {
            addCriterion("C_TASK_STATUS =", value, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusNotEqualTo(Short value) {
            addCriterion("C_TASK_STATUS <>", value, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusGreaterThan(Short value) {
            addCriterion("C_TASK_STATUS >", value, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("C_TASK_STATUS >=", value, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusLessThan(Short value) {
            addCriterion("C_TASK_STATUS <", value, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusLessThanOrEqualTo(Short value) {
            addCriterion("C_TASK_STATUS <=", value, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusIn(List<Short> values) {
            addCriterion("C_TASK_STATUS in", values, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusNotIn(List<Short> values) {
            addCriterion("C_TASK_STATUS not in", values, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusBetween(Short value1, Short value2) {
            addCriterion("C_TASK_STATUS between", value1, value2, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTaskStatusNotBetween(Short value1, Short value2) {
            addCriterion("C_TASK_STATUS not between", value1, value2, "cTaskStatus");
            return (Criteria) this;
        }

        public Criteria andCTestCycleIsNull() {
            addCriterion("C_TEST_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andCTestCycleIsNotNull() {
            addCriterion("C_TEST_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andCTestCycleEqualTo(Long value) {
            addCriterion("C_TEST_CYCLE =", value, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleNotEqualTo(Long value) {
            addCriterion("C_TEST_CYCLE <>", value, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleGreaterThan(Long value) {
            addCriterion("C_TEST_CYCLE >", value, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleGreaterThanOrEqualTo(Long value) {
            addCriterion("C_TEST_CYCLE >=", value, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleLessThan(Long value) {
            addCriterion("C_TEST_CYCLE <", value, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleLessThanOrEqualTo(Long value) {
            addCriterion("C_TEST_CYCLE <=", value, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleIn(List<Long> values) {
            addCriterion("C_TEST_CYCLE in", values, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleNotIn(List<Long> values) {
            addCriterion("C_TEST_CYCLE not in", values, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleBetween(Long value1, Long value2) {
            addCriterion("C_TEST_CYCLE between", value1, value2, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCTestCycleNotBetween(Long value1, Long value2) {
            addCriterion("C_TEST_CYCLE not between", value1, value2, "cTestCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleIsNull() {
            addCriterion("C_FAILURE_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleIsNotNull() {
            addCriterion("C_FAILURE_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleEqualTo(Long value) {
            addCriterion("C_FAILURE_CYCLE =", value, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleNotEqualTo(Long value) {
            addCriterion("C_FAILURE_CYCLE <>", value, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleGreaterThan(Long value) {
            addCriterion("C_FAILURE_CYCLE >", value, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleGreaterThanOrEqualTo(Long value) {
            addCriterion("C_FAILURE_CYCLE >=", value, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleLessThan(Long value) {
            addCriterion("C_FAILURE_CYCLE <", value, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleLessThanOrEqualTo(Long value) {
            addCriterion("C_FAILURE_CYCLE <=", value, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleIn(List<Long> values) {
            addCriterion("C_FAILURE_CYCLE in", values, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleNotIn(List<Long> values) {
            addCriterion("C_FAILURE_CYCLE not in", values, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleBetween(Long value1, Long value2) {
            addCriterion("C_FAILURE_CYCLE between", value1, value2, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureCycleNotBetween(Long value1, Long value2) {
            addCriterion("C_FAILURE_CYCLE not between", value1, value2, "cFailureCycle");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeIsNull() {
            addCriterion("C_FAILURE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeIsNotNull() {
            addCriterion("C_FAILURE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeEqualTo(String value) {
            addCriterion("C_FAILURE_TYPE =", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeNotEqualTo(String value) {
            addCriterion("C_FAILURE_TYPE <>", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeGreaterThan(String value) {
            addCriterion("C_FAILURE_TYPE >", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeGreaterThanOrEqualTo(String value) {
            addCriterion("C_FAILURE_TYPE >=", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeLessThan(String value) {
            addCriterion("C_FAILURE_TYPE <", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeLessThanOrEqualTo(String value) {
            addCriterion("C_FAILURE_TYPE <=", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeLike(String value) {
            addCriterion("C_FAILURE_TYPE like", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeNotLike(String value) {
            addCriterion("C_FAILURE_TYPE not like", value, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeIn(List<String> values) {
            addCriterion("C_FAILURE_TYPE in", values, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeNotIn(List<String> values) {
            addCriterion("C_FAILURE_TYPE not in", values, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeBetween(String value1, String value2) {
            addCriterion("C_FAILURE_TYPE between", value1, value2, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCFailureTypeNotBetween(String value1, String value2) {
            addCriterion("C_FAILURE_TYPE not between", value1, value2, "cFailureType");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempIsNull() {
            addCriterion("C_BASE_PARA_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempIsNotNull() {
            addCriterion("C_BASE_PARA_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempEqualTo(String value) {
            addCriterion("C_BASE_PARA_TEMP =", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempNotEqualTo(String value) {
            addCriterion("C_BASE_PARA_TEMP <>", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempGreaterThan(String value) {
            addCriterion("C_BASE_PARA_TEMP >", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempGreaterThanOrEqualTo(String value) {
            addCriterion("C_BASE_PARA_TEMP >=", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempLessThan(String value) {
            addCriterion("C_BASE_PARA_TEMP <", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempLessThanOrEqualTo(String value) {
            addCriterion("C_BASE_PARA_TEMP <=", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempLike(String value) {
            addCriterion("C_BASE_PARA_TEMP like", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempNotLike(String value) {
            addCriterion("C_BASE_PARA_TEMP not like", value, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempIn(List<String> values) {
            addCriterion("C_BASE_PARA_TEMP in", values, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempNotIn(List<String> values) {
            addCriterion("C_BASE_PARA_TEMP not in", values, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempBetween(String value1, String value2) {
            addCriterion("C_BASE_PARA_TEMP between", value1, value2, "cBaseParaTemp");
            return (Criteria) this;
        }

        public Criteria andCBaseParaTempNotBetween(String value1, String value2) {
            addCriterion("C_BASE_PARA_TEMP not between", value1, value2, "cBaseParaTemp");
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

        public Criteria andTsEqualTo(String value) {
            addCriterion("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(String value) {
            addCriterion("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(String value) {
            addCriterion("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(String value) {
            addCriterion("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(String value) {
            addCriterion("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(String value) {
            addCriterion("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLike(String value) {
            addCriterion("TS like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotLike(String value) {
            addCriterion("TS not like", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<String> values) {
            addCriterion("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<String> values) {
            addCriterion("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(String value1, String value2) {
            addCriterion("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(String value1, String value2) {
            addCriterion("TS not between", value1, value2, "ts");
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