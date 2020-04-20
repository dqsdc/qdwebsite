package cn.anpe.website.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(String value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(String value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(String value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(String value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(String value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(String value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLike(String value) {
            addCriterion("pid like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotLike(String value) {
            addCriterion("pid not like", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<String> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<String> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(String value1, String value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(String value1, String value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNull() {
            addCriterion("series is null");
            return (Criteria) this;
        }

        public Criteria andSeriesIsNotNull() {
            addCriterion("series is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesEqualTo(String value) {
            addCriterion("series =", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotEqualTo(String value) {
            addCriterion("series <>", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThan(String value) {
            addCriterion("series >", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesGreaterThanOrEqualTo(String value) {
            addCriterion("series >=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThan(String value) {
            addCriterion("series <", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLessThanOrEqualTo(String value) {
            addCriterion("series <=", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesLike(String value) {
            addCriterion("series like", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotLike(String value) {
            addCriterion("series not like", value, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesIn(List<String> values) {
            addCriterion("series in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotIn(List<String> values) {
            addCriterion("series not in", values, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesBetween(String value1, String value2) {
            addCriterion("series between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andSeriesNotBetween(String value1, String value2) {
            addCriterion("series not between", value1, value2, "series");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andThumbImgIsNull() {
            addCriterion("thumb_img is null");
            return (Criteria) this;
        }

        public Criteria andThumbImgIsNotNull() {
            addCriterion("thumb_img is not null");
            return (Criteria) this;
        }

        public Criteria andThumbImgEqualTo(String value) {
            addCriterion("thumb_img =", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotEqualTo(String value) {
            addCriterion("thumb_img <>", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgGreaterThan(String value) {
            addCriterion("thumb_img >", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgGreaterThanOrEqualTo(String value) {
            addCriterion("thumb_img >=", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgLessThan(String value) {
            addCriterion("thumb_img <", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgLessThanOrEqualTo(String value) {
            addCriterion("thumb_img <=", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgLike(String value) {
            addCriterion("thumb_img like", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotLike(String value) {
            addCriterion("thumb_img not like", value, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgIn(List<String> values) {
            addCriterion("thumb_img in", values, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotIn(List<String> values) {
            addCriterion("thumb_img not in", values, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgBetween(String value1, String value2) {
            addCriterion("thumb_img between", value1, value2, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andThumbImgNotBetween(String value1, String value2) {
            addCriterion("thumb_img not between", value1, value2, "thumbImg");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andInputIsNull() {
            addCriterion("input is null");
            return (Criteria) this;
        }

        public Criteria andInputIsNotNull() {
            addCriterion("input is not null");
            return (Criteria) this;
        }

        public Criteria andInputEqualTo(String value) {
            addCriterion("input =", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotEqualTo(String value) {
            addCriterion("input <>", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputGreaterThan(String value) {
            addCriterion("input >", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputGreaterThanOrEqualTo(String value) {
            addCriterion("input >=", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputLessThan(String value) {
            addCriterion("input <", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputLessThanOrEqualTo(String value) {
            addCriterion("input <=", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputLike(String value) {
            addCriterion("input like", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotLike(String value) {
            addCriterion("input not like", value, "input");
            return (Criteria) this;
        }

        public Criteria andInputIn(List<String> values) {
            addCriterion("input in", values, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotIn(List<String> values) {
            addCriterion("input not in", values, "input");
            return (Criteria) this;
        }

        public Criteria andInputBetween(String value1, String value2) {
            addCriterion("input between", value1, value2, "input");
            return (Criteria) this;
        }

        public Criteria andInputNotBetween(String value1, String value2) {
            addCriterion("input not between", value1, value2, "input");
            return (Criteria) this;
        }

        public Criteria andOutputIsNull() {
            addCriterion("output is null");
            return (Criteria) this;
        }

        public Criteria andOutputIsNotNull() {
            addCriterion("output is not null");
            return (Criteria) this;
        }

        public Criteria andOutputEqualTo(String value) {
            addCriterion("output =", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotEqualTo(String value) {
            addCriterion("output <>", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThan(String value) {
            addCriterion("output >", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputGreaterThanOrEqualTo(String value) {
            addCriterion("output >=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThan(String value) {
            addCriterion("output <", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLessThanOrEqualTo(String value) {
            addCriterion("output <=", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputLike(String value) {
            addCriterion("output like", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotLike(String value) {
            addCriterion("output not like", value, "output");
            return (Criteria) this;
        }

        public Criteria andOutputIn(List<String> values) {
            addCriterion("output in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotIn(List<String> values) {
            addCriterion("output not in", values, "output");
            return (Criteria) this;
        }

        public Criteria andOutputBetween(String value1, String value2) {
            addCriterion("output between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andOutputNotBetween(String value1, String value2) {
            addCriterion("output not between", value1, value2, "output");
            return (Criteria) this;
        }

        public Criteria andLoadAllowIsNull() {
            addCriterion("load_allow is null");
            return (Criteria) this;
        }

        public Criteria andLoadAllowIsNotNull() {
            addCriterion("load_allow is not null");
            return (Criteria) this;
        }

        public Criteria andLoadAllowEqualTo(String value) {
            addCriterion("load_allow =", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowNotEqualTo(String value) {
            addCriterion("load_allow <>", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowGreaterThan(String value) {
            addCriterion("load_allow >", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowGreaterThanOrEqualTo(String value) {
            addCriterion("load_allow >=", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowLessThan(String value) {
            addCriterion("load_allow <", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowLessThanOrEqualTo(String value) {
            addCriterion("load_allow <=", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowLike(String value) {
            addCriterion("load_allow like", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowNotLike(String value) {
            addCriterion("load_allow not like", value, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowIn(List<String> values) {
            addCriterion("load_allow in", values, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowNotIn(List<String> values) {
            addCriterion("load_allow not in", values, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowBetween(String value1, String value2) {
            addCriterion("load_allow between", value1, value2, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andLoadAllowNotBetween(String value1, String value2) {
            addCriterion("load_allow not between", value1, value2, "loadAllow");
            return (Criteria) this;
        }

        public Criteria andTemDriftIsNull() {
            addCriterion("tem_drift is null");
            return (Criteria) this;
        }

        public Criteria andTemDriftIsNotNull() {
            addCriterion("tem_drift is not null");
            return (Criteria) this;
        }

        public Criteria andTemDriftEqualTo(String value) {
            addCriterion("tem_drift =", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftNotEqualTo(String value) {
            addCriterion("tem_drift <>", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftGreaterThan(String value) {
            addCriterion("tem_drift >", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftGreaterThanOrEqualTo(String value) {
            addCriterion("tem_drift >=", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftLessThan(String value) {
            addCriterion("tem_drift <", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftLessThanOrEqualTo(String value) {
            addCriterion("tem_drift <=", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftLike(String value) {
            addCriterion("tem_drift like", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftNotLike(String value) {
            addCriterion("tem_drift not like", value, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftIn(List<String> values) {
            addCriterion("tem_drift in", values, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftNotIn(List<String> values) {
            addCriterion("tem_drift not in", values, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftBetween(String value1, String value2) {
            addCriterion("tem_drift between", value1, value2, "temDrift");
            return (Criteria) this;
        }

        public Criteria andTemDriftNotBetween(String value1, String value2) {
            addCriterion("tem_drift not between", value1, value2, "temDrift");
            return (Criteria) this;
        }

        public Criteria andResponseIsNull() {
            addCriterion("response is null");
            return (Criteria) this;
        }

        public Criteria andResponseIsNotNull() {
            addCriterion("response is not null");
            return (Criteria) this;
        }

        public Criteria andResponseEqualTo(String value) {
            addCriterion("response =", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotEqualTo(String value) {
            addCriterion("response <>", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThan(String value) {
            addCriterion("response >", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseGreaterThanOrEqualTo(String value) {
            addCriterion("response >=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThan(String value) {
            addCriterion("response <", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLessThanOrEqualTo(String value) {
            addCriterion("response <=", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseLike(String value) {
            addCriterion("response like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotLike(String value) {
            addCriterion("response not like", value, "response");
            return (Criteria) this;
        }

        public Criteria andResponseIn(List<String> values) {
            addCriterion("response in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotIn(List<String> values) {
            addCriterion("response not in", values, "response");
            return (Criteria) this;
        }

        public Criteria andResponseBetween(String value1, String value2) {
            addCriterion("response between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andResponseNotBetween(String value1, String value2) {
            addCriterion("response not between", value1, value2, "response");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNull() {
            addCriterion("consumption is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNotNull() {
            addCriterion("consumption is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionEqualTo(String value) {
            addCriterion("consumption =", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotEqualTo(String value) {
            addCriterion("consumption <>", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThan(String value) {
            addCriterion("consumption >", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThanOrEqualTo(String value) {
            addCriterion("consumption >=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThan(String value) {
            addCriterion("consumption <", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThanOrEqualTo(String value) {
            addCriterion("consumption <=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLike(String value) {
            addCriterion("consumption like", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotLike(String value) {
            addCriterion("consumption not like", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionIn(List<String> values) {
            addCriterion("consumption in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotIn(List<String> values) {
            addCriterion("consumption not in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionBetween(String value1, String value2) {
            addCriterion("consumption between", value1, value2, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotBetween(String value1, String value2) {
            addCriterion("consumption not between", value1, value2, "consumption");
            return (Criteria) this;
        }

        public Criteria andWorkTemIsNull() {
            addCriterion("work_tem is null");
            return (Criteria) this;
        }

        public Criteria andWorkTemIsNotNull() {
            addCriterion("work_tem is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTemEqualTo(String value) {
            addCriterion("work_tem =", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemNotEqualTo(String value) {
            addCriterion("work_tem <>", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemGreaterThan(String value) {
            addCriterion("work_tem >", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemGreaterThanOrEqualTo(String value) {
            addCriterion("work_tem >=", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemLessThan(String value) {
            addCriterion("work_tem <", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemLessThanOrEqualTo(String value) {
            addCriterion("work_tem <=", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemLike(String value) {
            addCriterion("work_tem like", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemNotLike(String value) {
            addCriterion("work_tem not like", value, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemIn(List<String> values) {
            addCriterion("work_tem in", values, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemNotIn(List<String> values) {
            addCriterion("work_tem not in", values, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemBetween(String value1, String value2) {
            addCriterion("work_tem between", value1, value2, "workTem");
            return (Criteria) this;
        }

        public Criteria andWorkTemNotBetween(String value1, String value2) {
            addCriterion("work_tem not between", value1, value2, "workTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemIsNull() {
            addCriterion("storage_tem is null");
            return (Criteria) this;
        }

        public Criteria andStorageTemIsNotNull() {
            addCriterion("storage_tem is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTemEqualTo(String value) {
            addCriterion("storage_tem =", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemNotEqualTo(String value) {
            addCriterion("storage_tem <>", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemGreaterThan(String value) {
            addCriterion("storage_tem >", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemGreaterThanOrEqualTo(String value) {
            addCriterion("storage_tem >=", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemLessThan(String value) {
            addCriterion("storage_tem <", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemLessThanOrEqualTo(String value) {
            addCriterion("storage_tem <=", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemLike(String value) {
            addCriterion("storage_tem like", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemNotLike(String value) {
            addCriterion("storage_tem not like", value, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemIn(List<String> values) {
            addCriterion("storage_tem in", values, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemNotIn(List<String> values) {
            addCriterion("storage_tem not in", values, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemBetween(String value1, String value2) {
            addCriterion("storage_tem between", value1, value2, "storageTem");
            return (Criteria) this;
        }

        public Criteria andStorageTemNotBetween(String value1, String value2) {
            addCriterion("storage_tem not between", value1, value2, "storageTem");
            return (Criteria) this;
        }

        public Criteria andAppPlaceIsNull() {
            addCriterion("app_place is null");
            return (Criteria) this;
        }

        public Criteria andAppPlaceIsNotNull() {
            addCriterion("app_place is not null");
            return (Criteria) this;
        }

        public Criteria andAppPlaceEqualTo(String value) {
            addCriterion("app_place =", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceNotEqualTo(String value) {
            addCriterion("app_place <>", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceGreaterThan(String value) {
            addCriterion("app_place >", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("app_place >=", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceLessThan(String value) {
            addCriterion("app_place <", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceLessThanOrEqualTo(String value) {
            addCriterion("app_place <=", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceLike(String value) {
            addCriterion("app_place like", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceNotLike(String value) {
            addCriterion("app_place not like", value, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceIn(List<String> values) {
            addCriterion("app_place in", values, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceNotIn(List<String> values) {
            addCriterion("app_place not in", values, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceBetween(String value1, String value2) {
            addCriterion("app_place between", value1, value2, "appPlace");
            return (Criteria) this;
        }

        public Criteria andAppPlaceNotBetween(String value1, String value2) {
            addCriterion("app_place not between", value1, value2, "appPlace");
            return (Criteria) this;
        }

        public Criteria andOutputStateIsNull() {
            addCriterion("output_state is null");
            return (Criteria) this;
        }

        public Criteria andOutputStateIsNotNull() {
            addCriterion("output_state is not null");
            return (Criteria) this;
        }

        public Criteria andOutputStateEqualTo(String value) {
            addCriterion("output_state =", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateNotEqualTo(String value) {
            addCriterion("output_state <>", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateGreaterThan(String value) {
            addCriterion("output_state >", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateGreaterThanOrEqualTo(String value) {
            addCriterion("output_state >=", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateLessThan(String value) {
            addCriterion("output_state <", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateLessThanOrEqualTo(String value) {
            addCriterion("output_state <=", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateLike(String value) {
            addCriterion("output_state like", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateNotLike(String value) {
            addCriterion("output_state not like", value, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateIn(List<String> values) {
            addCriterion("output_state in", values, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateNotIn(List<String> values) {
            addCriterion("output_state not in", values, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateBetween(String value1, String value2) {
            addCriterion("output_state between", value1, value2, "outputState");
            return (Criteria) this;
        }

        public Criteria andOutputStateNotBetween(String value1, String value2) {
            addCriterion("output_state not between", value1, value2, "outputState");
            return (Criteria) this;
        }

        public Criteria andElecIsNull() {
            addCriterion("elec is null");
            return (Criteria) this;
        }

        public Criteria andElecIsNotNull() {
            addCriterion("elec is not null");
            return (Criteria) this;
        }

        public Criteria andElecEqualTo(String value) {
            addCriterion("elec =", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecNotEqualTo(String value) {
            addCriterion("elec <>", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecGreaterThan(String value) {
            addCriterion("elec >", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecGreaterThanOrEqualTo(String value) {
            addCriterion("elec >=", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecLessThan(String value) {
            addCriterion("elec <", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecLessThanOrEqualTo(String value) {
            addCriterion("elec <=", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecLike(String value) {
            addCriterion("elec like", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecNotLike(String value) {
            addCriterion("elec not like", value, "elec");
            return (Criteria) this;
        }

        public Criteria andElecIn(List<String> values) {
            addCriterion("elec in", values, "elec");
            return (Criteria) this;
        }

        public Criteria andElecNotIn(List<String> values) {
            addCriterion("elec not in", values, "elec");
            return (Criteria) this;
        }

        public Criteria andElecBetween(String value1, String value2) {
            addCriterion("elec between", value1, value2, "elec");
            return (Criteria) this;
        }

        public Criteria andElecNotBetween(String value1, String value2) {
            addCriterion("elec not between", value1, value2, "elec");
            return (Criteria) this;
        }

        public Criteria andDielectricIsNull() {
            addCriterion("dielectric is null");
            return (Criteria) this;
        }

        public Criteria andDielectricIsNotNull() {
            addCriterion("dielectric is not null");
            return (Criteria) this;
        }

        public Criteria andDielectricEqualTo(String value) {
            addCriterion("dielectric =", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricNotEqualTo(String value) {
            addCriterion("dielectric <>", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricGreaterThan(String value) {
            addCriterion("dielectric >", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricGreaterThanOrEqualTo(String value) {
            addCriterion("dielectric >=", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricLessThan(String value) {
            addCriterion("dielectric <", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricLessThanOrEqualTo(String value) {
            addCriterion("dielectric <=", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricLike(String value) {
            addCriterion("dielectric like", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricNotLike(String value) {
            addCriterion("dielectric not like", value, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricIn(List<String> values) {
            addCriterion("dielectric in", values, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricNotIn(List<String> values) {
            addCriterion("dielectric not in", values, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricBetween(String value1, String value2) {
            addCriterion("dielectric between", value1, value2, "dielectric");
            return (Criteria) this;
        }

        public Criteria andDielectricNotBetween(String value1, String value2) {
            addCriterion("dielectric not between", value1, value2, "dielectric");
            return (Criteria) this;
        }

        public Criteria andInsulationIsNull() {
            addCriterion("insulation is null");
            return (Criteria) this;
        }

        public Criteria andInsulationIsNotNull() {
            addCriterion("insulation is not null");
            return (Criteria) this;
        }

        public Criteria andInsulationEqualTo(String value) {
            addCriterion("insulation =", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationNotEqualTo(String value) {
            addCriterion("insulation <>", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationGreaterThan(String value) {
            addCriterion("insulation >", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationGreaterThanOrEqualTo(String value) {
            addCriterion("insulation >=", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationLessThan(String value) {
            addCriterion("insulation <", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationLessThanOrEqualTo(String value) {
            addCriterion("insulation <=", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationLike(String value) {
            addCriterion("insulation like", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationNotLike(String value) {
            addCriterion("insulation not like", value, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationIn(List<String> values) {
            addCriterion("insulation in", values, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationNotIn(List<String> values) {
            addCriterion("insulation not in", values, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationBetween(String value1, String value2) {
            addCriterion("insulation between", value1, value2, "insulation");
            return (Criteria) this;
        }

        public Criteria andInsulationNotBetween(String value1, String value2) {
            addCriterion("insulation not between", value1, value2, "insulation");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleIsNull() {
            addCriterion("connection_style is null");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleIsNotNull() {
            addCriterion("connection_style is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleEqualTo(String value) {
            addCriterion("connection_style =", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleNotEqualTo(String value) {
            addCriterion("connection_style <>", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleGreaterThan(String value) {
            addCriterion("connection_style >", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleGreaterThanOrEqualTo(String value) {
            addCriterion("connection_style >=", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleLessThan(String value) {
            addCriterion("connection_style <", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleLessThanOrEqualTo(String value) {
            addCriterion("connection_style <=", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleLike(String value) {
            addCriterion("connection_style like", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleNotLike(String value) {
            addCriterion("connection_style not like", value, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleIn(List<String> values) {
            addCriterion("connection_style in", values, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleNotIn(List<String> values) {
            addCriterion("connection_style not in", values, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleBetween(String value1, String value2) {
            addCriterion("connection_style between", value1, value2, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andConnectionStyleNotBetween(String value1, String value2) {
            addCriterion("connection_style not between", value1, value2, "connectionStyle");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andInstallationIsNull() {
            addCriterion("installation is null");
            return (Criteria) this;
        }

        public Criteria andInstallationIsNotNull() {
            addCriterion("installation is not null");
            return (Criteria) this;
        }

        public Criteria andInstallationEqualTo(String value) {
            addCriterion("installation =", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationNotEqualTo(String value) {
            addCriterion("installation <>", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationGreaterThan(String value) {
            addCriterion("installation >", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationGreaterThanOrEqualTo(String value) {
            addCriterion("installation >=", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationLessThan(String value) {
            addCriterion("installation <", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationLessThanOrEqualTo(String value) {
            addCriterion("installation <=", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationLike(String value) {
            addCriterion("installation like", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationNotLike(String value) {
            addCriterion("installation not like", value, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationIn(List<String> values) {
            addCriterion("installation in", values, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationNotIn(List<String> values) {
            addCriterion("installation not in", values, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationBetween(String value1, String value2) {
            addCriterion("installation between", value1, value2, "installation");
            return (Criteria) this;
        }

        public Criteria andInstallationNotBetween(String value1, String value2) {
            addCriterion("installation not between", value1, value2, "installation");
            return (Criteria) this;
        }

        public Criteria andCertificationIsNull() {
            addCriterion("certification is null");
            return (Criteria) this;
        }

        public Criteria andCertificationIsNotNull() {
            addCriterion("certification is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationEqualTo(String value) {
            addCriterion("certification =", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotEqualTo(String value) {
            addCriterion("certification <>", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationGreaterThan(String value) {
            addCriterion("certification >", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationGreaterThanOrEqualTo(String value) {
            addCriterion("certification >=", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLessThan(String value) {
            addCriterion("certification <", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLessThanOrEqualTo(String value) {
            addCriterion("certification <=", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationLike(String value) {
            addCriterion("certification like", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotLike(String value) {
            addCriterion("certification not like", value, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationIn(List<String> values) {
            addCriterion("certification in", values, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotIn(List<String> values) {
            addCriterion("certification not in", values, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationBetween(String value1, String value2) {
            addCriterion("certification between", value1, value2, "certification");
            return (Criteria) this;
        }

        public Criteria andCertificationNotBetween(String value1, String value2) {
            addCriterion("certification not between", value1, value2, "certification");
            return (Criteria) this;
        }

        public Criteria andExplosionIsNull() {
            addCriterion("explosion is null");
            return (Criteria) this;
        }

        public Criteria andExplosionIsNotNull() {
            addCriterion("explosion is not null");
            return (Criteria) this;
        }

        public Criteria andExplosionEqualTo(String value) {
            addCriterion("explosion =", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionNotEqualTo(String value) {
            addCriterion("explosion <>", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionGreaterThan(String value) {
            addCriterion("explosion >", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionGreaterThanOrEqualTo(String value) {
            addCriterion("explosion >=", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionLessThan(String value) {
            addCriterion("explosion <", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionLessThanOrEqualTo(String value) {
            addCriterion("explosion <=", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionLike(String value) {
            addCriterion("explosion like", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionNotLike(String value) {
            addCriterion("explosion not like", value, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionIn(List<String> values) {
            addCriterion("explosion in", values, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionNotIn(List<String> values) {
            addCriterion("explosion not in", values, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionBetween(String value1, String value2) {
            addCriterion("explosion between", value1, value2, "explosion");
            return (Criteria) this;
        }

        public Criteria andExplosionNotBetween(String value1, String value2) {
            addCriterion("explosion not between", value1, value2, "explosion");
            return (Criteria) this;
        }

        public Criteria andUoIsNull() {
            addCriterion("uo is null");
            return (Criteria) this;
        }

        public Criteria andUoIsNotNull() {
            addCriterion("uo is not null");
            return (Criteria) this;
        }

        public Criteria andUoEqualTo(String value) {
            addCriterion("uo =", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoNotEqualTo(String value) {
            addCriterion("uo <>", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoGreaterThan(String value) {
            addCriterion("uo >", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoGreaterThanOrEqualTo(String value) {
            addCriterion("uo >=", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoLessThan(String value) {
            addCriterion("uo <", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoLessThanOrEqualTo(String value) {
            addCriterion("uo <=", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoLike(String value) {
            addCriterion("uo like", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoNotLike(String value) {
            addCriterion("uo not like", value, "uo");
            return (Criteria) this;
        }

        public Criteria andUoIn(List<String> values) {
            addCriterion("uo in", values, "uo");
            return (Criteria) this;
        }

        public Criteria andUoNotIn(List<String> values) {
            addCriterion("uo not in", values, "uo");
            return (Criteria) this;
        }

        public Criteria andUoBetween(String value1, String value2) {
            addCriterion("uo between", value1, value2, "uo");
            return (Criteria) this;
        }

        public Criteria andUoNotBetween(String value1, String value2) {
            addCriterion("uo not between", value1, value2, "uo");
            return (Criteria) this;
        }

        public Criteria andIoIsNull() {
            addCriterion("io is null");
            return (Criteria) this;
        }

        public Criteria andIoIsNotNull() {
            addCriterion("io is not null");
            return (Criteria) this;
        }

        public Criteria andIoEqualTo(String value) {
            addCriterion("io =", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoNotEqualTo(String value) {
            addCriterion("io <>", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoGreaterThan(String value) {
            addCriterion("io >", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoGreaterThanOrEqualTo(String value) {
            addCriterion("io >=", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoLessThan(String value) {
            addCriterion("io <", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoLessThanOrEqualTo(String value) {
            addCriterion("io <=", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoLike(String value) {
            addCriterion("io like", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoNotLike(String value) {
            addCriterion("io not like", value, "io");
            return (Criteria) this;
        }

        public Criteria andIoIn(List<String> values) {
            addCriterion("io in", values, "io");
            return (Criteria) this;
        }

        public Criteria andIoNotIn(List<String> values) {
            addCriterion("io not in", values, "io");
            return (Criteria) this;
        }

        public Criteria andIoBetween(String value1, String value2) {
            addCriterion("io between", value1, value2, "io");
            return (Criteria) this;
        }

        public Criteria andIoNotBetween(String value1, String value2) {
            addCriterion("io not between", value1, value2, "io");
            return (Criteria) this;
        }

        public Criteria andPoIsNull() {
            addCriterion("po is null");
            return (Criteria) this;
        }

        public Criteria andPoIsNotNull() {
            addCriterion("po is not null");
            return (Criteria) this;
        }

        public Criteria andPoEqualTo(String value) {
            addCriterion("po =", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotEqualTo(String value) {
            addCriterion("po <>", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoGreaterThan(String value) {
            addCriterion("po >", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoGreaterThanOrEqualTo(String value) {
            addCriterion("po >=", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoLessThan(String value) {
            addCriterion("po <", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoLessThanOrEqualTo(String value) {
            addCriterion("po <=", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoLike(String value) {
            addCriterion("po like", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotLike(String value) {
            addCriterion("po not like", value, "po");
            return (Criteria) this;
        }

        public Criteria andPoIn(List<String> values) {
            addCriterion("po in", values, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotIn(List<String> values) {
            addCriterion("po not in", values, "po");
            return (Criteria) this;
        }

        public Criteria andPoBetween(String value1, String value2) {
            addCriterion("po between", value1, value2, "po");
            return (Criteria) this;
        }

        public Criteria andPoNotBetween(String value1, String value2) {
            addCriterion("po not between", value1, value2, "po");
            return (Criteria) this;
        }

        public Criteria andCoIsNull() {
            addCriterion("co is null");
            return (Criteria) this;
        }

        public Criteria andCoIsNotNull() {
            addCriterion("co is not null");
            return (Criteria) this;
        }

        public Criteria andCoEqualTo(String value) {
            addCriterion("co =", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotEqualTo(String value) {
            addCriterion("co <>", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThan(String value) {
            addCriterion("co >", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoGreaterThanOrEqualTo(String value) {
            addCriterion("co >=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThan(String value) {
            addCriterion("co <", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLessThanOrEqualTo(String value) {
            addCriterion("co <=", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoLike(String value) {
            addCriterion("co like", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotLike(String value) {
            addCriterion("co not like", value, "co");
            return (Criteria) this;
        }

        public Criteria andCoIn(List<String> values) {
            addCriterion("co in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotIn(List<String> values) {
            addCriterion("co not in", values, "co");
            return (Criteria) this;
        }

        public Criteria andCoBetween(String value1, String value2) {
            addCriterion("co between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andCoNotBetween(String value1, String value2) {
            addCriterion("co not between", value1, value2, "co");
            return (Criteria) this;
        }

        public Criteria andLoIsNull() {
            addCriterion("lo is null");
            return (Criteria) this;
        }

        public Criteria andLoIsNotNull() {
            addCriterion("lo is not null");
            return (Criteria) this;
        }

        public Criteria andLoEqualTo(String value) {
            addCriterion("lo =", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotEqualTo(String value) {
            addCriterion("lo <>", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoGreaterThan(String value) {
            addCriterion("lo >", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoGreaterThanOrEqualTo(String value) {
            addCriterion("lo >=", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLessThan(String value) {
            addCriterion("lo <", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLessThanOrEqualTo(String value) {
            addCriterion("lo <=", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoLike(String value) {
            addCriterion("lo like", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotLike(String value) {
            addCriterion("lo not like", value, "lo");
            return (Criteria) this;
        }

        public Criteria andLoIn(List<String> values) {
            addCriterion("lo in", values, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotIn(List<String> values) {
            addCriterion("lo not in", values, "lo");
            return (Criteria) this;
        }

        public Criteria andLoBetween(String value1, String value2) {
            addCriterion("lo between", value1, value2, "lo");
            return (Criteria) this;
        }

        public Criteria andLoNotBetween(String value1, String value2) {
            addCriterion("lo not between", value1, value2, "lo");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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