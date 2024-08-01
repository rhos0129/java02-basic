package ref;

public class VarChange2 {

    public static void main(String[] args) {

        // 참조형과 변수 대입
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // dataA에 들어있는 참조값을 복사해서 dataB에 대입

        System.out.println("dataA 참조값 = " + dataA); // ref.Data@b4c966a
        System.out.println("dataB 참조값 = " + dataB); // ref.Data@b4c966a (dataA와 참조값 동일)
        System.out.println("dataA.value = " + dataA.value); // 10
        System.out.println("dataB.value = " + dataB.value); // 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // 20
        System.out.println("dataB.value = " + dataB.value); // 20 (dataA 변경이 dataB에 영향을 준다)

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // 30
        System.out.println("dataB.value = " + dataB.value); // 30

    }

}
