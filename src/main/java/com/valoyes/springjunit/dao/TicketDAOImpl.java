package com.valoyes.springjunit.dao;

import com.valoyes.springjunit.dto.Ticket;

public class TicketDAOImpl implements TicketDAO{

	@Override
	public int createTicket(Ticket ticket) {
		// retornamos 1 para indicar que todo ha ido bien
		// en este caso no nos interesa toda la logica que podria contener
		// este metodo
		return 1;
	}

}
