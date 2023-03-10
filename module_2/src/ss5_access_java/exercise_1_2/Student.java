package ss5_access_java.exercise_1_2;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {

    }

    public String getClasses() {
        return this.classes;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

