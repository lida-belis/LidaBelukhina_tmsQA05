package tms.qa05.lessons_homework.lesson_2;

public class Task_1 {
    public static void main(String[] args) {
        double firstDay = 10;
        double dailyRate = 10;
        double allDistance = 0;
            for (int day = 1; day < 7; day++) {
                firstDay = firstDay * 1.1;
                allDistance =allDistance +firstDay;
            }
            allDistance = allDistance + dailyRate;

            System.out.println("7 day =" + allDistance + "km" );
    }
}
