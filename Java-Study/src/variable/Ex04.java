package variable;

public class Ex04 {
    public static void main(String[] args) {
        int score = 100;
        char ch = 'A';
        String str = "abc";
        boolean bool = true;
        byte b = 127;
        short s = 32767;

        System.out.println(score);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(bool); // 출력해보면 true로 출력되는데 C는 1로 출력하지만 자바에서는 true 문자 그대로 출력, 자바의 boolean은 논리형이다.
        System.out.println(b);
        System.out.println(s);

    }
}
