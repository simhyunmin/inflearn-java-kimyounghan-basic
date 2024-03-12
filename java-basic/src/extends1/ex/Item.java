package extends1.ex;

public class Item {
    private String name;
    private int price;
    static int sumPrice;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }



    void print(){
        System.out.println("이름:"+name+", 가격:"+price);
    }


}
