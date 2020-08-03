package cn.besbing.Entities;

import java.util.ArrayList;
import java.util.List;

public class NcBasprodNameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NcBasprodNameExample() {
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

        public Criteria andNcBasprodCodeIsNull() {
            addCriterion("NC_BASPROD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeIsNotNull() {
            addCriterion("NC_BASPROD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeEqualTo(String value) {
            addCriterion("NC_BASPROD_CODE =", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeNotEqualTo(String value) {
            addCriterion("NC_BASPROD_CODE <>", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeGreaterThan(String value) {
            addCriterion("NC_BASPROD_CODE >", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NC_BASPROD_CODE >=", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeLessThan(String value) {
            addCriterion("NC_BASPROD_CODE <", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeLessThanOrEqualTo(String value) {
            addCriterion("NC_BASPROD_CODE <=", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeLike(String value) {
            addCriterion("NC_BASPROD_CODE like", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeNotLike(String value) {
            addCriterion("NC_BASPROD_CODE not like", value, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeIn(List<String> values) {
            addCriterion("NC_BASPROD_CODE in", values, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeNotIn(List<String> values) {
            addCriterion("NC_BASPROD_CODE not in", values, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeBetween(String value1, String value2) {
            addCriterion("NC_BASPROD_CODE between", value1, value2, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodCodeNotBetween(String value1, String value2) {
            addCriterion("NC_BASPROD_CODE not between", value1, value2, "ncBasprodCode");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameIsNull() {
            addCriterion("NC_BASPROD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameIsNotNull() {
            addCriterion("NC_BASPROD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameEqualTo(String value) {
            addCriterion("NC_BASPROD_NAME =", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameNotEqualTo(String value) {
            addCriterion("NC_BASPROD_NAME <>", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameGreaterThan(String value) {
            addCriterion("NC_BASPROD_NAME >", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameGreaterThanOrEqualTo(String value) {
            addCriterion("NC_BASPROD_NAME >=", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameLessThan(String value) {
            addCriterion("NC_BASPROD_NAME <", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameLessThanOrEqualTo(String value) {
            addCriterion("NC_BASPROD_NAME <=", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameLike(String value) {
            addCriterion("NC_BASPROD_NAME like", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameNotLike(String value) {
            addCriterion("NC_BASPROD_NAME not like", value, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameIn(List<String> values) {
            addCriterion("NC_BASPROD_NAME in", values, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameNotIn(List<String> values) {
            addCriterion("NC_BASPROD_NAME not in", values, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameBetween(String value1, String value2) {
            addCriterion("NC_BASPROD_NAME between", value1, value2, "ncBasprodName");
            return (Criteria) this;
        }

        public Criteria andNcBasprodNameNotBetween(String value1, String value2) {
            addCriterion("NC_BASPROD_NAME not between", value1, value2, "ncBasprodName");
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