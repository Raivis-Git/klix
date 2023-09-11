package com.klix.klix.controller.dto;

import com.klix.klix.integration.bank.dto.enums.MaritalStatusEnum;

public class PostApplicationDTO {
    String phoneNumber;
    String email;
    Double monthlyIncome;
    Double monthlyExpenses;
    Integer dependents;
    Boolean agreeToDataSharing;
    Double amount;
    MaritalStatusEnum maritalStatus;

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

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(Double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
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

    public MaritalStatusEnum getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
