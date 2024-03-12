package extends1.overring;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
    }

}


//자바는 다중 상속 지원 안해준다.
//부모의 부모, 자식의 자식 이런거는 가능함
//하지만 하나의 클래스가 여러개의 부모 클래스를 가지는 것은 안된다.
//부모 클래스 Car를 상속하는 자식 클래스 electricCar를 생성하면
//electricCar뿐만 아니라 Car까지 포함해서 인스턴스가 생성된다.
//상속한다고 단순히 메서드와 필드만 물려받는 게 아니다
//상속 관계를 사용하면 부모 클래스도 함께 포함해서 생성된다.



//오버라이딩(Overriding)
//:부모 클래스의 메서드의 동작 방법을 변경(재변경)하여 우선적으로 사용하고 싶을 때 사용한다.
