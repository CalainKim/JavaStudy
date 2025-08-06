package Method;

public class Method3 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자 출입 불가.");
            return; // void에서도 return을 만나면 바로 종료시킨다.
        }
        System.out.println(age + "살, 입장하세요.");
    }
}

