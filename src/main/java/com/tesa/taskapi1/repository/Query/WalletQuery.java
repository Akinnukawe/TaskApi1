package com.tesa.taskapi1.repository.Query;

public class WalletQuery {

    public static final String INSERT_WALLET = """
        INSERT INTO Wallet (walletOwner, walletBalance, walletCurrency)
        VALUES (:walletOwner, :walletBalance, :walletCurrency)
    """;

    public static final String GET_ALL = "SELECT * FROM Wallet";

    public static final String GET_BY_ID = "SELECT * FROM Wallet WHERE walletId = :walletId";

    public static final String UPDATE_WALLET = """
        UPDATE Wallet
        SET walletOwner = :walletOwner,
            walletBalance = :walletBalance,
            walletCurrency = :walletCurrency,
            walletStatus = :walletStatus,
            walletUpdatedAt = GETDATE()
        WHERE walletId = :walletId
    """;

    public static final String DELETE_BY_ID = "DELETE FROM Wallet WHERE walletId = :walletId";

}