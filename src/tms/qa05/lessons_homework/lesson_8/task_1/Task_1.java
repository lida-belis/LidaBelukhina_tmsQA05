package tms.qa05.lessons_homework.lesson_8.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        List<String> listOfName = new ArrayList<>();

        listOfName.add("lida");
        listOfName.add("vladimir");
        listOfName.add("irina");
        listOfName.add("yaroslav");

        GettingAName(listOfName);
    }

    public static void GettingAName(List<String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Person: " );

        String name = scanner.next().toLowerCase();
        System.out.println("Can pass: " + list.contains(name));
    }
}
