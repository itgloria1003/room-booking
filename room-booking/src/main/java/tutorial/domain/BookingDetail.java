package tutorial.domain;

import java.util.Date;

public class BookingDetail extends Booking {
	public BookingDetail(String description, boolean isInternal, Integer bookingId, GlUser bookBy, Date eventDate) {
		super(bookingId, bookBy, eventDate);
		this.description = description;
		this.isInternal = isInternal;
	}
	public BookingDetail() {
		// TODO Auto-generated constructor stub
		super();
	}
	private String description; 
	private boolean isInternal;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isInternal() {
		return isInternal;
	}
	public void setInternal(boolean isInternal) {
		this.isInternal = isInternal;
	}
	
	
}