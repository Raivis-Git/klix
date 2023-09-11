package com.klix.klix.integration.bank;

public enum Bank {
    FASTBANK("Fast Bank"),SOLIDBANK("Solid Bank");

    private final String name;
    Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
