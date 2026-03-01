package application.domain;

import java.util.Scanner;

public class BedRoom {

    Scanner sc = new Scanner(System.in);

    private int roomId;
    private String room;
    private String roomType;
    private double price;
    private boolean state;

    public BedRoom(){}

    public BedRoom(int roomId, String room, String roomType, double price, boolean state) {
        this.roomId = roomId;
        this.room = room;
        this.roomType = roomType;
        this.price = price;
        this.state = state;
    }

    public BedRoom(String room) {
        this.room = room;
    }

    public int getRoomId() { return roomId; }
    public void setRoomId(int roomId) { this.roomId = roomId; }

    public String getRoom() { return room; }
    public void setRoom(String room) { this.room = room; }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isState() { return state; }
    public void setState(boolean state) { this.state = state; }

    public BedRoom createBedRoom(BedRoom bedRoom){
        System.out.println("Ingrese el id de la habitación");
        bedRoom.setRoomId(sc.nextInt()); // Usamos el Setter
        sc.nextLine();

        System.out.println("Ingrese el numero de la Habitacion");
        bedRoom.setRoom(sc.nextLine()); // Usamos el Setter

        System.out.println("Seleccione el tipo de la habitación");
        bedRoom.setRoomType(sc.nextLine()); // Usamos el Setter

        System.out.println("Ingrese el precio por persona ");
        bedRoom.setPrice(sc.nextDouble()); // Usamos el Setter
        sc.nextLine();

        System.out.println("Seleccione el estado de la habitación (true/false)");
        bedRoom.setState(sc.nextBoolean()); // Usamos el Setter

        return bedRoom;
    }

    public void getBedRoomById(int id , BedRoom bedRoom){
        if(this.roomId == id){
            // Aqui es donde se van a usar los getter para mostrar la info
            System.out.println("Id: " + bedRoom.getRoomId() + "\n" +
                    "Num Hab: " + bedRoom.getRoom() + "\n" +
                    "Tipo hab: " + bedRoom.getRoomType() + "\n" +
                    "Precio: " + bedRoom.getPrice() + "\n" +
                    "Estado: "  + bedRoom.isState() + "\n");
        }else{
            System.out.println("Validar el id de la habitacion que esta consultando");
        }
    }
}