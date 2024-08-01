package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {

        // 절차 지향 프로그램
        // 각각의 기능을 메서드로 추출 (모듈화)

        MusicPlayerData data = new MusicPlayerData();
        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 증가
        volumeUp(data);
        //볼륨 감소
        volumeDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);

        // 장점
        // - 중복 제거, 기능 변경시 영향 범위 감소, 메서드 이름을 통해 가독성 증가
        // 한계
        // - 데이터와 그 데이터를 사용하는 기능은 매우 밀접하게 연관되어 있는데 분리 되어 있다.
        // - 유지보수 관점에서도 관리 포인트가 2곳으로 늘어난다.

    }

    // 기능, 메서드
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

}
