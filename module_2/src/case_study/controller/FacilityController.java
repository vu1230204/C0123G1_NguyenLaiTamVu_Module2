package case_study.controller;

import java.util.Scanner;

public class FacilityController {
    public static void displayFacilityMenu() {
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . Display list facility");
            System.out.println("2 . Add new facility");
            System.out.println("3 . Display list facility mainenance");
            System.out.println("4 . Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;

            }
        } while (!choose.equals("4"));
    }
}

