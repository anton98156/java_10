package fruitbox;

public class Main {

    public static void main(String[] args) {
        NumberContainer<Integer> integerNumberContainer = new NumberContainer<>();
        NumberContainer<Long> longNumberContainer = new NumberContainer<>();
        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>();
        NumberContainer<Number> numberNumberContainer = new NumberContainer<>();

        numberNumberContainer.addNumber(1);
        numberNumberContainer.addNumber(1L);
        numberNumberContainer.addNumber(1.5);

        System.out.println(numberNumberContainer.sum());

//        NumberContainer<String> stringNumberContainer = new NumberContainer<>();
//        NumberContainer<Character> charNumberContainer = new NumberContainer<>();
    }

}
