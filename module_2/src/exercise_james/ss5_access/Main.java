package exercise_james.ss5_access;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Nguyễn Lại Tam Vũ");
        employee.setPhoneNumber("0866669483");
        employee.setWorkingPosition("Founder");
        System.out.println(employee.toString());
    }
}
