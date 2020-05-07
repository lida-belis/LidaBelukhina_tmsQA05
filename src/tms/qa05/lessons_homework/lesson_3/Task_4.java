package tms.qa05.lessons_homework.lesson_3;

import java.sql.Array;
import java.util.Arrays;

public class Task_4 {
    public static void main(String[] args) {
        int[][] twoDimensionalArray = new int[10][10];
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int k = 0; k < twoDimensionalArray[i].length; k++) {
                twoDimensionalArray[i][k] = (i + 1) * (k + 1);
            }
        }
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.println(Arrays.toString(twoDimensionalArray[i]));
        }
    }
}
