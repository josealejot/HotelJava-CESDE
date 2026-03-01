package application;

import application.domain.BedRoom;
import application.domain.Employee;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== BIENVENIDO AL SISTEMA DEL HOTEL ALEJO ===");

        // Aqui vamos a correr la prueba en el MAIN con las habitaciones, vamos a registrar
        System.out.println("\n*** 1. Registrar Nueva Habitación ***");
        BedRoom miHabitacion = new BedRoom(); // Aqui creamos la habitacion
        miHabitacion.createBedRoom(miHabitacion); // Llamamos al método que activa el Scanner

        System.out.println("\n*** Buscando la Habitación en el sistema ***");
        // Llamamos al método de búsqueda colocando el mismo ID que se acaba de digitar
        miHabitacion.getBedRoomById(miHabitacion.getRoomId(), miHabitacion);


        // *** PRUEBA 2: EL EMPLEADO (Aqui probamos que la Herencia si se da) ***
        System.out.println("\n*** 2. Registrar Nuevo Empleado ***");
        Employee miEmpleado = new Employee();
        miEmpleado.setId(101); // Le asignamos un ID (Este método lo heredó de Person)
        miEmpleado.createEmployee(miEmpleado); // Activa el Scanner para rol y salario

        System.out.println("\n*** Buscando al Empleado en el sistema **");
        miEmpleado.getEmployeeById(101, miEmpleado);

        System.out.println("\n=== Pruebas del sistema con exito ===");
    }
}