package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class lr1_v2_3 {
    public static void main(String[] args) {

        System.out.print("Введите количество чисел: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] sourceNumbers = new int[size];
        int i = 0;
        for (int element : sourceNumbers)
        {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            sourceNumbers[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Числа, которые делятся на 3 или на 9: ");
        for (int j=0; j < size; j++)
            if ((sourceNumbers[j] % 3 == 0) || (sourceNumbers[j] % 9 == 0))
                System.out.print(sourceNumbers[j] + " ");
    }
}