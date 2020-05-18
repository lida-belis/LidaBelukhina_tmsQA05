package tms.qa05.lessons_homework.lesson_4.task_2;

public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public ExecutionQueue() {
        msg = "constructor value";
    }

    public String toShow() {
        return msg;
    }
}
