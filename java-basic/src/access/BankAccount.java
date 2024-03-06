package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }
    //Alt + insert 단축키를 통해 생성자를 쉽게 생성할 수 있다. !!!!!~!!


    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        } else{
            System.out.println("유효하지 않은 금액");
        }
    }
    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;

    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance - amount >=0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않거나 잔액이 부족");
        }
    }

    public int getBalance(){
        return balance;
    }
}
