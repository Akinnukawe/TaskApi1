package com.tesa.taskapi1.model.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Wallet {
    private int walletId;
    private String walletOwner;
    private double walletBalance;
    private String walletCurrency;
    private String walletStatus;
    private String walletCreatedAt;
    private String walletUpdatedAt;
}
