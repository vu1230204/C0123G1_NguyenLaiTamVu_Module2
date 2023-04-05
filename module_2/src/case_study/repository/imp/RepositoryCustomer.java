package case_study.repository.imp;

import case_study.model.Customer;
import case_study.repository.IRepositoryCustomer;
import case_study.util.Read.ReadCustomer;

import java.util.List;

public class RepositoryCustomer implements IRepositoryCustomer {
    String path = "src/case_study/data/dataCustomer.csv";

    @Override
    public List<Customer> display() {
        return ReadCustomer.readCustomer(path);
    }

    @Override
    public void addCustomer(String path, List<Customer> customerList) {

    }
}
