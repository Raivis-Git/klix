package com.klix.klix.service;

import com.klix.klix.controller.dto.PostApplicationDTO;
import com.klix.klix.integration.bank.Bank;
import com.klix.klix.integration.bank.FastBank;
import com.klix.klix.integration.bank.SolidBank;
import com.klix.klix.integration.bank.dto.Base.BaseBankResponse;
import com.klix.klix.integration.bank.dto.FastBank.FastBankResponse;
import com.klix.klix.integration.bank.dto.SolidBank.SolidBankResponse;
import com.klix.klix.integration.bank.dto.enums.ApplicationStatusEnum;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MainService {

    public Map<String, String> createApplication(PostApplicationDTO bankRequest) {
        Map<String, String> ids = new HashMap<>();
        FastBank fastBank = new FastBank(bankRequest);
        SolidBank solidBank = new SolidBank(bankRequest);

        try {
            FastBankResponse fastBankResponse = fastBank.postApplication();
            if (fastBankResponse != null)
                ids.put(Bank.FASTBANK.getName(), fastBankResponse.getId());

            SolidBankResponse solidBankResponse = solidBank.postApplication();
            if (solidBankResponse != null)
                ids.put(Bank.SOLIDBANK.getName(), solidBankResponse.getId());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ids;
    }

    public List<BaseBankResponse> getBankResponse(Map<String, String> bankIdMap) {
        List<BaseBankResponse> bankResponseList = new ArrayList<>();
        for (Map.Entry<String, String> bankId : bankIdMap.entrySet()) {
            String id = bankId.getValue();
            String bank = bankId.getKey();

            if (Bank.SOLIDBANK.getName().equals(bank)) {
                SolidBank solidBank = new SolidBank();
                try {
                    SolidBankResponse solidBankResponse = solidBank.getApplicationById(id);
                    if (ApplicationStatusEnum.PROCESSED.equals(solidBankResponse.getStatus()))
                        bankResponseList.add(solidBankResponse);

                } catch (Exception e) {
                    return null;
                }
            }
            else if (Bank.FASTBANK.getName().equals(bank)) {
                FastBank fastBank = new FastBank();
                try {
                    FastBankResponse fastBankResponse = fastBank.getApplicationById(id);
                    if (ApplicationStatusEnum.PROCESSED.equals(fastBankResponse.getStatus()))
                        bankResponseList.add(fastBankResponse);
                } catch (Exception e) {
                    return null;
                }
            }

        }

        return bankResponseList;
    }

}
