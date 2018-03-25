package com.shsxt.crm.biz.service;

import com.shsxt.crm.biz.model.SaleChance;
import com.shsxt.crm.core.common.util.Result;

import java.util.Map;

public interface IMarketingService {

    Map<String,Object> querySaleChanceByParas(SaleChance saleChance);

    public Result insertSaleChanceInfo(SaleChance saleChance);

    public Result updateSaleChanceInfo(SaleChance saleChance);
}
