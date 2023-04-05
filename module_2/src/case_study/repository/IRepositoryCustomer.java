package case_study.repository;

import case_study.model.Customer;
import case_study.util.Write.WriteCustomer;

import java.util.LinkedList;
import java.util.List;

public interface IRepositoryCustomer {
    List<Customer> display();

    default void repairCustomer(int i, List<Customer> customerList, String path, Customer customer) {

    }

    void addCustomer(String path, List<Customer> customerList);
}
