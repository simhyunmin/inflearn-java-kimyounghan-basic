package extends1.super1;


import extends1.super1.Parent;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello(){
        System.out.println("child hello");
    }

    public void call(){
        System.out.println("this value = "+ value);
        System.out.println("super value = "+super.value); //super는 부모 클래스에서 찾는 키워드이다.
        hello();
        super.hello();
    }
}
