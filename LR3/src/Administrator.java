/* 9. Система Интернет-магазин. Администратор добавляет информацию о Товаре.
Клиент делает и оплачивает Заказ на Товары. Администратор регистрирует
Продажу и может занести неплательщиков в «черный список». */

import java.util.ArrayList;

public class Administrator {
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Client> blackСlients = new ArrayList<Client>();

    // регистрация товара и добавление неплательщиков в черный список
    public void registerOrder(Client client) {
        if (client.getOrder().isPayment()) {
            client.getOrder().setRegister(true);
        } else {
            blackСlients.add(client);
        }
    }

    // создание новых продуктов
    public void createNewProduct(String name, int price) {
        products.add(new Product(name,price));
    }
}
