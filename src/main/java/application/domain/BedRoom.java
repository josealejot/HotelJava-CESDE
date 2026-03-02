package application.domain;

public class BedRoom {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public BedRoom() {}
    public BedRoom(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() { return roomNumber; }
    public void setRoomNumber(int num) { this.roomNumber = num; }
    public String getRoomType() { return roomType; }
    public void setRoomType(String type) { this.roomType = type; }
    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double price) { this.pricePerNight = price; }
}