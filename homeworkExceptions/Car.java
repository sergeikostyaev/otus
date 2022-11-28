package otus.homeworkExceptions;

public class Car {

    Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    public void drive(int speed) {

        try {
            engine.run(speed);
            System.out.println("Car is driving");
        } catch (EngineCanNotReachThatSpeedExceptions e) {
            throw new CarCanNotDrive(e.getMessage());
        }

    }
}
