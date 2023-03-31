package student_manager1.service.implement;

import student_manager1.model.Student;
import student_manager1.repository.IStudentRepository;
import student_manager1.repository.implement.StudentRepository;
import student_manager1.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập name");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthday = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập lớp");
        String classes = sc.nextLine();
        System.out.println("Nhập điểm số");
        float point = Float.parseFloat(sc.nextLine());
        Student student = new Student(id, name, birthday, gender, classes, point);
        iStudentRepository.inputStudent(student);
    }

    @Override
    public void disPlay() {
        List<Student> studentList = iStudentRepository.getAll();
    }
}