package exercise_james.ss10_list.student_manager1.model;

public class Student extends Person {
    private String classes;
    private float point;

    public Student() {
    }

    public Student(int id, String name, String birthday, String gender, String classes, float point) {
        super(id, name, birthday, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }


    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
