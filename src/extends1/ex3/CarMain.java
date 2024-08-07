package extends1.ex3;

public class CarMain {

    public static void main(String[] args) {

        // 모든 자동차에 openDoor() 추가
        // 새로운 자동차 HydrogenCar 추가

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor(); // 추가

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor(); // 추가

        // 추가
        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor(); // 추가

        // 상속 관계 덕분에 중복은 줄어들고 편리하게 확장할 수 있다.

    }

}
