package case_study.controller;

import java.util.Scanner;

public class PromotionController {
    public static void displayPromotionMenu() {
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
            }
        } while (!choose.equals("3"));
    }
}
