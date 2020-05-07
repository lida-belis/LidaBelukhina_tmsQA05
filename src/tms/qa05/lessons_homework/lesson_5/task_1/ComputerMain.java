package tms.qa05.lessons_homework.lesson_5.task_1;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer = new Dell();

        computer.on();
        computer.off();
        computer.reset();
    }
}
