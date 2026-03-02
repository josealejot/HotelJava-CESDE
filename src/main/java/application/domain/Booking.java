package application.domain;

import java.util.List;

public class Booking {

    private int bookingId;
    private String checkInDate;
    private String checkOutDate;
    private Guest guest;
    private BedRoom bedroom;
    private List<Services> services;

    // Constructor vacío
    public Booking() {
    }

    // Constructor completo
    public Booking(int bookingId, String checkInDate, String checkOutDate, Guest guest, BedRoom bedroom, List<Services> services) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guest = guest;
        this.bedroom = bedroom;
        this.services = services;
    }

    // --- GETTERS Y SETTERS (La carpintería completa) ---

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public BedRoom getBedroom() {
        return bedroom;
    }

    public void setBedroom(BedRoom bedroom) {
        this.bedroom = bedroom;
    }

    public List<Services> getServices() {
        return services;
    }

    public void setServices(List<Services> services) {
        this.services = services;
    }
}