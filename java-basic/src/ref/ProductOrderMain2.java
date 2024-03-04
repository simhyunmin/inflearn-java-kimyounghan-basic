package ref;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

        printOrders(productOrders);

        getTotalAmount(productOrders);

    }
    static ProductOrder createOrder(String name, int price, int num){
        ProductOrder product = new ProductOrder();
        product.productName = name;
        product.price = price;
        product.quantity = num;
        return product;
    }
    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    static void getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders){
            totalAmount+= order.price;
        }
        System.out.println("총 결제 금액: "+totalAmount);
    }


}
