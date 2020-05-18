package tms.qa05.lessons_homework.lesson_8.task_8;

import java.util.Objects;

public class Shop {
    private String name;
    private Integer id;

    public Shop(String name, Integer ID) {
        this.name = name;
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(name, shop.name) &&
                Objects.equals(id, shop.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name=" + name +
                ", ID=" + id +
                '}';
    }
}

