package exercise_james.ss10_list.student_manager1.repository;

import exercise_james.ss10_list.student_manager1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAll();

    void input(Teacher teacher);

    void delete(int id);
}
