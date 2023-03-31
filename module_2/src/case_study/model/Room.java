package case_study.model;

import case_study.model.asbtractClass.Facility;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String id, String serviceName, int areaUse, float price, int peppleMax, String date, String serviceFree) {
        super(id, serviceName, areaUse, price, peppleMax, date);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
