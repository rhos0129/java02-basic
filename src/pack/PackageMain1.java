package pack;

public class PackageMain1 {

    public static void main(String[] args) {

        // 같은 패키지이므로 패키지 경로를 생략할 수 있다.
        Data data = new Data();

        // 다른 패키지이므로 패키지 전체경로를 포함해야 한다.
        pack.a.User user = new pack.a.User();

    }

}
