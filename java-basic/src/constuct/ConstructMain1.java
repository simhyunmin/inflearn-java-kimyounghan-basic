package constuct;

import java.lang.reflect.Member;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1",15,90);
        MemberConstruct member2 = new MemberConstruct("user2",15,90);
        MemberConstruct member3 = new MemberConstruct();

        //생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
        //따라서 위 코드는 "클래스 생성" 출력문이
        //안뜨고 생성자 호출만 뜨는 것이다.

        MemberConstruct member4 = new MemberConstruct("user4", 15);
        MemberConstruct[] members = {member1, member2, member3, member4};
        for(MemberConstruct s : members){
            System.out.println("이름: "+s.name+" 나이: "+s.age+" 성적: "+s.grade);
        }
    }
}
