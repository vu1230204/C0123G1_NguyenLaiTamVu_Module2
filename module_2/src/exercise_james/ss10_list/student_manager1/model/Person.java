package exercise_james.ss10_list.student_manager1.model;

public class Person {
    private int id;
    private String name;
    private String birthday;
    private String gender;

    public Person() {
    }

    public Person(int id, String name, String birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
