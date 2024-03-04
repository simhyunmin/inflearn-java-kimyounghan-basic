package ref;

public class NullMain3 {
    public static void main(String[] args) {
        Bigdata bigData = new Bigdata();
        bigData.data = new Data();
        System.out.println("bigData.count="+bigData.count);
        System.out.println("bigData.data="+bigData.data);
        System.out.println("bigData.value"+bigData.data.value);

    }

}
