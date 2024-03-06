package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지에서만 default 호출 가능
//        data.defaultField = 2;
//        data.defaultMethod();

//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}

//클래스 레벨의 접근 제어자 규칙
//* 클래스 레벨의 접근 제어자는 `public`, `default`만 사용할 수 있다.
//  * `private`, `protected`는 사용할 수 없다.
//* `public` 클래스는 반드시 파일명과 이름이 같아야 한다.
//  * 하나의 자바 파일에 `public`클래스는 하나만 등장할 수 있다.
//  * 하나의 자바 파일에 `default`접근 제어자를 사용하는 클래스는 무한정 만들 수 있다.

