package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {

        // 객체 지향 프로그램
        // 데이터와 기능을 모두 한 클래스에 담기 (캡슐화)
        // 음악 플레이어를 만들어서 제공하는 개발자와 음악 플레이어를 사용하는 개발자가 분리

        MusicPlayer player = new MusicPlayer();
        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();

    }

}
