package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() { // public
        System.out.println("publicMethod 호출 " + publicField);
    }

    void defaultMethod() { // default
        System.out.println("defaultMethod 호출 " + defaultField);
    }

    private void privateMethod() { // private
        System.out.println("privateMethod 호출 " + privateField);
    }

    // public이므로 어디서든 호출 가능
    // private이든 default든 상관없이 모든 필드와 메서드에 접근할 수 있다.
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
