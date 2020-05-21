/* 9.	Определить класс Квадратное уравнение. Класс должен содержать несколько конструкторов.
Реализовать методы для поиска корней, экстремумов, а также интервалов убывания/возрастания.
Создать массив объектов и определить наибольшие и наименьшие по значению корни. */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Square_equation {
    private double  a; // параметр при x^2
    private double  b; // параметр при x
    private double  c; // параметр при x^0

    public Square_equation (double  a, double  b, double  c) {
        checkQuadratic(a);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Square_equation (double  b, double  c) {
        this.a = 1;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return pow(b, 2) - 4 * a * c;
    }

    public double[] getX() {
        double d = getDiscriminant();
        double[] x;

        if (d > 0) {
            x = new double[2];
            x[0] = (-b + sqrt(d)) / (2 * a);
            x[1] = (-b - sqrt(d)) / (2 * a);
            return x;
        } else if (d == 0) {
            x = new double[1];
            x[0] = -b / (2 * a);
            return x;
        } else {
            x = new double[0];
        }

        return x;
    }

    public double getExtremum() {
        return -b / (2 * a);
    }

    public double[] getDecreasingInterval() {
        double[] interval = new double[2];

        if (a > 0) {
            interval[0] = Double.NEGATIVE_INFINITY;
            interval[1] = getExtremum();
        } else {
            interval[0] = getExtremum();
            interval[1] = Double.POSITIVE_INFINITY;
        }

        return interval;
    }

    public double[] getIncreasingInterval() {
        double[] interval = new double[2];

        if (a > 0) {
            interval[0] = getExtremum();
            interval[1] = Double.POSITIVE_INFINITY;
        } else {
            interval[0] = Double.NEGATIVE_INFINITY;
            interval[1] = getExtremum();
        }

        return interval;
    }

    public static void checkQuadratic(double a) {
        if (a == 0) {
           System.out.println("Это уравнение не является квадратным!");
        }
    }
}

