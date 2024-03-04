package oop1;

public class Account {
    int balance = 0;

    void deposit(int amount){
        balance+=amount;
    }

    void withdraw(int amount) {
       if((balance-amount) <0){
            System.out.println("잔액 부족");
            return;
        }
        balance -= amount;

    }



}
