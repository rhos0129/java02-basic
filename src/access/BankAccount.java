package access;

public class BankAccount {

    // private - 데이터는 모두 숨김
    private int balance;

    // private - 데이터는 모두 숨김
    public BankAccount() {
        balance = 0;
    }

    // public
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않음 금액이거나 잔액이 부족합니다.");
        }
    }

    // public
    public int getBalance() {
        return balance;
    }

    // private - 내부에서만 필요
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }

}
