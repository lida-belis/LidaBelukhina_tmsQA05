package tms.qa05.lessons_homework.lesson_4.task_4;

import tms.qa05.lessons_homework.lesson_4.task_1.Girl;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Girl lida = new Girl(); // girl_1 - надо переименовать
        Girl lola = new Girl(); // girl_2 - надо переименовать

        System.out.println(girl.showText());

        lola.setText("Bye from static");

        System.out.println(lida.showText());
        System.out.println(lola.showText());
    }
}
