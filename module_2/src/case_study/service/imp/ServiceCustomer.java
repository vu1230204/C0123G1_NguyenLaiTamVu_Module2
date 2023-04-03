package case_study.service.imp;

import case_study.model.Customer;
import case_study.model.Employee;
import case_study.service.IServiceCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer {
    static List<Customer> customerList = new ArrayList<>();
    static Customer customer = new Customer();
    static List<String> mem = new ArrayList<>();

    static {
        mem.add("Diamond");
        mem.add("Platinum");
        mem.add("Gold");
        mem.add("Silver");
        mem.add("Member");
    }

    public void display() {
        for (Customer temp : customerList
        ) {
            System.out.println(temp);
        }

    }

    public void addNew() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id");
        int id;
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên");
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
        String kindOfCustomer;
        boolean flag;
        do {
            flag = true;
            System.out.println("1. Diamond");
            System.out.println("2. Platinum");
            System.out.println("3. Gold");
            System.out.println("4. Silver");
            System.out.println("5. Member");
            System.out.println("6. Bước tiếp theo");
            kindOfCustomer = sc.nextLine();

            switch (kindOfCustomer) {
                case "1":
                    mem.get(0);
                    break;
                case "2":
                    mem.get(1);
                    break;
                case "3":
                    mem.get(2);
                    break;
                case "4":
                    mem.get(3);
                    break;
                case "5":
                    mem.get(4);
                    break;
                default:
                    flag = false;
                    System.out.println("Nhập lại");
            }
        } while (!flag);

        System.out.println("Nhập địa chỉ");
        String address;
        address = sc.nextLine();

    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id can sua");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
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
                String kindOfCustomer;
                do {
                    System.out.println("1. Diamond");
                    System.out.println("2. Platinum");
                    System.out.println("3. Gold");
                    System.out.println("4. Silver");
                    System.out.println("5. Member");
                    kindOfCustomer = sc.nextLine();
                    switch (kindOfCustomer) {
                        case "1":
                            mem.get(0);
                            break;
                        case "2":
                            mem.get(1);
                            break;
                        case "3":
                            mem.get(2);
                            break;
                        case "4":
                            mem.get(3);
                            break;
                        case "5":
                            mem.get(4);
                            break;
                        case "6":
                            break;
                    }
                } while (!kindOfCustomer.equals("6"));
                String address;
                System.out.println("sua dia chi");
                address = sc.nextLine();
                customer = new Customer(id, name, dateOfBirthday, gender, cmnd, phoneNumber, email, kindOfCustomer, address);
            }
        }
    }
}
