/* Выполнить задания из варианта 2 лабораторной работы 4, реализуя собственные обработчики исключений
и исключения ввода/вывода. */
public class MyException extends Exception {
    String typeError;
    public MyException (String typeError){
        super("Данные введены некоректно!");
        this.typeError = typeError;
    }

    public String getNewName() {
        return typeError;
    }
}
