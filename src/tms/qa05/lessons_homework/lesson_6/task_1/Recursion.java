package tms.qa05.lessons_homework.lesson_6.task_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        printArray(array, 0);
    }

    private static void printArray(int[] array, int number) {
        if (number < array.length) {
            printArray(array, number + 1);
            System.out.println(array[number]);
        }
    }
}
