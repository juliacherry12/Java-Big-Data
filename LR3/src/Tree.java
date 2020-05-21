/* 7. Создать объект класса Дерево, используя классы Лист.
Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям. */

public class Tree {
    private String typeTree = "Тип дерева не указан";
    private String bloomsTree = "Дерево не цветет";
    private String frostTree = "Дерево не покрыто инеем";

    public Leaf leafs = new Leaf();

    public Tree(String typeTree, String bloomsTree, String frostTree) {
        this.typeTree = typeTree;
        this.bloomsTree = bloomsTree;
        this.frostTree = frostTree;
    }

    public Tree() {
    }

    // set'ры
    public void setTypeTree(String typeTree) {
        this.typeTree = typeTree;
    }

    public void setBloomsTree(String bloomsTree) {
        this.bloomsTree = bloomsTree;
    }

    public void setFrostTree(String frostTree) {
        this.frostTree = frostTree;
    }

    // get'ры

    public String getTypeTree() {
        return typeTree;
    }

    public String getBloomsTree() {
        return bloomsTree;
    }

    public String getFrostTree() {
        return frostTree;
    }

    // Метод "Зацвести"
    public String bloom()
    {
        return Tree.this.bloomsTree = "Дерево цветет";
    }

    // Метод "Покрыться инеем"
    public String frost()
    {
        return Tree.this.frostTree = "Дерево покрылось инеем";
    }

    @Override
    public String toString() {
        return "Tree{" +
                "typeTree='" + typeTree + '\'' +
                ", bloomsTree='" + bloomsTree + '\'' +
                ", frostTree='" + frostTree + '\'' +
                '}';
    }
}
