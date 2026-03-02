import application.domain.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTIÓN HOTELERA CESDE    ");
        System.out.println("========================================\n");

        // 1. Creamos un Huésped (Probando Herencia de Person)
        Guest huesped = new Guest(101, "Alejandro", "Tangarife", "alejo@email.com", "admin123", true, "Colombia", "VIP");

        // 2. Creamos una Habitación
        BedRoom habitacion = new BedRoom(302, "Doble Superior", 185000.0);

        // 3. Creamos una lista de servicios
        Services desayuno = new Services(1, "Desayuno Americano", 25000.0, "Activo");
        Services wifi = new Services(2, "WiFi Premium", 0.0, "Activo");

        List<Services> listaServicios = new ArrayList<>();
        listaServicios.add(desayuno);
        listaServicios.add(wifi);

        // 4. Creamos la Reserva (Probando Composición)
        Booking miReserva = new Booking(5001, "2026-03-05", "2026-03-10", huesped, habitacion, listaServicios);

        // 5. Imprimimos los resultados usando los Getters
        System.out.println("Reserva ID: " + miReserva.getBookingId());
        System.out.println("Huésped: " + miReserva.getGuest().getName() + " " + miReserva.getGuest().getLastName());
        System.out.println("Habitación: " + miReserva.getBedroom().getRoomNumber() + " - " + miReserva.getBedroom().getRoomType());
        System.out.println("Servicios contratados:");

        for (Services s : miReserva.getServices()) {
            System.out.println(" - " + s.getServiceName() + " ($" + s.getPrice() + ")");
        }

        System.out.println("\n----------------------------------------");
        System.out.println("¡Ejecución exitosa, Alejo!");
    }
}