package car;

/**
 * Created by pan on 04.10.17.
 */
public class CarDoor {
    private boolean statusDor;
    private boolean statusWindow;

    public CarDoor() {
        statusDor = false;
        statusWindow = false;
    }

    public CarDoor(boolean statusDor, boolean statusWindow) {
        this.statusDor = statusDor;
        this.statusWindow = statusWindow;
    }

    boolean OpenDor(){
        return statusDor = true;
    }

    boolean ClosedDoor(){
        return statusDor = false;
    }

    boolean OpenClosedDoor(){
        if (statusDor) statusDor = false;
        else if(!statusDor) statusDor = true;
        return statusDor;
    }

    boolean OpenWindow(){
        return statusWindow = true;
    }

    boolean ClosedWindow(){
        return statusWindow = false;
    }

    boolean OpenClosedWindow(){
        if (statusWindow) statusWindow = false;
        else statusWindow = true;
        return statusWindow;
    }

}
