/* 11.	Задана коллекция:
        (Класс People: имя и возраст, пол (enum))
        Collection<People> peoples = Arrays.asList(
        new People("Ivan", 16, Sex.MAN),
        new People("Petr", 23, Sex.MAN),
        new People("Maria", 42, Sex.WOMAN)
        );
        Найти самого старшего человека мужского пола.
 */

import java.util.Objects;

public class People {
    enum Sex {
        MAN,
        WOMEN
    }
    String name;
    Integer age;
    Sex sex;

    public People(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void getNameOfAge(Integer age){
       if (age==this.age){
           System.out.println(this.name);
       }
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) &&
                Objects.equals(age, people.age) &&
                sex == people.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }
}
