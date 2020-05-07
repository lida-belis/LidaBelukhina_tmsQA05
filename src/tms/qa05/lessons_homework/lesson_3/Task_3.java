package tms.qa05.lessons_homework.lesson_3;

public class Task_3 {
    public static void main(String[] args) {
        int[] numbers = new int[]{ 1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            }
            System.out.println("Result : " + numbers[i]);
        }
    }
}
