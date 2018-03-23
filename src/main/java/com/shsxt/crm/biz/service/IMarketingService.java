package com.shsxt.crm.biz.service;

import com.shsxt.crm.biz.model.SaleChance;

import java.util.Map;

public interface IMarketingService {

    Map<String,Object> querySaleChanceByParas(SaleChance saleChance);
}
