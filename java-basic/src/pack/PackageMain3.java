package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }

}


//패키지 이름과 위치는 폴더(디렉토리)위치와 같아야 한다
//패키지 이름은 모두 소문자를 사용한다.
//패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.


//a, a.b, a.c
//이렇게 총 3개의 패키지가 계층 구조를 이루는 것 같아보이지만
//자바에서는 다른 패키지로 취급하므로
//a 패키지에서 a.b 패키지를 사용하려면 무조건 import를 써야한다.