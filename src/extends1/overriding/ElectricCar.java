package extends1.overriding;

public class ElectricCar extends Car {

    @Override // 오버라이딩 조건을 만족시키지 않으면 컴파일 에러 발생
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }

}
