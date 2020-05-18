package tms.qa05.lessons_homework.lesson_8.task_7;

import java.util.Set;
import java.util.TreeSet;

public class NumbersMain {
    public static void main(String[] args) {
        Set<Numbers> treeSet = new TreeSet<>();
        int numberOfElements = 5;
        treeSet.add(new Numbers(5));
        treeSet.add(new Numbers(4));
        treeSet.add(new Numbers(3));
        treeSet.add(new Numbers(2));
        treeSet.add(new Numbers(1));

        System.out.println(treeSet);
    }
}
