package case_study.model;

import case_study.model.asbtract_class.AsbtractFacility;

public class Villa extends AsbtractFacility {
    private String standardRoom;
    private int pool;
    private int floor;

    public Villa() {
    }

    public Villa(String standardRoom, int pool, int floor) {
        this.standardRoom = standardRoom;
        this.pool = pool;
        this.floor = floor;
    }

    public Villa(String id, String serviceName, int areaUse, float price, int peppleMax, String date, String standardRoom, int pool, int floor) {
        super(id, serviceName, areaUse, price, peppleMax, date);
        this.standardRoom = standardRoom;
        this.pool = pool;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getPool() {
        return pool;
    }

    public void setPool(int pool) {
        this.pool = pool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", pool=" + pool +
                ", floor=" + floor +
                '}';
    }

    public String toWriteCSV() {
        return  super.toWriteCSV() + "," + getStandardRoom() + "," + getAreaUse() + "," + getFloor() + ",";
    }
}


