package com.klix.klix.integration.bank.dto.Base;

public class BaseBankOffer {
    Double monthlyPaymentAmount;
    Double totalRepaymentAmount;
    Integer numberOfPayments;
    Double annualPercentageRate;
    String firstRepaymentDate;

    public Double getMonthlyPaymentAmount() {
        return monthlyPaymentAmount;
    }

    public void setMonthlyPaymentAmount(Double monthlyPaymentAmount) {
        this.monthlyPaymentAmount = monthlyPaymentAmount;
    }

    public Double getTotalRepaymentAmount() {
        return totalRepaymentAmount;
    }

    public void setTotalRepaymentAmount(Double totalRepaymentAmount) {
        this.totalRepaymentAmount = totalRepaymentAmount;
    }

    public Integer getNumberOfPayments() {
        return numberOfPayments;
    }

    public void setNumberOfPayments(Integer numberOfPayments) {
        this.numberOfPayments = numberOfPayments;
    }

    public Double getAnnualPercentageRate() {
        return annualPercentageRate;
    }

    public void setAnnualPercentageRate(Double annualPercentageRate) {
        this.annualPercentageRate = annualPercentageRate;
    }

    public String getFirstRepaymentDate() {
        return firstRepaymentDate;
    }

    public void setFirstRepaymentDate(String firstRepaymentDate) {
        this.firstRepaymentDate = firstRepaymentDate;
    }
}
