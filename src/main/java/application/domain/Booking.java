package application.domain;

import java.util.List;

public class Booking {

    private int id;
    private String fecha;
    private int cantidad;
    private Guest guest;
    private BedRoom bedroom;
    private List<Service> servicios;

    public Booking() {}

    public Booking(int id, String fecha, int cantidad, Guest guest, BedRoom bedroom, List<Service> servicios) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.guest = guest;
        this.bedroom = bedroom;
        this.servicios = servicios;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public Guest getGuest() { return guest; }
    public void setGuest(Guest guest) { this.guest = guest; }
    public BedRoom getBedroom() { return bedroom; }
    public void setBedroom(BedRoom bedroom) { this.bedroom = bedroom; }
    public List<Service> getServicios() { return servicios; }
    public void setServicios(List<Service> servicios) { this.servicios = servicios; }

    public Booking createBooking(Booking booking) {
        return booking;
    }

    public void getBookingById(int id, Booking booking) {
        if(booking.getId() == id) {
            System.out.println("Fecha de reserva: " + booking.getFecha());
        }
    }
}