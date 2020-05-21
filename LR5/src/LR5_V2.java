/* Выполнить задания из варианта 2 лабораторной работы 4, реализуя собственные обработчики исключений
и исключения ввода/вывода. */
/* Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
9.	interface Мебель <- abstract class Шкаф <- class Книжный Шкаф. */
public class LR5_V2 {
    public static void main(String[] args) {
        BookCase bookCase1 = new BookCase("Мечта", 210);
        System.out.println("Модель: " + bookCase1.modelCupboard);
        System.out.println("Высота: " + bookCase1.hightCupboard);
        //bookCase1.toMove();
        //bookCase1.toPaint();
        bookCase1.openDoor();

        try {
            bookCase1.changePaint("7");
        } catch (MyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try{
          bookCase1.readModel();
        } catch (MyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println(bookCase1.getModelCupboard());
    }
}

