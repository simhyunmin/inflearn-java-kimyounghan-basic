package access;

public class Item {
    private String product;
    private int price;
    private int num;

    Item(String product, int price, int num){
        this.num = num;
        this.price = price;
        this.product = product;
    }

    String getProduct(){
        return product;
    }

    int getPrice(){
        return price;
    }

    int getNum(){
        return num;
    }

    public int getTotalPrice(){
        return price * num;
    }

}
