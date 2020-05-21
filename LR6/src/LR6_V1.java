/* 1.	Определить множество на основе множества целых чисел. Создать методы для
определения пересечения и объединения множеств. */
public class LR6_V1 {
        public static void main(String[] args) {
            Set set1 = new Set(1, 2, 3, 8, 6);
            Set set2 = new Set(2, 3, 4, 5, 7, 6);

            System.out.println("Пересечение: " + set1.intersect(set2));
            System.out.println("Объединение: " + set1.unify(set2));
        }
}
