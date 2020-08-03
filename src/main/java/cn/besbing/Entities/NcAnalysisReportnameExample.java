package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NcAnalysisReportnameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcAnalysisReportnameExample() {
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

        public Criteria andPkAnalysisReportnameIsNull() {
            addCriterion("PK_ANALYSIS_REPORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameIsNotNull() {
            addCriterion("PK_ANALYSIS_REPORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameEqualTo(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME =", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameNotEqualTo(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME <>", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameGreaterThan(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME >", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME >=", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameLessThan(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME <", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameLessThanOrEqualTo(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME <=", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameLike(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME like", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameNotLike(String value) {
            addCriterion("PK_ANALYSIS_REPORTNAME not like", value, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameIn(List<String> values) {
            addCriterion("PK_ANALYSIS_REPORTNAME in", values, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameNotIn(List<String> values) {
            addCriterion("PK_ANALYSIS_REPORTNAME not in", values, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameBetween(String value1, String value2) {
            addCriterion("PK_ANALYSIS_REPORTNAME between", value1, value2, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andPkAnalysisReportnameNotBetween(String value1, String value2) {
            addCriterion("PK_ANALYSIS_REPORTNAME not between", value1, value2, "pkAnalysisReportname");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeIsNull() {
            addCriterion("NC_REPORTNAME_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeIsNotNull() {
            addCriterion("NC_REPORTNAME_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeEqualTo(String value) {
            addCriterion("NC_REPORTNAME_CODE =", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeNotEqualTo(String value) {
            addCriterion("NC_REPORTNAME_CODE <>", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeGreaterThan(String value) {
            addCriterion("NC_REPORTNAME_CODE >", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_REPORTNAME_CODE >=", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeLessThan(String value) {
            addCriterion("NC_REPORTNAME_CODE <", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_REPORTNAME_CODE <=", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeLike(String value) {
            addCriterion("NC_REPORTNAME_CODE like", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeNotLike(String value) {
            addCriterion("NC_REPORTNAME_CODE not like", value, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeIn(List<String> values) {
            addCriterion("NC_REPORTNAME_CODE in", values, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeNotIn(List<String> values) {
            addCriterion("NC_REPORTNAME_CODE not in", values, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeBetween(String value1, String value2) {
            addCriterion("NC_REPORTNAME_CODE between", value1, value2, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameCodeNotBetween(String value1, String value2) {
            addCriterion("NC_REPORTNAME_CODE not between", value1, value2, "ncReportnameCode");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameIsNull() {
            addCriterion("NC_REPORTNAME_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameIsNotNull() {
            addCriterion("NC_REPORTNAME_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameEqualTo(String value) {
            addCriterion("NC_REPORTNAME_NAME =", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameNotEqualTo(String value) {
            addCriterion("NC_REPORTNAME_NAME <>", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameGreaterThan(String value) {
            addCriterion("NC_REPORTNAME_NAME >", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_REPORTNAME_NAME >=", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameLessThan(String value) {
            addCriterion("NC_REPORTNAME_NAME <", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameLessThanOrEqualTo(String value) {
            addCriterion("NC_REPORTNAME_NAME <=", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameLike(String value) {
            addCriterion("NC_REPORTNAME_NAME like", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameNotLike(String value) {
            addCriterion("NC_REPORTNAME_NAME not like", value, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameIn(List<String> values) {
            addCriterion("NC_REPORTNAME_NAME in", values, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameNotIn(List<String> values) {
            addCriterion("NC_REPORTNAME_NAME not in", values, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameBetween(String value1, String value2) {
            addCriterion("NC_REPORTNAME_NAME between", value1, value2, "ncReportnameName");
            return (Criteria) this;
        }

        public Criteria andNcReportnameNameNotBetween(String value1, String value2) {
            addCriterion("NC_REPORTNAME_NAME not between", value1, value2, "ncReportnameName");
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

        public Criteria andDef1IsNull() {
            addCriterion("DEF1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("DEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(Object value) {
            addCriterion("DEF1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(Object value) {
            addCriterion("DEF1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(Object value) {
            addCriterion("DEF1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(Object value) {
            addCriterion("DEF1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(Object value) {
            addCriterion("DEF1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(Object value) {
            addCriterion("DEF1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<Object> values) {
            addCriterion("DEF1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<Object> values) {
            addCriterion("DEF1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(Object value1, Object value2) {
            addCriterion("DEF1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(Object value1, Object value2) {
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

        public Criteria andDef2EqualTo(Object value) {
            addCriterion("DEF2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(Object value) {
            addCriterion("DEF2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(Object value) {
            addCriterion("DEF2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(Object value) {
            addCriterion("DEF2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(Object value) {
            addCriterion("DEF2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(Object value) {
            addCriterion("DEF2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<Object> values) {
            addCriterion("DEF2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<Object> values) {
            addCriterion("DEF2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(Object value1, Object value2) {
            addCriterion("DEF2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(Object value1, Object value2) {
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

        public Criteria andDef3EqualTo(Object value) {
            addCriterion("DEF3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(Object value) {
            addCriterion("DEF3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(Object value) {
            addCriterion("DEF3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(Object value) {
            addCriterion("DEF3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(Object value) {
            addCriterion("DEF3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(Object value) {
            addCriterion("DEF3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<Object> values) {
            addCriterion("DEF3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<Object> values) {
            addCriterion("DEF3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(Object value1, Object value2) {
            addCriterion("DEF3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(Object value1, Object value2) {
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

        public Criteria andDef4EqualTo(Object value) {
            addCriterion("DEF4 =", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotEqualTo(Object value) {
            addCriterion("DEF4 <>", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThan(Object value) {
            addCriterion("DEF4 >", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4GreaterThanOrEqualTo(Object value) {
            addCriterion("DEF4 >=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThan(Object value) {
            addCriterion("DEF4 <", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4LessThanOrEqualTo(Object value) {
            addCriterion("DEF4 <=", value, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4In(List<Object> values) {
            addCriterion("DEF4 in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotIn(List<Object> values) {
            addCriterion("DEF4 not in", values, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4Between(Object value1, Object value2) {
            addCriterion("DEF4 between", value1, value2, "def4");
            return (Criteria) this;
        }

        public Criteria andDef4NotBetween(Object value1, Object value2) {
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

        public Criteria andDef5EqualTo(Object value) {
            addCriterion("DEF5 =", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotEqualTo(Object value) {
            addCriterion("DEF5 <>", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThan(Object value) {
            addCriterion("DEF5 >", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5GreaterThanOrEqualTo(Object value) {
            addCriterion("DEF5 >=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThan(Object value) {
            addCriterion("DEF5 <", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5LessThanOrEqualTo(Object value) {
            addCriterion("DEF5 <=", value, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5In(List<Object> values) {
            addCriterion("DEF5 in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotIn(List<Object> values) {
            addCriterion("DEF5 not in", values, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5Between(Object value1, Object value2) {
            addCriterion("DEF5 between", value1, value2, "def5");
            return (Criteria) this;
        }

        public Criteria andDef5NotBetween(Object value1, Object value2) {
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