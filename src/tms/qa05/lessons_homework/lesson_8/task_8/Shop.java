package tms.qa05.lessons_homework.lesson_8.task_8;

import java.util.Objects;

public class Shop {
    private String name;
    private Integer ID;

    public Shop(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = this.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }
    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", ID=" + ID +
                '}';
    }
}

