package tms.qa05.lessons_homework.lesson_7.task_9;

public class Task_9 {
    public static void main(String[] args) {
        String[] arrayString = {"Forest", "Shop", "Library", "Dream", "Bookshop"};
        int symbol = 5;

        for (int i = 0; i < arrayString.length; ++i) {
            if (arrayString[i].length() > symbol) {

                System.out.println(arrayString[i]);
            }
        }
    }
}
