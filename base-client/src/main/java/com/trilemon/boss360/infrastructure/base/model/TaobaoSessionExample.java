package com.trilemon.boss360.infrastructure.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaobaoSessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaobaoSessionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andTokenTypeIsNull() {
            addCriterion("token_type is null");
            return (Criteria) this;
        }

        public Criteria andTokenTypeIsNotNull() {
            addCriterion("token_type is not null");
            return (Criteria) this;
        }

        public Criteria andTokenTypeEqualTo(String value) {
            addCriterion("token_type =", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotEqualTo(String value) {
            addCriterion("token_type <>", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeGreaterThan(String value) {
            addCriterion("token_type >", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("token_type >=", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeLessThan(String value) {
            addCriterion("token_type <", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeLessThanOrEqualTo(String value) {
            addCriterion("token_type <=", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeLike(String value) {
            addCriterion("token_type like", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotLike(String value) {
            addCriterion("token_type not like", value, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeIn(List<String> values) {
            addCriterion("token_type in", values, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotIn(List<String> values) {
            addCriterion("token_type not in", values, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeBetween(String value1, String value2) {
            addCriterion("token_type between", value1, value2, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTokenTypeNotBetween(String value1, String value2) {
            addCriterion("token_type not between", value1, value2, "tokenType");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdIsNull() {
            addCriterion("taobao_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdIsNotNull() {
            addCriterion("taobao_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdEqualTo(Long value) {
            addCriterion("taobao_user_id =", value, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdNotEqualTo(Long value) {
            addCriterion("taobao_user_id <>", value, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdGreaterThan(Long value) {
            addCriterion("taobao_user_id >", value, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("taobao_user_id >=", value, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdLessThan(Long value) {
            addCriterion("taobao_user_id <", value, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdLessThanOrEqualTo(Long value) {
            addCriterion("taobao_user_id <=", value, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdIn(List<Long> values) {
            addCriterion("taobao_user_id in", values, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdNotIn(List<Long> values) {
            addCriterion("taobao_user_id not in", values, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdBetween(Long value1, Long value2) {
            addCriterion("taobao_user_id between", value1, value2, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserIdNotBetween(Long value1, Long value2) {
            addCriterion("taobao_user_id not between", value1, value2, "taobaoUserId");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickIsNull() {
            addCriterion("taobao_user_nick is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickIsNotNull() {
            addCriterion("taobao_user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickEqualTo(String value) {
            addCriterion("taobao_user_nick =", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickNotEqualTo(String value) {
            addCriterion("taobao_user_nick <>", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickGreaterThan(String value) {
            addCriterion("taobao_user_nick >", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_user_nick >=", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickLessThan(String value) {
            addCriterion("taobao_user_nick <", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickLessThanOrEqualTo(String value) {
            addCriterion("taobao_user_nick <=", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickLike(String value) {
            addCriterion("taobao_user_nick like", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickNotLike(String value) {
            addCriterion("taobao_user_nick not like", value, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickIn(List<String> values) {
            addCriterion("taobao_user_nick in", values, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickNotIn(List<String> values) {
            addCriterion("taobao_user_nick not in", values, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickBetween(String value1, String value2) {
            addCriterion("taobao_user_nick between", value1, value2, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andTaobaoUserNickNotBetween(String value1, String value2) {
            addCriterion("taobao_user_nick not between", value1, value2, "taobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andExpiresInIsNull() {
            addCriterion("expires_in is null");
            return (Criteria) this;
        }

        public Criteria andExpiresInIsNotNull() {
            addCriterion("expires_in is not null");
            return (Criteria) this;
        }

        public Criteria andExpiresInEqualTo(Integer value) {
            addCriterion("expires_in =", value, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInNotEqualTo(Integer value) {
            addCriterion("expires_in <>", value, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInGreaterThan(Integer value) {
            addCriterion("expires_in >", value, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInGreaterThanOrEqualTo(Integer value) {
            addCriterion("expires_in >=", value, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInLessThan(Integer value) {
            addCriterion("expires_in <", value, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInLessThanOrEqualTo(Integer value) {
            addCriterion("expires_in <=", value, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInIn(List<Integer> values) {
            addCriterion("expires_in in", values, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInNotIn(List<Integer> values) {
            addCriterion("expires_in not in", values, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInBetween(Integer value1, Integer value2) {
            addCriterion("expires_in between", value1, value2, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andExpiresInNotBetween(Integer value1, Integer value2) {
            addCriterion("expires_in not between", value1, value2, "expiresIn");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNull() {
            addCriterion("refresh_token is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIsNotNull() {
            addCriterion("refresh_token is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenEqualTo(String value) {
            addCriterion("refresh_token =", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotEqualTo(String value) {
            addCriterion("refresh_token <>", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThan(String value) {
            addCriterion("refresh_token >", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_token >=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThan(String value) {
            addCriterion("refresh_token <", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLessThanOrEqualTo(String value) {
            addCriterion("refresh_token <=", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenLike(String value) {
            addCriterion("refresh_token like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotLike(String value) {
            addCriterion("refresh_token not like", value, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenIn(List<String> values) {
            addCriterion("refresh_token in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotIn(List<String> values) {
            addCriterion("refresh_token not in", values, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenBetween(String value1, String value2) {
            addCriterion("refresh_token between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andRefreshTokenNotBetween(String value1, String value2) {
            addCriterion("refresh_token not between", value1, value2, "refreshToken");
            return (Criteria) this;
        }

        public Criteria andReExpiresInIsNull() {
            addCriterion("re_expires_in is null");
            return (Criteria) this;
        }

        public Criteria andReExpiresInIsNotNull() {
            addCriterion("re_expires_in is not null");
            return (Criteria) this;
        }

        public Criteria andReExpiresInEqualTo(Integer value) {
            addCriterion("re_expires_in =", value, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInNotEqualTo(Integer value) {
            addCriterion("re_expires_in <>", value, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInGreaterThan(Integer value) {
            addCriterion("re_expires_in >", value, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInGreaterThanOrEqualTo(Integer value) {
            addCriterion("re_expires_in >=", value, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInLessThan(Integer value) {
            addCriterion("re_expires_in <", value, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInLessThanOrEqualTo(Integer value) {
            addCriterion("re_expires_in <=", value, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInIn(List<Integer> values) {
            addCriterion("re_expires_in in", values, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInNotIn(List<Integer> values) {
            addCriterion("re_expires_in not in", values, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInBetween(Integer value1, Integer value2) {
            addCriterion("re_expires_in between", value1, value2, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andReExpiresInNotBetween(Integer value1, Integer value2) {
            addCriterion("re_expires_in not between", value1, value2, "reExpiresIn");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdIsNull() {
            addCriterion("sub_taobao_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdIsNotNull() {
            addCriterion("sub_taobao_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdEqualTo(Long value) {
            addCriterion("sub_taobao_user_id =", value, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdNotEqualTo(Long value) {
            addCriterion("sub_taobao_user_id <>", value, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdGreaterThan(Long value) {
            addCriterion("sub_taobao_user_id >", value, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sub_taobao_user_id >=", value, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdLessThan(Long value) {
            addCriterion("sub_taobao_user_id <", value, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdLessThanOrEqualTo(Long value) {
            addCriterion("sub_taobao_user_id <=", value, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdIn(List<Long> values) {
            addCriterion("sub_taobao_user_id in", values, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdNotIn(List<Long> values) {
            addCriterion("sub_taobao_user_id not in", values, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdBetween(Long value1, Long value2) {
            addCriterion("sub_taobao_user_id between", value1, value2, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserIdNotBetween(Long value1, Long value2) {
            addCriterion("sub_taobao_user_id not between", value1, value2, "subTaobaoUserId");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickIsNull() {
            addCriterion("sub_taobao_user_nick is null");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickIsNotNull() {
            addCriterion("sub_taobao_user_nick is not null");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickEqualTo(String value) {
            addCriterion("sub_taobao_user_nick =", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickNotEqualTo(String value) {
            addCriterion("sub_taobao_user_nick <>", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickGreaterThan(String value) {
            addCriterion("sub_taobao_user_nick >", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickGreaterThanOrEqualTo(String value) {
            addCriterion("sub_taobao_user_nick >=", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickLessThan(String value) {
            addCriterion("sub_taobao_user_nick <", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickLessThanOrEqualTo(String value) {
            addCriterion("sub_taobao_user_nick <=", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickLike(String value) {
            addCriterion("sub_taobao_user_nick like", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickNotLike(String value) {
            addCriterion("sub_taobao_user_nick not like", value, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickIn(List<String> values) {
            addCriterion("sub_taobao_user_nick in", values, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickNotIn(List<String> values) {
            addCriterion("sub_taobao_user_nick not in", values, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickBetween(String value1, String value2) {
            addCriterion("sub_taobao_user_nick between", value1, value2, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andSubTaobaoUserNickNotBetween(String value1, String value2) {
            addCriterion("sub_taobao_user_nick not between", value1, value2, "subTaobaoUserNick");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInIsNull() {
            addCriterion("r1_expires_in is null");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInIsNotNull() {
            addCriterion("r1_expires_in is not null");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInEqualTo(Integer value) {
            addCriterion("r1_expires_in =", value, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInNotEqualTo(Integer value) {
            addCriterion("r1_expires_in <>", value, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInGreaterThan(Integer value) {
            addCriterion("r1_expires_in >", value, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInGreaterThanOrEqualTo(Integer value) {
            addCriterion("r1_expires_in >=", value, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInLessThan(Integer value) {
            addCriterion("r1_expires_in <", value, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInLessThanOrEqualTo(Integer value) {
            addCriterion("r1_expires_in <=", value, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInIn(List<Integer> values) {
            addCriterion("r1_expires_in in", values, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInNotIn(List<Integer> values) {
            addCriterion("r1_expires_in not in", values, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInBetween(Integer value1, Integer value2) {
            addCriterion("r1_expires_in between", value1, value2, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR1ExpiresInNotBetween(Integer value1, Integer value2) {
            addCriterion("r1_expires_in not between", value1, value2, "r1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInIsNull() {
            addCriterion("w1_expires_in is null");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInIsNotNull() {
            addCriterion("w1_expires_in is not null");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInEqualTo(Integer value) {
            addCriterion("w1_expires_in =", value, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInNotEqualTo(Integer value) {
            addCriterion("w1_expires_in <>", value, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInGreaterThan(Integer value) {
            addCriterion("w1_expires_in >", value, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInGreaterThanOrEqualTo(Integer value) {
            addCriterion("w1_expires_in >=", value, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInLessThan(Integer value) {
            addCriterion("w1_expires_in <", value, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInLessThanOrEqualTo(Integer value) {
            addCriterion("w1_expires_in <=", value, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInIn(List<Integer> values) {
            addCriterion("w1_expires_in in", values, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInNotIn(List<Integer> values) {
            addCriterion("w1_expires_in not in", values, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInBetween(Integer value1, Integer value2) {
            addCriterion("w1_expires_in between", value1, value2, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW1ExpiresInNotBetween(Integer value1, Integer value2) {
            addCriterion("w1_expires_in not between", value1, value2, "w1ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInIsNull() {
            addCriterion("r2_expires_in is null");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInIsNotNull() {
            addCriterion("r2_expires_in is not null");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInEqualTo(Integer value) {
            addCriterion("r2_expires_in =", value, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInNotEqualTo(Integer value) {
            addCriterion("r2_expires_in <>", value, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInGreaterThan(Integer value) {
            addCriterion("r2_expires_in >", value, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInGreaterThanOrEqualTo(Integer value) {
            addCriterion("r2_expires_in >=", value, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInLessThan(Integer value) {
            addCriterion("r2_expires_in <", value, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInLessThanOrEqualTo(Integer value) {
            addCriterion("r2_expires_in <=", value, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInIn(List<Integer> values) {
            addCriterion("r2_expires_in in", values, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInNotIn(List<Integer> values) {
            addCriterion("r2_expires_in not in", values, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInBetween(Integer value1, Integer value2) {
            addCriterion("r2_expires_in between", value1, value2, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andR2ExpiresInNotBetween(Integer value1, Integer value2) {
            addCriterion("r2_expires_in not between", value1, value2, "r2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInIsNull() {
            addCriterion("w2_expires_in is null");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInIsNotNull() {
            addCriterion("w2_expires_in is not null");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInEqualTo(Integer value) {
            addCriterion("w2_expires_in =", value, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInNotEqualTo(Integer value) {
            addCriterion("w2_expires_in <>", value, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInGreaterThan(Integer value) {
            addCriterion("w2_expires_in >", value, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInGreaterThanOrEqualTo(Integer value) {
            addCriterion("w2_expires_in >=", value, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInLessThan(Integer value) {
            addCriterion("w2_expires_in <", value, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInLessThanOrEqualTo(Integer value) {
            addCriterion("w2_expires_in <=", value, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInIn(List<Integer> values) {
            addCriterion("w2_expires_in in", values, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInNotIn(List<Integer> values) {
            addCriterion("w2_expires_in not in", values, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInBetween(Integer value1, Integer value2) {
            addCriterion("w2_expires_in between", value1, value2, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andW2ExpiresInNotBetween(Integer value1, Integer value2) {
            addCriterion("w2_expires_in not between", value1, value2, "w2ExpiresIn");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
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