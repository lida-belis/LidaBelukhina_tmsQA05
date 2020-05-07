package tms.qa05.lessons_homework.lesson_3;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int [] array = { 7, 5, 2, 1, 3, 33, 4};
        boolean sort = true;
        while (sort) {
            sort = false;
            for (int i = 1; i < array.length; i++ ) {
                if (array[i - 1] > array[i] ) {
                    int newArray = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = newArray;
                    sort = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
