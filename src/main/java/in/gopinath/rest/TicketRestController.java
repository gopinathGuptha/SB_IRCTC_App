package in.gopinath.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.gopinath.bindings.Passenger;
import in.gopinath.bindings.Ticket;
import in.gopinath.service.TicketService;

@RestController
public class TicketRestController {

	@Autowired
	private TicketService service;

	@PostMapping("/bookticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p) {
		Ticket bookTicket = service.bookTicket(p);
		return new ResponseEntity<>(bookTicket, HttpStatus.CREATED);
	}

	@GetMapping("/getticket")
	public ResponseEntity<Collection<Ticket>> getTickets() {
		Collection<Ticket> tickets = service.getTickets();
		return new ResponseEntity<>(tickets, HttpStatus.OK);

	}

}
