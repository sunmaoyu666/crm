package com.shsxt.crm.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.crm.biz.dao.MarketingDao;
import com.shsxt.crm.biz.model.SaleChance;
import com.shsxt.crm.biz.service.IMarketingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MarketingServiceImpl implements IMarketingService{

    @Autowired
    private MarketingDao marketingDao;
    
    /**
     * 分页
      * @param saleChance
     * @return
     */
    @Override
    public Map<String, Object> querySaleChanceByParas(SaleChance saleChance) {

        //构建分页对象
        PageHelper.startPage(saleChance.getPage(),saleChance.getRows());

        List<SaleChance> saleChances = marketingDao.querySaleChanceByParams(saleChance);

        //分页对象
        PageInfo<SaleChance> pageInfo = new PageInfo<>(saleChances);

        Map<String, Object> map = new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());

        return map;
    }
}
