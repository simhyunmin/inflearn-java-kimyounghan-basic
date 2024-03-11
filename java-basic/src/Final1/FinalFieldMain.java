package Final1;

public class FinalFieldMain {

    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit2.value);
        System.out.println(constructInit1.value);

        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //뭔가 동일한 인스턴스가 3개 생성되는 느낌이다
        //이럴 때 static final을 활용하면 코드를 한 줄로 줄일 수 있다.

        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);

    }
}
