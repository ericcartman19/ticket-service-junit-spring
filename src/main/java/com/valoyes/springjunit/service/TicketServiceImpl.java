package com.valoyes.springjunit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.valoyes.springjunit.dao.TicketDAO;
import com.valoyes.springjunit.dto.Ticket;

@Component
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDAO dao;
	
	@Override
	public int buyTicket(String passengerName, String phone) {
		Ticket ticket = new Ticket(passengerName, phone);
		return getDao().createTicket(ticket);
	}

	public TicketDAO getDao() {
		return dao;
	}

	public void setDao(TicketDAO dao) {
		this.dao = dao;
	}

}
