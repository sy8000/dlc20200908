package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.List;

public class DataloaderAuditLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataloaderAuditLogExample() {
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

        public Criteria andPkAuditLogIsNull() {
            addCriterion("PK_AUDIT_LOG is null");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogIsNotNull() {
            addCriterion("PK_AUDIT_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogEqualTo(String value) {
            addCriterion("PK_AUDIT_LOG =", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogNotEqualTo(String value) {
            addCriterion("PK_AUDIT_LOG <>", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogGreaterThan(String value) {
            addCriterion("PK_AUDIT_LOG >", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogGreaterThanOrEqualTo(String value) {
            addCriterion("PK_AUDIT_LOG >=", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogLessThan(String value) {
            addCriterion("PK_AUDIT_LOG <", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogLessThanOrEqualTo(String value) {
            addCriterion("PK_AUDIT_LOG <=", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogLike(String value) {
            addCriterion("PK_AUDIT_LOG like", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogNotLike(String value) {
            addCriterion("PK_AUDIT_LOG not like", value, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogIn(List<String> values) {
            addCriterion("PK_AUDIT_LOG in", values, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogNotIn(List<String> values) {
            addCriterion("PK_AUDIT_LOG not in", values, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogBetween(String value1, String value2) {
            addCriterion("PK_AUDIT_LOG between", value1, value2, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andPkAuditLogNotBetween(String value1, String value2) {
            addCriterion("PK_AUDIT_LOG not between", value1, value2, "pkAuditLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogIsNull() {
            addCriterion("AUDIT_ACTION_LOG is null");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogIsNotNull() {
            addCriterion("AUDIT_ACTION_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogEqualTo(String value) {
            addCriterion("AUDIT_ACTION_LOG =", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogNotEqualTo(String value) {
            addCriterion("AUDIT_ACTION_LOG <>", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogGreaterThan(String value) {
            addCriterion("AUDIT_ACTION_LOG >", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_ACTION_LOG >=", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogLessThan(String value) {
            addCriterion("AUDIT_ACTION_LOG <", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_ACTION_LOG <=", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogLike(String value) {
            addCriterion("AUDIT_ACTION_LOG like", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogNotLike(String value) {
            addCriterion("AUDIT_ACTION_LOG not like", value, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogIn(List<String> values) {
            addCriterion("AUDIT_ACTION_LOG in", values, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogNotIn(List<String> values) {
            addCriterion("AUDIT_ACTION_LOG not in", values, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogBetween(String value1, String value2) {
            addCriterion("AUDIT_ACTION_LOG between", value1, value2, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionLogNotBetween(String value1, String value2) {
            addCriterion("AUDIT_ACTION_LOG not between", value1, value2, "auditActionLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogIsNull() {
            addCriterion("AUDIT_PERSON_LOG is null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogIsNotNull() {
            addCriterion("AUDIT_PERSON_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogEqualTo(String value) {
            addCriterion("AUDIT_PERSON_LOG =", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogNotEqualTo(String value) {
            addCriterion("AUDIT_PERSON_LOG <>", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogGreaterThan(String value) {
            addCriterion("AUDIT_PERSON_LOG >", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_PERSON_LOG >=", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogLessThan(String value) {
            addCriterion("AUDIT_PERSON_LOG <", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_PERSON_LOG <=", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogLike(String value) {
            addCriterion("AUDIT_PERSON_LOG like", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogNotLike(String value) {
            addCriterion("AUDIT_PERSON_LOG not like", value, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogIn(List<String> values) {
            addCriterion("AUDIT_PERSON_LOG in", values, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogNotIn(List<String> values) {
            addCriterion("AUDIT_PERSON_LOG not in", values, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogBetween(String value1, String value2) {
            addCriterion("AUDIT_PERSON_LOG between", value1, value2, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditPersonLogNotBetween(String value1, String value2) {
            addCriterion("AUDIT_PERSON_LOG not between", value1, value2, "auditPersonLog");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateIsNull() {
            addCriterion("AUDIT_ACTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateIsNotNull() {
            addCriterion("AUDIT_ACTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateEqualTo(String value) {
            addCriterion("AUDIT_ACTION_DATE =", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateNotEqualTo(String value) {
            addCriterion("AUDIT_ACTION_DATE <>", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateGreaterThan(String value) {
            addCriterion("AUDIT_ACTION_DATE >", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_ACTION_DATE >=", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateLessThan(String value) {
            addCriterion("AUDIT_ACTION_DATE <", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_ACTION_DATE <=", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateLike(String value) {
            addCriterion("AUDIT_ACTION_DATE like", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateNotLike(String value) {
            addCriterion("AUDIT_ACTION_DATE not like", value, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateIn(List<String> values) {
            addCriterion("AUDIT_ACTION_DATE in", values, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateNotIn(List<String> values) {
            addCriterion("AUDIT_ACTION_DATE not in", values, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateBetween(String value1, String value2) {
            addCriterion("AUDIT_ACTION_DATE between", value1, value2, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditActionDateNotBetween(String value1, String value2) {
            addCriterion("AUDIT_ACTION_DATE not between", value1, value2, "auditActionDate");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogIsNull() {
            addCriterion("AUDIT_MODULE_LOG is null");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogIsNotNull() {
            addCriterion("AUDIT_MODULE_LOG is not null");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogEqualTo(String value) {
            addCriterion("AUDIT_MODULE_LOG =", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogNotEqualTo(String value) {
            addCriterion("AUDIT_MODULE_LOG <>", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogGreaterThan(String value) {
            addCriterion("AUDIT_MODULE_LOG >", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_MODULE_LOG >=", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogLessThan(String value) {
            addCriterion("AUDIT_MODULE_LOG <", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_MODULE_LOG <=", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogLike(String value) {
            addCriterion("AUDIT_MODULE_LOG like", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogNotLike(String value) {
            addCriterion("AUDIT_MODULE_LOG not like", value, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogIn(List<String> values) {
            addCriterion("AUDIT_MODULE_LOG in", values, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogNotIn(List<String> values) {
            addCriterion("AUDIT_MODULE_LOG not in", values, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogBetween(String value1, String value2) {
            addCriterion("AUDIT_MODULE_LOG between", value1, value2, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleLogNotBetween(String value1, String value2) {
            addCriterion("AUDIT_MODULE_LOG not between", value1, value2, "auditModuleLog");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoIsNull() {
            addCriterion("AUDIT_MODULE_BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoIsNotNull() {
            addCriterion("AUDIT_MODULE_BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoEqualTo(String value) {
            addCriterion("AUDIT_MODULE_BILLNO =", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoNotEqualTo(String value) {
            addCriterion("AUDIT_MODULE_BILLNO <>", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoGreaterThan(String value) {
            addCriterion("AUDIT_MODULE_BILLNO >", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_MODULE_BILLNO >=", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoLessThan(String value) {
            addCriterion("AUDIT_MODULE_BILLNO <", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_MODULE_BILLNO <=", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoLike(String value) {
            addCriterion("AUDIT_MODULE_BILLNO like", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoNotLike(String value) {
            addCriterion("AUDIT_MODULE_BILLNO not like", value, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoIn(List<String> values) {
            addCriterion("AUDIT_MODULE_BILLNO in", values, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoNotIn(List<String> values) {
            addCriterion("AUDIT_MODULE_BILLNO not in", values, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoBetween(String value1, String value2) {
            addCriterion("AUDIT_MODULE_BILLNO between", value1, value2, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andAuditModuleBillnoNotBetween(String value1, String value2) {
            addCriterion("AUDIT_MODULE_BILLNO not between", value1, value2, "auditModuleBillno");
            return (Criteria) this;
        }

        public Criteria andVdef1IsNull() {
            addCriterion("VDEF1 is null");
            return (Criteria) this;
        }

        public Criteria andVdef1IsNotNull() {
            addCriterion("VDEF1 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef1EqualTo(String value) {
            addCriterion("VDEF1 =", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotEqualTo(String value) {
            addCriterion("VDEF1 <>", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1GreaterThan(String value) {
            addCriterion("VDEF1 >", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF1 >=", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1LessThan(String value) {
            addCriterion("VDEF1 <", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1LessThanOrEqualTo(String value) {
            addCriterion("VDEF1 <=", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1Like(String value) {
            addCriterion("VDEF1 like", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotLike(String value) {
            addCriterion("VDEF1 not like", value, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1In(List<String> values) {
            addCriterion("VDEF1 in", values, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotIn(List<String> values) {
            addCriterion("VDEF1 not in", values, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1Between(String value1, String value2) {
            addCriterion("VDEF1 between", value1, value2, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef1NotBetween(String value1, String value2) {
            addCriterion("VDEF1 not between", value1, value2, "vdef1");
            return (Criteria) this;
        }

        public Criteria andVdef2IsNull() {
            addCriterion("VDEF2 is null");
            return (Criteria) this;
        }

        public Criteria andVdef2IsNotNull() {
            addCriterion("VDEF2 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef2EqualTo(String value) {
            addCriterion("VDEF2 =", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotEqualTo(String value) {
            addCriterion("VDEF2 <>", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2GreaterThan(String value) {
            addCriterion("VDEF2 >", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF2 >=", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2LessThan(String value) {
            addCriterion("VDEF2 <", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2LessThanOrEqualTo(String value) {
            addCriterion("VDEF2 <=", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2Like(String value) {
            addCriterion("VDEF2 like", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotLike(String value) {
            addCriterion("VDEF2 not like", value, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2In(List<String> values) {
            addCriterion("VDEF2 in", values, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotIn(List<String> values) {
            addCriterion("VDEF2 not in", values, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2Between(String value1, String value2) {
            addCriterion("VDEF2 between", value1, value2, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef2NotBetween(String value1, String value2) {
            addCriterion("VDEF2 not between", value1, value2, "vdef2");
            return (Criteria) this;
        }

        public Criteria andVdef3IsNull() {
            addCriterion("VDEF3 is null");
            return (Criteria) this;
        }

        public Criteria andVdef3IsNotNull() {
            addCriterion("VDEF3 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef3EqualTo(String value) {
            addCriterion("VDEF3 =", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotEqualTo(String value) {
            addCriterion("VDEF3 <>", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3GreaterThan(String value) {
            addCriterion("VDEF3 >", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF3 >=", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3LessThan(String value) {
            addCriterion("VDEF3 <", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3LessThanOrEqualTo(String value) {
            addCriterion("VDEF3 <=", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3Like(String value) {
            addCriterion("VDEF3 like", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotLike(String value) {
            addCriterion("VDEF3 not like", value, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3In(List<String> values) {
            addCriterion("VDEF3 in", values, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotIn(List<String> values) {
            addCriterion("VDEF3 not in", values, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3Between(String value1, String value2) {
            addCriterion("VDEF3 between", value1, value2, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef3NotBetween(String value1, String value2) {
            addCriterion("VDEF3 not between", value1, value2, "vdef3");
            return (Criteria) this;
        }

        public Criteria andVdef4IsNull() {
            addCriterion("VDEF4 is null");
            return (Criteria) this;
        }

        public Criteria andVdef4IsNotNull() {
            addCriterion("VDEF4 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef4EqualTo(String value) {
            addCriterion("VDEF4 =", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotEqualTo(String value) {
            addCriterion("VDEF4 <>", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4GreaterThan(String value) {
            addCriterion("VDEF4 >", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF4 >=", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4LessThan(String value) {
            addCriterion("VDEF4 <", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4LessThanOrEqualTo(String value) {
            addCriterion("VDEF4 <=", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4Like(String value) {
            addCriterion("VDEF4 like", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotLike(String value) {
            addCriterion("VDEF4 not like", value, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4In(List<String> values) {
            addCriterion("VDEF4 in", values, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotIn(List<String> values) {
            addCriterion("VDEF4 not in", values, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4Between(String value1, String value2) {
            addCriterion("VDEF4 between", value1, value2, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef4NotBetween(String value1, String value2) {
            addCriterion("VDEF4 not between", value1, value2, "vdef4");
            return (Criteria) this;
        }

        public Criteria andVdef5IsNull() {
            addCriterion("VDEF5 is null");
            return (Criteria) this;
        }

        public Criteria andVdef5IsNotNull() {
            addCriterion("VDEF5 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef5EqualTo(String value) {
            addCriterion("VDEF5 =", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotEqualTo(String value) {
            addCriterion("VDEF5 <>", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5GreaterThan(String value) {
            addCriterion("VDEF5 >", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF5 >=", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5LessThan(String value) {
            addCriterion("VDEF5 <", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5LessThanOrEqualTo(String value) {
            addCriterion("VDEF5 <=", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5Like(String value) {
            addCriterion("VDEF5 like", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotLike(String value) {
            addCriterion("VDEF5 not like", value, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5In(List<String> values) {
            addCriterion("VDEF5 in", values, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotIn(List<String> values) {
            addCriterion("VDEF5 not in", values, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5Between(String value1, String value2) {
            addCriterion("VDEF5 between", value1, value2, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef5NotBetween(String value1, String value2) {
            addCriterion("VDEF5 not between", value1, value2, "vdef5");
            return (Criteria) this;
        }

        public Criteria andVdef6IsNull() {
            addCriterion("VDEF6 is null");
            return (Criteria) this;
        }

        public Criteria andVdef6IsNotNull() {
            addCriterion("VDEF6 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef6EqualTo(String value) {
            addCriterion("VDEF6 =", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotEqualTo(String value) {
            addCriterion("VDEF6 <>", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6GreaterThan(String value) {
            addCriterion("VDEF6 >", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF6 >=", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6LessThan(String value) {
            addCriterion("VDEF6 <", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6LessThanOrEqualTo(String value) {
            addCriterion("VDEF6 <=", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6Like(String value) {
            addCriterion("VDEF6 like", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotLike(String value) {
            addCriterion("VDEF6 not like", value, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6In(List<String> values) {
            addCriterion("VDEF6 in", values, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotIn(List<String> values) {
            addCriterion("VDEF6 not in", values, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6Between(String value1, String value2) {
            addCriterion("VDEF6 between", value1, value2, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef6NotBetween(String value1, String value2) {
            addCriterion("VDEF6 not between", value1, value2, "vdef6");
            return (Criteria) this;
        }

        public Criteria andVdef7IsNull() {
            addCriterion("VDEF7 is null");
            return (Criteria) this;
        }

        public Criteria andVdef7IsNotNull() {
            addCriterion("VDEF7 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef7EqualTo(String value) {
            addCriterion("VDEF7 =", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotEqualTo(String value) {
            addCriterion("VDEF7 <>", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7GreaterThan(String value) {
            addCriterion("VDEF7 >", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF7 >=", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7LessThan(String value) {
            addCriterion("VDEF7 <", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7LessThanOrEqualTo(String value) {
            addCriterion("VDEF7 <=", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7Like(String value) {
            addCriterion("VDEF7 like", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotLike(String value) {
            addCriterion("VDEF7 not like", value, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7In(List<String> values) {
            addCriterion("VDEF7 in", values, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotIn(List<String> values) {
            addCriterion("VDEF7 not in", values, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7Between(String value1, String value2) {
            addCriterion("VDEF7 between", value1, value2, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef7NotBetween(String value1, String value2) {
            addCriterion("VDEF7 not between", value1, value2, "vdef7");
            return (Criteria) this;
        }

        public Criteria andVdef8IsNull() {
            addCriterion("VDEF8 is null");
            return (Criteria) this;
        }

        public Criteria andVdef8IsNotNull() {
            addCriterion("VDEF8 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef8EqualTo(String value) {
            addCriterion("VDEF8 =", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotEqualTo(String value) {
            addCriterion("VDEF8 <>", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8GreaterThan(String value) {
            addCriterion("VDEF8 >", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF8 >=", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8LessThan(String value) {
            addCriterion("VDEF8 <", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8LessThanOrEqualTo(String value) {
            addCriterion("VDEF8 <=", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8Like(String value) {
            addCriterion("VDEF8 like", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotLike(String value) {
            addCriterion("VDEF8 not like", value, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8In(List<String> values) {
            addCriterion("VDEF8 in", values, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotIn(List<String> values) {
            addCriterion("VDEF8 not in", values, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8Between(String value1, String value2) {
            addCriterion("VDEF8 between", value1, value2, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef8NotBetween(String value1, String value2) {
            addCriterion("VDEF8 not between", value1, value2, "vdef8");
            return (Criteria) this;
        }

        public Criteria andVdef9IsNull() {
            addCriterion("VDEF9 is null");
            return (Criteria) this;
        }

        public Criteria andVdef9IsNotNull() {
            addCriterion("VDEF9 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef9EqualTo(String value) {
            addCriterion("VDEF9 =", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotEqualTo(String value) {
            addCriterion("VDEF9 <>", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9GreaterThan(String value) {
            addCriterion("VDEF9 >", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF9 >=", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9LessThan(String value) {
            addCriterion("VDEF9 <", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9LessThanOrEqualTo(String value) {
            addCriterion("VDEF9 <=", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9Like(String value) {
            addCriterion("VDEF9 like", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotLike(String value) {
            addCriterion("VDEF9 not like", value, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9In(List<String> values) {
            addCriterion("VDEF9 in", values, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotIn(List<String> values) {
            addCriterion("VDEF9 not in", values, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9Between(String value1, String value2) {
            addCriterion("VDEF9 between", value1, value2, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef9NotBetween(String value1, String value2) {
            addCriterion("VDEF9 not between", value1, value2, "vdef9");
            return (Criteria) this;
        }

        public Criteria andVdef10IsNull() {
            addCriterion("VDEF10 is null");
            return (Criteria) this;
        }

        public Criteria andVdef10IsNotNull() {
            addCriterion("VDEF10 is not null");
            return (Criteria) this;
        }

        public Criteria andVdef10EqualTo(String value) {
            addCriterion("VDEF10 =", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotEqualTo(String value) {
            addCriterion("VDEF10 <>", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10GreaterThan(String value) {
            addCriterion("VDEF10 >", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10GreaterThanOrEqualTo(String value) {
            addCriterion("VDEF10 >=", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10LessThan(String value) {
            addCriterion("VDEF10 <", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10LessThanOrEqualTo(String value) {
            addCriterion("VDEF10 <=", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10Like(String value) {
            addCriterion("VDEF10 like", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotLike(String value) {
            addCriterion("VDEF10 not like", value, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10In(List<String> values) {
            addCriterion("VDEF10 in", values, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotIn(List<String> values) {
            addCriterion("VDEF10 not in", values, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10Between(String value1, String value2) {
            addCriterion("VDEF10 between", value1, value2, "vdef10");
            return (Criteria) this;
        }

        public Criteria andVdef10NotBetween(String value1, String value2) {
            addCriterion("VDEF10 not between", value1, value2, "vdef10");
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