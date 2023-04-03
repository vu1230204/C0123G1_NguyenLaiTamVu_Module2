package case_study.model.asbtract_class;

public class AsbtractFacility {
    private String id;
    private String serviceName;
    private float areaUse;
    private float price;
    private int peopleMax;
    private String date;

    public AsbtractFacility() {
    }

    public AsbtractFacility(String id, String serviceName, int areaUse, float price, int peopleMax, String date) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.price = price;
        this.peopleMax = peopleMax;
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

    public float getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(float areaUse) {
        this.areaUse = areaUse;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(int peopleMax) {
        this.peopleMax = peopleMax;
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
                ", peppleMax=" + peopleMax +
                ", date='" + date + '\'' +
                '}';
    }

}
