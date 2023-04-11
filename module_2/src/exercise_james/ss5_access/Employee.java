package exercise_james.ss5_access;

public class Employee {
    private String name;
    private String phoneNumber;
    private String workingPosition;
    public static String nameCompany = "ABC"; //tên công ty là biến static để dùng chung cho tất cả các đối tượng

    public Employee() {
    }

    public Employee(String name, String phoneNumber, String workingPosition) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.workingPosition = workingPosition;
    }
    //encapsulation

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public static String getNameCompany() {
        return nameCompany;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                "nameCompany='" + nameCompany + '\'' +
                '}';
    }
}
