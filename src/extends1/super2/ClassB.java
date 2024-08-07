package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); // this(...)를 사용하더라도 중간에 반드시 한번은 super(...)를 호출해야한다.
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
//        super(); // 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }

}
