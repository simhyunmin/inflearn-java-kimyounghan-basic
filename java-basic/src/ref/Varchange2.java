package ref;

public class Varchange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값:"+dataA);
        System.out.println("dataB 참조값:"+dataB);

        dataA.value = 10;

        System.out.println("dataA 값:"+dataA.value);
        System.out.println("dataB 값:"+dataB.value);

        dataA.value = 20;

        System.out.println("dataA 값:"+dataA.value);
        System.out.println("dataB 값:"+dataB.value);

        dataB.value = 30;

        System.out.println("dataA 값:"+dataA.value);
        System.out.println("dataB 값:"+dataB.value);
    }
}
