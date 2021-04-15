package com.drools.sandpit.droolsrulesandpit.service;

import com.drools.sandpit.droolsrulesandpit.dao.TradeDataDAO;
import com.drools.sandpit.droolsrulesandpit.model.TradeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeDataServiceImpl implements TradeDataService {


    @Autowired
    TradeDataDAO tradeDataDAO;

    @Override
    public List<TradeData> getData() {
        return tradeDataDAO.getData();
    }
}
