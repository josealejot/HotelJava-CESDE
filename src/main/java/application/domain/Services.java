package application.domain;

public class Services {
    private int serviceId;
    private String serviceName;
    private double price;
    private String estado;

    public Services() {}
    public Services(int serviceId, String serviceName, double price, String estado) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
        this.estado = estado;
    }

    public int getServiceId() { return serviceId; }
    public void setServiceId(int id) { this.serviceId = id; }
    public String getServiceName() { return serviceName; }
    public void setServiceName(String name) { this.serviceName = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}