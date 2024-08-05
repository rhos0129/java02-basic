package static1;

public class Data3 {

    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++; // 인스턴스 생성할 때 마다 카운트 증가
    }

}
