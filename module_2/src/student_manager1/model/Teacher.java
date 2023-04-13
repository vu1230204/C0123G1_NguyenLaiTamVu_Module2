package student_manager1.model;

public class Teacher extends Person {
    private String expertise;

    public Teacher() {
    }

    public Teacher(int id, String name, String birthday, String gender, String expertise) {
        super(id, name, birthday, gender);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                "expertise='" + expertise + '\'' +
                '}';
    }
}
