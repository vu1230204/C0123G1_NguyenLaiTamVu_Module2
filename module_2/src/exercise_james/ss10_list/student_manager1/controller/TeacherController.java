package exercise_james.ss10_list.student_manager1.controller;

import exercise_james.ss10_list.fruit_list.service.ITeacherService;
import exercise_james.ss10_list.fruit_list.service.implement.TeacherService;

import java.util.Scanner;

public class TeacherController {

    public static void menuController() {
        ITeacherService iTeacherService = new TeacherService();
        String choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Hiển thị");
            System.out.println("2. Thêm");
            System.out.println("3. Xóạ");
            System.out.println("̣4. Thoát");
            System.out.println("Chọn");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    iTeacherService.disPlay();
                    break;
                case "2":
                    iTeacherService.input();
                    break;
                case "3":
                    iTeacherService.delete();
                    break;

            }
        }while (!choice.equals("4"));
    }
}
