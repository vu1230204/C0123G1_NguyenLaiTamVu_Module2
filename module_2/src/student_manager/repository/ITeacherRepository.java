package student_manager.repository;

import student_manager.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAll();

    void addTeacher(Teacher teachers);

    void delete(int i);

}
