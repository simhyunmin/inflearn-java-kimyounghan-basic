package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);

        System.out.println("before: "+ s);
        System.out.println("after: "+ deco);
    }
}


//클래스 메서드
//메서드 앞에도 `static`을 붙일 수 있다. 이것을 정적 메서드 또는 클래스 메서드라 한다. 인스턴스 생성 없이 클래스 안에 정적 메서드를
//사용할 수 있기 때문에 편리하다.