package com.klix.klix.integration.bank.dto.Base;

import com.klix.klix.integration.bank.dto.enums.ApplicationStatusEnum;

public class BaseBankResponse {
    String id;
    ApplicationStatusEnum status;

    BaseBankOffer offer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ApplicationStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatusEnum status) {
        this.status = status;
    }

    public BaseBankOffer getOffer() {
        return offer;
    }

    public void setOffer(BaseBankOffer offer) {
        this.offer = offer;
    }
}
