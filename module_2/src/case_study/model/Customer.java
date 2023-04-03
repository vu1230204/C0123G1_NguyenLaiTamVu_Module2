package case_study.model;

import case_study.model.asbtract_class.Person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
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

    public int toWriteCSV() {
        return 0;
    }
}
