package tms.qa05.lessons_homework.lesson_7.task_8;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        String[] array = {"1.4", "3.0", "1.4", "2.0", "1.8"};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; ++i) {
            if (array[i].equals("1.4")) {
                array[i] = "2.0T";
            }
            if (array[i].equals("1.8")) {
                array[i] = "1.8T";
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
