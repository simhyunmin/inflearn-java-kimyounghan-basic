package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        animalMove(cat);
        animalSound(cat);

        animalMove(dog);
        animalSound(dog);

        animalMove(caw);
        animalSound(caw);

    }

    private static void animalSound(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void animalMove(InterfaceAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
