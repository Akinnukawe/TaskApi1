package com.tesa.taskapi1.repository.Implementation;

import com.tesa.taskapi1.mapper.WalletRowMapper;
import com.tesa.taskapi1.model.entity.Wallet;
import com.tesa.taskapi1.repository.Interface.WalletRepository;
import com.tesa.taskapi1.repository.Query.WalletQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WalletRepositoryImpl implements WalletRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public WalletRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Wallet> getAllWallets() {
        return jdbcTemplate.query(WalletQuery.GET_ALL, new WalletRowMapper());
    }

    @Override
    public Wallet getWalletById(int walletId) {
        MapSqlParameterSource params = new MapSqlParameterSource("walletId", walletId);
        return jdbcTemplate.queryForObject(WalletQuery.GET_BY_ID, params, new WalletRowMapper());
    }

    @Override
    public int createWallet(Wallet wallet) {
        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("walletOwner", wallet.getWalletOwner())
                .addValue("walletBalance", wallet.getWalletBalance())
                .addValue("walletCurrency", wallet.getWalletCurrency())
                .addValue("walletStatus", wallet.getWalletStatus());
        return jdbcTemplate.update(WalletQuery.INSERT_WALLET, params);
    }

    @Override
    public int updateWallet(Wallet wallet) {
        MapSqlParameterSource params = new MapSqlParameterSource()
                .addValue("walletId", wallet.getWalletId())
                .addValue("walletOwner", wallet.getWalletOwner())
                .addValue("walletBalance", wallet.getWalletBalance())
                .addValue("walletCurrency", wallet.getWalletCurrency())
                .addValue("walletStatus", wallet.getWalletStatus());
        return jdbcTemplate.update(WalletQuery.UPDATE_WALLET, params);
    }

    @Override
    public int deleteWalletById(int walletId) {
        MapSqlParameterSource params = new MapSqlParameterSource("walletId", walletId);
        return jdbcTemplate.update(WalletQuery.DELETE_BY_ID, params);
    }
}

