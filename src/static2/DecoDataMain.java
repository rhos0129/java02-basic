package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {

        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // staticValue = 1

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall(); // staticValue = 2

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall(); // staticValue = 3

        // 인스턴스를 통한 접근 -> 추천X (인스턴스 변수에 접근하는 것 처럼 오해할 수 있다.)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근 -> 추천O (클래스를 통해서 접근하는 것이 더 명확하다.)
        DecoData.staticCall();

    }
}
