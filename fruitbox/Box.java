package fruitbox;

import java.util.List;
import java.util.ArrayList;

public class Box <T extends Fruit> {

    private List<T> fruits;
    private T t1;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    // public int getWeight() {
    //     int sum = 0;
    //     for (T t : fruits) {
    //         sum += t.intValue();
    //     }
    //     return sum;
    //     throw new UnsupportedOperationException();
    // }

    public void moveTo(Box <? extends Fruit> target) {
        // пересыпаем фрукты отсюда в target
    }


}
