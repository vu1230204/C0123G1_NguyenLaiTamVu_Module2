package case_study.controller;

import java.util.Scanner;

public class BookingController {
    public static void displayBookingMenu() {
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 . Add new booking");
            System.out.println("2 . Display list booking");
            System.out.println("3 . Create new contract");
            System.out.println("4 . Display list contracts");
            System.out.println("5 . Edit contracts");
            System.out.println("6 . Return main menu");
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
                case "5":
                    break;
                case "6":
                    break;
            }
        } while (!choose.equals("6"));
    }
}

