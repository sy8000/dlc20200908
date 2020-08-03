package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.List;

public class CProjTaskParaBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CProjTaskParaBExample() {
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

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Long value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Long value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Long value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Long value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Long> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Long> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Long value1, Long value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("SEQ_NUM not between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andProjectIsNull() {
            addCriterion("PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andProjectIsNotNull() {
            addCriterion("PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andProjectEqualTo(String value) {
            addCriterion("PROJECT =", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotEqualTo(String value) {
            addCriterion("PROJECT <>", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThan(String value) {
            addCriterion("PROJECT >", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT >=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThan(String value) {
            addCriterion("PROJECT <", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLessThanOrEqualTo(String value) {
            addCriterion("PROJECT <=", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectLike(String value) {
            addCriterion("PROJECT like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotLike(String value) {
            addCriterion("PROJECT not like", value, "project");
            return (Criteria) this;
        }

        public Criteria andProjectIn(List<String> values) {
            addCriterion("PROJECT in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotIn(List<String> values) {
            addCriterion("PROJECT not in", values, "project");
            return (Criteria) this;
        }

        public Criteria andProjectBetween(String value1, String value2) {
            addCriterion("PROJECT between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andProjectNotBetween(String value1, String value2) {
            addCriterion("PROJECT not between", value1, value2, "project");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumIsNull() {
            addCriterion("TASK_SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumIsNotNull() {
            addCriterion("TASK_SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumEqualTo(Long value) {
            addCriterion("TASK_SEQ_NUM =", value, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumNotEqualTo(Long value) {
            addCriterion("TASK_SEQ_NUM <>", value, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumGreaterThan(Long value) {
            addCriterion("TASK_SEQ_NUM >", value, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_SEQ_NUM >=", value, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumLessThan(Long value) {
            addCriterion("TASK_SEQ_NUM <", value, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("TASK_SEQ_NUM <=", value, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumIn(List<Long> values) {
            addCriterion("TASK_SEQ_NUM in", values, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumNotIn(List<Long> values) {
            addCriterion("TASK_SEQ_NUM not in", values, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumBetween(Long value1, Long value2) {
            addCriterion("TASK_SEQ_NUM between", value1, value2, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("TASK_SEQ_NUM not between", value1, value2, "taskSeqNum");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("TASK_NAME =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("TASK_NAME <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("TASK_NAME >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_NAME >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("TASK_NAME <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_NAME <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("TASK_NAME like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("TASK_NAME not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("TASK_NAME in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("TASK_NAME not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("TASK_NAME between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("TASK_NAME not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andEntryCodeIsNull() {
            addCriterion("ENTRY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEntryCodeIsNotNull() {
            addCriterion("ENTRY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEntryCodeEqualTo(Long value) {
            addCriterion("ENTRY_CODE =", value, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeNotEqualTo(Long value) {
            addCriterion("ENTRY_CODE <>", value, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeGreaterThan(Long value) {
            addCriterion("ENTRY_CODE >", value, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("ENTRY_CODE >=", value, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeLessThan(Long value) {
            addCriterion("ENTRY_CODE <", value, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeLessThanOrEqualTo(Long value) {
            addCriterion("ENTRY_CODE <=", value, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeIn(List<Long> values) {
            addCriterion("ENTRY_CODE in", values, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeNotIn(List<Long> values) {
            addCriterion("ENTRY_CODE not in", values, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeBetween(Long value1, Long value2) {
            addCriterion("ENTRY_CODE between", value1, value2, "entryCode");
            return (Criteria) this;
        }

        public Criteria andEntryCodeNotBetween(Long value1, Long value2) {
            addCriterion("ENTRY_CODE not between", value1, value2, "entryCode");
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

        public Criteria andComponentIsNull() {
            addCriterion("COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andComponentIsNotNull() {
            addCriterion("COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andComponentEqualTo(String value) {
            addCriterion("COMPONENT =", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotEqualTo(String value) {
            addCriterion("COMPONENT <>", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThan(String value) {
            addCriterion("COMPONENT >", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT >=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThan(String value) {
            addCriterion("COMPONENT <", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT <=", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentLike(String value) {
            addCriterion("COMPONENT like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotLike(String value) {
            addCriterion("COMPONENT not like", value, "component");
            return (Criteria) this;
        }

        public Criteria andComponentIn(List<String> values) {
            addCriterion("COMPONENT in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotIn(List<String> values) {
            addCriterion("COMPONENT not in", values, "component");
            return (Criteria) this;
        }

        public Criteria andComponentBetween(String value1, String value2) {
            addCriterion("COMPONENT between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andComponentNotBetween(String value1, String value2) {
            addCriterion("COMPONENT not between", value1, value2, "component");
            return (Criteria) this;
        }

        public Criteria andSpecRuleIsNull() {
            addCriterion("SPEC_RULE is null");
            return (Criteria) this;
        }

        public Criteria andSpecRuleIsNotNull() {
            addCriterion("SPEC_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecRuleEqualTo(String value) {
            addCriterion("SPEC_RULE =", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleNotEqualTo(String value) {
            addCriterion("SPEC_RULE <>", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleGreaterThan(String value) {
            addCriterion("SPEC_RULE >", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC_RULE >=", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleLessThan(String value) {
            addCriterion("SPEC_RULE <", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleLessThanOrEqualTo(String value) {
            addCriterion("SPEC_RULE <=", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleLike(String value) {
            addCriterion("SPEC_RULE like", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleNotLike(String value) {
            addCriterion("SPEC_RULE not like", value, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleIn(List<String> values) {
            addCriterion("SPEC_RULE in", values, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleNotIn(List<String> values) {
            addCriterion("SPEC_RULE not in", values, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleBetween(String value1, String value2) {
            addCriterion("SPEC_RULE between", value1, value2, "specRule");
            return (Criteria) this;
        }

        public Criteria andSpecRuleNotBetween(String value1, String value2) {
            addCriterion("SPEC_RULE not between", value1, value2, "specRule");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNull() {
            addCriterion("MAX_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMaxValueIsNotNull() {
            addCriterion("MAX_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxValueEqualTo(String value) {
            addCriterion("MAX_VALUE =", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotEqualTo(String value) {
            addCriterion("MAX_VALUE <>", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThan(String value) {
            addCriterion("MAX_VALUE >", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueGreaterThanOrEqualTo(String value) {
            addCriterion("MAX_VALUE >=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThan(String value) {
            addCriterion("MAX_VALUE <", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLessThanOrEqualTo(String value) {
            addCriterion("MAX_VALUE <=", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueLike(String value) {
            addCriterion("MAX_VALUE like", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotLike(String value) {
            addCriterion("MAX_VALUE not like", value, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueIn(List<String> values) {
            addCriterion("MAX_VALUE in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotIn(List<String> values) {
            addCriterion("MAX_VALUE not in", values, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueBetween(String value1, String value2) {
            addCriterion("MAX_VALUE between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMaxValueNotBetween(String value1, String value2) {
            addCriterion("MAX_VALUE not between", value1, value2, "maxValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNull() {
            addCriterion("MIN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMinValueIsNotNull() {
            addCriterion("MIN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMinValueEqualTo(String value) {
            addCriterion("MIN_VALUE =", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotEqualTo(String value) {
            addCriterion("MIN_VALUE <>", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThan(String value) {
            addCriterion("MIN_VALUE >", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueGreaterThanOrEqualTo(String value) {
            addCriterion("MIN_VALUE >=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThan(String value) {
            addCriterion("MIN_VALUE <", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLessThanOrEqualTo(String value) {
            addCriterion("MIN_VALUE <=", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueLike(String value) {
            addCriterion("MIN_VALUE like", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotLike(String value) {
            addCriterion("MIN_VALUE not like", value, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueIn(List<String> values) {
            addCriterion("MIN_VALUE in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotIn(List<String> values) {
            addCriterion("MIN_VALUE not in", values, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueBetween(String value1, String value2) {
            addCriterion("MIN_VALUE between", value1, value2, "minValue");
            return (Criteria) this;
        }

        public Criteria andMinValueNotBetween(String value1, String value2) {
            addCriterion("MIN_VALUE not between", value1, value2, "minValue");
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

        public Criteria andIsAddedIsNull() {
            addCriterion("IS_ADDED is null");
            return (Criteria) this;
        }

        public Criteria andIsAddedIsNotNull() {
            addCriterion("IS_ADDED is not null");
            return (Criteria) this;
        }

        public Criteria andIsAddedEqualTo(String value) {
            addCriterion("IS_ADDED =", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedNotEqualTo(String value) {
            addCriterion("IS_ADDED <>", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedGreaterThan(String value) {
            addCriterion("IS_ADDED >", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ADDED >=", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedLessThan(String value) {
            addCriterion("IS_ADDED <", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedLessThanOrEqualTo(String value) {
            addCriterion("IS_ADDED <=", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedLike(String value) {
            addCriterion("IS_ADDED like", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedNotLike(String value) {
            addCriterion("IS_ADDED not like", value, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedIn(List<String> values) {
            addCriterion("IS_ADDED in", values, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedNotIn(List<String> values) {
            addCriterion("IS_ADDED not in", values, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedBetween(String value1, String value2) {
            addCriterion("IS_ADDED between", value1, value2, "isAdded");
            return (Criteria) this;
        }

        public Criteria andIsAddedNotBetween(String value1, String value2) {
            addCriterion("IS_ADDED not between", value1, value2, "isAdded");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumIsNull() {
            addCriterion("PROJ_LOGSAMP_SEQNUM is null");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumIsNotNull() {
            addCriterion("PROJ_LOGSAMP_SEQNUM is not null");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumEqualTo(Long value) {
            addCriterion("PROJ_LOGSAMP_SEQNUM =", value, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumNotEqualTo(Long value) {
            addCriterion("PROJ_LOGSAMP_SEQNUM <>", value, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumGreaterThan(Long value) {
            addCriterion("PROJ_LOGSAMP_SEQNUM >", value, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumGreaterThanOrEqualTo(Long value) {
            addCriterion("PROJ_LOGSAMP_SEQNUM >=", value, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumLessThan(Long value) {
            addCriterion("PROJ_LOGSAMP_SEQNUM <", value, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumLessThanOrEqualTo(Long value) {
            addCriterion("PROJ_LOGSAMP_SEQNUM <=", value, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumIn(List<Long> values) {
            addCriterion("PROJ_LOGSAMP_SEQNUM in", values, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumNotIn(List<Long> values) {
            addCriterion("PROJ_LOGSAMP_SEQNUM not in", values, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumBetween(Long value1, Long value2) {
            addCriterion("PROJ_LOGSAMP_SEQNUM between", value1, value2, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andProjLogsampSeqnumNotBetween(Long value1, Long value2) {
            addCriterion("PROJ_LOGSAMP_SEQNUM not between", value1, value2, "projLogsampSeqnum");
            return (Criteria) this;
        }

        public Criteria andSampleGroupIsNull() {
            addCriterion("SAMPLE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andSampleGroupIsNotNull() {
            addCriterion("SAMPLE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andSampleGroupEqualTo(String value) {
            addCriterion("SAMPLE_GROUP =", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotEqualTo(String value) {
            addCriterion("SAMPLE_GROUP <>", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupGreaterThan(String value) {
            addCriterion("SAMPLE_GROUP >", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_GROUP >=", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupLessThan(String value) {
            addCriterion("SAMPLE_GROUP <", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_GROUP <=", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupLike(String value) {
            addCriterion("SAMPLE_GROUP like", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotLike(String value) {
            addCriterion("SAMPLE_GROUP not like", value, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupIn(List<String> values) {
            addCriterion("SAMPLE_GROUP in", values, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotIn(List<String> values) {
            addCriterion("SAMPLE_GROUP not in", values, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupBetween(String value1, String value2) {
            addCriterion("SAMPLE_GROUP between", value1, value2, "sampleGroup");
            return (Criteria) this;
        }

        public Criteria andSampleGroupNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_GROUP not between", value1, value2, "sampleGroup");
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

        public Criteria andCheckSpecIsNull() {
            addCriterion("CHECK_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andCheckSpecIsNotNull() {
            addCriterion("CHECK_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andCheckSpecEqualTo(String value) {
            addCriterion("CHECK_SPEC =", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecNotEqualTo(String value) {
            addCriterion("CHECK_SPEC <>", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecGreaterThan(String value) {
            addCriterion("CHECK_SPEC >", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_SPEC >=", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecLessThan(String value) {
            addCriterion("CHECK_SPEC <", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecLessThanOrEqualTo(String value) {
            addCriterion("CHECK_SPEC <=", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecLike(String value) {
            addCriterion("CHECK_SPEC like", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecNotLike(String value) {
            addCriterion("CHECK_SPEC not like", value, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecIn(List<String> values) {
            addCriterion("CHECK_SPEC in", values, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecNotIn(List<String> values) {
            addCriterion("CHECK_SPEC not in", values, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecBetween(String value1, String value2) {
            addCriterion("CHECK_SPEC between", value1, value2, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andCheckSpecNotBetween(String value1, String value2) {
            addCriterion("CHECK_SPEC not between", value1, value2, "checkSpec");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestIsNull() {
            addCriterion("TEMPORARY_TEST is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestIsNotNull() {
            addCriterion("TEMPORARY_TEST is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestEqualTo(String value) {
            addCriterion("TEMPORARY_TEST =", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestNotEqualTo(String value) {
            addCriterion("TEMPORARY_TEST <>", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestGreaterThan(String value) {
            addCriterion("TEMPORARY_TEST >", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPORARY_TEST >=", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestLessThan(String value) {
            addCriterion("TEMPORARY_TEST <", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestLessThanOrEqualTo(String value) {
            addCriterion("TEMPORARY_TEST <=", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestLike(String value) {
            addCriterion("TEMPORARY_TEST like", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestNotLike(String value) {
            addCriterion("TEMPORARY_TEST not like", value, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestIn(List<String> values) {
            addCriterion("TEMPORARY_TEST in", values, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestNotIn(List<String> values) {
            addCriterion("TEMPORARY_TEST not in", values, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestBetween(String value1, String value2) {
            addCriterion("TEMPORARY_TEST between", value1, value2, "temporaryTest");
            return (Criteria) this;
        }

        public Criteria andTemporaryTestNotBetween(String value1, String value2) {
            addCriterion("TEMPORARY_TEST not between", value1, value2, "temporaryTest");
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