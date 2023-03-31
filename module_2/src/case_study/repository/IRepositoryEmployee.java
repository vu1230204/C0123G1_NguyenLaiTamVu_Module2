package case_study.repository;

import case_study.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IRepositoryEmployee {
    static List<Employee> getALl() {
        return new ArrayList<>();
    }

    List<Employee> getAll();
}
