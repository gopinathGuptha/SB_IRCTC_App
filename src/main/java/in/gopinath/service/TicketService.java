package in.gopinath.service;

import java.util.Collection;

import in.gopinath.bindings.Passenger;
import in.gopinath.bindings.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	public Collection<Ticket> getTickets();

}
