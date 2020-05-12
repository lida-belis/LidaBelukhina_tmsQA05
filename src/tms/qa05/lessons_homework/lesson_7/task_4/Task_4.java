package tms.qa05.lessons_homework.lesson_7.task_4;

public class Task_4 {
    public static void main(String[] args) {
        String string = "While major gameplay components are already in place and functioning,\n" +
                "players help is needed to add some of the smaller features and content.\n" +
                "Of course polishing the overall experience is important at the same time.\n" +
                "Game has been extensively tested in closed group, but it is always important to hear fresh suggestions\n" +
                "from larger crowd that come from various gaming backgrounds.\n" +
                "Plan is to make the game as good as possible but without compromising the core idea.";

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
}

