package com.shsxt.crm.biz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shsxt.crm.biz.dao.MarketingDao;
import com.shsxt.crm.biz.model.SaleChance;
import com.shsxt.crm.biz.model.User;
import com.shsxt.crm.biz.service.IMarketingService;
import com.shsxt.crm.core.common.util.Result;
import com.shsxt.crm.core.common.util.VerificationLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MarketingServiceImpl implements IMarketingService{

    @Autowired
    private MarketingDao marketingDao;

    @Autowired
    private HttpServletRequest req;
    
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

    @Override
    public Result insertSaleChanceInfo(SaleChance saleChance) {
        User user = VerificationLoginUtil.getUserInfoFromSession(req);

        saleChance.setCreateMan(user.getUser_name());
        saleChance.setAssignTime(new Date());

        saleChance.setState(1);
        saleChance.setIsValid(1);
        saleChance.setCreateDate(new Date());
        saleChance.setUpdateDate(new Date());

        int res = marketingDao.insertSaleChanceInfo(saleChance);
        if (res == 1){
            return Result.success("添加成功");
        }
        return Result.fail("添加失败");
    }

    @Override
    public Result updateSaleChanceInfo(SaleChance saleChance) {

        saleChance.setUpdateDate(new Date());

        int res = marketingDao.updateSaleChanceInfo(saleChance);

        if (res == 1){

            return Result.success("更新成功");
        }
        return Result.fail("更新失败");
    }
}
