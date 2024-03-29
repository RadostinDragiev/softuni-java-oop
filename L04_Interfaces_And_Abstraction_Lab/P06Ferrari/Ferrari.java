package L04_Interfaces_And_Abstraction_Lab.P06Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private final static String model= "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brum-brrrrr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",
                model,
                brakes(),
                gas(),
                this.driverName);
    }
}
