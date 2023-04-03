package case_study.controller;

import case_study.service.IServiceFacility;
import case_study.service.imp.ServiceFacility;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacilityMenu() {
        String choose;
        IServiceFacility iServiceFacility = new ServiceFacility();
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . Display list facility");
            System.out.println("2 . Add new facility");
            System.out.println("3 . Display list facility mainenance");
            System.out.println("4 . Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    iServiceFacility.display();
                    break;
                case "2":
                    iServiceFacility.choice();
                    break;
                case "3":
                    break;
                case "4":
                    break;

            }
        } while (!choose.equals("4"));
    }
}

