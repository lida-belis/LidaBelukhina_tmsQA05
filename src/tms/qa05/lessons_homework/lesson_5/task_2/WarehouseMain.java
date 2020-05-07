package tms.qa05.lessons_homework.lesson_5.task_2;

import java.util.Arrays;

public class WarehouseMain {
    public static void main(String[] args) {
        int[] newArray = {2, 4, 6, 8};
        Warehouse warehouse = new Warehouse((newArray));

        newArray[0] = 93;
        System.out.println(warehouse);

        warehouse.next();

        int[] anotherArray = warehouse.getArray();
        System.out.println(Arrays.toString(anotherArray));
    }
}
