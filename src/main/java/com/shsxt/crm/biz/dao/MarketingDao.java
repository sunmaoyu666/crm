package com.shsxt.crm.biz.dao;

import com.shsxt.crm.biz.model.SaleChance;

import java.util.List;

public interface MarketingDao {

    List<SaleChance> querySaleChanceByParams(SaleChance saleChance);
}
