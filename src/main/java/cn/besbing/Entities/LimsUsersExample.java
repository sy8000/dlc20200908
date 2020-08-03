package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LimsUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LimsUsersExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
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

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailAddrIsNull() {
            addCriterion("EMAIL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andEmailAddrIsNotNull() {
            addCriterion("EMAIL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAddrEqualTo(String value) {
            addCriterion("EMAIL_ADDR =", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotEqualTo(String value) {
            addCriterion("EMAIL_ADDR <>", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrGreaterThan(String value) {
            addCriterion("EMAIL_ADDR >", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADDR >=", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrLessThan(String value) {
            addCriterion("EMAIL_ADDR <", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADDR <=", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrLike(String value) {
            addCriterion("EMAIL_ADDR like", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotLike(String value) {
            addCriterion("EMAIL_ADDR not like", value, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrIn(List<String> values) {
            addCriterion("EMAIL_ADDR in", values, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotIn(List<String> values) {
            addCriterion("EMAIL_ADDR not in", values, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrBetween(String value1, String value2) {
            addCriterion("EMAIL_ADDR between", value1, value2, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andEmailAddrNotBetween(String value1, String value2) {
            addCriterion("EMAIL_ADDR not between", value1, value2, "emailAddr");
            return (Criteria) this;
        }

        public Criteria andLabIsNull() {
            addCriterion("LAB is null");
            return (Criteria) this;
        }

        public Criteria andLabIsNotNull() {
            addCriterion("LAB is not null");
            return (Criteria) this;
        }

        public Criteria andLabEqualTo(String value) {
            addCriterion("LAB =", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotEqualTo(String value) {
            addCriterion("LAB <>", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabGreaterThan(String value) {
            addCriterion("LAB >", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabGreaterThanOrEqualTo(String value) {
            addCriterion("LAB >=", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLessThan(String value) {
            addCriterion("LAB <", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLessThanOrEqualTo(String value) {
            addCriterion("LAB <=", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabLike(String value) {
            addCriterion("LAB like", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotLike(String value) {
            addCriterion("LAB not like", value, "lab");
            return (Criteria) this;
        }

        public Criteria andLabIn(List<String> values) {
            addCriterion("LAB in", values, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotIn(List<String> values) {
            addCriterion("LAB not in", values, "lab");
            return (Criteria) this;
        }

        public Criteria andLabBetween(String value1, String value2) {
            addCriterion("LAB between", value1, value2, "lab");
            return (Criteria) this;
        }

        public Criteria andLabNotBetween(String value1, String value2) {
            addCriterion("LAB not between", value1, value2, "lab");
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

        public Criteria andDefaultWorkflowIsNull() {
            addCriterion("DEFAULT_WORKFLOW is null");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowIsNotNull() {
            addCriterion("DEFAULT_WORKFLOW is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowEqualTo(String value) {
            addCriterion("DEFAULT_WORKFLOW =", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowNotEqualTo(String value) {
            addCriterion("DEFAULT_WORKFLOW <>", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowGreaterThan(String value) {
            addCriterion("DEFAULT_WORKFLOW >", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowGreaterThanOrEqualTo(String value) {
            addCriterion("DEFAULT_WORKFLOW >=", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowLessThan(String value) {
            addCriterion("DEFAULT_WORKFLOW <", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowLessThanOrEqualTo(String value) {
            addCriterion("DEFAULT_WORKFLOW <=", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowLike(String value) {
            addCriterion("DEFAULT_WORKFLOW like", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowNotLike(String value) {
            addCriterion("DEFAULT_WORKFLOW not like", value, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowIn(List<String> values) {
            addCriterion("DEFAULT_WORKFLOW in", values, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowNotIn(List<String> values) {
            addCriterion("DEFAULT_WORKFLOW not in", values, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowBetween(String value1, String value2) {
            addCriterion("DEFAULT_WORKFLOW between", value1, value2, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andDefaultWorkflowNotBetween(String value1, String value2) {
            addCriterion("DEFAULT_WORKFLOW not between", value1, value2, "defaultWorkflow");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixIsNull() {
            addCriterion("LANGUAGE_PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixIsNotNull() {
            addCriterion("LANGUAGE_PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixEqualTo(String value) {
            addCriterion("LANGUAGE_PREFIX =", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixNotEqualTo(String value) {
            addCriterion("LANGUAGE_PREFIX <>", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixGreaterThan(String value) {
            addCriterion("LANGUAGE_PREFIX >", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE_PREFIX >=", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixLessThan(String value) {
            addCriterion("LANGUAGE_PREFIX <", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE_PREFIX <=", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixLike(String value) {
            addCriterion("LANGUAGE_PREFIX like", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixNotLike(String value) {
            addCriterion("LANGUAGE_PREFIX not like", value, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixIn(List<String> values) {
            addCriterion("LANGUAGE_PREFIX in", values, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixNotIn(List<String> values) {
            addCriterion("LANGUAGE_PREFIX not in", values, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixBetween(String value1, String value2) {
            addCriterion("LANGUAGE_PREFIX between", value1, value2, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andLanguagePrefixNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE_PREFIX not between", value1, value2, "languagePrefix");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetIsNull() {
            addCriterion("GMT_OFFSET is null");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetIsNotNull() {
            addCriterion("GMT_OFFSET is not null");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetEqualTo(Long value) {
            addCriterion("GMT_OFFSET =", value, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetNotEqualTo(Long value) {
            addCriterion("GMT_OFFSET <>", value, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetGreaterThan(Long value) {
            addCriterion("GMT_OFFSET >", value, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetGreaterThanOrEqualTo(Long value) {
            addCriterion("GMT_OFFSET >=", value, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetLessThan(Long value) {
            addCriterion("GMT_OFFSET <", value, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetLessThanOrEqualTo(Long value) {
            addCriterion("GMT_OFFSET <=", value, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetIn(List<Long> values) {
            addCriterion("GMT_OFFSET in", values, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetNotIn(List<Long> values) {
            addCriterion("GMT_OFFSET not in", values, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetBetween(Long value1, Long value2) {
            addCriterion("GMT_OFFSET between", value1, value2, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andGmtOffsetNotBetween(Long value1, Long value2) {
            addCriterion("GMT_OFFSET not between", value1, value2, "gmtOffset");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsIsNull() {
            addCriterion("DAYLIGHT_SAVINGS is null");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsIsNotNull() {
            addCriterion("DAYLIGHT_SAVINGS is not null");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsEqualTo(String value) {
            addCriterion("DAYLIGHT_SAVINGS =", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsNotEqualTo(String value) {
            addCriterion("DAYLIGHT_SAVINGS <>", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsGreaterThan(String value) {
            addCriterion("DAYLIGHT_SAVINGS >", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsGreaterThanOrEqualTo(String value) {
            addCriterion("DAYLIGHT_SAVINGS >=", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsLessThan(String value) {
            addCriterion("DAYLIGHT_SAVINGS <", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsLessThanOrEqualTo(String value) {
            addCriterion("DAYLIGHT_SAVINGS <=", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsLike(String value) {
            addCriterion("DAYLIGHT_SAVINGS like", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsNotLike(String value) {
            addCriterion("DAYLIGHT_SAVINGS not like", value, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsIn(List<String> values) {
            addCriterion("DAYLIGHT_SAVINGS in", values, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsNotIn(List<String> values) {
            addCriterion("DAYLIGHT_SAVINGS not in", values, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsBetween(String value1, String value2) {
            addCriterion("DAYLIGHT_SAVINGS between", value1, value2, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andDaylightSavingsNotBetween(String value1, String value2) {
            addCriterion("DAYLIGHT_SAVINGS not between", value1, value2, "daylightSavings");
            return (Criteria) this;
        }

        public Criteria andUsesRolesIsNull() {
            addCriterion("USES_ROLES is null");
            return (Criteria) this;
        }

        public Criteria andUsesRolesIsNotNull() {
            addCriterion("USES_ROLES is not null");
            return (Criteria) this;
        }

        public Criteria andUsesRolesEqualTo(String value) {
            addCriterion("USES_ROLES =", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesNotEqualTo(String value) {
            addCriterion("USES_ROLES <>", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesGreaterThan(String value) {
            addCriterion("USES_ROLES >", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesGreaterThanOrEqualTo(String value) {
            addCriterion("USES_ROLES >=", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesLessThan(String value) {
            addCriterion("USES_ROLES <", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesLessThanOrEqualTo(String value) {
            addCriterion("USES_ROLES <=", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesLike(String value) {
            addCriterion("USES_ROLES like", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesNotLike(String value) {
            addCriterion("USES_ROLES not like", value, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesIn(List<String> values) {
            addCriterion("USES_ROLES in", values, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesNotIn(List<String> values) {
            addCriterion("USES_ROLES not in", values, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesBetween(String value1, String value2) {
            addCriterion("USES_ROLES between", value1, value2, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andUsesRolesNotBetween(String value1, String value2) {
            addCriterion("USES_ROLES not between", value1, value2, "usesRoles");
            return (Criteria) this;
        }

        public Criteria andIsRoleIsNull() {
            addCriterion("IS_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andIsRoleIsNotNull() {
            addCriterion("IS_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsRoleEqualTo(String value) {
            addCriterion("IS_ROLE =", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleNotEqualTo(String value) {
            addCriterion("IS_ROLE <>", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleGreaterThan(String value) {
            addCriterion("IS_ROLE >", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ROLE >=", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleLessThan(String value) {
            addCriterion("IS_ROLE <", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleLessThanOrEqualTo(String value) {
            addCriterion("IS_ROLE <=", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleLike(String value) {
            addCriterion("IS_ROLE like", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleNotLike(String value) {
            addCriterion("IS_ROLE not like", value, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleIn(List<String> values) {
            addCriterion("IS_ROLE in", values, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleNotIn(List<String> values) {
            addCriterion("IS_ROLE not in", values, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleBetween(String value1, String value2) {
            addCriterion("IS_ROLE between", value1, value2, "isRole");
            return (Criteria) this;
        }

        public Criteria andIsRoleNotBetween(String value1, String value2) {
            addCriterion("IS_ROLE not between", value1, value2, "isRole");
            return (Criteria) this;
        }

        public Criteria andUserDisabledIsNull() {
            addCriterion("USER_DISABLED is null");
            return (Criteria) this;
        }

        public Criteria andUserDisabledIsNotNull() {
            addCriterion("USER_DISABLED is not null");
            return (Criteria) this;
        }

        public Criteria andUserDisabledEqualTo(String value) {
            addCriterion("USER_DISABLED =", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledNotEqualTo(String value) {
            addCriterion("USER_DISABLED <>", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledGreaterThan(String value) {
            addCriterion("USER_DISABLED >", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DISABLED >=", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledLessThan(String value) {
            addCriterion("USER_DISABLED <", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledLessThanOrEqualTo(String value) {
            addCriterion("USER_DISABLED <=", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledLike(String value) {
            addCriterion("USER_DISABLED like", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledNotLike(String value) {
            addCriterion("USER_DISABLED not like", value, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledIn(List<String> values) {
            addCriterion("USER_DISABLED in", values, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledNotIn(List<String> values) {
            addCriterion("USER_DISABLED not in", values, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledBetween(String value1, String value2) {
            addCriterion("USER_DISABLED between", value1, value2, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andUserDisabledNotBetween(String value1, String value2) {
            addCriterion("USER_DISABLED not between", value1, value2, "userDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledIsNull() {
            addCriterion("DATE_DISABLED is null");
            return (Criteria) this;
        }

        public Criteria andDateDisabledIsNotNull() {
            addCriterion("DATE_DISABLED is not null");
            return (Criteria) this;
        }

        public Criteria andDateDisabledEqualTo(Date value) {
            addCriterion("DATE_DISABLED =", value, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledNotEqualTo(Date value) {
            addCriterion("DATE_DISABLED <>", value, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledGreaterThan(Date value) {
            addCriterion("DATE_DISABLED >", value, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_DISABLED >=", value, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledLessThan(Date value) {
            addCriterion("DATE_DISABLED <", value, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledLessThanOrEqualTo(Date value) {
            addCriterion("DATE_DISABLED <=", value, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledIn(List<Date> values) {
            addCriterion("DATE_DISABLED in", values, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledNotIn(List<Date> values) {
            addCriterion("DATE_DISABLED not in", values, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledBetween(Date value1, Date value2) {
            addCriterion("DATE_DISABLED between", value1, value2, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andDateDisabledNotBetween(Date value1, Date value2) {
            addCriterion("DATE_DISABLED not between", value1, value2, "dateDisabled");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNull() {
            addCriterion("INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andIntervalIsNotNull() {
            addCriterion("INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andIntervalEqualTo(Long value) {
            addCriterion("INTERVAL =", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotEqualTo(Long value) {
            addCriterion("INTERVAL <>", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThan(Long value) {
            addCriterion("INTERVAL >", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("INTERVAL >=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThan(Long value) {
            addCriterion("INTERVAL <", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalLessThanOrEqualTo(Long value) {
            addCriterion("INTERVAL <=", value, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalIn(List<Long> values) {
            addCriterion("INTERVAL in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotIn(List<Long> values) {
            addCriterion("INTERVAL not in", values, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalBetween(Long value1, Long value2) {
            addCriterion("INTERVAL between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andIntervalNotBetween(Long value1, Long value2) {
            addCriterion("INTERVAL not between", value1, value2, "interval");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleIsNull() {
            addCriterion("HOLIDAY_SCHEDULE is null");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleIsNotNull() {
            addCriterion("HOLIDAY_SCHEDULE is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleEqualTo(String value) {
            addCriterion("HOLIDAY_SCHEDULE =", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleNotEqualTo(String value) {
            addCriterion("HOLIDAY_SCHEDULE <>", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleGreaterThan(String value) {
            addCriterion("HOLIDAY_SCHEDULE >", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("HOLIDAY_SCHEDULE >=", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleLessThan(String value) {
            addCriterion("HOLIDAY_SCHEDULE <", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleLessThanOrEqualTo(String value) {
            addCriterion("HOLIDAY_SCHEDULE <=", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleLike(String value) {
            addCriterion("HOLIDAY_SCHEDULE like", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleNotLike(String value) {
            addCriterion("HOLIDAY_SCHEDULE not like", value, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleIn(List<String> values) {
            addCriterion("HOLIDAY_SCHEDULE in", values, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleNotIn(List<String> values) {
            addCriterion("HOLIDAY_SCHEDULE not in", values, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleBetween(String value1, String value2) {
            addCriterion("HOLIDAY_SCHEDULE between", value1, value2, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andHolidayScheduleNotBetween(String value1, String value2) {
            addCriterion("HOLIDAY_SCHEDULE not between", value1, value2, "holidaySchedule");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempIsNull() {
            addCriterion("USE_CUSTOMER_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempIsNotNull() {
            addCriterion("USE_CUSTOMER_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempEqualTo(String value) {
            addCriterion("USE_CUSTOMER_TEMP =", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempNotEqualTo(String value) {
            addCriterion("USE_CUSTOMER_TEMP <>", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempGreaterThan(String value) {
            addCriterion("USE_CUSTOMER_TEMP >", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempGreaterThanOrEqualTo(String value) {
            addCriterion("USE_CUSTOMER_TEMP >=", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempLessThan(String value) {
            addCriterion("USE_CUSTOMER_TEMP <", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempLessThanOrEqualTo(String value) {
            addCriterion("USE_CUSTOMER_TEMP <=", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempLike(String value) {
            addCriterion("USE_CUSTOMER_TEMP like", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempNotLike(String value) {
            addCriterion("USE_CUSTOMER_TEMP not like", value, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempIn(List<String> values) {
            addCriterion("USE_CUSTOMER_TEMP in", values, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempNotIn(List<String> values) {
            addCriterion("USE_CUSTOMER_TEMP not in", values, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempBetween(String value1, String value2) {
            addCriterion("USE_CUSTOMER_TEMP between", value1, value2, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andUseCustomerTempNotBetween(String value1, String value2) {
            addCriterion("USE_CUSTOMER_TEMP not between", value1, value2, "useCustomerTemp");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintIsNull() {
            addCriterion("SAMPLE_CONSTRAINT is null");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintIsNotNull() {
            addCriterion("SAMPLE_CONSTRAINT is not null");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintEqualTo(String value) {
            addCriterion("SAMPLE_CONSTRAINT =", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintNotEqualTo(String value) {
            addCriterion("SAMPLE_CONSTRAINT <>", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintGreaterThan(String value) {
            addCriterion("SAMPLE_CONSTRAINT >", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CONSTRAINT >=", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintLessThan(String value) {
            addCriterion("SAMPLE_CONSTRAINT <", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_CONSTRAINT <=", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintLike(String value) {
            addCriterion("SAMPLE_CONSTRAINT like", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintNotLike(String value) {
            addCriterion("SAMPLE_CONSTRAINT not like", value, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintIn(List<String> values) {
            addCriterion("SAMPLE_CONSTRAINT in", values, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintNotIn(List<String> values) {
            addCriterion("SAMPLE_CONSTRAINT not in", values, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintBetween(String value1, String value2) {
            addCriterion("SAMPLE_CONSTRAINT between", value1, value2, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleConstraintNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_CONSTRAINT not between", value1, value2, "sampleConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintIsNull() {
            addCriterion("TEST_CONSTRAINT is null");
            return (Criteria) this;
        }

        public Criteria andTestConstraintIsNotNull() {
            addCriterion("TEST_CONSTRAINT is not null");
            return (Criteria) this;
        }

        public Criteria andTestConstraintEqualTo(String value) {
            addCriterion("TEST_CONSTRAINT =", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintNotEqualTo(String value) {
            addCriterion("TEST_CONSTRAINT <>", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintGreaterThan(String value) {
            addCriterion("TEST_CONSTRAINT >", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_CONSTRAINT >=", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintLessThan(String value) {
            addCriterion("TEST_CONSTRAINT <", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintLessThanOrEqualTo(String value) {
            addCriterion("TEST_CONSTRAINT <=", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintLike(String value) {
            addCriterion("TEST_CONSTRAINT like", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintNotLike(String value) {
            addCriterion("TEST_CONSTRAINT not like", value, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintIn(List<String> values) {
            addCriterion("TEST_CONSTRAINT in", values, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintNotIn(List<String> values) {
            addCriterion("TEST_CONSTRAINT not in", values, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintBetween(String value1, String value2) {
            addCriterion("TEST_CONSTRAINT between", value1, value2, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andTestConstraintNotBetween(String value1, String value2) {
            addCriterion("TEST_CONSTRAINT not between", value1, value2, "testConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintIsNull() {
            addCriterion("RESULT_CONSTRAINT is null");
            return (Criteria) this;
        }

        public Criteria andResultConstraintIsNotNull() {
            addCriterion("RESULT_CONSTRAINT is not null");
            return (Criteria) this;
        }

        public Criteria andResultConstraintEqualTo(String value) {
            addCriterion("RESULT_CONSTRAINT =", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintNotEqualTo(String value) {
            addCriterion("RESULT_CONSTRAINT <>", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintGreaterThan(String value) {
            addCriterion("RESULT_CONSTRAINT >", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT_CONSTRAINT >=", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintLessThan(String value) {
            addCriterion("RESULT_CONSTRAINT <", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintLessThanOrEqualTo(String value) {
            addCriterion("RESULT_CONSTRAINT <=", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintLike(String value) {
            addCriterion("RESULT_CONSTRAINT like", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintNotLike(String value) {
            addCriterion("RESULT_CONSTRAINT not like", value, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintIn(List<String> values) {
            addCriterion("RESULT_CONSTRAINT in", values, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintNotIn(List<String> values) {
            addCriterion("RESULT_CONSTRAINT not in", values, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintBetween(String value1, String value2) {
            addCriterion("RESULT_CONSTRAINT between", value1, value2, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andResultConstraintNotBetween(String value1, String value2) {
            addCriterion("RESULT_CONSTRAINT not between", value1, value2, "resultConstraint");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsIsNull() {
            addCriterion("SAMPLE_DISP_FLDS is null");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsIsNotNull() {
            addCriterion("SAMPLE_DISP_FLDS is not null");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsEqualTo(String value) {
            addCriterion("SAMPLE_DISP_FLDS =", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsNotEqualTo(String value) {
            addCriterion("SAMPLE_DISP_FLDS <>", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsGreaterThan(String value) {
            addCriterion("SAMPLE_DISP_FLDS >", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_DISP_FLDS >=", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsLessThan(String value) {
            addCriterion("SAMPLE_DISP_FLDS <", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_DISP_FLDS <=", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsLike(String value) {
            addCriterion("SAMPLE_DISP_FLDS like", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsNotLike(String value) {
            addCriterion("SAMPLE_DISP_FLDS not like", value, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsIn(List<String> values) {
            addCriterion("SAMPLE_DISP_FLDS in", values, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsNotIn(List<String> values) {
            addCriterion("SAMPLE_DISP_FLDS not in", values, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsBetween(String value1, String value2) {
            addCriterion("SAMPLE_DISP_FLDS between", value1, value2, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andSampleDispFldsNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_DISP_FLDS not between", value1, value2, "sampleDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsIsNull() {
            addCriterion("TEST_DISP_FLDS is null");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsIsNotNull() {
            addCriterion("TEST_DISP_FLDS is not null");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsEqualTo(String value) {
            addCriterion("TEST_DISP_FLDS =", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsNotEqualTo(String value) {
            addCriterion("TEST_DISP_FLDS <>", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsGreaterThan(String value) {
            addCriterion("TEST_DISP_FLDS >", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_DISP_FLDS >=", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsLessThan(String value) {
            addCriterion("TEST_DISP_FLDS <", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsLessThanOrEqualTo(String value) {
            addCriterion("TEST_DISP_FLDS <=", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsLike(String value) {
            addCriterion("TEST_DISP_FLDS like", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsNotLike(String value) {
            addCriterion("TEST_DISP_FLDS not like", value, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsIn(List<String> values) {
            addCriterion("TEST_DISP_FLDS in", values, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsNotIn(List<String> values) {
            addCriterion("TEST_DISP_FLDS not in", values, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsBetween(String value1, String value2) {
            addCriterion("TEST_DISP_FLDS between", value1, value2, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andTestDispFldsNotBetween(String value1, String value2) {
            addCriterion("TEST_DISP_FLDS not between", value1, value2, "testDispFlds");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowIsNull() {
            addCriterion("OPEN_MSG_WINDOW is null");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowIsNotNull() {
            addCriterion("OPEN_MSG_WINDOW is not null");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowEqualTo(String value) {
            addCriterion("OPEN_MSG_WINDOW =", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowNotEqualTo(String value) {
            addCriterion("OPEN_MSG_WINDOW <>", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowGreaterThan(String value) {
            addCriterion("OPEN_MSG_WINDOW >", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowGreaterThanOrEqualTo(String value) {
            addCriterion("OPEN_MSG_WINDOW >=", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowLessThan(String value) {
            addCriterion("OPEN_MSG_WINDOW <", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowLessThanOrEqualTo(String value) {
            addCriterion("OPEN_MSG_WINDOW <=", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowLike(String value) {
            addCriterion("OPEN_MSG_WINDOW like", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowNotLike(String value) {
            addCriterion("OPEN_MSG_WINDOW not like", value, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowIn(List<String> values) {
            addCriterion("OPEN_MSG_WINDOW in", values, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowNotIn(List<String> values) {
            addCriterion("OPEN_MSG_WINDOW not in", values, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowBetween(String value1, String value2) {
            addCriterion("OPEN_MSG_WINDOW between", value1, value2, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andOpenMsgWindowNotBetween(String value1, String value2) {
            addCriterion("OPEN_MSG_WINDOW not between", value1, value2, "openMsgWindow");
            return (Criteria) this;
        }

        public Criteria andLdapUidIsNull() {
            addCriterion("LDAP_UID is null");
            return (Criteria) this;
        }

        public Criteria andLdapUidIsNotNull() {
            addCriterion("LDAP_UID is not null");
            return (Criteria) this;
        }

        public Criteria andLdapUidEqualTo(String value) {
            addCriterion("LDAP_UID =", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidNotEqualTo(String value) {
            addCriterion("LDAP_UID <>", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidGreaterThan(String value) {
            addCriterion("LDAP_UID >", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidGreaterThanOrEqualTo(String value) {
            addCriterion("LDAP_UID >=", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidLessThan(String value) {
            addCriterion("LDAP_UID <", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidLessThanOrEqualTo(String value) {
            addCriterion("LDAP_UID <=", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidLike(String value) {
            addCriterion("LDAP_UID like", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidNotLike(String value) {
            addCriterion("LDAP_UID not like", value, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidIn(List<String> values) {
            addCriterion("LDAP_UID in", values, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidNotIn(List<String> values) {
            addCriterion("LDAP_UID not in", values, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidBetween(String value1, String value2) {
            addCriterion("LDAP_UID between", value1, value2, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapUidNotBetween(String value1, String value2) {
            addCriterion("LDAP_UID not between", value1, value2, "ldapUid");
            return (Criteria) this;
        }

        public Criteria andLdapServerIsNull() {
            addCriterion("LDAP_SERVER is null");
            return (Criteria) this;
        }

        public Criteria andLdapServerIsNotNull() {
            addCriterion("LDAP_SERVER is not null");
            return (Criteria) this;
        }

        public Criteria andLdapServerEqualTo(String value) {
            addCriterion("LDAP_SERVER =", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerNotEqualTo(String value) {
            addCriterion("LDAP_SERVER <>", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerGreaterThan(String value) {
            addCriterion("LDAP_SERVER >", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerGreaterThanOrEqualTo(String value) {
            addCriterion("LDAP_SERVER >=", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerLessThan(String value) {
            addCriterion("LDAP_SERVER <", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerLessThanOrEqualTo(String value) {
            addCriterion("LDAP_SERVER <=", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerLike(String value) {
            addCriterion("LDAP_SERVER like", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerNotLike(String value) {
            addCriterion("LDAP_SERVER not like", value, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerIn(List<String> values) {
            addCriterion("LDAP_SERVER in", values, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerNotIn(List<String> values) {
            addCriterion("LDAP_SERVER not in", values, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerBetween(String value1, String value2) {
            addCriterion("LDAP_SERVER between", value1, value2, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andLdapServerNotBetween(String value1, String value2) {
            addCriterion("LDAP_SERVER not between", value1, value2, "ldapServer");
            return (Criteria) this;
        }

        public Criteria andSampleFilterIsNull() {
            addCriterion("SAMPLE_FILTER is null");
            return (Criteria) this;
        }

        public Criteria andSampleFilterIsNotNull() {
            addCriterion("SAMPLE_FILTER is not null");
            return (Criteria) this;
        }

        public Criteria andSampleFilterEqualTo(String value) {
            addCriterion("SAMPLE_FILTER =", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterNotEqualTo(String value) {
            addCriterion("SAMPLE_FILTER <>", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterGreaterThan(String value) {
            addCriterion("SAMPLE_FILTER >", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_FILTER >=", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterLessThan(String value) {
            addCriterion("SAMPLE_FILTER <", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_FILTER <=", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterLike(String value) {
            addCriterion("SAMPLE_FILTER like", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterNotLike(String value) {
            addCriterion("SAMPLE_FILTER not like", value, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterIn(List<String> values) {
            addCriterion("SAMPLE_FILTER in", values, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterNotIn(List<String> values) {
            addCriterion("SAMPLE_FILTER not in", values, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterBetween(String value1, String value2) {
            addCriterion("SAMPLE_FILTER between", value1, value2, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andSampleFilterNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_FILTER not between", value1, value2, "sampleFilter");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdIsNull() {
            addCriterion("BROWSE_FILTER_REQD is null");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdIsNotNull() {
            addCriterion("BROWSE_FILTER_REQD is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdEqualTo(String value) {
            addCriterion("BROWSE_FILTER_REQD =", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdNotEqualTo(String value) {
            addCriterion("BROWSE_FILTER_REQD <>", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdGreaterThan(String value) {
            addCriterion("BROWSE_FILTER_REQD >", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSE_FILTER_REQD >=", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdLessThan(String value) {
            addCriterion("BROWSE_FILTER_REQD <", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdLessThanOrEqualTo(String value) {
            addCriterion("BROWSE_FILTER_REQD <=", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdLike(String value) {
            addCriterion("BROWSE_FILTER_REQD like", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdNotLike(String value) {
            addCriterion("BROWSE_FILTER_REQD not like", value, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdIn(List<String> values) {
            addCriterion("BROWSE_FILTER_REQD in", values, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdNotIn(List<String> values) {
            addCriterion("BROWSE_FILTER_REQD not in", values, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdBetween(String value1, String value2) {
            addCriterion("BROWSE_FILTER_REQD between", value1, value2, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andBrowseFilterReqdNotBetween(String value1, String value2) {
            addCriterion("BROWSE_FILTER_REQD not between", value1, value2, "browseFilterReqd");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalIsNull() {
            addCriterion("TIMEOUT_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalIsNotNull() {
            addCriterion("TIMEOUT_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalEqualTo(Long value) {
            addCriterion("TIMEOUT_INTERVAL =", value, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalNotEqualTo(Long value) {
            addCriterion("TIMEOUT_INTERVAL <>", value, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalGreaterThan(Long value) {
            addCriterion("TIMEOUT_INTERVAL >", value, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMEOUT_INTERVAL >=", value, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalLessThan(Long value) {
            addCriterion("TIMEOUT_INTERVAL <", value, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalLessThanOrEqualTo(Long value) {
            addCriterion("TIMEOUT_INTERVAL <=", value, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalIn(List<Long> values) {
            addCriterion("TIMEOUT_INTERVAL in", values, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalNotIn(List<Long> values) {
            addCriterion("TIMEOUT_INTERVAL not in", values, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalBetween(Long value1, Long value2) {
            addCriterion("TIMEOUT_INTERVAL between", value1, value2, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andTimeoutIntervalNotBetween(Long value1, Long value2) {
            addCriterion("TIMEOUT_INTERVAL not between", value1, value2, "timeoutInterval");
            return (Criteria) this;
        }

        public Criteria andCloseLinkIsNull() {
            addCriterion("CLOSE_LINK is null");
            return (Criteria) this;
        }

        public Criteria andCloseLinkIsNotNull() {
            addCriterion("CLOSE_LINK is not null");
            return (Criteria) this;
        }

        public Criteria andCloseLinkEqualTo(String value) {
            addCriterion("CLOSE_LINK =", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkNotEqualTo(String value) {
            addCriterion("CLOSE_LINK <>", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkGreaterThan(String value) {
            addCriterion("CLOSE_LINK >", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkGreaterThanOrEqualTo(String value) {
            addCriterion("CLOSE_LINK >=", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkLessThan(String value) {
            addCriterion("CLOSE_LINK <", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkLessThanOrEqualTo(String value) {
            addCriterion("CLOSE_LINK <=", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkLike(String value) {
            addCriterion("CLOSE_LINK like", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkNotLike(String value) {
            addCriterion("CLOSE_LINK not like", value, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkIn(List<String> values) {
            addCriterion("CLOSE_LINK in", values, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkNotIn(List<String> values) {
            addCriterion("CLOSE_LINK not in", values, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkBetween(String value1, String value2) {
            addCriterion("CLOSE_LINK between", value1, value2, "closeLink");
            return (Criteria) this;
        }

        public Criteria andCloseLinkNotBetween(String value1, String value2) {
            addCriterion("CLOSE_LINK not between", value1, value2, "closeLink");
            return (Criteria) this;
        }

        public Criteria andSignatureFileIsNull() {
            addCriterion("SIGNATURE_FILE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureFileIsNotNull() {
            addCriterion("SIGNATURE_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureFileEqualTo(String value) {
            addCriterion("SIGNATURE_FILE =", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileNotEqualTo(String value) {
            addCriterion("SIGNATURE_FILE <>", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileGreaterThan(String value) {
            addCriterion("SIGNATURE_FILE >", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_FILE >=", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileLessThan(String value) {
            addCriterion("SIGNATURE_FILE <", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_FILE <=", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileLike(String value) {
            addCriterion("SIGNATURE_FILE like", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileNotLike(String value) {
            addCriterion("SIGNATURE_FILE not like", value, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileIn(List<String> values) {
            addCriterion("SIGNATURE_FILE in", values, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileNotIn(List<String> values) {
            addCriterion("SIGNATURE_FILE not in", values, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileBetween(String value1, String value2) {
            addCriterion("SIGNATURE_FILE between", value1, value2, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andSignatureFileNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE_FILE not between", value1, value2, "signatureFile");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutIsNull() {
            addCriterion("LOCK_ON_TIMEOUT is null");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutIsNotNull() {
            addCriterion("LOCK_ON_TIMEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutEqualTo(String value) {
            addCriterion("LOCK_ON_TIMEOUT =", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutNotEqualTo(String value) {
            addCriterion("LOCK_ON_TIMEOUT <>", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutGreaterThan(String value) {
            addCriterion("LOCK_ON_TIMEOUT >", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_ON_TIMEOUT >=", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutLessThan(String value) {
            addCriterion("LOCK_ON_TIMEOUT <", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutLessThanOrEqualTo(String value) {
            addCriterion("LOCK_ON_TIMEOUT <=", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutLike(String value) {
            addCriterion("LOCK_ON_TIMEOUT like", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutNotLike(String value) {
            addCriterion("LOCK_ON_TIMEOUT not like", value, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutIn(List<String> values) {
            addCriterion("LOCK_ON_TIMEOUT in", values, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutNotIn(List<String> values) {
            addCriterion("LOCK_ON_TIMEOUT not in", values, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutBetween(String value1, String value2) {
            addCriterion("LOCK_ON_TIMEOUT between", value1, value2, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockOnTimeoutNotBetween(String value1, String value2) {
            addCriterion("LOCK_ON_TIMEOUT not between", value1, value2, "lockOnTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutIsNull() {
            addCriterion("LOCK_TIMEOUT is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutIsNotNull() {
            addCriterion("LOCK_TIMEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutEqualTo(Long value) {
            addCriterion("LOCK_TIMEOUT =", value, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutNotEqualTo(Long value) {
            addCriterion("LOCK_TIMEOUT <>", value, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutGreaterThan(Long value) {
            addCriterion("LOCK_TIMEOUT >", value, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutGreaterThanOrEqualTo(Long value) {
            addCriterion("LOCK_TIMEOUT >=", value, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutLessThan(Long value) {
            addCriterion("LOCK_TIMEOUT <", value, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutLessThanOrEqualTo(Long value) {
            addCriterion("LOCK_TIMEOUT <=", value, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutIn(List<Long> values) {
            addCriterion("LOCK_TIMEOUT in", values, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutNotIn(List<Long> values) {
            addCriterion("LOCK_TIMEOUT not in", values, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutBetween(Long value1, Long value2) {
            addCriterion("LOCK_TIMEOUT between", value1, value2, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andLockTimeoutNotBetween(Long value1, Long value2) {
            addCriterion("LOCK_TIMEOUT not between", value1, value2, "lockTimeout");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseIsNull() {
            addCriterion("ALLOCATE_LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseIsNotNull() {
            addCriterion("ALLOCATE_LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseEqualTo(String value) {
            addCriterion("ALLOCATE_LICENSE =", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseNotEqualTo(String value) {
            addCriterion("ALLOCATE_LICENSE <>", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseGreaterThan(String value) {
            addCriterion("ALLOCATE_LICENSE >", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOCATE_LICENSE >=", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseLessThan(String value) {
            addCriterion("ALLOCATE_LICENSE <", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseLessThanOrEqualTo(String value) {
            addCriterion("ALLOCATE_LICENSE <=", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseLike(String value) {
            addCriterion("ALLOCATE_LICENSE like", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseNotLike(String value) {
            addCriterion("ALLOCATE_LICENSE not like", value, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseIn(List<String> values) {
            addCriterion("ALLOCATE_LICENSE in", values, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseNotIn(List<String> values) {
            addCriterion("ALLOCATE_LICENSE not in", values, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseBetween(String value1, String value2) {
            addCriterion("ALLOCATE_LICENSE between", value1, value2, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andAllocateLicenseNotBetween(String value1, String value2) {
            addCriterion("ALLOCATE_LICENSE not between", value1, value2, "allocateLicense");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseIsNull() {
            addCriterion("RESTRICTED_USE is null");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseIsNotNull() {
            addCriterion("RESTRICTED_USE is not null");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseEqualTo(String value) {
            addCriterion("RESTRICTED_USE =", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseNotEqualTo(String value) {
            addCriterion("RESTRICTED_USE <>", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseGreaterThan(String value) {
            addCriterion("RESTRICTED_USE >", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseGreaterThanOrEqualTo(String value) {
            addCriterion("RESTRICTED_USE >=", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseLessThan(String value) {
            addCriterion("RESTRICTED_USE <", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseLessThanOrEqualTo(String value) {
            addCriterion("RESTRICTED_USE <=", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseLike(String value) {
            addCriterion("RESTRICTED_USE like", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseNotLike(String value) {
            addCriterion("RESTRICTED_USE not like", value, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseIn(List<String> values) {
            addCriterion("RESTRICTED_USE in", values, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseNotIn(List<String> values) {
            addCriterion("RESTRICTED_USE not in", values, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseBetween(String value1, String value2) {
            addCriterion("RESTRICTED_USE between", value1, value2, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andRestrictedUseNotBetween(String value1, String value2) {
            addCriterion("RESTRICTED_USE not between", value1, value2, "restrictedUse");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileIsNull() {
            addCriterion("SELF_SIGN_FILE is null");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileIsNotNull() {
            addCriterion("SELF_SIGN_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileEqualTo(String value) {
            addCriterion("SELF_SIGN_FILE =", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileNotEqualTo(String value) {
            addCriterion("SELF_SIGN_FILE <>", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileGreaterThan(String value) {
            addCriterion("SELF_SIGN_FILE >", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_SIGN_FILE >=", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileLessThan(String value) {
            addCriterion("SELF_SIGN_FILE <", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileLessThanOrEqualTo(String value) {
            addCriterion("SELF_SIGN_FILE <=", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileLike(String value) {
            addCriterion("SELF_SIGN_FILE like", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileNotLike(String value) {
            addCriterion("SELF_SIGN_FILE not like", value, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileIn(List<String> values) {
            addCriterion("SELF_SIGN_FILE in", values, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileNotIn(List<String> values) {
            addCriterion("SELF_SIGN_FILE not in", values, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileBetween(String value1, String value2) {
            addCriterion("SELF_SIGN_FILE between", value1, value2, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andSelfSignFileNotBetween(String value1, String value2) {
            addCriterion("SELF_SIGN_FILE not between", value1, value2, "selfSignFile");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoIsNull() {
            addCriterion("TOKEN_SERIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoIsNotNull() {
            addCriterion("TOKEN_SERIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoEqualTo(String value) {
            addCriterion("TOKEN_SERIAL_NO =", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoNotEqualTo(String value) {
            addCriterion("TOKEN_SERIAL_NO <>", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoGreaterThan(String value) {
            addCriterion("TOKEN_SERIAL_NO >", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("TOKEN_SERIAL_NO >=", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoLessThan(String value) {
            addCriterion("TOKEN_SERIAL_NO <", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoLessThanOrEqualTo(String value) {
            addCriterion("TOKEN_SERIAL_NO <=", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoLike(String value) {
            addCriterion("TOKEN_SERIAL_NO like", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoNotLike(String value) {
            addCriterion("TOKEN_SERIAL_NO not like", value, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoIn(List<String> values) {
            addCriterion("TOKEN_SERIAL_NO in", values, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoNotIn(List<String> values) {
            addCriterion("TOKEN_SERIAL_NO not in", values, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoBetween(String value1, String value2) {
            addCriterion("TOKEN_SERIAL_NO between", value1, value2, "tokenSerialNo");
            return (Criteria) this;
        }

        public Criteria andTokenSerialNoNotBetween(String value1, String value2) {
            addCriterion("TOKEN_SERIAL_NO not between", value1, value2, "tokenSerialNo");
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

        public Criteria andExpiresIsNull() {
            addCriterion("EXPIRES is null");
            return (Criteria) this;
        }

        public Criteria andExpiresIsNotNull() {
            addCriterion("EXPIRES is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresEqualTo(Date value) {
            addCriterion("EXPIRES =", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotEqualTo(Date value) {
            addCriterion("EXPIRES <>", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresGreaterThan(Date value) {
            addCriterion("EXPIRES >", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPIRES >=", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLessThan(Date value) {
            addCriterion("EXPIRES <", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresLessThanOrEqualTo(Date value) {
            addCriterion("EXPIRES <=", value, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresIn(List<Date> values) {
            addCriterion("EXPIRES in", values, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotIn(List<Date> values) {
            addCriterion("EXPIRES not in", values, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresBetween(Date value1, Date value2) {
            addCriterion("EXPIRES between", value1, value2, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiresNotBetween(Date value1, Date value2) {
            addCriterion("EXPIRES not between", value1, value2, "expires");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNull() {
            addCriterion("EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andExpiredIsNotNull() {
            addCriterion("EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andExpiredEqualTo(String value) {
            addCriterion("EXPIRED =", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotEqualTo(String value) {
            addCriterion("EXPIRED <>", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThan(String value) {
            addCriterion("EXPIRED >", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("EXPIRED >=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThan(String value) {
            addCriterion("EXPIRED <", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLessThanOrEqualTo(String value) {
            addCriterion("EXPIRED <=", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredLike(String value) {
            addCriterion("EXPIRED like", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotLike(String value) {
            addCriterion("EXPIRED not like", value, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredIn(List<String> values) {
            addCriterion("EXPIRED in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotIn(List<String> values) {
            addCriterion("EXPIRED not in", values, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredBetween(String value1, String value2) {
            addCriterion("EXPIRED between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andExpiredNotBetween(String value1, String value2) {
            addCriterion("EXPIRED not between", value1, value2, "expired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredIsNull() {
            addCriterion("SELF_SIGN_EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredIsNotNull() {
            addCriterion("SELF_SIGN_EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredEqualTo(String value) {
            addCriterion("SELF_SIGN_EXPIRED =", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredNotEqualTo(String value) {
            addCriterion("SELF_SIGN_EXPIRED <>", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredGreaterThan(String value) {
            addCriterion("SELF_SIGN_EXPIRED >", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_SIGN_EXPIRED >=", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredLessThan(String value) {
            addCriterion("SELF_SIGN_EXPIRED <", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredLessThanOrEqualTo(String value) {
            addCriterion("SELF_SIGN_EXPIRED <=", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredLike(String value) {
            addCriterion("SELF_SIGN_EXPIRED like", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredNotLike(String value) {
            addCriterion("SELF_SIGN_EXPIRED not like", value, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredIn(List<String> values) {
            addCriterion("SELF_SIGN_EXPIRED in", values, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredNotIn(List<String> values) {
            addCriterion("SELF_SIGN_EXPIRED not in", values, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredBetween(String value1, String value2) {
            addCriterion("SELF_SIGN_EXPIRED between", value1, value2, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andSelfSignExpiredNotBetween(String value1, String value2) {
            addCriterion("SELF_SIGN_EXPIRED not between", value1, value2, "selfSignExpired");
            return (Criteria) this;
        }

        public Criteria andPswdIsNull() {
            addCriterion("PSWD is null");
            return (Criteria) this;
        }

        public Criteria andPswdIsNotNull() {
            addCriterion("PSWD is not null");
            return (Criteria) this;
        }

        public Criteria andPswdEqualTo(String value) {
            addCriterion("PSWD =", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotEqualTo(String value) {
            addCriterion("PSWD <>", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdGreaterThan(String value) {
            addCriterion("PSWD >", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdGreaterThanOrEqualTo(String value) {
            addCriterion("PSWD >=", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdLessThan(String value) {
            addCriterion("PSWD <", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdLessThanOrEqualTo(String value) {
            addCriterion("PSWD <=", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdLike(String value) {
            addCriterion("PSWD like", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotLike(String value) {
            addCriterion("PSWD not like", value, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdIn(List<String> values) {
            addCriterion("PSWD in", values, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotIn(List<String> values) {
            addCriterion("PSWD not in", values, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdBetween(String value1, String value2) {
            addCriterion("PSWD between", value1, value2, "pswd");
            return (Criteria) this;
        }

        public Criteria andPswdNotBetween(String value1, String value2) {
            addCriterion("PSWD not between", value1, value2, "pswd");
            return (Criteria) this;
        }

        public Criteria andProjectFilterIsNull() {
            addCriterion("PROJECT_FILTER is null");
            return (Criteria) this;
        }

        public Criteria andProjectFilterIsNotNull() {
            addCriterion("PROJECT_FILTER is not null");
            return (Criteria) this;
        }

        public Criteria andProjectFilterEqualTo(String value) {
            addCriterion("PROJECT_FILTER =", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterNotEqualTo(String value) {
            addCriterion("PROJECT_FILTER <>", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterGreaterThan(String value) {
            addCriterion("PROJECT_FILTER >", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_FILTER >=", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterLessThan(String value) {
            addCriterion("PROJECT_FILTER <", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_FILTER <=", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterLike(String value) {
            addCriterion("PROJECT_FILTER like", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterNotLike(String value) {
            addCriterion("PROJECT_FILTER not like", value, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterIn(List<String> values) {
            addCriterion("PROJECT_FILTER in", values, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterNotIn(List<String> values) {
            addCriterion("PROJECT_FILTER not in", values, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterBetween(String value1, String value2) {
            addCriterion("PROJECT_FILTER between", value1, value2, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andProjectFilterNotBetween(String value1, String value2) {
            addCriterion("PROJECT_FILTER not between", value1, value2, "projectFilter");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumIsNull() {
            addCriterion("NOTEBOOK_REF_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumIsNotNull() {
            addCriterion("NOTEBOOK_REF_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumEqualTo(Long value) {
            addCriterion("NOTEBOOK_REF_NUM =", value, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumNotEqualTo(Long value) {
            addCriterion("NOTEBOOK_REF_NUM <>", value, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumGreaterThan(Long value) {
            addCriterion("NOTEBOOK_REF_NUM >", value, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumGreaterThanOrEqualTo(Long value) {
            addCriterion("NOTEBOOK_REF_NUM >=", value, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumLessThan(Long value) {
            addCriterion("NOTEBOOK_REF_NUM <", value, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumLessThanOrEqualTo(Long value) {
            addCriterion("NOTEBOOK_REF_NUM <=", value, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumIn(List<Long> values) {
            addCriterion("NOTEBOOK_REF_NUM in", values, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumNotIn(List<Long> values) {
            addCriterion("NOTEBOOK_REF_NUM not in", values, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumBetween(Long value1, Long value2) {
            addCriterion("NOTEBOOK_REF_NUM between", value1, value2, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andNotebookRefNumNotBetween(Long value1, Long value2) {
            addCriterion("NOTEBOOK_REF_NUM not between", value1, value2, "notebookRefNum");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigIsNull() {
            addCriterion("BROWSE_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigIsNotNull() {
            addCriterion("BROWSE_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigEqualTo(String value) {
            addCriterion("BROWSE_CONFIG =", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigNotEqualTo(String value) {
            addCriterion("BROWSE_CONFIG <>", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigGreaterThan(String value) {
            addCriterion("BROWSE_CONFIG >", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigGreaterThanOrEqualTo(String value) {
            addCriterion("BROWSE_CONFIG >=", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigLessThan(String value) {
            addCriterion("BROWSE_CONFIG <", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigLessThanOrEqualTo(String value) {
            addCriterion("BROWSE_CONFIG <=", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigLike(String value) {
            addCriterion("BROWSE_CONFIG like", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigNotLike(String value) {
            addCriterion("BROWSE_CONFIG not like", value, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigIn(List<String> values) {
            addCriterion("BROWSE_CONFIG in", values, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigNotIn(List<String> values) {
            addCriterion("BROWSE_CONFIG not in", values, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigBetween(String value1, String value2) {
            addCriterion("BROWSE_CONFIG between", value1, value2, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andBrowseConfigNotBetween(String value1, String value2) {
            addCriterion("BROWSE_CONFIG not between", value1, value2, "browseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigIsNull() {
            addCriterion("TEST_BROWSE_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigIsNotNull() {
            addCriterion("TEST_BROWSE_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigEqualTo(String value) {
            addCriterion("TEST_BROWSE_CONFIG =", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigNotEqualTo(String value) {
            addCriterion("TEST_BROWSE_CONFIG <>", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigGreaterThan(String value) {
            addCriterion("TEST_BROWSE_CONFIG >", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_BROWSE_CONFIG >=", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigLessThan(String value) {
            addCriterion("TEST_BROWSE_CONFIG <", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigLessThanOrEqualTo(String value) {
            addCriterion("TEST_BROWSE_CONFIG <=", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigLike(String value) {
            addCriterion("TEST_BROWSE_CONFIG like", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigNotLike(String value) {
            addCriterion("TEST_BROWSE_CONFIG not like", value, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigIn(List<String> values) {
            addCriterion("TEST_BROWSE_CONFIG in", values, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigNotIn(List<String> values) {
            addCriterion("TEST_BROWSE_CONFIG not in", values, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigBetween(String value1, String value2) {
            addCriterion("TEST_BROWSE_CONFIG between", value1, value2, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andTestBrowseConfigNotBetween(String value1, String value2) {
            addCriterion("TEST_BROWSE_CONFIG not between", value1, value2, "testBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigIsNull() {
            addCriterion("PROJ_BROWSE_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigIsNotNull() {
            addCriterion("PROJ_BROWSE_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigEqualTo(String value) {
            addCriterion("PROJ_BROWSE_CONFIG =", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigNotEqualTo(String value) {
            addCriterion("PROJ_BROWSE_CONFIG <>", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigGreaterThan(String value) {
            addCriterion("PROJ_BROWSE_CONFIG >", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigGreaterThanOrEqualTo(String value) {
            addCriterion("PROJ_BROWSE_CONFIG >=", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigLessThan(String value) {
            addCriterion("PROJ_BROWSE_CONFIG <", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigLessThanOrEqualTo(String value) {
            addCriterion("PROJ_BROWSE_CONFIG <=", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigLike(String value) {
            addCriterion("PROJ_BROWSE_CONFIG like", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigNotLike(String value) {
            addCriterion("PROJ_BROWSE_CONFIG not like", value, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigIn(List<String> values) {
            addCriterion("PROJ_BROWSE_CONFIG in", values, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigNotIn(List<String> values) {
            addCriterion("PROJ_BROWSE_CONFIG not in", values, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigBetween(String value1, String value2) {
            addCriterion("PROJ_BROWSE_CONFIG between", value1, value2, "projBrowseConfig");
            return (Criteria) this;
        }

        public Criteria andProjBrowseConfigNotBetween(String value1, String value2) {
            addCriterion("PROJ_BROWSE_CONFIG not between", value1, value2, "projBrowseConfig");
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
            addCriterion("CHANGED_ON =", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotEqualTo(Date value) {
            addCriterion("CHANGED_ON <>", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThan(Date value) {
            addCriterion("CHANGED_ON >", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnGreaterThanOrEqualTo(Date value) {
            addCriterion("CHANGED_ON >=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThan(Date value) {
            addCriterion("CHANGED_ON <", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnLessThanOrEqualTo(Date value) {
            addCriterion("CHANGED_ON <=", value, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnIn(List<Date> values) {
            addCriterion("CHANGED_ON in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotIn(List<Date> values) {
            addCriterion("CHANGED_ON not in", values, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnBetween(Date value1, Date value2) {
            addCriterion("CHANGED_ON between", value1, value2, "changedOn");
            return (Criteria) this;
        }

        public Criteria andChangedOnNotBetween(Date value1, Date value2) {
            addCriterion("CHANGED_ON not between", value1, value2, "changedOn");
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

        public Criteria andSignatureCheckIsNull() {
            addCriterion("SIGNATURE_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckIsNotNull() {
            addCriterion("SIGNATURE_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckEqualTo(String value) {
            addCriterion("SIGNATURE_CHECK =", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckNotEqualTo(String value) {
            addCriterion("SIGNATURE_CHECK <>", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckGreaterThan(String value) {
            addCriterion("SIGNATURE_CHECK >", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_CHECK >=", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckLessThan(String value) {
            addCriterion("SIGNATURE_CHECK <", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE_CHECK <=", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckLike(String value) {
            addCriterion("SIGNATURE_CHECK like", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckNotLike(String value) {
            addCriterion("SIGNATURE_CHECK not like", value, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckIn(List<String> values) {
            addCriterion("SIGNATURE_CHECK in", values, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckNotIn(List<String> values) {
            addCriterion("SIGNATURE_CHECK not in", values, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckBetween(String value1, String value2) {
            addCriterion("SIGNATURE_CHECK between", value1, value2, "signatureCheck");
            return (Criteria) this;
        }

        public Criteria andSignatureCheckNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE_CHECK not between", value1, value2, "signatureCheck");
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

        public Criteria andUserRoleIsNull() {
            addCriterion("USER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andUserRoleIsNotNull() {
            addCriterion("USER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserRoleEqualTo(String value) {
            addCriterion("USER_ROLE =", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotEqualTo(String value) {
            addCriterion("USER_ROLE <>", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThan(String value) {
            addCriterion("USER_ROLE >", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ROLE >=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThan(String value) {
            addCriterion("USER_ROLE <", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLessThanOrEqualTo(String value) {
            addCriterion("USER_ROLE <=", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleLike(String value) {
            addCriterion("USER_ROLE like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotLike(String value) {
            addCriterion("USER_ROLE not like", value, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleIn(List<String> values) {
            addCriterion("USER_ROLE in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotIn(List<String> values) {
            addCriterion("USER_ROLE not in", values, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleBetween(String value1, String value2) {
            addCriterion("USER_ROLE between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andUserRoleNotBetween(String value1, String value2) {
            addCriterion("USER_ROLE not between", value1, value2, "userRole");
            return (Criteria) this;
        }

        public Criteria andSigningPswdIsNull() {
            addCriterion("SIGNING_PSWD is null");
            return (Criteria) this;
        }

        public Criteria andSigningPswdIsNotNull() {
            addCriterion("SIGNING_PSWD is not null");
            return (Criteria) this;
        }

        public Criteria andSigningPswdEqualTo(String value) {
            addCriterion("SIGNING_PSWD =", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdNotEqualTo(String value) {
            addCriterion("SIGNING_PSWD <>", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdGreaterThan(String value) {
            addCriterion("SIGNING_PSWD >", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNING_PSWD >=", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdLessThan(String value) {
            addCriterion("SIGNING_PSWD <", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdLessThanOrEqualTo(String value) {
            addCriterion("SIGNING_PSWD <=", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdLike(String value) {
            addCriterion("SIGNING_PSWD like", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdNotLike(String value) {
            addCriterion("SIGNING_PSWD not like", value, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdIn(List<String> values) {
            addCriterion("SIGNING_PSWD in", values, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdNotIn(List<String> values) {
            addCriterion("SIGNING_PSWD not in", values, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdBetween(String value1, String value2) {
            addCriterion("SIGNING_PSWD between", value1, value2, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningPswdNotBetween(String value1, String value2) {
            addCriterion("SIGNING_PSWD not between", value1, value2, "signingPswd");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresIsNull() {
            addCriterion("SIGNING_EXPIRES is null");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresIsNotNull() {
            addCriterion("SIGNING_EXPIRES is not null");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresEqualTo(Date value) {
            addCriterion("SIGNING_EXPIRES =", value, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresNotEqualTo(Date value) {
            addCriterion("SIGNING_EXPIRES <>", value, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresGreaterThan(Date value) {
            addCriterion("SIGNING_EXPIRES >", value, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresGreaterThanOrEqualTo(Date value) {
            addCriterion("SIGNING_EXPIRES >=", value, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresLessThan(Date value) {
            addCriterion("SIGNING_EXPIRES <", value, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresLessThanOrEqualTo(Date value) {
            addCriterion("SIGNING_EXPIRES <=", value, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresIn(List<Date> values) {
            addCriterion("SIGNING_EXPIRES in", values, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresNotIn(List<Date> values) {
            addCriterion("SIGNING_EXPIRES not in", values, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresBetween(Date value1, Date value2) {
            addCriterion("SIGNING_EXPIRES between", value1, value2, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiresNotBetween(Date value1, Date value2) {
            addCriterion("SIGNING_EXPIRES not between", value1, value2, "signingExpires");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredIsNull() {
            addCriterion("SIGNING_EXPIRED is null");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredIsNotNull() {
            addCriterion("SIGNING_EXPIRED is not null");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredEqualTo(String value) {
            addCriterion("SIGNING_EXPIRED =", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredNotEqualTo(String value) {
            addCriterion("SIGNING_EXPIRED <>", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredGreaterThan(String value) {
            addCriterion("SIGNING_EXPIRED >", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNING_EXPIRED >=", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredLessThan(String value) {
            addCriterion("SIGNING_EXPIRED <", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredLessThanOrEqualTo(String value) {
            addCriterion("SIGNING_EXPIRED <=", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredLike(String value) {
            addCriterion("SIGNING_EXPIRED like", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredNotLike(String value) {
            addCriterion("SIGNING_EXPIRED not like", value, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredIn(List<String> values) {
            addCriterion("SIGNING_EXPIRED in", values, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredNotIn(List<String> values) {
            addCriterion("SIGNING_EXPIRED not in", values, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredBetween(String value1, String value2) {
            addCriterion("SIGNING_EXPIRED between", value1, value2, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningExpiredNotBetween(String value1, String value2) {
            addCriterion("SIGNING_EXPIRED not between", value1, value2, "signingExpired");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalIsNull() {
            addCriterion("SIGNING_INTERVAL is null");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalIsNotNull() {
            addCriterion("SIGNING_INTERVAL is not null");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalEqualTo(Long value) {
            addCriterion("SIGNING_INTERVAL =", value, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalNotEqualTo(Long value) {
            addCriterion("SIGNING_INTERVAL <>", value, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalGreaterThan(Long value) {
            addCriterion("SIGNING_INTERVAL >", value, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalGreaterThanOrEqualTo(Long value) {
            addCriterion("SIGNING_INTERVAL >=", value, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalLessThan(Long value) {
            addCriterion("SIGNING_INTERVAL <", value, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalLessThanOrEqualTo(Long value) {
            addCriterion("SIGNING_INTERVAL <=", value, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalIn(List<Long> values) {
            addCriterion("SIGNING_INTERVAL in", values, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalNotIn(List<Long> values) {
            addCriterion("SIGNING_INTERVAL not in", values, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalBetween(Long value1, Long value2) {
            addCriterion("SIGNING_INTERVAL between", value1, value2, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andSigningIntervalNotBetween(Long value1, Long value2) {
            addCriterion("SIGNING_INTERVAL not between", value1, value2, "signingInterval");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupIsNull() {
            addCriterion("LICENSE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupIsNotNull() {
            addCriterion("LICENSE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupEqualTo(String value) {
            addCriterion("LICENSE_GROUP =", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupNotEqualTo(String value) {
            addCriterion("LICENSE_GROUP <>", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupGreaterThan(String value) {
            addCriterion("LICENSE_GROUP >", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSE_GROUP >=", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupLessThan(String value) {
            addCriterion("LICENSE_GROUP <", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupLessThanOrEqualTo(String value) {
            addCriterion("LICENSE_GROUP <=", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupLike(String value) {
            addCriterion("LICENSE_GROUP like", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupNotLike(String value) {
            addCriterion("LICENSE_GROUP not like", value, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupIn(List<String> values) {
            addCriterion("LICENSE_GROUP in", values, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupNotIn(List<String> values) {
            addCriterion("LICENSE_GROUP not in", values, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupBetween(String value1, String value2) {
            addCriterion("LICENSE_GROUP between", value1, value2, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andLicenseGroupNotBetween(String value1, String value2) {
            addCriterion("LICENSE_GROUP not between", value1, value2, "licenseGroup");
            return (Criteria) this;
        }

        public Criteria andAddressBookIsNull() {
            addCriterion("ADDRESS_BOOK is null");
            return (Criteria) this;
        }

        public Criteria andAddressBookIsNotNull() {
            addCriterion("ADDRESS_BOOK is not null");
            return (Criteria) this;
        }

        public Criteria andAddressBookEqualTo(String value) {
            addCriterion("ADDRESS_BOOK =", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookNotEqualTo(String value) {
            addCriterion("ADDRESS_BOOK <>", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookGreaterThan(String value) {
            addCriterion("ADDRESS_BOOK >", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_BOOK >=", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookLessThan(String value) {
            addCriterion("ADDRESS_BOOK <", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_BOOK <=", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookLike(String value) {
            addCriterion("ADDRESS_BOOK like", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookNotLike(String value) {
            addCriterion("ADDRESS_BOOK not like", value, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookIn(List<String> values) {
            addCriterion("ADDRESS_BOOK in", values, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookNotIn(List<String> values) {
            addCriterion("ADDRESS_BOOK not in", values, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookBetween(String value1, String value2) {
            addCriterion("ADDRESS_BOOK between", value1, value2, "addressBook");
            return (Criteria) this;
        }

        public Criteria andAddressBookNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_BOOK not between", value1, value2, "addressBook");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeIsNull() {
            addCriterion("WEB_REMEMBER_ME is null");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeIsNotNull() {
            addCriterion("WEB_REMEMBER_ME is not null");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeEqualTo(String value) {
            addCriterion("WEB_REMEMBER_ME =", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeNotEqualTo(String value) {
            addCriterion("WEB_REMEMBER_ME <>", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeGreaterThan(String value) {
            addCriterion("WEB_REMEMBER_ME >", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_REMEMBER_ME >=", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeLessThan(String value) {
            addCriterion("WEB_REMEMBER_ME <", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeLessThanOrEqualTo(String value) {
            addCriterion("WEB_REMEMBER_ME <=", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeLike(String value) {
            addCriterion("WEB_REMEMBER_ME like", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeNotLike(String value) {
            addCriterion("WEB_REMEMBER_ME not like", value, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeIn(List<String> values) {
            addCriterion("WEB_REMEMBER_ME in", values, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeNotIn(List<String> values) {
            addCriterion("WEB_REMEMBER_ME not in", values, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeBetween(String value1, String value2) {
            addCriterion("WEB_REMEMBER_ME between", value1, value2, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebRememberMeNotBetween(String value1, String value2) {
            addCriterion("WEB_REMEMBER_ME not between", value1, value2, "webRememberMe");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterIsNull() {
            addCriterion("WEB_LABEL_PRINTER is null");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterIsNotNull() {
            addCriterion("WEB_LABEL_PRINTER is not null");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterEqualTo(String value) {
            addCriterion("WEB_LABEL_PRINTER =", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterNotEqualTo(String value) {
            addCriterion("WEB_LABEL_PRINTER <>", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterGreaterThan(String value) {
            addCriterion("WEB_LABEL_PRINTER >", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_LABEL_PRINTER >=", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterLessThan(String value) {
            addCriterion("WEB_LABEL_PRINTER <", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterLessThanOrEqualTo(String value) {
            addCriterion("WEB_LABEL_PRINTER <=", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterLike(String value) {
            addCriterion("WEB_LABEL_PRINTER like", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterNotLike(String value) {
            addCriterion("WEB_LABEL_PRINTER not like", value, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterIn(List<String> values) {
            addCriterion("WEB_LABEL_PRINTER in", values, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterNotIn(List<String> values) {
            addCriterion("WEB_LABEL_PRINTER not in", values, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterBetween(String value1, String value2) {
            addCriterion("WEB_LABEL_PRINTER between", value1, value2, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andWebLabelPrinterNotBetween(String value1, String value2) {
            addCriterion("WEB_LABEL_PRINTER not between", value1, value2, "webLabelPrinter");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginIsNull() {
            addCriterion("LAST_FAILED_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginIsNotNull() {
            addCriterion("LAST_FAILED_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginEqualTo(Date value) {
            addCriterion("LAST_FAILED_LOGIN =", value, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginNotEqualTo(Date value) {
            addCriterion("LAST_FAILED_LOGIN <>", value, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginGreaterThan(Date value) {
            addCriterion("LAST_FAILED_LOGIN >", value, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_FAILED_LOGIN >=", value, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginLessThan(Date value) {
            addCriterion("LAST_FAILED_LOGIN <", value, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginLessThanOrEqualTo(Date value) {
            addCriterion("LAST_FAILED_LOGIN <=", value, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginIn(List<Date> values) {
            addCriterion("LAST_FAILED_LOGIN in", values, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginNotIn(List<Date> values) {
            addCriterion("LAST_FAILED_LOGIN not in", values, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginBetween(Date value1, Date value2) {
            addCriterion("LAST_FAILED_LOGIN between", value1, value2, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedLoginNotBetween(Date value1, Date value2) {
            addCriterion("LAST_FAILED_LOGIN not between", value1, value2, "lastFailedLogin");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpIsNull() {
            addCriterion("LAST_FAILED_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpIsNotNull() {
            addCriterion("LAST_FAILED_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpEqualTo(String value) {
            addCriterion("LAST_FAILED_IP =", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpNotEqualTo(String value) {
            addCriterion("LAST_FAILED_IP <>", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpGreaterThan(String value) {
            addCriterion("LAST_FAILED_IP >", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_FAILED_IP >=", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpLessThan(String value) {
            addCriterion("LAST_FAILED_IP <", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_FAILED_IP <=", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpLike(String value) {
            addCriterion("LAST_FAILED_IP like", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpNotLike(String value) {
            addCriterion("LAST_FAILED_IP not like", value, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpIn(List<String> values) {
            addCriterion("LAST_FAILED_IP in", values, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpNotIn(List<String> values) {
            addCriterion("LAST_FAILED_IP not in", values, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpBetween(String value1, String value2) {
            addCriterion("LAST_FAILED_IP between", value1, value2, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andLastFailedIpNotBetween(String value1, String value2) {
            addCriterion("LAST_FAILED_IP not between", value1, value2, "lastFailedIp");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsIsNull() {
            addCriterion("FAILED_LOGINS is null");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsIsNotNull() {
            addCriterion("FAILED_LOGINS is not null");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsEqualTo(Long value) {
            addCriterion("FAILED_LOGINS =", value, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsNotEqualTo(Long value) {
            addCriterion("FAILED_LOGINS <>", value, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsGreaterThan(Long value) {
            addCriterion("FAILED_LOGINS >", value, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsGreaterThanOrEqualTo(Long value) {
            addCriterion("FAILED_LOGINS >=", value, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsLessThan(Long value) {
            addCriterion("FAILED_LOGINS <", value, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsLessThanOrEqualTo(Long value) {
            addCriterion("FAILED_LOGINS <=", value, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsIn(List<Long> values) {
            addCriterion("FAILED_LOGINS in", values, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsNotIn(List<Long> values) {
            addCriterion("FAILED_LOGINS not in", values, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsBetween(Long value1, Long value2) {
            addCriterion("FAILED_LOGINS between", value1, value2, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andFailedLoginsNotBetween(Long value1, Long value2) {
            addCriterion("FAILED_LOGINS not between", value1, value2, "failedLogins");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginIsNull() {
            addCriterion("LAST_GOOD_LOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginIsNotNull() {
            addCriterion("LAST_GOOD_LOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginEqualTo(Date value) {
            addCriterion("LAST_GOOD_LOGIN =", value, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginNotEqualTo(Date value) {
            addCriterion("LAST_GOOD_LOGIN <>", value, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginGreaterThan(Date value) {
            addCriterion("LAST_GOOD_LOGIN >", value, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_GOOD_LOGIN >=", value, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginLessThan(Date value) {
            addCriterion("LAST_GOOD_LOGIN <", value, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginLessThanOrEqualTo(Date value) {
            addCriterion("LAST_GOOD_LOGIN <=", value, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginIn(List<Date> values) {
            addCriterion("LAST_GOOD_LOGIN in", values, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginNotIn(List<Date> values) {
            addCriterion("LAST_GOOD_LOGIN not in", values, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginBetween(Date value1, Date value2) {
            addCriterion("LAST_GOOD_LOGIN between", value1, value2, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodLoginNotBetween(Date value1, Date value2) {
            addCriterion("LAST_GOOD_LOGIN not between", value1, value2, "lastGoodLogin");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpIsNull() {
            addCriterion("LAST_GOOD_IP is null");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpIsNotNull() {
            addCriterion("LAST_GOOD_IP is not null");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpEqualTo(String value) {
            addCriterion("LAST_GOOD_IP =", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpNotEqualTo(String value) {
            addCriterion("LAST_GOOD_IP <>", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpGreaterThan(String value) {
            addCriterion("LAST_GOOD_IP >", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_GOOD_IP >=", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpLessThan(String value) {
            addCriterion("LAST_GOOD_IP <", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpLessThanOrEqualTo(String value) {
            addCriterion("LAST_GOOD_IP <=", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpLike(String value) {
            addCriterion("LAST_GOOD_IP like", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpNotLike(String value) {
            addCriterion("LAST_GOOD_IP not like", value, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpIn(List<String> values) {
            addCriterion("LAST_GOOD_IP in", values, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpNotIn(List<String> values) {
            addCriterion("LAST_GOOD_IP not in", values, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpBetween(String value1, String value2) {
            addCriterion("LAST_GOOD_IP between", value1, value2, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andLastGoodIpNotBetween(String value1, String value2) {
            addCriterion("LAST_GOOD_IP not between", value1, value2, "lastGoodIp");
            return (Criteria) this;
        }

        public Criteria andPaperSetIsNull() {
            addCriterion("PAPER_SET is null");
            return (Criteria) this;
        }

        public Criteria andPaperSetIsNotNull() {
            addCriterion("PAPER_SET is not null");
            return (Criteria) this;
        }

        public Criteria andPaperSetEqualTo(String value) {
            addCriterion("PAPER_SET =", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetNotEqualTo(String value) {
            addCriterion("PAPER_SET <>", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetGreaterThan(String value) {
            addCriterion("PAPER_SET >", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetGreaterThanOrEqualTo(String value) {
            addCriterion("PAPER_SET >=", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetLessThan(String value) {
            addCriterion("PAPER_SET <", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetLessThanOrEqualTo(String value) {
            addCriterion("PAPER_SET <=", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetLike(String value) {
            addCriterion("PAPER_SET like", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetNotLike(String value) {
            addCriterion("PAPER_SET not like", value, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetIn(List<String> values) {
            addCriterion("PAPER_SET in", values, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetNotIn(List<String> values) {
            addCriterion("PAPER_SET not in", values, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetBetween(String value1, String value2) {
            addCriterion("PAPER_SET between", value1, value2, "paperSet");
            return (Criteria) this;
        }

        public Criteria andPaperSetNotBetween(String value1, String value2) {
            addCriterion("PAPER_SET not between", value1, value2, "paperSet");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andRecordSetIsNull() {
            addCriterion("RECORD_SET is null");
            return (Criteria) this;
        }

        public Criteria andRecordSetIsNotNull() {
            addCriterion("RECORD_SET is not null");
            return (Criteria) this;
        }

        public Criteria andRecordSetEqualTo(String value) {
            addCriterion("RECORD_SET =", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotEqualTo(String value) {
            addCriterion("RECORD_SET <>", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetGreaterThan(String value) {
            addCriterion("RECORD_SET >", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetGreaterThanOrEqualTo(String value) {
            addCriterion("RECORD_SET >=", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetLessThan(String value) {
            addCriterion("RECORD_SET <", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetLessThanOrEqualTo(String value) {
            addCriterion("RECORD_SET <=", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetLike(String value) {
            addCriterion("RECORD_SET like", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotLike(String value) {
            addCriterion("RECORD_SET not like", value, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetIn(List<String> values) {
            addCriterion("RECORD_SET in", values, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotIn(List<String> values) {
            addCriterion("RECORD_SET not in", values, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetBetween(String value1, String value2) {
            addCriterion("RECORD_SET between", value1, value2, "recordSet");
            return (Criteria) this;
        }

        public Criteria andRecordSetNotBetween(String value1, String value2) {
            addCriterion("RECORD_SET not between", value1, value2, "recordSet");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactIsNull() {
            addCriterion("T_CUSTOMER_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactIsNotNull() {
            addCriterion("T_CUSTOMER_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactEqualTo(Long value) {
            addCriterion("T_CUSTOMER_CONTACT =", value, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactNotEqualTo(Long value) {
            addCriterion("T_CUSTOMER_CONTACT <>", value, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactGreaterThan(Long value) {
            addCriterion("T_CUSTOMER_CONTACT >", value, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactGreaterThanOrEqualTo(Long value) {
            addCriterion("T_CUSTOMER_CONTACT >=", value, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactLessThan(Long value) {
            addCriterion("T_CUSTOMER_CONTACT <", value, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactLessThanOrEqualTo(Long value) {
            addCriterion("T_CUSTOMER_CONTACT <=", value, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactIn(List<Long> values) {
            addCriterion("T_CUSTOMER_CONTACT in", values, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactNotIn(List<Long> values) {
            addCriterion("T_CUSTOMER_CONTACT not in", values, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactBetween(Long value1, Long value2) {
            addCriterion("T_CUSTOMER_CONTACT between", value1, value2, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTCustomerContactNotBetween(Long value1, Long value2) {
            addCriterion("T_CUSTOMER_CONTACT not between", value1, value2, "tCustomerContact");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryIsNull() {
            addCriterion("T_DEF_RESULT_QRY is null");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryIsNotNull() {
            addCriterion("T_DEF_RESULT_QRY is not null");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryEqualTo(String value) {
            addCriterion("T_DEF_RESULT_QRY =", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryNotEqualTo(String value) {
            addCriterion("T_DEF_RESULT_QRY <>", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryGreaterThan(String value) {
            addCriterion("T_DEF_RESULT_QRY >", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryGreaterThanOrEqualTo(String value) {
            addCriterion("T_DEF_RESULT_QRY >=", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryLessThan(String value) {
            addCriterion("T_DEF_RESULT_QRY <", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryLessThanOrEqualTo(String value) {
            addCriterion("T_DEF_RESULT_QRY <=", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryLike(String value) {
            addCriterion("T_DEF_RESULT_QRY like", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryNotLike(String value) {
            addCriterion("T_DEF_RESULT_QRY not like", value, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryIn(List<String> values) {
            addCriterion("T_DEF_RESULT_QRY in", values, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryNotIn(List<String> values) {
            addCriterion("T_DEF_RESULT_QRY not in", values, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryBetween(String value1, String value2) {
            addCriterion("T_DEF_RESULT_QRY between", value1, value2, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTDefResultQryNotBetween(String value1, String value2) {
            addCriterion("T_DEF_RESULT_QRY not between", value1, value2, "tDefResultQry");
            return (Criteria) this;
        }

        public Criteria andTJobTitleIsNull() {
            addCriterion("T_JOB_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTJobTitleIsNotNull() {
            addCriterion("T_JOB_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTJobTitleEqualTo(String value) {
            addCriterion("T_JOB_TITLE =", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleNotEqualTo(String value) {
            addCriterion("T_JOB_TITLE <>", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleGreaterThan(String value) {
            addCriterion("T_JOB_TITLE >", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("T_JOB_TITLE >=", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleLessThan(String value) {
            addCriterion("T_JOB_TITLE <", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleLessThanOrEqualTo(String value) {
            addCriterion("T_JOB_TITLE <=", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleLike(String value) {
            addCriterion("T_JOB_TITLE like", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleNotLike(String value) {
            addCriterion("T_JOB_TITLE not like", value, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleIn(List<String> values) {
            addCriterion("T_JOB_TITLE in", values, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleNotIn(List<String> values) {
            addCriterion("T_JOB_TITLE not in", values, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleBetween(String value1, String value2) {
            addCriterion("T_JOB_TITLE between", value1, value2, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTJobTitleNotBetween(String value1, String value2) {
            addCriterion("T_JOB_TITLE not between", value1, value2, "tJobTitle");
            return (Criteria) this;
        }

        public Criteria andTrackChangesIsNull() {
            addCriterion("TRACK_CHANGES is null");
            return (Criteria) this;
        }

        public Criteria andTrackChangesIsNotNull() {
            addCriterion("TRACK_CHANGES is not null");
            return (Criteria) this;
        }

        public Criteria andTrackChangesEqualTo(String value) {
            addCriterion("TRACK_CHANGES =", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesNotEqualTo(String value) {
            addCriterion("TRACK_CHANGES <>", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesGreaterThan(String value) {
            addCriterion("TRACK_CHANGES >", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesGreaterThanOrEqualTo(String value) {
            addCriterion("TRACK_CHANGES >=", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesLessThan(String value) {
            addCriterion("TRACK_CHANGES <", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesLessThanOrEqualTo(String value) {
            addCriterion("TRACK_CHANGES <=", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesLike(String value) {
            addCriterion("TRACK_CHANGES like", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesNotLike(String value) {
            addCriterion("TRACK_CHANGES not like", value, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesIn(List<String> values) {
            addCriterion("TRACK_CHANGES in", values, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesNotIn(List<String> values) {
            addCriterion("TRACK_CHANGES not in", values, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesBetween(String value1, String value2) {
            addCriterion("TRACK_CHANGES between", value1, value2, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andTrackChangesNotBetween(String value1, String value2) {
            addCriterion("TRACK_CHANGES not between", value1, value2, "trackChanges");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortIsNull() {
            addCriterion("WEB_LABEL_PTR_PORT is null");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortIsNotNull() {
            addCriterion("WEB_LABEL_PTR_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortEqualTo(String value) {
            addCriterion("WEB_LABEL_PTR_PORT =", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortNotEqualTo(String value) {
            addCriterion("WEB_LABEL_PTR_PORT <>", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortGreaterThan(String value) {
            addCriterion("WEB_LABEL_PTR_PORT >", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortGreaterThanOrEqualTo(String value) {
            addCriterion("WEB_LABEL_PTR_PORT >=", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortLessThan(String value) {
            addCriterion("WEB_LABEL_PTR_PORT <", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortLessThanOrEqualTo(String value) {
            addCriterion("WEB_LABEL_PTR_PORT <=", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortLike(String value) {
            addCriterion("WEB_LABEL_PTR_PORT like", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortNotLike(String value) {
            addCriterion("WEB_LABEL_PTR_PORT not like", value, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortIn(List<String> values) {
            addCriterion("WEB_LABEL_PTR_PORT in", values, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortNotIn(List<String> values) {
            addCriterion("WEB_LABEL_PTR_PORT not in", values, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortBetween(String value1, String value2) {
            addCriterion("WEB_LABEL_PTR_PORT between", value1, value2, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andWebLabelPtrPortNotBetween(String value1, String value2) {
            addCriterion("WEB_LABEL_PTR_PORT not between", value1, value2, "webLabelPtrPort");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleIsNull() {
            addCriterion("GROUP_NAME_FROM_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleIsNotNull() {
            addCriterion("GROUP_NAME_FROM_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleEqualTo(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE =", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleNotEqualTo(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE <>", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleGreaterThan(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE >", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE >=", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleLessThan(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE <", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleLessThanOrEqualTo(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE <=", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleLike(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE like", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleNotLike(String value) {
            addCriterion("GROUP_NAME_FROM_ROLE not like", value, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleIn(List<String> values) {
            addCriterion("GROUP_NAME_FROM_ROLE in", values, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleNotIn(List<String> values) {
            addCriterion("GROUP_NAME_FROM_ROLE not in", values, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleBetween(String value1, String value2) {
            addCriterion("GROUP_NAME_FROM_ROLE between", value1, value2, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andGroupNameFromRoleNotBetween(String value1, String value2) {
            addCriterion("GROUP_NAME_FROM_ROLE not between", value1, value2, "groupNameFromRole");
            return (Criteria) this;
        }

        public Criteria andCombineRolesIsNull() {
            addCriterion("COMBINE_ROLES is null");
            return (Criteria) this;
        }

        public Criteria andCombineRolesIsNotNull() {
            addCriterion("COMBINE_ROLES is not null");
            return (Criteria) this;
        }

        public Criteria andCombineRolesEqualTo(String value) {
            addCriterion("COMBINE_ROLES =", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesNotEqualTo(String value) {
            addCriterion("COMBINE_ROLES <>", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesGreaterThan(String value) {
            addCriterion("COMBINE_ROLES >", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesGreaterThanOrEqualTo(String value) {
            addCriterion("COMBINE_ROLES >=", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesLessThan(String value) {
            addCriterion("COMBINE_ROLES <", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesLessThanOrEqualTo(String value) {
            addCriterion("COMBINE_ROLES <=", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesLike(String value) {
            addCriterion("COMBINE_ROLES like", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesNotLike(String value) {
            addCriterion("COMBINE_ROLES not like", value, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesIn(List<String> values) {
            addCriterion("COMBINE_ROLES in", values, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesNotIn(List<String> values) {
            addCriterion("COMBINE_ROLES not in", values, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesBetween(String value1, String value2) {
            addCriterion("COMBINE_ROLES between", value1, value2, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andCombineRolesNotBetween(String value1, String value2) {
            addCriterion("COMBINE_ROLES not between", value1, value2, "combineRoles");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointIsNull() {
            addCriterion("ENABLE_BREAKPOINT is null");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointIsNotNull() {
            addCriterion("ENABLE_BREAKPOINT is not null");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointEqualTo(String value) {
            addCriterion("ENABLE_BREAKPOINT =", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointNotEqualTo(String value) {
            addCriterion("ENABLE_BREAKPOINT <>", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointGreaterThan(String value) {
            addCriterion("ENABLE_BREAKPOINT >", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_BREAKPOINT >=", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointLessThan(String value) {
            addCriterion("ENABLE_BREAKPOINT <", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_BREAKPOINT <=", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointLike(String value) {
            addCriterion("ENABLE_BREAKPOINT like", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointNotLike(String value) {
            addCriterion("ENABLE_BREAKPOINT not like", value, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointIn(List<String> values) {
            addCriterion("ENABLE_BREAKPOINT in", values, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointNotIn(List<String> values) {
            addCriterion("ENABLE_BREAKPOINT not in", values, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointBetween(String value1, String value2) {
            addCriterion("ENABLE_BREAKPOINT between", value1, value2, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableBreakpointNotBetween(String value1, String value2) {
            addCriterion("ENABLE_BREAKPOINT not between", value1, value2, "enableBreakpoint");
            return (Criteria) this;
        }

        public Criteria andEnableTraceIsNull() {
            addCriterion("ENABLE_TRACE is null");
            return (Criteria) this;
        }

        public Criteria andEnableTraceIsNotNull() {
            addCriterion("ENABLE_TRACE is not null");
            return (Criteria) this;
        }

        public Criteria andEnableTraceEqualTo(String value) {
            addCriterion("ENABLE_TRACE =", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceNotEqualTo(String value) {
            addCriterion("ENABLE_TRACE <>", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceGreaterThan(String value) {
            addCriterion("ENABLE_TRACE >", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceGreaterThanOrEqualTo(String value) {
            addCriterion("ENABLE_TRACE >=", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceLessThan(String value) {
            addCriterion("ENABLE_TRACE <", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceLessThanOrEqualTo(String value) {
            addCriterion("ENABLE_TRACE <=", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceLike(String value) {
            addCriterion("ENABLE_TRACE like", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceNotLike(String value) {
            addCriterion("ENABLE_TRACE not like", value, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceIn(List<String> values) {
            addCriterion("ENABLE_TRACE in", values, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceNotIn(List<String> values) {
            addCriterion("ENABLE_TRACE not in", values, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceBetween(String value1, String value2) {
            addCriterion("ENABLE_TRACE between", value1, value2, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andEnableTraceNotBetween(String value1, String value2) {
            addCriterion("ENABLE_TRACE not between", value1, value2, "enableTrace");
            return (Criteria) this;
        }

        public Criteria andSsoUidIsNull() {
            addCriterion("SSO_UID is null");
            return (Criteria) this;
        }

        public Criteria andSsoUidIsNotNull() {
            addCriterion("SSO_UID is not null");
            return (Criteria) this;
        }

        public Criteria andSsoUidEqualTo(String value) {
            addCriterion("SSO_UID =", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidNotEqualTo(String value) {
            addCriterion("SSO_UID <>", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidGreaterThan(String value) {
            addCriterion("SSO_UID >", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidGreaterThanOrEqualTo(String value) {
            addCriterion("SSO_UID >=", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidLessThan(String value) {
            addCriterion("SSO_UID <", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidLessThanOrEqualTo(String value) {
            addCriterion("SSO_UID <=", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidLike(String value) {
            addCriterion("SSO_UID like", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidNotLike(String value) {
            addCriterion("SSO_UID not like", value, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidIn(List<String> values) {
            addCriterion("SSO_UID in", values, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidNotIn(List<String> values) {
            addCriterion("SSO_UID not in", values, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidBetween(String value1, String value2) {
            addCriterion("SSO_UID between", value1, value2, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andSsoUidNotBetween(String value1, String value2) {
            addCriterion("SSO_UID not between", value1, value2, "ssoUid");
            return (Criteria) this;
        }

        public Criteria andCCompanyIsNull() {
            addCriterion("C_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCCompanyIsNotNull() {
            addCriterion("C_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCCompanyEqualTo(String value) {
            addCriterion("C_COMPANY =", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotEqualTo(String value) {
            addCriterion("C_COMPANY <>", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyGreaterThan(String value) {
            addCriterion("C_COMPANY >", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("C_COMPANY >=", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyLessThan(String value) {
            addCriterion("C_COMPANY <", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyLessThanOrEqualTo(String value) {
            addCriterion("C_COMPANY <=", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyLike(String value) {
            addCriterion("C_COMPANY like", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotLike(String value) {
            addCriterion("C_COMPANY not like", value, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyIn(List<String> values) {
            addCriterion("C_COMPANY in", values, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotIn(List<String> values) {
            addCriterion("C_COMPANY not in", values, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyBetween(String value1, String value2) {
            addCriterion("C_COMPANY between", value1, value2, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCCompanyNotBetween(String value1, String value2) {
            addCriterion("C_COMPANY not between", value1, value2, "cCompany");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIsNull() {
            addCriterion("C_DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIsNotNull() {
            addCriterion("C_DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentEqualTo(String value) {
            addCriterion("C_DEPARTMENT =", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotEqualTo(String value) {
            addCriterion("C_DEPARTMENT <>", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentGreaterThan(String value) {
            addCriterion("C_DEPARTMENT >", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("C_DEPARTMENT >=", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentLessThan(String value) {
            addCriterion("C_DEPARTMENT <", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentLessThanOrEqualTo(String value) {
            addCriterion("C_DEPARTMENT <=", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentLike(String value) {
            addCriterion("C_DEPARTMENT like", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotLike(String value) {
            addCriterion("C_DEPARTMENT not like", value, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIn(List<String> values) {
            addCriterion("C_DEPARTMENT in", values, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotIn(List<String> values) {
            addCriterion("C_DEPARTMENT not in", values, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentBetween(String value1, String value2) {
            addCriterion("C_DEPARTMENT between", value1, value2, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCDepartmentNotBetween(String value1, String value2) {
            addCriterion("C_DEPARTMENT not between", value1, value2, "cDepartment");
            return (Criteria) this;
        }

        public Criteria andCIsQaIsNull() {
            addCriterion("C_IS_QA is null");
            return (Criteria) this;
        }

        public Criteria andCIsQaIsNotNull() {
            addCriterion("C_IS_QA is not null");
            return (Criteria) this;
        }

        public Criteria andCIsQaEqualTo(String value) {
            addCriterion("C_IS_QA =", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaNotEqualTo(String value) {
            addCriterion("C_IS_QA <>", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaGreaterThan(String value) {
            addCriterion("C_IS_QA >", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaGreaterThanOrEqualTo(String value) {
            addCriterion("C_IS_QA >=", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaLessThan(String value) {
            addCriterion("C_IS_QA <", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaLessThanOrEqualTo(String value) {
            addCriterion("C_IS_QA <=", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaLike(String value) {
            addCriterion("C_IS_QA like", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaNotLike(String value) {
            addCriterion("C_IS_QA not like", value, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaIn(List<String> values) {
            addCriterion("C_IS_QA in", values, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaNotIn(List<String> values) {
            addCriterion("C_IS_QA not in", values, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaBetween(String value1, String value2) {
            addCriterion("C_IS_QA between", value1, value2, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCIsQaNotBetween(String value1, String value2) {
            addCriterion("C_IS_QA not between", value1, value2, "cIsQa");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingIsNull() {
            addCriterion("C_APPROVAL_ROUTING is null");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingIsNotNull() {
            addCriterion("C_APPROVAL_ROUTING is not null");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingEqualTo(String value) {
            addCriterion("C_APPROVAL_ROUTING =", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingNotEqualTo(String value) {
            addCriterion("C_APPROVAL_ROUTING <>", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingGreaterThan(String value) {
            addCriterion("C_APPROVAL_ROUTING >", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingGreaterThanOrEqualTo(String value) {
            addCriterion("C_APPROVAL_ROUTING >=", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingLessThan(String value) {
            addCriterion("C_APPROVAL_ROUTING <", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingLessThanOrEqualTo(String value) {
            addCriterion("C_APPROVAL_ROUTING <=", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingLike(String value) {
            addCriterion("C_APPROVAL_ROUTING like", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingNotLike(String value) {
            addCriterion("C_APPROVAL_ROUTING not like", value, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingIn(List<String> values) {
            addCriterion("C_APPROVAL_ROUTING in", values, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingNotIn(List<String> values) {
            addCriterion("C_APPROVAL_ROUTING not in", values, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingBetween(String value1, String value2) {
            addCriterion("C_APPROVAL_ROUTING between", value1, value2, "cApprovalRouting");
            return (Criteria) this;
        }

        public Criteria andCApprovalRoutingNotBetween(String value1, String value2) {
            addCriterion("C_APPROVAL_ROUTING not between", value1, value2, "cApprovalRouting");
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