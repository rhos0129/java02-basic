package memory;

public class JavaMemoryMain2 {

    // 스택 영역 - 스택 프레임 main
    public static void main(String[] args) {

        System.out.println("main start"); // 1
        method1();
        System.out.println("main end"); // 6

    }

    // 스택 영역 - 스택 프레임 method1 + 지역변수 data1 (x001)
    // 힙 영역 - Data 인스턴스(x001) 생성
    // method1()이 종료하여 스택 프레임이 제거되면
    // 지역 변수 data1도 함께 제거 Data 인스턴스를 참조하는 곳이 더는 없다.
    // >> GC(가비지 컬렉션)가 메모리에서 제거
    static void method1() {
        System.out.println("method1 start"); // 2
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method1 end"); // 5
    }

    // 스택 영역 - 스택 프레임 method2 + 지역변수 data2 (x001)
    static void method2(Data data2) {
        System.out.println("method2 start"); // 3
        System.out.println("data.value=" + data2.getValue());
        System.out.println("method2 end"); // 4
    }

}
