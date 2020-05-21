/* 1. Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет, Курс, Группа.
Создать массив объектов. Вывести: a) список студентов заданного факультета;
b) списки студентов для каждого факультета и курса; c) список студентов, родившихся после заданного года;
d) список учебной группы. */

public class Student {
    private int  id; // идентификатор
    private String  surname; // фамилия
    private String  name; // имя
    private String  patronymic; // отчество
    private String  birthday; // дата рождения
    private String  address; // адрес
    private String  phone; // телефон
    private String  faculty; // факультет
    private int  course; // курс
    private String  group; // группа

    public Student(){
    }

    public Student(int id, String surname, String name, String patronymic, String birthday, String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String surname, String name, String birthday, String address, String phone, String faculty,
                   int course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    // get'ры
    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    // set'ры
    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public void listFaculty(String faculty){
        if(this.faculty == faculty){
            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic());
        }
    }
    public void listCourse(String faculty, int course){

        if(this.faculty == faculty && this.course == course){

            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getCourse() + " " + getGroup());
        }
    }

    public void age(int years){
        String[] strBirthday = getBirthday().split("\\.");
        //System.out.print(strBirthday[1] + " " + strBirthday[2]);
        int year = Integer.parseInt(strBirthday[2]);
        if(year >= years){
            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getCourse() + " " + getGroup());
        }
    }

    public void listGroup(String group){

        if(this.group == group){

            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getCourse() + " " + getGroup());
        }
    }
}
