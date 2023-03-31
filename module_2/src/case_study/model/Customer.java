package case_study.model;

import case_study.model.asbtractClass.Person;

public class Customer extends Person {
    final String a = "Dianmond";
    final String b = "Platinum";
    final String c = "Gold";
    final String d = "Silver";
    final String e = "Member";
    private String kindOfCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String kindOfCustomer, String address) {
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
    }

    public Customer(int id, String name, String dateOfBirthday, String gender, int CMND, String phoneNumber, String email, String kindOfCustomer, String address) {
        super(id, name, dateOfBirthday, gender, CMND, phoneNumber, email);
        this.kindOfCustomer = kindOfCustomer;
        this.address = address;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getE() {
        return e;
    }

    public String getKindOfCustomer() {
        return kindOfCustomer;
    }

    public void setKindOfCustomer(String kindOfCustomer) {
        this.kindOfCustomer = kindOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+"," +
                "kindOfCustomer='" + kindOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
