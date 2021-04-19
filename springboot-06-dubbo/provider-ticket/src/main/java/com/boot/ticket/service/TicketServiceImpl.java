package com.boot.ticket.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
@Service
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "《厉害了，我的国》";
    }
}
