package access;

public class SpeakerMain {

    public static void main(String[] args) {

        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근하여 volume의 값을 200으로 설정 -> 고장
        // -> volume 필드의 외부 접근을 막을 수 있는 방법이 필요
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // 컴파일 오류 (private 접근)
        speaker.showVolume();

    }

}
