package tms.qa05.lessons_homework.lesson_4.task_3;

import tms.qa05.lessons_homework.lesson_4.task_1.Girl;

// не забывай форматировать код
public class GirlNum_2 { // GirlNum_2 -> надо переименовать
    public static void main(String[] args) {
        Girl[] arrayGirl = new Girl[4];
        arrayGirl [0] = new Girl("Lida", 20);
        arrayGirl[1] = new Girl("Lola", 18);
        arrayGirl[2] = new Girl("Lida", 20);
        arrayGirl[3] = new Girl("Lola", 18);
        int count = 0;

        for (int i = 0; i < arrayGirl.length; i++) {
// пустая строка не нужна
            for (int k = i + 1; k <arrayGirl.length; k++) {
                    if (arrayGirl[i].equals(arrayGirl[k])) {
                        count++;

                        System.out.println(arrayGirl[i].show() + " ; " + arrayGirl[k].show());
                    }
            }
        }
        System.out.println(count); // Вывод: кол-во совпадений = 2;
    }
}
