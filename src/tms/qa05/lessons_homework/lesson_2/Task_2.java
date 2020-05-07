package tms.qa05.lessons_homework.lesson_2;

public class Task_2 {
    public static void main(String[] args) {
        int ameba = 1;
        for (int i = 1;i < 9; i++) {
            // 9 - это этапы. То есть 1 этап = 3 часам
           if (i % 3 == 0);
           ameba = ameba * 2;

           System.out.println("Ameba after " + i + " stages " + ameba);
        }
    }
}
