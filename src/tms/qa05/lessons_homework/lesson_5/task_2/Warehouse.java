package tms.qa05.lessons_homework.lesson_5.task_2;

import java.util.Arrays;

public class Warehouse {
    private int[] array;

    public Warehouse(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public String toString() {
        return "Array{ " + Arrays.toString(array);
    }

    public void next() {
        for (int i = 0; i <= array.length; i++) {
            if (i == array.length) {
                System.out.println(array[0]);
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public int[] getArray() {
        return array;
    }
}
