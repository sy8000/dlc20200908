package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcTaskRExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcTaskRExample() {
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

        public Criteria andPkTaskRIsNull() {
            addCriterion("PK_TASK_R is null");
            return (Criteria) this;
        }

        public Criteria andPkTaskRIsNotNull() {
            addCriterion("PK_TASK_R is not null");
            return (Criteria) this;
        }

        public Criteria andPkTaskREqualTo(String value) {
            addCriterion("PK_TASK_R =", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRNotEqualTo(String value) {
            addCriterion("PK_TASK_R <>", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRGreaterThan(String value) {
            addCriterion("PK_TASK_R >", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TASK_R >=", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRLessThan(String value) {
            addCriterion("PK_TASK_R <", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRLessThanOrEqualTo(String value) {
            addCriterion("PK_TASK_R <=", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRLike(String value) {
            addCriterion("PK_TASK_R like", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRNotLike(String value) {
            addCriterion("PK_TASK_R not like", value, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRIn(List<String> values) {
            addCriterion("PK_TASK_R in", values, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRNotIn(List<String> values) {
            addCriterion("PK_TASK_R not in", values, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRBetween(String value1, String value2) {
            addCriterion("PK_TASK_R between", value1, value2, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkTaskRNotBetween(String value1, String value2) {
            addCriterion("PK_TASK_R not between", value1, value2, "pkTaskR");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupIsNull() {
            addCriterion("PK_SAMPLEGROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupIsNotNull() {
            addCriterion("PK_SAMPLEGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP =", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP <>", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupGreaterThan(String value) {
            addCriterion("PK_SAMPLEGROUP >", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP >=", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupLessThan(String value) {
            addCriterion("PK_SAMPLEGROUP <", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupLessThanOrEqualTo(String value) {
            addCriterion("PK_SAMPLEGROUP <=", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupLike(String value) {
            addCriterion("PK_SAMPLEGROUP like", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotLike(String value) {
            addCriterion("PK_SAMPLEGROUP not like", value, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupIn(List<String> values) {
            addCriterion("PK_SAMPLEGROUP in", values, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotIn(List<String> values) {
            addCriterion("PK_SAMPLEGROUP not in", values, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupBetween(String value1, String value2) {
            addCriterion("PK_SAMPLEGROUP between", value1, value2, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andPkSamplegroupNotBetween(String value1, String value2) {
            addCriterion("PK_SAMPLEGROUP not between", value1, value2, "pkSamplegroup");
            return (Criteria) this;
        }

        public Criteria andStdminvalueIsNull() {
            addCriterion("STDMINVALUE is null");
            return (Criteria) this;
        }

        public Criteria andStdminvalueIsNotNull() {
            addCriterion("STDMINVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andStdminvalueEqualTo(BigDecimal value) {
            addCriterion("STDMINVALUE =", value, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueNotEqualTo(BigDecimal value) {
            addCriterion("STDMINVALUE <>", value, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueGreaterThan(BigDecimal value) {
            addCriterion("STDMINVALUE >", value, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STDMINVALUE >=", value, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueLessThan(BigDecimal value) {
            addCriterion("STDMINVALUE <", value, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STDMINVALUE <=", value, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueIn(List<BigDecimal> values) {
            addCriterion("STDMINVALUE in", values, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueNotIn(List<BigDecimal> values) {
            addCriterion("STDMINVALUE not in", values, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STDMINVALUE between", value1, value2, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdminvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STDMINVALUE not between", value1, value2, "stdminvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueIsNull() {
            addCriterion("STDMAXVALUE is null");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueIsNotNull() {
            addCriterion("STDMAXVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueEqualTo(BigDecimal value) {
            addCriterion("STDMAXVALUE =", value, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueNotEqualTo(BigDecimal value) {
            addCriterion("STDMAXVALUE <>", value, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueGreaterThan(BigDecimal value) {
            addCriterion("STDMAXVALUE >", value, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STDMAXVALUE >=", value, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueLessThan(BigDecimal value) {
            addCriterion("STDMAXVALUE <", value, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STDMAXVALUE <=", value, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueIn(List<BigDecimal> values) {
            addCriterion("STDMAXVALUE in", values, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueNotIn(List<BigDecimal> values) {
            addCriterion("STDMAXVALUE not in", values, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STDMAXVALUE between", value1, value2, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andStdmaxvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STDMAXVALUE not between", value1, value2, "stdmaxvalue");
            return (Criteria) this;
        }

        public Criteria andPkUnitIsNull() {
            addCriterion("PK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPkUnitIsNotNull() {
            addCriterion("PK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPkUnitEqualTo(String value) {
            addCriterion("PK_UNIT =", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitNotEqualTo(String value) {
            addCriterion("PK_UNIT <>", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitGreaterThan(String value) {
            addCriterion("PK_UNIT >", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PK_UNIT >=", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitLessThan(String value) {
            addCriterion("PK_UNIT <", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitLessThanOrEqualTo(String value) {
            addCriterion("PK_UNIT <=", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitLike(String value) {
            addCriterion("PK_UNIT like", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitNotLike(String value) {
            addCriterion("PK_UNIT not like", value, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitIn(List<String> values) {
            addCriterion("PK_UNIT in", values, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitNotIn(List<String> values) {
            addCriterion("PK_UNIT not in", values, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitBetween(String value1, String value2) {
            addCriterion("PK_UNIT between", value1, value2, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andPkUnitNotBetween(String value1, String value2) {
            addCriterion("PK_UNIT not between", value1, value2, "pkUnit");
            return (Criteria) this;
        }

        public Criteria andTestflagIsNull() {
            addCriterion("TESTFLAG is null");
            return (Criteria) this;
        }

        public Criteria andTestflagIsNotNull() {
            addCriterion("TESTFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTestflagEqualTo(String value) {
            addCriterion("TESTFLAG =", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagNotEqualTo(String value) {
            addCriterion("TESTFLAG <>", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagGreaterThan(String value) {
            addCriterion("TESTFLAG >", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagGreaterThanOrEqualTo(String value) {
            addCriterion("TESTFLAG >=", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagLessThan(String value) {
            addCriterion("TESTFLAG <", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagLessThanOrEqualTo(String value) {
            addCriterion("TESTFLAG <=", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagLike(String value) {
            addCriterion("TESTFLAG like", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagNotLike(String value) {
            addCriterion("TESTFLAG not like", value, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagIn(List<String> values) {
            addCriterion("TESTFLAG in", values, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagNotIn(List<String> values) {
            addCriterion("TESTFLAG not in", values, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagBetween(String value1, String value2) {
            addCriterion("TESTFLAG between", value1, value2, "testflag");
            return (Criteria) this;
        }

        public Criteria andTestflagNotBetween(String value1, String value2) {
            addCriterion("TESTFLAG not between", value1, value2, "testflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagIsNull() {
            addCriterion("JUDGEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andJudgeflagIsNotNull() {
            addCriterion("JUDGEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeflagEqualTo(String value) {
            addCriterion("JUDGEFLAG =", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagNotEqualTo(String value) {
            addCriterion("JUDGEFLAG <>", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagGreaterThan(String value) {
            addCriterion("JUDGEFLAG >", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagGreaterThanOrEqualTo(String value) {
            addCriterion("JUDGEFLAG >=", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagLessThan(String value) {
            addCriterion("JUDGEFLAG <", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagLessThanOrEqualTo(String value) {
            addCriterion("JUDGEFLAG <=", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagLike(String value) {
            addCriterion("JUDGEFLAG like", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagNotLike(String value) {
            addCriterion("JUDGEFLAG not like", value, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagIn(List<String> values) {
            addCriterion("JUDGEFLAG in", values, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagNotIn(List<String> values) {
            addCriterion("JUDGEFLAG not in", values, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagBetween(String value1, String value2) {
            addCriterion("JUDGEFLAG between", value1, value2, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andJudgeflagNotBetween(String value1, String value2) {
            addCriterion("JUDGEFLAG not between", value1, value2, "judgeflag");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureIsNull() {
            addCriterion("PK_TESTTEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureIsNotNull() {
            addCriterion("PK_TESTTEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureEqualTo(String value) {
            addCriterion("PK_TESTTEMPERATURE =", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureNotEqualTo(String value) {
            addCriterion("PK_TESTTEMPERATURE <>", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureGreaterThan(String value) {
            addCriterion("PK_TESTTEMPERATURE >", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TESTTEMPERATURE >=", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureLessThan(String value) {
            addCriterion("PK_TESTTEMPERATURE <", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureLessThanOrEqualTo(String value) {
            addCriterion("PK_TESTTEMPERATURE <=", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureLike(String value) {
            addCriterion("PK_TESTTEMPERATURE like", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureNotLike(String value) {
            addCriterion("PK_TESTTEMPERATURE not like", value, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureIn(List<String> values) {
            addCriterion("PK_TESTTEMPERATURE in", values, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureNotIn(List<String> values) {
            addCriterion("PK_TESTTEMPERATURE not in", values, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureBetween(String value1, String value2) {
            addCriterion("PK_TESTTEMPERATURE between", value1, value2, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andPkTesttemperatureNotBetween(String value1, String value2) {
            addCriterion("PK_TESTTEMPERATURE not between", value1, value2, "pkTesttemperature");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameIsNull() {
            addCriterion("ANALYSISNAME is null");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameIsNotNull() {
            addCriterion("ANALYSISNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameEqualTo(String value) {
            addCriterion("ANALYSISNAME =", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameNotEqualTo(String value) {
            addCriterion("ANALYSISNAME <>", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameGreaterThan(String value) {
            addCriterion("ANALYSISNAME >", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameGreaterThanOrEqualTo(String value) {
            addCriterion("ANALYSISNAME >=", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameLessThan(String value) {
            addCriterion("ANALYSISNAME <", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameLessThanOrEqualTo(String value) {
            addCriterion("ANALYSISNAME <=", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameLike(String value) {
            addCriterion("ANALYSISNAME like", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameNotLike(String value) {
            addCriterion("ANALYSISNAME not like", value, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameIn(List<String> values) {
            addCriterion("ANALYSISNAME in", values, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameNotIn(List<String> values) {
            addCriterion("ANALYSISNAME not in", values, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameBetween(String value1, String value2) {
            addCriterion("ANALYSISNAME between", value1, value2, "analysisname");
            return (Criteria) this;
        }

        public Criteria andAnalysisnameNotBetween(String value1, String value2) {
            addCriterion("ANALYSISNAME not between", value1, value2, "analysisname");
            return (Criteria) this;
        }

        public Criteria andPkComponentIsNull() {
            addCriterion("PK_COMPONENT is null");
            return (Criteria) this;
        }

        public Criteria andPkComponentIsNotNull() {
            addCriterion("PK_COMPONENT is not null");
            return (Criteria) this;
        }

        public Criteria andPkComponentEqualTo(String value) {
            addCriterion("PK_COMPONENT =", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentNotEqualTo(String value) {
            addCriterion("PK_COMPONENT <>", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentGreaterThan(String value) {
            addCriterion("PK_COMPONENT >", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COMPONENT >=", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentLessThan(String value) {
            addCriterion("PK_COMPONENT <", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentLessThanOrEqualTo(String value) {
            addCriterion("PK_COMPONENT <=", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentLike(String value) {
            addCriterion("PK_COMPONENT like", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentNotLike(String value) {
            addCriterion("PK_COMPONENT not like", value, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentIn(List<String> values) {
            addCriterion("PK_COMPONENT in", values, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentNotIn(List<String> values) {
            addCriterion("PK_COMPONENT not in", values, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentBetween(String value1, String value2) {
            addCriterion("PK_COMPONENT between", value1, value2, "pkComponent");
            return (Criteria) this;
        }

        public Criteria andPkComponentNotBetween(String value1, String value2) {
            addCriterion("PK_COMPONENT not between", value1, value2, "pkComponent");
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