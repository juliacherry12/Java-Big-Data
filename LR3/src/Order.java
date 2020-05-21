/* 9. Система Интернет-магазин. Администратор добавляет информацию о Товаре.
Клиент делает и оплачивает Заказ на Товары. Администратор регистрирует
Продажу и может занести неплательщиков в «черный список». */

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> listOrder = new ArrayList<Product>();    // список товаров в заказе
    private boolean paymentOrder = false;    // оплата заказа
    private boolean registerOrder = false;   // обработка заказа Администратором

    public Order(ArrayList<Product> listOrder, boolean paymentOrder, boolean registerOrder) {
        this.listOrder = listOrder;
        this.paymentOrder = paymentOrder;
        this.registerOrder = registerOrder;
    }

    public Order() {
    }

    // get'ры
    public ArrayList<Product> getListOrder() {
        return listOrder;
    }

    public boolean isPaymentOrder() {
        return paymentOrder;
    }

    public boolean isRegisterOrder() {
        return registerOrder;
    }

    // set'ры
    public void setListOrder(ArrayList<Product> listOrder) {
        this.listOrder = listOrder;
    }

    public void setPaymentOrder(boolean paymentOrder) {
        this.paymentOrder = paymentOrder;
    }

    public void setRegisterOrder(boolean registerOrder) {
        this.registerOrder = registerOrder;
    }

    // добавление списка товаров в заказ
    public void addProdToOrder(ArrayList<Product> listOrder) {
        this.listOrder = listOrder;
    }

    // добавление товара в заказ
    public void addProdToOrder(Product product) {
        listOrder.add(product);
    }

    // вывести заказ
    public void showOrder() {
        for (Product elem: listOrder) {
            System.out.println (elem);
        }
    }

    // проверка оплаты
    public boolean isPayment() {
        return paymentOrder;
    }

    // оплачен ли? Ответы: да/нет
    public void setPayment(boolean state) {
        paymentOrder = state;
    }

    // проверка обработки Администратором
    public boolean isRegister() {
        return registerOrder;
    }

    // обработан ли? Ответы: да/нет
    public void setRegister(boolean state) {
        registerOrder = state;
    }
}
