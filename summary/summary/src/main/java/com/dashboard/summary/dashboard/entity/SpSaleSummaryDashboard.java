package com.dashboard.summary.dashboard.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "uspBranchMonthlySummary")
@Data
public class SpSaleSummaryDashboard {

    @Id
    private Long serialNumber;

    @Column(name = "branchID")
    private Integer branchId;

    @Column(name = "regionID")
    private Integer regionId;

    @Column(name = "zoneID")
    private Integer zoneId;

    @Column(name = "dataYear")
    private Integer dataYear;

    @Column(name = "dataMonth")
    private Integer dataMonth;

    @Column(name = "loginNumber")
    private Integer loginNumber;

    @Column(name = "loginAmt")
    private Double loginAmt;

    @Column(name = "sanctionNumber")
    private Integer sanctionNumber;

    @Column(name = "sanctionAmt")
    private Double sanctionAmt;

    @Column(name = "fdNo")
    private Integer fdNo;

    @Column(name = "fdAmt")
    private Double fdAmt;

    @Column(name = "totalDisbAmt")
    private Double totalDisbAmt;

    @Column(name = "chequeCutNo")
    private Integer chequeCutNo;

    @Column(name = "chequeCutAmt")
    private Double chequeCutAmt;

    @Column(name = "fChequeCutNo")
    private Integer fChequeCutNo;

    @Column(name = "fChequeCutAmt")
    private Double fChequeCutAmt;

    @Column(name = "sma0Amt")
    private Double sma0Amt;

    @Column(name = "sma0Cnt")
    private Integer sma0Cnt;

    @Column(name = "sma1Amt")
    private Double sma1Amt;

    @Column(name = "sma1Cnt")
    private Integer sma1Cnt;

    @Column(name = "sma2Amt")
    private Double sma2Amt;

    @Column(name = "sma2Cnt")
    private Integer sma2Cnt;

    @Column(name = "npaAmt")
    private Double npaAmt;

    @Column(name = "npaCnt")
    private Integer npaCnt;

    @Column(name = "branchCurrentPos")
    private Double branchCurrentPos;

    @Column(name = "branchActiveLoan")
    private Integer branchActiveLoan;

    @Column(name = "totalHLAmt")
    private Double totalHLAmt;

    @Column(name = "totalNonHLAmt")
    private Double totalNonHLAmt;

    @Column(name = "bankSalaryLoanPos")
    private Double bankSalaryLoanPos;

    @Column(name = "cashSalaryLoanPos")
    private Double cashSalaryLoanPos;

    @Column(name = "itrIncomeLoanPos")
    private Double itrIncomeLoanPos;

    @Column(name = "assesedIncomeLoanPos")
    private Double assesedIncomeLoanPos;

    @Column(name = "fosNo")
    private Integer fosNo;

    @Column(name = "zeroFdFos")
    private Integer zeroFdFos;

    @Column(name = "zeroLoginFos")
    private Integer zeroLoginFos;

    @Column(name = "fosLoginProdicitivity")
    private Double fosLoginProdicitivity;

    @Column(name = "fosFdProdicitivity")
    private Double fosFdProdicitivity;

    @Column(name = "createdOn")
    private LocalDateTime createdOn;

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "lastModifiedOn")
    private LocalDateTime lastModifiedOn;

    @Column(name = "lastModifiedBy")
    private Integer lastModifiedBy;

    @Column(name = "currentCnt")
    private Integer currentCnt;

    @Column(name = "currentAmt")
    private Float currentAmt;

    @Column(name = "currentPer")
    private Float currentPer;

    @Column(name = "sma0Per")
    private Float sma0Per;

    @Column(name = "sma1Per")
    private Float sma1Per;

    @Column(name = "sma2Per")
    private Float sma2Per;

    @Column(name = "npaPer")
    private Float npaPer;

    @Column(name = "disbCnt")
    private Integer disbCnt;
}
