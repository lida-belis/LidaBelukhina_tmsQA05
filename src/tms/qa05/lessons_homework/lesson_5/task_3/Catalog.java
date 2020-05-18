package tms.qa05.lessons_homework.lesson_5.task_3;

import java.util.Arrays;

public class Catalog {
   public static void main(String[] args) {
      House[] catalog = {
              new CityHighRise(5, true, 40),
              new CityHighRise(10, true, 100),
              new CityHighRise(4, false, 40),
              new VacationHome(1, false, 4),
              new VacationHome(2, true, 3),
              new VacationHome(3, false, 4)
      };
      System.out.println(Arrays.toString(catalog));
   }
}
