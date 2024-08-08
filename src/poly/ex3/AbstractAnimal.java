package poly.ex3;

public abstract class AbstractAnimal { // 추상 클래스

    public abstract void sound(); // 추상 메서드

    // 추상 메서드 X
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
