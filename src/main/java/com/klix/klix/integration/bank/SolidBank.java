package com.klix.klix.integration.bank;

import com.google.gson.Gson;
import com.klix.klix.controller.dto.PostApplicationDTO;
import com.klix.klix.integration.bank.dto.SolidBank.SolidBankRequest;
import com.klix.klix.integration.bank.dto.SolidBank.SolidBankResponse;
import com.klix.klix.integration.bank.dto.enums.MaritalStatusEnum;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class SolidBank extends BaseBank {

    SolidBankRequest solidBankRequest;

    public SolidBank() {
    }

    public SolidBank(PostApplicationDTO bankRequest) {
        super(bankRequest);
    }

    public SolidBankResponse getApplicationById(String id) throws Exception {
        if (!StringUtils.hasText(id))
            throw new Exception("No ID provided");

        String responseString = BaseBank.requestGet("https://shop.stage.klix.app/api/SolidBank/applications/" + id.trim());
        if (responseString == null)
            throw new Exception("Response is null");

        return convertJsonToResponse(responseString);
    }

    public SolidBankResponse postApplication() {
        try {
            return postApplication(this.solidBankRequest);
        } catch (Exception e) {
            return null;
        }
    }

    public SolidBankResponse postApplication(SolidBankRequest solidBankRequest) throws Exception {

        String responseString = BaseBank.requestPost("https://shop.stage.klix.app/api/SolidBank/applications", solidBankRequest);
        if (responseString == null)
            throw new Exception("Response is null");

        return convertJsonToResponse(responseString);
    }

    private SolidBankResponse convertJsonToResponse(String responseString) {
        Gson gson = new Gson();
        return gson.fromJson(responseString, SolidBankResponse.class);
    }

    @Override
    void convertRequest(PostApplicationDTO bankRequest) {
        solidBankRequest = new SolidBankRequest(bankRequest.getPhoneNumber(),
                bankRequest.getEmail(), bankRequest.getMonthlyIncome(),
                bankRequest.getMonthlyExpenses(), bankRequest.getMaritalStatus(),
                bankRequest.getAgreeToDataSharing(), bankRequest.getAmount());
    }
}
