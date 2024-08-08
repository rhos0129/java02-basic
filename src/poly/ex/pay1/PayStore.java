package poly.ex.pay1;

public abstract class PayStore {

    // 결제 수단 이름으로 실제 결제 수단 구현체를 찾는 기능
    public static Pay findPay(String option) { // static
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else { // 결제 수단을 찾지 못했을 때
            return new DefaultPay(); // null 체크 대신 항상 실패하는 결제수단인 DefaultPay 사용
        }
    }

}
