package poly.overring;

public class OverridingMain {
    public static void main(String[] args) {
        Child child =  new Child();
        System.out.println("Child -> Child");
        System.out.println("value = "+ child.value);
        child.method();


        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = "+ parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = "+poly.value);
        poly.method();
        //변수는 오버라이딩이 안되고 메서드는 오버라이딩이 된다.
        //인스턴스 안에서 오버라이딩 된 메서드는 항상 우선권을 가진다.
        //따라서 부모 타입이어도 자식의 오버라이딩된 메서드가 실행되는 것
        //더 하위 자식에서 오버라이딩한 메서드가 우선권을 가진다.
    }
}
