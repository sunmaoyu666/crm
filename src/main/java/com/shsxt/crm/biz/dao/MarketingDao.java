package com.shsxt.crm.biz.dao;

import com.shsxt.crm.biz.model.SaleChance;
import com.shsxt.crm.core.common.util.Result;

import java.util.List;

public interface MarketingDao {

    List<SaleChance> querySaleChanceByParams(SaleChance saleChance);

    int insertSaleChanceInfo(SaleChance saleChance);

    int updateSaleChanceInfo(SaleChance saleChance);
}
