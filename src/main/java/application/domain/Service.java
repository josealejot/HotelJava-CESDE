package application.domain;

import java.util.Scanner;

public class Service {

    private int id;
    private String nombre;
    private double precio;
    private boolean estado;

    public Service() {}

    public Service(int id, String nombre, double precio, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }

    public Service createService(Service service) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el ID del servicio:");
        service.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese el nombre del servicio:");
        service.setNombre(sc.nextLine());
        return service;
    }

    public void getServiceById(int id, Service service) {
        if(service.getId() == id) {
            System.out.println("Servicio: " + service.getNombre() + "\nPrecio: " + service.getPrecio());
        }
    }
}