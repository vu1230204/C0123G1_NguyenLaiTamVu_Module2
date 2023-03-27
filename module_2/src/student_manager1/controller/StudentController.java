package student_manager1.controller;

import student_manager1.service.IStudentService;
import student_manager1.service.implement.StudentService;

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
            }
        } while (!choose.equals("4"));
    }
}
