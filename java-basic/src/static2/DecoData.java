package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++;   //인스턴스가 생성되지 않은 상태에서 인스턴스 변수를 활용하면 참조해야될 값을 모르기 때문에 에러 발생
        //instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++;           //내부적으로 작동하는 것이므로 인스턴스 변수를 사용하는 게 가능하다.
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();   //정적 메서드이지만 참조값을 받아서 쓰는 것이기 때문에 이렇게 사용 가능하다.
    }

    private void instanceMethod(){
        System.out.println("instatnceValue = "+ instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = "+staticValue);
    }
}


//멤버 메서드의 종류
// 인스턴스 메서드 : `static`이 붙지 않은 멤버 메서드
// 클래스 메서드: `static`이 붙은 멤버 메서드
//     클래스 메서드, 정적 메서드, `static` 메서드 등으로 부른다.

//`static`이 붙지 않은 멤버 메서드는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 메서드라 한다.
//`static`이 붙은 멤버 메서드는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서
//클래스 메서드라 한다.

//정적 메서드 활용
//정적 메서드는 객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용됨.
//따라서 클래스 내부에서 인스턴스 메서드를 활용할 수 없고 참조값이 주어진 경우에 한에서 사용할 수 있다.
//인스턴스 변수 또한 정적 메서드에서 활용할 대 인스턴스 메서드와 같은 원리가 적용된다.

