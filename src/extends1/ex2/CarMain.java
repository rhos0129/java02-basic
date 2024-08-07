package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); // 부모클래스 Car로부터 상속받은 기능
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move(); // 부모클래스 Car로부터 상속받은 기능
        gasCar.fillUp();

    }

}
