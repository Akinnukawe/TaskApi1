package com.tesa.taskapi1.repository.Interface;

import com.tesa.taskapi1.model.entity.Wallet;

import java.util.List;

public interface WalletRepository {
    List<Wallet> getAllWallets();

    Wallet getWalletById(int walletId);

    int createWallet(Wallet wallet);

    int updateWallet(Wallet wallet);

    int deleteWalletById(int walletId);
}

