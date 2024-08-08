package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(duck);

        // 상속관계를 통한 다형적참조, 메서드오버라이딩 덕분에
        // 메서드를 활용하여 중복코드를 제거할 수 있다.

    }


    // 매개변수가 부모타입
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");

    }

}