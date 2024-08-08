package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck(); // 추가
        Animal[] animalArr = {dog, cat, cow, duck};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }

        // 배열과 for문으로도 중복코드를 제거할 수 있다.
        // 동물을 추가해도 코드변경이 많지 않다.

    }

}
