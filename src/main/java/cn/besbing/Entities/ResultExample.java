package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ResultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResultExample() {
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

        public Criteria andResultNumberIsNull() {
            addCriterion("RESULT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andResultNumberIsNotNull() {
            addCriterion("RESULT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andResultNumberEqualTo(Long value) {
            addCriterion("RESULT_NUMBER =", value, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberNotEqualTo(Long value) {
            addCriterion("RESULT_NUMBER <>", value, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberGreaterThan(Long value) {
            addCriterion("RESULT_NUMBER >", value, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("RESULT_NUMBER >=", value, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberLessThan(Long value) {
            addCriterion("RESULT_NUMBER <", value, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberLessThanOrEqualTo(Long value) {
            addCriterion("RESULT_NUMBER <=", value, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberIn(List<Long> values) {
            addCriterion("RESULT_NUMBER in", values, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberNotIn(List<Long> values) {
            addCriterion("RESULT_NUMBER not in", values, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberBetween(Long value1, Long value2) {
            addCriterion("RESULT_NUMBER between", value1, value2, "resultNumber");
            return (Criteria) this;
        }

        public Criteria andResultNumberNotBetween(Long value1, Long value2) {
            addCriterion("RESULT_NUMBER not between", value1, value2, "resultNumber");
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

        public Criteria andModifiedResultIsNull() {
            addCriterion("MODIFIED_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andModifiedResultIsNotNull() {
            addCriterion("MODIFIED_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedResultEqualTo(String value) {
            addCriterion("MODIFIED_RESULT =", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultNotEqualTo(String value) {
            addCriterion("MODIFIED_RESULT <>", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultGreaterThan(String value) {
            addCriterion("MODIFIED_RESULT >", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIED_RESULT >=", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultLessThan(String value) {
            addCriterion("MODIFIED_RESULT <", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultLessThanOrEqualTo(String value) {
            addCriterion("MODIFIED_RESULT <=", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultLike(String value) {
            addCriterion("MODIFIED_RESULT like", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultNotLike(String value) {
            addCriterion("MODIFIED_RESULT not like", value, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultIn(List<String> values) {
            addCriterion("MODIFIED_RESULT in", values, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultNotIn(List<String> values) {
            addCriterion("MODIFIED_RESULT not in", values, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultBetween(String value1, String value2) {
            addCriterion("MODIFIED_RESULT between", value1, value2, "modifiedResult");
            return (Criteria) this;
        }

        public Criteria andModifiedResultNotBetween(String value1, String value2) {
            addCriterion("MODIFIED_RESULT not between", value1, value2, "modifiedResult");
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

        public Criteria andEntryIsNull() {
            addCriterion("ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andEntryIsNotNull() {
            addCriterion("ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andEntryEqualTo(String value) {
            addCriterion("ENTRY =", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotEqualTo(String value) {
            addCriterion("ENTRY <>", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThan(String value) {
            addCriterion("ENTRY >", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY >=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThan(String value) {
            addCriterion("ENTRY <", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThanOrEqualTo(String value) {
            addCriterion("ENTRY <=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLike(String value) {
            addCriterion("ENTRY like", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotLike(String value) {
            addCriterion("ENTRY not like", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryIn(List<String> values) {
            addCriterion("ENTRY in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotIn(List<String> values) {
            addCriterion("ENTRY not in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryBetween(String value1, String value2) {
            addCriterion("ENTRY between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotBetween(String value1, String value2) {
            addCriterion("ENTRY not between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryIsNull() {
            addCriterion("FORMATTED_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryIsNotNull() {
            addCriterion("FORMATTED_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryEqualTo(String value) {
            addCriterion("FORMATTED_ENTRY =", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryNotEqualTo(String value) {
            addCriterion("FORMATTED_ENTRY <>", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryGreaterThan(String value) {
            addCriterion("FORMATTED_ENTRY >", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryGreaterThanOrEqualTo(String value) {
            addCriterion("FORMATTED_ENTRY >=", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryLessThan(String value) {
            addCriterion("FORMATTED_ENTRY <", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryLessThanOrEqualTo(String value) {
            addCriterion("FORMATTED_ENTRY <=", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryLike(String value) {
            addCriterion("FORMATTED_ENTRY like", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryNotLike(String value) {
            addCriterion("FORMATTED_ENTRY not like", value, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryIn(List<String> values) {
            addCriterion("FORMATTED_ENTRY in", values, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryNotIn(List<String> values) {
            addCriterion("FORMATTED_ENTRY not in", values, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryBetween(String value1, String value2) {
            addCriterion("FORMATTED_ENTRY between", value1, value2, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andFormattedEntryNotBetween(String value1, String value2) {
            addCriterion("FORMATTED_ENTRY not between", value1, value2, "formattedEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryIsNull() {
            addCriterion("NUMERIC_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andNumericEntryIsNotNull() {
            addCriterion("NUMERIC_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andNumericEntryEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_ENTRY =", value, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryNotEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_ENTRY <>", value, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryGreaterThan(BigDecimal value) {
            addCriterion("NUMERIC_ENTRY >", value, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_ENTRY >=", value, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryLessThan(BigDecimal value) {
            addCriterion("NUMERIC_ENTRY <", value, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUMERIC_ENTRY <=", value, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryIn(List<BigDecimal> values) {
            addCriterion("NUMERIC_ENTRY in", values, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryNotIn(List<BigDecimal> values) {
            addCriterion("NUMERIC_ENTRY not in", values, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMERIC_ENTRY between", value1, value2, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andNumericEntryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUMERIC_ENTRY not between", value1, value2, "numericEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryIsNull() {
            addCriterion("FIRST_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andFirstEntryIsNotNull() {
            addCriterion("FIRST_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEntryEqualTo(String value) {
            addCriterion("FIRST_ENTRY =", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryNotEqualTo(String value) {
            addCriterion("FIRST_ENTRY <>", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryGreaterThan(String value) {
            addCriterion("FIRST_ENTRY >", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_ENTRY >=", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryLessThan(String value) {
            addCriterion("FIRST_ENTRY <", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryLessThanOrEqualTo(String value) {
            addCriterion("FIRST_ENTRY <=", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryLike(String value) {
            addCriterion("FIRST_ENTRY like", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryNotLike(String value) {
            addCriterion("FIRST_ENTRY not like", value, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryIn(List<String> values) {
            addCriterion("FIRST_ENTRY in", values, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryNotIn(List<String> values) {
            addCriterion("FIRST_ENTRY not in", values, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryBetween(String value1, String value2) {
            addCriterion("FIRST_ENTRY between", value1, value2, "firstEntry");
            return (Criteria) this;
        }

        public Criteria andFirstEntryNotBetween(String value1, String value2) {
            addCriterion("FIRST_ENTRY not between", value1, value2, "firstEntry");
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

        public Criteria andEnteredOnIsNull() {
            addCriterion("ENTERED_ON is null");
            return (Criteria) this;
        }

        public Criteria andEnteredOnIsNotNull() {
            addCriterion("ENTERED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredOnEqualTo(Date value) {
            addCriterionForJDBCDate("ENTERED_ON =", value, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENTERED_ON <>", value, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnGreaterThan(Date value) {
            addCriterionForJDBCDate("ENTERED_ON >", value, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTERED_ON >=", value, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnLessThan(Date value) {
            addCriterionForJDBCDate("ENTERED_ON <", value, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTERED_ON <=", value, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnIn(List<Date> values) {
            addCriterionForJDBCDate("ENTERED_ON in", values, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENTERED_ON not in", values, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTERED_ON between", value1, value2, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTERED_ON not between", value1, value2, "enteredOn");
            return (Criteria) this;
        }

        public Criteria andEnteredByIsNull() {
            addCriterion("ENTERED_BY is null");
            return (Criteria) this;
        }

        public Criteria andEnteredByIsNotNull() {
            addCriterion("ENTERED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andEnteredByEqualTo(String value) {
            addCriterion("ENTERED_BY =", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotEqualTo(String value) {
            addCriterion("ENTERED_BY <>", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByGreaterThan(String value) {
            addCriterion("ENTERED_BY >", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERED_BY >=", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByLessThan(String value) {
            addCriterion("ENTERED_BY <", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByLessThanOrEqualTo(String value) {
            addCriterion("ENTERED_BY <=", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByLike(String value) {
            addCriterion("ENTERED_BY like", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotLike(String value) {
            addCriterion("ENTERED_BY not like", value, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByIn(List<String> values) {
            addCriterion("ENTERED_BY in", values, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotIn(List<String> values) {
            addCriterion("ENTERED_BY not in", values, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByBetween(String value1, String value2) {
            addCriterion("ENTERED_BY between", value1, value2, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andEnteredByNotBetween(String value1, String value2) {
            addCriterion("ENTERED_BY not between", value1, value2, "enteredBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnIsNull() {
            addCriterion("FIRST_ENTRY_ON is null");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnIsNotNull() {
            addCriterion("FIRST_ENTRY_ON is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON =", value, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON <>", value, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnGreaterThan(Date value) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON >", value, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON >=", value, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnLessThan(Date value) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON <", value, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON <=", value, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnIn(List<Date> values) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON in", values, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON not in", values, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON between", value1, value2, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FIRST_ENTRY_ON not between", value1, value2, "firstEntryOn");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByIsNull() {
            addCriterion("FIRST_ENTRY_BY is null");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByIsNotNull() {
            addCriterion("FIRST_ENTRY_BY is not null");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByEqualTo(String value) {
            addCriterion("FIRST_ENTRY_BY =", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByNotEqualTo(String value) {
            addCriterion("FIRST_ENTRY_BY <>", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByGreaterThan(String value) {
            addCriterion("FIRST_ENTRY_BY >", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_ENTRY_BY >=", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByLessThan(String value) {
            addCriterion("FIRST_ENTRY_BY <", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByLessThanOrEqualTo(String value) {
            addCriterion("FIRST_ENTRY_BY <=", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByLike(String value) {
            addCriterion("FIRST_ENTRY_BY like", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByNotLike(String value) {
            addCriterion("FIRST_ENTRY_BY not like", value, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByIn(List<String> values) {
            addCriterion("FIRST_ENTRY_BY in", values, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByNotIn(List<String> values) {
            addCriterion("FIRST_ENTRY_BY not in", values, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByBetween(String value1, String value2) {
            addCriterion("FIRST_ENTRY_BY between", value1, value2, "firstEntryBy");
            return (Criteria) this;
        }

        public Criteria andFirstEntryByNotBetween(String value1, String value2) {
            addCriterion("FIRST_ENTRY_BY not between", value1, value2, "firstEntryBy");
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
            addCriterionForJDBCDate("DATE_REVIEWED =", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED <>", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED >", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED >=", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED <", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_REVIEWED <=", value, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_REVIEWED in", values, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_REVIEWED not in", values, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_REVIEWED between", value1, value2, "dateReviewed");
            return (Criteria) this;
        }

        public Criteria andDateReviewedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_REVIEWED not between", value1, value2, "dateReviewed");
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

        public Criteria andLinkSizeIsNull() {
            addCriterion("LINK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andLinkSizeIsNotNull() {
            addCriterion("LINK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkSizeEqualTo(Long value) {
            addCriterion("LINK_SIZE =", value, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeNotEqualTo(Long value) {
            addCriterion("LINK_SIZE <>", value, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeGreaterThan(Long value) {
            addCriterion("LINK_SIZE >", value, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_SIZE >=", value, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeLessThan(Long value) {
            addCriterion("LINK_SIZE <", value, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeLessThanOrEqualTo(Long value) {
            addCriterion("LINK_SIZE <=", value, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeIn(List<Long> values) {
            addCriterion("LINK_SIZE in", values, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeNotIn(List<Long> values) {
            addCriterion("LINK_SIZE not in", values, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeBetween(Long value1, Long value2) {
            addCriterion("LINK_SIZE between", value1, value2, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkSizeNotBetween(Long value1, Long value2) {
            addCriterion("LINK_SIZE not between", value1, value2, "linkSize");
            return (Criteria) this;
        }

        public Criteria andLinkDateIsNull() {
            addCriterion("LINK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLinkDateIsNotNull() {
            addCriterion("LINK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkDateEqualTo(Date value) {
            addCriterionForJDBCDate("LINK_DATE =", value, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("LINK_DATE <>", value, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateGreaterThan(Date value) {
            addCriterionForJDBCDate("LINK_DATE >", value, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LINK_DATE >=", value, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateLessThan(Date value) {
            addCriterionForJDBCDate("LINK_DATE <", value, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LINK_DATE <=", value, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateIn(List<Date> values) {
            addCriterionForJDBCDate("LINK_DATE in", values, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("LINK_DATE not in", values, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LINK_DATE between", value1, value2, "linkDate");
            return (Criteria) this;
        }

        public Criteria andLinkDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LINK_DATE not between", value1, value2, "linkDate");
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

        public Criteria andCodeEnteredIsNull() {
            addCriterion("CODE_ENTERED is null");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredIsNotNull() {
            addCriterion("CODE_ENTERED is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredEqualTo(String value) {
            addCriterion("CODE_ENTERED =", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredNotEqualTo(String value) {
            addCriterion("CODE_ENTERED <>", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredGreaterThan(String value) {
            addCriterion("CODE_ENTERED >", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_ENTERED >=", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredLessThan(String value) {
            addCriterion("CODE_ENTERED <", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredLessThanOrEqualTo(String value) {
            addCriterion("CODE_ENTERED <=", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredLike(String value) {
            addCriterion("CODE_ENTERED like", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredNotLike(String value) {
            addCriterion("CODE_ENTERED not like", value, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredIn(List<String> values) {
            addCriterion("CODE_ENTERED in", values, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredNotIn(List<String> values) {
            addCriterion("CODE_ENTERED not in", values, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredBetween(String value1, String value2) {
            addCriterion("CODE_ENTERED between", value1, value2, "codeEntered");
            return (Criteria) this;
        }

        public Criteria andCodeEnteredNotBetween(String value1, String value2) {
            addCriterion("CODE_ENTERED not between", value1, value2, "codeEntered");
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
            addCriterionForJDBCDate("CHANGED_ON =", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON <>", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("CHANGED_ON >", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON >=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThan(Date value) {
            addCriterionForJDBCDate("CHANGED_ON <", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHANGED_ON <=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnIn(List<Date> values) {
            addCriterionForJDBCDate("CHANGED_ON in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHANGED_ON not in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHANGED_ON between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHANGED_ON not between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleIsNull() {
            addCriterion("STD_REAG_SAMPLE is null");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleIsNotNull() {
            addCriterion("STD_REAG_SAMPLE is not null");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleEqualTo(Long value) {
            addCriterion("STD_REAG_SAMPLE =", value, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleNotEqualTo(Long value) {
            addCriterion("STD_REAG_SAMPLE <>", value, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleGreaterThan(Long value) {
            addCriterion("STD_REAG_SAMPLE >", value, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleGreaterThanOrEqualTo(Long value) {
            addCriterion("STD_REAG_SAMPLE >=", value, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleLessThan(Long value) {
            addCriterion("STD_REAG_SAMPLE <", value, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleLessThanOrEqualTo(Long value) {
            addCriterion("STD_REAG_SAMPLE <=", value, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleIn(List<Long> values) {
            addCriterion("STD_REAG_SAMPLE in", values, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleNotIn(List<Long> values) {
            addCriterion("STD_REAG_SAMPLE not in", values, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleBetween(Long value1, Long value2) {
            addCriterion("STD_REAG_SAMPLE between", value1, value2, "stdReagSample");
            return (Criteria) this;
        }

        public Criteria andStdReagSampleNotBetween(Long value1, Long value2) {
            addCriterion("STD_REAG_SAMPLE not between", value1, value2, "stdReagSample");
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

        public Criteria andFactorValueIsNull() {
            addCriterion("FACTOR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andFactorValueIsNotNull() {
            addCriterion("FACTOR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andFactorValueEqualTo(String value) {
            addCriterion("FACTOR_VALUE =", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueNotEqualTo(String value) {
            addCriterion("FACTOR_VALUE <>", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueGreaterThan(String value) {
            addCriterion("FACTOR_VALUE >", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR_VALUE >=", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueLessThan(String value) {
            addCriterion("FACTOR_VALUE <", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueLessThanOrEqualTo(String value) {
            addCriterion("FACTOR_VALUE <=", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueLike(String value) {
            addCriterion("FACTOR_VALUE like", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueNotLike(String value) {
            addCriterion("FACTOR_VALUE not like", value, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueIn(List<String> values) {
            addCriterion("FACTOR_VALUE in", values, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueNotIn(List<String> values) {
            addCriterion("FACTOR_VALUE not in", values, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueBetween(String value1, String value2) {
            addCriterion("FACTOR_VALUE between", value1, value2, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorValueNotBetween(String value1, String value2) {
            addCriterion("FACTOR_VALUE not between", value1, value2, "factorValue");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorIsNull() {
            addCriterion("FACTOR_OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorIsNotNull() {
            addCriterion("FACTOR_OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorEqualTo(String value) {
            addCriterion("FACTOR_OPERATOR =", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorNotEqualTo(String value) {
            addCriterion("FACTOR_OPERATOR <>", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorGreaterThan(String value) {
            addCriterion("FACTOR_OPERATOR >", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("FACTOR_OPERATOR >=", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorLessThan(String value) {
            addCriterion("FACTOR_OPERATOR <", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorLessThanOrEqualTo(String value) {
            addCriterion("FACTOR_OPERATOR <=", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorLike(String value) {
            addCriterion("FACTOR_OPERATOR like", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorNotLike(String value) {
            addCriterion("FACTOR_OPERATOR not like", value, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorIn(List<String> values) {
            addCriterion("FACTOR_OPERATOR in", values, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorNotIn(List<String> values) {
            addCriterion("FACTOR_OPERATOR not in", values, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorBetween(String value1, String value2) {
            addCriterion("FACTOR_OPERATOR between", value1, value2, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andFactorOperatorNotBetween(String value1, String value2) {
            addCriterion("FACTOR_OPERATOR not between", value1, value2, "factorOperator");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNull() {
            addCriterion("ENTRY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNotNull() {
            addCriterion("ENTRY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeEqualTo(String value) {
            addCriterion("ENTRY_TYPE =", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotEqualTo(String value) {
            addCriterion("ENTRY_TYPE <>", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThan(String value) {
            addCriterion("ENTRY_TYPE >", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_TYPE >=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThan(String value) {
            addCriterion("ENTRY_TYPE <", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_TYPE <=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLike(String value) {
            addCriterion("ENTRY_TYPE like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotLike(String value) {
            addCriterion("ENTRY_TYPE not like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIn(List<String> values) {
            addCriterion("ENTRY_TYPE in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotIn(List<String> values) {
            addCriterion("ENTRY_TYPE not in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeBetween(String value1, String value2) {
            addCriterion("ENTRY_TYPE between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotBetween(String value1, String value2) {
            addCriterion("ENTRY_TYPE not between", value1, value2, "entryType");
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

        public Criteria andMinLimitEqualTo(String value) {
            addCriterion("MIN_LIMIT =", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotEqualTo(String value) {
            addCriterion("MIN_LIMIT <>", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitGreaterThan(String value) {
            addCriterion("MIN_LIMIT >", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_LIMIT >=", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLessThan(String value) {
            addCriterion("MIN_LIMIT <", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLessThanOrEqualTo(String value) {
            addCriterion("MIN_LIMIT <=", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitLike(String value) {
            addCriterion("MIN_LIMIT like", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotLike(String value) {
            addCriterion("MIN_LIMIT not like", value, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitIn(List<String> values) {
            addCriterion("MIN_LIMIT in", values, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotIn(List<String> values) {
            addCriterion("MIN_LIMIT not in", values, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitBetween(String value1, String value2) {
            addCriterion("MIN_LIMIT between", value1, value2, "minLimit");
            return (Criteria) this;
        }

        public Criteria andMinLimitNotBetween(String value1, String value2) {
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

        public Criteria andMaxLimitEqualTo(String value) {
            addCriterion("MAX_LIMIT =", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotEqualTo(String value) {
            addCriterion("MAX_LIMIT <>", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitGreaterThan(String value) {
            addCriterion("MAX_LIMIT >", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitGreaterThanOrEqualTo(String value) {
            addCriterion("MAX_LIMIT >=", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLessThan(String value) {
            addCriterion("MAX_LIMIT <", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLessThanOrEqualTo(String value) {
            addCriterion("MAX_LIMIT <=", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitLike(String value) {
            addCriterion("MAX_LIMIT like", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotLike(String value) {
            addCriterion("MAX_LIMIT not like", value, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitIn(List<String> values) {
            addCriterion("MAX_LIMIT in", values, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotIn(List<String> values) {
            addCriterion("MAX_LIMIT not in", values, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitBetween(String value1, String value2) {
            addCriterion("MAX_LIMIT between", value1, value2, "maxLimit");
            return (Criteria) this;
        }

        public Criteria andMaxLimitNotBetween(String value1, String value2) {
            addCriterion("MAX_LIMIT not between", value1, value2, "maxLimit");
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

        public Criteria andControl1IsNull() {
            addCriterion("CONTROL_1 is null");
            return (Criteria) this;
        }

        public Criteria andControl1IsNotNull() {
            addCriterion("CONTROL_1 is not null");
            return (Criteria) this;
        }

        public Criteria andControl1EqualTo(String value) {
            addCriterion("CONTROL_1 =", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1NotEqualTo(String value) {
            addCriterion("CONTROL_1 <>", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1GreaterThan(String value) {
            addCriterion("CONTROL_1 >", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1GreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_1 >=", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1LessThan(String value) {
            addCriterion("CONTROL_1 <", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1LessThanOrEqualTo(String value) {
            addCriterion("CONTROL_1 <=", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1Like(String value) {
            addCriterion("CONTROL_1 like", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1NotLike(String value) {
            addCriterion("CONTROL_1 not like", value, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1In(List<String> values) {
            addCriterion("CONTROL_1 in", values, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1NotIn(List<String> values) {
            addCriterion("CONTROL_1 not in", values, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1Between(String value1, String value2) {
            addCriterion("CONTROL_1 between", value1, value2, "control1");
            return (Criteria) this;
        }

        public Criteria andControl1NotBetween(String value1, String value2) {
            addCriterion("CONTROL_1 not between", value1, value2, "control1");
            return (Criteria) this;
        }

        public Criteria andControl2IsNull() {
            addCriterion("CONTROL_2 is null");
            return (Criteria) this;
        }

        public Criteria andControl2IsNotNull() {
            addCriterion("CONTROL_2 is not null");
            return (Criteria) this;
        }

        public Criteria andControl2EqualTo(String value) {
            addCriterion("CONTROL_2 =", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2NotEqualTo(String value) {
            addCriterion("CONTROL_2 <>", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2GreaterThan(String value) {
            addCriterion("CONTROL_2 >", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2GreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_2 >=", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2LessThan(String value) {
            addCriterion("CONTROL_2 <", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2LessThanOrEqualTo(String value) {
            addCriterion("CONTROL_2 <=", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2Like(String value) {
            addCriterion("CONTROL_2 like", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2NotLike(String value) {
            addCriterion("CONTROL_2 not like", value, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2In(List<String> values) {
            addCriterion("CONTROL_2 in", values, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2NotIn(List<String> values) {
            addCriterion("CONTROL_2 not in", values, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2Between(String value1, String value2) {
            addCriterion("CONTROL_2 between", value1, value2, "control2");
            return (Criteria) this;
        }

        public Criteria andControl2NotBetween(String value1, String value2) {
            addCriterion("CONTROL_2 not between", value1, value2, "control2");
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

        public Criteria andEntryQualifierIsNull() {
            addCriterion("ENTRY_QUALIFIER is null");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierIsNotNull() {
            addCriterion("ENTRY_QUALIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierEqualTo(String value) {
            addCriterion("ENTRY_QUALIFIER =", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierNotEqualTo(String value) {
            addCriterion("ENTRY_QUALIFIER <>", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierGreaterThan(String value) {
            addCriterion("ENTRY_QUALIFIER >", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_QUALIFIER >=", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierLessThan(String value) {
            addCriterion("ENTRY_QUALIFIER <", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_QUALIFIER <=", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierLike(String value) {
            addCriterion("ENTRY_QUALIFIER like", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierNotLike(String value) {
            addCriterion("ENTRY_QUALIFIER not like", value, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierIn(List<String> values) {
            addCriterion("ENTRY_QUALIFIER in", values, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierNotIn(List<String> values) {
            addCriterion("ENTRY_QUALIFIER not in", values, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierBetween(String value1, String value2) {
            addCriterion("ENTRY_QUALIFIER between", value1, value2, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andEntryQualifierNotBetween(String value1, String value2) {
            addCriterion("ENTRY_QUALIFIER not between", value1, value2, "entryQualifier");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideIsNull() {
            addCriterion("SPEC_OVERRIDE is null");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideIsNotNull() {
            addCriterion("SPEC_OVERRIDE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideEqualTo(String value) {
            addCriterion("SPEC_OVERRIDE =", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideNotEqualTo(String value) {
            addCriterion("SPEC_OVERRIDE <>", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideGreaterThan(String value) {
            addCriterion("SPEC_OVERRIDE >", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_OVERRIDE >=", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideLessThan(String value) {
            addCriterion("SPEC_OVERRIDE <", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideLessThanOrEqualTo(String value) {
            addCriterion("SPEC_OVERRIDE <=", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideLike(String value) {
            addCriterion("SPEC_OVERRIDE like", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideNotLike(String value) {
            addCriterion("SPEC_OVERRIDE not like", value, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideIn(List<String> values) {
            addCriterion("SPEC_OVERRIDE in", values, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideNotIn(List<String> values) {
            addCriterion("SPEC_OVERRIDE not in", values, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideBetween(String value1, String value2) {
            addCriterion("SPEC_OVERRIDE between", value1, value2, "specOverride");
            return (Criteria) this;
        }

        public Criteria andSpecOverrideNotBetween(String value1, String value2) {
            addCriterion("SPEC_OVERRIDE not between", value1, value2, "specOverride");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkIsNull() {
            addCriterion("DOUBLE_ENTRY_CHK is null");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkIsNotNull() {
            addCriterion("DOUBLE_ENTRY_CHK is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY_CHK =", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkNotEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY_CHK <>", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkGreaterThan(String value) {
            addCriterion("DOUBLE_ENTRY_CHK >", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkGreaterThanOrEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY_CHK >=", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkLessThan(String value) {
            addCriterion("DOUBLE_ENTRY_CHK <", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkLessThanOrEqualTo(String value) {
            addCriterion("DOUBLE_ENTRY_CHK <=", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkLike(String value) {
            addCriterion("DOUBLE_ENTRY_CHK like", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkNotLike(String value) {
            addCriterion("DOUBLE_ENTRY_CHK not like", value, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkIn(List<String> values) {
            addCriterion("DOUBLE_ENTRY_CHK in", values, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkNotIn(List<String> values) {
            addCriterion("DOUBLE_ENTRY_CHK not in", values, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkBetween(String value1, String value2) {
            addCriterion("DOUBLE_ENTRY_CHK between", value1, value2, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andDoubleEntryChkNotBetween(String value1, String value2) {
            addCriterion("DOUBLE_ENTRY_CHK not between", value1, value2, "doubleEntryChk");
            return (Criteria) this;
        }

        public Criteria andLoControlIsNull() {
            addCriterion("LO_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andLoControlIsNotNull() {
            addCriterion("LO_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andLoControlEqualTo(String value) {
            addCriterion("LO_CONTROL =", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlNotEqualTo(String value) {
            addCriterion("LO_CONTROL <>", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlGreaterThan(String value) {
            addCriterion("LO_CONTROL >", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlGreaterThanOrEqualTo(String value) {
            addCriterion("LO_CONTROL >=", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlLessThan(String value) {
            addCriterion("LO_CONTROL <", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlLessThanOrEqualTo(String value) {
            addCriterion("LO_CONTROL <=", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlLike(String value) {
            addCriterion("LO_CONTROL like", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlNotLike(String value) {
            addCriterion("LO_CONTROL not like", value, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlIn(List<String> values) {
            addCriterion("LO_CONTROL in", values, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlNotIn(List<String> values) {
            addCriterion("LO_CONTROL not in", values, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlBetween(String value1, String value2) {
            addCriterion("LO_CONTROL between", value1, value2, "loControl");
            return (Criteria) this;
        }

        public Criteria andLoControlNotBetween(String value1, String value2) {
            addCriterion("LO_CONTROL not between", value1, value2, "loControl");
            return (Criteria) this;
        }

        public Criteria andHiControlIsNull() {
            addCriterion("HI_CONTROL is null");
            return (Criteria) this;
        }

        public Criteria andHiControlIsNotNull() {
            addCriterion("HI_CONTROL is not null");
            return (Criteria) this;
        }

        public Criteria andHiControlEqualTo(String value) {
            addCriterion("HI_CONTROL =", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlNotEqualTo(String value) {
            addCriterion("HI_CONTROL <>", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlGreaterThan(String value) {
            addCriterion("HI_CONTROL >", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlGreaterThanOrEqualTo(String value) {
            addCriterion("HI_CONTROL >=", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlLessThan(String value) {
            addCriterion("HI_CONTROL <", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlLessThanOrEqualTo(String value) {
            addCriterion("HI_CONTROL <=", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlLike(String value) {
            addCriterion("HI_CONTROL like", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlNotLike(String value) {
            addCriterion("HI_CONTROL not like", value, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlIn(List<String> values) {
            addCriterion("HI_CONTROL in", values, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlNotIn(List<String> values) {
            addCriterion("HI_CONTROL not in", values, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlBetween(String value1, String value2) {
            addCriterion("HI_CONTROL between", value1, value2, "hiControl");
            return (Criteria) this;
        }

        public Criteria andHiControlNotBetween(String value1, String value2) {
            addCriterion("HI_CONTROL not between", value1, value2, "hiControl");
            return (Criteria) this;
        }

        public Criteria andTextLimitIsNull() {
            addCriterion("TEXT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andTextLimitIsNotNull() {
            addCriterion("TEXT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andTextLimitEqualTo(String value) {
            addCriterion("TEXT_LIMIT =", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitNotEqualTo(String value) {
            addCriterion("TEXT_LIMIT <>", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitGreaterThan(String value) {
            addCriterion("TEXT_LIMIT >", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitGreaterThanOrEqualTo(String value) {
            addCriterion("TEXT_LIMIT >=", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitLessThan(String value) {
            addCriterion("TEXT_LIMIT <", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitLessThanOrEqualTo(String value) {
            addCriterion("TEXT_LIMIT <=", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitLike(String value) {
            addCriterion("TEXT_LIMIT like", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitNotLike(String value) {
            addCriterion("TEXT_LIMIT not like", value, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitIn(List<String> values) {
            addCriterion("TEXT_LIMIT in", values, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitNotIn(List<String> values) {
            addCriterion("TEXT_LIMIT not in", values, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitBetween(String value1, String value2) {
            addCriterion("TEXT_LIMIT between", value1, value2, "textLimit");
            return (Criteria) this;
        }

        public Criteria andTextLimitNotBetween(String value1, String value2) {
            addCriterion("TEXT_LIMIT not between", value1, value2, "textLimit");
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

        public Criteria andDbFileIsNull() {
            addCriterion("DB_FILE is null");
            return (Criteria) this;
        }

        public Criteria andDbFileIsNotNull() {
            addCriterion("DB_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andDbFileEqualTo(String value) {
            addCriterion("DB_FILE =", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileNotEqualTo(String value) {
            addCriterion("DB_FILE <>", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileGreaterThan(String value) {
            addCriterion("DB_FILE >", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileGreaterThanOrEqualTo(String value) {
            addCriterion("DB_FILE >=", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileLessThan(String value) {
            addCriterion("DB_FILE <", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileLessThanOrEqualTo(String value) {
            addCriterion("DB_FILE <=", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileLike(String value) {
            addCriterion("DB_FILE like", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileNotLike(String value) {
            addCriterion("DB_FILE not like", value, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileIn(List<String> values) {
            addCriterion("DB_FILE in", values, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileNotIn(List<String> values) {
            addCriterion("DB_FILE not in", values, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileBetween(String value1, String value2) {
            addCriterion("DB_FILE between", value1, value2, "dbFile");
            return (Criteria) this;
        }

        public Criteria andDbFileNotBetween(String value1, String value2) {
            addCriterion("DB_FILE not between", value1, value2, "dbFile");
            return (Criteria) this;
        }

        public Criteria andChartCommentIsNull() {
            addCriterion("CHART_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andChartCommentIsNotNull() {
            addCriterion("CHART_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andChartCommentEqualTo(String value) {
            addCriterion("CHART_COMMENT =", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentNotEqualTo(String value) {
            addCriterion("CHART_COMMENT <>", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentGreaterThan(String value) {
            addCriterion("CHART_COMMENT >", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentGreaterThanOrEqualTo(String value) {
            addCriterion("CHART_COMMENT >=", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentLessThan(String value) {
            addCriterion("CHART_COMMENT <", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentLessThanOrEqualTo(String value) {
            addCriterion("CHART_COMMENT <=", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentLike(String value) {
            addCriterion("CHART_COMMENT like", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentNotLike(String value) {
            addCriterion("CHART_COMMENT not like", value, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentIn(List<String> values) {
            addCriterion("CHART_COMMENT in", values, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentNotIn(List<String> values) {
            addCriterion("CHART_COMMENT not in", values, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentBetween(String value1, String value2) {
            addCriterion("CHART_COMMENT between", value1, value2, "chartComment");
            return (Criteria) this;
        }

        public Criteria andChartCommentNotBetween(String value1, String value2) {
            addCriterion("CHART_COMMENT not between", value1, value2, "chartComment");
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

        public Criteria andReportedRsltRevIsNull() {
            addCriterion("REPORTED_RSLT_REV is null");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevIsNotNull() {
            addCriterion("REPORTED_RSLT_REV is not null");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevEqualTo(Long value) {
            addCriterion("REPORTED_RSLT_REV =", value, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevNotEqualTo(Long value) {
            addCriterion("REPORTED_RSLT_REV <>", value, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevGreaterThan(Long value) {
            addCriterion("REPORTED_RSLT_REV >", value, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORTED_RSLT_REV >=", value, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevLessThan(Long value) {
            addCriterion("REPORTED_RSLT_REV <", value, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevLessThanOrEqualTo(Long value) {
            addCriterion("REPORTED_RSLT_REV <=", value, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevIn(List<Long> values) {
            addCriterion("REPORTED_RSLT_REV in", values, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevNotIn(List<Long> values) {
            addCriterion("REPORTED_RSLT_REV not in", values, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevBetween(Long value1, Long value2) {
            addCriterion("REPORTED_RSLT_REV between", value1, value2, "reportedRsltRev");
            return (Criteria) this;
        }

        public Criteria andReportedRsltRevNotBetween(Long value1, Long value2) {
            addCriterion("REPORTED_RSLT_REV not between", value1, value2, "reportedRsltRev");
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

        public Criteria andAttribute1IsNull() {
            addCriterion("ATTRIBUTE_1 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute1IsNotNull() {
            addCriterion("ATTRIBUTE_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute1EqualTo(String value) {
            addCriterion("ATTRIBUTE_1 =", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotEqualTo(String value) {
            addCriterion("ATTRIBUTE_1 <>", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThan(String value) {
            addCriterion("ATTRIBUTE_1 >", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_1 >=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThan(String value) {
            addCriterion("ATTRIBUTE_1 <", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_1 <=", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Like(String value) {
            addCriterion("ATTRIBUTE_1 like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotLike(String value) {
            addCriterion("ATTRIBUTE_1 not like", value, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1In(List<String> values) {
            addCriterion("ATTRIBUTE_1 in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotIn(List<String> values) {
            addCriterion("ATTRIBUTE_1 not in", values, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1Between(String value1, String value2) {
            addCriterion("ATTRIBUTE_1 between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute1NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_1 not between", value1, value2, "attribute1");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNull() {
            addCriterion("ATTRIBUTE_2 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute2IsNotNull() {
            addCriterion("ATTRIBUTE_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute2EqualTo(String value) {
            addCriterion("ATTRIBUTE_2 =", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotEqualTo(String value) {
            addCriterion("ATTRIBUTE_2 <>", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThan(String value) {
            addCriterion("ATTRIBUTE_2 >", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_2 >=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThan(String value) {
            addCriterion("ATTRIBUTE_2 <", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_2 <=", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Like(String value) {
            addCriterion("ATTRIBUTE_2 like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotLike(String value) {
            addCriterion("ATTRIBUTE_2 not like", value, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2In(List<String> values) {
            addCriterion("ATTRIBUTE_2 in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotIn(List<String> values) {
            addCriterion("ATTRIBUTE_2 not in", values, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2Between(String value1, String value2) {
            addCriterion("ATTRIBUTE_2 between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute2NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_2 not between", value1, value2, "attribute2");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNull() {
            addCriterion("ATTRIBUTE_3 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute3IsNotNull() {
            addCriterion("ATTRIBUTE_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute3EqualTo(String value) {
            addCriterion("ATTRIBUTE_3 =", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotEqualTo(String value) {
            addCriterion("ATTRIBUTE_3 <>", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThan(String value) {
            addCriterion("ATTRIBUTE_3 >", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_3 >=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThan(String value) {
            addCriterion("ATTRIBUTE_3 <", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_3 <=", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Like(String value) {
            addCriterion("ATTRIBUTE_3 like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotLike(String value) {
            addCriterion("ATTRIBUTE_3 not like", value, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3In(List<String> values) {
            addCriterion("ATTRIBUTE_3 in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotIn(List<String> values) {
            addCriterion("ATTRIBUTE_3 not in", values, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3Between(String value1, String value2) {
            addCriterion("ATTRIBUTE_3 between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute3NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_3 not between", value1, value2, "attribute3");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNull() {
            addCriterion("ATTRIBUTE_4 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute4IsNotNull() {
            addCriterion("ATTRIBUTE_4 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute4EqualTo(String value) {
            addCriterion("ATTRIBUTE_4 =", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotEqualTo(String value) {
            addCriterion("ATTRIBUTE_4 <>", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThan(String value) {
            addCriterion("ATTRIBUTE_4 >", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_4 >=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThan(String value) {
            addCriterion("ATTRIBUTE_4 <", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_4 <=", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Like(String value) {
            addCriterion("ATTRIBUTE_4 like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotLike(String value) {
            addCriterion("ATTRIBUTE_4 not like", value, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4In(List<String> values) {
            addCriterion("ATTRIBUTE_4 in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotIn(List<String> values) {
            addCriterion("ATTRIBUTE_4 not in", values, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4Between(String value1, String value2) {
            addCriterion("ATTRIBUTE_4 between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute4NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_4 not between", value1, value2, "attribute4");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNull() {
            addCriterion("ATTRIBUTE_5 is null");
            return (Criteria) this;
        }

        public Criteria andAttribute5IsNotNull() {
            addCriterion("ATTRIBUTE_5 is not null");
            return (Criteria) this;
        }

        public Criteria andAttribute5EqualTo(String value) {
            addCriterion("ATTRIBUTE_5 =", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotEqualTo(String value) {
            addCriterion("ATTRIBUTE_5 <>", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThan(String value) {
            addCriterion("ATTRIBUTE_5 >", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5GreaterThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_5 >=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThan(String value) {
            addCriterion("ATTRIBUTE_5 <", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5LessThanOrEqualTo(String value) {
            addCriterion("ATTRIBUTE_5 <=", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Like(String value) {
            addCriterion("ATTRIBUTE_5 like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotLike(String value) {
            addCriterion("ATTRIBUTE_5 not like", value, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5In(List<String> values) {
            addCriterion("ATTRIBUTE_5 in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotIn(List<String> values) {
            addCriterion("ATTRIBUTE_5 not in", values, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5Between(String value1, String value2) {
            addCriterion("ATTRIBUTE_5 between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andAttribute5NotBetween(String value1, String value2) {
            addCriterion("ATTRIBUTE_5 not between", value1, value2, "attribute5");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkIsNull() {
            addCriterion("DOUBLE_BLIND_CHK is null");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkIsNotNull() {
            addCriterion("DOUBLE_BLIND_CHK is not null");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkEqualTo(String value) {
            addCriterion("DOUBLE_BLIND_CHK =", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkNotEqualTo(String value) {
            addCriterion("DOUBLE_BLIND_CHK <>", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkGreaterThan(String value) {
            addCriterion("DOUBLE_BLIND_CHK >", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkGreaterThanOrEqualTo(String value) {
            addCriterion("DOUBLE_BLIND_CHK >=", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkLessThan(String value) {
            addCriterion("DOUBLE_BLIND_CHK <", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkLessThanOrEqualTo(String value) {
            addCriterion("DOUBLE_BLIND_CHK <=", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkLike(String value) {
            addCriterion("DOUBLE_BLIND_CHK like", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkNotLike(String value) {
            addCriterion("DOUBLE_BLIND_CHK not like", value, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkIn(List<String> values) {
            addCriterion("DOUBLE_BLIND_CHK in", values, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkNotIn(List<String> values) {
            addCriterion("DOUBLE_BLIND_CHK not in", values, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkBetween(String value1, String value2) {
            addCriterion("DOUBLE_BLIND_CHK between", value1, value2, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andDoubleBlindChkNotBetween(String value1, String value2) {
            addCriterion("DOUBLE_BLIND_CHK not between", value1, value2, "doubleBlindChk");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIsNull() {
            addCriterion("T_ACCREDITED is null");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIsNotNull() {
            addCriterion("T_ACCREDITED is not null");
            return (Criteria) this;
        }

        public Criteria andTAccreditedEqualTo(String value) {
            addCriterion("T_ACCREDITED =", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedNotEqualTo(String value) {
            addCriterion("T_ACCREDITED <>", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedGreaterThan(String value) {
            addCriterion("T_ACCREDITED >", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedGreaterThanOrEqualTo(String value) {
            addCriterion("T_ACCREDITED >=", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedLessThan(String value) {
            addCriterion("T_ACCREDITED <", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedLessThanOrEqualTo(String value) {
            addCriterion("T_ACCREDITED <=", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedLike(String value) {
            addCriterion("T_ACCREDITED like", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedNotLike(String value) {
            addCriterion("T_ACCREDITED not like", value, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIn(List<String> values) {
            addCriterion("T_ACCREDITED in", values, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedNotIn(List<String> values) {
            addCriterion("T_ACCREDITED not in", values, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedBetween(String value1, String value2) {
            addCriterion("T_ACCREDITED between", value1, value2, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedNotBetween(String value1, String value2) {
            addCriterion("T_ACCREDITED not between", value1, value2, "tAccredited");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdIsNull() {
            addCriterion("T_ACCREDITED_ID is null");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdIsNotNull() {
            addCriterion("T_ACCREDITED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdEqualTo(String value) {
            addCriterion("T_ACCREDITED_ID =", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdNotEqualTo(String value) {
            addCriterion("T_ACCREDITED_ID <>", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdGreaterThan(String value) {
            addCriterion("T_ACCREDITED_ID >", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdGreaterThanOrEqualTo(String value) {
            addCriterion("T_ACCREDITED_ID >=", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdLessThan(String value) {
            addCriterion("T_ACCREDITED_ID <", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdLessThanOrEqualTo(String value) {
            addCriterion("T_ACCREDITED_ID <=", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdLike(String value) {
            addCriterion("T_ACCREDITED_ID like", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdNotLike(String value) {
            addCriterion("T_ACCREDITED_ID not like", value, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdIn(List<String> values) {
            addCriterion("T_ACCREDITED_ID in", values, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdNotIn(List<String> values) {
            addCriterion("T_ACCREDITED_ID not in", values, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdBetween(String value1, String value2) {
            addCriterion("T_ACCREDITED_ID between", value1, value2, "tAccreditedId");
            return (Criteria) this;
        }

        public Criteria andTAccreditedIdNotBetween(String value1, String value2) {
            addCriterion("T_ACCREDITED_ID not between", value1, value2, "tAccreditedId");
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

        public Criteria andCListKeyIsNull() {
            addCriterion("C_LIST_KEY is null");
            return (Criteria) this;
        }

        public Criteria andCListKeyIsNotNull() {
            addCriterion("C_LIST_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andCListKeyEqualTo(String value) {
            addCriterion("C_LIST_KEY =", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyNotEqualTo(String value) {
            addCriterion("C_LIST_KEY <>", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyGreaterThan(String value) {
            addCriterion("C_LIST_KEY >", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyGreaterThanOrEqualTo(String value) {
            addCriterion("C_LIST_KEY >=", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyLessThan(String value) {
            addCriterion("C_LIST_KEY <", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyLessThanOrEqualTo(String value) {
            addCriterion("C_LIST_KEY <=", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyLike(String value) {
            addCriterion("C_LIST_KEY like", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyNotLike(String value) {
            addCriterion("C_LIST_KEY not like", value, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyIn(List<String> values) {
            addCriterion("C_LIST_KEY in", values, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyNotIn(List<String> values) {
            addCriterion("C_LIST_KEY not in", values, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyBetween(String value1, String value2) {
            addCriterion("C_LIST_KEY between", value1, value2, "cListKey");
            return (Criteria) this;
        }

        public Criteria andCListKeyNotBetween(String value1, String value2) {
            addCriterion("C_LIST_KEY not between", value1, value2, "cListKey");
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