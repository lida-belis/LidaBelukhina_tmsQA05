package tms.qa05.lessons_homework.lesson_4.task_1;

import java.util.Objects;

public class Girl {
    private static String text = "Hello from static";

    private String name;
    private int age;

    public Girl() {
// пустая строка не нужна
        this("Lida", 20);
    } // абзац
    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
// пустая строка не нужна
        return name;
    }// абзац
    public int getAge() {
// пустая строка не нужна
        return age;
    }// абзац
    public String show() {
        return "name = " + this.name + ";" + " age = " + this.age + ";";
    }// абзац
    public String showText() {
// пустая строка не нужна
        return text;
    }
    public void setText(String text) {
// пустая строка не нужна
        this.text = text;
    }// абзац
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

