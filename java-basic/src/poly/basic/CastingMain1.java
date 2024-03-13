package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        //다운캐스팅(부모타입 -> 자식 타입)
        //부모타입을 다운 캐스팅해서 자식 클래스의 메서드를 가져다 쓸 수 있는 방법
        Child child = (Child) poly;
        child.childMethod();
        //일시적으로 자식 타입으로 바꾸면 자식 메서드를 사용할 수 있다.

    }
}

//캐스팅
//*  업캐스팅 : 부모타입으로 변경
//*  다운캐스팅 : 자식타입으로 변경