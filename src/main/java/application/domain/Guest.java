package application.domain;

import java.util.Scanner;

public class Guest extends Person {

    private String origen;
    private String tipoGuest;

    public Guest() {}

    public Guest(String origen, String tipoGuest) {
        this.origen = origen;
        this.tipoGuest = tipoGuest;
    }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getTipoGuest() { return tipoGuest; }
    public void setTipoGuest(String tipoGuest) { this.tipoGuest = tipoGuest; }

    public Guest createGuest(Guest guest) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el origen del huésped:");
        guest.setOrigen(sc.nextLine());
        System.out.println("Ingrese el tipo de huésped (Ej: VIP, Regular):");
        guest.setTipoGuest(sc.nextLine());
        return guest;
    }

    public void getGuestById(int id, Guest guest) {
        if(guest.getId() == id) {
            System.out.println("Origen: " + guest.getOrigen() + "\nTipo: " + guest.getTipoGuest());
        }
    }
}