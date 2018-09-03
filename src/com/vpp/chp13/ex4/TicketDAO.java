package com.vpp.chp13.ex4;

import java.util.List;

import com.vpp.chp13.ex2.RecordNotFoundException;

public interface TicketDAO {
	Ticket findTicketByPnr(String pnr)throws RecordNotFoundException;
	Ticket findTicketByCustomer(String customer)throws RecordNotFoundException;
	void createNewTicket(Ticket ticket)throws RecordAlreadyExistException;
	List<Ticket> queryAllTicket();
}
