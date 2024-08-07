package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속관계이므로 접근 가능
//        defaultValue = 1; // 컴파일 오류 (다른 패키지)
//        privateValue = 1; // 컴파일 오류

        publicMethod();
        protectedMethod(); // 상속관계이므로 접근 가능
//        defaultMethod(); // 컴파일 오류 (다른 패키지)
//        privateMethod(); // 컴파일 오류

        printParent();
    }

}
