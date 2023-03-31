package case_study.model;

import case_study.model.asbtractClass.Facility;

public class House extends Facility {
    private String standardRoom;
    private int floor;

    public House() {
    }

    public House(String standardRoom, int floor) {
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public House(String id, String serviceName, int areaUse, float price, int peppleMax, String date, String standardRoom, int floor) {
        super(id, serviceName, areaUse, price, peppleMax, date);
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", floor=" + floor +
                '}';
    }
}
