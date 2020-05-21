/* 9.	Создать класс Park (парк) с внутренним классом, с помощью объектов которого можно
хранить информацию об аттракционах, времени их работы и стоимости.*/
/* Выполнить задания на основе варианта 1 лабораторной работы 4, контролируя состояние потоков ввода/вывода.
При возникновении ошибок, связанных с корректностью выполнения математических операций,
генерировать и обрабатывать исключительные ситуации. Предусмотреть обработку исключений, возникающих при нехватке
памяти, отсутствии требуемой записи (объекта) в файле, недопустимом значении поля и т.д. */

public class Park {
    int square;
    String name;

    public Park(int square, String name) {
        this.square = square;
        this.name = name;
    }

    public int getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Название парка: " + this.name);
    }

    public void displaySquare() throws IllegalArgumentException {
        if (this.square < 0) {
            throw new IllegalArgumentException();
        }
        else {
            System.out.println("Площадь парка: " + this.square);
        }
    }

    public void changeParkName (String name){
        this.name = name;
    }

    public class Attraction {
        String name_attraction;
        int ticket;
        String working_time;

        public Attraction(String name_attraction, int ticket, String working_time) {
            this.name_attraction = name_attraction;
            this.ticket = ticket;
            this.working_time = working_time;
        }

        public void changeName (String newName) throws ChangeException {
            if (newName.equals("") || newName.equals("Какой-то бред")) {
                throw new ChangeException (newName);
            }
            else {
                this.name_attraction = newName;
            }
        }

        public void displayNameAttraction() {
            System.out.println("Название аттракциона: " + this.name_attraction);
        }

        public void displayWorkTime() {
            System.out.println("Время работы аттракциона: " + this.working_time);
        }

        public void displayTicket() {
            System.out.println("Стоимость билета на аттракцион: " + this.ticket);
        }
    }

}
