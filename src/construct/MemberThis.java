package construct;

public class MemberThis {

    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
    // 맴버변수와 매개변수의 이름이 다르다면 this가 없어도 맴버변수에 접근할 수 있다.

}
