package tms.qa05.lessons_homework.lesson_6.task_2;

public class CarMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);

        car.startTheEngine();

    }
}
