package variable;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //문자열 입력 받기
        System.out.print("문자열을 입력하세요: ");
        String str = scanner.next(); // scanner.next()는 사용자가 입력한 한 단어(공백없는문자열)를 읽는다.
        System.out.println("입력값은: " + str);

        //문자 1개 입력받기
        System.out.println("문자 한개만 입력하세요");
        char i = scanner.next().charAt(0); // charAt(0)을 통해 0번째 문자만 가져옴 , 자바는 기본적으로 문자열만 입력 가능하기 때문에
        System.out.println("입력값은 " + i);

        //정수 입력받기
        System.out.println("숫자를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.nextLine(); // 엔터 제거용 , nextint는 숫자만 읽고 엔터를 읽지 않는다. 따라서 이 문장이 없으면 다음 nextline은 남아있는 엔터만 읽고 끝내버림
        System.out.println("정수값: "+num);

        System.out.println("문장을 입력하세요: ");
        String st = scanner.nextLine();
        System.out.println("문장: "+st);

        //scanner 닫기
        scanner.close();

    }
}
