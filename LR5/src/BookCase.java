/* Реализовать абстрактные классы или интерфейсы, а также наследование и полиморфизм для следующих классов
9.	interface Мебель <- abstract class Шкаф <- class Книжный Шкаф. */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public void changePaint(String color) throws MyException {
        Pattern pattern = Pattern.compile("^[1-9][0-9]*$");
        Matcher matcher = pattern.matcher(color);
        if (color.equals("") || matcher.matches()) {
            throw new MyException (color);
        }
        else {
            System.out.println("Цвет шкафа изменен на " + color);
        }
    }

    public void readModel() throws MyException {
        Scanner inModel = new Scanner(System.in);
        System.out.print("Введите новую модель: ");
        String newModel = inModel.nextLine();
        if (newModel.equals("")){
            throw new MyException(newModel);
        }
        else {
            this.modelCupboard = newModel;
        }


    }
}
