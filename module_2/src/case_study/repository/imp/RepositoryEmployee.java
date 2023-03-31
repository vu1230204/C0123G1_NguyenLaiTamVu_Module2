package case_study.repository.imp;

import case_study.model.Employee;
import case_study.repository.IRepositoryEmployee;

import java.util.ArrayList;
import java.util.List;

public class RepositoryEmployee implements IRepositoryEmployee {
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1, "Vu", "02041998", "nam", 2131323, "123231230", "afafsf", "cao dang", 123123));
        employeeList.add(new Employee(2, "Vu", "02041998", "nam", 2131323, "123231230", "afafsf", "cao dang", 123123));
        employeeList.add(new Employee(3, "Vu", "02041998", "nam", 2131323, "123231230", "afafsf", "cao dang", 123123));
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }
}
