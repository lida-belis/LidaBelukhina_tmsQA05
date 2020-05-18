package tms.qa05.lessons_homework.lesson_8.task_9;

import java.util.Comparator;

public class StudentSurnameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student student_2) {
        return student.getSurname().compareTo(student_2.getSurname());
    }
}
