package patterns.example.strategy;

public class Comedy implements PriceCalculation {
    @Override
    public double calculatePrice(int daysRented) {
        double price = 1.7;
        if (daysRented > 2) {
            price += (daysRented - 3) * 1.5;
        }
        return price;
    }
}
