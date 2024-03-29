package exercise_james.ss10_list.student_manager1.controller;

import exercise_james.ss10_list.fruit_list.service.IStudentService;
import exercise_james.ss10_list.fruit_list.service.implement.StudentService;

import java.util.Scanner;

public class StudentController {
    public static void menuController() {
        IStudentService iStudentService = new StudentService();
        String choose;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm");
            System.out.println("3. Xóa");
            System.out.println("4. Thoát");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    iStudentService.disPlay();
                    break;
                case "2":
                    iStudentService.input();
                    break;
                case "3":
                    iStudentService.delete();
                    break;
            }
        } while (!choose.equals("4"));
    }
}
