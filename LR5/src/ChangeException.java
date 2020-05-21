/* Выполнить задания на основе варианта 1 лабораторной работы 4, контролируя состояние потоков ввода/вывода.
При возникновении ошибок, связанных с корректностью выполнения математических операций,
генерировать и обрабатывать исключительные ситуации. Предусмотреть обработку исключений, возникающих при нехватке
памяти, отсутствии требуемой записи (объекта) в файле, недопустимом значении поля и т.д. */

public class ChangeException extends Exception {
    String newName;
    public ChangeException (String newName){
        super("Название введено некорректно!");
        this.newName = newName;
    }

    public String getNewName() {
        return newName;
    }

}
