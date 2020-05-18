package tms.qa05.lessons_homework.lesson_4.task_1;

import java.util.Objects;

public class Girl {
    private static String text = "Hello from static";

    private String name;
    private int age;

    public Girl() {
        this("Lida", 20);
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String show() {
        return "name = " + this.name + ";" + " age = " + this.age + ";";
    }

    public String showText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Girl girl = (Girl) o;
        return Objects.equals(name, girl.name) &&
                Objects.equals(age, girl.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

