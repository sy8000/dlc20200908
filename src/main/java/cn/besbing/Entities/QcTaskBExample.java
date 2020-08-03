package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcTaskBExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcTaskBExample() {
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

        public Criteria andTaskcodeIsNull() {
            addCriterion("TASKCODE is null");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIsNotNull() {
            addCriterion("TASKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTaskcodeEqualTo(String value) {
            addCriterion("TASKCODE =", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotEqualTo(String value) {
            addCriterion("TASKCODE <>", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeGreaterThan(String value) {
            addCriterion("TASKCODE >", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeGreaterThanOrEqualTo(String value) {
            addCriterion("TASKCODE >=", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLessThan(String value) {
            addCriterion("TASKCODE <", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLessThanOrEqualTo(String value) {
            addCriterion("TASKCODE <=", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeLike(String value) {
            addCriterion("TASKCODE like", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotLike(String value) {
            addCriterion("TASKCODE not like", value, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeIn(List<String> values) {
            addCriterion("TASKCODE in", values, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotIn(List<String> values) {
            addCriterion("TASKCODE not in", values, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeBetween(String value1, String value2) {
            addCriterion("TASKCODE between", value1, value2, "taskcode");
            return (Criteria) this;
        }

        public Criteria andTaskcodeNotBetween(String value1, String value2) {
            addCriterion("TASKCODE not between", value1, value2, "taskcode");
            return (Criteria) this;
        }

        public Criteria andUniquekeyIsNull() {
            addCriterion("UNIQUEKEY is null");
            return (Criteria) this;
        }

        public Criteria andUniquekeyIsNotNull() {
            addCriterion("UNIQUEKEY is not null");
            return (Criteria) this;
        }

        public Criteria andUniquekeyEqualTo(String value) {
            addCriterion("UNIQUEKEY =", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotEqualTo(String value) {
            addCriterion("UNIQUEKEY <>", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyGreaterThan(String value) {
            addCriterion("UNIQUEKEY >", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyGreaterThanOrEqualTo(String value) {
            addCriterion("UNIQUEKEY >=", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyLessThan(String value) {
            addCriterion("UNIQUEKEY <", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyLessThanOrEqualTo(String value) {
            addCriterion("UNIQUEKEY <=", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyLike(String value) {
            addCriterion("UNIQUEKEY like", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotLike(String value) {
            addCriterion("UNIQUEKEY not like", value, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyIn(List<String> values) {
            addCriterion("UNIQUEKEY in", values, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotIn(List<String> values) {
            addCriterion("UNIQUEKEY not in", values, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyBetween(String value1, String value2) {
            addCriterion("UNIQUEKEY between", value1, value2, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andUniquekeyNotBetween(String value1, String value2) {
            addCriterion("UNIQUEKEY not between", value1, value2, "uniquekey");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNull() {
            addCriterion("TASKNAME is null");
            return (Criteria) this;
        }

        public Criteria andTasknameIsNotNull() {
            addCriterion("TASKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTasknameEqualTo(String value) {
            addCriterion("TASKNAME =", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotEqualTo(String value) {
            addCriterion("TASKNAME <>", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThan(String value) {
            addCriterion("TASKNAME >", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameGreaterThanOrEqualTo(String value) {
            addCriterion("TASKNAME >=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThan(String value) {
            addCriterion("TASKNAME <", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLessThanOrEqualTo(String value) {
            addCriterion("TASKNAME <=", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameLike(String value) {
            addCriterion("TASKNAME like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotLike(String value) {
            addCriterion("TASKNAME not like", value, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameIn(List<String> values) {
            addCriterion("TASKNAME in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotIn(List<String> values) {
            addCriterion("TASKNAME not in", values, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameBetween(String value1, String value2) {
            addCriterion("TASKNAME between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andTasknameNotBetween(String value1, String value2) {
            addCriterion("TASKNAME not between", value1, value2, "taskname");
            return (Criteria) this;
        }

        public Criteria andRunorderIsNull() {
            addCriterion("RUNORDER is null");
            return (Criteria) this;
        }

        public Criteria andRunorderIsNotNull() {
            addCriterion("RUNORDER is not null");
            return (Criteria) this;
        }

        public Criteria andRunorderEqualTo(BigDecimal value) {
            addCriterion("RUNORDER =", value, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderNotEqualTo(BigDecimal value) {
            addCriterion("RUNORDER <>", value, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderGreaterThan(BigDecimal value) {
            addCriterion("RUNORDER >", value, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RUNORDER >=", value, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderLessThan(BigDecimal value) {
            addCriterion("RUNORDER <", value, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RUNORDER <=", value, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderIn(List<BigDecimal> values) {
            addCriterion("RUNORDER in", values, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderNotIn(List<BigDecimal> values) {
            addCriterion("RUNORDER not in", values, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RUNORDER between", value1, value2, "runorder");
            return (Criteria) this;
        }

        public Criteria andRunorderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RUNORDER not between", value1, value2, "runorder");
            return (Criteria) this;
        }

        public Criteria andRownoIsNull() {
            addCriterion("ROWNO is null");
            return (Criteria) this;
        }

        public Criteria andRownoIsNotNull() {
            addCriterion("ROWNO is not null");
            return (Criteria) this;
        }

        public Criteria andRownoEqualTo(BigDecimal value) {
            addCriterion("ROWNO =", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotEqualTo(BigDecimal value) {
            addCriterion("ROWNO <>", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThan(BigDecimal value) {
            addCriterion("ROWNO >", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROWNO >=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThan(BigDecimal value) {
            addCriterion("ROWNO <", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROWNO <=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoIn(List<BigDecimal> values) {
            addCriterion("ROWNO in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotIn(List<BigDecimal> values) {
            addCriterion("ROWNO not in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROWNO between", value1, value2, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROWNO not between", value1, value2, "rowno");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameIsNull() {
            addCriterion("PK_TESTRESULTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameIsNotNull() {
            addCriterion("PK_TESTRESULTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameEqualTo(String value) {
            addCriterion("PK_TESTRESULTNAME =", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameNotEqualTo(String value) {
            addCriterion("PK_TESTRESULTNAME <>", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameGreaterThan(String value) {
            addCriterion("PK_TESTRESULTNAME >", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TESTRESULTNAME >=", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameLessThan(String value) {
            addCriterion("PK_TESTRESULTNAME <", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameLessThanOrEqualTo(String value) {
            addCriterion("PK_TESTRESULTNAME <=", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameLike(String value) {
            addCriterion("PK_TESTRESULTNAME like", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameNotLike(String value) {
            addCriterion("PK_TESTRESULTNAME not like", value, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameIn(List<String> values) {
            addCriterion("PK_TESTRESULTNAME in", values, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameNotIn(List<String> values) {
            addCriterion("PK_TESTRESULTNAME not in", values, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameBetween(String value1, String value2) {
            addCriterion("PK_TESTRESULTNAME between", value1, value2, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andPkTestresultnameNotBetween(String value1, String value2) {
            addCriterion("PK_TESTRESULTNAME not between", value1, value2, "pkTestresultname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameIsNull() {
            addCriterion("TESTRESULTSHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameIsNotNull() {
            addCriterion("TESTRESULTSHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameEqualTo(String value) {
            addCriterion("TESTRESULTSHORTNAME =", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameNotEqualTo(String value) {
            addCriterion("TESTRESULTSHORTNAME <>", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameGreaterThan(String value) {
            addCriterion("TESTRESULTSHORTNAME >", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("TESTRESULTSHORTNAME >=", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameLessThan(String value) {
            addCriterion("TESTRESULTSHORTNAME <", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameLessThanOrEqualTo(String value) {
            addCriterion("TESTRESULTSHORTNAME <=", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameLike(String value) {
            addCriterion("TESTRESULTSHORTNAME like", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameNotLike(String value) {
            addCriterion("TESTRESULTSHORTNAME not like", value, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameIn(List<String> values) {
            addCriterion("TESTRESULTSHORTNAME in", values, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameNotIn(List<String> values) {
            addCriterion("TESTRESULTSHORTNAME not in", values, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameBetween(String value1, String value2) {
            addCriterion("TESTRESULTSHORTNAME between", value1, value2, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestresultshortnameNotBetween(String value1, String value2) {
            addCriterion("TESTRESULTSHORTNAME not between", value1, value2, "testresultshortname");
            return (Criteria) this;
        }

        public Criteria andTestitemIsNull() {
            addCriterion("TESTITEM is null");
            return (Criteria) this;
        }

        public Criteria andTestitemIsNotNull() {
            addCriterion("TESTITEM is not null");
            return (Criteria) this;
        }

        public Criteria andTestitemEqualTo(String value) {
            addCriterion("TESTITEM =", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemNotEqualTo(String value) {
            addCriterion("TESTITEM <>", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemGreaterThan(String value) {
            addCriterion("TESTITEM >", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemGreaterThanOrEqualTo(String value) {
            addCriterion("TESTITEM >=", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemLessThan(String value) {
            addCriterion("TESTITEM <", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemLessThanOrEqualTo(String value) {
            addCriterion("TESTITEM <=", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemLike(String value) {
            addCriterion("TESTITEM like", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemNotLike(String value) {
            addCriterion("TESTITEM not like", value, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemIn(List<String> values) {
            addCriterion("TESTITEM in", values, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemNotIn(List<String> values) {
            addCriterion("TESTITEM not in", values, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemBetween(String value1, String value2) {
            addCriterion("TESTITEM between", value1, value2, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestitemNotBetween(String value1, String value2) {
            addCriterion("TESTITEM not between", value1, value2, "testitem");
            return (Criteria) this;
        }

        public Criteria andTestnumberIsNull() {
            addCriterion("TESTNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andTestnumberIsNotNull() {
            addCriterion("TESTNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andTestnumberEqualTo(String value) {
            addCriterion("TESTNUMBER =", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberNotEqualTo(String value) {
            addCriterion("TESTNUMBER <>", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberGreaterThan(String value) {
            addCriterion("TESTNUMBER >", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberGreaterThanOrEqualTo(String value) {
            addCriterion("TESTNUMBER >=", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberLessThan(String value) {
            addCriterion("TESTNUMBER <", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberLessThanOrEqualTo(String value) {
            addCriterion("TESTNUMBER <=", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberLike(String value) {
            addCriterion("TESTNUMBER like", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberNotLike(String value) {
            addCriterion("TESTNUMBER not like", value, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberIn(List<String> values) {
            addCriterion("TESTNUMBER in", values, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberNotIn(List<String> values) {
            addCriterion("TESTNUMBER not in", values, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberBetween(String value1, String value2) {
            addCriterion("TESTNUMBER between", value1, value2, "testnumber");
            return (Criteria) this;
        }

        public Criteria andTestnumberNotBetween(String value1, String value2) {
            addCriterion("TESTNUMBER not between", value1, value2, "testnumber");
            return (Criteria) this;
        }

        public Criteria andSampleallocationIsNull() {
            addCriterion("SAMPLEALLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andSampleallocationIsNotNull() {
            addCriterion("SAMPLEALLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andSampleallocationEqualTo(String value) {
            addCriterion("SAMPLEALLOCATION =", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationNotEqualTo(String value) {
            addCriterion("SAMPLEALLOCATION <>", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationGreaterThan(String value) {
            addCriterion("SAMPLEALLOCATION >", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLEALLOCATION >=", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationLessThan(String value) {
            addCriterion("SAMPLEALLOCATION <", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationLessThanOrEqualTo(String value) {
            addCriterion("SAMPLEALLOCATION <=", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationLike(String value) {
            addCriterion("SAMPLEALLOCATION like", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationNotLike(String value) {
            addCriterion("SAMPLEALLOCATION not like", value, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationIn(List<String> values) {
            addCriterion("SAMPLEALLOCATION in", values, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationNotIn(List<String> values) {
            addCriterion("SAMPLEALLOCATION not in", values, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationBetween(String value1, String value2) {
            addCriterion("SAMPLEALLOCATION between", value1, value2, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationNotBetween(String value1, String value2) {
            addCriterion("SAMPLEALLOCATION not between", value1, value2, "sampleallocation");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceIsNull() {
            addCriterion("SAMPLEALLOCATIONSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceIsNotNull() {
            addCriterion("SAMPLEALLOCATIONSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceEqualTo(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE =", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceNotEqualTo(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE <>", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceGreaterThan(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE >", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE >=", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceLessThan(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE <", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceLessThanOrEqualTo(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE <=", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceLike(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE like", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceNotLike(String value) {
            addCriterion("SAMPLEALLOCATIONSOURCE not like", value, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceIn(List<String> values) {
            addCriterion("SAMPLEALLOCATIONSOURCE in", values, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceNotIn(List<String> values) {
            addCriterion("SAMPLEALLOCATIONSOURCE not in", values, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceBetween(String value1, String value2) {
            addCriterion("SAMPLEALLOCATIONSOURCE between", value1, value2, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSampleallocationsourceNotBetween(String value1, String value2) {
            addCriterion("SAMPLEALLOCATIONSOURCE not between", value1, value2, "sampleallocationsource");
            return (Criteria) this;
        }

        public Criteria andSamplequantityIsNull() {
            addCriterion("SAMPLEQUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andSamplequantityIsNotNull() {
            addCriterion("SAMPLEQUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andSamplequantityEqualTo(BigDecimal value) {
            addCriterion("SAMPLEQUANTITY =", value, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityNotEqualTo(BigDecimal value) {
            addCriterion("SAMPLEQUANTITY <>", value, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityGreaterThan(BigDecimal value) {
            addCriterion("SAMPLEQUANTITY >", value, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLEQUANTITY >=", value, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityLessThan(BigDecimal value) {
            addCriterion("SAMPLEQUANTITY <", value, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SAMPLEQUANTITY <=", value, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityIn(List<BigDecimal> values) {
            addCriterion("SAMPLEQUANTITY in", values, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityNotIn(List<BigDecimal> values) {
            addCriterion("SAMPLEQUANTITY not in", values, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLEQUANTITY between", value1, value2, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andSamplequantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SAMPLEQUANTITY not between", value1, value2, "samplequantity");
            return (Criteria) this;
        }

        public Criteria andStandardclauseIsNull() {
            addCriterion("STANDARDCLAUSE is null");
            return (Criteria) this;
        }

        public Criteria andStandardclauseIsNotNull() {
            addCriterion("STANDARDCLAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardclauseEqualTo(String value) {
            addCriterion("STANDARDCLAUSE =", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseNotEqualTo(String value) {
            addCriterion("STANDARDCLAUSE <>", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseGreaterThan(String value) {
            addCriterion("STANDARDCLAUSE >", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARDCLAUSE >=", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseLessThan(String value) {
            addCriterion("STANDARDCLAUSE <", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseLessThanOrEqualTo(String value) {
            addCriterion("STANDARDCLAUSE <=", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseLike(String value) {
            addCriterion("STANDARDCLAUSE like", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseNotLike(String value) {
            addCriterion("STANDARDCLAUSE not like", value, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseIn(List<String> values) {
            addCriterion("STANDARDCLAUSE in", values, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseNotIn(List<String> values) {
            addCriterion("STANDARDCLAUSE not in", values, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseBetween(String value1, String value2) {
            addCriterion("STANDARDCLAUSE between", value1, value2, "standardclause");
            return (Criteria) this;
        }

        public Criteria andStandardclauseNotBetween(String value1, String value2) {
            addCriterion("STANDARDCLAUSE not between", value1, value2, "standardclause");
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

        public Criteria andDef6IsNull() {
            addCriterion("DEF6 is null");
            return (Criteria) this;
        }

        public Criteria andDef6IsNotNull() {
            addCriterion("DEF6 is not null");
            return (Criteria) this;
        }

        public Criteria andDef6EqualTo(String value) {
            addCriterion("DEF6 =", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotEqualTo(String value) {
            addCriterion("DEF6 <>", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThan(String value) {
            addCriterion("DEF6 >", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6GreaterThanOrEqualTo(String value) {
            addCriterion("DEF6 >=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThan(String value) {
            addCriterion("DEF6 <", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6LessThanOrEqualTo(String value) {
            addCriterion("DEF6 <=", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Like(String value) {
            addCriterion("DEF6 like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotLike(String value) {
            addCriterion("DEF6 not like", value, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6In(List<String> values) {
            addCriterion("DEF6 in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotIn(List<String> values) {
            addCriterion("DEF6 not in", values, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6Between(String value1, String value2) {
            addCriterion("DEF6 between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef6NotBetween(String value1, String value2) {
            addCriterion("DEF6 not between", value1, value2, "def6");
            return (Criteria) this;
        }

        public Criteria andDef7IsNull() {
            addCriterion("DEF7 is null");
            return (Criteria) this;
        }

        public Criteria andDef7IsNotNull() {
            addCriterion("DEF7 is not null");
            return (Criteria) this;
        }

        public Criteria andDef7EqualTo(String value) {
            addCriterion("DEF7 =", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotEqualTo(String value) {
            addCriterion("DEF7 <>", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThan(String value) {
            addCriterion("DEF7 >", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7GreaterThanOrEqualTo(String value) {
            addCriterion("DEF7 >=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThan(String value) {
            addCriterion("DEF7 <", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7LessThanOrEqualTo(String value) {
            addCriterion("DEF7 <=", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Like(String value) {
            addCriterion("DEF7 like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotLike(String value) {
            addCriterion("DEF7 not like", value, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7In(List<String> values) {
            addCriterion("DEF7 in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotIn(List<String> values) {
            addCriterion("DEF7 not in", values, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7Between(String value1, String value2) {
            addCriterion("DEF7 between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef7NotBetween(String value1, String value2) {
            addCriterion("DEF7 not between", value1, value2, "def7");
            return (Criteria) this;
        }

        public Criteria andDef8IsNull() {
            addCriterion("DEF8 is null");
            return (Criteria) this;
        }

        public Criteria andDef8IsNotNull() {
            addCriterion("DEF8 is not null");
            return (Criteria) this;
        }

        public Criteria andDef8EqualTo(String value) {
            addCriterion("DEF8 =", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotEqualTo(String value) {
            addCriterion("DEF8 <>", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThan(String value) {
            addCriterion("DEF8 >", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8GreaterThanOrEqualTo(String value) {
            addCriterion("DEF8 >=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThan(String value) {
            addCriterion("DEF8 <", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8LessThanOrEqualTo(String value) {
            addCriterion("DEF8 <=", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Like(String value) {
            addCriterion("DEF8 like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotLike(String value) {
            addCriterion("DEF8 not like", value, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8In(List<String> values) {
            addCriterion("DEF8 in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotIn(List<String> values) {
            addCriterion("DEF8 not in", values, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8Between(String value1, String value2) {
            addCriterion("DEF8 between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef8NotBetween(String value1, String value2) {
            addCriterion("DEF8 not between", value1, value2, "def8");
            return (Criteria) this;
        }

        public Criteria andDef9IsNull() {
            addCriterion("DEF9 is null");
            return (Criteria) this;
        }

        public Criteria andDef9IsNotNull() {
            addCriterion("DEF9 is not null");
            return (Criteria) this;
        }

        public Criteria andDef9EqualTo(String value) {
            addCriterion("DEF9 =", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotEqualTo(String value) {
            addCriterion("DEF9 <>", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThan(String value) {
            addCriterion("DEF9 >", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9GreaterThanOrEqualTo(String value) {
            addCriterion("DEF9 >=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThan(String value) {
            addCriterion("DEF9 <", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9LessThanOrEqualTo(String value) {
            addCriterion("DEF9 <=", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Like(String value) {
            addCriterion("DEF9 like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotLike(String value) {
            addCriterion("DEF9 not like", value, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9In(List<String> values) {
            addCriterion("DEF9 in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotIn(List<String> values) {
            addCriterion("DEF9 not in", values, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9Between(String value1, String value2) {
            addCriterion("DEF9 between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef9NotBetween(String value1, String value2) {
            addCriterion("DEF9 not between", value1, value2, "def9");
            return (Criteria) this;
        }

        public Criteria andDef10IsNull() {
            addCriterion("DEF10 is null");
            return (Criteria) this;
        }

        public Criteria andDef10IsNotNull() {
            addCriterion("DEF10 is not null");
            return (Criteria) this;
        }

        public Criteria andDef10EqualTo(String value) {
            addCriterion("DEF10 =", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotEqualTo(String value) {
            addCriterion("DEF10 <>", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThan(String value) {
            addCriterion("DEF10 >", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10GreaterThanOrEqualTo(String value) {
            addCriterion("DEF10 >=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThan(String value) {
            addCriterion("DEF10 <", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10LessThanOrEqualTo(String value) {
            addCriterion("DEF10 <=", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Like(String value) {
            addCriterion("DEF10 like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotLike(String value) {
            addCriterion("DEF10 not like", value, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10In(List<String> values) {
            addCriterion("DEF10 in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotIn(List<String> values) {
            addCriterion("DEF10 not in", values, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10Between(String value1, String value2) {
            addCriterion("DEF10 between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef10NotBetween(String value1, String value2) {
            addCriterion("DEF10 not between", value1, value2, "def10");
            return (Criteria) this;
        }

        public Criteria andDef11IsNull() {
            addCriterion("DEF11 is null");
            return (Criteria) this;
        }

        public Criteria andDef11IsNotNull() {
            addCriterion("DEF11 is not null");
            return (Criteria) this;
        }

        public Criteria andDef11EqualTo(String value) {
            addCriterion("DEF11 =", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotEqualTo(String value) {
            addCriterion("DEF11 <>", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11GreaterThan(String value) {
            addCriterion("DEF11 >", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11GreaterThanOrEqualTo(String value) {
            addCriterion("DEF11 >=", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11LessThan(String value) {
            addCriterion("DEF11 <", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11LessThanOrEqualTo(String value) {
            addCriterion("DEF11 <=", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11Like(String value) {
            addCriterion("DEF11 like", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotLike(String value) {
            addCriterion("DEF11 not like", value, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11In(List<String> values) {
            addCriterion("DEF11 in", values, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotIn(List<String> values) {
            addCriterion("DEF11 not in", values, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11Between(String value1, String value2) {
            addCriterion("DEF11 between", value1, value2, "def11");
            return (Criteria) this;
        }

        public Criteria andDef11NotBetween(String value1, String value2) {
            addCriterion("DEF11 not between", value1, value2, "def11");
            return (Criteria) this;
        }

        public Criteria andDef12IsNull() {
            addCriterion("DEF12 is null");
            return (Criteria) this;
        }

        public Criteria andDef12IsNotNull() {
            addCriterion("DEF12 is not null");
            return (Criteria) this;
        }

        public Criteria andDef12EqualTo(String value) {
            addCriterion("DEF12 =", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotEqualTo(String value) {
            addCriterion("DEF12 <>", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12GreaterThan(String value) {
            addCriterion("DEF12 >", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12GreaterThanOrEqualTo(String value) {
            addCriterion("DEF12 >=", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12LessThan(String value) {
            addCriterion("DEF12 <", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12LessThanOrEqualTo(String value) {
            addCriterion("DEF12 <=", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12Like(String value) {
            addCriterion("DEF12 like", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotLike(String value) {
            addCriterion("DEF12 not like", value, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12In(List<String> values) {
            addCriterion("DEF12 in", values, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotIn(List<String> values) {
            addCriterion("DEF12 not in", values, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12Between(String value1, String value2) {
            addCriterion("DEF12 between", value1, value2, "def12");
            return (Criteria) this;
        }

        public Criteria andDef12NotBetween(String value1, String value2) {
            addCriterion("DEF12 not between", value1, value2, "def12");
            return (Criteria) this;
        }

        public Criteria andDef13IsNull() {
            addCriterion("DEF13 is null");
            return (Criteria) this;
        }

        public Criteria andDef13IsNotNull() {
            addCriterion("DEF13 is not null");
            return (Criteria) this;
        }

        public Criteria andDef13EqualTo(String value) {
            addCriterion("DEF13 =", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotEqualTo(String value) {
            addCriterion("DEF13 <>", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThan(String value) {
            addCriterion("DEF13 >", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13GreaterThanOrEqualTo(String value) {
            addCriterion("DEF13 >=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThan(String value) {
            addCriterion("DEF13 <", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13LessThanOrEqualTo(String value) {
            addCriterion("DEF13 <=", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Like(String value) {
            addCriterion("DEF13 like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotLike(String value) {
            addCriterion("DEF13 not like", value, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13In(List<String> values) {
            addCriterion("DEF13 in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotIn(List<String> values) {
            addCriterion("DEF13 not in", values, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13Between(String value1, String value2) {
            addCriterion("DEF13 between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef13NotBetween(String value1, String value2) {
            addCriterion("DEF13 not between", value1, value2, "def13");
            return (Criteria) this;
        }

        public Criteria andDef14IsNull() {
            addCriterion("DEF14 is null");
            return (Criteria) this;
        }

        public Criteria andDef14IsNotNull() {
            addCriterion("DEF14 is not null");
            return (Criteria) this;
        }

        public Criteria andDef14EqualTo(String value) {
            addCriterion("DEF14 =", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotEqualTo(String value) {
            addCriterion("DEF14 <>", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThan(String value) {
            addCriterion("DEF14 >", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14GreaterThanOrEqualTo(String value) {
            addCriterion("DEF14 >=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThan(String value) {
            addCriterion("DEF14 <", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14LessThanOrEqualTo(String value) {
            addCriterion("DEF14 <=", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Like(String value) {
            addCriterion("DEF14 like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotLike(String value) {
            addCriterion("DEF14 not like", value, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14In(List<String> values) {
            addCriterion("DEF14 in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotIn(List<String> values) {
            addCriterion("DEF14 not in", values, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14Between(String value1, String value2) {
            addCriterion("DEF14 between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef14NotBetween(String value1, String value2) {
            addCriterion("DEF14 not between", value1, value2, "def14");
            return (Criteria) this;
        }

        public Criteria andDef15IsNull() {
            addCriterion("DEF15 is null");
            return (Criteria) this;
        }

        public Criteria andDef15IsNotNull() {
            addCriterion("DEF15 is not null");
            return (Criteria) this;
        }

        public Criteria andDef15EqualTo(String value) {
            addCriterion("DEF15 =", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotEqualTo(String value) {
            addCriterion("DEF15 <>", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThan(String value) {
            addCriterion("DEF15 >", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15GreaterThanOrEqualTo(String value) {
            addCriterion("DEF15 >=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThan(String value) {
            addCriterion("DEF15 <", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15LessThanOrEqualTo(String value) {
            addCriterion("DEF15 <=", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Like(String value) {
            addCriterion("DEF15 like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotLike(String value) {
            addCriterion("DEF15 not like", value, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15In(List<String> values) {
            addCriterion("DEF15 in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotIn(List<String> values) {
            addCriterion("DEF15 not in", values, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15Between(String value1, String value2) {
            addCriterion("DEF15 between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef15NotBetween(String value1, String value2) {
            addCriterion("DEF15 not between", value1, value2, "def15");
            return (Criteria) this;
        }

        public Criteria andDef16IsNull() {
            addCriterion("DEF16 is null");
            return (Criteria) this;
        }

        public Criteria andDef16IsNotNull() {
            addCriterion("DEF16 is not null");
            return (Criteria) this;
        }

        public Criteria andDef16EqualTo(String value) {
            addCriterion("DEF16 =", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotEqualTo(String value) {
            addCriterion("DEF16 <>", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThan(String value) {
            addCriterion("DEF16 >", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16GreaterThanOrEqualTo(String value) {
            addCriterion("DEF16 >=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThan(String value) {
            addCriterion("DEF16 <", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16LessThanOrEqualTo(String value) {
            addCriterion("DEF16 <=", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Like(String value) {
            addCriterion("DEF16 like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotLike(String value) {
            addCriterion("DEF16 not like", value, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16In(List<String> values) {
            addCriterion("DEF16 in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotIn(List<String> values) {
            addCriterion("DEF16 not in", values, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16Between(String value1, String value2) {
            addCriterion("DEF16 between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef16NotBetween(String value1, String value2) {
            addCriterion("DEF16 not between", value1, value2, "def16");
            return (Criteria) this;
        }

        public Criteria andDef17IsNull() {
            addCriterion("DEF17 is null");
            return (Criteria) this;
        }

        public Criteria andDef17IsNotNull() {
            addCriterion("DEF17 is not null");
            return (Criteria) this;
        }

        public Criteria andDef17EqualTo(String value) {
            addCriterion("DEF17 =", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotEqualTo(String value) {
            addCriterion("DEF17 <>", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThan(String value) {
            addCriterion("DEF17 >", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17GreaterThanOrEqualTo(String value) {
            addCriterion("DEF17 >=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThan(String value) {
            addCriterion("DEF17 <", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17LessThanOrEqualTo(String value) {
            addCriterion("DEF17 <=", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Like(String value) {
            addCriterion("DEF17 like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotLike(String value) {
            addCriterion("DEF17 not like", value, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17In(List<String> values) {
            addCriterion("DEF17 in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotIn(List<String> values) {
            addCriterion("DEF17 not in", values, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17Between(String value1, String value2) {
            addCriterion("DEF17 between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef17NotBetween(String value1, String value2) {
            addCriterion("DEF17 not between", value1, value2, "def17");
            return (Criteria) this;
        }

        public Criteria andDef18IsNull() {
            addCriterion("DEF18 is null");
            return (Criteria) this;
        }

        public Criteria andDef18IsNotNull() {
            addCriterion("DEF18 is not null");
            return (Criteria) this;
        }

        public Criteria andDef18EqualTo(String value) {
            addCriterion("DEF18 =", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotEqualTo(String value) {
            addCriterion("DEF18 <>", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThan(String value) {
            addCriterion("DEF18 >", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18GreaterThanOrEqualTo(String value) {
            addCriterion("DEF18 >=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThan(String value) {
            addCriterion("DEF18 <", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18LessThanOrEqualTo(String value) {
            addCriterion("DEF18 <=", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Like(String value) {
            addCriterion("DEF18 like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotLike(String value) {
            addCriterion("DEF18 not like", value, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18In(List<String> values) {
            addCriterion("DEF18 in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotIn(List<String> values) {
            addCriterion("DEF18 not in", values, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18Between(String value1, String value2) {
            addCriterion("DEF18 between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef18NotBetween(String value1, String value2) {
            addCriterion("DEF18 not between", value1, value2, "def18");
            return (Criteria) this;
        }

        public Criteria andDef19IsNull() {
            addCriterion("DEF19 is null");
            return (Criteria) this;
        }

        public Criteria andDef19IsNotNull() {
            addCriterion("DEF19 is not null");
            return (Criteria) this;
        }

        public Criteria andDef19EqualTo(String value) {
            addCriterion("DEF19 =", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotEqualTo(String value) {
            addCriterion("DEF19 <>", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19GreaterThan(String value) {
            addCriterion("DEF19 >", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19GreaterThanOrEqualTo(String value) {
            addCriterion("DEF19 >=", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19LessThan(String value) {
            addCriterion("DEF19 <", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19LessThanOrEqualTo(String value) {
            addCriterion("DEF19 <=", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19Like(String value) {
            addCriterion("DEF19 like", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotLike(String value) {
            addCriterion("DEF19 not like", value, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19In(List<String> values) {
            addCriterion("DEF19 in", values, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotIn(List<String> values) {
            addCriterion("DEF19 not in", values, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19Between(String value1, String value2) {
            addCriterion("DEF19 between", value1, value2, "def19");
            return (Criteria) this;
        }

        public Criteria andDef19NotBetween(String value1, String value2) {
            addCriterion("DEF19 not between", value1, value2, "def19");
            return (Criteria) this;
        }

        public Criteria andDef20IsNull() {
            addCriterion("DEF20 is null");
            return (Criteria) this;
        }

        public Criteria andDef20IsNotNull() {
            addCriterion("DEF20 is not null");
            return (Criteria) this;
        }

        public Criteria andDef20EqualTo(String value) {
            addCriterion("DEF20 =", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotEqualTo(String value) {
            addCriterion("DEF20 <>", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThan(String value) {
            addCriterion("DEF20 >", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20GreaterThanOrEqualTo(String value) {
            addCriterion("DEF20 >=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThan(String value) {
            addCriterion("DEF20 <", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20LessThanOrEqualTo(String value) {
            addCriterion("DEF20 <=", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Like(String value) {
            addCriterion("DEF20 like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotLike(String value) {
            addCriterion("DEF20 not like", value, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20In(List<String> values) {
            addCriterion("DEF20 in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotIn(List<String> values) {
            addCriterion("DEF20 not in", values, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20Between(String value1, String value2) {
            addCriterion("DEF20 between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andDef20NotBetween(String value1, String value2) {
            addCriterion("DEF20 not between", value1, value2, "def20");
            return (Criteria) this;
        }

        public Criteria andPkTaskHIsNull() {
            addCriterion("PK_TASK_H is null");
            return (Criteria) this;
        }

        public Criteria andPkTaskHIsNotNull() {
            addCriterion("PK_TASK_H is not null");
            return (Criteria) this;
        }

        public Criteria andPkTaskHEqualTo(String value) {
            addCriterion("PK_TASK_H =", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHNotEqualTo(String value) {
            addCriterion("PK_TASK_H <>", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHGreaterThan(String value) {
            addCriterion("PK_TASK_H >", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TASK_H >=", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHLessThan(String value) {
            addCriterion("PK_TASK_H <", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHLessThanOrEqualTo(String value) {
            addCriterion("PK_TASK_H <=", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHLike(String value) {
            addCriterion("PK_TASK_H like", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHNotLike(String value) {
            addCriterion("PK_TASK_H not like", value, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHIn(List<String> values) {
            addCriterion("PK_TASK_H in", values, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHNotIn(List<String> values) {
            addCriterion("PK_TASK_H not in", values, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHBetween(String value1, String value2) {
            addCriterion("PK_TASK_H between", value1, value2, "pkTaskH");
            return (Criteria) this;
        }

        public Criteria andPkTaskHNotBetween(String value1, String value2) {
            addCriterion("PK_TASK_H not between", value1, value2, "pkTaskH");
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