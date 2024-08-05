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

    }

}
