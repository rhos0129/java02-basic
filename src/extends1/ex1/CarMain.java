package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 공통
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 공통
        gasCar.fillUp();

        // ElectricCar, GasCar -> 자동차의 구체적인 개념

    }

}
