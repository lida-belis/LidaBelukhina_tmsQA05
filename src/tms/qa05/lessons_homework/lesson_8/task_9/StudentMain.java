package tms.qa05.lessons_homework.lesson_8.task_9;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        StudentSurnameComparator surnameComparator = new StudentSurnameComparator();
        Comparator<Student> studentComparator = surnameComparator.thenComparing(new StudentsNameComparator());

        Set<Student> students = new TreeSet<>(studentComparator);
        students.add(new Student("Lida", "Belukhina", 19));
        students.add(new Student("Jana", "Razymova", 19));
        students.add(new Student("Irina", "Belukhina", 35));

        System.out.println(students);
    }
}
