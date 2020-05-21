/* 2.	Реализовать класс, моделирующий работу N-местной автостоянки. Машина подъезжает к определенному
месту и едет вправо, пока не встретится свободное место. Класс должен поддерживать методы, обслуживающие
приезд и отъезд машины.  */

public class LR6_V2 {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "к123нр777");
        Car mercedes = new Car("Mercedes", "а456тс777");
        Car smart = new Car("Smart", "х789еу777");
        Car volkswagen = new Car("VolksWagen", "м000мм777");
        Car lexus = new Car("Lexus", "е777кх777");
        Parking parking = new Parking("Подземный паркинг 1", 4);

        System.out.println("Припаркуем 4 машины на парковке:");
        parking.addCarOnParking(bmw);
        parking.addCarOnParking(mercedes);
        parking.addCarOnParking(smart);
        parking.addCarOnParking(volkswagen);
        System.out.println("Пробуем припарковать пятую:");
        parking.addCarOnParking(lexus);
        System.out.println("Две машины уехали с парковки:");
        parking.removeCarOnParking(mercedes);
        parking.removeCarOnParking(smart);
        System.out.println("Повторно паркуем пятую машину:");
        parking.addCarOnParking(lexus);
        System.out.println("Проверяем, есть ли свободные места:");
        parking.printFreePlace();
    }
}
