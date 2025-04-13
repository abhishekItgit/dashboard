package com.dashboard.summary.dashboard.controller;


import java.util.Date;

import com.dashboard.summary.dashboard.bean.ResponseBean;
import com.dashboard.summary.dashboard.bean.SalesSummaryResponseBean;
import com.dashboard.summary.dashboard.service.iservice.IDelinquencyDashboardService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParseException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/delinquency-dashboard")
public class DelinquencyDashboardController {
	private final Logger logger = LogManager.getLogger(getClass());


	@Autowired
	private IDelinquencyDashboardService iDelinquencyDashboardService;


	@GetMapping("/sales/summary/")
	public ResponseEntity<ResponseBean<SalesSummaryResponseBean>> getSaleSummaryData(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fDateParam, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")Date tDateParam, @RequestParam String valueType , @RequestParam(required=false) String value )
			throws JsonParseException, Exception {
		logger.debug("summary data:uspBranchMonthlySummary");
		return ResponseEntity.ok(new ResponseBean("200", "Business summary data ", iDelinquencyDashboardService.getSalesSummary(fDateParam, tDateParam, valueType, value == null || value.trim().isEmpty() ? 0 : Integer.valueOf(value))));
	}
	
	
}
