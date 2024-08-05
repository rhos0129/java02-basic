package memory;

public class JavaMemoryMain1 {

    // 스택 영역 - 스택 프레임 main
    public static void main(String[] args) {

        System.out.println("main start"); // 1
        method1(10);
        System.out.println("main end"); // 6

    }

    // 스택 영역 - 스택 프레임 method1와 지역변수 m1, cal
    static void method1(int m1) {
        System.out.println("method1 start"); // 2
        int cal = m1 * 2;
        method2(cal);
        System.out.println("method1 end"); // 5
    }

    // 스택 영역 - 스택 프레임 method2 + 지역변수 m2
    static void method2(int m2) {
        System.out.println("method2 start"); // 3
        System.out.println("method2 end"); // 4
    }

}
