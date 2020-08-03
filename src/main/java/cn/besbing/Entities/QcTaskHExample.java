package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcTaskHExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcTaskHExample() {
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

        public Criteria andPkCommissionHIsNull() {
            addCriterion("PK_COMMISSION_H is null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHIsNotNull() {
            addCriterion("PK_COMMISSION_H is not null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHEqualTo(String value) {
            addCriterion("PK_COMMISSION_H =", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotEqualTo(String value) {
            addCriterion("PK_COMMISSION_H <>", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHGreaterThan(String value) {
            addCriterion("PK_COMMISSION_H >", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_H >=", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHLessThan(String value) {
            addCriterion("PK_COMMISSION_H <", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHLessThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_H <=", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHLike(String value) {
            addCriterion("PK_COMMISSION_H like", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotLike(String value) {
            addCriterion("PK_COMMISSION_H not like", value, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHIn(List<String> values) {
            addCriterion("PK_COMMISSION_H in", values, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotIn(List<String> values) {
            addCriterion("PK_COMMISSION_H not in", values, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_H between", value1, value2, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkCommissionHNotBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_H not between", value1, value2, "pkCommissionH");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNull() {
            addCriterion("PK_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkGroupIsNotNull() {
            addCriterion("PK_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkGroupEqualTo(String value) {
            addCriterion("PK_GROUP =", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotEqualTo(String value) {
            addCriterion("PK_GROUP <>", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThan(String value) {
            addCriterion("PK_GROUP >", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_GROUP >=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThan(String value) {
            addCriterion("PK_GROUP <", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLessThanOrEqualTo(String value) {
            addCriterion("PK_GROUP <=", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupLike(String value) {
            addCriterion("PK_GROUP like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotLike(String value) {
            addCriterion("PK_GROUP not like", value, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupIn(List<String> values) {
            addCriterion("PK_GROUP in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotIn(List<String> values) {
            addCriterion("PK_GROUP not in", values, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupBetween(String value1, String value2) {
            addCriterion("PK_GROUP between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkGroupNotBetween(String value1, String value2) {
            addCriterion("PK_GROUP not between", value1, value2, "pkGroup");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(String value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(String value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(String value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(String value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLike(String value) {
            addCriterion("PK_ORG like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotLike(String value) {
            addCriterion("PK_ORG not like", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<String> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<String> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(String value1, String value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(String value1, String value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIsNull() {
            addCriterion("PK_ORG_V is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIsNotNull() {
            addCriterion("PK_ORG_V is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgVEqualTo(String value) {
            addCriterion("PK_ORG_V =", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotEqualTo(String value) {
            addCriterion("PK_ORG_V <>", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVGreaterThan(String value) {
            addCriterion("PK_ORG_V >", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ORG_V >=", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLessThan(String value) {
            addCriterion("PK_ORG_V <", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLessThanOrEqualTo(String value) {
            addCriterion("PK_ORG_V <=", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVLike(String value) {
            addCriterion("PK_ORG_V like", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotLike(String value) {
            addCriterion("PK_ORG_V not like", value, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVIn(List<String> values) {
            addCriterion("PK_ORG_V in", values, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotIn(List<String> values) {
            addCriterion("PK_ORG_V not in", values, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVBetween(String value1, String value2) {
            addCriterion("PK_ORG_V between", value1, value2, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andPkOrgVNotBetween(String value1, String value2) {
            addCriterion("PK_ORG_V not between", value1, value2, "pkOrgV");
            return (Criteria) this;
        }

        public Criteria andDbilldateIsNull() {
            addCriterion("DBILLDATE is null");
            return (Criteria) this;
        }

        public Criteria andDbilldateIsNotNull() {
            addCriterion("DBILLDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDbilldateEqualTo(String value) {
            addCriterion("DBILLDATE =", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateNotEqualTo(String value) {
            addCriterion("DBILLDATE <>", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateGreaterThan(String value) {
            addCriterion("DBILLDATE >", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateGreaterThanOrEqualTo(String value) {
            addCriterion("DBILLDATE >=", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateLessThan(String value) {
            addCriterion("DBILLDATE <", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateLessThanOrEqualTo(String value) {
            addCriterion("DBILLDATE <=", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateLike(String value) {
            addCriterion("DBILLDATE like", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateNotLike(String value) {
            addCriterion("DBILLDATE not like", value, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateIn(List<String> values) {
            addCriterion("DBILLDATE in", values, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateNotIn(List<String> values) {
            addCriterion("DBILLDATE not in", values, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateBetween(String value1, String value2) {
            addCriterion("DBILLDATE between", value1, value2, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andDbilldateNotBetween(String value1, String value2) {
            addCriterion("DBILLDATE not between", value1, value2, "dbilldate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(String value) {
            addCriterion("CREATIONTIME =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(String value) {
            addCriterion("CREATIONTIME <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(String value) {
            addCriterion("CREATIONTIME >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATIONTIME >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(String value) {
            addCriterion("CREATIONTIME <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(String value) {
            addCriterion("CREATIONTIME <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLike(String value) {
            addCriterion("CREATIONTIME like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotLike(String value) {
            addCriterion("CREATIONTIME not like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<String> values) {
            addCriterion("CREATIONTIME in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<String> values) {
            addCriterion("CREATIONTIME not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(String value1, String value2) {
            addCriterion("CREATIONTIME between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(String value1, String value2) {
            addCriterion("CREATIONTIME not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("MODIFIEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("MODIFIEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(String value) {
            addCriterion("MODIFIEDTIME =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(String value) {
            addCriterion("MODIFIEDTIME <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(String value) {
            addCriterion("MODIFIEDTIME >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIEDTIME >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(String value) {
            addCriterion("MODIFIEDTIME <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(String value) {
            addCriterion("MODIFIEDTIME <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLike(String value) {
            addCriterion("MODIFIEDTIME like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotLike(String value) {
            addCriterion("MODIFIEDTIME not like", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<String> values) {
            addCriterion("MODIFIEDTIME in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<String> values) {
            addCriterion("MODIFIEDTIME not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(String value1, String value2) {
            addCriterion("MODIFIEDTIME between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(String value1, String value2) {
            addCriterion("MODIFIEDTIME not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNull() {
            addCriterion("MAKETIME is null");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNotNull() {
            addCriterion("MAKETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaketimeEqualTo(String value) {
            addCriterion("MAKETIME =", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotEqualTo(String value) {
            addCriterion("MAKETIME <>", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThan(String value) {
            addCriterion("MAKETIME >", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThanOrEqualTo(String value) {
            addCriterion("MAKETIME >=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThan(String value) {
            addCriterion("MAKETIME <", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThanOrEqualTo(String value) {
            addCriterion("MAKETIME <=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLike(String value) {
            addCriterion("MAKETIME like", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotLike(String value) {
            addCriterion("MAKETIME not like", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIn(List<String> values) {
            addCriterion("MAKETIME in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotIn(List<String> values) {
            addCriterion("MAKETIME not in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeBetween(String value1, String value2) {
            addCriterion("MAKETIME between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotBetween(String value1, String value2) {
            addCriterion("MAKETIME not between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeIsNull() {
            addCriterion("LASTMAKETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeIsNotNull() {
            addCriterion("LASTMAKETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeEqualTo(String value) {
            addCriterion("LASTMAKETIME =", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotEqualTo(String value) {
            addCriterion("LASTMAKETIME <>", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeGreaterThan(String value) {
            addCriterion("LASTMAKETIME >", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTMAKETIME >=", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeLessThan(String value) {
            addCriterion("LASTMAKETIME <", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeLessThanOrEqualTo(String value) {
            addCriterion("LASTMAKETIME <=", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeLike(String value) {
            addCriterion("LASTMAKETIME like", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotLike(String value) {
            addCriterion("LASTMAKETIME not like", value, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeIn(List<String> values) {
            addCriterion("LASTMAKETIME in", values, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotIn(List<String> values) {
            addCriterion("LASTMAKETIME not in", values, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeBetween(String value1, String value2) {
            addCriterion("LASTMAKETIME between", value1, value2, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andLastmaketimeNotBetween(String value1, String value2) {
            addCriterion("LASTMAKETIME not between", value1, value2, "lastmaketime");
            return (Criteria) this;
        }

        public Criteria andBillidIsNull() {
            addCriterion("BILLID is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("BILLID is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(String value) {
            addCriterion("BILLID =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(String value) {
            addCriterion("BILLID <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(String value) {
            addCriterion("BILLID >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(String value) {
            addCriterion("BILLID >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(String value) {
            addCriterion("BILLID <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(String value) {
            addCriterion("BILLID <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLike(String value) {
            addCriterion("BILLID like", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotLike(String value) {
            addCriterion("BILLID not like", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<String> values) {
            addCriterion("BILLID in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<String> values) {
            addCriterion("BILLID not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(String value1, String value2) {
            addCriterion("BILLID between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(String value1, String value2) {
            addCriterion("BILLID not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("BILLNO =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("BILLNO <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("BILLNO >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("BILLNO >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("BILLNO <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("BILLNO <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("BILLNO like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("BILLNO not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("BILLNO in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("BILLNO not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("BILLNO between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("BILLNO not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNull() {
            addCriterion("BUSITYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusitypeIsNotNull() {
            addCriterion("BUSITYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusitypeEqualTo(String value) {
            addCriterion("BUSITYPE =", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotEqualTo(String value) {
            addCriterion("BUSITYPE <>", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThan(String value) {
            addCriterion("BUSITYPE >", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSITYPE >=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThan(String value) {
            addCriterion("BUSITYPE <", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLessThanOrEqualTo(String value) {
            addCriterion("BUSITYPE <=", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeLike(String value) {
            addCriterion("BUSITYPE like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotLike(String value) {
            addCriterion("BUSITYPE not like", value, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeIn(List<String> values) {
            addCriterion("BUSITYPE in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotIn(List<String> values) {
            addCriterion("BUSITYPE not in", values, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeBetween(String value1, String value2) {
            addCriterion("BUSITYPE between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andBusitypeNotBetween(String value1, String value2) {
            addCriterion("BUSITYPE not between", value1, value2, "busitype");
            return (Criteria) this;
        }

        public Criteria andBillmakerIsNull() {
            addCriterion("BILLMAKER is null");
            return (Criteria) this;
        }

        public Criteria andBillmakerIsNotNull() {
            addCriterion("BILLMAKER is not null");
            return (Criteria) this;
        }

        public Criteria andBillmakerEqualTo(String value) {
            addCriterion("BILLMAKER =", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerNotEqualTo(String value) {
            addCriterion("BILLMAKER <>", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerGreaterThan(String value) {
            addCriterion("BILLMAKER >", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerGreaterThanOrEqualTo(String value) {
            addCriterion("BILLMAKER >=", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerLessThan(String value) {
            addCriterion("BILLMAKER <", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerLessThanOrEqualTo(String value) {
            addCriterion("BILLMAKER <=", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerLike(String value) {
            addCriterion("BILLMAKER like", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerNotLike(String value) {
            addCriterion("BILLMAKER not like", value, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerIn(List<String> values) {
            addCriterion("BILLMAKER in", values, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerNotIn(List<String> values) {
            addCriterion("BILLMAKER not in", values, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerBetween(String value1, String value2) {
            addCriterion("BILLMAKER between", value1, value2, "billmaker");
            return (Criteria) this;
        }

        public Criteria andBillmakerNotBetween(String value1, String value2) {
            addCriterion("BILLMAKER not between", value1, value2, "billmaker");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("APPROVER is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("APPROVER is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(String value) {
            addCriterion("APPROVER =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(String value) {
            addCriterion("APPROVER <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(String value) {
            addCriterion("APPROVER >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVER >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(String value) {
            addCriterion("APPROVER <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(String value) {
            addCriterion("APPROVER <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLike(String value) {
            addCriterion("APPROVER like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotLike(String value) {
            addCriterion("APPROVER not like", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<String> values) {
            addCriterion("APPROVER in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<String> values) {
            addCriterion("APPROVER not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(String value1, String value2) {
            addCriterion("APPROVER between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(String value1, String value2) {
            addCriterion("APPROVER not between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNull() {
            addCriterion("APPROVESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIsNotNull() {
            addCriterion("APPROVESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApprovestatusEqualTo(BigDecimal value) {
            addCriterion("APPROVESTATUS =", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotEqualTo(BigDecimal value) {
            addCriterion("APPROVESTATUS <>", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThan(BigDecimal value) {
            addCriterion("APPROVESTATUS >", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVESTATUS >=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThan(BigDecimal value) {
            addCriterion("APPROVESTATUS <", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPROVESTATUS <=", value, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusIn(List<BigDecimal> values) {
            addCriterion("APPROVESTATUS in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotIn(List<BigDecimal> values) {
            addCriterion("APPROVESTATUS not in", values, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVESTATUS between", value1, value2, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovestatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPROVESTATUS not between", value1, value2, "approvestatus");
            return (Criteria) this;
        }

        public Criteria andApprovenoteIsNull() {
            addCriterion("APPROVENOTE is null");
            return (Criteria) this;
        }

        public Criteria andApprovenoteIsNotNull() {
            addCriterion("APPROVENOTE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovenoteEqualTo(String value) {
            addCriterion("APPROVENOTE =", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteNotEqualTo(String value) {
            addCriterion("APPROVENOTE <>", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteGreaterThan(String value) {
            addCriterion("APPROVENOTE >", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVENOTE >=", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteLessThan(String value) {
            addCriterion("APPROVENOTE <", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteLessThanOrEqualTo(String value) {
            addCriterion("APPROVENOTE <=", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteLike(String value) {
            addCriterion("APPROVENOTE like", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteNotLike(String value) {
            addCriterion("APPROVENOTE not like", value, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteIn(List<String> values) {
            addCriterion("APPROVENOTE in", values, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteNotIn(List<String> values) {
            addCriterion("APPROVENOTE not in", values, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteBetween(String value1, String value2) {
            addCriterion("APPROVENOTE between", value1, value2, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovenoteNotBetween(String value1, String value2) {
            addCriterion("APPROVENOTE not between", value1, value2, "approvenote");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNull() {
            addCriterion("APPROVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andApprovedateIsNotNull() {
            addCriterion("APPROVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedateEqualTo(String value) {
            addCriterion("APPROVEDATE =", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotEqualTo(String value) {
            addCriterion("APPROVEDATE <>", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThan(String value) {
            addCriterion("APPROVEDATE >", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVEDATE >=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThan(String value) {
            addCriterion("APPROVEDATE <", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLessThanOrEqualTo(String value) {
            addCriterion("APPROVEDATE <=", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateLike(String value) {
            addCriterion("APPROVEDATE like", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotLike(String value) {
            addCriterion("APPROVEDATE not like", value, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateIn(List<String> values) {
            addCriterion("APPROVEDATE in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotIn(List<String> values) {
            addCriterion("APPROVEDATE not in", values, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateBetween(String value1, String value2) {
            addCriterion("APPROVEDATE between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andApprovedateNotBetween(String value1, String value2) {
            addCriterion("APPROVEDATE not between", value1, value2, "approvedate");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("TRANSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TRANSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("TRANSTYPE =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("TRANSTYPE <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("TRANSTYPE >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("TRANSTYPE <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("TRANSTYPE like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("TRANSTYPE not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("TRANSTYPE in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("TRANSTYPE not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("TRANSTYPE between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPE not between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNull() {
            addCriterion("BILLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilltypeIsNotNull() {
            addCriterion("BILLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilltypeEqualTo(String value) {
            addCriterion("BILLTYPE =", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotEqualTo(String value) {
            addCriterion("BILLTYPE <>", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThan(String value) {
            addCriterion("BILLTYPE >", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("BILLTYPE >=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThan(String value) {
            addCriterion("BILLTYPE <", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLessThanOrEqualTo(String value) {
            addCriterion("BILLTYPE <=", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeLike(String value) {
            addCriterion("BILLTYPE like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotLike(String value) {
            addCriterion("BILLTYPE not like", value, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeIn(List<String> values) {
            addCriterion("BILLTYPE in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotIn(List<String> values) {
            addCriterion("BILLTYPE not in", values, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeBetween(String value1, String value2) {
            addCriterion("BILLTYPE between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andBilltypeNotBetween(String value1, String value2) {
            addCriterion("BILLTYPE not between", value1, value2, "billtype");
            return (Criteria) this;
        }

        public Criteria andTranstypepkIsNull() {
            addCriterion("TRANSTYPEPK is null");
            return (Criteria) this;
        }

        public Criteria andTranstypepkIsNotNull() {
            addCriterion("TRANSTYPEPK is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypepkEqualTo(String value) {
            addCriterion("TRANSTYPEPK =", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkNotEqualTo(String value) {
            addCriterion("TRANSTYPEPK <>", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkGreaterThan(String value) {
            addCriterion("TRANSTYPEPK >", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPEPK >=", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkLessThan(String value) {
            addCriterion("TRANSTYPEPK <", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPEPK <=", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkLike(String value) {
            addCriterion("TRANSTYPEPK like", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkNotLike(String value) {
            addCriterion("TRANSTYPEPK not like", value, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkIn(List<String> values) {
            addCriterion("TRANSTYPEPK in", values, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkNotIn(List<String> values) {
            addCriterion("TRANSTYPEPK not in", values, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkBetween(String value1, String value2) {
            addCriterion("TRANSTYPEPK between", value1, value2, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andTranstypepkNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPEPK not between", value1, value2, "transtypepk");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeIsNull() {
            addCriterion("SRCBILLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeIsNotNull() {
            addCriterion("SRCBILLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeEqualTo(String value) {
            addCriterion("SRCBILLTYPE =", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeNotEqualTo(String value) {
            addCriterion("SRCBILLTYPE <>", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeGreaterThan(String value) {
            addCriterion("SRCBILLTYPE >", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("SRCBILLTYPE >=", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeLessThan(String value) {
            addCriterion("SRCBILLTYPE <", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeLessThanOrEqualTo(String value) {
            addCriterion("SRCBILLTYPE <=", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeLike(String value) {
            addCriterion("SRCBILLTYPE like", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeNotLike(String value) {
            addCriterion("SRCBILLTYPE not like", value, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeIn(List<String> values) {
            addCriterion("SRCBILLTYPE in", values, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeNotIn(List<String> values) {
            addCriterion("SRCBILLTYPE not in", values, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeBetween(String value1, String value2) {
            addCriterion("SRCBILLTYPE between", value1, value2, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbilltypeNotBetween(String value1, String value2) {
            addCriterion("SRCBILLTYPE not between", value1, value2, "srcbilltype");
            return (Criteria) this;
        }

        public Criteria andSrcbillidIsNull() {
            addCriterion("SRCBILLID is null");
            return (Criteria) this;
        }

        public Criteria andSrcbillidIsNotNull() {
            addCriterion("SRCBILLID is not null");
            return (Criteria) this;
        }

        public Criteria andSrcbillidEqualTo(String value) {
            addCriterion("SRCBILLID =", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidNotEqualTo(String value) {
            addCriterion("SRCBILLID <>", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidGreaterThan(String value) {
            addCriterion("SRCBILLID >", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidGreaterThanOrEqualTo(String value) {
            addCriterion("SRCBILLID >=", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidLessThan(String value) {
            addCriterion("SRCBILLID <", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidLessThanOrEqualTo(String value) {
            addCriterion("SRCBILLID <=", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidLike(String value) {
            addCriterion("SRCBILLID like", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidNotLike(String value) {
            addCriterion("SRCBILLID not like", value, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidIn(List<String> values) {
            addCriterion("SRCBILLID in", values, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidNotIn(List<String> values) {
            addCriterion("SRCBILLID not in", values, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidBetween(String value1, String value2) {
            addCriterion("SRCBILLID between", value1, value2, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andSrcbillidNotBetween(String value1, String value2) {
            addCriterion("SRCBILLID not between", value1, value2, "srcbillid");
            return (Criteria) this;
        }

        public Criteria andEmendenumIsNull() {
            addCriterion("EMENDENUM is null");
            return (Criteria) this;
        }

        public Criteria andEmendenumIsNotNull() {
            addCriterion("EMENDENUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmendenumEqualTo(BigDecimal value) {
            addCriterion("EMENDENUM =", value, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumNotEqualTo(BigDecimal value) {
            addCriterion("EMENDENUM <>", value, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumGreaterThan(BigDecimal value) {
            addCriterion("EMENDENUM >", value, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMENDENUM >=", value, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumLessThan(BigDecimal value) {
            addCriterion("EMENDENUM <", value, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMENDENUM <=", value, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumIn(List<BigDecimal> values) {
            addCriterion("EMENDENUM in", values, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumNotIn(List<BigDecimal> values) {
            addCriterion("EMENDENUM not in", values, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMENDENUM between", value1, value2, "emendenum");
            return (Criteria) this;
        }

        public Criteria andEmendenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMENDENUM not between", value1, value2, "emendenum");
            return (Criteria) this;
        }

        public Criteria andBillversionpkIsNull() {
            addCriterion("BILLVERSIONPK is null");
            return (Criteria) this;
        }

        public Criteria andBillversionpkIsNotNull() {
            addCriterion("BILLVERSIONPK is not null");
            return (Criteria) this;
        }

        public Criteria andBillversionpkEqualTo(String value) {
            addCriterion("BILLVERSIONPK =", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkNotEqualTo(String value) {
            addCriterion("BILLVERSIONPK <>", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkGreaterThan(String value) {
            addCriterion("BILLVERSIONPK >", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkGreaterThanOrEqualTo(String value) {
            addCriterion("BILLVERSIONPK >=", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkLessThan(String value) {
            addCriterion("BILLVERSIONPK <", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkLessThanOrEqualTo(String value) {
            addCriterion("BILLVERSIONPK <=", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkLike(String value) {
            addCriterion("BILLVERSIONPK like", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkNotLike(String value) {
            addCriterion("BILLVERSIONPK not like", value, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkIn(List<String> values) {
            addCriterion("BILLVERSIONPK in", values, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkNotIn(List<String> values) {
            addCriterion("BILLVERSIONPK not in", values, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkBetween(String value1, String value2) {
            addCriterion("BILLVERSIONPK between", value1, value2, "billversionpk");
            return (Criteria) this;
        }

        public Criteria andBillversionpkNotBetween(String value1, String value2) {
            addCriterion("BILLVERSIONPK not between", value1, value2, "billversionpk");
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

        public Criteria andDef21IsNull() {
            addCriterion("DEF21 is null");
            return (Criteria) this;
        }

        public Criteria andDef21IsNotNull() {
            addCriterion("DEF21 is not null");
            return (Criteria) this;
        }

        public Criteria andDef21EqualTo(String value) {
            addCriterion("DEF21 =", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotEqualTo(String value) {
            addCriterion("DEF21 <>", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21GreaterThan(String value) {
            addCriterion("DEF21 >", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21GreaterThanOrEqualTo(String value) {
            addCriterion("DEF21 >=", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21LessThan(String value) {
            addCriterion("DEF21 <", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21LessThanOrEqualTo(String value) {
            addCriterion("DEF21 <=", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21Like(String value) {
            addCriterion("DEF21 like", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotLike(String value) {
            addCriterion("DEF21 not like", value, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21In(List<String> values) {
            addCriterion("DEF21 in", values, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotIn(List<String> values) {
            addCriterion("DEF21 not in", values, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21Between(String value1, String value2) {
            addCriterion("DEF21 between", value1, value2, "def21");
            return (Criteria) this;
        }

        public Criteria andDef21NotBetween(String value1, String value2) {
            addCriterion("DEF21 not between", value1, value2, "def21");
            return (Criteria) this;
        }

        public Criteria andDef22IsNull() {
            addCriterion("DEF22 is null");
            return (Criteria) this;
        }

        public Criteria andDef22IsNotNull() {
            addCriterion("DEF22 is not null");
            return (Criteria) this;
        }

        public Criteria andDef22EqualTo(String value) {
            addCriterion("DEF22 =", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotEqualTo(String value) {
            addCriterion("DEF22 <>", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22GreaterThan(String value) {
            addCriterion("DEF22 >", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22GreaterThanOrEqualTo(String value) {
            addCriterion("DEF22 >=", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22LessThan(String value) {
            addCriterion("DEF22 <", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22LessThanOrEqualTo(String value) {
            addCriterion("DEF22 <=", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22Like(String value) {
            addCriterion("DEF22 like", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotLike(String value) {
            addCriterion("DEF22 not like", value, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22In(List<String> values) {
            addCriterion("DEF22 in", values, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotIn(List<String> values) {
            addCriterion("DEF22 not in", values, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22Between(String value1, String value2) {
            addCriterion("DEF22 between", value1, value2, "def22");
            return (Criteria) this;
        }

        public Criteria andDef22NotBetween(String value1, String value2) {
            addCriterion("DEF22 not between", value1, value2, "def22");
            return (Criteria) this;
        }

        public Criteria andDef23IsNull() {
            addCriterion("DEF23 is null");
            return (Criteria) this;
        }

        public Criteria andDef23IsNotNull() {
            addCriterion("DEF23 is not null");
            return (Criteria) this;
        }

        public Criteria andDef23EqualTo(String value) {
            addCriterion("DEF23 =", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotEqualTo(String value) {
            addCriterion("DEF23 <>", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23GreaterThan(String value) {
            addCriterion("DEF23 >", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23GreaterThanOrEqualTo(String value) {
            addCriterion("DEF23 >=", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23LessThan(String value) {
            addCriterion("DEF23 <", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23LessThanOrEqualTo(String value) {
            addCriterion("DEF23 <=", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23Like(String value) {
            addCriterion("DEF23 like", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotLike(String value) {
            addCriterion("DEF23 not like", value, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23In(List<String> values) {
            addCriterion("DEF23 in", values, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotIn(List<String> values) {
            addCriterion("DEF23 not in", values, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23Between(String value1, String value2) {
            addCriterion("DEF23 between", value1, value2, "def23");
            return (Criteria) this;
        }

        public Criteria andDef23NotBetween(String value1, String value2) {
            addCriterion("DEF23 not between", value1, value2, "def23");
            return (Criteria) this;
        }

        public Criteria andDef24IsNull() {
            addCriterion("DEF24 is null");
            return (Criteria) this;
        }

        public Criteria andDef24IsNotNull() {
            addCriterion("DEF24 is not null");
            return (Criteria) this;
        }

        public Criteria andDef24EqualTo(String value) {
            addCriterion("DEF24 =", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotEqualTo(String value) {
            addCriterion("DEF24 <>", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24GreaterThan(String value) {
            addCriterion("DEF24 >", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24GreaterThanOrEqualTo(String value) {
            addCriterion("DEF24 >=", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24LessThan(String value) {
            addCriterion("DEF24 <", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24LessThanOrEqualTo(String value) {
            addCriterion("DEF24 <=", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24Like(String value) {
            addCriterion("DEF24 like", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotLike(String value) {
            addCriterion("DEF24 not like", value, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24In(List<String> values) {
            addCriterion("DEF24 in", values, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotIn(List<String> values) {
            addCriterion("DEF24 not in", values, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24Between(String value1, String value2) {
            addCriterion("DEF24 between", value1, value2, "def24");
            return (Criteria) this;
        }

        public Criteria andDef24NotBetween(String value1, String value2) {
            addCriterion("DEF24 not between", value1, value2, "def24");
            return (Criteria) this;
        }

        public Criteria andDef25IsNull() {
            addCriterion("DEF25 is null");
            return (Criteria) this;
        }

        public Criteria andDef25IsNotNull() {
            addCriterion("DEF25 is not null");
            return (Criteria) this;
        }

        public Criteria andDef25EqualTo(String value) {
            addCriterion("DEF25 =", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotEqualTo(String value) {
            addCriterion("DEF25 <>", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25GreaterThan(String value) {
            addCriterion("DEF25 >", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25GreaterThanOrEqualTo(String value) {
            addCriterion("DEF25 >=", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25LessThan(String value) {
            addCriterion("DEF25 <", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25LessThanOrEqualTo(String value) {
            addCriterion("DEF25 <=", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25Like(String value) {
            addCriterion("DEF25 like", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotLike(String value) {
            addCriterion("DEF25 not like", value, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25In(List<String> values) {
            addCriterion("DEF25 in", values, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotIn(List<String> values) {
            addCriterion("DEF25 not in", values, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25Between(String value1, String value2) {
            addCriterion("DEF25 between", value1, value2, "def25");
            return (Criteria) this;
        }

        public Criteria andDef25NotBetween(String value1, String value2) {
            addCriterion("DEF25 not between", value1, value2, "def25");
            return (Criteria) this;
        }

        public Criteria andDef26IsNull() {
            addCriterion("DEF26 is null");
            return (Criteria) this;
        }

        public Criteria andDef26IsNotNull() {
            addCriterion("DEF26 is not null");
            return (Criteria) this;
        }

        public Criteria andDef26EqualTo(String value) {
            addCriterion("DEF26 =", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotEqualTo(String value) {
            addCriterion("DEF26 <>", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26GreaterThan(String value) {
            addCriterion("DEF26 >", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26GreaterThanOrEqualTo(String value) {
            addCriterion("DEF26 >=", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26LessThan(String value) {
            addCriterion("DEF26 <", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26LessThanOrEqualTo(String value) {
            addCriterion("DEF26 <=", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26Like(String value) {
            addCriterion("DEF26 like", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotLike(String value) {
            addCriterion("DEF26 not like", value, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26In(List<String> values) {
            addCriterion("DEF26 in", values, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotIn(List<String> values) {
            addCriterion("DEF26 not in", values, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26Between(String value1, String value2) {
            addCriterion("DEF26 between", value1, value2, "def26");
            return (Criteria) this;
        }

        public Criteria andDef26NotBetween(String value1, String value2) {
            addCriterion("DEF26 not between", value1, value2, "def26");
            return (Criteria) this;
        }

        public Criteria andDef27IsNull() {
            addCriterion("DEF27 is null");
            return (Criteria) this;
        }

        public Criteria andDef27IsNotNull() {
            addCriterion("DEF27 is not null");
            return (Criteria) this;
        }

        public Criteria andDef27EqualTo(String value) {
            addCriterion("DEF27 =", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotEqualTo(String value) {
            addCriterion("DEF27 <>", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27GreaterThan(String value) {
            addCriterion("DEF27 >", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27GreaterThanOrEqualTo(String value) {
            addCriterion("DEF27 >=", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27LessThan(String value) {
            addCriterion("DEF27 <", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27LessThanOrEqualTo(String value) {
            addCriterion("DEF27 <=", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27Like(String value) {
            addCriterion("DEF27 like", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotLike(String value) {
            addCriterion("DEF27 not like", value, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27In(List<String> values) {
            addCriterion("DEF27 in", values, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotIn(List<String> values) {
            addCriterion("DEF27 not in", values, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27Between(String value1, String value2) {
            addCriterion("DEF27 between", value1, value2, "def27");
            return (Criteria) this;
        }

        public Criteria andDef27NotBetween(String value1, String value2) {
            addCriterion("DEF27 not between", value1, value2, "def27");
            return (Criteria) this;
        }

        public Criteria andDef28IsNull() {
            addCriterion("DEF28 is null");
            return (Criteria) this;
        }

        public Criteria andDef28IsNotNull() {
            addCriterion("DEF28 is not null");
            return (Criteria) this;
        }

        public Criteria andDef28EqualTo(String value) {
            addCriterion("DEF28 =", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotEqualTo(String value) {
            addCriterion("DEF28 <>", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28GreaterThan(String value) {
            addCriterion("DEF28 >", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28GreaterThanOrEqualTo(String value) {
            addCriterion("DEF28 >=", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28LessThan(String value) {
            addCriterion("DEF28 <", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28LessThanOrEqualTo(String value) {
            addCriterion("DEF28 <=", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28Like(String value) {
            addCriterion("DEF28 like", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotLike(String value) {
            addCriterion("DEF28 not like", value, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28In(List<String> values) {
            addCriterion("DEF28 in", values, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotIn(List<String> values) {
            addCriterion("DEF28 not in", values, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28Between(String value1, String value2) {
            addCriterion("DEF28 between", value1, value2, "def28");
            return (Criteria) this;
        }

        public Criteria andDef28NotBetween(String value1, String value2) {
            addCriterion("DEF28 not between", value1, value2, "def28");
            return (Criteria) this;
        }

        public Criteria andDef29IsNull() {
            addCriterion("DEF29 is null");
            return (Criteria) this;
        }

        public Criteria andDef29IsNotNull() {
            addCriterion("DEF29 is not null");
            return (Criteria) this;
        }

        public Criteria andDef29EqualTo(String value) {
            addCriterion("DEF29 =", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotEqualTo(String value) {
            addCriterion("DEF29 <>", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29GreaterThan(String value) {
            addCriterion("DEF29 >", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29GreaterThanOrEqualTo(String value) {
            addCriterion("DEF29 >=", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29LessThan(String value) {
            addCriterion("DEF29 <", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29LessThanOrEqualTo(String value) {
            addCriterion("DEF29 <=", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29Like(String value) {
            addCriterion("DEF29 like", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotLike(String value) {
            addCriterion("DEF29 not like", value, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29In(List<String> values) {
            addCriterion("DEF29 in", values, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotIn(List<String> values) {
            addCriterion("DEF29 not in", values, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29Between(String value1, String value2) {
            addCriterion("DEF29 between", value1, value2, "def29");
            return (Criteria) this;
        }

        public Criteria andDef29NotBetween(String value1, String value2) {
            addCriterion("DEF29 not between", value1, value2, "def29");
            return (Criteria) this;
        }

        public Criteria andDef30IsNull() {
            addCriterion("DEF30 is null");
            return (Criteria) this;
        }

        public Criteria andDef30IsNotNull() {
            addCriterion("DEF30 is not null");
            return (Criteria) this;
        }

        public Criteria andDef30EqualTo(String value) {
            addCriterion("DEF30 =", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotEqualTo(String value) {
            addCriterion("DEF30 <>", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30GreaterThan(String value) {
            addCriterion("DEF30 >", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30GreaterThanOrEqualTo(String value) {
            addCriterion("DEF30 >=", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30LessThan(String value) {
            addCriterion("DEF30 <", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30LessThanOrEqualTo(String value) {
            addCriterion("DEF30 <=", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30Like(String value) {
            addCriterion("DEF30 like", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotLike(String value) {
            addCriterion("DEF30 not like", value, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30In(List<String> values) {
            addCriterion("DEF30 in", values, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotIn(List<String> values) {
            addCriterion("DEF30 not in", values, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30Between(String value1, String value2) {
            addCriterion("DEF30 between", value1, value2, "def30");
            return (Criteria) this;
        }

        public Criteria andDef30NotBetween(String value1, String value2) {
            addCriterion("DEF30 not between", value1, value2, "def30");
            return (Criteria) this;
        }

        public Criteria andDef31IsNull() {
            addCriterion("DEF31 is null");
            return (Criteria) this;
        }

        public Criteria andDef31IsNotNull() {
            addCriterion("DEF31 is not null");
            return (Criteria) this;
        }

        public Criteria andDef31EqualTo(String value) {
            addCriterion("DEF31 =", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotEqualTo(String value) {
            addCriterion("DEF31 <>", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31GreaterThan(String value) {
            addCriterion("DEF31 >", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31GreaterThanOrEqualTo(String value) {
            addCriterion("DEF31 >=", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31LessThan(String value) {
            addCriterion("DEF31 <", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31LessThanOrEqualTo(String value) {
            addCriterion("DEF31 <=", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31Like(String value) {
            addCriterion("DEF31 like", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotLike(String value) {
            addCriterion("DEF31 not like", value, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31In(List<String> values) {
            addCriterion("DEF31 in", values, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotIn(List<String> values) {
            addCriterion("DEF31 not in", values, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31Between(String value1, String value2) {
            addCriterion("DEF31 between", value1, value2, "def31");
            return (Criteria) this;
        }

        public Criteria andDef31NotBetween(String value1, String value2) {
            addCriterion("DEF31 not between", value1, value2, "def31");
            return (Criteria) this;
        }

        public Criteria andDef32IsNull() {
            addCriterion("DEF32 is null");
            return (Criteria) this;
        }

        public Criteria andDef32IsNotNull() {
            addCriterion("DEF32 is not null");
            return (Criteria) this;
        }

        public Criteria andDef32EqualTo(String value) {
            addCriterion("DEF32 =", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotEqualTo(String value) {
            addCriterion("DEF32 <>", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32GreaterThan(String value) {
            addCriterion("DEF32 >", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32GreaterThanOrEqualTo(String value) {
            addCriterion("DEF32 >=", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32LessThan(String value) {
            addCriterion("DEF32 <", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32LessThanOrEqualTo(String value) {
            addCriterion("DEF32 <=", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32Like(String value) {
            addCriterion("DEF32 like", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotLike(String value) {
            addCriterion("DEF32 not like", value, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32In(List<String> values) {
            addCriterion("DEF32 in", values, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotIn(List<String> values) {
            addCriterion("DEF32 not in", values, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32Between(String value1, String value2) {
            addCriterion("DEF32 between", value1, value2, "def32");
            return (Criteria) this;
        }

        public Criteria andDef32NotBetween(String value1, String value2) {
            addCriterion("DEF32 not between", value1, value2, "def32");
            return (Criteria) this;
        }

        public Criteria andDef33IsNull() {
            addCriterion("DEF33 is null");
            return (Criteria) this;
        }

        public Criteria andDef33IsNotNull() {
            addCriterion("DEF33 is not null");
            return (Criteria) this;
        }

        public Criteria andDef33EqualTo(String value) {
            addCriterion("DEF33 =", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotEqualTo(String value) {
            addCriterion("DEF33 <>", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33GreaterThan(String value) {
            addCriterion("DEF33 >", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33GreaterThanOrEqualTo(String value) {
            addCriterion("DEF33 >=", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33LessThan(String value) {
            addCriterion("DEF33 <", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33LessThanOrEqualTo(String value) {
            addCriterion("DEF33 <=", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33Like(String value) {
            addCriterion("DEF33 like", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotLike(String value) {
            addCriterion("DEF33 not like", value, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33In(List<String> values) {
            addCriterion("DEF33 in", values, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotIn(List<String> values) {
            addCriterion("DEF33 not in", values, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33Between(String value1, String value2) {
            addCriterion("DEF33 between", value1, value2, "def33");
            return (Criteria) this;
        }

        public Criteria andDef33NotBetween(String value1, String value2) {
            addCriterion("DEF33 not between", value1, value2, "def33");
            return (Criteria) this;
        }

        public Criteria andDef34IsNull() {
            addCriterion("DEF34 is null");
            return (Criteria) this;
        }

        public Criteria andDef34IsNotNull() {
            addCriterion("DEF34 is not null");
            return (Criteria) this;
        }

        public Criteria andDef34EqualTo(String value) {
            addCriterion("DEF34 =", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotEqualTo(String value) {
            addCriterion("DEF34 <>", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34GreaterThan(String value) {
            addCriterion("DEF34 >", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34GreaterThanOrEqualTo(String value) {
            addCriterion("DEF34 >=", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34LessThan(String value) {
            addCriterion("DEF34 <", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34LessThanOrEqualTo(String value) {
            addCriterion("DEF34 <=", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34Like(String value) {
            addCriterion("DEF34 like", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotLike(String value) {
            addCriterion("DEF34 not like", value, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34In(List<String> values) {
            addCriterion("DEF34 in", values, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotIn(List<String> values) {
            addCriterion("DEF34 not in", values, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34Between(String value1, String value2) {
            addCriterion("DEF34 between", value1, value2, "def34");
            return (Criteria) this;
        }

        public Criteria andDef34NotBetween(String value1, String value2) {
            addCriterion("DEF34 not between", value1, value2, "def34");
            return (Criteria) this;
        }

        public Criteria andDef35IsNull() {
            addCriterion("DEF35 is null");
            return (Criteria) this;
        }

        public Criteria andDef35IsNotNull() {
            addCriterion("DEF35 is not null");
            return (Criteria) this;
        }

        public Criteria andDef35EqualTo(String value) {
            addCriterion("DEF35 =", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotEqualTo(String value) {
            addCriterion("DEF35 <>", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35GreaterThan(String value) {
            addCriterion("DEF35 >", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35GreaterThanOrEqualTo(String value) {
            addCriterion("DEF35 >=", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35LessThan(String value) {
            addCriterion("DEF35 <", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35LessThanOrEqualTo(String value) {
            addCriterion("DEF35 <=", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35Like(String value) {
            addCriterion("DEF35 like", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotLike(String value) {
            addCriterion("DEF35 not like", value, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35In(List<String> values) {
            addCriterion("DEF35 in", values, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotIn(List<String> values) {
            addCriterion("DEF35 not in", values, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35Between(String value1, String value2) {
            addCriterion("DEF35 between", value1, value2, "def35");
            return (Criteria) this;
        }

        public Criteria andDef35NotBetween(String value1, String value2) {
            addCriterion("DEF35 not between", value1, value2, "def35");
            return (Criteria) this;
        }

        public Criteria andDef36IsNull() {
            addCriterion("DEF36 is null");
            return (Criteria) this;
        }

        public Criteria andDef36IsNotNull() {
            addCriterion("DEF36 is not null");
            return (Criteria) this;
        }

        public Criteria andDef36EqualTo(String value) {
            addCriterion("DEF36 =", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotEqualTo(String value) {
            addCriterion("DEF36 <>", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36GreaterThan(String value) {
            addCriterion("DEF36 >", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36GreaterThanOrEqualTo(String value) {
            addCriterion("DEF36 >=", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36LessThan(String value) {
            addCriterion("DEF36 <", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36LessThanOrEqualTo(String value) {
            addCriterion("DEF36 <=", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36Like(String value) {
            addCriterion("DEF36 like", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotLike(String value) {
            addCriterion("DEF36 not like", value, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36In(List<String> values) {
            addCriterion("DEF36 in", values, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotIn(List<String> values) {
            addCriterion("DEF36 not in", values, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36Between(String value1, String value2) {
            addCriterion("DEF36 between", value1, value2, "def36");
            return (Criteria) this;
        }

        public Criteria andDef36NotBetween(String value1, String value2) {
            addCriterion("DEF36 not between", value1, value2, "def36");
            return (Criteria) this;
        }

        public Criteria andDef37IsNull() {
            addCriterion("DEF37 is null");
            return (Criteria) this;
        }

        public Criteria andDef37IsNotNull() {
            addCriterion("DEF37 is not null");
            return (Criteria) this;
        }

        public Criteria andDef37EqualTo(String value) {
            addCriterion("DEF37 =", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotEqualTo(String value) {
            addCriterion("DEF37 <>", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37GreaterThan(String value) {
            addCriterion("DEF37 >", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37GreaterThanOrEqualTo(String value) {
            addCriterion("DEF37 >=", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37LessThan(String value) {
            addCriterion("DEF37 <", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37LessThanOrEqualTo(String value) {
            addCriterion("DEF37 <=", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37Like(String value) {
            addCriterion("DEF37 like", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotLike(String value) {
            addCriterion("DEF37 not like", value, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37In(List<String> values) {
            addCriterion("DEF37 in", values, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotIn(List<String> values) {
            addCriterion("DEF37 not in", values, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37Between(String value1, String value2) {
            addCriterion("DEF37 between", value1, value2, "def37");
            return (Criteria) this;
        }

        public Criteria andDef37NotBetween(String value1, String value2) {
            addCriterion("DEF37 not between", value1, value2, "def37");
            return (Criteria) this;
        }

        public Criteria andDef38IsNull() {
            addCriterion("DEF38 is null");
            return (Criteria) this;
        }

        public Criteria andDef38IsNotNull() {
            addCriterion("DEF38 is not null");
            return (Criteria) this;
        }

        public Criteria andDef38EqualTo(String value) {
            addCriterion("DEF38 =", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotEqualTo(String value) {
            addCriterion("DEF38 <>", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38GreaterThan(String value) {
            addCriterion("DEF38 >", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38GreaterThanOrEqualTo(String value) {
            addCriterion("DEF38 >=", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38LessThan(String value) {
            addCriterion("DEF38 <", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38LessThanOrEqualTo(String value) {
            addCriterion("DEF38 <=", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38Like(String value) {
            addCriterion("DEF38 like", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotLike(String value) {
            addCriterion("DEF38 not like", value, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38In(List<String> values) {
            addCriterion("DEF38 in", values, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotIn(List<String> values) {
            addCriterion("DEF38 not in", values, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38Between(String value1, String value2) {
            addCriterion("DEF38 between", value1, value2, "def38");
            return (Criteria) this;
        }

        public Criteria andDef38NotBetween(String value1, String value2) {
            addCriterion("DEF38 not between", value1, value2, "def38");
            return (Criteria) this;
        }

        public Criteria andDef39IsNull() {
            addCriterion("DEF39 is null");
            return (Criteria) this;
        }

        public Criteria andDef39IsNotNull() {
            addCriterion("DEF39 is not null");
            return (Criteria) this;
        }

        public Criteria andDef39EqualTo(String value) {
            addCriterion("DEF39 =", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotEqualTo(String value) {
            addCriterion("DEF39 <>", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39GreaterThan(String value) {
            addCriterion("DEF39 >", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39GreaterThanOrEqualTo(String value) {
            addCriterion("DEF39 >=", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39LessThan(String value) {
            addCriterion("DEF39 <", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39LessThanOrEqualTo(String value) {
            addCriterion("DEF39 <=", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39Like(String value) {
            addCriterion("DEF39 like", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotLike(String value) {
            addCriterion("DEF39 not like", value, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39In(List<String> values) {
            addCriterion("DEF39 in", values, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotIn(List<String> values) {
            addCriterion("DEF39 not in", values, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39Between(String value1, String value2) {
            addCriterion("DEF39 between", value1, value2, "def39");
            return (Criteria) this;
        }

        public Criteria andDef39NotBetween(String value1, String value2) {
            addCriterion("DEF39 not between", value1, value2, "def39");
            return (Criteria) this;
        }

        public Criteria andDef40IsNull() {
            addCriterion("DEF40 is null");
            return (Criteria) this;
        }

        public Criteria andDef40IsNotNull() {
            addCriterion("DEF40 is not null");
            return (Criteria) this;
        }

        public Criteria andDef40EqualTo(String value) {
            addCriterion("DEF40 =", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotEqualTo(String value) {
            addCriterion("DEF40 <>", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40GreaterThan(String value) {
            addCriterion("DEF40 >", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40GreaterThanOrEqualTo(String value) {
            addCriterion("DEF40 >=", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40LessThan(String value) {
            addCriterion("DEF40 <", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40LessThanOrEqualTo(String value) {
            addCriterion("DEF40 <=", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40Like(String value) {
            addCriterion("DEF40 like", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotLike(String value) {
            addCriterion("DEF40 not like", value, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40In(List<String> values) {
            addCriterion("DEF40 in", values, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotIn(List<String> values) {
            addCriterion("DEF40 not in", values, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40Between(String value1, String value2) {
            addCriterion("DEF40 between", value1, value2, "def40");
            return (Criteria) this;
        }

        public Criteria andDef40NotBetween(String value1, String value2) {
            addCriterion("DEF40 not between", value1, value2, "def40");
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

        public Criteria andBillstatusIsNull() {
            addCriterion("BILLSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBillstatusIsNotNull() {
            addCriterion("BILLSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBillstatusEqualTo(BigDecimal value) {
            addCriterion("BILLSTATUS =", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotEqualTo(BigDecimal value) {
            addCriterion("BILLSTATUS <>", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThan(BigDecimal value) {
            addCriterion("BILLSTATUS >", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BILLSTATUS >=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThan(BigDecimal value) {
            addCriterion("BILLSTATUS <", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BILLSTATUS <=", value, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusIn(List<BigDecimal> values) {
            addCriterion("BILLSTATUS in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotIn(List<BigDecimal> values) {
            addCriterion("BILLSTATUS not in", values, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILLSTATUS between", value1, value2, "billstatus");
            return (Criteria) this;
        }

        public Criteria andBillstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BILLSTATUS not between", value1, value2, "billstatus");
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