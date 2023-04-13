package exercise_james.ss10_list.student_manager1.repository;


import exercise_james.ss10_list.student_manager1.model.Student;

import java.util.List;

public interface IStudentRepository {


    List<Student> getAll();

    void inputStudent(Student student);

    void delete(int id);
}
