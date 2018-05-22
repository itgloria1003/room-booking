package tutorial.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import tutorial.domain.Booking;
import tutorial.domain.BookingDetail;
import tutorial.domain.GlUser;

@Component
public class BookingDaoService<T> {

	List<Booking> bookings;
	 {
		bookings  =new ArrayList<Booking>();
		bookings.add(new BookingDetail("Room", true, 1, new GlUser("gloria"), new Date()));
	}
	public List<Booking> getBookings(){
		
		return  (List<Booking>) bookings;
		
	}

	public BookingDetail getBookingDetail(Integer bookingId) {
		BookingDetail detail = new BookingDetail();
		detail.setBookingId(bookingId);
		return detail;
		
	}

	public BookingDetail save(BookingDetail detail) {
		// TODO Auto-generated method stub
		bookings.add(detail);
		detail.setBookingId(bookings.size());
		return detail;
	}
}
