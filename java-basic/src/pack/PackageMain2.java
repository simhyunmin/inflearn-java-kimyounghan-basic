package pack;

import pack.a.User;
import pack.a.User2;

//다른 패키지에 있는 클래스를 모두 가져오고 싶으면
//import pack.a.* 이라는 표현을 쓰면 된다.

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
    }
}
