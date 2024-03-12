package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
        super(10);        //부모 생성자가 기본 생성자이면 생략 가능
        System.out.println("ClassB 생성자 a="+a);
    }
}



//생성자는 제일 최상위 클래스인 부모 클래스부터 생성된다.
//그 다음에 자식의 생성자가 차례로 생성된다.
