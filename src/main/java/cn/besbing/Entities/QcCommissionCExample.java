package cn.besbing.Entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class QcCommissionCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QcCommissionCExample() {
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

        public Criteria andPkCommissionCIsNull() {
            addCriterion("PK_COMMISSION_C is null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCIsNotNull() {
            addCriterion("PK_COMMISSION_C is not null");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCEqualTo(String value) {
            addCriterion("PK_COMMISSION_C =", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCNotEqualTo(String value) {
            addCriterion("PK_COMMISSION_C <>", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCGreaterThan(String value) {
            addCriterion("PK_COMMISSION_C >", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_C >=", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCLessThan(String value) {
            addCriterion("PK_COMMISSION_C <", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCLessThanOrEqualTo(String value) {
            addCriterion("PK_COMMISSION_C <=", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCLike(String value) {
            addCriterion("PK_COMMISSION_C like", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCNotLike(String value) {
            addCriterion("PK_COMMISSION_C not like", value, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCIn(List<String> values) {
            addCriterion("PK_COMMISSION_C in", values, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCNotIn(List<String> values) {
            addCriterion("PK_COMMISSION_C not in", values, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_C between", value1, value2, "pkCommissionC");
            return (Criteria) this;
        }

        public Criteria andPkCommissionCNotBetween(String value1, String value2) {
            addCriterion("PK_COMMISSION_C not between", value1, value2, "pkCommissionC");
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

        public Criteria andRownoEqualTo(String value) {
            addCriterion("ROWNO =", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotEqualTo(String value) {
            addCriterion("ROWNO <>", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThan(String value) {
            addCriterion("ROWNO >", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoGreaterThanOrEqualTo(String value) {
            addCriterion("ROWNO >=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThan(String value) {
            addCriterion("ROWNO <", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLessThanOrEqualTo(String value) {
            addCriterion("ROWNO <=", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoLike(String value) {
            addCriterion("ROWNO like", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotLike(String value) {
            addCriterion("ROWNO not like", value, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoIn(List<String> values) {
            addCriterion("ROWNO in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotIn(List<String> values) {
            addCriterion("ROWNO not in", values, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoBetween(String value1, String value2) {
            addCriterion("ROWNO between", value1, value2, "rowno");
            return (Criteria) this;
        }

        public Criteria andRownoNotBetween(String value1, String value2) {
            addCriterion("ROWNO not between", value1, value2, "rowno");
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

        public Criteria andItemnameIsNull() {
            addCriterion("ITEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andItemnameIsNotNull() {
            addCriterion("ITEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemnameEqualTo(String value) {
            addCriterion("ITEMNAME =", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotEqualTo(String value) {
            addCriterion("ITEMNAME <>", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThan(String value) {
            addCriterion("ITEMNAME >", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMNAME >=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThan(String value) {
            addCriterion("ITEMNAME <", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLessThanOrEqualTo(String value) {
            addCriterion("ITEMNAME <=", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameLike(String value) {
            addCriterion("ITEMNAME like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotLike(String value) {
            addCriterion("ITEMNAME not like", value, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameIn(List<String> values) {
            addCriterion("ITEMNAME in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotIn(List<String> values) {
            addCriterion("ITEMNAME not in", values, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameBetween(String value1, String value2) {
            addCriterion("ITEMNAME between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andItemnameNotBetween(String value1, String value2) {
            addCriterion("ITEMNAME not between", value1, value2, "itemname");
            return (Criteria) this;
        }

        public Criteria andOldvalueIsNull() {
            addCriterion("OLDVALUE is null");
            return (Criteria) this;
        }

        public Criteria andOldvalueIsNotNull() {
            addCriterion("OLDVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andOldvalueEqualTo(String value) {
            addCriterion("OLDVALUE =", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotEqualTo(String value) {
            addCriterion("OLDVALUE <>", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueGreaterThan(String value) {
            addCriterion("OLDVALUE >", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueGreaterThanOrEqualTo(String value) {
            addCriterion("OLDVALUE >=", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLessThan(String value) {
            addCriterion("OLDVALUE <", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLessThanOrEqualTo(String value) {
            addCriterion("OLDVALUE <=", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLike(String value) {
            addCriterion("OLDVALUE like", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotLike(String value) {
            addCriterion("OLDVALUE not like", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueIn(List<String> values) {
            addCriterion("OLDVALUE in", values, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotIn(List<String> values) {
            addCriterion("OLDVALUE not in", values, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueBetween(String value1, String value2) {
            addCriterion("OLDVALUE between", value1, value2, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotBetween(String value1, String value2) {
            addCriterion("OLDVALUE not between", value1, value2, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueIsNull() {
            addCriterion("NEWVALUE is null");
            return (Criteria) this;
        }

        public Criteria andNewvalueIsNotNull() {
            addCriterion("NEWVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNewvalueEqualTo(String value) {
            addCriterion("NEWVALUE =", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotEqualTo(String value) {
            addCriterion("NEWVALUE <>", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueGreaterThan(String value) {
            addCriterion("NEWVALUE >", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueGreaterThanOrEqualTo(String value) {
            addCriterion("NEWVALUE >=", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLessThan(String value) {
            addCriterion("NEWVALUE <", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLessThanOrEqualTo(String value) {
            addCriterion("NEWVALUE <=", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLike(String value) {
            addCriterion("NEWVALUE like", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotLike(String value) {
            addCriterion("NEWVALUE not like", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueIn(List<String> values) {
            addCriterion("NEWVALUE in", values, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotIn(List<String> values) {
            addCriterion("NEWVALUE not in", values, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueBetween(String value1, String value2) {
            addCriterion("NEWVALUE between", value1, value2, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotBetween(String value1, String value2) {
            addCriterion("NEWVALUE not between", value1, value2, "newvalue");
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