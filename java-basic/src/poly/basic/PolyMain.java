package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();


        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        //자바에서 부모 타입은 자식 타입을 담을 수 있다.
        //반대로 자식은 부모를 담을 수 없다.
        //자식 인스턴스를 부모 타입에 담는다.
        //만약 Child 하위에 손자 타입이 있다면 손자도 가능
        //Parent poly = new Grandson();
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod()

        //하지만 downcasting을 통해 할 수 있다.




    }
}
