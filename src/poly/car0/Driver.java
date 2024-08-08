package poly.car0;

public class Driver {

    private K3Car k3Car;
    private Model3Car model3Car; // 추가

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) { // 추가
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null) { // 추가
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }

    // 자동차를 추가할 때마다 클라이언트 Driver의 코드를 변경해야한다.

}
