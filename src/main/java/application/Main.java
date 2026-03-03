package application;

import application.domain.*;
import java.util.Scanner; // Clase para leer el teclado
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTIÓN HOTELERA CESDE    ");
        System.out.println("========================================\n");

        // 1. Registro Manual del Huésped
        System.out.print("Ingrese el nombre del huésped: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = teclado.nextLine();
        Guest huesped = new Guest(101, nombre, apellido, "alejo@email.com", "admin123", true, "Colombia", "VIP");

        // 2. Registro de la Habitación
        System.out.print("\nNúmero de habitación (ej: 302): ");
        int numHab = Integer.parseInt(teclado.nextLine());
        System.out.print("Tipo de habitación (Doble/Suite): ");
        String tipo = teclado.nextLine();
        System.out.print("Precio por noche: ");
        double precioHab = Double.parseDouble(teclado.nextLine());
        BedRoom habitacion = new BedRoom(numHab, tipo, precioHab);

        // 3. Registro de Servicios (Ciclo Interactivo)
        List<Services> listaServicios = new ArrayList<>();
        String opcion = "";

        System.out.println("\n--- REGISTRO DE SERVICIOS ADICIONALES ---");
        while (!opcion.equalsIgnoreCase("fin")) {
            System.out.print("Nombre del servicio (o escriba 'fin' para terminar): ");
            opcion = teclado.nextLine();

            if (!opcion.equalsIgnoreCase("fin")) {
                System.out.print("Precio del servicio " + opcion + ": ");
                double precioServ = Double.parseDouble(teclado.nextLine());
                listaServicios.add(new Services(1, opcion, precioServ, "Activo"));
                System.out.println(">> Servicio '" + opcion + "' agregado.");
            }
        }

        // 4. Creación de la Reserva (Composición)
        Booking miReserva = new Booking(5001, "2026-03-05", "2026-03-10", huesped, habitacion, listaServicios);

        // 5. Reporte Final
        System.out.println("\n========================================");
        System.out.println("       RESUMEN DE LA RESERVA           ");
        System.out.println("========================================");
        System.out.println("Reserva ID: " + miReserva.getBookingId());
        System.out.println("Huésped: " + miReserva.getGuest().getName() + " " + miReserva.getGuest().getLastName());
        System.out.println("Habitación: " + miReserva.getBedroom().getRoomNumber() + " - " + miReserva.getBedroom().getRoomType());

        System.out.println("\nServicios Contratados:");
        for (Services s : miReserva.getServices()) {
            System.out.println(" - " + s.getServiceName() + " ($" + s.getPrice() + ")");
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Presione Enter para finalizar el proceso...");
        teclado.nextLine();
        teclado.close();
    }
}