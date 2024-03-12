package extends1.ex;

public class Movie extends Item{

    String director, actor;

    public Movie(String name, int price, String director, String actor) {
        super(price, name);

        this.director = director;
        this.actor = actor;
        sumPrice += price;
    }
    @Override
    void print(){
       super.print();
        System.out.println("- 감독:"+director+", 배우:"+actor);
    }
}
