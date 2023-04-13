package case_study.model;

import case_study.model.asbtract_class.Person;

public class Employee extends Person {
    private String a = "Trung Cap";
    private String b = "Cao Dang";
    private String c = "Dai Hoc";
    private String d = "Sau Dai Hoc";
    private String level;
    private String option;
    private float salary;

    public Employee() {
    }

    public Employee(String level, String option, float salary) {
        this.level = level;
        this.option = option;
        this.salary = salary;
    }

    public Employee(int id, String name, String dateOfBirthday, String gender, int identityCard, String phoneNumber, String email, String level, String option, float salary) {
        super(id, name, dateOfBirthday, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.option = option;
        this.salary = salary;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                '\'' +
                ", " +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String toWriteCSV() {
        return super.toWriteCSV() + "," + getLevel() + "," + getOption() + "," + getSalary();
    }
}
