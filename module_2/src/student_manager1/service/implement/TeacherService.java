package student_manager1.service.implement;

import student_manager1.model.Teacher;
import student_manager1.repository.ITeacherRepository;
import student_manager1.repository.implement.TeacherRepository;
import student_manager1.service.ITeacherService;

import java.util.List;

public class TeacherService implements ITeacherService {
    ITeacherRepository iTeacherRepository = new TeacherRepository();
    @Override
    public void disPlay() {
        List<Teacher> teacherList = iTeacherRepository.getAll();
        for (Teacher temp : teacherList
             ) {
            System.out.println(temp);
        }
    }
}
