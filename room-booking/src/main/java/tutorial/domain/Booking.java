package tutorial.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

import io.swagger.annotations.ApiModelProperty;

public class Booking {

	@Id
	private Integer bookingId;

	private GlUser bookBy;
	
	@ApiModelProperty(notes="Cannot create a booking with a past date")
	private Date eventDate;

	public Booking() {
		super();
	}
	public Booking(Integer bookingId, GlUser bookBy, Date eventDate) {
		super();
		this.bookingId = bookingId;
		this.bookBy = bookBy;
		this.eventDate = eventDate;
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public GlUser getBookBy() {
		return bookBy;
	}

	public void setBookBy(GlUser bookBy) {
		this.bookBy = bookBy;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	

}
