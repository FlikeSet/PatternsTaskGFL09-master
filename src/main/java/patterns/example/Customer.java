package patterns.example;

import java.util.List;

public class Customer {
    private final String name;
    private final List<Rental> rentals;

    public Customer(String name, List<Rental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";

        for (Rental each : rentals) {
            Movie movie = each.getMovie();
            double thisAmount = movie.calculatePrice(each.getDaysRented());

            if (movie.getPriceStrategy().equals("newReleasePriceStrategy") && each.getDaysRented() > 1) {
                frequentRenterPoints++;
            }

            result += "\t" + movie.getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }
}
