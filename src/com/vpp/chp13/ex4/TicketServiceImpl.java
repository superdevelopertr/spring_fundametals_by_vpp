package com.vpp.chp13.ex4;

import java.util.List;

import com.vpp.chp13.ex2.RecordNotFoundException;

public class TicketServiceImpl implements TicketService {

	private TicketDAO dao;

	public TicketServiceImpl(TicketDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public Ticket getTicketByPnr(String pnr) throws TicketNotFoundException {
		try {
			return dao.findTicketByPnr(pnr);
		} catch (RecordNotFoundException e) {
			throw new TicketNotFoundException();
		}
	}

	@Override
	public Ticket getTicketByCustomer(String customer) throws TicketNotFoundException {
		try {
			return dao.findTicketByCustomer(customer);
		} catch (RecordNotFoundException e) {
			throw new TicketNotFoundException();
		}
	}

	@Override
	public void newTicket(Ticket ticket) throws TicketAlreadyExistException {
		try {
			dao.createNewTicket(ticket);
		} catch (RecordAlreadyExistException e) {
			throw new TicketAlreadyExistException();
		}
	}

	@Override
	public List<Ticket> getAllTickets() {
		return dao.queryAllTicket();
	}

}
