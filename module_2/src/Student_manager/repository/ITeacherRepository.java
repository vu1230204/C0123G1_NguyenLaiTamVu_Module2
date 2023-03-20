package Student_manager.repository;

import Student_manager.model.Teachers;

import java.util.List;

public interface ITeacherRepository {
    List<Teachers> getAll();

    void addTeacher(Teachers teachers);

    void delete(int i);

}
