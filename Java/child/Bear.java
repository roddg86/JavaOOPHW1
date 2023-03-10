package child;

import parent.Animal;

/**
 * Бегающие
 * Сущность медведь
 */
public class Bear extends Animal {
    public Bear(String name, String color) {
        super(name, color, 4);
    }

    public void speak() {
        System.out.printf("%s говорит: Рычание-Рычание!%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s я иду%n", getType());
    }
}
