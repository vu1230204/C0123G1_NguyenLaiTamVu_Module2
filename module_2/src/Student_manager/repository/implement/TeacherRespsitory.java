package Student_manager.repository.implement;

import Student_manager.model.Teachers;
import Student_manager.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherRespsitory implements ITeacherRepository {
    static List<Teachers> teachersList = new ArrayList<>();

    static {
        teachersList.add(new Teachers(123, "Trung", "12345", true, "gioi"));
        teachersList.add(new Teachers(456, "Trung", "12345", true, "gioi"));
        teachersList.add(new Teachers(789, "Trung", "12345", true, "gioi"));
    }

    @Override
    public List<Teachers> getAll() {
        return teachersList;
    }

    @Override
    public void addTeacher(Teachers teachers) {
        teachersList.add(teachers);
    }

    @Override
    public void delete(int i) {
        teachersList.remove(i);
    }
}
