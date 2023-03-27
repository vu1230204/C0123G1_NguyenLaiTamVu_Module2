package student_manager1.repository.implement;

import student_manager1.model.Teacher;
import student_manager1.repository.ITeacherRepository;
import student_manager1.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    static List<Teacher> teachersList = new ArrayList<>();

    static {
        teachersList.add(new Teacher(123, "Trung", "12345", "true", "gioi"));
        teachersList.add(new Teacher(456, "Trung", "12345", "true", "gioi"));
        teachersList.add(new Teacher(789, "Trung", "12345", "true", "gioi"));
    }

    @Override
    public List<Teacher> getAll() {
        return teachersList;
    }
}
