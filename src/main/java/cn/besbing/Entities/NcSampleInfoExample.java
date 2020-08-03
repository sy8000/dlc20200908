package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NcSampleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcSampleInfoExample() {
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

        public Criteria andPkSampleInfoIsNull() {
            addCriterion("PK_SAMPLE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoIsNotNull() {
            addCriterion("PK_SAMPLE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoEqualTo(String value) {
            addCriterion("PK_SAMPLE_INFO =", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoNotEqualTo(String value) {
            addCriterion("PK_SAMPLE_INFO <>", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoGreaterThan(String value) {
            addCriterion("PK_SAMPLE_INFO >", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PK_SAMPLE_INFO >=", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoLessThan(String value) {
            addCriterion("PK_SAMPLE_INFO <", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoLessThanOrEqualTo(String value) {
            addCriterion("PK_SAMPLE_INFO <=", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoLike(String value) {
            addCriterion("PK_SAMPLE_INFO like", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoNotLike(String value) {
            addCriterion("PK_SAMPLE_INFO not like", value, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoIn(List<String> values) {
            addCriterion("PK_SAMPLE_INFO in", values, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoNotIn(List<String> values) {
            addCriterion("PK_SAMPLE_INFO not in", values, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoBetween(String value1, String value2) {
            addCriterion("PK_SAMPLE_INFO between", value1, value2, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkSampleInfoNotBetween(String value1, String value2) {
            addCriterion("PK_SAMPLE_INFO not between", value1, value2, "pkSampleInfo");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeIsNull() {
            addCriterion("PK_PROD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeIsNotNull() {
            addCriterion("PK_PROD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeEqualTo(String value) {
            addCriterion("PK_PROD_TYPE =", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeNotEqualTo(String value) {
            addCriterion("PK_PROD_TYPE <>", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeGreaterThan(String value) {
            addCriterion("PK_PROD_TYPE >", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PROD_TYPE >=", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeLessThan(String value) {
            addCriterion("PK_PROD_TYPE <", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeLessThanOrEqualTo(String value) {
            addCriterion("PK_PROD_TYPE <=", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeLike(String value) {
            addCriterion("PK_PROD_TYPE like", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeNotLike(String value) {
            addCriterion("PK_PROD_TYPE not like", value, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeIn(List<String> values) {
            addCriterion("PK_PROD_TYPE in", values, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeNotIn(List<String> values) {
            addCriterion("PK_PROD_TYPE not in", values, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeBetween(String value1, String value2) {
            addCriterion("PK_PROD_TYPE between", value1, value2, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkProdTypeNotBetween(String value1, String value2) {
            addCriterion("PK_PROD_TYPE not between", value1, value2, "pkProdType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameIsNull() {
            addCriterion("PK_BASPROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameIsNotNull() {
            addCriterion("PK_BASPROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameEqualTo(String value) {
            addCriterion("PK_BASPROD_NAME =", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameNotEqualTo(String value) {
            addCriterion("PK_BASPROD_NAME <>", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameGreaterThan(String value) {
            addCriterion("PK_BASPROD_NAME >", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_NAME >=", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameLessThan(String value) {
            addCriterion("PK_BASPROD_NAME <", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameLessThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_NAME <=", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameLike(String value) {
            addCriterion("PK_BASPROD_NAME like", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameNotLike(String value) {
            addCriterion("PK_BASPROD_NAME not like", value, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameIn(List<String> values) {
            addCriterion("PK_BASPROD_NAME in", values, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameNotIn(List<String> values) {
            addCriterion("PK_BASPROD_NAME not in", values, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_NAME between", value1, value2, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodNameNotBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_NAME not between", value1, value2, "pkBasprodName");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeIsNull() {
            addCriterion("PK_BASPROD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeIsNotNull() {
            addCriterion("PK_BASPROD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeEqualTo(String value) {
            addCriterion("PK_BASPROD_TYPE =", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeNotEqualTo(String value) {
            addCriterion("PK_BASPROD_TYPE <>", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeGreaterThan(String value) {
            addCriterion("PK_BASPROD_TYPE >", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_TYPE >=", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeLessThan(String value) {
            addCriterion("PK_BASPROD_TYPE <", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeLessThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_TYPE <=", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeLike(String value) {
            addCriterion("PK_BASPROD_TYPE like", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeNotLike(String value) {
            addCriterion("PK_BASPROD_TYPE not like", value, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeIn(List<String> values) {
            addCriterion("PK_BASPROD_TYPE in", values, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeNotIn(List<String> values) {
            addCriterion("PK_BASPROD_TYPE not in", values, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_TYPE between", value1, value2, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTypeNotBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_TYPE not between", value1, value2, "pkBasprodType");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointIsNull() {
            addCriterion("PK_BASPROD_POINT is null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointIsNotNull() {
            addCriterion("PK_BASPROD_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointEqualTo(String value) {
            addCriterion("PK_BASPROD_POINT =", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointNotEqualTo(String value) {
            addCriterion("PK_BASPROD_POINT <>", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointGreaterThan(String value) {
            addCriterion("PK_BASPROD_POINT >", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_POINT >=", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointLessThan(String value) {
            addCriterion("PK_BASPROD_POINT <", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointLessThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_POINT <=", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointLike(String value) {
            addCriterion("PK_BASPROD_POINT like", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointNotLike(String value) {
            addCriterion("PK_BASPROD_POINT not like", value, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointIn(List<String> values) {
            addCriterion("PK_BASPROD_POINT in", values, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointNotIn(List<String> values) {
            addCriterion("PK_BASPROD_POINT not in", values, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_POINT between", value1, value2, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodPointNotBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_POINT not between", value1, value2, "pkBasprodPoint");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructIsNull() {
            addCriterion("PK_BASPROD_STRUCT is null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructIsNotNull() {
            addCriterion("PK_BASPROD_STRUCT is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructEqualTo(String value) {
            addCriterion("PK_BASPROD_STRUCT =", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructNotEqualTo(String value) {
            addCriterion("PK_BASPROD_STRUCT <>", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructGreaterThan(String value) {
            addCriterion("PK_BASPROD_STRUCT >", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_STRUCT >=", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructLessThan(String value) {
            addCriterion("PK_BASPROD_STRUCT <", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructLessThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_STRUCT <=", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructLike(String value) {
            addCriterion("PK_BASPROD_STRUCT like", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructNotLike(String value) {
            addCriterion("PK_BASPROD_STRUCT not like", value, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructIn(List<String> values) {
            addCriterion("PK_BASPROD_STRUCT in", values, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructNotIn(List<String> values) {
            addCriterion("PK_BASPROD_STRUCT not in", values, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_STRUCT between", value1, value2, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodStructNotBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_STRUCT not between", value1, value2, "pkBasprodStruct");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactIsNull() {
            addCriterion("PK_BASPROD_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactIsNotNull() {
            addCriterion("PK_BASPROD_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactEqualTo(String value) {
            addCriterion("PK_BASPROD_CONTACT =", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactNotEqualTo(String value) {
            addCriterion("PK_BASPROD_CONTACT <>", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactGreaterThan(String value) {
            addCriterion("PK_BASPROD_CONTACT >", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_CONTACT >=", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactLessThan(String value) {
            addCriterion("PK_BASPROD_CONTACT <", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactLessThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_CONTACT <=", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactLike(String value) {
            addCriterion("PK_BASPROD_CONTACT like", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactNotLike(String value) {
            addCriterion("PK_BASPROD_CONTACT not like", value, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactIn(List<String> values) {
            addCriterion("PK_BASPROD_CONTACT in", values, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactNotIn(List<String> values) {
            addCriterion("PK_BASPROD_CONTACT not in", values, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_CONTACT between", value1, value2, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodContactNotBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_CONTACT not between", value1, value2, "pkBasprodContact");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempIsNull() {
            addCriterion("PK_BASPROD_TEMP is null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempIsNotNull() {
            addCriterion("PK_BASPROD_TEMP is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempEqualTo(String value) {
            addCriterion("PK_BASPROD_TEMP =", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempNotEqualTo(String value) {
            addCriterion("PK_BASPROD_TEMP <>", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempGreaterThan(String value) {
            addCriterion("PK_BASPROD_TEMP >", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_TEMP >=", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempLessThan(String value) {
            addCriterion("PK_BASPROD_TEMP <", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempLessThanOrEqualTo(String value) {
            addCriterion("PK_BASPROD_TEMP <=", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempLike(String value) {
            addCriterion("PK_BASPROD_TEMP like", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempNotLike(String value) {
            addCriterion("PK_BASPROD_TEMP not like", value, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempIn(List<String> values) {
            addCriterion("PK_BASPROD_TEMP in", values, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempNotIn(List<String> values) {
            addCriterion("PK_BASPROD_TEMP not in", values, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_TEMP between", value1, value2, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasprodTempNotBetween(String value1, String value2) {
            addCriterion("PK_BASPROD_TEMP not between", value1, value2, "pkBasprodTemp");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeIsNull() {
            addCriterion("PK_BASEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeIsNotNull() {
            addCriterion("PK_BASEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeEqualTo(String value) {
            addCriterion("PK_BASEN_TYPE =", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeNotEqualTo(String value) {
            addCriterion("PK_BASEN_TYPE <>", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeGreaterThan(String value) {
            addCriterion("PK_BASEN_TYPE >", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BASEN_TYPE >=", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeLessThan(String value) {
            addCriterion("PK_BASEN_TYPE <", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeLessThanOrEqualTo(String value) {
            addCriterion("PK_BASEN_TYPE <=", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeLike(String value) {
            addCriterion("PK_BASEN_TYPE like", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeNotLike(String value) {
            addCriterion("PK_BASEN_TYPE not like", value, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeIn(List<String> values) {
            addCriterion("PK_BASEN_TYPE in", values, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeNotIn(List<String> values) {
            addCriterion("PK_BASEN_TYPE not in", values, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeBetween(String value1, String value2) {
            addCriterion("PK_BASEN_TYPE between", value1, value2, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andPkBasenTypeNotBetween(String value1, String value2) {
            addCriterion("PK_BASEN_TYPE not between", value1, value2, "pkBasenType");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeIsNull() {
            addCriterion("SAMPLE_INFO_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeIsNotNull() {
            addCriterion("SAMPLE_INFO_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeEqualTo(String value) {
            addCriterion("SAMPLE_INFO_CODE =", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeNotEqualTo(String value) {
            addCriterion("SAMPLE_INFO_CODE <>", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeGreaterThan(String value) {
            addCriterion("SAMPLE_INFO_CODE >", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_INFO_CODE >=", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeLessThan(String value) {
            addCriterion("SAMPLE_INFO_CODE <", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_INFO_CODE <=", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeLike(String value) {
            addCriterion("SAMPLE_INFO_CODE like", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeNotLike(String value) {
            addCriterion("SAMPLE_INFO_CODE not like", value, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeIn(List<String> values) {
            addCriterion("SAMPLE_INFO_CODE in", values, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeNotIn(List<String> values) {
            addCriterion("SAMPLE_INFO_CODE not in", values, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeBetween(String value1, String value2) {
            addCriterion("SAMPLE_INFO_CODE between", value1, value2, "sampleInfoCode");
            return (Criteria) this;
        }

        public Criteria andSampleInfoCodeNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_INFO_CODE not between", value1, value2, "sampleInfoCode");
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

        public Criteria andCProdTypeC1IsNull() {
            addCriterion("C_PROD_TYPE_C1 is null");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1IsNotNull() {
            addCriterion("C_PROD_TYPE_C1 is not null");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1EqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 =", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 <>", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1GreaterThan(String value) {
            addCriterion("C_PROD_TYPE_C1 >", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1GreaterThanOrEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 >=", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1LessThan(String value) {
            addCriterion("C_PROD_TYPE_C1 <", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1LessThanOrEqualTo(String value) {
            addCriterion("C_PROD_TYPE_C1 <=", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1Like(String value) {
            addCriterion("C_PROD_TYPE_C1 like", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotLike(String value) {
            addCriterion("C_PROD_TYPE_C1 not like", value, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1In(List<String> values) {
            addCriterion("C_PROD_TYPE_C1 in", values, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotIn(List<String> values) {
            addCriterion("C_PROD_TYPE_C1 not in", values, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1Between(String value1, String value2) {
            addCriterion("C_PROD_TYPE_C1 between", value1, value2, "cProdTypeC1");
            return (Criteria) this;
        }

        public Criteria andCProdTypeC1NotBetween(String value1, String value2) {
            addCriterion("C_PROD_TYPE_C1 not between", value1, value2, "cProdTypeC1");
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

        public Criteria andEnstardIsNull() {
            addCriterion("ENSTARD is null");
            return (Criteria) this;
        }

        public Criteria andEnstardIsNotNull() {
            addCriterion("ENSTARD is not null");
            return (Criteria) this;
        }

        public Criteria andEnstardEqualTo(String value) {
            addCriterion("ENSTARD =", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardNotEqualTo(String value) {
            addCriterion("ENSTARD <>", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardGreaterThan(String value) {
            addCriterion("ENSTARD >", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardGreaterThanOrEqualTo(String value) {
            addCriterion("ENSTARD >=", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardLessThan(String value) {
            addCriterion("ENSTARD <", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardLessThanOrEqualTo(String value) {
            addCriterion("ENSTARD <=", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardLike(String value) {
            addCriterion("ENSTARD like", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardNotLike(String value) {
            addCriterion("ENSTARD not like", value, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardIn(List<String> values) {
            addCriterion("ENSTARD in", values, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardNotIn(List<String> values) {
            addCriterion("ENSTARD not in", values, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardBetween(String value1, String value2) {
            addCriterion("ENSTARD between", value1, value2, "enstard");
            return (Criteria) this;
        }

        public Criteria andEnstardNotBetween(String value1, String value2) {
            addCriterion("ENSTARD not between", value1, value2, "enstard");
            return (Criteria) this;
        }

        public Criteria andTestListIsNull() {
            addCriterion("TEST_LIST is null");
            return (Criteria) this;
        }

        public Criteria andTestListIsNotNull() {
            addCriterion("TEST_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andTestListEqualTo(String value) {
            addCriterion("TEST_LIST =", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotEqualTo(String value) {
            addCriterion("TEST_LIST <>", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListGreaterThan(String value) {
            addCriterion("TEST_LIST >", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_LIST >=", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLessThan(String value) {
            addCriterion("TEST_LIST <", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLessThanOrEqualTo(String value) {
            addCriterion("TEST_LIST <=", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListLike(String value) {
            addCriterion("TEST_LIST like", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotLike(String value) {
            addCriterion("TEST_LIST not like", value, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListIn(List<String> values) {
            addCriterion("TEST_LIST in", values, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotIn(List<String> values) {
            addCriterion("TEST_LIST not in", values, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListBetween(String value1, String value2) {
            addCriterion("TEST_LIST between", value1, value2, "testList");
            return (Criteria) this;
        }

        public Criteria andTestListNotBetween(String value1, String value2) {
            addCriterion("TEST_LIST not between", value1, value2, "testList");
            return (Criteria) this;
        }

        public Criteria andSamplingPointIsNull() {
            addCriterion("SAMPLING_POINT is null");
            return (Criteria) this;
        }

        public Criteria andSamplingPointIsNotNull() {
            addCriterion("SAMPLING_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andSamplingPointEqualTo(String value) {
            addCriterion("SAMPLING_POINT =", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotEqualTo(String value) {
            addCriterion("SAMPLING_POINT <>", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointGreaterThan(String value) {
            addCriterion("SAMPLING_POINT >", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLING_POINT >=", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointLessThan(String value) {
            addCriterion("SAMPLING_POINT <", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointLessThanOrEqualTo(String value) {
            addCriterion("SAMPLING_POINT <=", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointLike(String value) {
            addCriterion("SAMPLING_POINT like", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotLike(String value) {
            addCriterion("SAMPLING_POINT not like", value, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointIn(List<String> values) {
            addCriterion("SAMPLING_POINT in", values, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotIn(List<String> values) {
            addCriterion("SAMPLING_POINT not in", values, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointBetween(String value1, String value2) {
            addCriterion("SAMPLING_POINT between", value1, value2, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andSamplingPointNotBetween(String value1, String value2) {
            addCriterion("SAMPLING_POINT not between", value1, value2, "samplingPoint");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactIsNull() {
            addCriterion("C_ALLOWED_CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactIsNotNull() {
            addCriterion("C_ALLOWED_CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT =", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT <>", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactGreaterThan(String value) {
            addCriterion("C_ALLOWED_CONTACT >", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactGreaterThanOrEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT >=", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactLessThan(String value) {
            addCriterion("C_ALLOWED_CONTACT <", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactLessThanOrEqualTo(String value) {
            addCriterion("C_ALLOWED_CONTACT <=", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactLike(String value) {
            addCriterion("C_ALLOWED_CONTACT like", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotLike(String value) {
            addCriterion("C_ALLOWED_CONTACT not like", value, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactIn(List<String> values) {
            addCriterion("C_ALLOWED_CONTACT in", values, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotIn(List<String> values) {
            addCriterion("C_ALLOWED_CONTACT not in", values, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactBetween(String value1, String value2) {
            addCriterion("C_ALLOWED_CONTACT between", value1, value2, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andCAllowedContactNotBetween(String value1, String value2) {
            addCriterion("C_ALLOWED_CONTACT not between", value1, value2, "cAllowedContact");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("STAGE is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("STAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("STAGE =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("STAGE <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("STAGE >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("STAGE >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("STAGE <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("STAGE <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("STAGE like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("STAGE not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("STAGE in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("STAGE not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("STAGE between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("STAGE not between", value1, value2, "stage");
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