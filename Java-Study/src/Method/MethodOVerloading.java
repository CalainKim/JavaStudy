package Method;

public class MethodOVerloading {
    public static void main(String[] args) {
        //메서드 오버로딩 - 메서드의 이름이 같아도 매개변수 타입 및 순서가 다르면 오버로딩 가능
        //메서드 시그니처 = 메서드 이름 + 매개변수 타입(순서)
        // 메서드 시그니처는 자바에서 메서드를 구분할 수 있는 고유한 식별자, 서명


    }
    public static  int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }

    public static int add(int a,int b, int c){
        System.out.println("2번 호출");
        return a+b+c;
    }
}
