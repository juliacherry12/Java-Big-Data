/* 2.	Реализовать класс, моделирующий работу N-местной автостоянки. Машина подъезжает к определенному
месту и едет вправо, пока не встретится свободное место. Класс должен поддерживать методы, обслуживающие
приезд и отъезд машины.  */

import java.util.ArrayList;

public class Parking {
    String nameParking; // Название парковки
    int numberOfPlaces; // Колличество мест на парковке
    private ArrayList<Car> carParking = new ArrayList<Car>(); // Список припаркованных машин

    public Parking(String nameParking, int numberOfPlaces) {
        this.nameParking = nameParking;
        this.numberOfPlaces = numberOfPlaces;
        for (int i=0; i<numberOfPlaces;i++){
          this.carParking.add(null);
        }
        System.out.println("Парковка свободна!");
    }

    // get'эры
    public String getNameParking() {
        return nameParking;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public ArrayList<Car> getCarParking() {
        return carParking;
    }

    // set'эры
    public void setNameParking(String nameParking) {
        this.nameParking = nameParking;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public void setCarParking(ArrayList<Car> carParking) {
        this.carParking = carParking;
    }

    // Добавление новой машины на парковку
    public void addCarOnParking(Car car) {
        boolean flag = false;
        for (int i=0; i<this.numberOfPlaces; i++){
            if (carParking.get(i) == null) {
                  carParking.set(i, car);
                  System.out.println("Машина припаркована.");
                  flag = true;
                  break;
              }
        }
        if (!flag) {
            System.out.println("Мест нет!");
        }
       // System.out.println(carParking.toString());
    }

    // Освобождение места
    public void removeCarOnParking (Car car) {
        try {
            int carParkingIndex = carParking.indexOf(car);
            carParking.set(carParkingIndex, null);
            System.out.println("Место свободно!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Такая машина не припаркована");
        }
    }

    // Мониторинг свободных мест
    public void printFreePlace() {
        System.out.println("Количество мест на парковке: " + this.getNumberOfPlaces());
        for (int i = 0; i < carParking.size(); i++) {
            if (carParking.get(i) == null) {
                System.out.println("Место " + i + " свободно");
            } else
                System.out.println("Место " + i + "  занято");
        }
    }
}
