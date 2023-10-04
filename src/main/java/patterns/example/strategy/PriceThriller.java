package patterns.example.strategy;

public class PriceThriller implements PriceCalculation {
    @Override
    public double calculatePrice(int daysRented) {
        double price = 1.3;
        if (daysRented > 2) {
            price += (daysRented - 1) * 1.5;
        }
        return price;
    }
}
