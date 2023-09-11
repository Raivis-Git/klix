package com.klix.klix.integration.bank.dto.FastBank;

import com.klix.klix.integration.bank.dto.Base.BaseBankResponse;

public class FastBankResponse extends BaseBankResponse {

    FastBankRequest request;

    public FastBankRequest getRequest() {
        return request;
    }

    public void setRequest(FastBankRequest request) {
        this.request = request;
    }
}
