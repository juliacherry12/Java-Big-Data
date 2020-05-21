/* 7. Создать объект класса Дерево, используя классы Лист.
Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям. */
import java.util.Objects;

public class Leaf {
    public String leaf = "Лист на дереве";
    public String color = "Зеленый";

    public Leaf(String leaf, String color) {
        this.leaf = leaf;
        this.color = color;
    }

    public Leaf() {
    }

    // get'ры
    public String getLeaf() {
        return leaf;
    }

    public String getColor() {
        return color;
    }

    // set'ры
    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод "Опасть листьям"
    public String fallLeaf() {
        return Leaf.this.leaf = "Листья опали";
    }

    // Метод "Пожелтеть листьям"
    public String yellowLeaf() {
        return Leaf.this.color = "Желтый";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leaf leaf1 = (Leaf) o;
        return Objects.equals(leaf, leaf1.leaf) &&
                Objects.equals(color, leaf1.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaf, color);
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "leaf='" + leaf + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
