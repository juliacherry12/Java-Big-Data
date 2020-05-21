/* 9. Система Интернет-магазин. Администратор добавляет информацию о Товаре.
Клиент делает и оплачивает Заказ на Товары. Администратор регистрирует
Продажу и может занести неплательщиков в «черный список». */

public class LR3_V4_9 {
    public static void main(String[] args)
    {

        Administrator admin = new Administrator();
        Product bulochka = new Product("Булочка", 150);
        Order order = new Order();
        Client client = new Client();

        admin.createNewProduct("Булочка", 150);
        order.addProdToOrder(bulochka);
        client.basket(order);
        client.showOrderCl();
        System.out.println(bulochka.getNameProduct());
    }
}
