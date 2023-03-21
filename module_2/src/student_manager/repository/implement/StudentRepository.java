package student_manager.repository.implement;

import student_manager.model.Student;
import student_manager.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> studenstList = new ArrayList<>();

    static {
        studenstList.add(new Student(456, "Vũ", "07/09/2000", true, "c0123g1", 8));
        studenstList.add(new Student(455, "Hưng", "07/09/2000", true, "c0123g1", 8));
        studenstList.add(new Student(113, "Kha", "07/09/2000", true, "c0123g1", 8));
    }

    @Override
    public List<Student> getAll() {
        return studenstList;
    }

    @Override
    public void addStudent(Student student) {
        studenstList.add(student);
    }

    @Override
    public void delete(int i) {
        studenstList.remove(i);
    }
}
