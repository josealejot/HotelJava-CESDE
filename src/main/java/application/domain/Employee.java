package application.domain;

public class Employee extends Person {
    private String rol;
    private double salario;

    public Employee() {}
    public Employee(int id, String name, String lastName, String email, String password, Boolean state, String rol, double salario) {
        super(id, name, lastName, email, password, state);
        this.rol = rol;
        this.salario = salario;
    }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}