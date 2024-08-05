package static1;

public class DataCountMain1 {

    public static void main(String[] args) {

        // 특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램
        // - 인스턴스 내부 변수에 카운트 저장 (실패)

        Data1 data1 = new Data1("A");
        System.out.println("A count=" + data1.count); // 1

        Data1 data2 = new Data1("B");
        System.out.println("B count=" + data2.count); // 1

        Data1 data3 = new Data1("C");
        System.out.println("C count=" + data3.count); // 1

    }

}
