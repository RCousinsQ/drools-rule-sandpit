package com.drools.sandpit.droolsrulesandpit.mapper;

import com.drools.sandpit.droolsrulesandpit.dao.TradeDataDAO;
import com.drools.sandpit.droolsrulesandpit.model.TradeData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TradeDataMapper implements RowMapper {

    TradeDataDAO tradeDataDAO;

    public TradeDataMapper(TradeDataDAO tradeDataDAO) {
        this.tradeDataDAO = tradeDataDAO;
    }

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        TradeData tradeData = new TradeData(tradeDataDAO);

        tradeData.setId(rs.getInt("id"));
        tradeData.setUserId(rs.getInt("userId"));
        tradeData.setTradeAmount(rs.getInt("tradeAmount"));

        return tradeData;
    }
}
