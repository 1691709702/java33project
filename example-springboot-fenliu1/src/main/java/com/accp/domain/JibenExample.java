package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class JibenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JibenExample() {
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

        public Criteria andChangshangIsNull() {
            addCriterion("changshang is null");
            return (Criteria) this;
        }

        public Criteria andChangshangIsNotNull() {
            addCriterion("changshang is not null");
            return (Criteria) this;
        }

        public Criteria andChangshangEqualTo(String value) {
            addCriterion("changshang =", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotEqualTo(String value) {
            addCriterion("changshang <>", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangGreaterThan(String value) {
            addCriterion("changshang >", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangGreaterThanOrEqualTo(String value) {
            addCriterion("changshang >=", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLessThan(String value) {
            addCriterion("changshang <", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLessThanOrEqualTo(String value) {
            addCriterion("changshang <=", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLike(String value) {
            addCriterion("changshang like", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotLike(String value) {
            addCriterion("changshang not like", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangIn(List<String> values) {
            addCriterion("changshang in", values, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotIn(List<String> values) {
            addCriterion("changshang not in", values, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangBetween(String value1, String value2) {
            addCriterion("changshang between", value1, value2, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotBetween(String value1, String value2) {
            addCriterion("changshang not between", value1, value2, "changshang");
            return (Criteria) this;
        }

        public Criteria andJiegouIsNull() {
            addCriterion("jiegou is null");
            return (Criteria) this;
        }

        public Criteria andJiegouIsNotNull() {
            addCriterion("jiegou is not null");
            return (Criteria) this;
        }

        public Criteria andJiegouEqualTo(String value) {
            addCriterion("jiegou =", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotEqualTo(String value) {
            addCriterion("jiegou <>", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouGreaterThan(String value) {
            addCriterion("jiegou >", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouGreaterThanOrEqualTo(String value) {
            addCriterion("jiegou >=", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouLessThan(String value) {
            addCriterion("jiegou <", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouLessThanOrEqualTo(String value) {
            addCriterion("jiegou <=", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouLike(String value) {
            addCriterion("jiegou like", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotLike(String value) {
            addCriterion("jiegou not like", value, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouIn(List<String> values) {
            addCriterion("jiegou in", values, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotIn(List<String> values) {
            addCriterion("jiegou not in", values, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouBetween(String value1, String value2) {
            addCriterion("jiegou between", value1, value2, "jiegou");
            return (Criteria) this;
        }

        public Criteria andJiegouNotBetween(String value1, String value2) {
            addCriterion("jiegou not between", value1, value2, "jiegou");
            return (Criteria) this;
        }

        public Criteria andChangIsNull() {
            addCriterion("chang is null");
            return (Criteria) this;
        }

        public Criteria andChangIsNotNull() {
            addCriterion("chang is not null");
            return (Criteria) this;
        }

        public Criteria andChangEqualTo(String value) {
            addCriterion("chang =", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangNotEqualTo(String value) {
            addCriterion("chang <>", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangGreaterThan(String value) {
            addCriterion("chang >", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangGreaterThanOrEqualTo(String value) {
            addCriterion("chang >=", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangLessThan(String value) {
            addCriterion("chang <", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangLessThanOrEqualTo(String value) {
            addCriterion("chang <=", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangLike(String value) {
            addCriterion("chang like", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangNotLike(String value) {
            addCriterion("chang not like", value, "chang");
            return (Criteria) this;
        }

        public Criteria andChangIn(List<String> values) {
            addCriterion("chang in", values, "chang");
            return (Criteria) this;
        }

        public Criteria andChangNotIn(List<String> values) {
            addCriterion("chang not in", values, "chang");
            return (Criteria) this;
        }

        public Criteria andChangBetween(String value1, String value2) {
            addCriterion("chang between", value1, value2, "chang");
            return (Criteria) this;
        }

        public Criteria andChangNotBetween(String value1, String value2) {
            addCriterion("chang not between", value1, value2, "chang");
            return (Criteria) this;
        }

        public Criteria andFadongjiIsNull() {
            addCriterion("fadongji is null");
            return (Criteria) this;
        }

        public Criteria andFadongjiIsNotNull() {
            addCriterion("fadongji is not null");
            return (Criteria) this;
        }

        public Criteria andFadongjiEqualTo(String value) {
            addCriterion("fadongji =", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotEqualTo(String value) {
            addCriterion("fadongji <>", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiGreaterThan(String value) {
            addCriterion("fadongji >", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiGreaterThanOrEqualTo(String value) {
            addCriterion("fadongji >=", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLessThan(String value) {
            addCriterion("fadongji <", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLessThanOrEqualTo(String value) {
            addCriterion("fadongji <=", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLike(String value) {
            addCriterion("fadongji like", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotLike(String value) {
            addCriterion("fadongji not like", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiIn(List<String> values) {
            addCriterion("fadongji in", values, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotIn(List<String> values) {
            addCriterion("fadongji not in", values, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiBetween(String value1, String value2) {
            addCriterion("fadongji between", value1, value2, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotBetween(String value1, String value2) {
            addCriterion("fadongji not between", value1, value2, "fadongji");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIsNull() {
            addCriterion("biansuxiang is null");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIsNotNull() {
            addCriterion("biansuxiang is not null");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangEqualTo(String value) {
            addCriterion("biansuxiang =", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotEqualTo(String value) {
            addCriterion("biansuxiang <>", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangGreaterThan(String value) {
            addCriterion("biansuxiang >", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangGreaterThanOrEqualTo(String value) {
            addCriterion("biansuxiang >=", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLessThan(String value) {
            addCriterion("biansuxiang <", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLessThanOrEqualTo(String value) {
            addCriterion("biansuxiang <=", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLike(String value) {
            addCriterion("biansuxiang like", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotLike(String value) {
            addCriterion("biansuxiang not like", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIn(List<String> values) {
            addCriterion("biansuxiang in", values, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotIn(List<String> values) {
            addCriterion("biansuxiang not in", values, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangBetween(String value1, String value2) {
            addCriterion("biansuxiang between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotBetween(String value1, String value2) {
            addCriterion("biansuxiang not between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuIsNull() {
            addCriterion("zuigaochesu is null");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuIsNotNull() {
            addCriterion("zuigaochesu is not null");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuEqualTo(String value) {
            addCriterion("zuigaochesu =", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuNotEqualTo(String value) {
            addCriterion("zuigaochesu <>", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuGreaterThan(String value) {
            addCriterion("zuigaochesu >", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuGreaterThanOrEqualTo(String value) {
            addCriterion("zuigaochesu >=", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuLessThan(String value) {
            addCriterion("zuigaochesu <", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuLessThanOrEqualTo(String value) {
            addCriterion("zuigaochesu <=", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuLike(String value) {
            addCriterion("zuigaochesu like", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuNotLike(String value) {
            addCriterion("zuigaochesu not like", value, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuIn(List<String> values) {
            addCriterion("zuigaochesu in", values, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuNotIn(List<String> values) {
            addCriterion("zuigaochesu not in", values, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuBetween(String value1, String value2) {
            addCriterion("zuigaochesu between", value1, value2, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andZuigaochesuNotBetween(String value1, String value2) {
            addCriterion("zuigaochesu not between", value1, value2, "zuigaochesu");
            return (Criteria) this;
        }

        public Criteria andJiasushijianIsNull() {
            addCriterion("jiasushijian is null");
            return (Criteria) this;
        }

        public Criteria andJiasushijianIsNotNull() {
            addCriterion("jiasushijian is not null");
            return (Criteria) this;
        }

        public Criteria andJiasushijianEqualTo(String value) {
            addCriterion("jiasushijian =", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianNotEqualTo(String value) {
            addCriterion("jiasushijian <>", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianGreaterThan(String value) {
            addCriterion("jiasushijian >", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianGreaterThanOrEqualTo(String value) {
            addCriterion("jiasushijian >=", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianLessThan(String value) {
            addCriterion("jiasushijian <", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianLessThanOrEqualTo(String value) {
            addCriterion("jiasushijian <=", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianLike(String value) {
            addCriterion("jiasushijian like", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianNotLike(String value) {
            addCriterion("jiasushijian not like", value, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianIn(List<String> values) {
            addCriterion("jiasushijian in", values, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianNotIn(List<String> values) {
            addCriterion("jiasushijian not in", values, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianBetween(String value1, String value2) {
            addCriterion("jiasushijian between", value1, value2, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andJiasushijianNotBetween(String value1, String value2) {
            addCriterion("jiasushijian not between", value1, value2, "jiasushijian");
            return (Criteria) this;
        }

        public Criteria andYouhaoIsNull() {
            addCriterion("youhao is null");
            return (Criteria) this;
        }

        public Criteria andYouhaoIsNotNull() {
            addCriterion("youhao is not null");
            return (Criteria) this;
        }

        public Criteria andYouhaoEqualTo(String value) {
            addCriterion("youhao =", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotEqualTo(String value) {
            addCriterion("youhao <>", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoGreaterThan(String value) {
            addCriterion("youhao >", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoGreaterThanOrEqualTo(String value) {
            addCriterion("youhao >=", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoLessThan(String value) {
            addCriterion("youhao <", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoLessThanOrEqualTo(String value) {
            addCriterion("youhao <=", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoLike(String value) {
            addCriterion("youhao like", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotLike(String value) {
            addCriterion("youhao not like", value, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoIn(List<String> values) {
            addCriterion("youhao in", values, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotIn(List<String> values) {
            addCriterion("youhao not in", values, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoBetween(String value1, String value2) {
            addCriterion("youhao between", value1, value2, "youhao");
            return (Criteria) this;
        }

        public Criteria andYouhaoNotBetween(String value1, String value2) {
            addCriterion("youhao not between", value1, value2, "youhao");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianIsNull() {
            addCriterion("baoxiuqixian is null");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianIsNotNull() {
            addCriterion("baoxiuqixian is not null");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianEqualTo(String value) {
            addCriterion("baoxiuqixian =", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianNotEqualTo(String value) {
            addCriterion("baoxiuqixian <>", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianGreaterThan(String value) {
            addCriterion("baoxiuqixian >", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianGreaterThanOrEqualTo(String value) {
            addCriterion("baoxiuqixian >=", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianLessThan(String value) {
            addCriterion("baoxiuqixian <", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianLessThanOrEqualTo(String value) {
            addCriterion("baoxiuqixian <=", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianLike(String value) {
            addCriterion("baoxiuqixian like", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianNotLike(String value) {
            addCriterion("baoxiuqixian not like", value, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianIn(List<String> values) {
            addCriterion("baoxiuqixian in", values, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianNotIn(List<String> values) {
            addCriterion("baoxiuqixian not in", values, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianBetween(String value1, String value2) {
            addCriterion("baoxiuqixian between", value1, value2, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andBaoxiuqixianNotBetween(String value1, String value2) {
            addCriterion("baoxiuqixian not between", value1, value2, "baoxiuqixian");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNull() {
            addCriterion("leixing is null");
            return (Criteria) this;
        }

        public Criteria andLeixingIsNotNull() {
            addCriterion("leixing is not null");
            return (Criteria) this;
        }

        public Criteria andLeixingEqualTo(String value) {
            addCriterion("leixing =", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotEqualTo(String value) {
            addCriterion("leixing <>", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThan(String value) {
            addCriterion("leixing >", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingGreaterThanOrEqualTo(String value) {
            addCriterion("leixing >=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThan(String value) {
            addCriterion("leixing <", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLessThanOrEqualTo(String value) {
            addCriterion("leixing <=", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingLike(String value) {
            addCriterion("leixing like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotLike(String value) {
            addCriterion("leixing not like", value, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingIn(List<String> values) {
            addCriterion("leixing in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotIn(List<String> values) {
            addCriterion("leixing not in", values, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingBetween(String value1, String value2) {
            addCriterion("leixing between", value1, value2, "leixing");
            return (Criteria) this;
        }

        public Criteria andLeixingNotBetween(String value1, String value2) {
            addCriterion("leixing not between", value1, value2, "leixing");
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