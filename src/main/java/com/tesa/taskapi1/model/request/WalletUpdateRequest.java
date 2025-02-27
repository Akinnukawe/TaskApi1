package com.tesa.taskapi1.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WalletUpdateRequest {
    private int walletId;
    private String walletOwner;
    private double walletBalance;
    private String walletCurrency;
    private String walletStatus;
}
