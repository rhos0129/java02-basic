package ref;

public class VarChange1 {

    public static void main(String[] args) {

        // 기본형과 변수 대입
        int a = 10;
        int b = a; // a에 들어있는 값 10을 복사해서 b에 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경  a = 20");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10 (a 변경은 b와 상관없다)

        // b 변경
        b = 30;
        System.out.println("변경  b = 30");
        System.out.println("a = " + a); // 20 (b 변경은 a와 상관없다)
        System.out.println("b = " + b); // 30

    }

}
