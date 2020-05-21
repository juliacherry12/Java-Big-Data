/* Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
9.	interface Мебель <- abstract class Шкаф <- class Книжный Шкаф. */

import java.util.Scanner;

public abstract class Cupboard implements Furniture {
    String modelCupboard;
    int hightCupboard;

    public Cupboard(String modelCupboard, int hightCupboard) {
        this.modelCupboard = modelCupboard;
        this.hightCupboard = hightCupboard;
    }

    public String getModelCupboard() {
        return modelCupboard;
    }

    public int getHightCupboard() {
        return hightCupboard;
    }

    public void setModelCupboard(String modelCupboard) {
        this.modelCupboard = modelCupboard;
    }

    public void setHightCupboard(int hightCupboard) {
        this.hightCupboard = hightCupboard;
    }

    abstract void openDoor();
    public void toMove(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите расстояние в см: ");
        int distance = in.nextInt();
        System.out.print("Введите направление: ");
        Scanner in2 = new Scanner(System.in);
        String direction = in2.nextLine();
        System.out.printf("Шкаф передвинут на %d см в %s \n", distance, direction);
    };

    public abstract void toPaint();

}
