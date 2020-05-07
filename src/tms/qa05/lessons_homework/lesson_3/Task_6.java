package tms.qa05.lessons_homework.lesson_3;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] myArray = { 1, 2, 3, 4, 5, 6};
        int anotherArray = 0;
        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] % 2 == 0) {
                anotherArray = anotherArray + 1;
            }
        }
        int[] newArray = new int[anotherArray];
        int evenNums = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                newArray[evenNums] = myArray[i];
                evenNums = evenNums + 1;
            }

        }
        System.out.println(Arrays.toString(newArray));
    }
}
