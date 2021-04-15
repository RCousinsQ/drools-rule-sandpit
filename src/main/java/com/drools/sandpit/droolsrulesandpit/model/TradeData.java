package com.drools.sandpit.droolsrulesandpit.model;

import com.drools.sandpit.droolsrulesandpit.dao.TradeDataDAO;
import com.drools.sandpit.droolsrulesandpit.dao.TradeDataDAOImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class TradeData {

    private int id;
    private int userId;
    private int tradeAmount;
    private String message;

    @Autowired
    TradeDataDAOImpl tradeDataDAO;




    public void log(int tradeId){
        System.out.println("Bad TradeId: "+tradeId);
        tradeDataDAO.dataAlertWrite(id);

    }







}
