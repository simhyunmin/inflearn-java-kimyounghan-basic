package constuct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter;   //nameField에 this가 생략되어 있다.
    }
}
