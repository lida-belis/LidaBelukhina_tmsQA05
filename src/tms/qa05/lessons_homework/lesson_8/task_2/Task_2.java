package tms.qa05.lessons_homework.lesson_8.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int numberOfElements = 100;

        add(integers, numberOfElements);
        System.out.println(integers);

        removeEven(integers);
        System.out.println("==After==");
        System.out.println(integers);
    }

    private static void add(List<Integer> list, int numberOfElements) {
        for (int i = 0; i < numberOfElements; i++) {
            list.add(0, i);
        }
    }

    private static void removeOdd(List<Integer> list) {
        remove(list, false);
    }

    private static void removeEven(List<Integer> list) {
        remove(list, true);
    }

    private static void remove(List<Integer> list, boolean isEvenFlag) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            boolean isEven = next % 2 == 0;
            if (isEven == isEvenFlag) {
                iterator.remove();
            }
        }
    }
}
