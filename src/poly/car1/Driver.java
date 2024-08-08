package poly.car1;

public class Driver {

    private Car car; // 인터페이스(역할)에만 의존

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }

    // 자동차를 추가해도 클라이언트 Driver의 코드는 변경되지 않는다.

}
