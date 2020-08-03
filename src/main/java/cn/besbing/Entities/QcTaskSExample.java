package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcTaskSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcTaskSExample() {
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

        public Criteria andPkTaskSIsNull() {
            addCriterion("PK_TASK_S is null");
            return (Criteria) this;
        }

        public Criteria andPkTaskSIsNotNull() {
            addCriterion("PK_TASK_S is not null");
            return (Criteria) this;
        }

        public Criteria andPkTaskSEqualTo(String value) {
            addCriterion("PK_TASK_S =", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSNotEqualTo(String value) {
            addCriterion("PK_TASK_S <>", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSGreaterThan(String value) {
            addCriterion("PK_TASK_S >", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TASK_S >=", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSLessThan(String value) {
            addCriterion("PK_TASK_S <", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSLessThanOrEqualTo(String value) {
            addCriterion("PK_TASK_S <=", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSLike(String value) {
            addCriterion("PK_TASK_S like", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSNotLike(String value) {
            addCriterion("PK_TASK_S not like", value, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSIn(List<String> values) {
            addCriterion("PK_TASK_S in", values, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSNotIn(List<String> values) {
            addCriterion("PK_TASK_S not in", values, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSBetween(String value1, String value2) {
            addCriterion("PK_TASK_S between", value1, value2, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTaskSNotBetween(String value1, String value2) {
            addCriterion("PK_TASK_S not between", value1, value2, "pkTaskS");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemIsNull() {
            addCriterion("PK_TESTCONDITIONITEM is null");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemIsNotNull() {
            addCriterion("PK_TESTCONDITIONITEM is not null");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM =", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemNotEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM <>", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemGreaterThan(String value) {
            addCriterion("PK_TESTCONDITIONITEM >", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM >=", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemLessThan(String value) {
            addCriterion("PK_TESTCONDITIONITEM <", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemLessThanOrEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM <=", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemLike(String value) {
            addCriterion("PK_TESTCONDITIONITEM like", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemNotLike(String value) {
            addCriterion("PK_TESTCONDITIONITEM not like", value, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemIn(List<String> values) {
            addCriterion("PK_TESTCONDITIONITEM in", values, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemNotIn(List<String> values) {
            addCriterion("PK_TESTCONDITIONITEM not in", values, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBetween(String value1, String value2) {
            addCriterion("PK_TESTCONDITIONITEM between", value1, value2, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemNotBetween(String value1, String value2) {
            addCriterion("PK_TESTCONDITIONITEM not between", value1, value2, "pkTestconditionitem");
            return (Criteria) this;
        }

        public Criteria andConditionstatusIsNull() {
            addCriterion("CONDITIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andConditionstatusIsNotNull() {
            addCriterion("CONDITIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConditionstatusEqualTo(String value) {
            addCriterion("CONDITIONSTATUS =", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusNotEqualTo(String value) {
            addCriterion("CONDITIONSTATUS <>", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusGreaterThan(String value) {
            addCriterion("CONDITIONSTATUS >", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONDITIONSTATUS >=", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusLessThan(String value) {
            addCriterion("CONDITIONSTATUS <", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusLessThanOrEqualTo(String value) {
            addCriterion("CONDITIONSTATUS <=", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusLike(String value) {
            addCriterion("CONDITIONSTATUS like", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusNotLike(String value) {
            addCriterion("CONDITIONSTATUS not like", value, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusIn(List<String> values) {
            addCriterion("CONDITIONSTATUS in", values, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusNotIn(List<String> values) {
            addCriterion("CONDITIONSTATUS not in", values, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusBetween(String value1, String value2) {
            addCriterion("CONDITIONSTATUS between", value1, value2, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andConditionstatusNotBetween(String value1, String value2) {
            addCriterion("CONDITIONSTATUS not between", value1, value2, "conditionstatus");
            return (Criteria) this;
        }

        public Criteria andIsoptionalIsNull() {
            addCriterion("ISOPTIONAL is null");
            return (Criteria) this;
        }

        public Criteria andIsoptionalIsNotNull() {
            addCriterion("ISOPTIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsoptionalEqualTo(String value) {
            addCriterion("ISOPTIONAL =", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotEqualTo(String value) {
            addCriterion("ISOPTIONAL <>", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalGreaterThan(String value) {
            addCriterion("ISOPTIONAL >", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalGreaterThanOrEqualTo(String value) {
            addCriterion("ISOPTIONAL >=", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalLessThan(String value) {
            addCriterion("ISOPTIONAL <", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalLessThanOrEqualTo(String value) {
            addCriterion("ISOPTIONAL <=", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalLike(String value) {
            addCriterion("ISOPTIONAL like", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotLike(String value) {
            addCriterion("ISOPTIONAL not like", value, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalIn(List<String> values) {
            addCriterion("ISOPTIONAL in", values, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotIn(List<String> values) {
            addCriterion("ISOPTIONAL not in", values, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalBetween(String value1, String value2) {
            addCriterion("ISOPTIONAL between", value1, value2, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsoptionalNotBetween(String value1, String value2) {
            addCriterion("ISOPTIONAL not between", value1, value2, "isoptional");
            return (Criteria) this;
        }

        public Criteria andIsallowOutIsNull() {
            addCriterion("ISALLOW_OUT is null");
            return (Criteria) this;
        }

        public Criteria andIsallowOutIsNotNull() {
            addCriterion("ISALLOW_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andIsallowOutEqualTo(String value) {
            addCriterion("ISALLOW_OUT =", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutNotEqualTo(String value) {
            addCriterion("ISALLOW_OUT <>", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutGreaterThan(String value) {
            addCriterion("ISALLOW_OUT >", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutGreaterThanOrEqualTo(String value) {
            addCriterion("ISALLOW_OUT >=", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutLessThan(String value) {
            addCriterion("ISALLOW_OUT <", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutLessThanOrEqualTo(String value) {
            addCriterion("ISALLOW_OUT <=", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutLike(String value) {
            addCriterion("ISALLOW_OUT like", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutNotLike(String value) {
            addCriterion("ISALLOW_OUT not like", value, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutIn(List<String> values) {
            addCriterion("ISALLOW_OUT in", values, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutNotIn(List<String> values) {
            addCriterion("ISALLOW_OUT not in", values, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutBetween(String value1, String value2) {
            addCriterion("ISALLOW_OUT between", value1, value2, "isallowOut");
            return (Criteria) this;
        }

        public Criteria andIsallowOutNotBetween(String value1, String value2) {
            addCriterion("ISALLOW_OUT not between", value1, value2, "isallowOut");
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

        public Criteria andPkValuetypeIsNull() {
            addCriterion("PK_VALUETYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeIsNotNull() {
            addCriterion("PK_VALUETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeEqualTo(String value) {
            addCriterion("PK_VALUETYPE =", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeNotEqualTo(String value) {
            addCriterion("PK_VALUETYPE <>", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeGreaterThan(String value) {
            addCriterion("PK_VALUETYPE >", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_VALUETYPE >=", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeLessThan(String value) {
            addCriterion("PK_VALUETYPE <", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeLessThanOrEqualTo(String value) {
            addCriterion("PK_VALUETYPE <=", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeLike(String value) {
            addCriterion("PK_VALUETYPE like", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeNotLike(String value) {
            addCriterion("PK_VALUETYPE not like", value, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeIn(List<String> values) {
            addCriterion("PK_VALUETYPE in", values, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeNotIn(List<String> values) {
            addCriterion("PK_VALUETYPE not in", values, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeBetween(String value1, String value2) {
            addCriterion("PK_VALUETYPE between", value1, value2, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andPkValuetypeNotBetween(String value1, String value2) {
            addCriterion("PK_VALUETYPE not between", value1, value2, "pkValuetype");
            return (Criteria) this;
        }

        public Criteria andValuewaysIsNull() {
            addCriterion("VALUEWAYS is null");
            return (Criteria) this;
        }

        public Criteria andValuewaysIsNotNull() {
            addCriterion("VALUEWAYS is not null");
            return (Criteria) this;
        }

        public Criteria andValuewaysEqualTo(BigDecimal value) {
            addCriterion("VALUEWAYS =", value, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysNotEqualTo(BigDecimal value) {
            addCriterion("VALUEWAYS <>", value, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysGreaterThan(BigDecimal value) {
            addCriterion("VALUEWAYS >", value, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUEWAYS >=", value, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysLessThan(BigDecimal value) {
            addCriterion("VALUEWAYS <", value, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUEWAYS <=", value, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysIn(List<BigDecimal> values) {
            addCriterion("VALUEWAYS in", values, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysNotIn(List<BigDecimal> values) {
            addCriterion("VALUEWAYS not in", values, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUEWAYS between", value1, value2, "valueways");
            return (Criteria) this;
        }

        public Criteria andValuewaysNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUEWAYS not between", value1, value2, "valueways");
            return (Criteria) this;
        }

        public Criteria andTextvalueIsNull() {
            addCriterion("TEXTVALUE is null");
            return (Criteria) this;
        }

        public Criteria andTextvalueIsNotNull() {
            addCriterion("TEXTVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andTextvalueEqualTo(String value) {
            addCriterion("TEXTVALUE =", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotEqualTo(String value) {
            addCriterion("TEXTVALUE <>", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueGreaterThan(String value) {
            addCriterion("TEXTVALUE >", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTVALUE >=", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueLessThan(String value) {
            addCriterion("TEXTVALUE <", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueLessThanOrEqualTo(String value) {
            addCriterion("TEXTVALUE <=", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueLike(String value) {
            addCriterion("TEXTVALUE like", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotLike(String value) {
            addCriterion("TEXTVALUE not like", value, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueIn(List<String> values) {
            addCriterion("TEXTVALUE in", values, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotIn(List<String> values) {
            addCriterion("TEXTVALUE not in", values, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueBetween(String value1, String value2) {
            addCriterion("TEXTVALUE between", value1, value2, "textvalue");
            return (Criteria) this;
        }

        public Criteria andTextvalueNotBetween(String value1, String value2) {
            addCriterion("TEXTVALUE not between", value1, value2, "textvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueIsNull() {
            addCriterion("REFVALUE is null");
            return (Criteria) this;
        }

        public Criteria andRefvalueIsNotNull() {
            addCriterion("REFVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRefvalueEqualTo(String value) {
            addCriterion("REFVALUE =", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueNotEqualTo(String value) {
            addCriterion("REFVALUE <>", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueGreaterThan(String value) {
            addCriterion("REFVALUE >", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueGreaterThanOrEqualTo(String value) {
            addCriterion("REFVALUE >=", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueLessThan(String value) {
            addCriterion("REFVALUE <", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueLessThanOrEqualTo(String value) {
            addCriterion("REFVALUE <=", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueLike(String value) {
            addCriterion("REFVALUE like", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueNotLike(String value) {
            addCriterion("REFVALUE not like", value, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueIn(List<String> values) {
            addCriterion("REFVALUE in", values, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueNotIn(List<String> values) {
            addCriterion("REFVALUE not in", values, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueBetween(String value1, String value2) {
            addCriterion("REFVALUE between", value1, value2, "refvalue");
            return (Criteria) this;
        }

        public Criteria andRefvalueNotBetween(String value1, String value2) {
            addCriterion("REFVALUE not between", value1, value2, "refvalue");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
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

        public Criteria andEnglishdescriptionIsNull() {
            addCriterion("ENGLISHDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionIsNotNull() {
            addCriterion("ENGLISHDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionEqualTo(String value) {
            addCriterion("ENGLISHDESCRIPTION =", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionNotEqualTo(String value) {
            addCriterion("ENGLISHDESCRIPTION <>", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionGreaterThan(String value) {
            addCriterion("ENGLISHDESCRIPTION >", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISHDESCRIPTION >=", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionLessThan(String value) {
            addCriterion("ENGLISHDESCRIPTION <", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionLessThanOrEqualTo(String value) {
            addCriterion("ENGLISHDESCRIPTION <=", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionLike(String value) {
            addCriterion("ENGLISHDESCRIPTION like", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionNotLike(String value) {
            addCriterion("ENGLISHDESCRIPTION not like", value, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionIn(List<String> values) {
            addCriterion("ENGLISHDESCRIPTION in", values, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionNotIn(List<String> values) {
            addCriterion("ENGLISHDESCRIPTION not in", values, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionBetween(String value1, String value2) {
            addCriterion("ENGLISHDESCRIPTION between", value1, value2, "englishdescription");
            return (Criteria) this;
        }

        public Criteria andEnglishdescriptionNotBetween(String value1, String value2) {
            addCriterion("ENGLISHDESCRIPTION not between", value1, value2, "englishdescription");
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

        public Criteria andPkTaskBIsNull() {
            addCriterion("PK_TASK_B is null");
            return (Criteria) this;
        }

        public Criteria andPkTaskBIsNotNull() {
            addCriterion("PK_TASK_B is not null");
            return (Criteria) this;
        }

        public Criteria andPkTaskBEqualTo(String value) {
            addCriterion("PK_TASK_B =", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBNotEqualTo(String value) {
            addCriterion("PK_TASK_B <>", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBGreaterThan(String value) {
            addCriterion("PK_TASK_B >", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TASK_B >=", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBLessThan(String value) {
            addCriterion("PK_TASK_B <", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBLessThanOrEqualTo(String value) {
            addCriterion("PK_TASK_B <=", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBLike(String value) {
            addCriterion("PK_TASK_B like", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBNotLike(String value) {
            addCriterion("PK_TASK_B not like", value, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBIn(List<String> values) {
            addCriterion("PK_TASK_B in", values, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBNotIn(List<String> values) {
            addCriterion("PK_TASK_B not in", values, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBBetween(String value1, String value2) {
            addCriterion("PK_TASK_B between", value1, value2, "pkTaskB");
            return (Criteria) this;
        }

        public Criteria andPkTaskBNotBetween(String value1, String value2) {
            addCriterion("PK_TASK_B not between", value1, value2, "pkTaskB");
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

        public Criteria andDrIsNull() {
            addCriterion("DR is null");
            return (Criteria) this;
        }

        public Criteria andDrIsNotNull() {
            addCriterion("DR is not null");
            return (Criteria) this;
        }

        public Criteria andDrEqualTo(BigDecimal value) {
            addCriterion("DR =", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotEqualTo(BigDecimal value) {
            addCriterion("DR <>", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThan(BigDecimal value) {
            addCriterion("DR >", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DR >=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThan(BigDecimal value) {
            addCriterion("DR <", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DR <=", value, "dr");
            return (Criteria) this;
        }

        public Criteria andDrIn(List<BigDecimal> values) {
            addCriterion("DR in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotIn(List<BigDecimal> values) {
            addCriterion("DR not in", values, "dr");
            return (Criteria) this;
        }

        public Criteria andDrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DR between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andDrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DR not between", value1, value2, "dr");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackIsNull() {
            addCriterion("PK_TESTCONDITIONITEM_BACK is null");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackIsNotNull() {
            addCriterion("PK_TESTCONDITIONITEM_BACK is not null");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK =", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackNotEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK <>", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackGreaterThan(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK >", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK >=", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackLessThan(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK <", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackLessThanOrEqualTo(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK <=", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackLike(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK like", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackNotLike(String value) {
            addCriterion("PK_TESTCONDITIONITEM_BACK not like", value, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackIn(List<String> values) {
            addCriterion("PK_TESTCONDITIONITEM_BACK in", values, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackNotIn(List<String> values) {
            addCriterion("PK_TESTCONDITIONITEM_BACK not in", values, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackBetween(String value1, String value2) {
            addCriterion("PK_TESTCONDITIONITEM_BACK between", value1, value2, "pkTestconditionitemBack");
            return (Criteria) this;
        }

        public Criteria andPkTestconditionitemBackNotBetween(String value1, String value2) {
            addCriterion("PK_TESTCONDITIONITEM_BACK not between", value1, value2, "pkTestconditionitemBack");
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