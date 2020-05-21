/* 9.	Создать класс Park (парк) с внутренним классом, с помощью объектов которого можно
хранить информацию об аттракционах, времени их работы и стоимости.*/

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

    public void displaySquare() {
        System.out.println("Площадь парка: " + this.square);
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
