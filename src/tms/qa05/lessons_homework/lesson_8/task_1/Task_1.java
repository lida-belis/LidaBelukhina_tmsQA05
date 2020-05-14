package tms.qa05.lessons_homework.lesson_8.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<>();

        listOfName.add("Lida");
        listOfName.add("Vladimir");
        listOfName.add("Irina");
        listOfName.add("Yaroslav");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Person: " );
        String string = scanner.next();

        System.out.println("Can pass: " + listOfName.contains(string));
    }
}
