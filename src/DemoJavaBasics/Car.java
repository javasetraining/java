package DemoJavaBasics;

/**
 * Created by iucosoft7 on 1/21/15.
 */
public class Car {

    private int wheelsNumber;
    private int putereaMotorului;
    private int carNr;

    public Car(int wheelsNumber, int putereaMotorului, int carNr) {
        this.wheelsNumber = wheelsNumber;
        this.putereaMotorului = putereaMotorului;
        this.carNr = carNr;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public int getPutereaMotorului() {
        return putereaMotorului;
    }

    public void setPutereaMotorului(int putereaMotorului) {
        this.putereaMotorului = putereaMotorului;
    }

    public int getCarNr() {
        return carNr;
    }

    public void setCarNr(int carNr) {
        this.carNr = carNr;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheelsNumber=" + wheelsNumber +
                ", putereaMotorului=" + putereaMotorului +
                ", carNr=" + carNr +
                '}';
    }
}
