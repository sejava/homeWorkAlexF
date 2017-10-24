package car;

/**
 * Created by pan on 04.10.17.
 */
public class Main {
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        System.out.println(carDoor.OpenDor());
        System.out.println(carDoor.OpenClosedDoor());

        System.out.println(carDoor.ClosedWindow());
        System.out.println(carDoor.OpenClosedWindow());

        CarWheel carWheel = new CarWheel();
        System.out.println(carWheel.StatusWheel());
        System.out.println(carWheel.FaildWheel());
    }
}
