package L01_Working_With_Abstraction_Lab.P04HotelReservation;

public class PriceCalculator {
    public double calculatePriceAfterDiscount(double pricePerNight, int nightsCount, int dayPriceMultiplier, double discountPercent) {

        return ((pricePerNight * nightsCount) * dayPriceMultiplier) * discountPercent;
    }
}
