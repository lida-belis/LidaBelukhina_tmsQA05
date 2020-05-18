package tms.qa05.lessons_homework.lesson_6.task_2;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startTheEngine() {
        if (engine.isOn()) {
            System.out.println("The engine is already running");
        } else {
            engine.startTheEngine();
        }
    }

    public void shutOffTheEngine() {
        if (engine.isOn()) {
            engine.shutOffTheEngine();
        } else {
            System.out.println("The engine is already shut");
        }
    }
}
