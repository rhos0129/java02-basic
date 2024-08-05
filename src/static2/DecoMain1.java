package static2;

public class DecoMain1 {

    public static void main(String[] args) {

        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1(); // 인스턴스 생성 필요
        String deco = utils.deco(s); // 인스턴스명으로 호출

        System.out.println("before: " + s);
        System.out.println("after: " + deco);

    }

}
