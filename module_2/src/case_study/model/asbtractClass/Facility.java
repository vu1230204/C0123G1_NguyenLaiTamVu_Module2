package case_study.model.asbtractClass;

public class Facility {
    private String id;
    private String serviceName;
    private int areaUse;
    private float price;
    private int peppleMax;
    private String date;

    public Facility() {
    }

    public Facility(String id, String serviceName, int areaUse, float price, int peppleMax, String date) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.price = price;
        this.peppleMax = peppleMax;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(int areaUse) {
        this.areaUse = areaUse;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPeppleMax() {
        return peppleMax;
    }

    public void setPeppleMax(int peppleMax) {
        this.peppleMax = peppleMax;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", price=" + price +
                ", peppleMax=" + peppleMax +
                ", date='" + date + '\'' +
                '}';
    }

}
