package patterns.example.strategy;

public class Drama implements PriceCalculation {
    @Override
    public double calculatePrice(int daysRented) {
        double price = 1.8;
        if (daysRented > 3) {
            price += (daysRented - 5) * 1.5;
        }
        return price;
    }
}
