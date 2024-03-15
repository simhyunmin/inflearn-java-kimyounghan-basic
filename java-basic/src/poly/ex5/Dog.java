package poly.ex5;


//Alt + Enter 를 통해 구현해야하는 abstract 메서드의 형태를 만들 수 있음
public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
