package oop.ex;

public class Account {
    int balance;

    void deposit(int amount){ // 입금 메서드
        balance += amount;
        System.out.println("현재 잔액: "+ balance);
    }
    void withdraw(int amount){ // 출금 메서드
        if((balance - amount) < 0){
            System.out.println("잔액 부족");
        }
        else{
            balance -= amount;
            System.out.println("잔고: " + balance);
        }
    }
}
