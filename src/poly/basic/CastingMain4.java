package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {

        // 다형적 참조 O -> 부모, 자식 모두 생성
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;// 다운캐스팅 성공
        child1.childMethod(); // 실행 성공

        // 다형적 참조 X -> 자식없이 부모만 생성
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 다운캐스팅 실패 (런타임 오류 ClassCastException)
        child2.childMethod(); // 실행 실패

    }

}
