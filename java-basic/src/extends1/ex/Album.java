package extends1.ex;

public class Album extends Item {

    String artist;

    public Album(String name, int price, String artist) {
        super(price, name);
        this.artist = artist;
        sumPrice += price;
    }

    @Override
    void print(){
        super.print();
        System.out.println("- 아티스트:"+artist);
    }
}
