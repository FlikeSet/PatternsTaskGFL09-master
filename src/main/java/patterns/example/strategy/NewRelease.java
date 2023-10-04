package patterns.example.strategy;

public class NewRelease implements PriceCalculation {
    @Override
    public double calculatePrice(int daysRented) {
        return daysRented * 3;
    }
}
