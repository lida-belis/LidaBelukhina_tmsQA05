package tms.qa05.lessons_homework.lesson_8.task_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        / заполнение в отдельный метод
        for (int i = 0; i <= 100; i++) {
            integers.add(0, i);
        }
        System.out.println(integers);

        / удаление в отдельный метод
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("==After==");
        System.out.println(integers);
    }
}
