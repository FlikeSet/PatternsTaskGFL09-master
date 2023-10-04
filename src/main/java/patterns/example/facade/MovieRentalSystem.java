package patterns.example.facade;

import patterns.example.Customer;
import patterns.example.Movie;

import java.util.List;

public class MovieRentalSystem {
    private final CustomerRepository customerRepository;
    private final List<Movie> movieCatalog;

    public MovieRentalSystem(CustomerRepository customerRepository, List<Movie> movieCatalog) {
        this.customerRepository = customerRepository;
        this.movieCatalog = movieCatalog;
    }

    public String generateCustomerStatement(String customerName) {
        Customer customer = customerRepository.getCustomerByName(customerName);
        if (customer == null) {
            return "Customer not found.";
        }

        return customer.statement();
    }
    public List<Movie> getAllMovies() {
        return movieCatalog;
    }

    public List<Movie> searchMoviesByCharacteristics(String searchType, int minDuration) {
        return null;
    }

    public void addMovie(Movie newMovie) {
    }
}
