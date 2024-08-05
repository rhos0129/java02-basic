package static2;

public class DecoUtil2 {

    // 특정 문자열을 꾸며주는 간단한 기능 (static 메서드)
    public static String deco(String str) { // static 적용
        String result = "*" + str + "*";
        return result;
    }

}
