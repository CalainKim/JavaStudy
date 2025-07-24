package variable;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성적을 입력하세요: ");
        char grade  = scanner.next().charAt(0); // 문자 하나로 입력받기
        switch (grade){ // 스위치 문 내 변수는 char로만
            case 'A':
                System.out.println("매우 우수");
                break;

            case 'B':
                System.out.println("우수");
                break;

            case 'C':
                System.out.println("좋음");
                break;

            default:
                System.out.println("잘못된 등급");
        }
    }
}
