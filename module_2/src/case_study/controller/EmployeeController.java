package case_study.controller;

import case_study.service.IServiceEmployee;
import case_study.service.Service;
import case_study.service.imp.ServiceEmployee;

import java.awt.*;
import java.util.Scanner;

public class EmployeeController {
    static ServiceEmployee serviceEmployee = new ServiceEmployee();
    public static void displayEmployeeMenu() {
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . Display list employees");
            System.out.println("2 . Add new employees");
            System.out.println("3 . Edit employees");
            System.out.println("4 . Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    serviceEmployee.display();
                    break;
                case "2":
                    serviceEmployee.addNew();
                    break;
                case "3":
                    serviceEmployee.edit();
                    break;
                case "4":
                    break;

            }
        } while (!choose.equals("4"));
    }
}
