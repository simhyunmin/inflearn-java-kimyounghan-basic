package poly.diamond;


public class AbstractAnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        animalSound(dog);
        animalSound(bird);
        animalSound(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
       //flyAnimal(dog);    //fly implements가 없기 때문에 안됨

    }

    private static void animalSound( AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void animalMove(AbstractAnimal animal){
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
