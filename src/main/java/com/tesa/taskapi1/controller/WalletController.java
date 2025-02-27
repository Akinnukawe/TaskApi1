package com.tesa.taskapi1.controller;

import com.tesa.taskapi1.model.entity.Wallet;
import com.tesa.taskapi1.model.request.WalletCreateRequest;
import com.tesa.taskapi1.model.request.WalletUpdateRequest;
import com.tesa.taskapi1.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallet")
public class WalletController {
    private final WalletService walletService;

    @Autowired
    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/create-wallet")
    public ResponseEntity<String> createWallet(@RequestBody WalletCreateRequest wallet) {
        var resp = walletService.createWallet(wallet);
        if (resp < 1)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wallet failed to create");
        return ResponseEntity.ok("Wallet created successfully");
    }

    @GetMapping
    public ResponseEntity<List<Wallet>> getAllWallets() {
        return ResponseEntity.ok(walletService.getAllWallets());
    }

    @GetMapping("/get-by-id/{walletId}")
    public ResponseEntity<Wallet> getWalletById(@PathVariable int walletId) {
        return ResponseEntity.ok(walletService.getWalletById(walletId));
    }

    @PutMapping("/update-wallet")
    public ResponseEntity<String> updateWallet(@RequestBody WalletUpdateRequest wallet) {
        var resp = walletService.updateWallet(wallet);
        if (resp < 1)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wallet failed to update");
        return ResponseEntity.ok("Wallet updated successfully");
    }

    @DeleteMapping("/delete-by-id/{walletId}")
    public ResponseEntity<String> deleteWalletById(@PathVariable int walletId) {
        var resp = walletService.deleteWalletById(walletId);
        if (resp < 1)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Wallet failed to delete");
        return ResponseEntity.ok("Wallet deleted successfully");
    }
}