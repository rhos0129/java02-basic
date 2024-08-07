package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {

        // 부모 변수가 자식 인스턴스 참조
        Parent poly = new Child(); // x001

        // 부모는 자식의 기능은 호출할 수 없다.
//        poly.childMethod(); // 컴파일 오류

        // 부모 타입을 자식으로 변경하면 부모도 자식의 기능을 호출할 수 있다 (다운캐스팅)
        Child child = (Child) poly; // x001
        child.childMethod();

    }

}
