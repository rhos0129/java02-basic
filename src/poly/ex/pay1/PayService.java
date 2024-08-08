package poly.ex.pay1;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }

    // 결제수단을 추가해도 클라이언트 PayService는 코드 변경이 없다.
    // 단, PayStore는 코드 변경이 필요하다.

}