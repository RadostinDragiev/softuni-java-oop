package L02_Inheritance_Lab.P05RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> random = new RandomArrayList<>();

        random.add(5);
        random.add(20);
        random.add(17);
        random.add(19);

        System.out.println(random.getRandomElement());
    }
}
