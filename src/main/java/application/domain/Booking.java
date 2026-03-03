package application.domain;

import java.util.List;

public class Booking {
    private int bookingId;
    private String checkInDate;
    private String checkOutDate;
    private Guest guest;
    private BedRoom bedroom; // Atributo en minúscula
    private List<Services> services;

    public Booking(int bookingId, String checkInDate, String checkOutDate, Guest guest, BedRoom bedroom, List<Services> services) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guest = guest;
        this.bedroom = bedroom;
        this.services = services;
    }

    // Getters sincronizados con el Main
    public int getBookingId() { return bookingId; }

    public Guest getGuest() { return guest; }

    // OJO: Aquí está el truco. getBedroom() con 'd' minúscula
    public BedRoom getBedroom() {
        return bedroom;
    }

    public List<Services> getServices() {
        return services;
    }
}