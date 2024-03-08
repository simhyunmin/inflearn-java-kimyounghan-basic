package static2;

import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        staticCall();
        staticCall();   //alt+enter -> add on demand~ 후에 import로 이 메서드를 고정적으로 사용한다고 선언
        staticCall();   //이후에 편하게 메서드 명으로만 사용할 수 있다 (static method만 가능)

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //인스턴스를 통한 접근
       // DecoData data3 = new DecoData();
       // data3.staticCall();   //관리상 안 좋은 코드이다. 왜냐면 정적 멤버 메서드인데 인스턴스 메서드처럼 보이기 때문이다.

    }
}


//Main() 에서 메서드를 사용할 때 static을 붙히는 이유는 Main()이 정적 메서드이기 때문에
//정적 메서드만 호출할 수 있기 때문이다.
