package tms.qa05.lessons_homework.lesson_6.task_1;

public class Recursion {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        getArray(array, 0 );

        System.out.println("result :" + array);
    }
    private static void getArray(int[] array, int number) {
        if (number < array.length) {
            getArray(array, number + 1);
            System.out.println(array[number]);
        }
    }
}