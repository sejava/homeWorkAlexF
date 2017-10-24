package car;

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

    public Car(Date date) {
        this.date = date;
        wheels = new CarWheel[4];
        doors = new CarDoor[4];
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

       /* int GetNumberCarWheel(CarWheel[] carWheels){
            return carWheels;
        }*/
}
