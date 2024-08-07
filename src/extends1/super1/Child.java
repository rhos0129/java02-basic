package extends1.super1;

public class Child extends Parent {

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); // 본인 타입
        System.out.println("super value = " + super.value); // 부모 타입

        this.hello(); // 본인 타입
        super.hello(); // 부모 타입
    }

}
