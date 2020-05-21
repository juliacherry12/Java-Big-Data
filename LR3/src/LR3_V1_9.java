/* 9.	Определить класс Квадратное уравнение. Класс должен содержать несколько конструкторов.
Реализовать методы для поиска корней, экстремумов, а также интервалов убывания/возрастания.
Создать массив объектов и определить наибольшие и наименьшие по значению корни. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LR3_V1_9 {
    public static void main(String[] args) {
        List<Square_equation> quadratics = new ArrayList<>();
        quadratics.add(new Square_equation(2., 1., 5.));
        quadratics.add(new Square_equation(1., 10.5, 3.));
        quadratics.add(new Square_equation(2.5, 20., 3.));
        quadratics.add(new Square_equation(2, 3));
        quadratics.add(new Square_equation(0, -5.));

        for (Square_equation quadratic : quadratics) {
            System.out.println(quadratic);

            System.out.print("Discriminant = "); // Дискриминант
            System.out.println(quadratic.getDiscriminant());

            System.out.print("Root(s) = "); // Корни
            System.out.println(Arrays.toString(quadratic.getX()));

            System.out.print("Decreasing interval = "); // Интервалы возрастания и убывания
            System.out.println(Arrays.toString(quadratic.getDecreasingInterval()));

            System.out.print("Increasing interval = ");
            System.out.println(Arrays.toString(quadratic.getIncreasingInterval()));

            System.out.println();
        }
    }

}
