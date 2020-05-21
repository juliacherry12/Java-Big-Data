package com.company;

    import java.util.Scanner;

public class LR2_V2 {

    public static void main(String[] args) {
        // ввод размеров матрицы
        System.out.println("Введите количество строк и столбцов:");
        int widthight = new Scanner(System.in).nextInt();
        averageElement(matrixFilling(widthight, widthight), widthight, widthight);
    }

    public static double[][] averageElement(double[][] matrix, int width, int hight) {
        double sum = 0;
        double[] array = new double[width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < hight; j++) {
                sum += matrix[i][j];
            }
            System.out.println(sum);
            array[i] = sum / width;
            sum = 0;
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < hight; j++) {
                matrix[i][j] = matrix[i][j] - array[i];
            }
        }
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static double[][] matrixFilling(int width, int hight) {
        double[][] array = new double[hight][width];
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] =(double) (Math.random() * 99)-44;
            }
        }
        for (int i = 0; i < hight; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }
}