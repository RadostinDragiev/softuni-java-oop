package L04_Interfaces_And_Abstraction_Exercises.P05Тelephony;

import java.util.List;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> url) {
        this.numbers = numbers;
        this.urls = url;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls) {
            boolean isValid = validateURL(url);
            if (isValid) {
                sb.append("Browsing: ").append(url).append("!");
            } else {
                sb.append("Invalid URL!");
            }

            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }


    @Override
    public String call() {
        StringBuilder sb =  new StringBuilder();

        for (String number : numbers) {
            boolean isValid = validatePhone(number);
            if (isValid) {
                sb.append("Calling... ").append(number);
            } else {
                sb.append("Invalid number!");
            }
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }

    private boolean validatePhone(String input) {
        boolean validate = true;
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                validate = false;
                break;
            }
        }

        return validate;
    }

    private boolean validateURL(String url) {
        boolean isValid = true;
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i))) {
                isValid = false;
                break;
            }
        }

        return isValid;
    }
}
