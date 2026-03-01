package application.domain;

import java.util.Scanner;

public class Employee extends Person {

    private double salario;
    private String rol;

    public Employee() {}

    public Employee(double salario, String rol) {
        this.salario = salario;
        this.rol = rol;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public Employee createEmployee(Employee employee) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el rol del empleado:");
        employee.setRol(sc.nextLine());
        System.out.println("Ingrese el salario:");
        employee.setSalario(sc.nextDouble());
        return employee;
    }

    public void getEmployeeById(int id, Employee employee) {
        if(employee.getId() == id) {
            System.out.println("Rol: " + employee.getRol() + "\nSalario: " + employee.getSalario());
        }
    }
}