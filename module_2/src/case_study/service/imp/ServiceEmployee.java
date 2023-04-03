package case_study.service.imp;

import case_study.model.Employee;
import case_study.repository.IRepositoryEmployee;
import case_study.repository.imp.RepositoryEmployee;
import case_study.service.IServiceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceEmployee implements IServiceEmployee {
    IRepositoryEmployee iRepositoryEmployee = new RepositoryEmployee();
    static List<Employee> employeeList = new ArrayList<>();

    static Employee employee = new Employee();

    @Override
    public void display() {
        for (Employee temp : employeeList
        ) {
            System.out.println(temp);
        }
    }


    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id;
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten");
        String name;
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh");
        String dateOfBirthday;
        dateOfBirthday = sc.nextLine();
        System.out.println("Nhap gioi tinh");
        String gender;
        gender = sc.nextLine();
        System.out.println("Nhap cmnd");
        int cmnd;
        cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so dien thoai");
        String phoneNumber;
        phoneNumber = sc.nextLine();
        System.out.println("Nhap email");
        String email;
        email = sc.nextLine();
        System.out.println("Nhap level");
        String level;
        level = sc.nextLine();
        System.out.println("Nhap luong");
        int salary;
        salary = Integer.parseInt(sc.nextLine());
        Employee employee = new Employee(id, name, dateOfBirthday, gender, cmnd, phoneNumber, email, level, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can sua");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == id) {
                String name;
                System.out.println("sua ten cua ban");
                name = sc.nextLine();
                String dateOfBirthday;
                System.out.println("sua ngay sinh ");
                dateOfBirthday = sc.nextLine();
                String gender;
                System.out.println("sua gioi tinh");
                gender = sc.nextLine();
                int cmnd;
                System.out.println("sua chung minh nhan dan");
                cmnd = Integer.parseInt(sc.nextLine());
                String phoneNumber;
                System.out.println("sua so dien thoai");
                phoneNumber = sc.nextLine();
                String email;
                System.out.println("sua email");
                email = sc.nextLine();
                String level;
                System.out.println("sua bang cap");
                level = sc.nextLine();
                int salary;
                System.out.println("sua luong");
                salary = Integer.parseInt(sc.nextLine());
                employee = new Employee(id, name, dateOfBirthday, gender, cmnd, phoneNumber, email, level, salary);
                employeeList.set(i, employee);
            }

        }
    }

    @Override
    public void delete() {

    }
}
