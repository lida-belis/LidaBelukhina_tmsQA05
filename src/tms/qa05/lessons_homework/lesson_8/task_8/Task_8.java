package tms.qa05.lessons_homework.lesson_8.task_8;

import java.util.HashSet;
import java.util.Set;

public class Task_8 {
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();

        Shop shop = new Shop("Milla", 1);
        Shop departmentStore = new Shop("Green", 2);
        Shop groceryStore = new Shop("Green", 1);

        shops.add(shop);
        shops.add(departmentStore);
        shops.add(groceryStore);

        System.out.println(shops);
    }
}
