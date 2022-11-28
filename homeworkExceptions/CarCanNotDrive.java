package otus.homeworkExceptions;

public class CarCanNotDrive extends RuntimeException {

    CarCanNotDrive(String message) {
        super(message);
    }
}
