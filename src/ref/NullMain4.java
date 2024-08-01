package ref;

public class NullMain4 {

    public static void main(String[] args) {

        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count); // 0
        System.out.println("bigData.data = " + bigData.data); // ref.Data@27973e9b

        // NullPointerException 발생 X
        System.out.println("bigData.data.value = " + bigData.data.value); // 0

    }

}
