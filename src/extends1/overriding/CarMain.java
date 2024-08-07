package extends1.overriding;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 자식클래스에서 오버라이딩된 메서드 호출

        GasCar gasCar = new GasCar();
        gasCar.move(); // 부모클래스의 메서드 호출

    }

}
