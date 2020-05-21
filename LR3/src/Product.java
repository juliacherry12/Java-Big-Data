/* 9. Система Интернет-магазин. Администратор добавляет информацию о Товаре.
Клиент делает и оплачивает Заказ на Товары. Администратор регистрирует
Продажу и может занести неплательщиков в «черный список». */

public class Product {
    private String nameProduct; // Имя товара
    private int priceProduct;  // Стоимость товара

    public Product(String nameProduct, int priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public Product() {
    }

    // get'ры
    public String getNameProduct() {
        return nameProduct;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    // set'ры
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
