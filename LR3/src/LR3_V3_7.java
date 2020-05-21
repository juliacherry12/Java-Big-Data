/* 7. Создать объект класса Дерево, используя классы Лист.
Методы: зацвести, опасть листьям, покрыться инеем, пожелтеть листьям. */

public class LR3_V3_7 {
    public static void main(String[] args)
    {

        Tree lipa = new Tree("Липа", "Липа не цветет", "Липа не замерзла");
        Tree klen = new Tree("Клен", "Клен не цветет", "Клен не замерз");

        System.out.println("Тип первого дерева: "+ lipa.getTypeTree());
        System.out.println("Тип второго дерева: "+ klen.getTypeTree());
        System.out.println("Зацвести: " + lipa.bloom());
        System.out.println("Покрыться инеем: " + lipa.frost());
        System.out.println("Опасть листьям: " + lipa.leafs.fallLeaf());
        System.out.println("Пожелтеть листьям: Цвет листьев -" + lipa.leafs.yellowLeaf());

        System.out.println(lipa.equals(klen));
        System.out.println(lipa.leafs.toString());
        System.out.println(klen.toString());
    }
}
