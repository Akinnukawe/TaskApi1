package com.tesa.taskapi1.service;

import com.google.gson.Gson;
import com.tesa.taskapi1.model.entity.Wallet;
import com.tesa.taskapi1.model.request.WalletCreateRequest;
import com.tesa.taskapi1.model.request.WalletUpdateRequest;
import com.tesa.taskapi1.repository.Interface.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    @Autowired
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public List<Wallet> getAllWallets() {
        return walletRepository.getAllWallets();
    }

    public Wallet getWalletById(int walletId) {
        return walletRepository.getWalletById(walletId);
    }

    public int createWallet(WalletCreateRequest request) {
        Gson gson = new Gson();
        var wallet = gson.fromJson(gson.toJson(request), Wallet.class);
        return walletRepository.createWallet(wallet);
    }

    public int updateWallet(WalletUpdateRequest request) {
        Gson gson = new Gson();
        var wallet = gson.fromJson(gson.toJson(request), Wallet.class);
        return walletRepository.updateWallet(wallet);
    }

    public int deleteWalletById(int walletId) {
        return walletRepository.deleteWalletById(walletId);
    }
}