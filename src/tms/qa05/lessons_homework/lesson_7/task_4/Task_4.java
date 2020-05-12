package tms.qa05.lessons_homework.lesson_7.task_4;

public class Task_4 {
    public static void main(String[] args) {
        String string = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";

        /*
        String[] words = {alertSearch, ...};
        for (int i = 0; i < words.length; i++ {
             countWord = findWord(alertSearch, text);
             System.out.println("Слово 'alert' содердится с тексте " + countWord + " раз");
        }
        */
        
        String wordAlert = "alert";
        boolean isAlert = string.contains("alert");
        System.out.print(isAlert + ": ");
        System.out.println(string.indexOf(wordAlert));

        String wordAdd = "add";
        boolean isAdd = string.contains("add");
        System.out.print(isAdd + ": ");
        System.out.println(string.indexOf(wordAdd));

        String wordGood = "good";
        boolean isGood = string.contains("good");
        System.out.print(isGood + ": ");
        System.out.println(string.indexOf(wordGood));

        String wordPlan = "plan";
        boolean isPlan = string.contains("plan");
        System.out.print(isPlan + ": ");
        System.out.println(string.indexOf(wordPlan));
    }
    // я пыталась! к сожалению не знаю как вывести кол-во!
    
    /*
    метод indexOf() имеет два варианта, один принимает в качестве аргумента индекс, это позволит тебе перемещаться по тексту
    
    public static void Schet(String Word, String text) { //Schet -> schet + название должно быть на англ
        int countWord = 0;

        for (int i = 0; i> -1; i++) {
            i = text.indexOf(Word, i); 
            if (i == -1) {
                break;
            }

            countWord++;
        }
        System.out.println("Колличество слова " + Word + " в тексте = " + countWord);
    }
    
    это один из вариантов как можно было реализовать подсчет. Метод я скопировал у твоих одногрупников, не стесняйся обращаться
    к ним за помощью, я уверен они помогут
    */
}

