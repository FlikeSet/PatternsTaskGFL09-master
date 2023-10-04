package patterns.example.strategy;

public class PriceRegular implements PriceCalculation {
    @Override
    public double calculatePrice(int daysRented) {
        double price = 2;
        if (daysRented > 2) {
            price += (daysRented - 2) * 1.5;
        }
        return price;
    }
}