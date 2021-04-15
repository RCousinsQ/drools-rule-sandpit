package com.drools.sandpit.droolsrulesandpit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TradeValue {

    private int tradeAmount;
    private String message;



    public static void methodTest2(){
        System.out.println("Inside method test 2");

    }

}
