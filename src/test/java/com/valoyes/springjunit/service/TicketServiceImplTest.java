package com.valoyes.springjunit.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.valoyes.springjunit.dao.TicketDAO;

public class TicketServiceImplTest {

	private static final int EXPECTED_RESULTADO = 1;
	private static final String PASSENGER_PHONE = "12345";
	private static final String PASSENGER_NAME = "Elio";

	@Mock
	TicketDAO dao;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void buyTickets_ShouldReturnAValidValue() {

		// given
		TicketServiceImpl service = new TicketServiceImpl();
		
		// when
		int resultado = service.buyTicket(PASSENGER_NAME, PASSENGER_PHONE);
		
		// then
		assertEquals(EXPECTED_RESULTADO, resultado);
	}

}
