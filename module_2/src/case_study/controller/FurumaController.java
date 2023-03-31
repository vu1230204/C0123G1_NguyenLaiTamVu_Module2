package case_study.controller;

import java.util.Scanner;

public class FurumaController {
    public static void displayMainMenu() {
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                     EmployeeController.displayEmployeeMenu();
                    break;
                case "2":
                   CustomerController.displayCustomerMenu();
                    break;
                case "3":
                    FacilityController.displayFacilityMenu();
                    break;
                case "4":
                    BookingController.displayBookingMenu();
                    break;
                case "5":
                    PromotionController.displayPromotionMenu();
                    break;
                case "6":
                    break;
            }
        } while (!choose.equals("6"));
    }
}
