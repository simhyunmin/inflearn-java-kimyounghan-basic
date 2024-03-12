package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1;
    //    defaultValue = 1; //다른 패키지라서 안됨
    //    privateValue = 1; //다른 패키지라서 안됨
        publicMethod();
        protectedMethod();
        //defaultMethod();  //다른 패키지라서 안됨
        //privateMethod();  //다른 패키지라서 안됨

        printParnet();   //public이라서 가능
    }
}
