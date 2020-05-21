/* Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
9.	interface Мебель <- abstract class Шкаф <- class Книжный Шкаф. */

import java.util.Scanner;

public class BookCase extends Cupboard{

    public BookCase(String modelCupboard, int hightCupboard) {
        super(modelCupboard, hightCupboard);
    }

    @Override
    void openDoor() {
        System.out.println("Дверца открыта! Можете взять книгу!");
    }

    @Override
    public void toPaint() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        String color = in.nextLine();
        System.out.println("Шкаф перекрашен в " + color);
    }
}
