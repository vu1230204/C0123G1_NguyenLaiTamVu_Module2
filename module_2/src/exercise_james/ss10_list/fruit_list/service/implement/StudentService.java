package exercise_james.ss10_list.fruit_list.service.implement;

import exercise_james.ss10_list.student_manager1.model.Student;
import exercise_james.ss10_list.student_manager1.repository.IStudentRepository;
import exercise_james.ss10_list.student_manager1.repository.implement.StudentRepository;
import exercise_james.ss10_list.fruit_list.service.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    IStudentRepository iStudentRepository = new StudentRepository();
    Scanner sc = new Scanner(System.in);

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
        for (Student s : studentList
        ) {
            System.out.println(s);
        }
    }

    @Override
    public void delete() {
        System.out.println("nhap id can xoa");
        int id;
        id = Integer.parseInt(sc.nextLine());
        iStudentRepository.delete(id);
        System.out.println("Da Xoa");
    }
}
