package com.drools.sandpit.droolsrulesandpit.controller;

import com.drools.sandpit.droolsrulesandpit.dao.TradeDataDAOImpl;
import com.drools.sandpit.droolsrulesandpit.model.TradeData;
import com.drools.sandpit.droolsrulesandpit.model.TradeValue;
import com.drools.sandpit.droolsrulesandpit.service.TradeDataService;
import com.drools.sandpit.droolsrulesandpit.utility.DataAlertHelper;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TradeController {

    @Autowired
    private KieSession session;

    @Autowired
    TradeDataService tradeDataService;

    @Autowired
    TradeDataDAOImpl tradeDataDAO;


    @GetMapping("/trades")
    public List<TradeData> getDataFromDb() {

        return tradeDataService.getData();
    }


    @GetMapping("/trades/list")
    public void trade() {

        List<TradeData> data = tradeDataService.getData();

        for (TradeData d : data){
            session.insert(d);
            session.fireAllRules();
        }

    }




    @PostMapping("/trades/insert/{id}")
    public void insertTest(@PathVariable int id){
        tradeDataDAO.dataAlertWrite(id);
    }





/*
    rule "trade is over 250,000"
    when
    $td : TradeValue(tradeAmount>250000);
    then
$td.setMessage("Trade is too high");
System.out.println("Trade is trade is above 10 "+$td.getId());
System.out.println("Trade is too high");
$td.methodTest2();
    end;



    rule "trade limit is 10"
when
$td : TradeData(tradeAmount>10);
then
$td.setMessage("Trade is too high for");
$td.log($td.getId());
DataAlertHelper $da = new DataAlertHelper();
$da.db_insert_alert($td.getId());
end;


*/


}
