package oop1;

public class AccountMain {

    public static void main(String[] args) {
        Account act = new Account();
        act.deposit(10000);
        act.withdraw(9000);
        act.withdraw(2000);
        System.out.println("잔고: "+act.balance);
    }
}
