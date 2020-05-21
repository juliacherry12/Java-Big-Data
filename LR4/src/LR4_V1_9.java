/* 9.	Создать класс Park (парк) с внутренним классом, с помощью объектов которого можно
хранить информацию об аттракционах, времени их работы и стоимости.*/

public class LR4_V1_9 {
    public static void main(String[] args) {
        Park disneyLand = new Park(5000, "Disney Land");
        Park.Attraction rollerCoaster = disneyLand.new Attraction("Американские горки", 250, "10:00-20:00");
        Park.Attraction carousel = disneyLand.new Attraction("Карусель", 100, "09:00-21:00");

        disneyLand.displayName();
        disneyLand.displaySquare();
        rollerCoaster.displayNameAttraction();
        rollerCoaster.displayTicket();
        rollerCoaster.displayWorkTime();
        carousel.displayNameAttraction();
        carousel.displayTicket();
        carousel.displayWorkTime();
    }
}
