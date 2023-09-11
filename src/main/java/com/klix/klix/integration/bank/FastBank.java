package com.klix.klix.integration.bank;

import com.google.gson.Gson;
import com.klix.klix.controller.dto.PostApplicationDTO;
import com.klix.klix.integration.bank.dto.FastBank.FastBankRequest;
import com.klix.klix.integration.bank.dto.FastBank.FastBankResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class FastBank extends BaseBank {

    FastBankRequest fastBankRequest;

    public FastBank() {
    }

    public FastBank(PostApplicationDTO bankRequest) {
        super(bankRequest);
    }

    public FastBankResponse getApplicationById(String id) throws Exception {
        if (!StringUtils.hasText(id))
            throw new Exception("No ID provided");

        String responseString = BaseBank.requestGet("https://shop.stage.klix.app:443/api/FastBank/applications/" + id.trim());
        if (responseString == null)
            throw new Exception("Response is null");

        return convertJsonToResponse(responseString);
    }

    public FastBankResponse postApplication() {
        try {
            return postApplication(this.fastBankRequest);
        } catch (Exception e) {
            return null;
        }
    }

    public FastBankResponse postApplication(FastBankRequest fastBankRequest) throws Exception {

        String responseString = BaseBank.requestPost("https://shop.stage.klix.app:443/api/FastBank/applications", fastBankRequest);
        if (responseString == null)
            throw new Exception("Response is null");

        return convertJsonToResponse(responseString);
    }

    private FastBankResponse convertJsonToResponse(String responseString) {
        return new Gson().fromJson(responseString, FastBankResponse.class);
    }

    @Override
    void convertRequest(PostApplicationDTO bankRequest) {
        fastBankRequest = new FastBankRequest(bankRequest.getPhoneNumber(),
                bankRequest.getEmail(), bankRequest.getMonthlyIncome(),
                bankRequest.getMonthlyExpenses(), bankRequest.getDependents(),
                bankRequest.getAgreeToDataSharing(), bankRequest.getAmount());
    }
}
