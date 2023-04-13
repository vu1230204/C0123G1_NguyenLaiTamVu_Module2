package student_manager1.service.implement;


import student_manager1.model.Teacher;
import student_manager1.repository.implement.TeacherRepository;
import student_manager1.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    static Scanner sc = new Scanner(System.in);
    static TeacherRepository iTeacherRepository = new TeacherRepository();


    @Override
    public void disPlay() {
        List<Teacher> teacherList = iTeacherRepository.getAll();
        for (Teacher temp : teacherList) {
            System.out.println(temp);
        }
    }

    @Override
    public void input() {

        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập name");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthday = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập chuyên môn");
        String expertise = sc.nextLine();
        Teacher teacher = new Teacher(id, name, birthday, gender, expertise);
        iTeacherRepository.input(teacher);
    }

    @Override
    public void delete() {
        System.out.println("nhap id can xoa");
        int id;
        id = Integer.parseInt(sc.nextLine());
        iTeacherRepository.delete(id);
        System.out.println("Da Xoa");
    }
}




