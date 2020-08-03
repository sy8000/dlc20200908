package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.List;

public class NcTaskAddunionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcTaskAddunionExample() {
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

        public Criteria andPkTaskAddunionIsNull() {
            addCriterion("PK_TASK_ADDUNION is null");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionIsNotNull() {
            addCriterion("PK_TASK_ADDUNION is not null");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionEqualTo(String value) {
            addCriterion("PK_TASK_ADDUNION =", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionNotEqualTo(String value) {
            addCriterion("PK_TASK_ADDUNION <>", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionGreaterThan(String value) {
            addCriterion("PK_TASK_ADDUNION >", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TASK_ADDUNION >=", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionLessThan(String value) {
            addCriterion("PK_TASK_ADDUNION <", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionLessThanOrEqualTo(String value) {
            addCriterion("PK_TASK_ADDUNION <=", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionLike(String value) {
            addCriterion("PK_TASK_ADDUNION like", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionNotLike(String value) {
            addCriterion("PK_TASK_ADDUNION not like", value, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionIn(List<String> values) {
            addCriterion("PK_TASK_ADDUNION in", values, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionNotIn(List<String> values) {
            addCriterion("PK_TASK_ADDUNION not in", values, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionBetween(String value1, String value2) {
            addCriterion("PK_TASK_ADDUNION between", value1, value2, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andPkTaskAddunionNotBetween(String value1, String value2) {
            addCriterion("PK_TASK_ADDUNION not between", value1, value2, "pkTaskAddunion");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeIsNull() {
            addCriterion("NC_TASK_ADDCODE is null");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeIsNotNull() {
            addCriterion("NC_TASK_ADDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeEqualTo(String value) {
            addCriterion("NC_TASK_ADDCODE =", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeNotEqualTo(String value) {
            addCriterion("NC_TASK_ADDCODE <>", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeGreaterThan(String value) {
            addCriterion("NC_TASK_ADDCODE >", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TASK_ADDCODE >=", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeLessThan(String value) {
            addCriterion("NC_TASK_ADDCODE <", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeLessThanOrEqualTo(String value) {
            addCriterion("NC_TASK_ADDCODE <=", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeLike(String value) {
            addCriterion("NC_TASK_ADDCODE like", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeNotLike(String value) {
            addCriterion("NC_TASK_ADDCODE not like", value, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeIn(List<String> values) {
            addCriterion("NC_TASK_ADDCODE in", values, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeNotIn(List<String> values) {
            addCriterion("NC_TASK_ADDCODE not in", values, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeBetween(String value1, String value2) {
            addCriterion("NC_TASK_ADDCODE between", value1, value2, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddcodeNotBetween(String value1, String value2) {
            addCriterion("NC_TASK_ADDCODE not between", value1, value2, "ncTaskAddcode");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameIsNull() {
            addCriterion("NC_TASK_ADDNAME is null");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameIsNotNull() {
            addCriterion("NC_TASK_ADDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameEqualTo(String value) {
            addCriterion("NC_TASK_ADDNAME =", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameNotEqualTo(String value) {
            addCriterion("NC_TASK_ADDNAME <>", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameGreaterThan(String value) {
            addCriterion("NC_TASK_ADDNAME >", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TASK_ADDNAME >=", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameLessThan(String value) {
            addCriterion("NC_TASK_ADDNAME <", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameLessThanOrEqualTo(String value) {
            addCriterion("NC_TASK_ADDNAME <=", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameLike(String value) {
            addCriterion("NC_TASK_ADDNAME like", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameNotLike(String value) {
            addCriterion("NC_TASK_ADDNAME not like", value, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameIn(List<String> values) {
            addCriterion("NC_TASK_ADDNAME in", values, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameNotIn(List<String> values) {
            addCriterion("NC_TASK_ADDNAME not in", values, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameBetween(String value1, String value2) {
            addCriterion("NC_TASK_ADDNAME between", value1, value2, "ncTaskAddname");
            return (Criteria) this;
        }

        public Criteria andNcTaskAddnameNotBetween(String value1, String value2) {
            addCriterion("NC_TASK_ADDNAME not between", value1, value2, "ncTaskAddname");
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

        public Criteria andNcAnalysisMethodIsNull() {
            addCriterion("NC_ANALYSIS_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodIsNotNull() {
            addCriterion("NC_ANALYSIS_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodEqualTo(String value) {
            addCriterion("NC_ANALYSIS_METHOD =", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodNotEqualTo(String value) {
            addCriterion("NC_ANALYSIS_METHOD <>", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodGreaterThan(String value) {
            addCriterion("NC_ANALYSIS_METHOD >", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodGreaterThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_METHOD >=", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodLessThan(String value) {
            addCriterion("NC_ANALYSIS_METHOD <", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodLessThanOrEqualTo(String value) {
            addCriterion("NC_ANALYSIS_METHOD <=", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodLike(String value) {
            addCriterion("NC_ANALYSIS_METHOD like", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodNotLike(String value) {
            addCriterion("NC_ANALYSIS_METHOD not like", value, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodIn(List<String> values) {
            addCriterion("NC_ANALYSIS_METHOD in", values, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodNotIn(List<String> values) {
            addCriterion("NC_ANALYSIS_METHOD not in", values, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_METHOD between", value1, value2, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcAnalysisMethodNotBetween(String value1, String value2) {
            addCriterion("NC_ANALYSIS_METHOD not between", value1, value2, "ncAnalysisMethod");
            return (Criteria) this;
        }

        public Criteria andNcReportNameIsNull() {
            addCriterion("NC_REPORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcReportNameIsNotNull() {
            addCriterion("NC_REPORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcReportNameEqualTo(String value) {
            addCriterion("NC_REPORT_NAME =", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameNotEqualTo(String value) {
            addCriterion("NC_REPORT_NAME <>", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameGreaterThan(String value) {
            addCriterion("NC_REPORT_NAME >", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_REPORT_NAME >=", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameLessThan(String value) {
            addCriterion("NC_REPORT_NAME <", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameLessThanOrEqualTo(String value) {
            addCriterion("NC_REPORT_NAME <=", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameLike(String value) {
            addCriterion("NC_REPORT_NAME like", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameNotLike(String value) {
            addCriterion("NC_REPORT_NAME not like", value, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameIn(List<String> values) {
            addCriterion("NC_REPORT_NAME in", values, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameNotIn(List<String> values) {
            addCriterion("NC_REPORT_NAME not in", values, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameBetween(String value1, String value2) {
            addCriterion("NC_REPORT_NAME between", value1, value2, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcReportNameNotBetween(String value1, String value2) {
            addCriterion("NC_REPORT_NAME not between", value1, value2, "ncReportName");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeIsNull() {
            addCriterion("NC_TASK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeIsNotNull() {
            addCriterion("NC_TASK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeEqualTo(String value) {
            addCriterion("NC_TASK_TYPE =", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeNotEqualTo(String value) {
            addCriterion("NC_TASK_TYPE <>", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeGreaterThan(String value) {
            addCriterion("NC_TASK_TYPE >", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TASK_TYPE >=", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeLessThan(String value) {
            addCriterion("NC_TASK_TYPE <", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("NC_TASK_TYPE <=", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeLike(String value) {
            addCriterion("NC_TASK_TYPE like", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeNotLike(String value) {
            addCriterion("NC_TASK_TYPE not like", value, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeIn(List<String> values) {
            addCriterion("NC_TASK_TYPE in", values, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeNotIn(List<String> values) {
            addCriterion("NC_TASK_TYPE not in", values, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeBetween(String value1, String value2) {
            addCriterion("NC_TASK_TYPE between", value1, value2, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskTypeNotBetween(String value1, String value2) {
            addCriterion("NC_TASK_TYPE not between", value1, value2, "ncTaskType");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesIsNull() {
            addCriterion("NC_TASK_DES is null");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesIsNotNull() {
            addCriterion("NC_TASK_DES is not null");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesEqualTo(String value) {
            addCriterion("NC_TASK_DES =", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesNotEqualTo(String value) {
            addCriterion("NC_TASK_DES <>", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesGreaterThan(String value) {
            addCriterion("NC_TASK_DES >", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TASK_DES >=", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesLessThan(String value) {
            addCriterion("NC_TASK_DES <", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesLessThanOrEqualTo(String value) {
            addCriterion("NC_TASK_DES <=", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesLike(String value) {
            addCriterion("NC_TASK_DES like", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesNotLike(String value) {
            addCriterion("NC_TASK_DES not like", value, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesIn(List<String> values) {
            addCriterion("NC_TASK_DES in", values, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesNotIn(List<String> values) {
            addCriterion("NC_TASK_DES not in", values, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesBetween(String value1, String value2) {
            addCriterion("NC_TASK_DES between", value1, value2, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskDesNotBetween(String value1, String value2) {
            addCriterion("NC_TASK_DES not between", value1, value2, "ncTaskDes");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameIsNull() {
            addCriterion("NC_TASK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameIsNotNull() {
            addCriterion("NC_TASK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameEqualTo(String value) {
            addCriterion("NC_TASK_NAME =", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameNotEqualTo(String value) {
            addCriterion("NC_TASK_NAME <>", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameGreaterThan(String value) {
            addCriterion("NC_TASK_NAME >", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_TASK_NAME >=", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameLessThan(String value) {
            addCriterion("NC_TASK_NAME <", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameLessThanOrEqualTo(String value) {
            addCriterion("NC_TASK_NAME <=", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameLike(String value) {
            addCriterion("NC_TASK_NAME like", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameNotLike(String value) {
            addCriterion("NC_TASK_NAME not like", value, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameIn(List<String> values) {
            addCriterion("NC_TASK_NAME in", values, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameNotIn(List<String> values) {
            addCriterion("NC_TASK_NAME not in", values, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameBetween(String value1, String value2) {
            addCriterion("NC_TASK_NAME between", value1, value2, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcTaskNameNotBetween(String value1, String value2) {
            addCriterion("NC_TASK_NAME not between", value1, value2, "ncTaskName");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeIsNull() {
            addCriterion("NC_INCLUDE_PROTYPE is null");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeIsNotNull() {
            addCriterion("NC_INCLUDE_PROTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeEqualTo(String value) {
            addCriterion("NC_INCLUDE_PROTYPE =", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeNotEqualTo(String value) {
            addCriterion("NC_INCLUDE_PROTYPE <>", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeGreaterThan(String value) {
            addCriterion("NC_INCLUDE_PROTYPE >", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_INCLUDE_PROTYPE >=", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeLessThan(String value) {
            addCriterion("NC_INCLUDE_PROTYPE <", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeLessThanOrEqualTo(String value) {
            addCriterion("NC_INCLUDE_PROTYPE <=", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeLike(String value) {
            addCriterion("NC_INCLUDE_PROTYPE like", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeNotLike(String value) {
            addCriterion("NC_INCLUDE_PROTYPE not like", value, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeIn(List<String> values) {
            addCriterion("NC_INCLUDE_PROTYPE in", values, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeNotIn(List<String> values) {
            addCriterion("NC_INCLUDE_PROTYPE not in", values, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeBetween(String value1, String value2) {
            addCriterion("NC_INCLUDE_PROTYPE between", value1, value2, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcIncludeProtypeNotBetween(String value1, String value2) {
            addCriterion("NC_INCLUDE_PROTYPE not between", value1, value2, "ncIncludeProtype");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanIsNull() {
            addCriterion("NC_CB_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanIsNotNull() {
            addCriterion("NC_CB_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanEqualTo(String value) {
            addCriterion("NC_CB_PLAN =", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanNotEqualTo(String value) {
            addCriterion("NC_CB_PLAN <>", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanGreaterThan(String value) {
            addCriterion("NC_CB_PLAN >", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanGreaterThanOrEqualTo(String value) {
            addCriterion("NC_CB_PLAN >=", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanLessThan(String value) {
            addCriterion("NC_CB_PLAN <", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanLessThanOrEqualTo(String value) {
            addCriterion("NC_CB_PLAN <=", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanLike(String value) {
            addCriterion("NC_CB_PLAN like", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanNotLike(String value) {
            addCriterion("NC_CB_PLAN not like", value, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanIn(List<String> values) {
            addCriterion("NC_CB_PLAN in", values, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanNotIn(List<String> values) {
            addCriterion("NC_CB_PLAN not in", values, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanBetween(String value1, String value2) {
            addCriterion("NC_CB_PLAN between", value1, value2, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcCbPlanNotBetween(String value1, String value2) {
            addCriterion("NC_CB_PLAN not between", value1, value2, "ncCbPlan");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberIsNull() {
            addCriterion("NC_ORDER_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberIsNotNull() {
            addCriterion("NC_ORDER_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberEqualTo(Long value) {
            addCriterion("NC_ORDER_NUMBER =", value, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberNotEqualTo(Long value) {
            addCriterion("NC_ORDER_NUMBER <>", value, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberGreaterThan(Long value) {
            addCriterion("NC_ORDER_NUMBER >", value, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("NC_ORDER_NUMBER >=", value, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberLessThan(Long value) {
            addCriterion("NC_ORDER_NUMBER <", value, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberLessThanOrEqualTo(Long value) {
            addCriterion("NC_ORDER_NUMBER <=", value, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberIn(List<Long> values) {
            addCriterion("NC_ORDER_NUMBER in", values, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberNotIn(List<Long> values) {
            addCriterion("NC_ORDER_NUMBER not in", values, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberBetween(Long value1, Long value2) {
            addCriterion("NC_ORDER_NUMBER between", value1, value2, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNcOrderNumberNotBetween(Long value1, Long value2) {
            addCriterion("NC_ORDER_NUMBER not between", value1, value2, "ncOrderNumber");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("def1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("def1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("def1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("def1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("def1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("def1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("def1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("def1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("def1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("def1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("def1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("def1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("def1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("def1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("def2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("def2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("def2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("def2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("def2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("def2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("def2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("def2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("def2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("def2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("def2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("def2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("def2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("def2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("def3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("def3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("def3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("def3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("def3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("def3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("def3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("def3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("def3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("def3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("def3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("def3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("def3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("def3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef4IsNull() {
            addCriterion("def4 is null");
            return (Criteria) this;
        }

        public Criteria andDef4IsNotNull() {
            addCriterion("def4 is not null");
            return (Criteria) this;
        }

        public Criteria andDef4EqualTo(String value) {
            addCriterion("def4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(String value) {
            addCriterion("def4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(String value) {
            addCriterion("def4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(String value) {
            addCriterion("def4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(String value) {
            addCriterion("def4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(String value) {
            addCriterion("def4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Like(String value) {
            addCriterion("def4 like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotLike(String value) {
            addCriterion("def4 not like", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<String> values) {
            addCriterion("def4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<String> values) {
            addCriterion("def4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(String value1, String value2) {
            addCriterion("def4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(String value1, String value2) {
            addCriterion("def4 not between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef5IsNull() {
            addCriterion("def5 is null");
            return (Criteria) this;
        }

        public Criteria andDef5IsNotNull() {
            addCriterion("def5 is not null");
            return (Criteria) this;
        }

        public Criteria andDef5EqualTo(String value) {
            addCriterion("def5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(String value) {
            addCriterion("def5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(String value) {
            addCriterion("def5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(String value) {
            addCriterion("def5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(String value) {
            addCriterion("def5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(String value) {
            addCriterion("def5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Like(String value) {
            addCriterion("def5 like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotLike(String value) {
            addCriterion("def5 not like", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<String> values) {
            addCriterion("def5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<String> values) {
            addCriterion("def5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(String value1, String value2) {
            addCriterion("def5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(String value1, String value2) {
            addCriterion("def5 not between", value1, value2, "def5");
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