package patterns.example.facade;

import patterns.example.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFileCustomerRepository implements CustomerRepository {
    private final String filename;

    public TextFileCustomerRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customers;
    }

    @Override
    public Customer getCustomerByName(String name) {
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {
    }
}
