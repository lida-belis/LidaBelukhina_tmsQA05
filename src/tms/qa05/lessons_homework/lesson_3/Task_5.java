package tms.qa05.lessons_homework.lesson_3;

import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        int[] myArray = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(myArray));
        int[] array = new int[myArray.length];
        for (int i = 0;i < myArray.length; i++) {
            array[i] = myArray[myArray.length - i - 1];
        }
        System.out.println("== After ==");
        System.out.println(Arrays.toString(array));
    }
}