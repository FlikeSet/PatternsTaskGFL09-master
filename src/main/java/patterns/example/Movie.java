package patterns.example;

import patterns.example.strategy.PriceCalculation;

public class Movie {
    private final String title;
    private final PriceCalculation priceStrategy;

    public Movie(String title, PriceCalculation priceStrategy) {
        this.title = title;
        this.priceStrategy = priceStrategy;
    }

    public double calculatePrice(int daysRented) {
        return priceStrategy.calculatePrice(daysRented);
    }

    public String getTitle() {return title;}

    public PriceCalculation getPriceStrategy() {return priceStrategy;}

}
