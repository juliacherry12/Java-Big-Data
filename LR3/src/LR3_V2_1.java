/* 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
Создать массив объектов. Вывести: a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса; c) список студентов, родившихся после заданного года;
d) список учебной группы. */

public class LR3_V2_1 {
    public static void main(String[] args) {
        Student ivanov = new Student(1, "Ivanov", "Ivan", "Ivanovich", "01.02.1996", "Moscow, Russia", "8(916)555-55-55", "IU", 2, "IU6-42");
        Student petrov = new Student(2, "Petrov", "Petr", "Petrovich", "02.03.1997", "Moscow, Russia","8(916)666-66-66", "IU", 2, "IU6-42");
        Student sidorov = new Student(3, "Sidorov", "Sergey", "Sergeevich", "03.04.1998", "Tula, Russia","8(916)777-77-77", "IBM", 1, "IBM2-11");
        Student alexeeva = new Student(4, "Alexeeva", "Alexandra", "Alexandrovna", "04.05.1999", "Omsk, Russia","8(916)888-88-88", "IU", 1, "IU2-11");
        Student[] students = {ivanov, petrov, sidorov, alexeeva};

        //список студентов заданного факультета
        System.out.println("Список студентов факультета IU: ");
        for(Student student : students){
            student.listFaculty("IU");
        }
        System.out.println();

        //список студентов заданного курса и факультета
        System.out.println("Список студентов 2 курса факультета IU: ");
        for(Student student : students){
            student.listCourse("IU", 2);
        }
        System.out.println();

        //список студентов, родившихся после заданного года
        System.out.println("Список студентов, родившихся после 1997 года: ");
        for(Student student : students){
            student.age(1997);
        }
        System.out.println();

        //) список учебной группы
        System.out.println("Список студентов группы IU6-42: ");
        for(Student student : students){
            student.listGroup("IU6-42");
        }
    }
}
