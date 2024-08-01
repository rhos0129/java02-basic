package oop1;

public class ValueObject {

    // 데이터 (맴버변수)
    int value;

    // 기능 (메서드)
    void add() { // static 키워드 없음
        value++; // 기본으로 본인 인스턴스에 있는 멤버 변수에 접근
        System.out.println("숫자 증가 value=" + value);
    }

}
