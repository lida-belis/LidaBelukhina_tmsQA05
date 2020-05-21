package tms.qa05.lessons_homework.lesson_7.task_4;

public class Task_4 {
    public static void main(String[] args) {
        String text = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";
        int count = 0;
        String wordAlert = "alert";
        String wordAdd = "add";
        String wordGood = "good";
        String wordPlan = "plan";
        String[] words = {wordAlert, wordAdd, wordGood, wordPlan};
//        for (int i = 0; i < words.length; i++) {
//            count = findWord(wordAlert, text);
//            System.out.println("The word 'alert' is contained in the text " + count + "time");
        }

    public static int findWord(String word, String text) {
        int count = 0;
        for (int i = 0; i < -1; i++) {
            i = text.indexOf(word, i);
            if (i == -1) {
                break;
            }
            count++;
        }
        return count;
    }

}


