package access;

public class Speaker {

    // 스피커 객체
    // - 음량을 높이고, 내리고, 현재 음량을 확인할 수 있는 단순한 기능을 제공
    // - 스피커의 음량은 절대로 100을 넘으면 안된다. (100을 넘어가면 스피커의 부품들이 고장난다.)

    int volume;

    Speaker(int volume) { // 생성자를 통해 초기 음량 값을 지정
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }

}
