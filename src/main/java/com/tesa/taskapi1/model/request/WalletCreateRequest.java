package com.tesa.taskapi1.model.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WalletCreateRequest {
    private String walletOwner;
    private double walletBalance;
    private String walletCurrency;
}
