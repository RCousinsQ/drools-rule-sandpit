package com.drools.sandpit.droolsrulesandpit.utility;


import com.drools.sandpit.droolsrulesandpit.controller.TradeController;
import com.drools.sandpit.droolsrulesandpit.dao.TradeDataDAOImpl;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class DataAlertHelper {

    @Autowired
    KieSession kieSession;

    @Autowired
    TradeDataDAOImpl tradeDataDAO;


   public void db_insert_alert(int tradeId){

    System.out.println("IN DATA_ALERT_HELPER CLASS METHOD WITH ID: "+tradeId);
    tradeDataDAO.dataAlertWrite(tradeId);

    }
}
