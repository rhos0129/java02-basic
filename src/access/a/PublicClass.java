package access.a;

// public 클래스는 하나만 가능 (파일명과 동일해야한다.)
public class PublicClass {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }

}

//  default 클래스는 무한히 만들 수 있다.
class DefaultClass1 {

}

class DefaultClass2 {

}
