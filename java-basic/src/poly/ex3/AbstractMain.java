package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        animalSound(cat);
        animalSound(dog);
        animalSound(caw);




    }

    private static void animalSound(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        ;
        System.out.println("동물 소리 테스트 종료");
    }
}
