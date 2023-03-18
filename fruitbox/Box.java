package fruitbox;

import java.util.ArrayList;
public class Box <T extends Fruit> {

    public ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public int getWeight() {
        int sum = 0;
        for (T t : fruits) {
            sum += t.getWeight();
        }
        return sum;
    }

    public void moveTo(Box<? super Apple> target) {
        for (int i = 0; i < target.fruits.size(); i++) {
            Fruit x = target.fruits.get(i);
            // fruits.add(x);
        }
    }
}
