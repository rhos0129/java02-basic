package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {

        // 은행 계좌를 객체로 설계하고 사용하는 프로그램을 작성해라.

        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); // 오류 메시지 출력
        System.out.println("잔고: " + account.balance);

    }

}
