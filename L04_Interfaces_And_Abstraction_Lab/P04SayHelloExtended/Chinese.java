package L04_Interfaces_And_Abstraction_Lab.P04SayHelloExtended;

public class Chinese extends BasePerson {

    protected Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
