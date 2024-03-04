package ref;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[n];
        for(int i = 0 ; i<n; i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.next();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int num = scanner.nextInt();

            productOrders[i] = createOrder(productName, price, num);
        }
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
