package ref;

public class NullMain1 {

    public static void main(String[] args) {

        Data data = null;
        System.out.println("1. data = " + data); // null

        data = new Data();
        System.out.println("2. data = " + data); // ref.Data@4e50df2e

        data = null;
        System.out.println("3. data = " + data); // null
        // 앞선 ref.Data@4e50df2e는 더는 아무도 참조하지 않고, 다시 접근할 방법도 없다
        // -> JVM의 GC(가비지 컬렉션)이 해당 인스턴스를 자동으로 메모리에서 제거한다.

    }

}
