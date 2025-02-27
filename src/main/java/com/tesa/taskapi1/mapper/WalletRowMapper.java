package com.tesa.taskapi1.mapper;

import com.tesa.taskapi1.model.entity.Wallet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletRowMapper implements RowMapper<Wallet> {
    @Override
    public Wallet mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Wallet.builder()
                .walletId(rs.getInt("walletId"))
                .walletOwner(rs.getString("walletOwner"))
                .walletBalance(rs.getDouble("walletBalance"))
                .walletCurrency(rs.getString("walletCurrency"))
                .walletStatus(rs.getString("walletStatus"))
                .walletCreatedAt(rs.getString("walletCreatedAt"))
                .walletUpdatedAt(rs.getString("walletUpdatedAt"))
                .build();
    }
}
