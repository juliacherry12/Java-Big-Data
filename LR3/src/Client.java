/* 9. Система Интернет-магазин. Администратор добавляет информацию о Товаре.
Клиент делает и оплачивает Заказ на Товары. Администратор регистрирует
Продажу и может занести неплательщиков в «черный список». */

public class Client {
    private Order order; // Заказ

    public Client(Order order) {
        this.order = order;
    }

    public Client() {
    }

    // сделать Заказ
    public void basket(Order order) {
        this.order = order;
    }

    // get'ры
    public Order getOrder() {
        return order;
    }

    // set'ры
    public void setOrder(Order order) {
        this.order = order;
    }

    // демонстрация Заказа
    public void showOrderCl() {
        System.out.println("Вы заказали: ");
        order.showOrder();
    }

    // оплата Заказа
    public void pay() {
        if(order.isPayment()) {
            System.out.println("Вы уже оплатили заказ");
        } else {
            order.setPayment(true);
        }
    }

    // забрать Заказ
    public void take() {
        if(!order.isPayment()) {
            System.out.println("Оплатите, пожалуйста, заказ");
        } else if(!order.isRegister()) {
            System.out.println("Ваша заявка, к сожалению, не обработана Администратором");
        } else {
            System.out.println("Спасибо за покупку! Ждем Вас ещё!");
        }
    }
}
