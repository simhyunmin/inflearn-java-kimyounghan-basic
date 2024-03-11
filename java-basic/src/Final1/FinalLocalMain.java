package Final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //이미 할당한 거기 때문에 할당 불가능

        //final 지역 변수2
        final int data2 = 10;
    }

    static void method(final int parameter){
        //parameter = 20; //지역 변수로 넘어온 parameter를 수정할 수가 없다.
    }
}
