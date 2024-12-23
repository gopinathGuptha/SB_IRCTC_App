package in.gopinath.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import in.gopinath.bindings.Passenger;
import in.gopinath.bindings.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	Map<Integer, Ticket> db = new HashMap<>();

	@Override
	public Ticket bookTicket(Passenger p) {
		Ticket ticket = new Ticket();
		Random random = new Random();
		int nextInt = random.nextInt(10);
		ticket.setTicketNum(nextInt);
		BeanUtils.copyProperties(p, ticket);
		ticket.setStatus("CONFIRMED");
		db.put(nextInt, ticket);
		return ticket;
	}

	@Override
	public Collection<Ticket> getTickets() {
		return db.values();
	}

}
