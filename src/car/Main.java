package car;

import javafx.scene.chart.PieChart;

import java.util.Date;

/**
 * Created by pan on 04.10.17.
 */
public class Main {
    public static void main(String[] args) {
        /*CarDoor carDoor = new CarDoor();
        System.out.println(carDoor.OpenDor());
        System.out.println(carDoor.OpenClosedDoor());

        System.out.println(carDoor.ClosedWindow());
        System.out.println(carDoor.OpenClosedWindow());

        CarWheel carWheel = new CarWheel();
        System.out.println(carWheel.StatusWheel());
        System.out.println(carWheel.FaildWheel());*/

        Car car = new Car();
        System.out.println(car);
        car.UpdateSpeedNow();
        System.out.println(car);


/*Car{date=Wed Nov 07 00:00:00 CET 3917, engine='null', speedCar=0, timeSpeedTo100km=0.0, carPasazyr=0,
carPasazyrNow=0, speedNow=0, wheels=[CarWheel{statusWheel=1.0}, CarWheel{statusWheel=1.0},
 CarWheel{statusWheel=1.0}, CarWheel{statusWheel=1.0}], doors=[CarDoor{statusDor=false,
 statusWindow=false}, CarDoor{statusDor=false, statusWindow=false}, CarDoor{statusDor=false,
  statusWindow=false}, CarDoor{statusDor=false, statusWindow=false}]}*/
/*
*
* 1) Час створення задається в конструкторі Car
* 2) Змінити значення перемінних за допомогою методів на 3 різні способи
* 3) Не може бути пустих перемінних
* 4) Створити клас пасажирів (Імя, Вік, права (якщо є катерогія B або C або B,C))
* */
    }
}
