package fruitbox;

// Есть классы: GoldenApple -> Apple -> Fruit
//                             Orange -> Fruit
// Есть класс Box. Нужно:
// 1. Организовать его так, чтобы он мог хранить только фрукты какого-то типа
// 2. Реализовать методы добавления фрукта, пересыпания в другую коробку, получение сумарного веса
// Ограничения:
// В коробку с апельсинами нельзя добавить яблоки
// В коробку с золотыми яблоками нельзя добавить апельсины и яблоки
// Пересыпать из коробки с золотыми яблоками в коробку с яблоками можно!

public class HomeWork {

    public static void main(String[] args) {

        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<GoldenApple> goldenAppleBox = new Box<>();
        
        orangeBox.fruits.add(new Orange(3)); 
        System.out.println(orangeBox.getWeight());

        appleBox.fruits.add(new Apple(1));
        appleBox.fruits.add(new GoldenApple(4));
        System.out.println(appleBox.getWeight());

        goldenAppleBox.fruits.add(new GoldenApple(2)); 
        System.out.println(goldenAppleBox.getWeight());


        goldenAppleBox.moveTo(appleBox);
        System.out.println(goldenAppleBox.getWeight()); // 0
        System.out.println(appleBox.getWeight()); // 7
       
    }
}