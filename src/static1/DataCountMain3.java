package static1;

public class DataCountMain3 {

    public static void main(String[] args) {

        // 특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램
        // - 카운트에 static 적용

        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count); // 1

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count); // 2

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count); // 3

        // 인스턴스를 통한 접근 -> 추천X (인스턴스 변수에 접근하는 것 처럼 오해할 수 있다.)
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근 -> 추천O (클래스를 통해서 접근하는 것이 더 명확하다.)
        System.out.println(Data3.count);

    }

}
