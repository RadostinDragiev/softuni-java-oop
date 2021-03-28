package L01_Working_With_Abstraction_Lab.P04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double pricePerNight = Double.parseDouble(input[0]);
        int nightsCount = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];


        PriceCalculator priceCalculator = new PriceCalculator();
        SeasonEnum seasonEnum = SeasonEnum.valueOf(season);
        Discount discount = Discount.valueOf(discountType);

        double coast = priceCalculator.calculatePriceAfterDiscount(pricePerNight,
                nightsCount,
                seasonEnum.getDayPriceMultiplier(),
                discount.getDiscountPercent());
        System.out.printf("%.2f", coast);
    }
}
