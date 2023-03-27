package student_manager1.repository;


import student_manager1.model.Student;

import java.util.List;

public interface IStudentRepository {


     List<Student> getAll();

    void inputStudent(Student student);
}
