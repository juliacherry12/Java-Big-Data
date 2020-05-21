/* 11.	Задана коллекция:
        (Класс People: имя и возраст, пол (enum))
        Collection<People> peoples = Arrays.asList(
        new People("Ivan", 16, Sex.MAN),
        new People("Petr", 23, Sex.MAN),
        new People("Maria", 42, Sex.WOMAN)
        );
        Найти самого старшего человека мужского пола.
 */
import java.util.Arrays;
import java.util.Collection;

public class LR9_V2 {
    public static void main(String[] args) {
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16, People.Sex.MAN),
                new People("Petr", 23, People.Sex.MAN),
                new People("Maria", 42, People.Sex.WOMEN)
        );
        int oldAge = peoples.stream().filter((p) -> p.getSex() == People.Sex.MAN).map(People::getAge)
                .reduce((s1, s2) -> s1 > s2 ? s1 : s2).get();
        System.out.println("Возраст самого старого мужчины: " + oldAge);
    }

}
