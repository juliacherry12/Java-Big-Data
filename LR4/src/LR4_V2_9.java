/* Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
9.	interface Мебель <- abstract class Шкаф <- class Книжный Шкаф. */
public class LR4_V2_9 {
    public static void main(String[] args) {
        BookCase bookCase1 = new BookCase("Мечта", 210);
        System.out.println("Модель: " + bookCase1.modelCupboard);
        System.out.println("Высота: " + bookCase1.hightCupboard);
        bookCase1.toMove();
        bookCase1.toPaint();
        bookCase1.openDoor();
    }

}
