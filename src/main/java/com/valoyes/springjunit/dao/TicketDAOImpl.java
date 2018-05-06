package com.valoyes.springjunit.dao;

import org.springframework.stereotype.Component;

import com.valoyes.springjunit.dto.Ticket;

@Component
public class TicketDAOImpl implements TicketDAO{

	@Override
	public int createTicket(Ticket ticket) {
		// retornamos 1 para indicar que todo ha ido bien
		// en este caso no nos interesa toda la logica que podria contener
		// este metodo
		return 1;
	}

}
