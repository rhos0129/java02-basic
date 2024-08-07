package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child; // 부모 타입으로 변경 (업캐스팅)
        Parent parent2 = child; // 업캐스팅은 생략 권장

        parent1.parentMethod();
        parent2.parentMethod();

    }

}
