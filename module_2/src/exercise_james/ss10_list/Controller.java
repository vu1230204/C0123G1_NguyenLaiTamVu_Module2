package exercise_james.ss10_list;

import exercise_james.ss10_list.service.IService;
import exercise_james.ss10_list.service.Service;

import java.util.Scanner;

public class Controller {
    public static void menuController() {
        IService iService = new Service();
        String choose;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. display list fruit");
            System.out.println("2. add fruit");
            System.out.println("3. exit");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    iService.disPlay();
                    break;
                case "2":
                    iService.add();
                    break;
            }
        } while (!choose.equals("3"));

    }
}
