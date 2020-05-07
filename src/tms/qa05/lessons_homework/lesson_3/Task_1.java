package tms.qa05.lessons_homework.lesson_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int[] myArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Enter number " + (i + 1));
            myArray[i] = scanner.nextInt();
        }
        int sum = 0;
        int smallest = myArray[0];
        int largest = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
            while (myArray[i] < smallest) {
                smallest = myArray[i];
            }
            while (myArray[i] > largest){
                largest = myArray[i];
            }
            }
        System.out.println("Sum = " + sum);
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }

}
