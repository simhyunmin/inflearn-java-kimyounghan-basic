package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        pack.a.User user = new pack.a.User();
    }
}


//같은 패키지에 있는 경우는 `Data`와 같이 바로 사용해도 된다.
//다른 패키지에 있는 경우는 `pack.a.User`처럼 패키지 명을 명시하거나
//또는 사전에 import를 통해 선언해주면 된다.