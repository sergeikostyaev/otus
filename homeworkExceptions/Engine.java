package otus.homeworkExceptions;

public class Engine {

    private int maxSpeed;
    private boolean isDriving;

    Engine(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public void run(int requiredSpeed) {
        if (requiredSpeed <= maxSpeed) {
            isDriving = true;
        } else {
            throw new EngineCanNotReachThatSpeedExceptions("Car can not reach " + requiredSpeed + " speed");
        }
    }
}
