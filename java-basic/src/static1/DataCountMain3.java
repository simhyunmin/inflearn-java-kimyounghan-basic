package static1;

import java.sql.SQLOutput;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count="+ Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("A count="+ Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count="+ Data3.count);

        //인스턴스를 통한 접근(권장x)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        //클래스를 통한 접근
        System.out.println(Data3.count);

    }
}



//멤버 변수는 static 유무에 따라 분류할 수 있다.
//인스턴스 변수: `static`이 붙지 않은 멤버 변수, 예)`name`
//  `static`이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있다
//  인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.
//클래스 변수: `static`이 붙은 멤버 변수, 예)`count`
  //클래스 변수, 정적 변수, `static` 변수 등으로 부른다. 용어를 모두 사용하니 주의
  //`static`이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다.
  //따라서 클래스 변수라 한다.
  // 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와는 다르게 보통 여러곳에서 공유하는 목적으로 사용된다.
