package tms.qa05.lessons_homework.lesson_5.task_1;

public class Dell implements Computer {
    private boolean isOn;

    @Override
    public boolean on() {
        if (!isOn) {
            isOn = true;
        }else {
            isOn = false;
        }
        return isOn;
    }

    @Override
    public void off() {
        if (isOn) {
            System.out.println("Computer is on");
        }else {
            System.out.println("Computer is off");
        }
    }

    @Override
    public void reset() {
        System.out.println("To restart a computer");

    }
}

