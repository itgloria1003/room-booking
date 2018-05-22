package tutorial;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tutorial.domain.Booking;
import tutorial.domain.BookingDetail;
import tutorial.service.BookingDaoService;

@RestController 
public class BookingResource{
	
	@Autowired
	BookingDaoService bookingService; 
	
	@GetMapping(path="/bookings")
	public List<Booking> getBookings() {
		List<Booking> bookings = bookingService.getBookings();
		return bookings;	
	}
	
	@GetMapping(path="/bookings/{bookingId}")
	public BookingDetail getBookDetail(@PathVariable Integer bookingId) {
		BookingDetail bookingDetail = bookingService.getBookingDetail(bookingId);
		return bookingDetail;
	}
	
	@PostMapping(path="/bookings/create")
	public BookingDetail createBooking( @RequestBody BookingDetail detail ) {
		
		return bookingService.save(detail);
	}
	
}