package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {

        // 다형성X, 역할과 구현 분리X

        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

    }

}
