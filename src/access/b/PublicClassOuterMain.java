package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();

        // 다른 패키지이므로 접근 불가 (컴파일 오류)
//        DefaultClass1 class1 = new DefaultClass1();
//        DefaultClass2 class2 = new DefaultClass2();

    }

}
