package constuct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(){
        System.out.println("클래스 생성");
    }
    
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age){
        this(name,age,50);
    }
}


//반환 타입이 없다.