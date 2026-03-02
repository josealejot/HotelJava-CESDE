package application.domain;

public class Guest extends Person {
    private String origen;
    private String tipoGuest;

    public Guest() {}
    public Guest(int id, String name, String lastName, String email, String password, Boolean state, String origen, String tipoGuest) {
        super(id, name, lastName, email, password, state);
        this.origen = origen;
        this.tipoGuest = tipoGuest;
    }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }
    public String getTipoGuest() { return tipoGuest; }
    public void setTipoGuest(String tipoGuest) { this.tipoGuest = tipoGuest; }
}