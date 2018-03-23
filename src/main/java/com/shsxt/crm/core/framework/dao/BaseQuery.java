package com.shsxt.crm.core.framework.dao;

import com.shsxt.crm.core.framework.constant.CrmConstant;

public class BaseQuery {

    private Integer page = CrmConstant.CRM_PAGE_NUM;
    private Integer rows = CrmConstant.CRM_PAGE_SIZE;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
