package com.onfotech.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Ticket;
import com.infotech.model.TicketVendingMachine;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		TicketVendingMachine ticketVendingMachine = ctx.getBean("ticketVendingMachine", TicketVendingMachine.class);
		
		Ticket ticket = ticketVendingMachine.generateTicket();
		
		System.out.println(ticket.printTicket());
		ctx.close();
		
	}

}
