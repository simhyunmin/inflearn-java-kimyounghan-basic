package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        //Child 인스턴스인 경우 childMethod() 실행
        if(parent instanceof  Child child){  //다운 캐스팅 바로 해줄 수 있다.
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
