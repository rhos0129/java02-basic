package ref;

public class MethodChange2 {

    public static void main(String[] args) {

        // 참조형과 메서드 호출
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
        System.out.println("dataA=" + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
    }

    static void changeReference(Data dataX) {
        System.out.println("dataX=" + dataX); // dataA와 동일한 참조값
        dataX.value = 20; // dataA에도 영향을 준다
    }

}
