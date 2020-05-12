package tms.qa05.lessons_homework.lesson_7.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        String[] words = {"Green", "Warm", "Food", "Wine",  };
        int array = 0; // array -> filteredArraySize
        int k = 0; // k - стоит переименовать

        // эту логику в отдельный метод
        for (int i = 0; i < words.length; i++) {
            if (words[i].toUpperCase().startsWith("W")) {
                array++;
            }
        }
        
        // эту логику в отдельный метод
        String[] findWords = new String[array];
        for (int i = 0; i < words.length; i++) {
            if (words[i].toUpperCase().startsWith("W")) {
                findWords[k] = words[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(findWords));
    }
}
