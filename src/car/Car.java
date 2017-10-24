package car;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by pan on 04.10.17.
 */
public class Car {
    private Date date = new Date(2017,10,7);
    private String engine; // disel, benzin.
    private int speedCar;// = 280;
    private float timeSpeedTo100km;// = 4.2f;
    private byte carPasazyr;// = 4;
    private byte carPasazyrNow;
    private int speedNow;
    private CarWheel[] wheels;
    private CarDoor[] doors;

    public Car() {
        this.date = date;
        wheels = new CarWheel[4];// + запаска // создали масів з типом даних кальоса кількість 5 шт. їсти по 1
        doors = new CarDoor[4]; // + багажнік
        carWheel(wheels);
        carDors(doors);
    }
    public static CarWheel[] carWheel(CarWheel[] wheels){
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new CarWheel();
        }
        return wheels;
    }
    public static CarDoor[] carDors(CarDoor[] dors){
        for (int i = 0; i < dors.length; i++) {
            dors[i] = new CarDoor();
        }
        return dors;
    }
    public Car(Date date, String engine, int speedCar, float timeSpeedTo100km, byte carPasazyr, byte carPasazyrNow, int speedNow) {
        this.date = date;
        this.engine = engine;
        this.speedCar = speedCar;
        this.timeSpeedTo100km = timeSpeedTo100km;
        this.carPasazyr = carPasazyr;
        this.carPasazyrNow = carPasazyrNow;
        this.speedNow = speedNow;
    }

        int UpdateSpeedNow(){
            if (speedNow == 0){
                speedNow += 10;
            }
            return speedNow;
        }

        int PutPassagerInCar(){
            return carPasazyrNow += 1;
        }

        int OutPassagerOfTheCar(){
            if (carPasazyrNow >0);
            return carPasazyrNow -= 1;
        }

        int OutAllPassaerOfTheCar(){
            return carPasazyrNow -= carPasazyrNow;
        }

    public CarWheel[] getWheels() {
        return wheels;
    }

    public CarDoor[] getDoors() {
        return doors;
    }
        /* int GetNumberCarWheel(CarWheel[] carWheels){
            return carWheels;
        }*/

    @Override
    public String toString() {
        return "Car{" +
                "date=" + date +
                ", engine='" + engine + '\'' +
                ", speedCar=" + speedCar +
                ", timeSpeedTo100km=" + timeSpeedTo100km +
                ", carPasazyr=" + carPasazyr +
                ", carPasazyrNow=" + carPasazyrNow +
                ", speedNow=" + speedNow +
                ", wheels=" + Arrays.toString(wheels) +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}
