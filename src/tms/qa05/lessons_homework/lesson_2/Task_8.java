package tms.qa05.lessons_homework.lesson_2;

public class Task_8 {
    public static void main(String[] args) {
        int evenNumb = 0;
        int oddNumb = 0;
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumb = evenNumb + i;
            }
            if (i % 2 != 0) {
                oddNumb = oddNumb + i;
            }
        }
        total = evenNumb +oddNumb;

        System.out.println("Sum of even numbers = " + evenNumb);
        System.out.println("Sum of odd numbers = " + oddNumb);
        System.out.println("The sum of all numbers = " + total);
    }
}

