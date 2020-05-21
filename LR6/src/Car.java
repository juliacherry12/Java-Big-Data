/* 2.	Реализовать класс, моделирующий работу N-местной автостоянки. Машина подъезжает к определенному
месту и едет вправо, пока не встретится свободное место. Класс должен поддерживать методы, обслуживающие
приезд и отъезд машины.  */

public class Car {
    String nameCar;
    String numberOfCar;

    public Car(String nameCar, String numberOfCar) {
        this.nameCar = nameCar;
        this.numberOfCar = numberOfCar;
    }

    // get'эры
    public String getNameCar() {
        return nameCar;
    }

    public String getNumberOfCar() {
        return numberOfCar;
    }

    // set'эры
    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public void setNumberOfCar(String numberOfCar) {
        this.numberOfCar = numberOfCar;
    }
}
