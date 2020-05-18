package tms.qa05.lessons_homework.lesson_6.task_2;

public class Engine {
    private boolean isOn;

    public boolean shutOffTheEngine() {
        if (isOn) {
            isOn = false;
            return isOn;
        } else {
            return isOn;
        }
    }

    public boolean startTheEngine() {
        if (isOn) {
            return isOn;
        } else {
            isOn = true;
            return isOn;
        }
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

