package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AllTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AllTaskExample() {
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

        public Criteria andCustomerIsNull() {
            addCriterion("CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("CUSTOMER =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("CUSTOMER <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("CUSTOMER >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("CUSTOMER <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("CUSTOMER like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("CUSTOMER not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("CUSTOMER in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("CUSTOMER not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("CUSTOMER between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerIsNull() {
            addCriterion("T_SOURCE_CUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerIsNotNull() {
            addCriterion("T_SOURCE_CUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER =", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER <>", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerGreaterThan(String value) {
            addCriterion("T_SOURCE_CUSTOMER >", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER >=", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerLessThan(String value) {
            addCriterion("T_SOURCE_CUSTOMER <", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerLessThanOrEqualTo(String value) {
            addCriterion("T_SOURCE_CUSTOMER <=", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerLike(String value) {
            addCriterion("T_SOURCE_CUSTOMER like", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotLike(String value) {
            addCriterion("T_SOURCE_CUSTOMER not like", value, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerIn(List<String> values) {
            addCriterion("T_SOURCE_CUSTOMER in", values, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotIn(List<String> values) {
            addCriterion("T_SOURCE_CUSTOMER not in", values, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerBetween(String value1, String value2) {
            addCriterion("T_SOURCE_CUSTOMER between", value1, value2, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andTSourceCustomerNotBetween(String value1, String value2) {
            addCriterion("T_SOURCE_CUSTOMER not between", value1, value2, "tSourceCustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNull() {
            addCriterion("CUSTOMER_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNotNull() {
            addCriterion("CUSTOMER_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT =", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT <>", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThan(String value) {
            addCriterion("CUSTOMER_CONTACT >", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT >=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThan(String value) {
            addCriterion("CUSTOMER_CONTACT <", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CONTACT <=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLike(String value) {
            addCriterion("CUSTOMER_CONTACT like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotLike(String value) {
            addCriterion("CUSTOMER_CONTACT not like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIn(List<String> values) {
            addCriterion("CUSTOMER_CONTACT in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotIn(List<String> values) {
            addCriterion("CUSTOMER_CONTACT not in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CONTACT between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CONTACT not between", value1, value2, "customerContact");
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

        public Criteria andTemplateIsNull() {
            addCriterion("TEMPLATE is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIsNotNull() {
            addCriterion("TEMPLATE is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateEqualTo(String value) {
            addCriterion("TEMPLATE =", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotEqualTo(String value) {
            addCriterion("TEMPLATE <>", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThan(String value) {
            addCriterion("TEMPLATE >", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE >=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThan(String value) {
            addCriterion("TEMPLATE <", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE <=", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateLike(String value) {
            addCriterion("TEMPLATE like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotLike(String value) {
            addCriterion("TEMPLATE not like", value, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateIn(List<String> values) {
            addCriterion("TEMPLATE in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotIn(List<String> values) {
            addCriterion("TEMPLATE not in", values, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateBetween(String value1, String value2) {
            addCriterion("TEMPLATE between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTemplateNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE not between", value1, value2, "template");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameIsNull() {
            addCriterion("TASK_REPORTED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameIsNotNull() {
            addCriterion("TASK_REPORTED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME =", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME <>", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameGreaterThan(String value) {
            addCriterion("TASK_REPORTED_NAME >", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME >=", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameLessThan(String value) {
            addCriterion("TASK_REPORTED_NAME <", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameLessThanOrEqualTo(String value) {
            addCriterion("TASK_REPORTED_NAME <=", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameLike(String value) {
            addCriterion("TASK_REPORTED_NAME like", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotLike(String value) {
            addCriterion("TASK_REPORTED_NAME not like", value, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameIn(List<String> values) {
            addCriterion("TASK_REPORTED_NAME in", values, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotIn(List<String> values) {
            addCriterion("TASK_REPORTED_NAME not in", values, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameBetween(String value1, String value2) {
            addCriterion("TASK_REPORTED_NAME between", value1, value2, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andTaskReportedNameNotBetween(String value1, String value2) {
            addCriterion("TASK_REPORTED_NAME not between", value1, value2, "taskReportedName");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNull() {
            addCriterion("COMMON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCommonNameIsNotNull() {
            addCriterion("COMMON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCommonNameEqualTo(String value) {
            addCriterion("COMMON_NAME =", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotEqualTo(String value) {
            addCriterion("COMMON_NAME <>", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThan(String value) {
            addCriterion("COMMON_NAME >", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON_NAME >=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThan(String value) {
            addCriterion("COMMON_NAME <", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLessThanOrEqualTo(String value) {
            addCriterion("COMMON_NAME <=", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameLike(String value) {
            addCriterion("COMMON_NAME like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotLike(String value) {
            addCriterion("COMMON_NAME not like", value, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameIn(List<String> values) {
            addCriterion("COMMON_NAME in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotIn(List<String> values) {
            addCriterion("COMMON_NAME not in", values, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameBetween(String value1, String value2) {
            addCriterion("COMMON_NAME between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andCommonNameNotBetween(String value1, String value2) {
            addCriterion("COMMON_NAME not between", value1, value2, "commonName");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("REPORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("REPORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("REPORT_NAME =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("REPORT_NAME <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("REPORT_NAME >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("REPORT_NAME <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("REPORT_NAME like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("REPORT_NAME not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("REPORT_NAME in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("REPORT_NAME not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("REPORT_NAME between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_NAME not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIsNull() {
            addCriterion("PRODUCT_SERIES is null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIsNotNull() {
            addCriterion("PRODUCT_SERIES is not null");
            return (Criteria) this;
        }

        public Criteria andProductSeriesEqualTo(String value) {
            addCriterion("PRODUCT_SERIES =", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotEqualTo(String value) {
            addCriterion("PRODUCT_SERIES <>", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesGreaterThan(String value) {
            addCriterion("PRODUCT_SERIES >", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SERIES >=", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesLessThan(String value) {
            addCriterion("PRODUCT_SERIES <", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SERIES <=", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesLike(String value) {
            addCriterion("PRODUCT_SERIES like", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotLike(String value) {
            addCriterion("PRODUCT_SERIES not like", value, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesIn(List<String> values) {
            addCriterion("PRODUCT_SERIES in", values, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotIn(List<String> values) {
            addCriterion("PRODUCT_SERIES not in", values, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesBetween(String value1, String value2) {
            addCriterion("PRODUCT_SERIES between", value1, value2, "productSeries");
            return (Criteria) this;
        }

        public Criteria andProductSeriesNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SERIES not between", value1, value2, "productSeries");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityIsNull() {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityIsNotNull() {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY =", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityNotEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY <>", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityGreaterThan(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY >", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY >=", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityLessThan(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY <", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityLessThanOrEqualTo(Long value) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY <=", value, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityIn(List<Long> values) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY in", values, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityNotIn(List<Long> values) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY not in", values, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityBetween(Long value1, Long value2) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY between", value1, value2, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andAssignedSampleQuantityNotBetween(Long value1, Long value2) {
            addCriterion("ASSIGNED_SAMPLE_QUANTITY not between", value1, value2, "assignedSampleQuantity");
            return (Criteria) this;
        }

        public Criteria andConditionIsNull() {
            addCriterion("CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andConditionIsNotNull() {
            addCriterion("CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEqualTo(String value) {
            addCriterion("CONDITION =", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotEqualTo(String value) {
            addCriterion("CONDITION <>", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThan(String value) {
            addCriterion("CONDITION >", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionGreaterThanOrEqualTo(String value) {
            addCriterion("CONDITION >=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThan(String value) {
            addCriterion("CONDITION <", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLessThanOrEqualTo(String value) {
            addCriterion("CONDITION <=", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionLike(String value) {
            addCriterion("CONDITION like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotLike(String value) {
            addCriterion("CONDITION not like", value, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionIn(List<String> values) {
            addCriterion("CONDITION in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotIn(List<String> values) {
            addCriterion("CONDITION not in", values, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionBetween(String value1, String value2) {
            addCriterion("CONDITION between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andConditionNotBetween(String value1, String value2) {
            addCriterion("CONDITION not between", value1, value2, "condition");
            return (Criteria) this;
        }

        public Criteria andTestGroupIsNull() {
            addCriterion("TEST_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andTestGroupIsNotNull() {
            addCriterion("TEST_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andTestGroupEqualTo(String value) {
            addCriterion("TEST_GROUP =", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotEqualTo(String value) {
            addCriterion("TEST_GROUP <>", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupGreaterThan(String value) {
            addCriterion("TEST_GROUP >", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_GROUP >=", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupLessThan(String value) {
            addCriterion("TEST_GROUP <", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupLessThanOrEqualTo(String value) {
            addCriterion("TEST_GROUP <=", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupLike(String value) {
            addCriterion("TEST_GROUP like", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotLike(String value) {
            addCriterion("TEST_GROUP not like", value, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupIn(List<String> values) {
            addCriterion("TEST_GROUP in", values, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotIn(List<String> values) {
            addCriterion("TEST_GROUP not in", values, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupBetween(String value1, String value2) {
            addCriterion("TEST_GROUP between", value1, value2, "testGroup");
            return (Criteria) this;
        }

        public Criteria andTestGroupNotBetween(String value1, String value2) {
            addCriterion("TEST_GROUP not between", value1, value2, "testGroup");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoIsNull() {
            addCriterion("INST_ARRANGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoIsNotNull() {
            addCriterion("INST_ARRANGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoEqualTo(String value) {
            addCriterion("INST_ARRANGE_NO =", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoNotEqualTo(String value) {
            addCriterion("INST_ARRANGE_NO <>", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoGreaterThan(String value) {
            addCriterion("INST_ARRANGE_NO >", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoGreaterThanOrEqualTo(String value) {
            addCriterion("INST_ARRANGE_NO >=", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoLessThan(String value) {
            addCriterion("INST_ARRANGE_NO <", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoLessThanOrEqualTo(String value) {
            addCriterion("INST_ARRANGE_NO <=", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoLike(String value) {
            addCriterion("INST_ARRANGE_NO like", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoNotLike(String value) {
            addCriterion("INST_ARRANGE_NO not like", value, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoIn(List<String> values) {
            addCriterion("INST_ARRANGE_NO in", values, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoNotIn(List<String> values) {
            addCriterion("INST_ARRANGE_NO not in", values, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoBetween(String value1, String value2) {
            addCriterion("INST_ARRANGE_NO between", value1, value2, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andInstArrangeNoNotBetween(String value1, String value2) {
            addCriterion("INST_ARRANGE_NO not between", value1, value2, "instArrangeNo");
            return (Criteria) this;
        }

        public Criteria andAssginToIsNull() {
            addCriterion("ASSGIN_TO is null");
            return (Criteria) this;
        }

        public Criteria andAssginToIsNotNull() {
            addCriterion("ASSGIN_TO is not null");
            return (Criteria) this;
        }

        public Criteria andAssginToEqualTo(String value) {
            addCriterion("ASSGIN_TO =", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotEqualTo(String value) {
            addCriterion("ASSGIN_TO <>", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToGreaterThan(String value) {
            addCriterion("ASSGIN_TO >", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToGreaterThanOrEqualTo(String value) {
            addCriterion("ASSGIN_TO >=", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToLessThan(String value) {
            addCriterion("ASSGIN_TO <", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToLessThanOrEqualTo(String value) {
            addCriterion("ASSGIN_TO <=", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToLike(String value) {
            addCriterion("ASSGIN_TO like", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotLike(String value) {
            addCriterion("ASSGIN_TO not like", value, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToIn(List<String> values) {
            addCriterion("ASSGIN_TO in", values, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotIn(List<String> values) {
            addCriterion("ASSGIN_TO not in", values, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToBetween(String value1, String value2) {
            addCriterion("ASSGIN_TO between", value1, value2, "assginTo");
            return (Criteria) this;
        }

        public Criteria andAssginToNotBetween(String value1, String value2) {
            addCriterion("ASSGIN_TO not between", value1, value2, "assginTo");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNull() {
            addCriterion("CONCLUSION is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("CONCLUSION is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("CONCLUSION =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("CONCLUSION <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("CONCLUSION >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("CONCLUSION >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("CONCLUSION <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("CONCLUSION <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("CONCLUSION like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("CONCLUSION not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("CONCLUSION in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("CONCLUSION not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("CONCLUSION between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("CONCLUSION not between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNull() {
            addCriterion("DATE_CREATED is null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIsNotNull() {
            addCriterion("DATE_CREATED is not null");
            return (Criteria) this;
        }

        public Criteria andDateCreatedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED =", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED <>", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_CREATED >", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED >=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_CREATED <", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_CREATED <=", value, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_CREATED in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_CREATED not in", values, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_CREATED between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateCreatedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_CREATED not between", value1, value2, "dateCreated");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIsNull() {
            addCriterion("DATE_RECEIVED is null");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIsNotNull() {
            addCriterion("DATE_RECEIVED is not null");
            return (Criteria) this;
        }

        public Criteria andDateReceivedEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED =", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED <>", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED >", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED >=", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedLessThan(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED <", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_RECEIVED <=", value, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RECEIVED in", values, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_RECEIVED not in", values, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RECEIVED between", value1, value2, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andDateReceivedNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_RECEIVED not between", value1, value2, "dateReceived");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateIsNull() {
            addCriterion("PLAN_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateIsNotNull() {
            addCriterion("PLAN_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_START_DATE =", value, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_START_DATE <>", value, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PLAN_START_DATE >", value, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_START_DATE >=", value, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateLessThan(Date value) {
            addCriterionForJDBCDate("PLAN_START_DATE <", value, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_START_DATE <=", value, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_START_DATE in", values, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_START_DATE not in", values, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_START_DATE between", value1, value2, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_START_DATE not between", value1, value2, "planStartDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIsNull() {
            addCriterion("PLAN_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIsNotNull() {
            addCriterion("PLAN_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_END_DATE =", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_END_DATE <>", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PLAN_END_DATE >", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_END_DATE >=", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateLessThan(Date value) {
            addCriterionForJDBCDate("PLAN_END_DATE <", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PLAN_END_DATE <=", value, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_END_DATE in", values, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PLAN_END_DATE not in", values, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_END_DATE between", value1, value2, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andPlanEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PLAN_END_DATE not between", value1, value2, "planEndDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateIsNull() {
            addCriterion("ACTURE_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActureStartDateIsNotNull() {
            addCriterion("ACTURE_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActureStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_START_DATE =", value, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_START_DATE <>", value, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTURE_START_DATE >", value, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_START_DATE >=", value, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateLessThan(Date value) {
            addCriterionForJDBCDate("ACTURE_START_DATE <", value, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_START_DATE <=", value, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACTURE_START_DATE in", values, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTURE_START_DATE not in", values, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTURE_START_DATE between", value1, value2, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andActureStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTURE_START_DATE not between", value1, value2, "actureStartDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateIsNull() {
            addCriterion("PREDICT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateIsNotNull() {
            addCriterion("PREDICT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("PREDICT_END_DATE =", value, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PREDICT_END_DATE <>", value, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("PREDICT_END_DATE >", value, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PREDICT_END_DATE >=", value, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateLessThan(Date value) {
            addCriterionForJDBCDate("PREDICT_END_DATE <", value, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PREDICT_END_DATE <=", value, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("PREDICT_END_DATE in", values, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PREDICT_END_DATE not in", values, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PREDICT_END_DATE between", value1, value2, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andPredictEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PREDICT_END_DATE not between", value1, value2, "predictEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateIsNull() {
            addCriterion("ACTURE_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andActureEndDateIsNotNull() {
            addCriterion("ACTURE_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andActureEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_END_DATE =", value, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_END_DATE <>", value, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("ACTURE_END_DATE >", value, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_END_DATE >=", value, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateLessThan(Date value) {
            addCriterionForJDBCDate("ACTURE_END_DATE <", value, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ACTURE_END_DATE <=", value, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("ACTURE_END_DATE in", values, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("ACTURE_END_DATE not in", values, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTURE_END_DATE between", value1, value2, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andActureEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ACTURE_END_DATE not between", value1, value2, "actureEndDate");
            return (Criteria) this;
        }

        public Criteria andReviewedOnIsNull() {
            addCriterion("REVIEWED_ON is null");
            return (Criteria) this;
        }

        public Criteria andReviewedOnIsNotNull() {
            addCriterion("REVIEWED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andReviewedOnEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON =", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON <>", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON >", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON >=", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnLessThan(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON <", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("REVIEWED_ON <=", value, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnIn(List<Date> values) {
            addCriterionForJDBCDate("REVIEWED_ON in", values, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("REVIEWED_ON not in", values, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REVIEWED_ON between", value1, value2, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andReviewedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("REVIEWED_ON not between", value1, value2, "reviewedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnIsNull() {
            addCriterion("RPT_AUTHORIZED_ON is null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnIsNotNull() {
            addCriterion("RPT_AUTHORIZED_ON is not null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON =", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnNotEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON <>", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnGreaterThan(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON >", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON >=", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnLessThan(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON <", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON <=", value, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnIn(List<Date> values) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON in", values, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnNotIn(List<Date> values) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON not in", values, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON between", value1, value2, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedOnNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RPT_AUTHORIZED_ON not between", value1, value2, "rptAuthorizedOn");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByIsNull() {
            addCriterion("RPT_AUTHORIZED_BY is null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByIsNotNull() {
            addCriterion("RPT_AUTHORIZED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY =", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY <>", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByGreaterThan(String value) {
            addCriterion("RPT_AUTHORIZED_BY >", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY >=", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByLessThan(String value) {
            addCriterion("RPT_AUTHORIZED_BY <", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByLessThanOrEqualTo(String value) {
            addCriterion("RPT_AUTHORIZED_BY <=", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByLike(String value) {
            addCriterion("RPT_AUTHORIZED_BY like", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotLike(String value) {
            addCriterion("RPT_AUTHORIZED_BY not like", value, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByIn(List<String> values) {
            addCriterion("RPT_AUTHORIZED_BY in", values, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotIn(List<String> values) {
            addCriterion("RPT_AUTHORIZED_BY not in", values, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByBetween(String value1, String value2) {
            addCriterion("RPT_AUTHORIZED_BY between", value1, value2, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andRptAuthorizedByNotBetween(String value1, String value2) {
            addCriterion("RPT_AUTHORIZED_BY not between", value1, value2, "rptAuthorizedBy");
            return (Criteria) this;
        }

        public Criteria andQuotesIsNull() {
            addCriterion("QUOTES is null");
            return (Criteria) this;
        }

        public Criteria andQuotesIsNotNull() {
            addCriterion("QUOTES is not null");
            return (Criteria) this;
        }

        public Criteria andQuotesEqualTo(BigDecimal value) {
            addCriterion("QUOTES =", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesNotEqualTo(BigDecimal value) {
            addCriterion("QUOTES <>", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesGreaterThan(BigDecimal value) {
            addCriterion("QUOTES >", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTES >=", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesLessThan(BigDecimal value) {
            addCriterion("QUOTES <", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUOTES <=", value, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesIn(List<BigDecimal> values) {
            addCriterion("QUOTES in", values, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesNotIn(List<BigDecimal> values) {
            addCriterion("QUOTES not in", values, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTES between", value1, value2, "quotes");
            return (Criteria) this;
        }

        public Criteria andQuotesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUOTES not between", value1, value2, "quotes");
            return (Criteria) this;
        }

        public Criteria andActualFeeIsNull() {
            addCriterion("ACTUAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andActualFeeIsNotNull() {
            addCriterion("ACTUAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andActualFeeEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_FEE =", value, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_FEE <>", value, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_FEE >", value, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_FEE >=", value, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeLessThan(BigDecimal value) {
            addCriterion("ACTUAL_FEE <", value, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_FEE <=", value, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_FEE in", values, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_FEE not in", values, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_FEE between", value1, value2, "actualFee");
            return (Criteria) this;
        }

        public Criteria andActualFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_FEE not between", value1, value2, "actualFee");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
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