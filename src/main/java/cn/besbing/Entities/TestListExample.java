package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestListExample() {
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

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
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

        public Criteria andChangedByIsNull() {
            addCriterion("CHANGED_BY is null");
            return (Criteria) this;
        }

        public Criteria andChangedByIsNotNull() {
            addCriterion("CHANGED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andChangedByEqualTo(String value) {
            addCriterion("CHANGED_BY =", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotEqualTo(String value) {
            addCriterion("CHANGED_BY <>", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByGreaterThan(String value) {
            addCriterion("CHANGED_BY >", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByGreaterThanOrEqualTo(String value) {
            addCriterion("CHANGED_BY >=", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByLessThan(String value) {
            addCriterion("CHANGED_BY <", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByLessThanOrEqualTo(String value) {
            addCriterion("CHANGED_BY <=", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByLike(String value) {
            addCriterion("CHANGED_BY like", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotLike(String value) {
            addCriterion("CHANGED_BY not like", value, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByIn(List<String> values) {
            addCriterion("CHANGED_BY in", values, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotIn(List<String> values) {
            addCriterion("CHANGED_BY not in", values, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByBetween(String value1, String value2) {
            addCriterion("CHANGED_BY between", value1, value2, "changedBy");
            return (Criteria) this;
        }

        public Criteria andChangedByNotBetween(String value1, String value2) {
            addCriterion("CHANGED_BY not between", value1, value2, "changedBy");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNull() {
            addCriterion("REMOVED is null");
            return (Criteria) this;
        }

        public Criteria andRemovedIsNotNull() {
            addCriterion("REMOVED is not null");
            return (Criteria) this;
        }

        public Criteria andRemovedEqualTo(String value) {
            addCriterion("REMOVED =", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotEqualTo(String value) {
            addCriterion("REMOVED <>", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThan(String value) {
            addCriterion("REMOVED >", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedGreaterThanOrEqualTo(String value) {
            addCriterion("REMOVED >=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThan(String value) {
            addCriterion("REMOVED <", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLessThanOrEqualTo(String value) {
            addCriterion("REMOVED <=", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedLike(String value) {
            addCriterion("REMOVED like", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotLike(String value) {
            addCriterion("REMOVED not like", value, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedIn(List<String> values) {
            addCriterion("REMOVED in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotIn(List<String> values) {
            addCriterion("REMOVED not in", values, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedBetween(String value1, String value2) {
            addCriterion("REMOVED between", value1, value2, "removed");
            return (Criteria) this;
        }

        public Criteria andRemovedNotBetween(String value1, String value2) {
            addCriterion("REMOVED not between", value1, value2, "removed");
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

        public Criteria andExtLinkIsNull() {
            addCriterion("EXT_LINK is null");
            return (Criteria) this;
        }

        public Criteria andExtLinkIsNotNull() {
            addCriterion("EXT_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andExtLinkEqualTo(String value) {
            addCriterion("EXT_LINK =", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotEqualTo(String value) {
            addCriterion("EXT_LINK <>", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkGreaterThan(String value) {
            addCriterion("EXT_LINK >", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_LINK >=", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkLessThan(String value) {
            addCriterion("EXT_LINK <", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkLessThanOrEqualTo(String value) {
            addCriterion("EXT_LINK <=", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkLike(String value) {
            addCriterion("EXT_LINK like", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotLike(String value) {
            addCriterion("EXT_LINK not like", value, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkIn(List<String> values) {
            addCriterion("EXT_LINK in", values, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotIn(List<String> values) {
            addCriterion("EXT_LINK not in", values, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkBetween(String value1, String value2) {
            addCriterion("EXT_LINK between", value1, value2, "extLink");
            return (Criteria) this;
        }

        public Criteria andExtLinkNotBetween(String value1, String value2) {
            addCriterion("EXT_LINK not between", value1, value2, "extLink");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagIsNull() {
            addCriterion("GLOBAL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagIsNotNull() {
            addCriterion("GLOBAL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagEqualTo(String value) {
            addCriterion("GLOBAL_FLAG =", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagNotEqualTo(String value) {
            addCriterion("GLOBAL_FLAG <>", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagGreaterThan(String value) {
            addCriterion("GLOBAL_FLAG >", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagGreaterThanOrEqualTo(String value) {
            addCriterion("GLOBAL_FLAG >=", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagLessThan(String value) {
            addCriterion("GLOBAL_FLAG <", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagLessThanOrEqualTo(String value) {
            addCriterion("GLOBAL_FLAG <=", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagLike(String value) {
            addCriterion("GLOBAL_FLAG like", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagNotLike(String value) {
            addCriterion("GLOBAL_FLAG not like", value, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagIn(List<String> values) {
            addCriterion("GLOBAL_FLAG in", values, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagNotIn(List<String> values) {
            addCriterion("GLOBAL_FLAG not in", values, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagBetween(String value1, String value2) {
            addCriterion("GLOBAL_FLAG between", value1, value2, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andGlobalFlagNotBetween(String value1, String value2) {
            addCriterion("GLOBAL_FLAG not between", value1, value2, "globalFlag");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoIsNull() {
            addCriterion("SET_RSLT_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoIsNotNull() {
            addCriterion("SET_RSLT_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoEqualTo(String value) {
            addCriterion("SET_RSLT_ORDER_NO =", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoNotEqualTo(String value) {
            addCriterion("SET_RSLT_ORDER_NO <>", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoGreaterThan(String value) {
            addCriterion("SET_RSLT_ORDER_NO >", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("SET_RSLT_ORDER_NO >=", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoLessThan(String value) {
            addCriterion("SET_RSLT_ORDER_NO <", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoLessThanOrEqualTo(String value) {
            addCriterion("SET_RSLT_ORDER_NO <=", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoLike(String value) {
            addCriterion("SET_RSLT_ORDER_NO like", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoNotLike(String value) {
            addCriterion("SET_RSLT_ORDER_NO not like", value, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoIn(List<String> values) {
            addCriterion("SET_RSLT_ORDER_NO in", values, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoNotIn(List<String> values) {
            addCriterion("SET_RSLT_ORDER_NO not in", values, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoBetween(String value1, String value2) {
            addCriterion("SET_RSLT_ORDER_NO between", value1, value2, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andSetRsltOrderNoNotBetween(String value1, String value2) {
            addCriterion("SET_RSLT_ORDER_NO not between", value1, value2, "setRsltOrderNo");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIsNull() {
            addCriterion("APPROVAL_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIsNotNull() {
            addCriterion("APPROVAL_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleEqualTo(String value) {
            addCriterion("APPROVAL_ROLE =", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleNotEqualTo(String value) {
            addCriterion("APPROVAL_ROLE <>", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleGreaterThan(String value) {
            addCriterion("APPROVAL_ROLE >", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_ROLE >=", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleLessThan(String value) {
            addCriterion("APPROVAL_ROLE <", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_ROLE <=", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleLike(String value) {
            addCriterion("APPROVAL_ROLE like", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleNotLike(String value) {
            addCriterion("APPROVAL_ROLE not like", value, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleIn(List<String> values) {
            addCriterion("APPROVAL_ROLE in", values, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleNotIn(List<String> values) {
            addCriterion("APPROVAL_ROLE not in", values, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleBetween(String value1, String value2) {
            addCriterion("APPROVAL_ROLE between", value1, value2, "approvalRole");
            return (Criteria) this;
        }

        public Criteria andApprovalRoleNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_ROLE not between", value1, value2, "approvalRole");
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