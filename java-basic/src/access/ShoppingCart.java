package access;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int nowTrayProductNum;

    void addItem(Item item){
        if(nowTrayProductNum >= items.length){
            items[nowTrayProductNum] = item;
            nowTrayProductNum++;
        }
    }

    void displayItems(){
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for(int i = 0 ; i<nowTrayProductNum; i++){
            System.out.println("상품명: "+items[i].getProduct()+" 합계: "+ items[i].getTotalPrice());
            sum += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합:"+sum);

    }
}
