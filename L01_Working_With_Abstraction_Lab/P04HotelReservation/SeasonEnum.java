package L01_Working_With_Abstraction_Lab.P04HotelReservation;

public enum SeasonEnum {
    Autumn(1), Spring(2), Winter(3), Summer(4);

    int dayPriceMultiplier;

    SeasonEnum(int dayPriceMultiplier) {
        this.dayPriceMultiplier = dayPriceMultiplier;
    }

    public int getDayPriceMultiplier() {
        return dayPriceMultiplier;
    }
}
