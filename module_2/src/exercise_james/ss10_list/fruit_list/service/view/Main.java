package exercise_james.ss10_list.fruit_list.service.view;

import exercise_james.ss10_list.student_manager1.controller.StudentController;
import exercise_james.ss10_list.student_manager1.controller.TeacherController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choose;
        do {
            System.out.println("1. Student Menu");
            System.out.println("2. Teacher Menu");
            System.out.println("3. Thoát");
            Scanner sc = new Scanner(System.in);
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    StudentController.menuController();
                    break;
                case "2":
                    TeacherController.menuController();
                    break;
            }


        } while (!choose.equals("3"));
    }
}
