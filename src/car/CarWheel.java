package car;

/**
 * Created by pan on 04.10.17.
 */
public class CarWheel {
    private float statusWheel;

    public CarWheel() {
        statusWheel = 1.0f;
    }

    public CarWheel(float statusWheel) {
        this.statusWheel = statusWheel;
    }

    float NewWheel(){
        return statusWheel = 1.0f;
    }

    float FaildWheel(){
        return statusWheel - (1 * 0.1f);
    }

    float StatusWheel(){
        return statusWheel;
    }

    @Override
    public String toString() {
        return "CarWheel{" +
                "statusWheel=" + statusWheel +
                '}';
    }
 }
