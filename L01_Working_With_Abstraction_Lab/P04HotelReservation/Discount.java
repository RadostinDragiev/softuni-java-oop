package L01_Working_With_Abstraction_Lab.P04HotelReservation;

public enum Discount {
    None(0), SecondVisit(10), VIP(20);

    int discountPercent;

    Discount(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return (100 - discountPercent) / 100.0;
    }
}
