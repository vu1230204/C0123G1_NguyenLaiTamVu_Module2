package student_manager1.repository;

import student_manager1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAll();
}
