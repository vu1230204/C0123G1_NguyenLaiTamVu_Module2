package student_manager1.controller;

import student_manager1.service.ITeacherService;
import student_manager1.service.implement.TeacherService;

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
                    break;
            }
        }while (!choice.equals("4"));
    }
}
