package tms.qa05.lessons_homework.lesson_3;

public class Task_2 {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 4, 3, 7 };
        double result = 0;
        for (int i = 0; i < numbers.length; i++){
            result = result + numbers[i];
        }
        result = result / numbers.length;
        System.out.println("Arithmetic mean = " + result);
    }
}