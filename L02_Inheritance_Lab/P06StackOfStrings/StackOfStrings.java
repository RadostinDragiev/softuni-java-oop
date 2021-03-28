package L02_Inheritance_Lab.P06StackOfStrings;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        return this.data.remove(getLastIndex());
    }

    public String peek() {
        return this.data.get(getLastIndex());
    }

    private int getLastIndex() {
        return this.data.size() - 1;
    }
}
