package poly.ex.sender;

public class SendMain {

    public static void main(String[] args) {

        // 한번에 여러 곳에 메시지를 발송하는 프로그램을 개발하자
        // - 다형성을 활용하세요.
        // - Sender 인터페이스를 사용하세요.
        // - EmailSender , SmsSender , FaceBookSender 를 구현하세요

        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }

    }

}