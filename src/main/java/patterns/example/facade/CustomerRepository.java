package patterns.example.facade;

import patterns.example.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAllCustomers();
    Customer getCustomerByName(String name);
    void saveCustomer(Customer customer);
}
