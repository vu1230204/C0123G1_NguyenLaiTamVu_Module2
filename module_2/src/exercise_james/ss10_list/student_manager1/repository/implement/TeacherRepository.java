package exercise_james.ss10_list.student_manager1.repository.implement;

import exercise_james.ss10_list.student_manager1.model.Teacher;
import exercise_james.ss10_list.student_manager1.repository.ITeacherRepository;
import exercise_james.ss10_list.fruit_list.service.implement.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    static TeacherService teacherService = new TeacherService();
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

    @Override
    public void input(Teacher teacher) {
        teachersList.add(teacher);
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < teachersList.size(); i++) {
            if (id == teachersList.get(i).getId()) {
                teachersList.remove(i);
            }

        }
    }
}
