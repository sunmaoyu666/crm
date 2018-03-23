package com.shsxt.crm.biz.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shsxt.crm.core.framework.constant.CrmConstant;
import com.shsxt.crm.core.framework.dao.BaseQuery;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SaleChance extends BaseQuery{
    /**
     * id
     * 
     */
    private Integer id;

    /**
     * chance_source
     * 机会来源
     */
    private String chanceSource;

    /**
     * customer_name
     * 
     */
    private String customerName;

    /**
     * cgjl
     * 
     */
    private Integer cgjl;

    /**
     * overview
     * 
     */
    private String overview;

    /**
     * link_man
     * 
     */
    private String linkMan;

    /**
     * link_phone
     * 
     */
    private String linkPhone;

    /**
     * description
     * 
     */
    private String description;

    /**
     * create_man
     * 
     */
    private String createMan;

    /**
     * assign_man
     * 
     */
    private String assignMan;

    /**
     * assign_time
     * 
     */
    private Date assignTime;

    /**
     * state
     * 
     */
    private Integer state;

    /**
     * dev_result
     * 
     */
    private Integer devResult;

    /**
     * is_valid
     * 
     */
    private Integer isValid;

    /**
     * create_date
     * 
     */
    @DateTimeFormat(pattern = CrmConstant.DATE_FORMATE_YMDHMS)
    @JsonFormat(pattern = CrmConstant.DATE_FORMATE_YMDHMS, timezone = "GMT+8")
    private Date createDate;

    /**
     * update_date
     * 
     */
    @DateTimeFormat(pattern = CrmConstant.DATE_FORMATE_YMDHMS)
    @JsonFormat(pattern = CrmConstant.DATE_FORMATE_YMDHMS, timezone = "GMT+8")
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChanceSource() {
        return chanceSource;
    }

    public void setChanceSource(String chanceSource) {
        this.chanceSource = chanceSource;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Integer getCgjl() {
        return cgjl;
    }

    public void setCgjl(Integer cgjl) {
        this.cgjl = cgjl;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getAssignMan() {
        return assignMan;
    }

    public void setAssignMan(String assignMan) {
        this.assignMan = assignMan;
    }

    public Date getAssignTime() {
        return assignTime;
    }

    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDevResult() {
        return devResult;
    }

    public void setDevResult(Integer devResult) {
        this.devResult = devResult;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}