package tms.qa05.lessons_homework.lesson_8.task_7;

import java.util.Objects;

// +
public class Numbers implements Comparable<Numbers> {
    private int number;

    public Numbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return number == numbers.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "number=" + number +
                '}';
    }

    @Override
    public int compareTo(Numbers numbers) {
        return this.number - numbers.getNumber();
    }
}
