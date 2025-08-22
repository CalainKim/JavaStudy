package oop.ex;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("선택 1.입금 2.출금 3.종료 : ");
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.print("입금할 금액을 입력하세요: ");
                int cash1 = scanner.nextInt();
                account.deposit(cash1);
            } else if (n == 2) {
                System.out.print("출금할 금액을 입력하세요: ");
                int cash2 = scanner.nextInt();
                account.withdraw(cash2);
            }
            else if(n == 3){
                System.out.println("현재 잔액: "+ account.balance);
                break;
            }
        }
    }
}
