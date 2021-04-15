package com.drools.sandpit.droolsrulesandpit.dao;

import com.drools.sandpit.droolsrulesandpit.model.TradeData;

import java.util.List;

public interface TradeDataDAO {

    List<TradeData> getData();

    void dataAlertWrite(int tradeId);

}
