package tms.qa05.lessons_homework.lesson_7.task_6;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        String[] words = {"Green", "Warm", "Food", "Wine",  };
        int filteredArraySize = 0;

        // эту логику в отдельный метод
        for (int i = 0; i < words.length; i++) {
            if (words[i].toUpperCase().startsWith("W")) {
                filteredArraySize++;
            }
        }
        
        // эту логику в отдельный метод
        String[] findWords = new String[filteredArraySize];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].toUpperCase().startsWith("W")) {
                findWords[count] = words[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(findWords));
    }
}
