package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {

        // 데이터와 기능이 모두 클래스에 정의

        ValueObject valueObject = new ValueObject();
        valueObject.add();
        valueObject.add();
        valueObject.add();
        System.out.println("최종 숫자 = " + valueObject.value);

    }

}
