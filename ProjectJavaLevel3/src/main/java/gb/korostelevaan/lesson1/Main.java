package gb.korostelevaan.lesson1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        GeneralizationArray<String> arrayStr = new GeneralizationArray<>("A", "B", "C", "D", "E");
        arrayStr.printArray();
        arrayStr.swap(1, 3);
        arrayStr.printArray();

        GeneralizationArray<Integer> arrayInt = new GeneralizationArray<>(0, 1, 2, 3, 4);
        arrayInt.printArray();
        arrayInt.swap(0, 4);
        arrayInt.printArray();

        ArrayList<String> arrayList = arrayStr.toArrayList();
        System.out.println(arrayList.toString());

        Apple apple = new Apple();
        Box<Apple> boxApple = new Box<>();
        Box<Apple> boxAppleAnother = new Box<>();
        for (int i = 0; i < 5; i++) {
            boxApple.add(apple);
            boxAppleAnother.add(apple);
        }
        System.out.println(boxApple.getWeight());

        Orange orange = new Orange();
        Box<Orange> boxOrange = new Box<>();
        for (int i = 0; i < 5; i++) {
            boxOrange.add(orange);
        }
        System.out.println(boxOrange.getWeight());

        System.out.println(boxApple.compare(boxOrange));
        System.out.println(boxApple.compare(boxApple));

        System.out.println(boxAppleAnother.getWeight());
        boxApple.toAnotherBox(boxAppleAnother);
        System.out.println(boxAppleAnother.getWeight());
        System.out.println(boxApple.getWeight());


    }
}
