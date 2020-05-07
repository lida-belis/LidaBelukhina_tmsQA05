package tms.qa05.lessons_homework.lesson_4.task_4;

import tms.qa05.lessons_homework.lesson_4.task_1.Girl;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Girl girl_1 = new Girl(); // girl_1 - надо переименовать
        Girl girl_2 = new Girl(); // girl_2 - надо переименовать

        System.out.println(girl.showText());

        girl_2.setText("Bye from static");

        System.out.println(girl_1.showText());
        System.out.println(girl_2.showText());
    }
}
