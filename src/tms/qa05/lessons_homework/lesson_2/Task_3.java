package tms.qa05.lessons_homework.lesson_2;

public class Task_3 {
    public static void main(String[] args){
        int num_1 = 1;
        int num_2 = 1;
        for (int i = 1; i < 257; i++) {
            num_1 *= 2;
            num_2 += num_1;
            i = num_1;
        }
        System.out.println("Total = " + num_2);

    }

}
