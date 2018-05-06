package com.valoyes.springjunit.service;

import com.valoyes.springjunit.dao.TicketDAO;
import com.valoyes.springjunit.dto.Ticket;

public class TicketServiceImpl implements TicketService {

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
