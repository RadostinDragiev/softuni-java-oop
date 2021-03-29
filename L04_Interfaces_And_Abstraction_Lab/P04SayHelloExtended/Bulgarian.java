package L04_Interfaces_And_Abstraction_Lab.P04SayHelloExtended;

public class Bulgarian extends BasePerson {

    protected Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
}
