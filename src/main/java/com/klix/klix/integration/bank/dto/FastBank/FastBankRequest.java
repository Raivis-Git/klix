package com.klix.klix.integration.bank.dto.FastBank;

import com.klix.klix.integration.bank.dto.Base.BaseBankRequest;

public class FastBankRequest extends BaseBankRequest {
    String phoneNumber;
    String email;
    Double monthlyIncomeAmount;
    Double monthlyCreditLiabilities;
    Integer dependents;
    Boolean agreeToDataSharing;
    Double amount;

    public FastBankRequest(String phoneNumber, String email, Double monthlyIncomeAmount, Double monthlyCreditLiabilities, Integer dependents, Boolean agreeToDataSharing, Double amount) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.monthlyIncomeAmount = monthlyIncomeAmount;
        this.monthlyCreditLiabilities = monthlyCreditLiabilities;
        this.dependents = dependents;
        this.agreeToDataSharing = agreeToDataSharing;
        this.amount = amount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getMonthlyIncomeAmount() {
        return monthlyIncomeAmount;
    }

    public void setMonthlyIncomeAmount(Double monthlyIncomeAmount) {
        this.monthlyIncomeAmount = monthlyIncomeAmount;
    }

    public Double getMonthlyCreditLiabilities() {
        return monthlyCreditLiabilities;
    }

    public void setMonthlyCreditLiabilities(Double monthlyCreditLiabilities) {
        this.monthlyCreditLiabilities = monthlyCreditLiabilities;
    }

    public Integer getDependents() {
        return dependents;
    }

    public void setDependents(Integer dependents) {
        this.dependents = dependents;
    }

    public Boolean getAgreeToDataSharing() {
        return agreeToDataSharing;
    }

    public void setAgreeToDataSharing(Boolean agreeToDataSharing) {
        this.agreeToDataSharing = agreeToDataSharing;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
