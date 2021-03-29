package L04_Interfaces_And_Abstraction_Lab.P02CarShopExtended;

public interface Rentable extends Car {
    Integer getMinRentDay();

    Double getPricePerDay();
}
