package com.boot.providerticket.service;

import org.springframework.stereotype.Service;

@Service
public class TicketService {


    public String getTicket(){
        System.out.println("aaaaaaaaaa");
        return "《厉害了，我的国》";
    }

}
