package com.drools.sandpit.droolsrulesandpit.dao;

import com.drools.sandpit.droolsrulesandpit.mapper.TradeDataMapper;
import com.drools.sandpit.droolsrulesandpit.model.TradeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class TradeDataDAOImpl implements TradeDataDAO{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<TradeData> getData() {
        String sql = "SELECT * FROM drool_data";
        return jdbcTemplate.query(sql, new TradeDataMapper());

    }

    @Override
    public void dataAlertWrite(int tradeId) {
        String sql = "INSERT into drool_alert (tradeid) VALUES (?)";
        jdbcTemplate.update(sql, tradeId);
    }


}
