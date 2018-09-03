package com.vpp.chp13.ex4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.vpp.chp13.ex2.RecordNotFoundException;

public class TicketDAOJdbcImpl implements TicketDAO {

	private JdbcTemplate jdbcTemplate;

	public TicketDAOJdbcImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Ticket findTicketByPnr(String pnr) throws RecordNotFoundException {
		try {
			return jdbcTemplate.queryForObject("select * from public.ticket where pnr=?", new Object[]{pnr},new TicketMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new RecordNotFoundException();
		}
	}

	@Override
	public Ticket findTicketByCustomer(String customer) throws RecordNotFoundException{
		try {
			return jdbcTemplate.queryForObject("select * from public.ticket where customer=?", new Object[]{customer},new TicketMapper());
		} catch (EmptyResultDataAccessException e) {
			throw new RecordNotFoundException();
		}	
	}

	@Override
	public void createNewTicket(Ticket ticket) throws RecordAlreadyExistException {
		Ticket prevTicket=null;
		try {
			prevTicket=findTicketByPnr(ticket.getPnr());
		} catch (Exception e) {
		}
		
		if(prevTicket!=null){
			throw new RecordAlreadyExistException();
		}
		
		jdbcTemplate.update("insert into public.ticket(pnr,customer,flight_time) values(?,?,?)", ticket.getPnr(), ticket.getPassenger(), ticket.getFlightTime());
	}

	@Override
	public List<Ticket> queryAllTicket() {
		return jdbcTemplate.query("select * from public.ticket", new TicketMapper());
	}

}

class TicketMapper implements RowMapper<Ticket>{
	@Override
	public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Ticket(rs.getString("pnr"), rs.getString("customer"), rs.getDate("flight_time"));
	}
}
