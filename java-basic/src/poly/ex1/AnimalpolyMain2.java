package poly.ex1;

public class AnimalpolyMain2 {
    public static void main(String[] args) {
        //introduce variable 키 ctrl+alt+V
        //inline variable 키 ctrl+alt+N
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for(Animal animal : animalArr){
            animalSound(animal);
        }
    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        ;
        System.out.println("동물 소리 테스트 종료");
    }
} 
