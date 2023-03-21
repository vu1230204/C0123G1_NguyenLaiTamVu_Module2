package student_manager.repository;

import student_manager.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    void addStudent(Student student);


    void delete(int i);
}
