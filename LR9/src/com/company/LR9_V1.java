/* 3.	Задана коллекция чисел. Вернуть сумму нечетных чисел. */
package com.company;
import java.util.Arrays;
import java.util.Collection;

public class LR9_V1 {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 2, 10 ,11, 23, 42, 24);
        System.out.println("Сумма нечетных чисел: ");
        Integer sumOdd = collection.stream().filter(o -> o % 2 != 0).reduce((s1, s2) -> s1 + s2).orElse(0);
        System.out.println(sumOdd);
    }
}
