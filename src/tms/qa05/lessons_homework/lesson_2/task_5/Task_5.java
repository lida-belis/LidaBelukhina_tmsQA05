package tms.qa05.lessons_homework.lesson_2.task_5;
public class Task_5 {
    public static void main(String[] args) {
        double centimeter = 2.54;
        int inch = 20;
        for (int i = 1; i <= inch; i++) {
            System.out.println(centimeter * i + " cm");
        }
    }
}
