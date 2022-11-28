package otus.homeworkExceptions;

public class EngineCanNotReachThatSpeedExceptions extends RuntimeException {

    private int speed;

    EngineCanNotReachThatSpeedExceptions(String message) {
        super(message);
    }
}
