package exercise_james.ss10_list;

import java.util.ArrayList;

public class Fruit {
    public String nameFruit;
    public String kindOfFruit;
    public String manuDate;
    public String expDate;
    public String origin;
    int cost;

    public Fruit() {
    }

    public Fruit(String nameFruit, String kindOfFruit, String manuDate, String expDate, String origin, int cost) {
        this.nameFruit = nameFruit;
        this.kindOfFruit = kindOfFruit;
        this.manuDate = manuDate;
        this.expDate = expDate;
        this.origin = origin;
        this.cost = cost;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getKindOfFruit() {
        return kindOfFruit;
    }

    public void setKindOfFruit(String kindOfFruit) {
        this.kindOfFruit = kindOfFruit;
    }

    public String getManuDate() {
        return manuDate;
    }

    public void setManuDate(String manuDate) {
        this.manuDate = manuDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", kindOfFruit='" + kindOfFruit + '\'' +
                ", manuDate='" + manuDate + '\'' +
                ", expDate='" + expDate + '\'' +
                ", origin='" + origin + '\'' +
                ", cost=" + cost +
                '}';
    }
}
