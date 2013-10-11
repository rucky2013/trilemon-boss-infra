package com.trilemon.boss360.infrastructure.base.client.impl;

import com.taobao.api.domain.Item;
import com.taobao.api.request.ItemsOnsaleGetRequest;
import com.trilemon.boss360.infrastructure.base.client.BaseClient;
import com.trilemon.boss360.infrastructure.base.module.TaobaoApiUsage;
import com.trilemon.boss360.infrastructure.base.module.TaobaoApp;
import com.trilemon.boss360.infrastructure.base.module.TaobaoSession;
import com.trilemon.boss360.infrastructure.base.serivce.EnhancedApiException;
import com.trilemon.boss360.infrastructure.base.serivce.TaobaoItemService;
import com.trilemon.boss360.infrastructure.base.service.TaobaoSessionService;
import com.trilemon.boss360.infrastructure.base.service.TaobaoApiUsageService;
import com.trilemon.boss360.infrastructure.base.service.TaobaoAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author kevin
 */
@Service
public class BaseClientImpl implements BaseClient {
    @Autowired
    private TaobaoApiUsageService taobaoApiUsageService;
    @Autowired
    private TaobaoAppService taobaoAppService;
    @Autowired
    private TaobaoItemService taobaoItemService;
    @Autowired
    private TaobaoSessionService taobaoSessionService;

    @Override
    public void updateApiUsage(List<TaobaoApiUsage> taobaoApiUsageList) {
        taobaoApiUsageService.updateApiUsage(taobaoApiUsageList);
    }

    @Override
    public TaobaoApp getTaobaoApp(String taobaoAppKey) {
        return taobaoAppService.getTaobaoApp(taobaoAppKey);
    }

    @Override
    public List<Item> getOnSaleItemsByNick(ItemsOnsaleGetRequest request, String appKey, String nick) throws EnhancedApiException {
        return taobaoItemService.getOnSaleItemsByNick(request, appKey, nick);
    }

    @Override
    public List<Item> getOnSaleItemsByUserId(ItemsOnsaleGetRequest request, String appKey, long userId) throws EnhancedApiException {
        return taobaoItemService.getOnSaleItemsByUserId(request, appKey, userId);
    }

    @Override
    public long getTradeNumFromTop(Long userId, String appKey, Date startDate, Date endDate) {
        return 0;
    }

    @Override
    public TaobaoSession getTaobaoSession(Long userId) {
        return taobaoSessionService.getTaobaoSession(userId);
    }

    @Override
    public TaobaoSession getTaobaoSession(String nick) {
        return taobaoSessionService.getTaobaoSession(nick);
    }

    @Override
    public long getTradeNum(Long userId, Date startDate, Date endDate) {
        return 0;
    }
}
