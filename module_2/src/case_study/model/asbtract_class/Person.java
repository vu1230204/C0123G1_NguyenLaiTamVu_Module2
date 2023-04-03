package case_study.model.asbtract_class;

public class Person {
    private int id;
    private String name;
    private String dateOfBirthday;
    private String gender;
    private int identityCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(int id, String name, String dateOfBirthday, String gender, int identityCard, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", gender='" + gender + '\'' +
                ", CMND=" + identityCard +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
