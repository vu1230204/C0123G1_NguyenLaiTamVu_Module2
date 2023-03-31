package case_study.controller;

import case_study.service.imp.ServiceCustomer;

import java.util.Scanner;

public class CustomerController {
    static ServiceCustomer serviceCustomer = new ServiceCustomer();
    public static void displayCustomerMenu() {
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . Display list customers");
            System.out.println("2 . Add new customer");
            System.out.println("3 . Edit customer");
            System.out.println("4 . Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    serviceCustomer.display();
                    break;
                case "2":
                    serviceCustomer.addNew();
                    break;
                case "3":
                    serviceCustomer.edit();
                    break;
                case "4":
                    break;

            }
        } while (!choose.equals("4"));
    }
}

