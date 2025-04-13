package com.dashboard.summary.dashboard.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Table(name = "usp_CurrentDelinquencySummary")
public class CurrentDelinquencySummary {
    @Id
    private Integer serialNo ;

    private  Integer dataMonth;
    private Integer dataYear;

    @Column(name = "posRegularizeCr")
    private Double currentAmount;

    @Column(name = "loanCountRegularize")
    private Double currentCnt;

    private Float currentPer;

    @Column(name = "sma0Amt")
    private Double sma0Amt;

    @Column(name = "sma0Cnt")
    private Integer sma0Cnt;

    private Float sma0Per;

    @Column(name = "sma1Amt")
    private Double sma1Amt;

    @Column(name = "sma1Cnt")
    private Integer sma1Cnt;

    private Float sma1Per;

    @Column(name = "sma2Amt")
    private Double sma2Amt;

    @Column(name = "sma2Cnt")
    private Integer sma2Cnt;

    private Float sma2Per;

    @Column(name = "npaAmt")
    private Double npaAmt;

    @Column(name = "npaCnt")
    private Integer npaCnt;

    private Float npaPer;

    private Double totalDisbAmount;
    private Double totalDisbNo;
}
