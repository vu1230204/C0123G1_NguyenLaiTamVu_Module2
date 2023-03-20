package Student_manager.repository.implement;

import Student_manager.model.Students;
import Student_manager.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Students> studenstList = new ArrayList<>();
    static {
        studenstList.add(new Students(456,"Vũ","07/09/2000",true,"c0123g1",8));
        studenstList.add(new Students(455,"Hưng","07/09/2000",true,"c0123g1",8));
        studenstList.add(new Students(113,"Kha","07/09/2000",true,"c0123g1",8));
    }
    @Override
    public List<Students> getAll() {
        return studenstList;
    }

    @Override
    public void addStudent(Students student) {
        studenstList.add(student);
    }

    @Override
    public void delete(int i) {
        studenstList.remove(i);
    }
}
