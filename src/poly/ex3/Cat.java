package poly.ex3;

public class Cat extends AbstractAnimal {

    // 오버라이딩 하지 않으면 컴파일 오류 발생
    @Override
    public void sound() {
        System.out.println("냐옹");
    }

}
