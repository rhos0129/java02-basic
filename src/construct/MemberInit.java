package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    // 초기값 설정
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    // 매개변수와 맴버변수 명이 동일하면 메소드 내부에서는 가까운 스코프인 매개변수가 더 우선순위를 가진다.
    // 이때 맴버 변수에 접근하기 위해 this 키워드를 이용한다.

}
