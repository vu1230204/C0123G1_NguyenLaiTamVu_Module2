package student_manager1.repository.implement;


import student_manager1.model.Student;
import student_manager1.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    static List<Student> studentList = new ArrayList<>();


    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public void inputStudent(Student student) {

    }
}
