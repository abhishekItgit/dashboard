package com.dashboard.summary.dashboard.service.iservice;

import com.dashboard.summary.dashboard.bean.SalesSummaryResponseBean;

import java.util.Date;



public interface IDelinquencyDashboardService {


	SalesSummaryResponseBean getSalesSummary(Date fDateParam, Date tDateParam, String valueType, Integer  value ) throws Exception;
}
