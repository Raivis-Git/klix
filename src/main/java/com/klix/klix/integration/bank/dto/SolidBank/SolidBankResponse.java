package com.klix.klix.integration.bank.dto.SolidBank;

import com.klix.klix.integration.bank.dto.Base.BaseBankResponse;

public class SolidBankResponse extends BaseBankResponse {

    SolidBankRequest request;

    public SolidBankRequest getRequest() {
        return request;
    }

    public void setRequest(SolidBankRequest request) {
        this.request = request;
    }
}
