package poly.ex5;

public interface InterfaceAnimal { // 인터페이스

    // 필드 -> 모두 상수
    public static final double MY_X = 1.23;
    double MY_Y = 4.56; // public static final 생략 권장

    // 메서드 -> 모두 추상메서드
    public abstract void sound();
    void move();  // public abstract 생략 권장

}
