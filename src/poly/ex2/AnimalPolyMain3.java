package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck(), new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

        // 문제
        // - 부모 클래스를 생성할 수 있다.
        // - 자식 클래스에서 메서드 오버라이딩을 하지 않을 수 있다. (Pig)

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
