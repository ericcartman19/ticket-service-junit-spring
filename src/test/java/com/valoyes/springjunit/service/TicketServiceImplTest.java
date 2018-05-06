package com.valoyes.springjunit.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.mockito.Mockito.*;

import com.valoyes.springjunit.dao.TicketDAO;
import com.valoyes.springjunit.dto.Ticket;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:application-context.xml")
public class TicketServiceImplTest {

	private static final int EXPECTED_RESULTADO = 1;
	private static final String PASSENGER_PHONE = "12345";
	private static final String PASSENGER_NAME = "Elio";

	@Mock
	TicketDAO dao;
	
	@Autowired
	@InjectMocks	// permite inyectar todas las dependencies mockeadas a este objeto
	private TicketServiceImpl service;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void buyTickets_ShouldReturnAValidValue() {
		
		// when
		when(dao.createTicket(any(Ticket.class))).thenReturn(1);
		int resultado = service.buyTicket(PASSENGER_NAME, PASSENGER_PHONE);
		
		// then
		assertEquals(EXPECTED_RESULTADO, resultado);
	}

}
