package student_manager.repository.implement;

import student_manager.model.Teacher;
import student_manager.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRespsitory implements ITeacherRepository {
    static List<Teacher> teachersList = new ArrayList<>();

    static {
        teachersList.add(new Teacher(123, "Trung", "12345", true, "gioi"));
        teachersList.add(new Teacher(456, "Trung", "12345", true, "gioi"));
        teachersList.add(new Teacher(789, "Trung", "12345", true, "gioi"));
    }

    @Override
    public List<Teacher> getAll() {
        return teachersList;
    }

    @Override
    public void addTeacher(Teacher teachers) {
        teachersList.add(teachers);
    }

    @Override
    public void delete(int i) {
        teachersList.remove(i);
    }
}