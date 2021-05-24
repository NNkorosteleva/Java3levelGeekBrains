package gb.korostelevaan.lesson1;

import java.util.ArrayList;

public class Box<V extends Fruit> {

    private ArrayList<V> box;

    public Box() {
        box = new ArrayList<>();
    }

    /**
     * Метод добавления фрукта в коробку
     *
     * @param fruit фрукт
     * @return true если удалось добавить фрукт в коробку
     */
    public boolean add(V fruit) {
        box.add(fruit);
        return true;
    }

    /**
     * Метод высчитывает вес коробки
     *
     * @return вес коробки
     */
    public float getWeight() {
        if (box.size() != 0) {
            return box.get(0).getWeight() * box.size();
        }
        return 0;
    }

    /**
     * Метод сравнивает коробки по весу
     *
     * @param box коробка с любыми фруктами
     * @return true если вес равен
     */
    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    /**
     * Метод пересыпания фруктов из текущей коробки в другую
     *
     * @param anotherBox коробка
     * @return true если удалось пересыпать фрукты
     */
    public boolean toAnotherBox(Box<V> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
        return true;
    }
}
