package Student_manager.repository;

import Student_manager.model.Students;

import java.util.List;

public interface IStudentRepository {
    List<Students> getAll();

    void addStudent(Students student);


    void delete(int i);
}
