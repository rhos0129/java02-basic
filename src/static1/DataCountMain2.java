package static1;

public class DataCountMain2 {

    public static void main(String[] args) {

        // 특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램
        // - 외부 인스턴스에 카운트 저장 (성공)

        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count); // 1

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count=" + counter.count); // 2

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count=" + counter.count); // 3

        // 불편한 점
        // - Data2 클래스와 관련된 일인데, Counter 라는 별도의 클래스를 추가로 사용해야 한다.
        // - 생성자의 매개변수도 추가되고, 생성자도 생성자를 호출하는 부분도 복잡해진다.

    }

}
