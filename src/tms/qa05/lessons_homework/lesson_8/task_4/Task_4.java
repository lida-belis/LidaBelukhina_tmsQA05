package tms.qa05.lessons_homework.lesson_8.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//+
public class Task_4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("dog");
        strings.add("cat");
        strings.add("turtle");

        List<String> newStrings = Arrays.asList("cat", "frog", "dog");

        strings.retainAll(newStrings);

        System.out.println(strings);
    }
}
