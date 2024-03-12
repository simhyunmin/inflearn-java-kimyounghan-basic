package extends1.ex;

public class Book extends Item{

    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(price, name);
        this.author = author;
        this.isbn = isbn;
        sumPrice += price;
    }
    @Override
    void print(){
        super.print();
        System.out.println("- 저자:"+author+", isbn:"+isbn);
    }
}
