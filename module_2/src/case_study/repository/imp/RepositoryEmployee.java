package case_study.repository.imp;

import case_study.model.Employee;
import case_study.repository.IRepositoryEmployee;

import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee implements IRepositoryEmployee {
    static List<Employee> employeeList = new ArrayList<>();
    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
}
