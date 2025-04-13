package com.dashboard.summary.dashboard.bean;

import com.dashboard.summary.dashboard.entity.CurrentDelinquencySummary;
import com.dashboard.summary.dashboard.entity.SpSaleSummaryDashboard;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class SalesSummaryResponseBean {
    List<SpSaleSummaryDashboard> spSaleSummaryDashboardList;
    Map<String, List<Map<String, Object>>> map;
    List<CurrentDelinquencySummary> currentDelinquencySummaryList;
}
