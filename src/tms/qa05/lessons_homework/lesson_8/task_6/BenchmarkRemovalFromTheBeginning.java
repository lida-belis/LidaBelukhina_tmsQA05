package tms.qa05.lessons_homework.lesson_8.task_6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BenchmarkRemovalFromTheBeginning {
    public static void main(String[] args) {
        int count = 100_000;
        List<Integer> arrayIntegers = new ArrayList<>();
        add(arrayIntegers, count);
        long arrayIntegersTest = remove(arrayIntegers);
        System.out.println("ArrayList test time: " + arrayIntegersTest + " ms;");

        List<Integer> linkedIntegers = new LinkedList<>();
        add(linkedIntegers, count);
        long linkedIntegersTest = remove(linkedIntegers);
        System.out.println("LinkedList test time: " + linkedIntegersTest + " ms;");

    }

    private static void add(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(1);
        }
    }

    private static long remove(List<Integer> list){
        Long start = System.currentTimeMillis();
        while (list.size() > 0) {
            list.remove(0);
        }
        Long finish = System.currentTimeMillis();
        return finish - start;
    }
}
