package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}


//업캐스팅은 메모리상에 상위 부모 클래스까지 다 생성되는데
//다운캐스팅 경우에는 다 생성 안되는 경우가 존재할 수 있어 위험하다.
