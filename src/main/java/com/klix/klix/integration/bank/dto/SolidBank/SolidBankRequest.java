package com.klix.klix.integration.bank.dto.SolidBank;

import com.klix.klix.integration.bank.dto.Base.BaseBankRequest;
import com.klix.klix.integration.bank.dto.enums.MaritalStatusEnum;

public class SolidBankRequest extends BaseBankRequest {
    String phone;
    String email;
    Double monthlyIncome;
    Double monthlyExpenses;
    MaritalStatusEnum maritalStatus;
    Boolean agreeToBeScored;
    Double amount;

    public SolidBankRequest(String phone, String email, Double monthlyIncome, Double monthlyExpenses, MaritalStatusEnum maritalStatus, Boolean agreeToBeScored, Double amount) {
        this.phone = phone;
        this.email = email;
        this.monthlyIncome = monthlyIncome;
        this.monthlyExpenses = monthlyExpenses;
        this.maritalStatus = maritalStatus;
        this.agreeToBeScored = agreeToBeScored;
        this.amount = amount;
    }

    public SolidBankRequest() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public MaritalStatusEnum getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Boolean getAgreeToBeScored() {
        return agreeToBeScored;
    }

    public void setAgreeToBeScored(Boolean agreeToBeScored) {
        this.agreeToBeScored = agreeToBeScored;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
