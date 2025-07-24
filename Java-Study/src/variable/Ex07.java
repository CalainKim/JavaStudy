package variable;

public class Ex07 {
    public static void main(String[] args) {
        double d = 10.5;
        int i = (int) d; // double에서 int타입으로 형변환
        System.out.println("int 형 변수 i 값 : " + i);

        long l = 100000000L;
        int j = (int) l;
        System.out.println("int 형 변수 j의 값: " + j);

        int k = 200;
        byte b = (byte) k;
        System.out.println("byte형 변수 b의 값" + b); // 200이 byte 범위인 -128~127을 넘어서 음수로 해석됨(오류)


    }
}
