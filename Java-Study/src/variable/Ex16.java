package variable;

import java.util.Locale;

public class Ex16 {
    public static void main(String[] args) {
        String s = "  Hello java  ";

        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.substring(2,7)); // 2~6 인덱스 출력
        System.out.println(s.trim());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("java"));
        System.out.println(s.indexOf("java")); // 8번쨰 index부터 자바가 있음
        System.out.println("abc,def".split(",")[1]);

    }
}
