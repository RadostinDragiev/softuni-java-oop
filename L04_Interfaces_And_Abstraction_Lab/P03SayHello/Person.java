package L04_Interfaces_And_Abstraction_Lab.P03SayHello;

public interface Person {
    String getName();

    default String sayHello() {
        return "Hello";
    }
}
