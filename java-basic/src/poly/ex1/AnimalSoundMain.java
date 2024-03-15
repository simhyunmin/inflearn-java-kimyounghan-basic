package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();        //introduce variable 키 ctrl+alt+V
        Caw caw = new Caw();

        call(dog);
        call(cat);
        call(caw);


    }

    private static void call(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
