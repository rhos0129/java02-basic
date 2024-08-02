package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {

        // 다른 패키지에 같은 이름의 클래스가 있는 경우
        User userA = new User(); // 자주 사용하는 클래스는 import
        pack.b.User userB = new pack.b.User(); // 나머지는 전체 경로 작성

    }

}
