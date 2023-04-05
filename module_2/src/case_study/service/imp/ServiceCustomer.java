package case_study.service.imp;

import case_study.format.FormatDate;
import case_study.format.FormatEmail;
import case_study.format.FormatName;
import case_study.format.FormatPhoneNumber;
import case_study.model.Customer;
import case_study.repository.IRepositoryCustomer;
import case_study.repository.imp.RepositoryCustomer;
import case_study.service.IServiceCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceCustomer implements IServiceCustomer {
    String path = "src/case_study/data/dataCustomer.csv";
    IRepositoryCustomer iRepositoryCustomer = new RepositoryCustomer();
    static List<String> mem = new ArrayList<>();

    public boolean checkIdSame(int id) {
        List<Customer> customerlist = iRepositoryCustomer.display();
        for (int i = 0; i < customerlist.size(); i++) {
            if (customerlist.get(i).getId() == id) {
                System.out.println("id này tồn tại");
                return true;
            }
        }
        return false;
    }

    public boolean checkIDCMND(int idCMND) {
        List<Customer> customerList = iRepositoryCustomer.display();
        boolean flag = true;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getIdentityCard() == idCMND) {
                System.out.println("idCMND đã tồn tại");
                return true;
            }
        }
        return false;
    }

    static {
        mem.add("Diamond");
        mem.add("Platinum");
        mem.add("Gold");
        mem.add("Silver");
        mem.add("Member");
    }

    public void display() {
        List<Customer> customerList = iRepositoryCustomer.display();
        if (customerList.size() == 0) {
            System.out.println("Không có danh sách");
        } else {
            for (Customer temp : customerList
            ) {
                System.out.println(temp);
            }
        }

    }

    public void addNew() {
        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = iRepositoryCustomer.display();
        int id;
        do {
            try {
                do {
                    System.out.println("Nhập id: ");
                    id = Integer.parseInt(sc.nextLine());
                } while (checkIdSame(id));
                boolean flag = true;
                if (id <= 0) {
                    System.out.println("id phải là số dương ");
                    flag = false;
                }
                if (flag) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số.");
            } catch (Exception e) {
                System.out.println("Nhập sai. yêu cầu nhập lại ");
            }
        } while (true);

        String name;
        do {
            System.out.println("Nhập tên: ");
            name = sc.nextLine();
            if (FormatName.validateName(name)) {
                break;
            }
            System.out.println("Viết hoa kí tự đầu của tên ");
        } while (true);
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = sc.nextLine();

        int idCNMD = 0;
        do {
            try {
                do {
                    System.out.println("Nhập id chứng minh nhân dân: ");
                    idCNMD = Integer.parseInt(sc.nextLine());
                } while (checkIDCMND(idCNMD));
                Boolean idCNMDFlag = true;
                if (idCNMD <= 0) {
                    System.out.println("id phải là số dương");
                    idCNMDFlag = false;
                }
                if (idCNMDFlag) {
                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số.");
            } catch (Exception e) {
                System.out.println("Nhập sai. yêu cầu nhập lại ");
            }
        } while (true);
        String numberOfPhone = null;
        do {
            try {
                boolean flag1 = false;
                System.out.println("Nhập số điện thoại: ");
                numberOfPhone = sc.nextLine();
                if (FormatPhoneNumber.validateNumberOfPhone(numberOfPhone)) {
                    flag1 = true;
                }
                if (flag1) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Nhập sai. Yêu cầu nhập lại");
            }
        } while (true);

        System.out.println("Nhập email");
        String email = sc.nextLine();
        String kindOfCustomer;
        System.out.println("Nhập loại khách hàng:");
        kindOfCustomer = sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCNMD, numberOfPhone, email, kindOfCustomer, address);
        customerList.add(customer);
        iRepositoryCustomer.addCustomer(path, customerList);
    }

    public boolean checkIdCMNDSame(int id) {
        List<Customer> customerList = iRepositoryCustomer.display();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                System.out.println("id này không tồn tại");
                return true;
            }
        }
        return false;
    }


    public void edit() {
        List<Customer> customerList = iRepositoryCustomer.display();
        Scanner sc = new Scanner(System.in);
        int id = 0;
        do {
            try {
                do {
                    System.out.println("Nhap id");
                    id = Integer.parseInt(sc.nextLine());
                } while (checkIdSame(id));
                boolean flag = true;
                if (id <= 0) {
                    System.out.println("id phai la so duong");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("khong phai la so");
            } catch (Exception e) {
                System.out.println("nhap sai, nhap lai");
            }
        } while (true);
        Customer customer = new Customer();
        String name;
        do {
            System.out.println("Sửa tên: ");
            customer.setName(name = sc.nextLine());
            if (FormatName.validateName(name)) {
                break;
            }
            System.out.println("Viết hoa kí tự đầu của tên");
        } while (true);
        String dateOfBirth = null;
        do {
            boolean flag = true;
            System.out.println("Sửa ngày sinh nhật");
            customer.setDateOfBirthday(dateOfBirth = sc.nextLine());
            if (FormatDate.formatDate(dateOfBirth)) {
                break;
            }
        } while (true);

        System.out.println("Sửa giới tính");
        customer.setGender(sc.nextLine());
        int idCMND = 0;
        do {
            try {
                do {
                    System.out.println("Sửa id chứng minh nhân dân");
                    customer.setIdentityCard(idCMND = Integer.parseInt(sc.nextLine()));
                } while (checkIdSame(idCMND));
                boolean flag = true;
                if (idCMND <= 0) {
                    System.out.println("idCMND phải là số dương");
                    flag = false;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số");
            }
        } while (true);
        String numberOfPhone = null;
        do {
            try {
                boolean flag = false;
                System.out.println("Nhập số điện thoại: ");
                customer.setPhoneNumber(numberOfPhone = sc.nextLine());
                if (FormatPhoneNumber.validateNumberOfPhone(numberOfPhone)) {
                    flag = true;
                }
                if (flag) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số");
            } catch (Exception e) {
                System.out.println("Nhập sai. Yêu cầu nhập lại");
            }
        } while (true);
        String email;
        do {
            System.out.println("Sửa email");
            customer.setEmail(email = sc.nextLine());
            if (FormatEmail.regexEmail(email)) {
                break;
            }
        } while (true);

        System.out.println("Sửa loại khách hàng");
        customer.setKindOfCustomer(sc.nextLine());
        System.out.println("Sửa địa chỉ");
        customer.setAddress(sc.nextLine());
        customer = new Customer(id, customer.getName(), customer.getDateOfBirthday(), customer.getGender(), customer.getIdentityCard(), customer.getPhoneNumber(), customer.getEmail(), customer.getKindOfCustomer(), customer.getAddress());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == id) {
                iRepositoryCustomer.repairCustomer(i, customerList, path, customer);
                return;
            }

        }
    }
}


