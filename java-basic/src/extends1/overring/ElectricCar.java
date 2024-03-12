package extends1.overring;

public class ElectricCar extends Car {


    public void charge(){
        System.out.println("충전합니다.");
    }

    @Override         //부모의 기능을 override 한거다라는 표식을 남기는 것 없어도 되지만
                      //있으면 유용하다.
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}


//만약 부모 클래스에 final을 붙힐 경우 더이상 못 고친다. 즉, 오버라이딩 할 수 없다.
