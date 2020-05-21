/* Выполнить задания на основе варианта 1 лабораторной работы 4, контролируя состояние потоков ввода/вывода.
При возникновении ошибок, связанных с корректностью выполнения математических операций,
генерировать и обрабатывать исключительные ситуации. Предусмотреть обработку исключений, возникающих при нехватке
памяти, отсутствии требуемой записи (объекта) в файле, недопустимом значении поля и т.д. */
public class LR5_V1 {
    public static void main(String[] args) {
        Park disneyLand = new Park(5000, "Disney Land");
       // Park.Attraction rollerCoaster = disneyLand.new Attraction("Американские горки", 250, "10:00-20:00");
        Park.Attraction carousel = disneyLand.new Attraction("Карусель", 100, "09:00-21:00");

        disneyLand.displayName();
        disneyLand.displaySquare();
        try {
            disneyLand.changeParkName(null);
            String namePark = disneyLand.name.toString();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try {
            disneyLand.setSquare(-20);
            disneyLand.displaySquare();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        // rollerCoaster.displayNameAttraction();
       // rollerCoaster.displayTicket();
       // rollerCoaster.displayWorkTime();

        carousel.displayNameAttraction();
        carousel.displayTicket();
        carousel.displayWorkTime();

        try {
            carousel.changeName("Какой-то бред");
        }
        catch (ChangeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            carousel.changeName("Карусель Солнышко");
        }
        catch (ChangeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        carousel.displayNameAttraction();
    }
}
