package com.vpp.chp13.ex4;

import java.util.List;

import com.vpp.chp13.ex2.RecordNotFoundException;

public interface TicketService {
	Ticket getTicketByPnr(String pnr)throws TicketNotFoundException;
	Ticket getTicketByCustomer(String customer)throws TicketNotFoundException;
	void newTicket(Ticket ticket)throws TicketAlreadyExistException;
	List<Ticket> getAllTickets();
}
