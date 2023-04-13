package exercise_james.ss10_list.student_manager1.repository.implement;


import exercise_james.ss10_list.student_manager1.model.Student;
import exercise_james.ss10_list.student_manager1.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, " Vu ", "02041998", "true", "c0223g1", 10));
        studentList.add(new Student(2, " Vu ", "02041998", "true", "c0223g1", 10));
        studentList.add(new Student(3, " Vu ", "02041998", "true", "c0223g1", 10));
        studentList.add(new Student(4, " Vu ", "02041998", "true", "c0223g1", 10));
        studentList.add(new Student(5, " Vu ", "02041998", "true", "c0223g1", 10));
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void inputStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {
                studentList.remove(i);
            }
        }
    }
}
